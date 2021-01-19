package com.rsc.c;

public class a {
   public static byte[][] dp = new byte[50][];
   public static int[] dq = new int[256];
   public static String dr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
   static boolean[] ds = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};
   private static int dt = 0;

   public static int a(byte[] var0) {
      dp[dt] = var0;
      return dt++;
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = dr.indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         dq[var0] = var1 * 9;
      }

   }
}
