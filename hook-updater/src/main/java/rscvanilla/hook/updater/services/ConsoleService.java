package rscvanilla.hook.updater.services;

import java.io.IOException;

public class ConsoleService {

    public void pressEnterToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e) { }
    }

    // TODO Handle exception
    public void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
