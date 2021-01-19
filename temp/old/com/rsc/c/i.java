package com.rsc.c;

public final class i {
   public static int[] hO = new int[256];
   public static int[] hP = new int[256];
   public static int[] hQ = new int[1024];
   public static int[] hR = new int[1024];
   public static int hS;
   public static int hT;
   public static int hU;
   public static int hV;
   public static int hW;
   public static int hX;
   public static long hY = 0L;
   private final int[] hZ = new int[40];
   private final int[] ia = new int[40];
   private final int[] ib = new int[40];
   private final int[] ic = new int[40];
   private final int[] id = new int[40];
   private final int[] ie = new int[40];
   private int if;
   private int ig;
   private int ih;
   private int ii;
   private int ij;
   private int ik;
   private int il;
   private final int im = 5;
   public int in;
   private final int io;
   private final h[] ip;
   private final int[] iq;
   private final int ir = 4;
   private final int is = 50;
   private final int[][] it;
   private final boolean iu;
   private final int[] iv;
   public int[][] iw;
   public int ix = 10;
   public int iy = 20;
   public h iz;
   private int iA;
   private int[] iB;
   private int[][] iC;
   private byte[][] iD;
   private long[] iE;
   private boolean[] iF;
   private int iG;
   private int[] iH;
   private int[] iI;
   private int[] iJ;
   private int[] iK;
   private int[] iL;
   private int[] iM;
   private int[] iN;
   private int iO = 256;
   private int iP = 192;
   private int A;
   private int B;
   private int iQ = 0;
   private boolean iR;
   private int[] iS;
   private int iT;
   private int iU = 256;
   private int iV = 256;
   private int iW;
   private int iX;
   private k fW;
   private int iY;
   private int iZ;
   private boolean ja = false;
   private j[] jb;
   private g[] jc;
   private int jd;
   private h[] je;
   private int jf;
   private int jg;
   private int[] jh;

   public i(k var1, int var2, int var3, int var4) {
      this.getClass();
      this.it = new int[50][256];
      this.getClass();
      this.iv = new int[50];
      this.iu = true;
      this.in = 1000;
      this.iT = 512;
      this.il = 8;
      this.io = 100;
      this.iR = false;
      this.ip = new h[this.io];
      this.iq = new int[this.io];
      this.jg = 0;
      this.iS = var1.jp;
      this.fW = var1;
      this.iO = var1.iT / 2;
      this.iP = var1.jo / 2;
      this.jf = var2;
      this.je = new h[this.jf];
      this.jd = 0;
      this.jc = new g[var3];

      for(int var5 = 0; var5 < var3; ++var5) {
         this.jc[var5] = new g();
      }

      this.iG = 0;
      this.iz = new h(var4 * 2, var4);
      this.iI = new int[var4];
      this.iJ = new int[var4];
      this.iL = new int[var4];
      this.iM = new int[var4];
      this.iN = new int[var4];
      this.iK = new int[var4];
      this.iH = new int[var4];
      this.if = 0;
      this.ig = 0;
      this.ih = 0;
      this.ik = 0;
      this.ij = 0;
      this.ii = 0;
      this.in = 2400;
      this.ix = 2300;
      this.iy = 1;
   }

   private final boolean a(g var1, g var2) {
      h var3 = var1.gl;
      h var4 = var2.gl;
      int var5 = var1.gg;
      int var6 = var2.gg;
      int[] var7 = var3.gw[var5];
      int[] var8 = var4.gw[var6];
      int var9 = var3.gv[var5];
      int var10 = var4.gv[var6];
      int var11 = var4.gS[var8[0]];
      int var12 = var4.gT[var8[0]];
      int var13 = var4.gU[var8[0]];
      int var14 = var2.go;
      int var15 = var2.gj;
      int var16 = var2.gi;
      int var17 = var4.gC[var6];
      boolean var18 = false;
      int var19 = var2.gp;

      int var20;
      int var21;
      int var22;
      for(var20 = 0; var9 > var20; ++var20) {
         var21 = var7[var20];
         var22 = var15 * (var12 - var3.gT[var21]) + (var11 - var3.gS[var21]) * var14 + (var13 - var3.gU[var21]) * var16;
         if (-var17 > var22 && var19 < 0 || var22 > var17 && var19 > 0) {
            var18 = true;
            break;
         }
      }

      if (!var18) {
         return true;
      } else {
         var11 = var3.gS[var7[0]];
         var16 = var1.gi;
         var17 = var3.gC[var5];
         var13 = var3.gU[var7[0]];
         var12 = var3.gT[var7[0]];
         var18 = false;
         var14 = var1.go;
         var15 = var1.gj;
         var19 = var1.gp;

         for(var20 = 0; var20 < var10; ++var20) {
            var21 = var8[var20];
            var22 = var14 * (var11 - var4.gS[var21]) - (-(var15 * (var12 - var4.gT[var21])) - (var13 - var4.gU[var21]) * var16);
            if (var22 < -var17 && var19 > 0 || var17 < var22 && var19 < 0) {
               var18 = true;
               break;
            }
         }

         return !var18;
      }
   }

   public final int[] bs() {
      return this.iq;
   }

   private final boolean a(boolean var1, int var2, int var3, int var4, int var5) {
      if ((!var1 || var4 > var3) && var4 >= var3) {
         if (var4 < var2) {
            return true;
         } else if (var5 < var3) {
            return true;
         } else {
            return var5 < var2 ? true : var1;
         }
      } else if (var4 > var2) {
         return true;
      } else if (var5 > var3) {
         return true;
      } else if (var5 > var2) {
         return true;
      } else {
         return !var1;
      }
   }

   private final boolean b(g var1, g var2) {
      if (var2.gd >= var1.gk) {
         return true;
      } else if (var1.gd >= var2.gk) {
         return true;
      } else if (var1.gh <= var2.gf) {
         return true;
      } else if (var2.gh <= var1.gf) {
         return true;
      } else if (var1.gn <= var2.gr) {
         return true;
      } else if (var2.gn < var1.gr) {
         return false;
      } else {
         h var3 = var2.gl;
         h var4 = var1.gl;
         int var5 = var2.gg;
         int var6 = var1.gg;
         int[] var7 = var3.gw[var5];
         int[] var8 = var4.gw[var6];
         int var9 = var3.gv[var5];
         int var10 = var4.gv[var6];
         int var11 = var4.gS[var8[0]];
         int var12 = var4.gT[var8[0]];
         int var13 = var4.gU[var8[0]];
         int var14 = var1.go;
         int var15 = var1.gj;
         int var16 = var1.gi;
         int var17 = var4.gC[var6];
         int var18 = var1.gp;
         boolean var19 = false;

         int var20;
         int var21;
         int var22;
         for(var22 = 0; var22 < var9; ++var22) {
            var20 = var7[var22];
            var21 = (var13 - var3.gU[var20]) * var16 + (var12 - var3.gT[var20]) * var15 + var14 * (var11 - var3.gS[var20]);
            if (var21 < -var17 && var18 < 0 || var21 > var17 && var18 > 0) {
               var19 = true;
               break;
            }
         }

         if (!var19) {
            return true;
         } else {
            var19 = false;
            var18 = var2.gp;
            var12 = var3.gT[var7[0]];
            var11 = var3.gS[var7[0]];
            var17 = var3.gC[var5];
            var13 = var3.gU[var7[0]];
            var15 = var2.gj;
            var16 = var2.gi;
            var14 = var2.go;

            for(var22 = 0; var10 > var22; ++var22) {
               var20 = var8[var22];
               var21 = (var13 - var4.gU[var20]) * var16 + (var11 - var4.gS[var20]) * var14 + (var12 - var4.gT[var20]) * var15;
               if (-var17 > var21 && var18 > 0 || var17 < var21 && var18 < 0) {
                  var19 = true;
                  break;
               }
            }

            if (!var19) {
               return true;
            } else {
               int[] var23;
               int var24;
               int[] var26;
               if (var9 != 2) {
                  var26 = new int[var9];
                  var23 = new int[var9];

                  for(var24 = 0; var24 < var9; ++var24) {
                     int var27 = var7[var24];
                     var26[var24] = var3.gM[var27];
                     var23[var24] = var3.gL[var27];
                  }
               } else {
                  var26 = new int[4];
                  var23 = new int[4];
                  var20 = var7[1];
                  var24 = var7[0];
                  var26[0] = var3.gM[var24] - 20;
                  var26[1] = var3.gM[var20] - 20;
                  var26[2] = 20 + var3.gM[var20];
                  var26[3] = var3.gM[var24] + 20;
                  var23[0] = var23[3] = var3.gL[var24];
                  var23[1] = var23[2] = var3.gL[var20];
               }

               int[] var28;
               int[] var29;
               if (var10 != 2) {
                  var29 = new int[var10];
                  var28 = new int[var10];

                  for(var24 = 0; var24 < var10; ++var24) {
                     int var25 = var8[var24];
                     var29[var24] = var4.gM[var25];
                     var28[var24] = var4.gL[var25];
                  }
               } else {
                  var28 = new int[4];
                  var29 = new int[4];
                  var24 = var8[0];
                  var20 = var8[1];
                  var29[0] = var4.gM[var24] - 20;
                  var29[1] = var4.gM[var20] - 20;
                  var29[2] = var4.gM[var20] + 20;
                  var29[3] = var4.gM[var24] + 20;
                  var28[0] = var28[3] = var4.gL[var24];
                  var28[1] = var28[2] = var4.gL[var20];
               }

               return !this.a(var29, var28, var26, var23);
            }
         }
      }
   }

   final int a(int var1, boolean var2) {
      if (var1 == 12345678) {
         return 0;
      } else {
         this.W(var1);
         if (var1 >= 0) {
            return this.iw[var1][0];
         } else if (var1 < 0) {
            var1 = -(var1 + 1);
            int var3 = (var1 & 31744) >> 10;
            int var4 = (992 & var1) >> 5;
            int var5 = 31 & var1;
            return (var5 << 3) + (var4 << 11) + (var3 << 19);
         } else {
            return 0;
         }
      }
   }

   private final boolean a(int var1, boolean var2, int var3, int var4) {
      return (!var2 || var3 > var1) && var3 >= var1 ? var4 < var1 || var2 : var1 < var4 || !var2;
   }

   private final int d(int var1, int var2, int var3, int var4, int var5) {
      return var4 == var2 ? var1 : (var3 - var1) * (var5 - var2) / (var4 - var2) + var1;
   }

   private final void T(int var1) {
      short var2;
      if (this.iB[var1] != 0) {
         var2 = 128;
      } else {
         var2 = 64;
      }

      int[] var3 = this.iw[var1];
      int var4 = 0;

      int var5;
      int var6;
      for(var5 = 0; var2 > var5; ++var5) {
         for(var6 = 0; var2 > var6; ++var6) {
            int var7 = this.iC[var1][this.iD[var1][var6 + var5 * var2] & 255];
            var7 &= 16316671;
            if (var7 == 0) {
               var7 = 1;
            } else if (var7 == 16253183) {
               this.iF[var1] = true;
               var7 = 0;
            }

            var3[var4++] = var7;
         }
      }

      for(var5 = 0; var5 < var4; ++var5) {
         var6 = var3[var5];
         var3[var4 + var5] = var6 - (var6 >>> 3) & 16316671;
         var3[var4 * 2 + var5] = var6 - (var6 >>> 2) & 16316671;
         var3[var4 * 3 + var5] = var6 - (var6 >>> 2) - (var6 >>> 3) & 16316671;
      }

   }

   private final void U(int var1) {
      g var2 = this.jc[var1];
      h var3 = var2.gl;
      int var4 = var2.gg;
      int[] var5 = var3.gw[var4];
      int var6 = var3.gv[var4];
      int var7 = var3.gB[var4];
      int var8 = var3.gS[var5[0]];
      int var9 = var3.gT[var5[0]];
      int var10 = var3.gU[var5[0]];
      int var11 = var3.gS[var5[1]] - var8;
      int var12 = var3.gT[var5[1]] - var9;
      int var13 = var3.gU[var5[1]] - var10;
      int var14 = var3.gS[var5[2]] - var8;
      int var15 = var3.gT[var5[2]] - var9;
      int var16 = var3.gU[var5[2]] - var10;
      int var17 = var16 * var12 - var13 * var15;
      int var18 = var14 * var13 - var11 * var16;
      int var19 = var11 * var15 - var14 * var12;
      if (var7 != -1) {
         var19 >>= var7;
         var17 >>= var7;
         var18 >>= var7;
      } else {
         for(var7 = 0; var17 > 25000 || var18 > 25000 || var19 > 25000 || var17 < -25000 || var18 < -25000 || var19 < -25000; ++var7) {
            var17 >>= 1;
            var18 >>= 1;
            var19 >>= 1;
         }

         var3.gB[var4] = var7;
         int[] var10000 = var3.gC;
         this.getClass();
         var10000[var4] = (int)(4.0D * Math.sqrt((double)(var19 * var19 + var18 * var18 + var17 * var17)));
      }

      var2.go = var17;
      var2.gj = var18;
      var2.gi = var19;
      var2.gp = var17 * var8 + var18 * var9 + var19 * var10;
      int var20 = var3.gU[var5[0]];
      int var21 = var20;
      int var22 = var3.gM[var5[0]];
      int var23 = var22;
      int var24 = var3.gL[var5[0]];
      int var25 = var24;

      for(int var26 = 1; var6 > var26; ++var26) {
         int var27 = var3.gU[var5[var26]];
         if (var27 <= var21) {
            if (var27 < var20) {
               var20 = var27;
            }
         } else {
            var21 = var27;
         }

         var27 = var3.gM[var5[var26]];
         if (var27 > var23) {
            var23 = var27;
         } else if (var27 < var22) {
            var22 = var27;
         }

         var27 = var3.gL[var5[var26]];
         if (var27 > var25) {
            var25 = var27;
         } else if (var24 > var27) {
            var24 = var27;
         }
      }

      var2.gd = var22;
      var2.gk = var23;
      var2.gh = var25;
      var2.gn = var21;
      var2.gf = var24;
      var2.gr = var20;
   }

   private final void k(int var1, int var2, int var3) {
      int var4 = 1024 - this.ii & 1023;
      int var5 = 1024 - this.ij & 1023;
      int var6 = 1024 - this.ik & 1023;
      int var7;
      int var8;
      int var9;
      if (var6 != 0) {
         var7 = hQ[var6];
         var8 = hR[var6];
         var9 = var8 * var2 + var7 * var3 >> 15;
         var3 = var3 * var8 - var7 * var2 >> 15;
         var2 = var9;
      }

      if (var4 != 0) {
         var7 = hQ[var4];
         var8 = hR[var4];
         var9 = var3 * var8 - var7 * var1 >> 15;
         var1 = var8 * var1 + var7 * var3 >> 15;
         var3 = var9;
      }

      if (var5 != 0) {
         var7 = hQ[var5];
         var8 = hR[var5];
         var9 = var7 * var1 + var2 * var8 >> 15;
         var1 = var8 * var1 - var7 * var2 >> 15;
         var2 = var9;
      }

      if (var1 > hX) {
         hX = var1;
      }

      if (var3 < hU) {
         hU = var3;
      }

      if (var2 > hT) {
         hT = var2;
      }

      if (var3 > hS) {
         hS = var3;
      }

      if (var1 < hW) {
         hW = var1;
      }

      if (var2 < hV) {
         hV = var2;
      }

   }

   public final void V(int var1) {
      hY = 0L;
      this.iC = new int[var1][];
      this.iD = new byte[var1][];
      this.iw = new int[var1][];
      this.iF = new boolean[var1];
      this.iA = var1;
      this.iB = new int[var1];
      this.iE = new long[var1];
   }

   public final void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var4 == 0 && var6 == 0 && var1 == 0) {
         var4 = 32;
      }

      for(int var7 = var3; var7 < this.jg; ++var7) {
         this.je[var7].c(var2, var5, var6, var4, var1);
      }

   }

   private final void a(int var1, int var2, g[] var3) {
      int var4;
      for(var4 = 0; var4 <= var1; ++var4) {
         var3[var4].gc = false;
         var3[var4].ge = var4;
         var3[var4].gm = -1;
      }

      var4 = 0;

      while(true) {
         while(var3[var4].gc) {
            ++var4;
         }

         if (var4 == var1) {
            return;
         }

         g var5 = var3[var4];
         var5.gc = true;
         int var6 = var4;
         int var7 = var4 + var2;
         if (var7 >= var1) {
            var7 = var1 - 1;
         }

         for(int var8 = var7; var8 >= 1 + var6; --var8) {
            g var9 = var3[var8];
            if (var9.gk > var5.gd && var9.gd < var5.gk && var9.gh > var5.gf && var9.gf < var5.gh && var5.ge != var9.gm && !this.b(var9, var5) && this.a(var9, var5)) {
               this.a(var6, var3, var8);
               var6 = this.iY;
               if (var3[var8] != var9) {
                  ++var8;
               }

               var9.gm = var5.ge;
            }
         }
      }
   }

   private void a(int var1, int[] var2, int[] var3, int[] var4, h var5, int var6) {
      int var10 = 0;
      int var7;
      int var8;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      int var19;
      int var20;
      int var21;
      int var22;
      int var23;
      int var24;
      int var25;
      int var26;
      int var27;
      int var28;
      int var29;
      int var30;
      int var31;
      int var32;
      int var33;
      int var34;
      int var35;
      int var36;
      int var37;
      int var38;
      int var39;
      int var40;
      j var50;
      if (var1 == 3) {
         var11 = var3[0] + this.iU;
         var12 = var3[1] + this.iU;
         var13 = var3[2] + this.iU;
         var14 = var2[0];
         var15 = var2[1];
         var16 = var2[2];
         var17 = var4[0];
         var18 = var4[1];
         var19 = var4[2];
         var20 = this.iU + this.iP - 1;
         var21 = 0;
         var22 = 0;
         var23 = 0;
         var24 = 0;
         var25 = 12345678;
         var26 = -12345678;
         if (var13 != var11) {
            var22 = (var16 - var14 << 8) / (var13 - var11);
            var24 = (var19 - var17 << 8) / (var13 - var11);
            if (var11 < var13) {
               var21 = var14 << 8;
               var23 = var17 << 8;
               var25 = var11;
               var26 = var13;
            } else {
               var21 = var16 << 8;
               var23 = var19 << 8;
               var25 = var13;
               var26 = var11;
            }

            if (var25 < 0) {
               var21 -= var22 * var25;
               var23 -= var24 * var25;
               var25 = 0;
            }

            if (var26 > var20) {
               var26 = var20;
            }
         }

         var27 = 0;
         var28 = 0;
         var29 = 0;
         var30 = 0;
         var31 = 12345678;
         var32 = -12345678;
         if (var12 != var11) {
            var28 = (var15 - var14 << 8) / (var12 - var11);
            var30 = (var18 - var17 << 8) / (var12 - var11);
            if (var11 < var12) {
               var27 = var14 << 8;
               var29 = var17 << 8;
               var31 = var11;
               var32 = var12;
            } else {
               var27 = var15 << 8;
               var29 = var18 << 8;
               var31 = var12;
               var32 = var11;
            }

            if (var31 < 0) {
               var27 -= var28 * var31;
               var29 -= var30 * var31;
               var31 = 0;
            }

            if (var32 > var20) {
               var32 = var20;
            }
         }

         var33 = 0;
         var34 = 0;
         var35 = 0;
         var36 = 0;
         var37 = 12345678;
         var38 = -12345678;
         if (var13 != var12) {
            var34 = (var16 - var15 << 8) / (var13 - var12);
            var36 = (var19 - var18 << 8) / (var13 - var12);
            if (var12 < var13) {
               var33 = var15 << 8;
               var35 = var18 << 8;
               var37 = var12;
               var38 = var13;
            } else {
               var33 = var16 << 8;
               var35 = var19 << 8;
               var37 = var13;
               var38 = var12;
            }

            if (var37 < 0) {
               var33 -= var34 * var37;
               var35 -= var36 * var37;
               var37 = 0;
            }

            if (var38 > var20) {
               var38 = var20;
            }
         }

         this.iW = var25;
         if (var31 < this.iW) {
            this.iW = var31;
         }

         if (var37 < this.iW) {
            this.iW = var37;
         }

         this.iX = var26;
         if (var32 > this.iX) {
            this.iX = var32;
         }

         if (var38 > this.iX) {
            this.iX = var38;
         }

         var39 = 0;

         for(var40 = this.iW; var40 < this.iX; ++var40) {
            if (var40 >= var25 && var40 < var26) {
               var8 = var21;
               var7 = var21;
               var39 = var23;
               var10 = var23;
               var21 += var22;
               var23 += var24;
            } else {
               var7 = 655360;
               var8 = -655360;
            }

            if (var40 >= var31 && var40 < var32) {
               if (var27 < var7) {
                  var7 = var27;
                  var10 = var29;
               }

               if (var27 > var8) {
                  var8 = var27;
                  var39 = var29;
               }

               var27 += var28;
               var29 += var30;
            }

            if (var40 >= var37 && var40 < var38) {
               if (var33 < var7) {
                  var7 = var33;
                  var10 = var35;
               }

               if (var33 > var8) {
                  var8 = var33;
                  var39 = var35;
               }

               var33 += var34;
               var35 += var36;
            }

            j var41 = this.jb[var40];
            var41.jk = var7;
            var41.jj = var8;
            var41.ji = var10;
            var41.jl = var39;
         }

         if (this.iW < this.iU - this.iP) {
            this.iW = this.iU - this.iP;
         }
      } else {
         int var9;
         if (var1 == 4) {
            var11 = var3[0] + this.iU;
            var12 = var3[1] + this.iU;
            var13 = var3[2] + this.iU;
            var14 = var3[3] + this.iU;
            var15 = var2[0];
            var16 = var2[1];
            var17 = var2[2];
            var18 = var2[3];
            var19 = var4[0];
            var20 = var4[1];
            var21 = var4[2];
            var22 = var4[3];
            var23 = this.iU + this.iP - 1;
            var24 = 0;
            var25 = 0;
            var26 = 0;
            var27 = 0;
            var28 = 12345678;
            var29 = -12345678;
            if (var14 != var11) {
               var25 = (var18 - var15 << 8) / (var14 - var11);
               var27 = (var22 - var19 << 8) / (var14 - var11);
               if (var11 < var14) {
                  var24 = var15 << 8;
                  var26 = var19 << 8;
                  var28 = var11;
                  var29 = var14;
               } else {
                  var24 = var18 << 8;
                  var26 = var22 << 8;
                  var28 = var14;
                  var29 = var11;
               }

               if (var28 < 0) {
                  var24 -= var25 * var28;
                  var26 -= var27 * var28;
                  var28 = 0;
               }

               if (var29 > var23) {
                  var29 = var23;
               }
            }

            var30 = 0;
            var31 = 0;
            var32 = 0;
            var33 = 0;
            var34 = 12345678;
            var35 = -12345678;
            if (var12 != var11) {
               var31 = (var16 - var15 << 8) / (var12 - var11);
               var33 = (var20 - var19 << 8) / (var12 - var11);
               if (var11 < var12) {
                  var30 = var15 << 8;
                  var32 = var19 << 8;
                  var34 = var11;
                  var35 = var12;
               } else {
                  var30 = var16 << 8;
                  var32 = var20 << 8;
                  var34 = var12;
                  var35 = var11;
               }

               if (var34 < 0) {
                  var30 -= var31 * var34;
                  var32 -= var33 * var34;
                  var34 = 0;
               }

               if (var35 > var23) {
                  var35 = var23;
               }
            }

            var36 = 0;
            var37 = 0;
            var38 = 0;
            var39 = 0;
            var40 = 12345678;
            int var53 = -12345678;
            if (var13 != var12) {
               var37 = (var17 - var16 << 8) / (var13 - var12);
               var39 = (var21 - var20 << 8) / (var13 - var12);
               if (var12 < var13) {
                  var36 = var16 << 8;
                  var38 = var20 << 8;
                  var40 = var12;
                  var53 = var13;
               } else {
                  var36 = var17 << 8;
                  var38 = var21 << 8;
                  var40 = var13;
                  var53 = var12;
               }

               if (var40 < 0) {
                  var36 -= var37 * var40;
                  var38 -= var39 * var40;
                  var40 = 0;
               }

               if (var53 > var23) {
                  var53 = var23;
               }
            }

            int var42 = 0;
            int var43 = 0;
            int var44 = 0;
            int var45 = 0;
            int var46 = 12345678;
            int var47 = -12345678;
            if (var14 != var13) {
               var43 = (var18 - var17 << 8) / (var14 - var13);
               var45 = (var22 - var21 << 8) / (var14 - var13);
               if (var13 < var14) {
                  var42 = var17 << 8;
                  var44 = var21 << 8;
                  var46 = var13;
                  var47 = var14;
               } else {
                  var42 = var18 << 8;
                  var44 = var22 << 8;
                  var46 = var14;
                  var47 = var13;
               }

               if (var46 < 0) {
                  var42 -= var43 * var46;
                  var44 -= var45 * var46;
                  var46 = 0;
               }

               if (var47 > var23) {
                  var47 = var23;
               }
            }

            this.iW = var28;
            if (var34 < this.iW) {
               this.iW = var34;
            }

            if (var40 < this.iW) {
               this.iW = var40;
            }

            if (var46 < this.iW) {
               this.iW = var46;
            }

            this.iX = var29;
            if (var35 > this.iX) {
               this.iX = var35;
            }

            if (var53 > this.iX) {
               this.iX = var53;
            }

            if (var47 > this.iX) {
               this.iX = var47;
            }

            int var48 = 0;

            for(var9 = this.iW; var9 < this.iX; ++var9) {
               if (var9 >= var28 && var9 < var29) {
                  var8 = var24;
                  var7 = var24;
                  var48 = var26;
                  var10 = var26;
                  var24 += var25;
                  var26 += var27;
               } else {
                  var7 = 655360;
                  var8 = -655360;
               }

               if (var9 >= var34 && var9 < var35) {
                  if (var30 < var7) {
                     var7 = var30;
                     var10 = var32;
                  }

                  if (var30 > var8) {
                     var8 = var30;
                     var48 = var32;
                  }

                  var30 += var31;
                  var32 += var33;
               }

               if (var9 >= var40 && var9 < var53) {
                  if (var36 < var7) {
                     var7 = var36;
                     var10 = var38;
                  }

                  if (var36 > var8) {
                     var8 = var36;
                     var48 = var38;
                  }

                  var36 += var37;
                  var38 += var39;
               }

               if (var9 >= var46 && var9 < var47) {
                  if (var42 < var7) {
                     var7 = var42;
                     var10 = var44;
                  }

                  if (var42 > var8) {
                     var8 = var42;
                     var48 = var44;
                  }

                  var42 += var43;
                  var44 += var45;
               }

               j var49 = this.jb[var9];
               var49.jk = var7;
               var49.jj = var8;
               var49.ji = var10;
               var49.jl = var48;
            }

            if (this.iW < this.iU - this.iP) {
               this.iW = this.iU - this.iP;
            }
         } else {
            this.iX = this.iW = var3[0] += this.iU;

            for(var9 = 1; var9 < var1; ++var9) {
               if ((var11 = var3[var9] += this.iU) < this.iW) {
                  this.iW = var11;
               } else if (var11 > this.iX) {
                  this.iX = var11;
               }
            }

            if (this.iW < this.iU - this.iP) {
               this.iW = this.iU - this.iP;
            }

            if (this.iX >= this.iU + this.iP) {
               this.iX = this.iU + this.iP - 1;
            }

            if (this.iW >= this.iX) {
               return;
            }

            for(var9 = this.iW; var9 < this.iX; ++var9) {
               var50 = this.jb[var9];
               var50.jk = 655360;
               var50.jj = -655360;
            }

            var11 = var1 - 1;
            var12 = var3[0];
            var13 = var3[var11];
            j var51;
            if (var12 < var13) {
               var14 = var2[0] << 8;
               var15 = (var2[var11] - var2[0] << 8) / (var13 - var12);
               var16 = var4[0] << 8;
               var17 = (var4[var11] - var4[0] << 8) / (var13 - var12);
               if (var12 < 0) {
                  var14 -= var15 * var12;
                  var16 -= var17 * var12;
                  var12 = 0;
               }

               if (var13 > this.iX) {
                  var13 = this.iX;
               }

               for(var9 = var12; var9 <= var13; ++var9) {
                  var51 = this.jb[var9];
                  var51.jk = var51.jj = var14;
                  var51.ji = var51.jl = var16;
                  var14 += var15;
                  var16 += var17;
               }
            } else if (var12 > var13) {
               var14 = var2[var11] << 8;
               var15 = (var2[0] - var2[var11] << 8) / (var12 - var13);
               var16 = var4[var11] << 8;
               var17 = (var4[0] - var4[var11] << 8) / (var12 - var13);
               if (var13 < 0) {
                  var14 -= var15 * var13;
                  var16 -= var17 * var13;
                  var13 = 0;
               }

               if (var12 > this.iX) {
                  var12 = this.iX;
               }

               for(var9 = var13; var9 <= var12; ++var9) {
                  var51 = this.jb[var9];
                  var51.jk = var51.jj = var14;
                  var51.ji = var51.jl = var16;
                  var14 += var15;
                  var16 += var17;
               }
            }

            for(var9 = 0; var9 < var11; ++var9) {
               var14 = var9 + 1;
               var15 = var3[var9];
               var16 = var3[var14];
               j var52;
               if (var15 < var16) {
                  var17 = var2[var9] << 8;
                  var18 = (var2[var14] - var2[var9] << 8) / (var16 - var15);
                  var19 = var4[var9] << 8;
                  var20 = (var4[var14] - var4[var9] << 8) / (var16 - var15);
                  if (var15 < 0) {
                     var17 -= var18 * var15;
                     var19 -= var20 * var15;
                     var15 = 0;
                  }

                  if (var16 > this.iX) {
                     var16 = this.iX;
                  }

                  for(var21 = var15; var21 <= var16; ++var21) {
                     var52 = this.jb[var21];
                     if (var17 < var52.jk) {
                        var52.jk = var17;
                        var52.ji = var19;
                     }

                     if (var17 > var52.jj) {
                        var52.jj = var17;
                        var52.jl = var19;
                     }

                     var17 += var18;
                     var19 += var20;
                  }
               } else if (var15 > var16) {
                  var17 = var2[var14] << 8;
                  var18 = (var2[var9] - var2[var14] << 8) / (var15 - var16);
                  var19 = var4[var14] << 8;
                  var20 = (var4[var9] - var4[var14] << 8) / (var15 - var16);
                  if (var16 < 0) {
                     var17 -= var18 * var16;
                     var19 -= var20 * var16;
                     var16 = 0;
                  }

                  if (var15 > this.iX) {
                     var15 = this.iX;
                  }

                  for(var21 = var16; var21 <= var15; ++var21) {
                     var52 = this.jb[var21];
                     if (var17 < var52.jk) {
                        var52.jk = var17;
                        var52.ji = var19;
                     }

                     if (var17 > var52.jj) {
                        var52.jj = var17;
                        var52.jl = var19;
                     }

                     var17 += var18;
                     var19 += var20;
                  }
               }
            }

            if (this.iW < this.iU - this.iP) {
               this.iW = this.iU - this.iP;
            }
         }
      }

      if (this.iR && this.iQ < this.io && this.B >= this.iW && this.B < this.iX) {
         var50 = this.jb[this.B];
         if (this.A >= var50.jk >> 8 && this.A <= var50.jj >> 8 && var50.jk <= var50.jj && !var5.gF && var5.gJ[var6] == 0) {
            this.ip[this.iQ] = var5;
            this.iq[this.iQ] = var6;
            ++this.iQ;
         }
      }

   }

   private final void a(g[] var1, int var2, int var3) {
      if (var3 > var2) {
         int var4 = var2 - 1;
         int var5 = var3 + 1;
         int var6 = (var3 + var2) / 2;
         g var7 = var1[var6];
         var1[var6] = var1[var2];
         var1[var2] = var7;
         int var8 = var7.gq;

         while(var5 > var4) {
            do {
               ++var4;
            } while(var1[var4].gq > var8);

            do {
               --var5;
            } while(var8 > var1[var5].gq);

            if (var5 > var4) {
               g var9 = var1[var4];
               var1[var4] = var1[var5];
               var1[var5] = var9;
            }
         }

         this.a(var1, var2, var5);
         this.a(var1, var5 + 1, var3);
      }

   }

   private final boolean a(int var1, g[] var2, int var3) {
      while(true) {
         g var4 = var2[var1];

         for(int var5 = var1 + 1; var3 >= var5; ++var5) {
            g var6 = var2[var5];
            if (!this.b(var4, var6)) {
               break;
            }

            var2[var1] = var6;
            var2[var5] = var4;
            var1 = var5;
            if (var3 == var5) {
               this.iZ = var5 - 1;
               this.iY = var5;
               return true;
            }
         }

         g var8 = var2[var3];

         for(int var9 = var3 - 1; var9 >= var1; --var9) {
            g var7 = var2[var9];
            if (!this.b(var7, var8)) {
               break;
            }

            var2[var3] = var7;
            var2[var9] = var8;
            var3 = var9;
            if (var9 == var1) {
               this.iZ = var9;
               this.iY = var9 + 1;
               return true;
            }
         }

         if (var1 + 1 >= var3) {
            this.iZ = var3;
            this.iY = var1;
            return false;
         }

         if (!this.a(var1 + 1, var2, var3)) {
            this.iY = var1;
            return false;
         }

         var3 = this.iZ;
      }
   }

   private final boolean a(int[] var1, int[] var2, int[] var3, int[] var4) {
      byte var5 = 0;
      int var6 = var3.length;
      int var7 = 0;
      int var8 = var4[0];
      int var9 = var4[0];

      int var10;
      for(var10 = 1; var6 > var10; ++var10) {
         if (var4[var10] >= var8) {
            if (var4[var10] > var9) {
               var9 = var4[var10];
            }
         } else {
            var8 = var4[var10];
            var7 = var10;
         }
      }

      var10 = var1.length;
      int var11 = var2[0];
      int var12 = var2[0];
      int var13 = 0;

      int var14;
      for(var14 = 1; var10 > var14; ++var14) {
         if (var2[var14] >= var11) {
            if (var12 < var2[var14]) {
               var12 = var2[var14];
            }
         } else {
            var11 = var2[var14];
            var13 = var14;
         }
      }

      if (var11 < var9) {
         if (var12 <= var8) {
            return false;
         } else {
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            boolean var20;
            if (var2[var13] > var4[var7]) {
               for(var14 = var7; var4[var7] < var2[var13]; var7 = (var7 - (1 - var6)) % var6) {
               }

               while(var4[var14] < var2[var13]) {
                  var14 = (1 + var14) % var6;
               }

               var15 = this.d(var3[(1 + var7) % var6], var4[(var7 + 1) % var6], var3[var7], var4[var7], var2[var13]);
               var16 = this.d(var3[(var6 - 1 + var14) % var6], var4[(var6 + (var14 - 1)) % var6], var3[var14], var4[var14], var2[var13]);
               var18 = var1[var13];
               var20 = var15 < var18 | var16 < var18;
               if (this.a(var18, var20, var15, var16)) {
                  return true;
               }

               var17 = (var13 + 1) % var10;
               var13 = (var13 + var10 - 1) % var10;
               if (var7 == var14) {
                  var5 = 1;
               }
            } else {
               for(var17 = var13; var4[var7] > var2[var13]; var13 = (var13 + var10 - 1) % var10) {
               }

               for(var15 = var3[var7]; var4[var7] > var2[var17]; var17 = (var17 + 1) % var10) {
               }

               var18 = this.d(var1[(var13 + 1) % var10], var2[(var13 + 1) % var10], var1[var13], var2[var13], var4[var7]);
               var19 = this.d(var1[(var17 - 1 + var10) % var10], var2[(var10 + (var17 - 1)) % var10], var1[var17], var2[var17], var4[var7]);
               var20 = var15 < var18 | var15 < var19;
               if (this.a(var15, !var20, var18, var19)) {
                  return true;
               }

               var14 = (1 + var7) % var6;
               var7 = (var6 + (var7 - 1)) % var6;
               if (var13 == var17) {
                  var5 = 2;
               }
            }

            while(var5 == 0) {
               if (var4[var7] >= var4[var14]) {
                  if (var4[var14] >= var2[var13]) {
                     if (var2[var13] >= var2[var17]) {
                        var15 = this.d(var3[(1 + var7) % var6], var4[(var7 + 1) % var6], var3[var7], var4[var7], var2[var17]);
                        var16 = this.d(var3[(var6 + (var14 - 1)) % var6], var4[(var14 - 1 + var6) % var6], var3[var14], var4[var14], var2[var17]);
                        var18 = this.d(var1[(var13 + 1) % var10], var2[(1 + var13) % var10], var1[var13], var2[var13], var2[var17]);
                        var19 = var1[var17];
                        if (this.a(var20, var19, var18, var15, var16)) {
                           return true;
                        }

                        var17 = (1 + var17) % var10;
                        if (var17 == var13) {
                           var5 = 2;
                        }
                     } else {
                        var15 = this.d(var3[(1 + var7) % var6], var4[(var7 + 1) % var6], var3[var7], var4[var7], var2[var13]);
                        var16 = this.d(var3[(var6 - 1 + var14) % var6], var4[(var14 + var6 - 1) % var6], var3[var14], var4[var14], var2[var13]);
                        var18 = var1[var13];
                        var19 = this.d(var1[(var17 - 1 + var10) % var10], var2[(var10 + (var17 - 1)) % var10], var1[var17], var2[var17], var2[var13]);
                        if (this.a(var20, var19, var18, var15, var16)) {
                           return true;
                        }

                        var13 = (var13 - 1 + var10) % var10;
                        if (var17 == var13) {
                           var5 = 2;
                        }
                     }
                  } else if (var4[var14] < var2[var17]) {
                     var15 = this.d(var3[(1 + var7) % var6], var4[(var7 + 1) % var6], var3[var7], var4[var7], var4[var14]);
                     var16 = var3[var14];
                     var18 = this.d(var1[(1 + var13) % var10], var2[(var13 + 1) % var10], var1[var13], var2[var13], var4[var14]);
                     var19 = this.d(var1[(var17 - (1 - var10)) % var10], var2[(var17 - 1 + var10) % var10], var1[var17], var2[var17], var4[var14]);
                     if (this.a(var20, var19, var18, var15, var16)) {
                        return true;
                     }

                     var14 = (var14 + 1) % var6;
                     if (var7 == var14) {
                        var5 = 1;
                     }
                  } else {
                     var15 = this.d(var3[(var7 + 1) % var6], var4[(var7 + 1) % var6], var3[var7], var4[var7], var2[var17]);
                     var16 = this.d(var3[(var6 - 1 + var14) % var6], var4[(var6 + var14 - 1) % var6], var3[var14], var4[var14], var2[var17]);
                     var18 = this.d(var1[(var13 + 1) % var10], var2[(var13 + 1) % var10], var1[var13], var2[var13], var2[var17]);
                     var19 = var1[var17];
                     if (this.a(var20, var19, var18, var15, var16)) {
                        return true;
                     }

                     var17 = (var17 + 1) % var10;
                     if (var13 == var17) {
                        var5 = 2;
                     }
                  }
               } else if (var2[var13] > var4[var7]) {
                  if (var4[var7] >= var2[var17]) {
                     var15 = this.d(var3[(1 + var7) % var6], var4[(1 + var7) % var6], var3[var7], var4[var7], var2[var17]);
                     var16 = this.d(var3[(var6 + (var14 - 1)) % var6], var4[(var6 + (var14 - 1)) % var6], var3[var14], var4[var14], var2[var17]);
                     var18 = this.d(var1[(1 + var13) % var10], var2[(var13 + 1) % var10], var1[var13], var2[var13], var2[var17]);
                     var19 = var1[var17];
                     if (this.a(var20, var19, var18, var15, var16)) {
                        return true;
                     }

                     var17 = (1 + var17) % var10;
                     if (var13 == var17) {
                        var5 = 2;
                     }
                  } else {
                     var15 = var3[var7];
                     var16 = this.d(var3[(var14 + var6 - 1) % var6], var4[(var14 + (var6 - 1)) % var6], var3[var14], var4[var14], var4[var7]);
                     var18 = this.d(var1[(1 + var13) % var10], var2[(1 + var13) % var10], var1[var13], var2[var13], var4[var7]);
                     var19 = this.d(var1[(var10 + (var17 - 1)) % var10], var2[(var10 - 1 + var17) % var10], var1[var17], var2[var17], var4[var7]);
                     if (this.a(var20, var19, var18, var15, var16)) {
                        return true;
                     }

                     var7 = (var6 + (var7 - 1)) % var6;
                     if (var7 == var14) {
                        var5 = 1;
                     }
                  }
               } else if (var2[var13] < var2[var17]) {
                  var15 = this.d(var3[(1 + var7) % var6], var4[(1 + var7) % var6], var3[var7], var4[var7], var2[var13]);
                  var16 = this.d(var3[(var6 - 1 + var14) % var6], var4[(var6 + (var14 - 1)) % var6], var3[var14], var4[var14], var2[var13]);
                  var18 = var1[var13];
                  var19 = this.d(var1[(var10 + var17 - 1) % var10], var2[(var10 + (var17 - 1)) % var10], var1[var17], var2[var17], var2[var13]);
                  if (this.a(var20, var19, var18, var15, var16)) {
                     return true;
                  }

                  var13 = (var10 + var13 - 1) % var10;
                  if (var17 == var13) {
                     var5 = 2;
                  }
               } else {
                  var15 = this.d(var3[(var7 + 1) % var6], var4[(var7 + 1) % var6], var3[var7], var4[var7], var2[var17]);
                  var16 = this.d(var3[(var6 + (var14 - 1)) % var6], var4[(var14 + var6 - 1) % var6], var3[var14], var4[var14], var2[var17]);
                  var18 = this.d(var1[(1 + var13) % var10], var2[(var13 + 1) % var10], var1[var13], var2[var13], var2[var17]);
                  var19 = var1[var17];
                  if (this.a(var20, var19, var18, var15, var16)) {
                     return true;
                  }

                  var17 = (var17 + 1) % var10;
                  if (var13 == var17) {
                     var5 = 2;
                  }
               }
            }

            while(var5 == 1) {
               if (~var4[var7] <= ~var2[var13]) {
                  if (var2[var13] < var2[var17]) {
                     var15 = this.d(var3[(var7 + 1) % var6], var4[(1 + var7) % var6], var3[var7], var4[var7], var2[var13]);
                     var16 = this.d(var3[(var14 - 1 + var6) % var6], var4[(var14 - 1 + var6) % var6], var3[var14], var4[var14], var2[var13]);
                     var18 = var1[var13];
                     var19 = this.d(var1[(var17 + (var10 - 1)) % var10], var2[(var17 - 1 + var10) % var10], var1[var17], var2[var17], var2[var13]);
                     if (this.a(var20, var19, var18, var15, var16)) {
                        return true;
                     }

                     var13 = (var13 + (var10 - 1)) % var10;
                     if (var13 == var17) {
                        var5 = 0;
                     }
                  } else {
                     var15 = this.d(var3[(1 + var7) % var6], var4[(1 + var7) % var6], var3[var7], var4[var7], var2[var17]);
                     var16 = this.d(var3[(var14 + (var6 - 1)) % var6], var4[(var6 + var14 - 1) % var6], var3[var14], var4[var14], var2[var17]);
                     var18 = this.d(var1[(1 + var13) % var10], var2[(var13 + 1) % var10], var1[var13], var2[var13], var2[var17]);
                     var19 = var1[var17];
                     if (this.a(var20, var19, var18, var15, var16)) {
                        return true;
                     }

                     var17 = (1 + var17) % var10;
                     if (var13 == var17) {
                        var5 = 0;
                     }
                  }
               } else {
                  if (var2[var17] > var4[var7]) {
                     var15 = var3[var7];
                     var18 = this.d(var1[(1 + var13) % var10], var2[(var13 + 1) % var10], var1[var13], var2[var13], var4[var7]);
                     var19 = this.d(var1[(var10 + (var17 - 1)) % var10], var2[(var17 - 1 + var10) % var10], var1[var17], var2[var17], var4[var7]);
                     return this.a(var15, !var20, var18, var19);
                  }

                  var15 = this.d(var3[(1 + var7) % var6], var4[(1 + var7) % var6], var3[var7], var4[var7], var2[var17]);
                  var16 = this.d(var3[(var14 + var6 - 1) % var6], var4[(var14 + var6 - 1) % var6], var3[var14], var4[var14], var2[var17]);
                  var18 = this.d(var1[(1 + var13) % var10], var2[(1 + var13) % var10], var1[var13], var2[var13], var2[var17]);
                  var19 = var1[var17];
                  if (this.a(var20, var19, var18, var15, var16)) {
                     return true;
                  }

                  var17 = (1 + var17) % var10;
                  if (var13 == var17) {
                     var5 = 0;
                  }
               }
            }

            while(var5 == 2) {
               if (var2[var13] < var4[var7]) {
                  if (var2[var13] < var4[var14]) {
                     var15 = this.d(var3[(var7 + 1) % var6], var4[(var7 + 1) % var6], var3[var7], var4[var7], var2[var13]);
                     var16 = this.d(var3[(var6 - 1 + var14) % var6], var4[(var14 - 1 + var6) % var6], var3[var14], var4[var14], var2[var13]);
                     var18 = var1[var13];
                     return this.a(var18, var20, var15, var16);
                  }

                  var15 = this.d(var3[(1 + var7) % var6], var4[(1 + var7) % var6], var3[var7], var4[var7], var4[var14]);
                  var16 = var3[var14];
                  var18 = this.d(var1[(var13 + 1) % var10], var2[(1 + var13) % var10], var1[var13], var2[var13], var4[var14]);
                  var19 = this.d(var1[(var17 + var10 - 1) % var10], var2[(var17 - 1 + var10) % var10], var1[var17], var2[var17], var4[var14]);
                  if (this.a(var20, var19, var18, var15, var16)) {
                     return true;
                  }

                  var14 = (1 + var14) % var6;
                  if (var7 == var14) {
                     var5 = 0;
                  }
               } else if (var4[var7] >= var4[var14]) {
                  var15 = this.d(var3[(1 + var7) % var6], var4[(var7 + 1) % var6], var3[var7], var4[var7], var4[var14]);
                  var16 = var3[var14];
                  var18 = this.d(var1[(1 + var13) % var10], var2[(1 + var13) % var10], var1[var13], var2[var13], var4[var14]);
                  var19 = this.d(var1[(var17 + var10 - 1) % var10], var2[(var17 - (1 - var10)) % var10], var1[var17], var2[var17], var4[var14]);
                  if (this.a(var20, var19, var18, var15, var16)) {
                     return true;
                  }

                  var14 = (1 + var14) % var6;
                  if (var7 == var14) {
                     var5 = 0;
                  }
               } else {
                  var15 = var3[var7];
                  var16 = this.d(var3[(var6 + var14 - 1) % var6], var4[(var14 + var6 - 1) % var6], var3[var14], var4[var14], var4[var7]);
                  var18 = this.d(var1[(var13 + 1) % var10], var2[(var13 + 1) % var10], var1[var13], var2[var13], var4[var7]);
                  var19 = this.d(var1[(var10 + var17 - 1) % var10], var2[(var17 + (var10 - 1)) % var10], var1[var17], var2[var17], var4[var7]);
                  if (this.a(var20, var19, var18, var15, var16)) {
                     return true;
                  }

                  var7 = (var6 + var7 - 1) % var6;
                  if (var14 == var7) {
                     var5 = 0;
                  }
               }
            }

            if (var2[var13] <= var4[var7]) {
               var15 = this.d(var3[(var7 + 1) % var6], var4[(1 + var7) % var6], var3[var7], var4[var7], var2[var13]);
               var16 = this.d(var3[(var6 + (var14 - 1)) % var6], var4[(var14 - 1 + var6) % var6], var3[var14], var4[var14], var2[var13]);
               var18 = var1[var13];
               return this.a(var18, var20, var15, var16);
            } else {
               var15 = var3[var7];
               var18 = this.d(var1[(var13 + 1) % var10], var2[(1 + var13) % var10], var1[var13], var2[var13], var4[var7]);
               var19 = this.d(var1[(var10 - 1 + var17) % var10], var2[(var10 + (var17 - 1)) % var10], var1[var17], var2[var17], var4[var7]);
               return this.a(var15, !var20, var18, var19);
            }
         }
      } else {
         return false;
      }
   }

   private final void a(int[] var1, int[] var2, int[] var3, h var4, int var5, int var6) {
      if (var6 != -2) {
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         if (var6 >= 0) {
            if (var6 >= this.iA) {
               var6 = 0;
            }

            this.W(var6);
            var7 = var1[0];
            var8 = var2[0];
            var9 = var3[0];
            var10 = var7 - var1[1];
            var11 = var8 - var2[1];
            var12 = var9 - var3[1];
            var13 = var1[var5 - 1] - var7;
            var14 = var2[var5 - 1] - var8;
            var15 = var3[var5 - 1] - var9;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            int var30;
            int var31;
            int var32;
            byte var33;
            int var34;
            j var35;
            int var36;
            int var37;
            int var38;
            if (this.iB[var6] == 1) {
               var18 = var8 * var13 - var14 * var7 << 12;
               var19 = var8 * var10 - var7 * var11 << 12;
               var20 = var7 * var12 - var9 * var10 << 7 + (5 - this.il);
               var21 = var11 * var9 - var12 * var8 << 5 - this.il + 11;
               var22 = var12 * var14 - var11 * var15 << 4 + (5 - this.il);
               var23 = var10 * var15 - var12 * var13 >> this.il - 5;
               var24 = var14 * var9 - var15 * var8 << 4 - this.il + 5 + 7;
               var25 = var15 * var7 - var13 * var9 << 7 - this.il + 5;
               var26 = var13 * var11 - var14 * var10 << 5;
               var27 = var24 >> 4;
               var28 = var21 >> 4;
               var29 = var22 >> 4;
               var30 = this.iW - this.iU;
               var31 = this.iT;
               var32 = var31 * this.iW + this.iV;
               var19 += var30 * var20;
               var33 = 1;
               var26 += var23 * var30;
               var18 += var25 * var30;
               if (this.ja) {
                  if ((this.iW & 1) == 1) {
                     var19 += var20;
                     var32 += var31;
                     var18 += var25;
                     var26 += var23;
                     ++this.iW;
                  }

                  var23 <<= 1;
                  var20 <<= 1;
                  var33 = 2;
                  var25 <<= 1;
                  var31 <<= 1;
               }

               if (var4.gH) {
                  for(var34 = this.iW; var34 < this.iX; var34 += var33) {
                     var35 = this.jb[var34];
                     var36 = var35.jk >> 8;
                     var37 = var35.jj >> 8;
                     var38 = var37 - var36;
                     if (var38 > 0) {
                        var16 = var35.ji;
                        var17 = (var35.jl - var16) / var38;
                        if (-this.iO > var36) {
                           var16 += var17 * (-var36 - this.iO);
                           var36 = -this.iO;
                           var38 = var37 - var36;
                        }

                        if (var37 > this.iO) {
                           var37 = this.iO;
                           var38 = var37 - var36;
                        }

                        l.a(var32 + var36, var19 + var36 * var28, var18 + var36 * var27, 0, var16, var21, 0, var26 + var36 * var29, var24, var17 << 2, this.iw[var6], var38, var22, this.iS);
                        var32 += var31;
                        var19 += var20;
                        var18 += var25;
                        var26 += var23;
                     } else {
                        var32 += var31;
                        var26 += var23;
                        var18 += var25;
                        var19 += var20;
                     }
                  }

                  return;
               }

               if (this.iF[var6]) {
                  for(var34 = this.iW; var34 < this.iX; var34 += var33) {
                     var35 = this.jb[var34];
                     var36 = var35.jk >> 8;
                     var37 = var35.jj >> 8;
                     var38 = var37 - var36;
                     if (var38 <= 0) {
                        var19 += var20;
                        var18 += var25;
                        var32 += var31;
                        var26 += var23;
                     } else {
                        var16 = var35.ji;
                        var17 = (var35.jl - var16) / var38;
                        if (-this.iO > var36) {
                           var16 += (-var36 - this.iO) * var17;
                           var36 = -this.iO;
                           var38 = var37 - var36;
                        }

                        if (var37 > this.iO) {
                           var37 = this.iO;
                           var38 = var37 - var36;
                        }

                        l.a(this.iw[var6], this.iS, var26 + var36 * var29, var16, var36 * var27 + var18, var19 + var36 * var28, var36 + var32, var22, var17, var24, var21, var38);
                        var32 += var31;
                        var19 += var20;
                        var26 += var23;
                        var18 += var25;
                     }
                  }

                  return;
               }

               for(var34 = this.iW; var34 < this.iX; var34 += var33) {
                  var35 = this.jb[var34];
                  var36 = var35.jk >> 8;
                  var37 = var35.jj >> 8;
                  var38 = var37 - var36;
                  if (var38 <= 0) {
                     var26 += var23;
                     var18 += var25;
                     var32 += var31;
                     var19 += var20;
                  } else {
                     var16 = var35.ji;
                     var17 = (var35.jl - var16) / var38;
                     if (var36 < -this.iO) {
                        var16 += (-this.iO - var36) * var17;
                        var36 = -this.iO;
                        var38 = var37 - var36;
                     }

                     if (this.iO < var37) {
                        var37 = this.iO;
                        var38 = var37 - var36;
                     }

                     l.a(var19 + var28 * var36, var24, var26 + var36 * var29, var16, var17 << 2, this.iw[var6], var36 + var32, var36 * var27 + var18, var22, 0, 0, this.iS, var21, var38);
                     var18 += var25;
                     var26 += var23;
                     var32 += var31;
                     var19 += var20;
                  }
               }
            } else if (this.iB[var6] == 0) {
               var18 = var13 * var8 - var7 * var14 << 11;
               var19 = var15 * var7 - var13 * var9 << 11 - this.il;
               var20 = var9 * var14 - var15 * var8 << 10 + (5 - this.il);
               var21 = var8 * var10 - var11 * var7 << 11;
               var22 = var12 * var7 - var9 * var10 << 11 - this.il;
               var23 = var9 * var11 - var8 * var12 << 4 - this.il + 11;
               var24 = var13 * var11 - var14 * var10 << 5;
               var25 = var15 * var10 - var13 * var12 >> this.il - 5;
               var26 = var14 * var12 - var11 * var15 << 4 + (5 - this.il);
               var27 = var20 >> 4;
               var28 = var23 >> 4;
               var29 = var26 >> 4;
               var30 = this.iW - this.iU;
               var31 = this.iT;
               var32 = var31 * this.iW + this.iV;
               var33 = 1;
               var24 += var30 * var25;
               var21 += var30 * var22;
               var18 += var30 * var19;
               if (this.ja) {
                  if ((1 & this.iW) == 1) {
                     var21 += var22;
                     var24 += var25;
                     var18 += var19;
                     ++this.iW;
                     var32 += var31;
                  }

                  var31 <<= 1;
                  var33 = 2;
                  var25 <<= 1;
                  var22 <<= 1;
                  var19 <<= 1;
               }

               if (var4.gH) {
                  for(var34 = this.iW; this.iX > var34; var34 += var33) {
                     var35 = this.jb[var34];
                     var36 = var35.jk >> 8;
                     var37 = var35.jj >> 8;
                     var38 = var37 - var36;
                     if (var38 <= 0) {
                        var21 += var22;
                        var24 += var25;
                        var18 += var19;
                        var32 += var31;
                     } else {
                        var16 = var35.ji;
                        var17 = (var35.jl - var16) / var38;
                        if (var36 < -this.iO) {
                           var16 += var17 * (-this.iO - var36);
                           var36 = -this.iO;
                           var38 = var37 - var36;
                        }

                        if (var37 > this.iO) {
                           var37 = this.iO;
                           var38 = var37 - var36;
                        }

                        l.a(this.iS, var23, var26, var36 * var29 + var24, var17, var16, var36 + var32, var38, var27 * var36 + var18, this.iw[var6], var20, var36 * var28 + var21);
                        var32 += var31;
                        var24 += var25;
                        var18 += var19;
                        var21 += var22;
                     }
                  }

                  return;
               }

               if (this.iF[var6]) {
                  for(var34 = this.iW; this.iX > var34; var34 += var33) {
                     var35 = this.jb[var34];
                     var36 = var35.jk >> 8;
                     var37 = var35.jj >> 8;
                     var38 = var37 - var36;
                     if (var38 <= 0) {
                        var24 += var25;
                        var18 += var19;
                        var21 += var22;
                        var32 += var31;
                     } else {
                        var16 = var35.ji;
                        var17 = (var35.jl - var16) / var38;
                        if (var36 < -this.iO) {
                           var16 += var17 * (-this.iO - var36);
                           var36 = -this.iO;
                           var38 = var37 - var36;
                        }

                        if (var37 > this.iO) {
                           var37 = this.iO;
                           var38 = var37 - var36;
                        }

                        l.a(var38, var29 * var36 + var24, var20, var26, var17, this.iw[var6], this.iS, var36 + var32, var36 * var27 + var18, var23, var16, var28 * var36 + var21);
                        var24 += var25;
                        var21 += var22;
                        var32 += var31;
                        var18 += var19;
                     }
                  }

                  return;
               }

               for(var34 = this.iW; this.iX > var34; var34 += var33) {
                  var35 = this.jb[var34];
                  var36 = var35.jk >> 8;
                  var37 = var35.jj >> 8;
                  var38 = var37 - var36;
                  if (var38 > 0) {
                     var16 = var35.ji;
                     var17 = (var35.jl - var16) / var38;
                     if (-this.iO > var36) {
                        var16 += (-this.iO - var36) * var17;
                        var36 = -this.iO;
                        var38 = var37 - var36;
                     }

                     if (this.iO < var37) {
                        var37 = this.iO;
                        var38 = var37 - var36;
                     }

                     l.b(this.iw[var6], this.iS, var24 + var36 * var29, var36 * var28 + var21, var18 + var27 * var36, var16, var17, var23, var32 + var36, var26, var20, var38);
                     var32 += var31;
                     var21 += var22;
                     var18 += var19;
                     var24 += var25;
                  } else {
                     var32 += var31;
                     var24 += var25;
                     var21 += var22;
                     var18 += var19;
                  }
               }
            }
         } else {
            var7 = 0;

            while(true) {
               this.getClass();
               if (var7 >= 50) {
                  break;
               }

               if (this.iv[var7] == var6) {
                  this.jh = this.it[var7];
                  break;
               }

               this.getClass();
               if (var7 == 50 - 1) {
                  double var10000 = Math.random();
                  this.getClass();
                  var8 = (int)(var10000 * 50.0D);
                  this.iv[var8] = var6;
                  var6 = -1 - var6;
                  var9 = (var6 >> 10 & 31) * 8;
                  var10 = (var6 >> 5 & 31) * 8;
                  var11 = (var6 & 31) * 8;

                  for(var12 = 0; var12 < 256; ++var12) {
                     var13 = var12 * var12;
                     var14 = var9 * var13 / 65536;
                     var15 = var10 * var13 / 65536;
                     var16 = var11 * var13 / 65536;
                     this.it[var8][255 - var12] = var16 + (var15 << 8) + (var14 << 16);
                  }

                  this.jh = this.it[var8];
               }

               ++var7;
            }

            var7 = this.iT;
            var8 = this.iW * var7 + this.iV;
            byte var39 = 1;
            if (this.ja) {
               if ((this.iW & 1) == 1) {
                  ++this.iW;
                  var8 += var7;
               }

               var7 <<= 1;
               var39 = 2;
            }

            for(var10 = this.iW; var10 < this.iX; var10 += var39) {
               j var40 = this.jb[var10];
               var12 = var40.jk >> 8;
               var13 = var40.jj >> 8;
               var14 = var13 - var12;
               if (var14 > 0) {
                  var15 = var40.ji;
                  var16 = (var40.jl - var15) / var14;
                  if (var12 < -this.iO) {
                     var15 += (-this.iO - var12) * var16;
                     var12 = -this.iO;
                     var14 = var13 - var12;
                  }

                  if (this.iO < var13) {
                     var13 = this.iO;
                     var14 = var13 - var12;
                  }

                  if (var4.gy) {
                     l.c(this.jh, var15, var16, this.iS, var12 + var8, -var14);
                  } else if (this.iu) {
                     l.a(this.jh, var16, var15, this.iS, var12 + var8, -var14);
                  } else {
                     l.b(this.jh, var16, var15, this.iS, var8 + var12, -var14);
                  }
               }

               var8 += var7;
            }
         }

      }
   }

   public final void b(h var1) {
      if (var1 == null) {
         System.out.println("Warning tried to add null object!");
      }

      if (this.jg < this.jf) {
         this.je[this.jg++] = var1;
      }

   }

   public final h[] bt() {
      return this.ip;
   }

   public final int bu() {
      return this.iQ;
   }

   public final void W(int var1) {
      if (var1 >= 0) {
         this.iE[var1] = (long)(hY++);
         if (this.iw[var1] == null) {
            int var2 = this.iB[var1];
            if (null == this.iw[var1]) {
               this.iw[var1] = new int[var2 == 0 ? 16384 : 65536];
               this.T(var1);
               return;
            }

            long var3 = 1073741824L;
            int var5 = 0;

            for(int var6 = 0; this.iA > var6; ++var6) {
               if (var1 != var6 && this.iB[var6] == var2 && this.iw[var6] != null && this.iE[var6] < var3) {
                  var3 = this.iE[var6];
                  var5 = var6;
               }
            }

            this.iw[var1] = this.iw[var5];
            this.iw[var5] = null;
            this.T(var1);
         }
      }

   }

   private final void X(int var1) {
      g var2 = this.jc[var1];
      h var3 = var2.gl;
      int var4 = var2.gg;
      int[] var5 = var3.gw[var4];
      byte var6 = 0;
      byte var7 = 0;
      byte var8 = 1;
      int var9 = var3.gS[var5[0]];
      int var10 = var3.gT[var5[0]];
      int var11 = var3.gU[var5[0]];
      var3.gC[var4] = 1;
      var3.gB[var4] = 0;
      var2.gj = var7;
      var2.go = var6;
      var2.gi = var8;
      var2.gp = var11 * var8 + var9 * var6 + var10 * var7;
      int var12 = var3.gU[var5[0]];
      int var13 = var12;
      int var14 = var3.gM[var5[0]];
      int var15 = var14;
      if (var3.gM[var5[1]] >= var14) {
         var15 = var3.gM[var5[1]];
      } else {
         var14 = var3.gM[var5[1]];
      }

      int var16 = var3.gL[var5[1]];
      int var17 = var3.gL[var5[0]];
      int var18 = var3.gU[var5[1]];
      if (var18 <= var12) {
         if (var12 > var18) {
            var12 = var18;
         }
      } else {
         var13 = var18;
      }

      var18 = var3.gM[var5[1]];
      if (var15 >= var18) {
         if (var14 > var18) {
            var14 = var18;
         }
      } else {
         var15 = var18;
      }

      var18 = var3.gL[var5[1]];
      var2.gk = var15 + 20;
      var2.gd = var14 - 20;
      if (var17 < var18) {
         var17 = var18;
      } else if (var18 < var16) {
         var16 = var18;
      }

      var2.gn = var13;
      var2.gr = var12;
      var2.gh = var17;
      var2.gf = var16;
   }

   public final void Y(int var1) {
      if (null != this.iw[var1]) {
         int[] var2 = this.iw[var1];

         int var3;
         int var4;
         for(int var5 = 0; var5 < 64; ++var5) {
            var3 = 4032 + var5;
            var4 = var2[var3];

            for(int var6 = 0; var6 < 63; ++var6) {
               var2[var3] = var2[var3 - 64];
               var3 -= 64;
            }

            this.iw[var1][var3] = var4;
         }

         short var7 = 4096;

         for(var3 = 0; var3 < var7; ++var3) {
            var4 = var2[var3];
            var2[var7 + var3] = var4 - (var4 >>> 3) & 16316671;
            var2[var7 * 2 + var3] = var4 - (var4 >>> 2) & 16316671;
            var2[var7 * 3 + var3] = var4 - (var4 >>> 2) - (var4 >>> 3) & 16316671;
         }
      }

   }

   public final int a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.iH[this.iG] = var1;
      this.iL[this.iG] = var3;
      this.iM[this.iG] = var7;
      this.iN[this.iG] = var4;
      this.iI[this.iG] = var5;
      this.iJ[this.iG] = var6;
      this.iK[this.iG] = 0;
      int var8 = this.iz.d(var3, var7, var4);
      int var9 = this.iz.d(var3, var7 - var6, var4);
      int[] var10 = new int[]{var8, var9};
      this.iz.a(2, var10, 0, 0);
      this.iz.gz[this.iG] = var2;
      this.iz.gJ[this.iG++] = 0;
      return this.iG - 1;
   }

   public final void bv() {
      hU = 0;
      hS = 0;
      hW = 0;
      hX = 0;
      hT = 0;
      hV = 0;
      this.ja = this.fW.ja;
      int var1 = this.iO * this.in >> this.il;
      int var2 = this.iP * this.in >> this.il;
      this.k(this.in, -var1, -var2);
      this.k(this.in, -var1, var2);
      this.k(this.in, var1, -var2);
      this.k(this.in, var1, var2);
      this.k(0, -this.iO, -this.iP);
      this.k(0, -this.iO, this.iP);
      this.k(0, this.iO, -this.iP);
      this.k(0, this.iO, this.iP);
      hV += this.if;
      hT += this.if;
      hU += this.ig;
      hS += this.ig;
      hW += this.ih;
      hX += this.ih;
      this.je[this.jg] = this.iz;
      this.iz.gI = 2;

      int var3;
      h var10000;
      int var10001;
      int var10002;
      int var10003;
      int var10004;
      int var10005;
      int var10006;
      int var10007;
      for(var3 = 0; this.jg > var3; ++var3) {
         var10000 = this.je[var3];
         var10001 = this.if;
         var10002 = this.ig;
         var10003 = this.ih;
         var10004 = this.ii;
         var10005 = this.ij;
         var10006 = this.ik;
         var10007 = this.il;
         this.getClass();
         var10000.a(var10001, var10002, var10003, var10004, var10005, var10006, var10007, 5);
      }

      var10000 = this.je[this.jg];
      var10001 = this.if;
      var10002 = this.ig;
      var10003 = this.ih;
      var10004 = this.ii;
      var10005 = this.ij;
      var10006 = this.ik;
      var10007 = this.il;
      this.getClass();
      var10000.a(var10001, var10002, var10003, var10004, var10005, var10006, var10007, 5);
      this.jd = 0;

      int var6;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      for(var3 = 0; var3 < this.jg; ++var3) {
         h var4 = this.je[var3];
         if (var4.gG) {
            for(int var5 = 0; var5 < var4.gu; ++var5) {
               var6 = var4.gv[var5];
               int[] var7 = var4.gw[var5];
               boolean var8 = false;

               for(var9 = 0; var6 > var9; ++var9) {
                  var10 = var4.gU[var7[var9]];
                  this.getClass();
                  if (5 < var10 && this.in > var10) {
                     var8 = true;
                     break;
                  }
               }

               if (var8) {
                  var9 = 0;

                  for(var10 = 0; var10 < var6; ++var10) {
                     var11 = var7[var10];
                     var12 = var4.gM[var11];
                     if (-this.iO < var12) {
                        var9 |= 1;
                     }

                     if (this.iO > var12) {
                        var9 |= 2;
                     }

                     if (var9 == 3) {
                        break;
                     }
                  }

                  if (var9 == 3) {
                     var10 = 0;

                     for(var11 = 0; var6 > var11; ++var11) {
                        var12 = var7[var11];
                        var13 = var4.gL[var12];
                        if (-this.iP < var13) {
                           var10 |= 1;
                        }

                        if (this.iP > var13) {
                           var10 |= 2;
                        }

                        if (var10 == 3) {
                           break;
                        }
                     }

                     if (var10 == 3) {
                        g var27 = this.jc[this.jd];
                        var27.gl = var4;
                        var27.gg = var5;
                        this.U(this.jd);
                        if (var27.gp < 0) {
                           var12 = var4.gE[var5];
                        } else {
                           var12 = var4.gD[var5];
                        }

                        if (var12 != 12345678) {
                           var13 = 0;

                           for(var14 = 0; var6 > var14; ++var14) {
                              var15 = var7[var14];
                              var13 += var4.gU[var15];
                           }

                           var27.gq = var4.gq + var13 / var6;
                           var27.gb = var12;
                           ++this.jd;
                        }
                     }
                  }
               }
            }
         }
      }

      h var19 = this.iz;
      int var20;
      int var24;
      int var25;
      if (var19.gG) {
         for(var20 = 0; var19.gu > var20; ++var20) {
            int[] var21 = var19.gw[var20];
            var6 = var21[0];
            var24 = var19.gM[var6];
            var25 = var19.gL[var6];
            var9 = var19.gU[var6];
            this.getClass();
            if (5 < var9 && var9 < this.in) {
               var10 = (this.iI[var20] << this.il) / var9;
               var11 = (this.iJ[var20] << this.il) / var9;
               if (this.iO >= var24 - var10 / 2 && -this.iO <= var24 + var10 / 2 && var25 - var11 <= this.iP && var25 >= -this.iP) {
                  g var29 = this.jc[this.jd];
                  var29.gg = var20;
                  var29.gl = var19;
                  this.X(this.jd);
                  var29.gq = (var19.gU[var21[1]] + var9) / 2;
                  ++this.jd;
               }
            }
         }
      }

      if (this.jd != 0) {
         this.a(this.jc, 0, this.jd - 1);
         this.a(this.jd, 100, this.jc);

         for(var20 = 0; this.jd > var20; ++var20) {
            g var22 = this.jc[var20];
            h var23 = var22.gl;
            var24 = var22.gg;
            int var16;
            int var17;
            if (var23 == this.iz) {
               int[] var26 = var23.gw[var24];
               var9 = var26[0];
               var10 = var23.gM[var9];
               var11 = var23.gL[var9];
               var12 = var23.gU[var9];
               var13 = (this.iI[var24] << this.il) / var12;
               var14 = (this.iJ[var24] << this.il) / var12;
               var15 = var23.gM[var26[1]] - var10;
               var16 = var10 - var13 / 2;
               var17 = this.iU - (var14 - var11);
               this.fW.c(this.iH[var24], var16 + this.iV, var17, var13, var14, (256 << this.il) / var12, var15);
               if (this.iR && this.io > this.iQ) {
                  var16 += (this.iK[var24] << this.il) / var12;
                  if (var17 <= this.B && var17 + var14 >= this.B && var16 <= this.A && this.A <= var16 + var13 && !var23.gF && var23.gJ[var24] == 0) {
                     this.ip[this.iQ] = var23;
                     this.iq[this.iQ] = var24;
                     ++this.iQ;
                  }
               }
            } else {
               var25 = 0;
               var9 = 0;
               var10 = var23.gv[var24];
               if (var23.gt[var24] != 12345678) {
                  if (var22.gp < 0) {
                     var9 = var23.gA - var23.gt[var24];
                  } else {
                     var9 = var23.gA + var23.gt[var24];
                  }
               }

               int[] var28 = var23.gw[var24];

               int[] var31;
               for(var12 = 0; var10 > var12; ++var12) {
                  var13 = var28[var12];
                  this.hZ[var12] = var23.gS[var13];
                  this.ib[var12] = var23.gT[var13];
                  this.ia[var12] = var23.gU[var13];
                  if (var23.gt[var24] == 12345678) {
                     if (var22.gp < 0) {
                        var9 = var23.gA + var23.gN[var13] - var23.gK[var13];
                     } else {
                        var9 = var23.gA + var23.gN[var13] + var23.gK[var13];
                     }
                  }

                  int var30 = var23.gU[var13];
                  this.getClass();
                  if (var30 >= 5) {
                     this.id[var25] = var23.gM[var13];
                     this.ic[var25] = var23.gL[var13];
                     this.ie[var25] = var9;
                     if (var23.gU[var13] > this.ix) {
                        var31 = this.ie;
                        var31[var25] += (var23.gU[var13] - this.ix) / this.iy;
                     }

                     ++var25;
                  } else {
                     if (var12 != 0) {
                        var14 = var28[var12 - 1];
                     } else {
                        var14 = var28[var10 - 1];
                     }

                     var30 = var23.gU[var14];
                     this.getClass();
                     if (var30 >= 5) {
                        var15 = var23.gU[var13] - var23.gU[var14];
                        var30 = var23.gT[var13];
                        var10001 = var23.gU[var13];
                        this.getClass();
                        var16 = var30 - (var10001 - 5) * (var23.gT[var13] - var23.gT[var14]) / var15;
                        var30 = var23.gS[var13];
                        var10001 = var23.gS[var13] - var23.gS[var14];
                        var10002 = var23.gU[var13];
                        this.getClass();
                        var17 = var30 - var10001 * (var10002 - 5) / var15;
                        var31 = this.id;
                        var10002 = var17 << this.il;
                        this.getClass();
                        var31[var25] = var10002 / 5;
                        var31 = this.ic;
                        var10002 = var16 << this.il;
                        this.getClass();
                        var31[var25] = var10002 / 5;
                        this.ie[var25] = var9;
                        ++var25;
                     }

                     if (var10 - 1 == var12) {
                        var15 = var28[0];
                     } else {
                        var15 = var28[var12 + 1];
                     }

                     var30 = var23.gU[var15];
                     this.getClass();
                     if (var30 >= 5) {
                        var16 = var23.gU[var13] - var23.gU[var15];
                        var30 = var23.gT[var13];
                        var10001 = var23.gU[var13];
                        this.getClass();
                        var17 = var30 - (var10001 - 5) * (var23.gT[var13] - var23.gT[var15]) / var16;
                        var30 = var23.gS[var13];
                        var10001 = var23.gS[var13] - var23.gS[var15];
                        var10002 = var23.gU[var13];
                        this.getClass();
                        int var18 = var30 - var10001 * (var10002 - 5) / var16;
                        var31 = this.id;
                        var10002 = var18 << this.il;
                        this.getClass();
                        var31[var25] = var10002 / 5;
                        var31 = this.ic;
                        var10002 = var17 << this.il;
                        this.getClass();
                        var31[var25] = var10002 / 5;
                        this.ie[var25] = var9;
                        ++var25;
                     }
                  }
               }

               for(var12 = 0; var12 < var10; ++var12) {
                  if (0 <= this.ie[var12]) {
                     if (this.ie[var12] > 255) {
                        this.ie[var12] = 255;
                     }
                  } else {
                     this.ie[var12] = 0;
                  }

                  if (var22.gb >= 0) {
                     if (this.iB[var22.gb] != 1) {
                        var31 = this.ie;
                        var31[var12] <<= 6;
                     } else {
                        var31 = this.ie;
                        var31[var12] <<= 9;
                     }
                  }
               }

               this.a(var25, this.id, this.ic, this.ie, var23, var24);
               if (this.iW < this.iX) {
                  this.a(this.hZ, this.ib, this.ia, var23, var10, var22.gb);
               }
            }
         }

         this.iR = false;
      }

   }

   public final void a(int var1, int var2, byte[] var3, int[] var4) {
      this.iD[var1] = var3;
      this.iC[var1] = var4;
      this.iB[var1] = var2;
      this.iE[var1] = 0L;
      this.iF[var1] = false;
      this.iw[var1] = null;
      this.W(var1);
   }

   public final void Z(int var1) {
      this.iG -= var1;
      this.iz.h(var1, var1 * 2);
      if (this.iG < 0) {
         this.iG = 0;
      }

   }

   final void bw() {
      this.iG = 0;
      this.iz.bq();

      for(int var1 = 0; this.jg > var1; ++var1) {
         this.je[var1] = null;
      }

      this.jg = 0;
   }

   public final void c(h var1) {
      for(int var2 = 0; var2 < this.jg; ++var2) {
         if (this.je[var2] == var1) {
            --this.jg;

            for(int var3 = var2; var3 < this.jg; ++var3) {
               this.je[var3] = this.je[var3 + 1];
            }
         }
      }

   }

   public final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var6 &= 1023;
      var4 &= 1023;
      var5 &= 1023;
      this.ik = 1023 & 1024 - var6;
      this.ii = 1023 & 1024 - var4;
      this.ij = 1023 & 1024 - var5;
      int var8 = 0;
      int var9 = 0;
      int var10 = var7;
      int var11;
      int var12;
      int var13;
      if (var4 != 0) {
         var12 = hQ[var4];
         var13 = hR[var4];
         var11 = var13 * var9 - var12 * var7 >> 15;
         var10 = var12 * var9 + var7 * var13 >> 15;
         var9 = var11;
      }

      if (var5 != 0) {
         var12 = hQ[var5];
         var13 = hR[var5];
         var11 = var8 * var13 + var10 * var12 >> 15;
         var10 = var13 * var10 - var12 * var8 >> 15;
         var8 = var11;
      }

      if (var6 != 0) {
         var12 = hR[var6];
         var13 = hQ[var6];
         var11 = var8 * var12 + var13 * var9 >> 15;
         var9 = var9 * var12 - var13 * var8 >> 15;
         var8 = var11;
      }

      this.ih = var3 - var10;
      this.ig = var2 - var9;
      this.if = var1 - var8;
   }

   public final void k(int var1, int var2) {
      this.iK[var1] = var2;
   }

   public final void l(int var1, int var2, int var3) {
      if (var3 == 0 && var2 == 0 && var1 == 0) {
         var3 = 32;
      }

      for(int var4 = 0; var4 < this.jg; ++var4) {
         this.je[var4].g(var3, var2, var1);
      }

   }

   public final void aa(int var1) {
      this.iz.gJ[var1] = 1;
   }

   public final void d(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.il = var6;
      this.iT = var3;
      this.iV = var2;
      this.iU = var5;
      this.jb = new j[var4 + var5];
      this.iO = var1;
      this.iP = var4;

      for(int var7 = 0; var7 < var5 + var4; ++var7) {
         this.jb[var7] = new j();
      }

      this.iS = this.fW.jp;
   }

   public final void m(int var1, int var2, int var3) {
      this.iR = true;
      this.A = var2 - this.iV;
      this.B = var3;
      this.iQ = var1;
   }

   static {
      int var0;
      for(var0 = 0; var0 < 256; ++var0) {
         hO[var0] = (int)(Math.sin(0.02454369D * (double)var0) * 32768.0D);
         hP[var0] = (int)(Math.cos((double)var0 * 0.02454369D) * 32768.0D);
      }

      for(var0 = 0; var0 < 1024; ++var0) {
         hQ[var0] = (int)(Math.sin((double)var0 * 0.00613592315D) * 32768.0D);
         hR[var0] = (int)(Math.cos((double)var0 * 0.00613592315D) * 32768.0D);
      }

   }
}
