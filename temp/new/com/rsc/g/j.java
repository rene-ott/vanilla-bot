package com.rsc.g;

import java.nio.ByteBuffer;

public class j {
   public String aZ;
   private com.rsc.a.b.c[] tI;

   public j() {
   }

   public static com.rsc.a.b.c a(String var0, ByteBuffer var1) {
      com.rsc.a.b.c var2 = new com.rsc.a.b.c();
      var2.ch = var0;
      var2.bp = var1.getShort();
      var2.ci = var1.get() == 1;
      var2.cj = var1.getShort();
      var2.ck = var1.getShort();
      var2.cl = var1.getShort();
      var2.cm = var1.getShort();
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

      var2.cn = new com.rsc.a.b.a(var9, var6, var3, var4);
      return var2;
   }

   public j e(ByteBuffer var1) {
      this.aZ = g.c(var1);
      short var2 = var1.getShort();
      this.tI = new com.rsc.a.b.c[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         com.rsc.a.b.c var4 = a(this.aZ, var1);
         this.tI[var4.bp] = var4;
      }

      return this;
   }

   public com.rsc.a.b.c aQ(int var1) {
      return var1 <= this.tI.length && var1 >= 0 ? this.tI[var1] : null;
   }
}
