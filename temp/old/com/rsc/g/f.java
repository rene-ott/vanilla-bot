package com.rsc.g;

public class f {
   static long sR;
   static long sS;

   public static final synchronized long dY() {
      long var0 = System.currentTimeMillis();
      if (sR > var0) {
         sS += sR - var0;
      }

      sR = var0;
      return sS + var0;
   }

   public static final void b(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }

   }

   public static final int a(int var0, int var1, int var2) {
      return (var0 << 16) + (var1 << 8) + var2;
   }

   public static final int a(int var0, int var1, int var2, boolean var3, int var4, int var5, int var6) {
      int var7 = 0;

      for(int var8 = 0; var4 > var8; ++var8) {
         int var9 = var6 * (var1 + ((!var3 ? -var8 : var8) - var5));
         if (var9 >= -100) {
            if (var9 > 100) {
               var9 = 100;
            }
         } else {
            var9 = -100;
         }

         int var10 = var2 + var9;
         if (var10 < 10) {
            var10 = 10;
         }

         var7 += var0 * var10 / 100;
      }

      return var7;
   }
}
