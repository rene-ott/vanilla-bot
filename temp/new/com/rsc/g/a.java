package com.rsc.g;

public final class a {
   private static final void a(com.rsc.c.c[] var0, int[] var1, int var2, int var3) {
      if (var3 > var2) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var6;
         com.rsc.c.c var7 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var7;
         int var8 = var6 == 2147483647 ? 0 : 1;

         for(int var9 = var2; var9 < var3; ++var9) {
            if ((var9 & var8) + var6 > var1[var9]) {
               int var10 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5] = var10;
               com.rsc.c.c var11 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5++] = var11;
            }
         }

         var1[var3] = var1[var5];
         var1[var5] = var6;
         var0[var3] = var0[var5];
         var0[var5] = var7;
         a(var0, var1, var2, var5 - 1);
         a(var0, var1, 1 + var5, var3);
      }

   }

   public static final void a(com.rsc.c.c[] var0, int[] var1) {
      a(var0, var1, 0, var1.length - 1);
   }
}
