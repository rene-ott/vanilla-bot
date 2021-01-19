package com.rsc.c;

public class a {
   public static byte[][] dq = new byte[50][];
   public static int[] dr = new int[256];
   public static String ds = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
   static boolean[] dt = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};
   private static int du = 0;

   public static int a(byte[] var0) {
      dq[du] = var0;
      return du++;
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = ds.indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         dr[var0] = var1 * 9;
      }

   }
}
