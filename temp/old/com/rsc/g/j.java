package com.rsc.g;

import java.nio.ByteBuffer;

public class j {
   public String aY;
   private com.rsc.a.b.c[] tB;

   public j() {
   }

   public static com.rsc.a.b.c a(String var0, ByteBuffer var1) {
      com.rsc.a.b.c var2 = new com.rsc.a.b.c();
      var2.cg = var0;
      var2.bo = var1.getShort();
      var2.ch = var1.get() == 1;
      var2.ci = var1.getShort();
      var2.cj = var1.getShort();
      var2.ck = var1.getShort();
      var2.cl = var1.getShort();
      int var3 = var1.getInt();
      int var4 = var1.getInt();
      short var5 = var1.getShort();
      int[] var6 = new int[var5];

      for(int var7 = 0; var7 < var5; ++var7) {
         var6[var7] = var1.getInt();
      }

      byte[] var9 = new byte[var3 * var4];

      for(int var8 = 0; var8 < var9.length; ++var8) {
         var9[var8] = (byte)(var1.get() & 255);
      }

      var2.cm = new com.rsc.a.b.a(var9, var6, var3, var4);
      return var2;
   }

   public j e(ByteBuffer var1) {
      this.aY = g.c(var1);
      short var2 = var1.getShort();
      this.tB = new com.rsc.a.b.c[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         com.rsc.a.b.c var4 = a(this.aY, var1);
         this.tB[var4.bo] = var4;
      }

      return this;
   }

   public com.rsc.a.b.c aQ(int var1) {
      return var1 <= this.tB.length && var1 >= 0 ? this.tB[var1] : null;
   }
}
