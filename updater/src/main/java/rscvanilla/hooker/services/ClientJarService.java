package rscvanilla.hooker.services;

import rscvanilla.hooker.external.Decompiler;

import javax.inject.Inject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.jar.JarFile;

public class ClientJarService {

    private final TempDirService tempDirService;
    private static final String client = "client";

    @Inject
    public ClientJarService(TempDirService tempDirService) {

        this.tempDirService = tempDirService;
    }

    private String getJarFilePath(boolean isOld) {
        return Path.of(getJarDirPath(isOld), client + ".jar").toString();
    }

    private String getJarDirPath(boolean isOld) {
        return isOld ? tempDirService.getOldDirPath() : tempDirService.getNewDirPath();
    }

    private void decompileJar(String source, boolean isOld) {
        var decompiler = Decompiler.newInstance(source, getJarDirPath(isOld));

        decompiler.decompileContext();
    }

    //TODO Refactor
    public void extractJar(boolean isOld) throws IOException {
        java.util.jar.JarFile jarfile = new java.util.jar.JarFile(new java.io.File(getJarFilePath(isOld)));
        java.util.Enumeration<java.util.jar.JarEntry> enu= jarfile.entries();
        while(enu.hasMoreElements())
        {
            java.util.jar.JarEntry je = enu.nextElement();

            System.out.println(je.getName());

            java.io.File fl = new java.io.File(getJarDirPath(isOld), je.getName());
            if(!fl.exists())
            {
                fl.getParentFile().mkdirs();
                fl = new java.io.File(getJarDirPath(isOld), je.getName());
            }
            if(je.isDirectory())
            {
                continue;
            }
            java.io.InputStream is = jarfile.getInputStream(je);
            java.io.FileOutputStream fo = new java.io.FileOutputStream(fl);
            while(is.available()>0)
            {
                fo.write(is.read());
            }
            fo.close();
            is.close();
        }

    }

    public void decompileSourceFilesToTempDir(String sourcePath, boolean isOld) {
        if (isOld && sourcePath == null) {
            return;
        }

        decompileJar(sourcePath, isOld);

        // TODO Handle exceptions
        try {
            extractJar(isOld);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
