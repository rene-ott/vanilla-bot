package com.rsc.g;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class g {
   public static String d(byte[] var0, int var1, int var2) {
      return new String(var0, var1, var2, StandardCharsets.UTF_8);
   }

   public static String c(ByteBuffer var0) {
      int var1 = var0.getInt();
      if (var1 < 0) {
         return null;
      } else {
         byte[] var2 = new byte[var1];
         var0.get(var2);
         return d(var2, 0, var2.length);
      }
   }
}
