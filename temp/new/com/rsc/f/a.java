package com.rsc.f;

import com.rsc.g.k;

public class a {
   public static final int[] rT = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
   public byte[] rU;
   public int rV;
   private int rW;

   public a(int var1) {
      this.rU = new byte[var1];
      this.rV = 0;
   }

   public final int dJ() {
      return this.rW;
   }

   public final void dK() {
      this.rW = this.rV * 8;
   }

   public final int aJ(int var1) {
      int var2 = this.rW >> 3;
      int var3 = 8 - (this.rW & 7);
      this.rW += var1;

      int var4;
      for(var4 = 0; var1 > var3; var3 = 8) {
         var4 += (rT[var3] & this.rU[var2++]) << var1 - var3;
         var1 -= var3;
      }

      if (var1 != var3) {
         var4 += this.rU[var2] >> var3 - var1 & rT[var1];
      } else {
         var4 += this.rU[var2] & rT[var3];
      }

      return var4;
   }

   public final void dL() {
      this.rV = (7 + this.rW) / 8;
   }

   public final void p(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 < 0) {
         this.rU[this.rV++] = 0;
         this.rV += k.a(var1, 0, var1.length(), this.rU, this.rV);
         this.rU[this.rV++] = 0;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   public final void aK(int var1) {
      this.rU[this.rV++] = (byte)var1;
   }

   public final void q(String var1) {
      byte[] var2 = var1.getBytes();
      byte[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         byte var6 = var3[var5];
         this.aK(var6);
      }

      this.aK(10);
   }

   public final String dM() {
      StringBuilder var1 = new StringBuilder();

      byte var2;
      while((var2 = this.rU[this.rV++]) != 10) {
         var1.append((char)var2);
      }

      return var1.toString();
   }

   public final void aL(int var1) {
      this.rU[this.rV++] = (byte)(var1 >> 8);
      this.rU[this.rV++] = (byte)var1;
   }

   public void a(long var1) {
      this.aN((int)(var1 >> 32));
      this.aN((int)(var1 & -1L));
   }

   public final byte dN() {
      return this.rU[this.rV++];
   }

   public final int dO() {
      return this.rU[this.rV++] & 255;
   }

   public final int dP() {
      int var1 = 255 & this.rU[this.rV];
      return var1 < 128 ? this.dO() : this.dR() - '耀';
   }

   public final int dQ() {
      this.rV += 2;
      int var1 = (255 & this.rU[this.rV - 1]) + (this.rU[this.rV - 2] << 8 & '\uff00');
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final void aM(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.aK(var1);
      } else {
         if (var1 < 0 || var1 >= 32768) {
            throw new IllegalArgumentException();
         }

         this.aL('耀' + var1);
      }

   }

   public final void aN(int var1) {
      this.rU[this.rV++] = (byte)(var1 >> 24);
      this.rU[this.rV++] = (byte)(var1 >> 16);
      this.rU[this.rV++] = (byte)(var1 >> 8);
      this.rU[this.rV++] = (byte)var1;
   }

   public final int dR() {
      this.rV += 2;
      return ((this.rU[this.rV - 2] & 255) << 8) + (255 & this.rU[this.rV - 1]);
   }

   public final int dS() {
      this.rV += 4;
      return (this.rU[this.rV - 3] << 16 & 16711680) + (this.rU[this.rV - 4] << 24 & -16777216) + ('\uff00' & this.rU[this.rV - 2] << 8) + (this.rU[this.rV - 1] & 255);
   }

   public final long dT() {
      long var1 = (long)this.dS() & 4294967295L;
      long var3 = (long)this.dS() & 4294967295L;
      return (var1 << 1382465952) - -var3;
   }
}
