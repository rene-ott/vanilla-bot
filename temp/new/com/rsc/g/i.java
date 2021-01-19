package com.rsc.g;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class i {
   private static HashMap<String, Integer> tE = new HashMap();
   private static i[] tF;
   private String aZ;
   private int ri;
   private j[] tG;
   private HashMap<String, Integer> tH = new HashMap();

   public i() {
   }

   public static i s(String var0) {
      return tF[(Integer)tE.get(var0)];
   }

   public static void ea() {
      try {
         File var0 = new File(com.rsc.c.aa + File.separator + "Sprites.rscd");
         if (var0 == null) {
            return;
         }

         ZipFile var1 = new ZipFile(var0);
         ZipEntry var2 = var1.getEntry("sprites");
         BufferedInputStream var3 = new BufferedInputStream(var1.getInputStream(var2));
         ByteBuffer var4 = d.a(var3);
         byte var5 = var4.get();
         tF = new i[var5];

         for(int var6 = 0; var6 < var5; ++var6) {
            tF[var6] = new i();
            tF[var6].d(var4);
            tE.put(tF[var6].aZ, var6);
         }

         var1.close();
         System.gc();
      } catch (IOException var7) {
         var7.printStackTrace();
      }

   }

   public void d(ByteBuffer var1) {
      this.aZ = g.c(var1);
      this.ri = var1.getInt();
      this.tG = new j[this.ri];

      for(int var2 = 0; var2 < this.ri; ++var2) {
         j var3 = (new j()).e(var1);
         this.tG[var2] = var3;
         this.tH.put(var3.aZ.toLowerCase(), var2);
      }

   }

   public j t(String var1) {
      if (!this.tH.containsKey(var1)) {
         System.out.println("" + var1 + " missing");
      }

      Integer var2 = (Integer)this.tH.get(var1);
      j var3 = this.tG[var2];
      return var3;
   }
}
