package com.rsc.g;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class i {
   private static HashMap<String, Integer> tx = new HashMap();
   private static i[] ty;
   private String aY;
   private int rc;
   private j[] tz;
   private HashMap<String, Integer> tA = new HashMap();

   public i() {
   }

   public static i s(String var0) {
      return ty[(Integer)tx.get(var0)];
   }

   public static void dZ() {
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
         ty = new i[var5];

         for(int var6 = 0; var6 < var5; ++var6) {
            ty[var6] = new i();
            ty[var6].d(var4);
            tx.put(ty[var6].aY, var6);
         }

         var1.close();
         System.gc();
      } catch (IOException var7) {
         var7.printStackTrace();
      }

   }

   public void d(ByteBuffer var1) {
      this.aY = g.c(var1);
      this.rc = var1.getInt();
      this.tz = new j[this.rc];

      for(int var2 = 0; var2 < this.rc; ++var2) {
         j var3 = (new j()).e(var1);
         this.tz[var2] = var3;
         this.tA.put(var3.aY.toLowerCase(), var2);
      }

   }

   public j t(String var1) {
      if (!this.tA.containsKey(var1)) {
         System.out.println("" + var1 + " missing");
      }

      Integer var2 = (Integer)this.tA.get(var1);
      j var3 = this.tz[var2];
      return var3;
   }
}
