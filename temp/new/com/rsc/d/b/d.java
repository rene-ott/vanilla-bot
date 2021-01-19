package com.rsc.d.b;

import com.rsc.c.k;
import com.rsc.e.h;
import com.rsc.g.l;

public class d {
   private final com.rsc.d a;
   private final k M;
   private final com.rsc.c.b ly;
   public final int[] lz = new int[14];
   public final int[] lA = new int[14];
   public final int[] lB = new int[14];
   public final int[] lC = new int[14];
   public final int[] lD = new int[14];
   public final int[] lE = new int[14];
   public final int[] lF = new int[14];
   public final int[] lG = new int[14];
   private int lH;
   private int lI;
   public boolean lJ = false;
   public boolean lK = false;
   public int lL = 0;
   public int lM;
   public int lN = 0;
   public boolean lO = false;
   public int lP = 0;
   public String lQ;
   public int lR = 0;
   public String lS = "";
   public boolean lT;
   public boolean lU;
   public boolean lV;

   public d(com.rsc.d var1) {
      this.a = var1;
      this.M = var1.dC();
      this.ly = new com.rsc.c.b(this.M, 1, "");
   }

   public void bv() {
      if (this.lT) {
         this.bT();
      } else if (this.lU) {
         this.bU();
      }

   }

   private void bT() {
      int var1 = -1;
      if (this.a.t() != 0 && this.lV) {
         var1 = this.ly.a(this.a.u(), this.a.w(), this.lH, this.lI);
      }

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (var1 < 0) {
         if (this.a.cF() == com.rsc.b.b.cv) {
            if (this.a.t() == 1 && this.a.v() == 0) {
               this.a.f(1);
            }

            int var2 = this.a.u() - 22;
            var3 = this.a.w() - 36;
            if (var2 >= 0 && var3 >= 0 && var2 < 468 && var3 < 262) {
               var4 = (var3 - 31) / 34 * 5 + (var2 - 217) / 49;
               var5 = (var3 - 31) / 34 * 4 + (var2 - 9) / 49;
               if (this.a.v() > 0) {
                  if (var2 > 216 && var3 > 30 && var2 < 462 && var3 < 235 && var4 >= 0 && var4 < this.a.dH()) {
                     this.A(-1, var4);
                  }

                  if (var2 > 8 && var3 > 30 && var2 < 205 && var3 < 133 && var5 >= 0 && this.lN > var5) {
                     this.B(-1, var5);
                  }

                  if (var2 >= 217 && var3 >= 238 && var2 <= 286 && var3 <= 259) {
                     this.lJ = true;
                     this.a.n().aO(55);
                     this.a.n().dX();
                  }

                  if (var2 >= 394 && var3 >= 238 && var2 < 463 && var3 < 259) {
                     this.lT = false;
                     this.a.n().aO(230);
                     this.a.n().dX();
                  }

                  this.a.f(0);
                  this.a.e(0);
               }

               if (this.a.t() == 2) {
                  if (var2 > 216 && var3 > 30 && var2 < 462 && var3 < 235) {
                     var6 = this.a.os.au();
                     var7 = this.a.os.av();
                     this.a.ou = this.a.w() - 7;
                     this.a.ot = this.a.u() - var6 / 2;
                     this.a.oB = true;
                     if (this.a.ou < 0) {
                        this.a.ou = 0;
                     }

                     if (this.a.ot < 0) {
                        this.a.ot = 0;
                     }

                     if (this.a.ot + var6 > 510) {
                        this.a.ot = 510 - var6;
                     }

                     if (var7 + this.a.ou > 315) {
                        this.a.ou = 315 - var7;
                     }

                     if (var4 >= 0 && this.a.dH() > var4) {
                        var8 = this.a.nm[var4];
                        this.lV = true;
                        this.ly.E(0);
                        this.ly.a(com.rsc.c.d.eI, "Offer 1", "@lre@" + com.rsc.a.a.l(var8).ad(), var8, 1);
                        this.ly.a(com.rsc.c.d.eI, "Offer 5", "@lre@" + com.rsc.a.a.l(var8).ad(), var8, 5);
                        this.ly.a(com.rsc.c.d.eI, "Offer 10", "@lre@" + com.rsc.a.a.l(var8).ad(), var8, 10);
                        this.ly.a(com.rsc.c.d.eI, "Offer All", "@lre@" + com.rsc.a.a.l(var8).ad(), var8, -1);
                        this.ly.a(com.rsc.c.d.eI, "Offer X", "@lre@" + com.rsc.a.a.l(var8).ad(), var8, -2);
                        int var9 = this.ly.au();
                        int var10 = this.ly.av();
                        this.lH = this.a.u() - var9 / 2;
                        this.lI = this.a.w() - 7;
                        if (this.lH < 0) {
                           this.lH = 0;
                        }

                        if (this.lI < 0) {
                           this.lI = 0;
                        }

                        if (var10 + this.lI > 315) {
                           this.lI = 315 - var10;
                        }

                        if (this.lH + var9 > 510) {
                           this.lH = 510 - var9;
                        }
                     }
                  }

                  if (var2 > 8 && var3 > 30 && var2 < 205 && var3 < 133 && var5 >= 0 && var5 < this.lN) {
                     var6 = this.lB[var5];
                     this.lV = true;
                     this.ly.E(0);
                     this.ly.a(com.rsc.c.d.eJ, "Remove 1", "@lre@" + com.rsc.a.a.l(var6).ad(), var6, 1);
                     this.ly.a(com.rsc.c.d.eJ, "Remove 5", "@lre@" + com.rsc.a.a.l(var6).ad(), var6, 5);
                     this.ly.a(com.rsc.c.d.eJ, "Remove 10", "@lre@" + com.rsc.a.a.l(var6).ad(), var6, 10);
                     this.ly.a(com.rsc.c.d.eJ, "Remove All", "@lre@" + com.rsc.a.a.l(var6).ad(), var6, -1);
                     this.ly.a(com.rsc.c.d.eJ, "Remove X", "@lre@" + com.rsc.a.a.l(var6).ad(), var6, -2);
                     var7 = this.ly.au();
                     var8 = this.ly.av();
                     this.lH = this.a.u() - var7 / 2;
                     this.lI = this.a.w() - 7;
                     if (this.lH < 0) {
                        this.lH = 0;
                     }

                     if (this.lI < 0) {
                        this.lI = 0;
                     }

                     if (var8 + this.lI > 315) {
                        this.lI = 315 - var8;
                     }

                     if (var7 + this.lH > 510) {
                        this.lH = 510 - var7;
                     }
                  }

                  this.a.e(0);
               }

               if (this.lV) {
                  var6 = this.ly.au();
                  var7 = this.ly.av();
                  if (this.a.u() < this.lH - 10 || this.lI - 10 > this.a.w() || this.a.u() > this.lH - (-var6 - 10) || this.lI - (-var7 - 10) < this.a.w()) {
                     this.lV = false;
                  }
               }
            } else if (this.a.t() != 0) {
               this.lT = false;
               this.a.n().aO(230);
               this.a.n().dX();
            }
         }
      } else {
         this.lV = false;
         this.a.e(0);
         com.rsc.c.d var11 = this.ly.v(var1);
         var3 = this.ly.B(var1);
         var4 = -1;
         var5 = 0;
         if (var11 == com.rsc.c.d.eI) {
            for(var6 = 0; var6 < this.a.dH(); ++var6) {
               if (this.a.nm[var6] == var3) {
                  if (var4 < 0) {
                     var4 = var6;
                  }

                  if (com.rsc.a.a.l(var3).aA()) {
                     var5 = this.a.nn[var6];
                     break;
                  }

                  ++var5;
               }
            }
         } else {
            for(var6 = 0; var6 < this.lN; ++var6) {
               if (var3 == this.lB[var6]) {
                  if (var4 < 0) {
                     var4 = var6;
                  }

                  if (com.rsc.a.a.l(var3).aA()) {
                     var5 = this.lC[var6];
                     break;
                  }

                  ++var5;
               }
            }
         }

         if (var4 >= 0) {
            var6 = this.ly.y(var1);
            if (var6 == -2) {
               this.lM = var4;
               if (var11 == com.rsc.c.d.eI) {
                  this.a.a(new String[]{"Enter number of items to offer and press enter"}, com.rsc.b.b.cw, true);
               } else {
                  this.a.a(new String[]{"Enter number of items to remove and press enter"}, com.rsc.b.b.cx, true);
               }
            } else {
               if (var6 == -1) {
                  var6 = var5;
               }

               if (var11 != com.rsc.c.d.eI) {
                  this.B(var6, var4);
               } else {
                  this.A(var6, var4);
               }
            }
         }
      }

      if (this.lT) {
         byte var12 = 22;
         byte var13 = 36;
         this.M.e(var12, var13, 468, 12, 192);
         var4 = 10000536;
         this.M.g(var12, var13 + 12, 468, 18, var4, 160);
         this.M.g(var12, var13 + 30, 8, 248, var4, 160);
         this.M.g(var12 + 205, var13 + 30, 11, 248, var4, 160);
         this.M.g(var12 + 462, 30 + var13, 6, 248, var4, 160);
         this.M.g(var12 + 8, var13 + 133, 197, 22, var4, 160);
         this.M.g(var12 + 8, var13 + 258, 197, 20, var4, 160);
         this.M.g(var12 + 216, var13 + 235, 246, 43, var4, 160);
         var5 = 13684944;
         this.M.g(var12 + 8, var13 + 30, 197, 103, var5, 160);
         this.M.g(8 + var12, var13 + 155, 197, 103, var5, 160);
         this.M.g(216 + var12, 30 + var13, 246, 205, var5, 160);

         for(var6 = 0; var6 < 4; ++var6) {
            this.M.m(8 + var12, 30 + var13 + var6 * 34, 197, 0);
         }

         for(var6 = 0; var6 < 4; ++var6) {
            this.M.m(var12 + 8, var6 * 34 + 155 + var13, 197, 0);
         }

         for(var6 = 0; var6 < 7; ++var6) {
            this.M.m(216 + var12, var13 + 30 + var6 * 34, 246, 0);
         }

         for(var6 = 0; var6 < 6; ++var6) {
            if (~var6 > -6) {
               this.M.n(var12 + 8 + var6 * 49, 30 + var13, 0, 103);
            }

            if (var6 < 5) {
               this.M.n(var6 * 49 + 8 + var12, 155 + var13, 0, 103);
            }

            this.M.n(216 + var12 + var6 * 49, var13 + 30, 0, 205);
         }

         this.M.a((String)("Trading with: " + this.lS), var12 + 1, 10 + var13, 16777215, 1);
         this.M.a((String)"Your Offer", var12 + 9, var13 + 27, 16777215, 4);
         this.M.a((String)"Opponent's Offer", var12 + 9, var13 + 152, 16777215, 4);
         this.M.a((String)"Your Inventory", var12 + 216, var13 + 27, 16777215, 4);
         if (!this.lJ) {
            this.M.a(this.M.ae(23), var12 + 217, var13 + 238);
         }

         this.M.a(this.M.ae(24), var12 + 394, var13 + 238);
         if (this.lO) {
            this.M.c(var12 + 341, 246 + var13, "Other player", 16777215, 1, -1);
            this.M.c(var12 + 341, 256 + var13, "has accepted", 16777215, 1, -1);
         }

         if (this.lJ) {
            this.M.c(var12 + 217 + 35, var13 + 246, "Waiting for", 16777215, 1, -1);
            this.M.c(var12 + 252, 256 + var13, "other player", 16777215, 1, -1);
         }

         for(var6 = 0; var6 < this.a.dH(); ++var6) {
            var7 = var12 + 217 + var6 % 5 * 49;
            var8 = 31 + var13 + var6 / 5 * 34;
            this.M.a(this.M.ad(this.a.nm[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.a.nm[var6]).aB(), 0, 0, 255, false, 0, 1);
            if (com.rsc.a.a.l(this.a.nm[var6]).aA()) {
               this.M.a((String)("" + this.a.nn[var6]), 1 + var7, 10 + var8, 16776960, 1);
            }
         }

         for(var6 = 0; this.lN > var6; ++var6) {
            var7 = var6 % 4 * 49 + 9 + var12;
            var8 = var6 / 4 * 34 + var13 + 31;
            this.M.a(this.M.ad(this.lB[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.lB[var6]).aB(), 0, 0, 255, false, 0, 1);
            if (com.rsc.a.a.l(this.lB[var6]).aA()) {
               this.M.a((String)("" + this.lC[var6]), var7 + 1, 10 + var8, 16776960, 1);
            }

            if (var7 < this.a.u() && 48 + var7 > this.a.u() && var8 < this.a.w() && this.a.w() < var8 + 32) {
               this.M.a((String)(com.rsc.a.a.l(this.lB[var6]).ad() + ": @whi@" + com.rsc.a.a.l(this.lB[var6]).ar()), 8 + var12, 273 + var13, 16776960, 1);
            }
         }

         for(var6 = 0; this.lR > var6; ++var6) {
            var7 = var12 + 9 + var6 % 4 * 49;
            var8 = var13 + 156 + var6 / 4 * 34;
            this.M.a(this.M.ad(this.lF[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.lF[var6]).aB(), 0, 0, 255, false, 0, 1);
            if (com.rsc.a.a.l(this.lF[var6]).aA()) {
               this.M.a((String)("" + this.lG[var6]), var7 + 1, 10 + var8, 16776960, 1);
            }

            if (var7 < this.a.u() && this.a.u() < var7 + 48 && this.a.w() > var8 && var8 + 32 > this.a.w()) {
               this.M.a((String)(com.rsc.a.a.l(this.lF[var6]).ad() + ": @whi@" + com.rsc.a.a.l(this.lF[var6]).ar()), var12 + 8, var13 + 273, 16776960, 1);
            }
         }

         if (this.lV) {
            this.ly.b(this.lI, this.lH, this.a.w(), this.a.u());
         }
      }

   }

   private void bU() {
      byte var1 = 22;
      byte var2 = 36;
      this.M.e(var1, var2, 468, 16, 192);
      int var3 = 10000536;
      this.M.g(var1, var2 + 16, 468, 246, var3, 160);
      this.M.c(234 + var1, var2 + 12, "Please confirm your trade with @yel@" + this.lQ, 16777215, 1, -1);
      this.M.c(var1 + 117, 30 + var2, "You are about to give:", 16776960, 1, -1);

      int var4;
      String var5;
      for(var4 = 0; this.lL > var4; ++var4) {
         var5 = com.rsc.a.a.l(this.lz[var4]).ad();
         if (com.rsc.a.a.l(this.lz[var4]).aA()) {
            var5 = var5 + " x " + l.aR(this.lA[var4]);
         }

         this.M.c(var1 + 117, var4 * 12 + 42 + var2, var5, 16777215, 1, -1);
      }

      if (this.lL == 0) {
         this.M.c(var1 + 117, 42 + var2, "Nothing!", 16777215, 1, -1);
      }

      this.M.c(351 + var1, 30 + var2, "In return you will receive:", 16776960, 1, -1);

      for(var4 = 0; var4 < this.lP; ++var4) {
         var5 = com.rsc.a.a.l(this.lE[var4]).ad();
         if (com.rsc.a.a.l(this.lE[var4]).aA()) {
            var5 = var5 + " x " + l.aR(this.lD[var4]);
         }

         this.M.c(351 + var1, 42 + var2 + var4 * 12, var5, 16777215, 1, -1);
      }

      if (this.lP == 0) {
         this.M.c(351 + var1, var2 + 42, "Nothing!", 16777215, 1, -1);
      }

      this.M.c(var1 + 234, 200 + var2, "Are you sure you want to do this?", 65535, 4, -1);
      this.M.c(var1 + 234, var2 + 215, "There is NO WAY to reverse a trade if you change your mind.", 16777215, 1, -1);
      this.M.c(234 + var1, var2 + 230, "Remember that not all players are trustworthy", 16777215, 1, -1);
      if (this.lK) {
         this.M.c(234 + var1, 250 + var2, "Waiting for other player...", 16776960, 1, -1);
      } else {
         this.M.a(this.M.ae(23), var1 - 35 + 118, 238 + var2);
         this.M.a(this.M.ae(24), var1 + 352 - 35, var2 + 238);
      }

      if (this.a.t() == 1) {
         if (this.a.u() < var1 || this.a.w() < var2 || this.a.u() > 468 + var1 || this.a.w() > var2 + 262) {
            this.lU = false;
            this.a.n().aO(230);
            this.a.n().dX();
         }

         if (this.a.u() >= var1 + 118 - 35 && this.a.u() <= var1 + 118 + 70 && this.a.w() >= var2 + 238 && this.a.w() <= 238 + var2 + 21) {
            this.lK = true;
            this.a.n().aO(104);
            this.a.n().dX();
         }

         if (352 + var1 - 35 <= this.a.u() && this.a.u() <= var1 + 423 && this.a.w() >= var2 + 238 && this.a.w() <= 238 + var2 + 21) {
            this.lU = false;
            this.a.n().aO(230);
            this.a.n().dX();
         }

         this.a.e(0);
      }

   }

   public void A(int var1, int var2) {
      boolean var3 = false;
      int var4 = 0;
      int var5 = this.a.nm[var2];

      int var6;
      int var7;
      for(var6 = 0; this.lN > var6; ++var6) {
         if (var5 == this.lB[var6]) {
            if (com.rsc.a.a.l(var5).aA()) {
               if (var1 >= 0) {
                  int[] var10000 = this.lC;
                  var10000[var6] += var1;
                  if (this.lC[var6] > this.a.nn[var2]) {
                     this.lC[var6] = this.a.nn[var2];
                  }

                  var3 = true;
               } else {
                  for(var7 = 0; var7 < this.a.v(); ++var7) {
                     var3 = true;
                     if (this.a.nn[var2] > this.lC[var6]) {
                        int var10002 = this.lC[var6]++;
                     }
                  }
               }
            } else {
               ++var4;
            }
         }
      }

      var6 = this.a.aB(var5);
      if (var6 <= var4) {
         var3 = true;
      }

      if (com.rsc.a.a.l(var5).bD) {
         var3 = true;
         this.a.a(h.mr, (String)null, (String)null, "This object cannot be traded with other players", 0);
      }

      if (!var3) {
         if (var1 < 0) {
            if (this.lN < 12) {
               this.lB[this.lN] = var5;
               this.lC[this.lN] = 1;
               var3 = true;
               ++this.lN;
            }
         } else {
            for(var7 = 0; var7 < var1 && this.lN < 12 && var6 > var4; ++var7) {
               this.lB[this.lN] = var5;
               this.lC[this.lN] = 1;
               var3 = true;
               ++var4;
               ++this.lN;
               if (var7 == 0 && com.rsc.a.a.l(var5).aA()) {
                  this.lC[this.lN - 1] = Math.min(var1, this.a.nn[var2]);
                  break;
               }
            }
         }
      }

      if (var3) {
         this.a.n().aO(46);
         this.a.n().aK(this.lN);

         for(var7 = 0; this.lN > var7; ++var7) {
            this.a.n().aL(this.lB[var7]);
            this.a.n().aN(this.lC[var7]);
         }

         this.a.n().dX();
         this.lO = false;
         this.lJ = false;
      }

   }

   public void B(int var1, int var2) {
      int var3 = this.lB[var2];
      int var4 = var1 < 0 ? this.a.v() : var1;
      int var5;
      if (!com.rsc.a.a.l(var3).aA()) {
         var5 = 0;

         for(int var6 = 0; var6 < this.lN && var5 < var4; ++var6) {
            if (var3 == this.lB[var6]) {
               ++var5;
               --this.lN;

               for(int var7 = var6; this.lN > var7; ++var7) {
                  this.lB[var7] = this.lB[var7 + 1];
                  this.lC[var7] = this.lC[var7 + 1];
               }

               --var6;
            }
         }
      } else {
         int[] var10000 = this.lC;
         var10000[var2] -= var4;
         if (this.lC[var2] <= 0) {
            --this.lN;

            for(var5 = var2; var5 < this.lN; ++var5) {
               this.lB[var5] = this.lB[1 + var5];
               this.lC[var5] = this.lC[var5 + 1];
            }
         }
      }

      this.a.n().aO(46);
      this.a.n().aK(this.lN);

      for(var5 = 0; var5 < this.lN; ++var5) {
         this.a.n().aL(this.lB[var5]);
         this.a.n().aN(this.lC[var5]);
      }

      this.a.n().dX();
      this.lJ = false;
      this.lO = false;
   }
}
