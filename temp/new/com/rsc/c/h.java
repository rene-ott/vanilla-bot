package com.rsc.c;

public final class h {
   private final int gt = 12345678;
   public int[] gu;
   public int gv;
   public int[] gw;
   public int[][] gx;
   public int gy = -1;
   public boolean gz = false;
   public int[] gA;
   int gB = 32;
   int[] gC;
   int[] gD;
   int[] gE;
   int[] gF;
   boolean gG = false;
   boolean gH = true;
   int gr = 0;
   boolean gI = false;
   int gJ = 1;
   byte[] gK;
   int[] gL;
   int[] gM;
   int[] gN;
   byte[] gO;
   int gP;
   int[] gQ;
   int[] gR;
   int[] gS;
   int[] gT;
   int[] gU;
   int[] gV;
   int[] gW;
   int[] gX;
   int[] gY;
   int[] gZ;
   private int ha;
   private int hb = 180;
   private int hc = 155;
   private int hd = 95;
   private int he = 256;
   private int hf = 512;
   private boolean hg = false;
   private int hh;
   private int[] hi;
   private int[] hj;
   private int[] hk;
   private boolean hl = false;
   private boolean hm = false;
   private boolean hn = false;
   private int ho = 12345678;
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
   private int hK;
   private int[] hL;
   private int[] hM;
   private int[] hN;
   private int[] hO;

   public h(byte[] var1, int var2) {
      int var3 = com.rsc.g.d.a(var1, var2);
      var2 += 2;
      int var4 = com.rsc.g.d.a(var1, var2);
      var2 += 2;
      this.i(var4, var3);

      int var5;
      for(var5 = 0; var3 > var5; ++var5) {
         this.gQ[var5] = com.rsc.g.d.b(var1, var2);
         var2 += 2;
      }

      for(var5 = 0; var5 < var3; ++var5) {
         this.gR[var5] = com.rsc.g.d.b(var1, var2);
         var2 += 2;
      }

      for(var5 = 0; var3 > var5; ++var5) {
         this.gS[var5] = com.rsc.g.d.b(var1, var2);
         var2 += 2;
      }

      this.gP = var3;

      for(var5 = 0; var5 < var4; ++var5) {
         this.gw[var5] = var1[var2++] & 255;
      }

      int[] var10000;
      for(var5 = 0; var5 < var4; ++var5) {
         this.gF[var5] = com.rsc.g.d.b(var1, var2);
         if (this.gF[var5] == 32767) {
            var10000 = this.gF;
            this.getClass();
            var10000[var5] = 12345678;
         }

         var2 += 2;
      }

      for(var5 = 0; var4 > var5; ++var5) {
         this.gE[var5] = com.rsc.g.d.b(var1, var2);
         var2 += 2;
         if (32767 == this.gE[var5]) {
            var10000 = this.gE;
            this.getClass();
            var10000[var5] = 12345678;
         }
      }

      int var6;
      for(var5 = 0; var5 < var4; ++var5) {
         var6 = 255 & var1[var2++];
         if (var6 != 0) {
            var10000 = this.gu;
            this.getClass();
            var10000[var5] = 12345678;
         } else {
            this.gu[var5] = 0;
         }
      }

      for(var5 = 0; var4 > var5; ++var5) {
         this.gx[var5] = new int[this.gw[var5]];

         for(var6 = 0; this.gw[var5] > var6; ++var6) {
            if (var3 < 256) {
               this.gx[var5][var6] = var1[var2++] & 255;
            } else {
               this.gx[var5][var6] = com.rsc.g.d.a(var1, var2);
               var2 += 2;
            }
         }
      }

      this.gv = var4;
      this.gJ = 1;
   }

   public h(int var1, int var2) {
      this.i(var2, var1);
   }

   h(int var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      this.hm = var4;
      this.hl = var7;
      this.gG = var6;
      this.hn = var3;
      this.hg = var5;
      this.i(var2, var1);
   }

   private h(h[] var1, int var2) {
      this.a(0, var1, var2);
   }

   private h(h[] var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      this.hg = var5;
      this.hm = var4;
      this.gG = var6;
      this.hn = var3;
      this.a(0, var1, var2);
   }

   final h a(boolean var1, boolean var2, boolean var3, boolean var4) {
      h[] var5 = new h[]{this};
      h var6 = new h(var5, 1, var3, var4, var2, var1);
      var6.gr = this.gr;
      return var6;
   }

   private final void a(int var1, h[] var2, int var3) {
      int var4 = 0;
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < var3; ++var6) {
         var4 += var2[var6].gv;
         var5 += var2[var6].gP;
      }

      this.i(var4, var5);

      for(var6 = var1; var6 < var3; ++var6) {
         h var7 = var2[var6];
         var7.bm();
         this.he = var7.he;
         this.hb = var7.hb;
         this.hc = var7.hc;
         this.hf = var7.hf;
         this.hd = var7.hd;
         this.gB = var7.gB;

         for(int var8 = 0; var7.gv > var8; ++var8) {
            int[] var9 = new int[var7.gw[var8]];
            int[] var10 = var7.gx[var8];

            int var11;
            for(var11 = 0; var7.gw[var8] > var11; ++var11) {
               var9[var11] = this.c(var7.gQ[var10[var11]], var7.gR[var10[var11]], var7.gS[var10[var11]]);
            }

            var11 = this.a(var7.gw[var8], var9, var7.gF[var8], var7.gE[var8]);
            this.gu[var11] = var7.gu[var8];
            this.gC[var11] = var7.gC[var8];
            this.gD[var11] = var7.gD[var8];
         }
      }

      this.gJ = 1;
   }

   public final void b(int var1, int var2, int var3) {
      this.hv = var1 + this.hv & 255;
      this.hw = var2 + this.hw & 255;
      this.hx = var3 + this.hx & 255;
      this.bn();
      this.gJ = 1;
   }

   private final void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.gP; ++var7) {
         int[] var10000;
         if (var3 != 0) {
            var10000 = this.hL;
            var10000[var7] += this.hM[var7] * var3 >> 8;
         }

         if (var4 != 0) {
            var10000 = this.hN;
            var10000[var7] += var4 * this.hM[var7] >> 8;
         }

         if (var5 != 0) {
            var10000 = this.hL;
            var10000[var7] += var5 * this.hN[var7] >> 8;
         }

         if (var2 != 0) {
            var10000 = this.hM;
            var10000[var7] += var2 * this.hN[var7] >> 8;
         }

         if (var1 != 0) {
            var10000 = this.hN;
            var10000[var7] += var1 * this.hL[var7] >> 8;
         }

         if (var6 != 0) {
            var10000 = this.hM;
            var10000[var7] += this.hL[var7] * var6 >> 8;
         }
      }

   }

   private final void bj() {
      this.hq = 999999;
      this.ht = 999999;
      this.hu = -999999;
      this.hs = 999999;
      this.hp = -999999;
      this.hr = -999999;
      this.ho = -999999;

      for(int var1 = 0; var1 < this.gv; ++var1) {
         int[] var2 = this.gx[var1];
         int var3 = this.gw[var1];
         int var4 = var2[0];
         int var5;
         int var6 = var5 = this.hN[var4];
         int var7;
         int var8 = var7 = this.hM[var4];
         int var9;
         int var10 = var9 = this.hL[var4];

         for(int var11 = 0; var3 > var11; ++var11) {
            var4 = var2[var11];
            if (this.hN[var4] >= var5) {
               if (this.hN[var4] > var6) {
                  var6 = this.hN[var4];
               }
            } else {
               var5 = this.hN[var4];
            }

            if (this.hM[var4] < var7) {
               var7 = this.hM[var4];
            } else if (this.hM[var4] > var8) {
               var8 = this.hM[var4];
            }

            if (var9 <= this.hL[var4]) {
               if (this.hL[var4] > var10) {
                  var10 = this.hL[var4];
               }
            } else {
               var9 = this.hL[var4];
            }
         }

         if (var10 - var9 > this.ho) {
            this.ho = var10 - var9;
         }

         if (var8 - var7 > this.ho) {
            this.ho = var8 - var7;
         }

         if (this.hp < var10) {
            this.hp = var10;
         }

         if (var6 > this.hu) {
            this.hu = var6;
         }

         if (var6 - var5 > this.ho) {
            this.ho = var6 - var5;
         }

         if (this.hr < var8) {
            this.hr = var8;
         }

         if (var9 < this.hq) {
            this.hq = var9;
         }

         if (var7 < this.hs) {
            this.hs = var7;
         }

         if (this.ht > var5) {
            this.ht = var5;
         }
      }

   }

   private final void bk() {
      this.gN = new int[this.gP];
      this.gM = new int[this.gP];
      this.gT = new int[this.gP];
      this.gU = new int[this.gP];
      this.gV = new int[this.gP];
   }

   public final h bl() {
      h[] var1 = new h[]{this};
      h var2 = new h(var1, 1);
      var2.gz = this.gz;
      var2.gr = this.gr;
      return var2;
   }

   private final void bm() {
      this.br();

      for(int var1 = 0; var1 < this.gP; ++var1) {
         this.gQ[var1] = this.hL[var1];
         this.gR[var1] = this.hM[var1];
         this.gS[var1] = this.hN[var1];
      }

      this.hB = 0;
      this.hC = 0;
      this.hD = 0;
      this.hw = 0;
      this.hx = 0;
      this.hv = 0;
      this.hy = 256;
      this.hz = 256;
      this.hA = 256;
      this.hF = 256;
      this.hJ = 256;
      this.hE = 256;
      this.hI = 256;
      this.hG = 256;
      this.hH = 256;
      this.ha = 0;
   }

   private final void bn() {
      if (this.hG == 256 && this.hH == 256 && this.hI == 256 && this.hJ == 256 && this.hF == 256 && this.hE == 256) {
         if (this.hy == 256 && this.hz == 256 && this.hA == 256) {
            if (this.hv == 0 && this.hw == 0 && this.hx == 0) {
               if (this.hB == 0 && this.hC == 0 && this.hD == 0) {
                  this.ha = 0;
               } else {
                  this.ha = 1;
               }
            } else {
               this.ha = 2;
            }
         } else {
            this.ha = 3;
         }
      } else {
         this.ha = 4;
      }

   }

   private final void bo() {
      if (!this.hg) {
         int var1 = this.hf * this.he >> 8;

         int var2;
         for(var2 = 0; this.gv > var2; ++var2) {
            if (this.gu[var2] != 12345678) {
               this.gu[var2] = (this.hj[var2] * this.hc + this.hi[var2] * this.hb + this.hd * this.hk[var2]) / var1;
            }
         }

         for(var2 = 0; this.gP > var2; ++var2) {
            this.gW[var2] = 0;
            this.gX[var2] = 0;
            this.gY[var2] = 0;
            this.gZ[var2] = 0;
         }

         for(var2 = 0; var2 < this.gv; ++var2) {
            if (12345678 == this.gu[var2]) {
               for(int var3 = 0; this.gw[var2] > var3; ++var3) {
                  int var4 = this.gx[var2][var3];
                  int[] var10000 = this.gW;
                  var10000[var4] += this.hi[var2];
                  var10000 = this.gX;
                  var10000[var4] += this.hj[var2];
                  var10000 = this.gY;
                  var10000[var4] += this.hk[var2];
                  int var10002 = this.gZ[var4]++;
               }
            }
         }

         for(var2 = 0; this.gP > var2; ++var2) {
            if (this.gZ[var2] > 0) {
               this.gL[var2] = (this.gY[var2] * this.hd + this.gW[var2] * this.hb + this.gX[var2] * this.hc) / (var1 * this.gZ[var2]);
            }
         }
      }

   }

   private final void bp() {
      if (!this.hg || !this.hm) {
         for(int var1 = 0; this.gv > var1; ++var1) {
            int[] var2 = this.gx[var1];
            int var3 = this.hL[var2[0]];
            int var4 = this.hM[var2[0]];
            int var5 = this.hN[var2[0]];
            int var6 = this.hL[var2[1]] - var3;
            int var7 = this.hM[var2[1]] - var4;
            int var8 = this.hN[var2[1]] - var5;
            int var9 = this.hL[var2[2]] - var3;
            int var10 = this.hM[var2[2]] - var4;
            int var11 = this.hN[var2[2]] - var5;
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

            this.hi[var1] = var12 * 65536 / var15;
            this.hj[var1] = var13 * 65536 / var15;
            this.hk[var1] = var14 * '\uffff' / var15;
            this.gC[var1] = -1;
         }

         this.bo();
      }

   }

   private final void a(int[] var1, h var2, int var3, int var4) {
      int[] var5 = new int[var3];

      int var6;
      for(var6 = 0; var6 < var3; ++var6) {
         int var7 = var5[var6] = var2.c(this.gQ[var1[var6]], this.gR[var1[var6]], this.gS[var1[var6]]);
         var2.gL[var7] = this.gL[var1[var6]];
         var2.gO[var7] = this.gO[var1[var6]];
      }

      var6 = var2.a(var3, var5, this.gF[var4], this.gE[var4]);
      if (!var2.gG && !this.gG) {
         var2.gA[var6] = this.gA[var4];
      }

      var2.gu[var6] = this.gu[var4];
      var2.gC[var6] = this.gC[var4];
      var2.gD[var6] = this.gD[var4];
   }

   public final void a(h var1) {
      this.hB = var1.hB;
      this.hC = var1.hC;
      this.hD = var1.hD;
      this.hv = var1.hv;
      this.hw = var1.hw;
      this.hx = var1.hx;
      this.bn();
      this.gJ = 1;
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
      for(var9 = 0; var9 < this.gv; ++var9) {
         var10 = 0;
         var11 = 0;
         var12 = this.gw[var9];
         int[] var13 = this.gx[var9];

         int var14;
         for(var14 = 0; var12 > var14; ++var14) {
            var10 += this.gQ[var13[var14]];
            var11 += this.gS[var13[var14]];
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
         var16[var10].hf = this.hf;
         var16[var10].gB = this.gB;
      }

      for(var10 = 0; this.gv > var10; ++var10) {
         var11 = 0;
         var12 = 0;
         int var17 = this.gw[var10];
         int[] var18 = this.gx[var10];

         int var15;
         for(var15 = 0; var15 < var17; ++var15) {
            var11 += this.gQ[var18[var15]];
            var12 += this.gS[var18[var15]];
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
      if (this.hh > this.gv) {
         this.gw[this.gv] = var1;
         this.gx[this.gv] = var2;
         this.gF[this.gv] = var3;
         this.gE[this.gv] = var4;
         this.gJ = 1;
         return this.gv++;
      } else {
         return -1;
      }
   }

   public final int c(int var1, int var2, int var3) {
      for(int var4 = 0; this.gP > var4; ++var4) {
         if (var1 == this.gQ[var4] && var2 == this.gR[var4] && var3 == this.gS[var4]) {
            return var4;
         }
      }

      return this.d(var1, var2, var3);
   }

   final int d(int var1, int var2, int var3) {
      if (this.gP >= this.hK) {
         return -1;
      } else {
         this.gQ[this.gP] = var1;
         this.gR[this.gP] = var2;
         this.gS[this.gP] = var3;
         return this.gP++;
      }
   }

   final void h(int var1, int var2) {
      this.gv -= var1;
      this.gP -= var2;
      if (this.gv < 0) {
         this.gv = 0;
      }

      if (this.gP < 0) {
         this.gP = 0;
      }

   }

   final void bq() {
      this.gv = 0;
      this.gP = 0;
   }

   private final void br() {
      int var1;
      if (this.gJ == 2) {
         this.gJ = 0;

         for(var1 = 0; var1 < this.gP; ++var1) {
            this.hL[var1] = this.gQ[var1];
            this.hM[var1] = this.gR[var1];
            this.hN[var1] = this.gS[var1];
         }

         this.hp = 9999999;
         this.hr = 9999999;
         this.hs = -9999999;
         this.hu = 9999999;
         this.ht = -9999999;
         this.ho = 9999999;
         this.hq = -9999999;
      } else if (this.gJ == 1) {
         this.gJ = 0;

         for(var1 = 0; this.gP > var1; ++var1) {
            this.hL[var1] = this.gQ[var1];
            this.hM[var1] = this.gR[var1];
            this.hN[var1] = this.gS[var1];
         }

         if (this.ha >= 2) {
            this.e(this.hv, this.hx, this.hw);
         }

         if (this.ha >= 3) {
            this.f(this.hy, this.hz, this.hA);
         }

         if (this.ha >= 4) {
            this.b(this.hF, this.hJ, this.hG, this.hH, this.hI, this.hE);
         }

         if (this.ha >= 1) {
            this.j(0, this.hB, this.hC, this.hD);
         }

         this.bj();
         this.bp();
      }

   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.br();
      if (this.ht <= i.hY && this.hu >= i.hX && this.hq <= i.hU && this.hp >= i.hW && this.hs <= i.hT && this.hr >= i.hV) {
         this.gH = true;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         if (var6 != 0) {
            var10 = i.hS[var6];
            var9 = i.hR[var6];
         }

         if (var4 != 0) {
            var11 = i.hR[var4];
            var12 = i.hS[var4];
         }

         if (var5 != 0) {
            var13 = i.hR[var5];
            var14 = i.hS[var5];
         }

         for(int var15 = 0; this.gP > var15; ++var15) {
            int var16 = this.hL[var15] - var1;
            int var17 = this.hM[var15] - var2;
            int var18 = this.hN[var15] - var3;
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
               this.gN[var15] = var16 << var7;
            } else {
               this.gN[var15] = (var16 << var7) / var18;
            }

            if (var18 < var8) {
               this.gM[var15] = var17 << var7;
            } else {
               this.gM[var15] = (var17 << var7) / var18;
            }

            this.gT[var15] = var16;
            this.gU[var15] = var17;
            this.gV[var15] = var18;
         }
      } else {
         this.gH = false;
      }

   }

   private final void e(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.gP; ++var4) {
         int var5;
         int var6;
         int var7;
         if (var2 != 0) {
            var6 = i.hQ[var2];
            var7 = i.hP[var2];
            var5 = this.hL[var4] * var6 + this.hM[var4] * var7 >> 15;
            this.hM[var4] = this.hM[var4] * var6 - var7 * this.hL[var4] >> 15;
            this.hL[var4] = var5;
         }

         if (var1 != 0) {
            var6 = i.hP[var1];
            var7 = i.hQ[var1];
            var5 = var7 * this.hM[var4] - var6 * this.hN[var4] >> 15;
            this.hN[var4] = var6 * this.hM[var4] + var7 * this.hN[var4] >> 15;
            this.hM[var4] = var5;
         }

         if (var3 != 0) {
            var6 = i.hP[var3];
            var7 = i.hQ[var3];
            var5 = var6 * this.hN[var4] + this.hL[var4] * var7 >> 15;
            this.hN[var4] = this.hN[var4] * var7 - this.hL[var4] * var6 >> 15;
            this.hL[var4] = var5;
         }
      }

   }

   private final void f(int var1, int var2, int var3) {
      for(int var4 = 0; this.gP > var4; ++var4) {
         this.hL[var4] = this.hL[var4] * var1 >> 8;
         this.hM[var4] = this.hM[var4] * var2 >> 8;
         this.hN[var4] = var3 * this.hN[var4] >> 8;
      }

   }

   final void g(int var1, int var2, int var3) {
      if (!this.hg) {
         this.hd = var3;
         this.hc = var2;
         this.hb = var1;
         this.he = (int)Math.sqrt((double)(var3 * var3 + var2 * var2 + var1 * var1));
         this.bo();
      }

   }

   final void c(int var1, int var2, int var3, int var4, int var5) {
      this.gB = 256 - var2 * 4;
      this.hf = (64 - var1) * 16 + 128;
      if (!this.hg) {
         this.hb = var4;
         this.hd = var5;
         this.hc = var3;
         this.he = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
         this.bo();
      }

   }

   public final void b(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.hf = (64 - var5) * 16 + 128;
      this.gB = 256 - var4 * 4;
      if (!this.hg) {
         for(int var7 = 0; var7 < this.gv; ++var7) {
            if (var6) {
               int[] var10000 = this.gu;
               this.getClass();
               var10000[var7] = 12345678;
            } else {
               this.gu[var7] = 0;
            }
         }

         this.hb = var1;
         this.hd = var3;
         this.hc = var2;
         this.he = (int)Math.sqrt((double)(var2 * var2 + var1 * var1 + var3 * var3));
         this.bo();
      }

   }

   private final void i(int var1, int var2) {
      if (!this.gG) {
         this.gK = new byte[var1];
         this.gA = new int[var1];
      }

      this.gQ = new int[var2];
      this.gR = new int[var2];
      this.gS = new int[var2];
      this.gO = new byte[var2];
      this.gL = new int[var2];
      this.hO = new int[var2];
      this.gW = new int[var2];
      this.gX = new int[var2];
      this.gY = new int[var2];
      this.gZ = new int[var2];
      this.gx = new int[var1][];
      this.gw = new int[var1];
      this.gF = new int[var1];
      this.gE = new int[var1];
      this.gD = new int[var1];
      this.gC = new int[var1];
      if (!this.hl) {
         this.gT = new int[var2];
         this.gU = new int[var2];
         this.gV = new int[var2];
         this.gM = new int[var2];
         this.gN = new int[var2];
      }

      this.gu = new int[var1];
      this.hI = 256;
      this.hw = 0;
      this.hF = 256;
      this.hG = 256;
      this.hA = 256;
      if (!this.hg || !this.hm) {
         this.hj = new int[var1];
         this.hk = new int[var1];
         this.hi = new int[var1];
      }

      this.hH = 256;
      this.gv = 0;
      this.hv = 0;
      this.hD = 0;
      this.hy = 256;
      if (!this.hn) {
         this.hL = new int[var2];
         this.hN = new int[var2];
         this.hM = new int[var2];
      } else {
         this.hL = this.gQ;
         this.hN = this.gS;
         this.hM = this.gR;
      }

      this.hB = 0;
      this.hK = var2;
      this.hE = 256;
      this.hJ = 256;
      this.hC = 0;
      this.ha = 0;
      this.gP = 0;
      this.hz = 256;
      this.hh = var1;
      this.hx = 0;
   }

   final void h(int var1, int var2, int var3) {
      this.hv = var1 & 255;
      this.hw = var2 & 255;
      this.hx = var3 & 255;
      this.bn();
      this.gJ = 1;
   }

   public final void i(int var1, int var2, int var3) {
      this.hC = var2;
      this.hB = var1;
      this.hD = var3;
      this.bn();
      this.gJ = 1;
   }

   final void j(int var1, int var2) {
      this.gO[var1] = (byte)var2;
   }

   private final void j(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; this.gP > var5; ++var5) {
         int[] var10000 = this.hL;
         var10000[var5] += var2;
         var10000 = this.hM;
         var10000[var5] += var3;
         var10000 = this.hN;
         var10000[var5] += var4;
      }

   }

   public final void j(int var1, int var2, int var3) {
      this.hB += var1;
      this.hC += var2;
      this.hD += var3;
      this.bn();
      this.gJ = 1;
   }
}
