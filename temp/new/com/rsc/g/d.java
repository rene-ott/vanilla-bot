package com.rsc.g;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class d {
   public static final ByteBuffer a(BufferedInputStream var0) {
      byte[] var1 = new byte[var0.available()];
      var0.read(var1, 0, var1.length);
      return ByteBuffer.wrap(var1);
   }

   public static InputStream r(String var0) {
      return new BufferedInputStream(new FileInputStream(var0));
   }

   public static int a(byte var0) {
      return var0 & 255;
   }

   public static int a(byte[] var0, int var1) {
      return ((var0[var1] & 255) << 8) + (var0[var1 + 1] & 255);
   }

   public static int b(byte[] var0, int var1) {
      int var2 = a(var0[var1]) * 256 + a(var0[var1 + 1]);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public static int a(String var0, byte[] var1) {
      int var2 = a(var1, 0);
      int var3 = 0;
      var0 = var0.toUpperCase();

      int var4;
      for(var4 = 0; var4 < var0.length(); ++var4) {
         var3 = var3 * 61 + var0.charAt(var4) - 32;
      }

      var4 = 2 + var2 * 10;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = (var1[var5 * 10 + 2] & 255) * 16777216 + (var1[var5 * 10 + 3] & 255) * 65536 + (var1[var5 * 10 + 4] & 255) * 256 + (var1[var5 * 10 + 5] & 255);
         int var7 = (var1[var5 * 10 + 9] & 255) * 65536 + (var1[var5 * 10 + 10] & 255) * 256 + (var1[var5 * 10 + 11] & 255);
         if (var6 == var3) {
            return var4;
         }

         var4 += var7;
      }

      return 0;
   }

   public static int b(String var0, byte[] var1) {
      int var2 = a(var1, 0);
      int var3 = 0;
      var0 = var0.toUpperCase();

      int var4;
      for(var4 = 0; var4 < var0.length(); ++var4) {
         var3 = var3 * 61 + var0.charAt(var4) - 32;
      }

      var4 = 2 + var2 * 10;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = (var1[var5 * 10 + 2] & 255) * 16777216 + (var1[var5 * 10 + 3] & 255) * 65536 + (var1[var5 * 10 + 4] & 255) * 256 + (var1[var5 * 10 + 5] & 255);
         int var7 = (var1[var5 * 10 + 6] & 255) * 65536 + (var1[var5 * 10 + 7] & 255) * 256 + (var1[var5 * 10 + 8] & 255);
         int var8 = (var1[var5 * 10 + 9] & 255) * 65536 + (var1[var5 * 10 + 10] & 255) * 256 + (var1[var5 * 10 + 11] & 255);
         if (var6 == var3) {
            return var7;
         }

         var4 += var8;
      }

      return 0;
   }

   public static byte[] a(String var0, int var1, byte[] var2) {
      return a(var0, var1, var2, (byte[])null);
   }

   public static byte[] a(String var0, int var1, byte[] var2, byte[] var3) {
      int var4 = (var2[0] & 255) * 256 + (var2[1] & 255);
      int var5 = 0;
      var0 = var0.toUpperCase();

      int var6;
      for(var6 = 0; var6 < var0.length(); ++var6) {
         var5 = var5 * 61 + var0.charAt(var6) - 32;
      }

      var6 = 2 + var4 * 10;

      for(int var7 = 0; var7 < var4; ++var7) {
         int var8 = (var2[var7 * 10 + 2] & 255) * 16777216 + (var2[var7 * 10 + 3] & 255) * 65536 + (var2[var7 * 10 + 4] & 255) * 256 + (var2[var7 * 10 + 5] & 255);
         int var9 = (var2[var7 * 10 + 6] & 255) * 65536 + (var2[var7 * 10 + 7] & 255) * 256 + (var2[var7 * 10 + 8] & 255);
         int var10 = (var2[var7 * 10 + 9] & 255) * 65536 + (var2[var7 * 10 + 10] & 255) * 256 + (var2[var7 * 10 + 11] & 255);
         if (var8 == var5) {
            if (var3 == null) {
               var3 = new byte[var9 + var1];
            }

            if (var9 != var10) {
               b.a(var3, var9, var2, var10, var6);
            } else {
               for(int var11 = 0; var11 < var9; ++var11) {
                  var3[var11] = var2[var6 + var11];
               }
            }

            return var3;
         }

         var6 += var10;
      }

      return null;
   }
}
