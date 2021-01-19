package com.rsc.c;

public final class h {
   private final int gs = 12345678;
   public int[] gt;
   public int gu;
   public int[] gv;
   public int[][] gw;
   public int gx = -1;
   public boolean gy = false;
   public int[] gz;
   int gA = 32;
   int[] gB;
   int[] gC;
   int[] gD;
   int[] gE;
   boolean gF = false;
   boolean gG = true;
   int gq = 0;
   boolean gH = false;
   int gI = 1;
   byte[] gJ;
   int[] gK;
   int[] gL;
   int[] gM;
   byte[] gN;
   int gO;
   int[] gP;
   int[] gQ;
   int[] gR;
   int[] gS;
   int[] gT;
   int[] gU;
   int[] gV;
   int[] gW;
   int[] gX;
   int[] gY;
   private int gZ;
   private int ha = 180;
   private int hb = 155;
   private int hc = 95;
   private int hd = 256;
   private int he = 512;
   private boolean hf = false;
   private int hg;
   private int[] hh;
   private int[] hi;
   private int[] hj;
   private boolean hk = false;
   private boolean hl = false;
   private boolean hm = false;
   private int hn = 12345678;
   private int ho;
   private int hp;
   private int hq;
   private int hr;
   private int hs;
   private int ht;
   private int hu;
   private int hv;
   private int hw;
   private int hx;
   private int hy;
   private int hz;
   private int hA;
   private int hB;
   private int hC;
   private int hD;
   private int hE;
   private int hF;
   private int hG;
   private int hH;
   private int hI;
   private int hJ;
   private int[] hK;
   private int[] hL;
   private int[] hM;
   private int[] hN;

   public h(byte[] var1, int var2) {
      int var3 = com.rsc.g.d.a(var1, var2);
      var2 += 2;
      int var4 = com.rsc.g.d.a(var1, var2);
      var2 += 2;
      this.i(var4, var3);

      int var5;
      for(var5 = 0; var3 > var5; ++var5) {
         this.gP[var5] = com.rsc.g.d.b(var1, var2);
         var2 += 2;
      }

      for(var5 = 0; var5 < var3; ++var5) {
         this.gQ[var5] = com.rsc.g.d.b(var1, var2);
         var2 += 2;
      }

      for(var5 = 0; var3 > var5; ++var5) {
         this.gR[var5] = com.rsc.g.d.b(var1, var2);
         var2 += 2;
      }

      this.gO = var3;

      for(var5 = 0; var5 < var4; ++var5) {
         this.gv[var5] = var1[var2++] & 255;
      }

      int[] var10000;
      for(var5 = 0; var5 < var4; ++var5) {
         this.gE[var5] = com.rsc.g.d.b(var1, var2);
         if (this.gE[var5] == 32767) {
            var10000 = this.gE;
            this.getClass();
            var10000[var5] = 12345678;
         }

         var2 += 2;
      }

      for(var5 = 0; var4 > var5; ++var5) {
         this.gD[var5] = com.rsc.g.d.b(var1, var2);
         var2 += 2;
         if (32767 == this.gD[var5]) {
            var10000 = this.gD;
            this.getClass();
            var10000[var5] = 12345678;
         }
      }

      int var6;
      for(var5 = 0; var5 < var4; ++var5) {
         var6 = 255 & var1[var2++];
         if (var6 != 0) {
            var10000 = this.gt;
            this.getClass();
            var10000[var5] = 12345678;
         } else {
            this.gt[var5] = 0;
         }
      }

      for(var5 = 0; var4 > var5; ++var5) {
         this.gw[var5] = new int[this.gv[var5]];

         for(var6 = 0; this.gv[var5] > var6; ++var6) {
            if (var3 < 256) {
               this.gw[var5][var6] = var1[var2++] & 255;
            } else {
               this.gw[var5][var6] = com.rsc.g.d.a(var1, var2);
               var2 += 2;
            }
         }
      }

      this.gu = var4;
      this.gI = 1;
   }

   public h(int var1, int var2) {
      this.i(var2, var1);
   }

   h(int var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      this.hl = var4;
      this.hk = var7;
      this.gF = var6;
      this.hm = var3;
      this.hf = var5;
      this.i(var2, var1);
   }

   private h(h[] var1, int var2) {
      this.a(0, var1, var2);
   }

   private h(h[] var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      this.hf = var5;
      this.hl = var4;
      this.gF = var6;
      this.hm = var3;
      this.a(0, var1, var2);
   }

   final h a(boolean var1, boolean var2, boolean var3, boolean var4) {
      h[] var5 = new h[]{this};
      h var6 = new h(var5, 1, var3, var4, var2, var1);
      var6.gq = this.gq;
      return var6;
   }

   private final void a(int var1, h[] var2, int var3) {
      int var4 = 0;
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < var3; ++var6) {
         var4 += var2[var6].gu;
         var5 += var2[var6].gO;
      }

      this.i(var4, var5);

      for(var6 = var1; var6 < var3; ++var6) {
         h var7 = var2[var6];
         var7.bm();
         this.hd = var7.hd;
         this.ha = var7.ha;
         this.hb = var7.hb;
         this.he = var7.he;
         this.hc = var7.hc;
         this.gA = var7.gA;

         for(int var8 = 0; var7.gu > var8; ++var8) {
            int[] var9 = new int[var7.gv[var8]];
            int[] var10 = var7.gw[var8];

            int var11;
            for(var11 = 0; var7.gv[var8] > var11; ++var11) {
               var9[var11] = this.c(var7.gP[var10[var11]], var7.gQ[var10[var11]], var7.gR[var10[var11]]);
            }

            var11 = this.a(var7.gv[var8], var9, var7.gE[var8], var7.gD[var8]);
            this.gt[var11] = var7.gt[var8];
            this.gB[var11] = var7.gB[var8];
            this.gC[var11] = var7.gC[var8];
         }
      }

      this.gI = 1;
   }

   public final void b(int var1, int var2, int var3) {
      this.hu = var1 + this.hu & 255;
      this.hv = var2 + this.hv & 255;
      this.hw = var3 + this.hw & 255;
      this.bn();
      this.gI = 1;
   }

   private final void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.gO; ++var7) {
         int[] var10000;
         if (var3 != 0) {
            var10000 = this.hK;
            var10000[var7] += this.hL[var7] * var3 >> 8;
         }

         if (var4 != 0) {
            var10000 = this.hM;
            var10000[var7] += var4 * this.hL[var7] >> 8;
         }

         if (var5 != 0) {
            var10000 = this.hK;
            var10000[var7] += var5 * this.hM[var7] >> 8;
         }

         if (var2 != 0) {
            var10000 = this.hL;
            var10000[var7] += var2 * this.hM[var7] >> 8;
         }

         if (var1 != 0) {
            var10000 = this.hM;
            var10000[var7] += var1 * this.hK[var7] >> 8;
         }

         if (var6 != 0) {
            var10000 = this.hL;
            var10000[var7] += this.hK[var7] * var6 >> 8;
         }
      }

   }

   private final void bj() {
      this.hp = 999999;
      this.hs = 999999;
      this.ht = -999999;
      this.hr = 999999;
      this.ho = -999999;
      this.hq = -999999;
      this.hn = -999999;

      for(int var1 = 0; var1 < this.gu; ++var1) {
         int[] var2 = this.gw[var1];
         int var3 = this.gv[var1];
         int var4 = var2[0];
         int var5;
         int var6 = var5 = this.hM[var4];
         int var7;
         int var8 = var7 = this.hL[var4];
         int var9;
         int var10 = var9 = this.hK[var4];

         for(int var11 = 0; var3 > var11; ++var11) {
            var4 = var2[var11];
            if (this.hM[var4] >= var5) {
               if (this.hM[var4] > var6) {
                  var6 = this.hM[var4];
               }
            } else {
               var5 = this.hM[var4];
            }

            if (this.hL[var4] < var7) {
               var7 = this.hL[var4];
            } else if (this.hL[var4] > var8) {
               var8 = this.hL[var4];
            }

            if (var9 <= this.hK[var4]) {
               if (this.hK[var4] > var10) {
                  var10 = this.hK[var4];
               }
            } else {
               var9 = this.hK[var4];
            }
         }

         if (var10 - var9 > this.hn) {
            this.hn = var10 - var9;
         }

         if (var8 - var7 > this.hn) {
            this.hn = var8 - var7;
         }

         if (this.ho < var10) {
            this.ho = var10;
         }

         if (var6 > this.ht) {
            this.ht = var6;
         }

         if (var6 - var5 > this.hn) {
            this.hn = var6 - var5;
         }

         if (this.hq < var8) {
            this.hq = var8;
         }

         if (var9 < this.hp) {
            this.hp = var9;
         }

         if (var7 < this.hr) {
            this.hr = var7;
         }

         if (this.hs > var5) {
            this.hs = var5;
         }
      }

   }

   private final void bk() {
      this.gM = new int[this.gO];
      this.gL = new int[this.gO];
      this.gS = new int[this.gO];
      this.gT = new int[this.gO];
      this.gU = new int[this.gO];
   }

   public final h bl() {
      h[] var1 = new h[]{this};
      h var2 = new h(var1, 1);
      var2.gy = this.gy;
      var2.gq = this.gq;
      return var2;
   }

   private final void bm() {
      this.br();

      for(int var1 = 0; var1 < this.gO; ++var1) {
         this.gP[var1] = this.hK[var1];
         this.gQ[var1] = this.hL[var1];
         this.gR[var1] = this.hM[var1];
      }

      this.hA = 0;
      this.hB = 0;
      this.hC = 0;
      this.hv = 0;
      this.hw = 0;
      this.hu = 0;
      this.hx = 256;
      this.hy = 256;
      this.hz = 256;
      this.hE = 256;
      this.hI = 256;
      this.hD = 256;
      this.hH = 256;
      this.hF = 256;
      this.hG = 256;
      this.gZ = 0;
   }

   private final void bn() {
      if (this.hF == 256 && this.hG == 256 && this.hH == 256 && this.hI == 256 && this.hE == 256 && this.hD == 256) {
         if (this.hx == 256 && this.hy == 256 && this.hz == 256) {
            if (this.hu == 0 && this.hv == 0 && this.hw == 0) {
               if (this.hA == 0 && this.hB == 0 && this.hC == 0) {
                  this.gZ = 0;
               } else {
                  this.gZ = 1;
               }
            } else {
               this.gZ = 2;
            }
         } else {
            this.gZ = 3;
         }
      } else {
         this.gZ = 4;
      }

   }

   private final void bo() {
      if (!this.hf) {
         int var1 = this.he * this.hd >> 8;

         int var2;
         for(var2 = 0; this.gu > var2; ++var2) {
            if (this.gt[var2] != 12345678) {
               this.gt[var2] = (this.hi[var2] * this.hb + this.hh[var2] * this.ha + this.hc * this.hj[var2]) / var1;
            }
         }

         for(var2 = 0; this.gO > var2; ++var2) {
            this.gV[var2] = 0;
            this.gW[var2] = 0;
            this.gX[var2] = 0;
            this.gY[var2] = 0;
         }

         for(var2 = 0; var2 < this.gu; ++var2) {
            if (12345678 == this.gt[var2]) {
               for(int var3 = 0; this.gv[var2] > var3; ++var3) {
                  int var4 = this.gw[var2][var3];
                  int[] var10000 = this.gV;
                  var10000[var4] += this.hh[var2];
                  var10000 = this.gW;
                  var10000[var4] += this.hi[var2];
                  var10000 = this.gX;
                  var10000[var4] += this.hj[var2];
                  int var10002 = this.gY[var4]++;
               }
            }
         }

         for(var2 = 0; this.gO > var2; ++var2) {
            if (this.gY[var2] > 0) {
               this.gK[var2] = (this.gX[var2] * this.hc + this.gV[var2] * this.ha + this.gW[var2] * this.hb) / (var1 * this.gY[var2]);
            }
         }
      }

   }

   private final void bp() {
      if (!this.hf || !this.hl) {
         for(int var1 = 0; this.gu > var1; ++var1) {
            int[] var2 = this.gw[var1];
            int var3 = this.hK[var2[0]];
            int var4 = this.hL[var2[0]];
            int var5 = this.hM[var2[0]];
            int var6 = this.hK[var2[1]] - var3;
            int var7 = this.hL[var2[1]] - var4;
            int var8 = this.hM[var2[1]] - var5;
            int var9 = this.hK[var2[2]] - var3;
            int var10 = this.hL[var2[2]] - var4;
            int var11 = this.hM[var2[2]] - var5;
            int var12 = var11 * var7 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;

            int var14;
            for(var14 = var6 * var10 - var9 * var7; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var12 >>= 1) {
               var13 >>= 1;
               var14 >>= 1;
            }

            int var15 = (int)(Math.sqrt((double)(var13 * var13 + var12 * var12 + var14 * var14)) * 256.0D);
            if (var15 <= 0) {
               var15 = 1;
            }

            this.hh[var1] = var12 * 65536 / var15;
            this.hi[var1] = var13 * 65536 / var15;
            this.hj[var1] = var14 * '\uffff' / var15;
            this.gB[var1] = -1;
         }

         this.bo();
      }

   }

   private final void a(int[] var1, h var2, int var3, int var4) {
      int[] var5 = new int[var3];

      int var6;
      for(var6 = 0; var6 < var3; ++var6) {
         int var7 = var5[var6] = var2.c(this.gP[var1[var6]], this.gQ[var1[var6]], this.gR[var1[var6]]);
         var2.gK[var7] = this.gK[var1[var6]];
         var2.gN[var7] = this.gN[var1[var6]];
      }

      var6 = var2.a(var3, var5, this.gE[var4], this.gD[var4]);
      if (!var2.gF && !this.gF) {
         var2.gz[var6] = this.gz[var4];
      }

      var2.gt[var6] = this.gt[var4];
      var2.gB[var6] = this.gB[var4];
      var2.gC[var6] = this.gC[var4];
   }

   public final void a(h var1) {
      this.hA = var1.hA;
      this.hB = var1.hB;
      this.hC = var1.hC;
      this.hu = var1.hu;
      this.hv = var1.hv;
      this.hw = var1.hw;
      this.bn();
      this.gI = 1;
   }

   final h[] a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.bm();
      int[] var7 = new int[var4];
      int[] var8 = new int[var4];

      int var9;
      for(var9 = 0; var4 > var9; ++var9) {
         var7[var9] = 0;
         var8[var9] = 0;
      }

      int var10;
      int var11;
      int var12;
      for(var9 = 0; var9 < this.gu; ++var9) {
         var10 = 0;
         var11 = 0;
         var12 = this.gv[var9];
         int[] var13 = this.gw[var9];

         int var14;
         for(var14 = 0; var12 > var14; ++var14) {
            var10 += this.gP[var13[var14]];
            var11 += this.gR[var13[var14]];
         }

         var14 = var10 / (var12 * var2) + var11 / (var3 * var12) * var1;
         var7[var14] += var12;
         int var10002 = var8[var14]++;
      }

      h[] var16 = new h[var4];

      for(var10 = 0; var4 > var10; ++var10) {
         if (var5 < var7[var10]) {
            var7[var10] = var5;
         }

         var16[var10] = new h(var7[var10], var8[var10], true, true, true, var6, true);
         var16[var10].he = this.he;
         var16[var10].gA = this.gA;
      }

      for(var10 = 0; this.gu > var10; ++var10) {
         var11 = 0;
         var12 = 0;
         int var17 = this.gv[var10];
         int[] var18 = this.gw[var10];

         int var15;
         for(var15 = 0; var15 < var17; ++var15) {
            var11 += this.gP[var18[var15]];
            var12 += this.gR[var18[var15]];
         }

         var15 = var11 / (var17 * var2) + var1 * (var12 / (var3 * var17));
         this.a(var18, var16[var15], var17, var10);
      }

      for(var10 = 0; var4 > var10; ++var10) {
         var16[var10].bk();
      }

      return var16;
   }

   public final int a(int var1, int[] var2, int var3, int var4) {
      if (this.hg > this.gu) {
         this.gv[this.gu] = var1;
         this.gw[this.gu] = var2;
         this.gE[this.gu] = var3;
         this.gD[this.gu] = var4;
         this.gI = 1;
         return this.gu++;
      } else {
         return -1;
      }
   }

   public final int c(int var1, int var2, int var3) {
      for(int var4 = 0; this.gO > var4; ++var4) {
         if (var1 == this.gP[var4] && var2 == this.gQ[var4] && var3 == this.gR[var4]) {
            return var4;
         }
      }

      return this.d(var1, var2, var3);
   }

   final int d(int var1, int var2, int var3) {
      if (this.gO >= this.hJ) {
         return -1;
      } else {
         this.gP[this.gO] = var1;
         this.gQ[this.gO] = var2;
         this.gR[this.gO] = var3;
         return this.gO++;
      }
   }

   final void h(int var1, int var2) {
      this.gu -= var1;
      this.gO -= var2;
      if (this.gu < 0) {
         this.gu = 0;
      }

      if (this.gO < 0) {
         this.gO = 0;
      }

   }

   final void bq() {
      this.gu = 0;
      this.gO = 0;
   }

   private final void br() {
      int var1;
      if (this.gI == 2) {
         this.gI = 0;

         for(var1 = 0; var1 < this.gO; ++var1) {
            this.hK[var1] = this.gP[var1];
            this.hL[var1] = this.gQ[var1];
            this.hM[var1] = this.gR[var1];
         }

         this.ho = 9999999;
         this.hq = 9999999;
         this.hr = -9999999;
         this.ht = 9999999;
         this.hs = -9999999;
         this.hn = 9999999;
         this.hp = -9999999;
      } else if (this.gI == 1) {
         this.gI = 0;

         for(var1 = 0; this.gO > var1; ++var1) {
            this.hK[var1] = this.gP[var1];
            this.hL[var1] = this.gQ[var1];
            this.hM[var1] = this.gR[var1];
         }

         if (this.gZ >= 2) {
            this.e(this.hu, this.hw, this.hv);
         }

         if (this.gZ >= 3) {
            this.f(this.hx, this.hy, this.hz);
         }

         if (this.gZ >= 4) {
            this.b(this.hE, this.hI, this.hF, this.hG, this.hH, this.hD);
         }

         if (this.gZ >= 1) {
            this.j(0, this.hA, this.hB, this.hC);
         }

         this.bj();
         this.bp();
      }

   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.br();
      if (this.hs <= i.hX && this.ht >= i.hW && this.hp <= i.hT && this.ho >= i.hV && this.hr <= i.hS && this.hq >= i.hU) {
         this.gG = true;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         if (var6 != 0) {
            var10 = i.hR[var6];
            var9 = i.hQ[var6];
         }

         if (var4 != 0) {
            var11 = i.hQ[var4];
            var12 = i.hR[var4];
         }

         if (var5 != 0) {
            var13 = i.hQ[var5];
            var14 = i.hR[var5];
         }

         for(int var15 = 0; this.gO > var15; ++var15) {
            int var16 = this.hK[var15] - var1;
            int var17 = this.hL[var15] - var2;
            int var18 = this.hM[var15] - var3;
            int var19;
            if (var6 != 0) {
               var19 = var17 * var9 + var10 * var16 >> 15;
               var17 = var17 * var10 - var16 * var9 >> 15;
               var16 = var19;
            }

            if (var5 != 0) {
               var19 = var14 * var16 + var18 * var13 >> 15;
               var18 = var14 * var18 - var16 * var13 >> 15;
               var16 = var19;
            }

            if (var4 != 0) {
               var19 = var17 * var12 - var11 * var18 >> 15;
               var18 = var11 * var17 + var12 * var18 >> 15;
               var17 = var19;
            }

            if (var18 < var8) {
               this.gM[var15] = var16 << var7;
            } else {
               this.gM[var15] = (var16 << var7) / var18;
            }

            if (var18 < var8) {
               this.gL[var15] = var17 << var7;
            } else {
               this.gL[var15] = (var17 << var7) / var18;
            }

            this.gS[var15] = var16;
            this.gT[var15] = var17;
            this.gU[var15] = var18;
         }
      } else {
         this.gG = false;
      }

   }

   private final void e(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.gO; ++var4) {
         int var5;
         int var6;
         int var7;
         if (var2 != 0) {
            var6 = i.hP[var2];
            var7 = i.hO[var2];
            var5 = this.hK[var4] * var6 + this.hL[var4] * var7 >> 15;
            this.hL[var4] = this.hL[var4] * var6 - var7 * this.hK[var4] >> 15;
            this.hK[var4] = var5;
         }

         if (var1 != 0) {
            var6 = i.hO[var1];
            var7 = i.hP[var1];
            var5 = var7 * this.hL[var4] - var6 * this.hM[var4] >> 15;
            this.hM[var4] = var6 * this.hL[var4] + var7 * this.hM[var4] >> 15;
            this.hL[var4] = var5;
         }

         if (var3 != 0) {
            var6 = i.hO[var3];
            var7 = i.hP[var3];
            var5 = var6 * this.hM[var4] + this.hK[var4] * var7 >> 15;
            this.hM[var4] = this.hM[var4] * var7 - this.hK[var4] * var6 >> 15;
            this.hK[var4] = var5;
         }
      }

   }

   private final void f(int var1, int var2, int var3) {
      for(int var4 = 0; this.gO > var4; ++var4) {
         this.hK[var4] = this.hK[var4] * var1 >> 8;
         this.hL[var4] = this.hL[var4] * var2 >> 8;
         this.hM[var4] = var3 * this.hM[var4] >> 8;
      }

   }

   final void g(int var1, int var2, int var3) {
      if (!this.hf) {
         this.hc = var3;
         this.hb = var2;
         this.ha = var1;
         this.hd = (int)Math.sqrt((double)(var3 * var3 + var2 * var2 + var1 * var1));
         this.bo();
      }

   }

   final void c(int var1, int var2, int var3, int var4, int var5) {
      this.gA = 256 - var2 * 4;
      this.he = (64 - var1) * 16 + 128;
      if (!this.hf) {
         this.ha = var4;
         this.hc = var5;
         this.hb = var3;
         this.hd = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
         this.bo();
      }

   }

   public final void b(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.he = (64 - var5) * 16 + 128;
      this.gA = 256 - var4 * 4;
      if (!this.hf) {
         for(int var7 = 0; var7 < this.gu; ++var7) {
            if (var6) {
               int[] var10000 = this.gt;
               this.getClass();
               var10000[var7] = 12345678;
            } else {
               this.gt[var7] = 0;
            }
         }

         this.ha = var1;
         this.hc = var3;
         this.hb = var2;
         this.hd = (int)Math.sqrt((double)(var2 * var2 + var1 * var1 + var3 * var3));
         this.bo();
      }

   }

   private final void i(int var1, int var2) {
      if (!this.gF) {
         this.gJ = new byte[var1];
         this.gz = new int[var1];
      }

      this.gP = new int[var2];
      this.gQ = new int[var2];
      this.gR = new int[var2];
      this.gN = new byte[var2];
      this.gK = new int[var2];
      this.hN = new int[var2];
      this.gV = new int[var2];
      this.gW = new int[var2];
      this.gX = new int[var2];
      this.gY = new int[var2];
      this.gw = new int[var1][];
      this.gv = new int[var1];
      this.gE = new int[var1];
      this.gD = new int[var1];
      this.gC = new int[var1];
      this.gB = new int[var1];
      if (!this.hk) {
         this.gS = new int[var2];
         this.gT = new int[var2];
         this.gU = new int[var2];
         this.gL = new int[var2];
         this.gM = new int[var2];
      }

      this.gt = new int[var1];
      this.hH = 256;
      this.hv = 0;
      this.hE = 256;
      this.hF = 256;
      this.hz = 256;
      if (!this.hf || !this.hl) {
         this.hi = new int[var1];
         this.hj = new int[var1];
         this.hh = new int[var1];
      }

      this.hG = 256;
      this.gu = 0;
      this.hu = 0;
      this.hC = 0;
      this.hx = 256;
      if (!this.hm) {
         this.hK = new int[var2];
         this.hM = new int[var2];
         this.hL = new int[var2];
      } else {
         this.hK = this.gP;
         this.hM = this.gR;
         this.hL = this.gQ;
      }

      this.hA = 0;
      this.hJ = var2;
      this.hD = 256;
      this.hI = 256;
      this.hB = 0;
      this.gZ = 0;
      this.gO = 0;
      this.hy = 256;
      this.hg = var1;
      this.hw = 0;
   }

   final void h(int var1, int var2, int var3) {
      this.hu = var1 & 255;
      this.hv = var2 & 255;
      this.hw = var3 & 255;
      this.bn();
      this.gI = 1;
   }

   public final void i(int var1, int var2, int var3) {
      this.hB = var2;
      this.hA = var1;
      this.hC = var3;
      this.bn();
      this.gI = 1;
   }

   final void j(int var1, int var2) {
      this.gN[var1] = (byte)var2;
   }

   private final void j(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; this.gO > var5; ++var5) {
         int[] var10000 = this.hK;
         var10000[var5] += var2;
         var10000 = this.hL;
         var10000[var5] += var3;
         var10000 = this.hM;
         var10000[var5] += var4;
      }

   }

   public final void j(int var1, int var2, int var3) {
      this.hA += var1;
      this.hB += var2;
      this.hC += var3;
      this.bn();
      this.gI = 1;
   }
}
