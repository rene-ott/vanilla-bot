package com.rsc.f;

import com.rsc.g.k;

public class a {
   public static final int[] rM = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
   public byte[] rN;
   public int rO;
   private int rP;

   public a(int var1) {
      this.rN = new byte[var1];
      this.rO = 0;
   }

   public final int dI() {
      return this.rP;
   }

   public final void dJ() {
      this.rP = this.rO * 8;
   }

   public final int aJ(int var1) {
      int var2 = this.rP >> 3;
      int var3 = 8 - (this.rP & 7);
      this.rP += var1;

      int var4;
      for(var4 = 0; var1 > var3; var3 = 8) {
         var4 += (rM[var3] & this.rN[var2++]) << var1 - var3;
         var1 -= var3;
      }

      if (var1 != var3) {
         var4 += this.rN[var2] >> var3 - var1 & rM[var1];
      } else {
         var4 += this.rN[var2] & rM[var3];
      }

      return var4;
   }

   public final void dK() {
      this.rO = (7 + this.rP) / 8;
   }

   public final void p(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 < 0) {
         this.rN[this.rO++] = 0;
         this.rO += k.a(var1, 0, var1.length(), this.rN, this.rO);
         this.rN[this.rO++] = 0;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   public final void aK(int var1) {
      this.rN[this.rO++] = (byte)var1;
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

   public final String dL() {
      StringBuilder var1 = new StringBuilder();

      byte var2;
      while((var2 = this.rN[this.rO++]) != 10) {
         var1.append((char)var2);
      }

      return var1.toString();
   }

   public final void aL(int var1) {
      this.rN[this.rO++] = (byte)(var1 >> 8);
      this.rN[this.rO++] = (byte)var1;
   }

   public void a(long var1) {
      this.aN((int)(var1 >> 32));
      this.aN((int)(var1 & -1L));
   }

   public final byte dM() {
      return this.rN[this.rO++];
   }

   public final int dN() {
      return this.rN[this.rO++] & 255;
   }

   public final int dO() {
      int var1 = 255 & this.rN[this.rO];
      return var1 < 128 ? this.dN() : this.dQ() - '耀';
   }

   public final int dP() {
      this.rO += 2;
      int var1 = (255 & this.rN[this.rO - 1]) + (this.rN[this.rO - 2] << 8 & '\uff00');
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
      this.rN[this.rO++] = (byte)(var1 >> 24);
      this.rN[this.rO++] = (byte)(var1 >> 16);
      this.rN[this.rO++] = (byte)(var1 >> 8);
      this.rN[this.rO++] = (byte)var1;
   }

   public final int dQ() {
      this.rO += 2;
      return ((this.rN[this.rO - 2] & 255) << 8) + (255 & this.rN[this.rO - 1]);
   }

   public final int dR() {
      this.rO += 4;
      return (this.rN[this.rO - 3] << 16 & 16711680) + (this.rN[this.rO - 4] << 24 & -16777216) + ('\uff00' & this.rN[this.rO - 2] << 8) + (this.rN[this.rO - 1] & 255);
   }

   public final long dS() {
      long var1 = (long)this.dR() & 4294967295L;
      long var3 = (long)this.dR() & 4294967295L;
      return (var1 << 1382465952) - -var3;
   }
}
