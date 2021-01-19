package com.rsc.d.b;

import com.rsc.c.k;
import com.rsc.e.h;
import com.rsc.g.l;

public class d {
   private final com.rsc.d a;
   private final k M;
   private final com.rsc.c.b ls;
   public final int[] lt = new int[14];
   public final int[] lu = new int[14];
   public final int[] lv = new int[14];
   public final int[] lw = new int[14];
   public final int[] lx = new int[14];
   public final int[] ly = new int[14];
   public final int[] lz = new int[14];
   public final int[] lA = new int[14];
   private int lB;
   private int lC;
   public boolean lD = false;
   public boolean lE = false;
   public int lF = 0;
   public int lG;
   public int lH = 0;
   public boolean lI = false;
   public int lJ = 0;
   public String lK;
   public int lL = 0;
   public String lM = "";
   public boolean lN;
   public boolean lO;
   public boolean lP;

   public d(com.rsc.d var1) {
      this.a = var1;
      this.M = var1.dB();
      this.ls = new com.rsc.c.b(this.M, 1, "");
   }

   public void bv() {
      if (this.lN) {
         this.bS();
      } else if (this.lO) {
         this.bT();
      }

   }

   private void bS() {
      int var1 = -1;
      if (this.a.t() != 0 && this.lP) {
         var1 = this.ls.a(this.a.u(), this.a.w(), this.lB, this.lC);
      }

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (var1 < 0) {
         if (this.a.cE() == com.rsc.b.b.cu) {
            if (this.a.t() == 1 && this.a.v() == 0) {
               this.a.f(1);
            }

            int var2 = this.a.u() - 22;
            var3 = this.a.w() - 36;
            if (var2 >= 0 && var3 >= 0 && var2 < 468 && var3 < 262) {
               var4 = (var3 - 31) / 34 * 5 + (var2 - 217) / 49;
               var5 = (var3 - 31) / 34 * 4 + (var2 - 9) / 49;
               if (this.a.v() > 0) {
                  if (var2 > 216 && var3 > 30 && var2 < 462 && var3 < 235 && var4 >= 0 && var4 < this.a.dG()) {
                     this.A(-1, var4);
                  }

                  if (var2 > 8 && var3 > 30 && var2 < 205 && var3 < 133 && var5 >= 0 && this.lH > var5) {
                     this.B(-1, var5);
                  }

                  if (var2 >= 217 && var3 >= 238 && var2 <= 286 && var3 <= 259) {
                     this.lD = true;
                     this.a.n().aO(55);
                     this.a.n().dW();
                  }

                  if (var2 >= 394 && var3 >= 238 && var2 < 463 && var3 < 259) {
                     this.lN = false;
                     this.a.n().aO(230);
                     this.a.n().dW();
                  }

                  this.a.f(0);
                  this.a.e(0);
               }

               if (this.a.t() == 2) {
                  if (var2 > 216 && var3 > 30 && var2 < 462 && var3 < 235) {
                     var6 = this.a.om.au();
                     var7 = this.a.om.av();
                     this.a.oo = this.a.w() - 7;
                     this.a.on = this.a.u() - var6 / 2;
                     this.a.ov = true;
                     if (this.a.oo < 0) {
                        this.a.oo = 0;
                     }

                     if (this.a.on < 0) {
                        this.a.on = 0;
                     }

                     if (this.a.on + var6 > 510) {
                        this.a.on = 510 - var6;
                     }

                     if (var7 + this.a.oo > 315) {
                        this.a.oo = 315 - var7;
                     }

                     if (var4 >= 0 && this.a.dG() > var4) {
                        var8 = this.a.ng[var4];
                        this.lP = true;
                        this.ls.E(0);
                        this.ls.a(com.rsc.c.d.eH, "Offer 1", "@lre@" + com.rsc.a.a.l(var8).ad(), var8, 1);
                        this.ls.a(com.rsc.c.d.eH, "Offer 5", "@lre@" + com.rsc.a.a.l(var8).ad(), var8, 5);
                        this.ls.a(com.rsc.c.d.eH, "Offer 10", "@lre@" + com.rsc.a.a.l(var8).ad(), var8, 10);
                        this.ls.a(com.rsc.c.d.eH, "Offer All", "@lre@" + com.rsc.a.a.l(var8).ad(), var8, -1);
                        this.ls.a(com.rsc.c.d.eH, "Offer X", "@lre@" + com.rsc.a.a.l(var8).ad(), var8, -2);
                        int var9 = this.ls.au();
                        int var10 = this.ls.av();
                        this.lB = this.a.u() - var9 / 2;
                        this.lC = this.a.w() - 7;
                        if (this.lB < 0) {
                           this.lB = 0;
                        }

                        if (this.lC < 0) {
                           this.lC = 0;
                        }

                        if (var10 + this.lC > 315) {
                           this.lC = 315 - var10;
                        }

                        if (this.lB + var9 > 510) {
                           this.lB = 510 - var9;
                        }
                     }
                  }

                  if (var2 > 8 && var3 > 30 && var2 < 205 && var3 < 133 && var5 >= 0 && var5 < this.lH) {
                     var6 = this.lv[var5];
                     this.lP = true;
                     this.ls.E(0);
                     this.ls.a(com.rsc.c.d.eI, "Remove 1", "@lre@" + com.rsc.a.a.l(var6).ad(), var6, 1);
                     this.ls.a(com.rsc.c.d.eI, "Remove 5", "@lre@" + com.rsc.a.a.l(var6).ad(), var6, 5);
                     this.ls.a(com.rsc.c.d.eI, "Remove 10", "@lre@" + com.rsc.a.a.l(var6).ad(), var6, 10);
                     this.ls.a(com.rsc.c.d.eI, "Remove All", "@lre@" + com.rsc.a.a.l(var6).ad(), var6, -1);
                     this.ls.a(com.rsc.c.d.eI, "Remove X", "@lre@" + com.rsc.a.a.l(var6).ad(), var6, -2);
                     var7 = this.ls.au();
                     var8 = this.ls.av();
                     this.lB = this.a.u() - var7 / 2;
                     this.lC = this.a.w() - 7;
                     if (this.lB < 0) {
                        this.lB = 0;
                     }

                     if (this.lC < 0) {
                        this.lC = 0;
                     }

                     if (var8 + this.lC > 315) {
                        this.lC = 315 - var8;
                     }

                     if (var7 + this.lB > 510) {
                        this.lB = 510 - var7;
                     }
                  }

                  this.a.e(0);
               }

               if (this.lP) {
                  var6 = this.ls.au();
                  var7 = this.ls.av();
                  if (this.a.u() < this.lB - 10 || this.lC - 10 > this.a.w() || this.a.u() > this.lB - (-var6 - 10) || this.lC - (-var7 - 10) < this.a.w()) {
                     this.lP = false;
                  }
               }
            } else if (this.a.t() != 0) {
               this.lN = false;
               this.a.n().aO(230);
               this.a.n().dW();
            }
         }
      } else {
         this.lP = false;
         this.a.e(0);
         com.rsc.c.d var11 = this.ls.v(var1);
         var3 = this.ls.B(var1);
         var4 = -1;
         var5 = 0;
         if (var11 == com.rsc.c.d.eH) {
            for(var6 = 0; var6 < this.a.dG(); ++var6) {
               if (this.a.ng[var6] == var3) {
                  if (var4 < 0) {
                     var4 = var6;
                  }

                  if (com.rsc.a.a.l(var3).aA()) {
                     var5 = this.a.nh[var6];
                     break;
                  }

                  ++var5;
               }
            }
         } else {
            for(var6 = 0; var6 < this.lH; ++var6) {
               if (var3 == this.lv[var6]) {
                  if (var4 < 0) {
                     var4 = var6;
                  }

                  if (com.rsc.a.a.l(var3).aA()) {
                     var5 = this.lw[var6];
                     break;
                  }

                  ++var5;
               }
            }
         }

         if (var4 >= 0) {
            var6 = this.ls.y(var1);
            if (var6 == -2) {
               this.lG = var4;
               if (var11 == com.rsc.c.d.eH) {
                  this.a.a(new String[]{"Enter number of items to offer and press enter"}, com.rsc.b.b.cv, true);
               } else {
                  this.a.a(new String[]{"Enter number of items to remove and press enter"}, com.rsc.b.b.cw, true);
               }
            } else {
               if (var6 == -1) {
                  var6 = var5;
               }

               if (var11 != com.rsc.c.d.eH) {
                  this.B(var6, var4);
               } else {
                  this.A(var6, var4);
               }
            }
         }
      }

      if (this.lN) {
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

         this.M.a((String)("Trading with: " + this.lM), var12 + 1, 10 + var13, 16777215, 1);
         this.M.a((String)"Your Offer", var12 + 9, var13 + 27, 16777215, 4);
         this.M.a((String)"Opponent's Offer", var12 + 9, var13 + 152, 16777215, 4);
         this.M.a((String)"Your Inventory", var12 + 216, var13 + 27, 16777215, 4);
         if (!this.lD) {
            this.M.a(this.M.ae(23), var12 + 217, var13 + 238);
         }

         this.M.a(this.M.ae(24), var12 + 394, var13 + 238);
         if (this.lI) {
            this.M.c(var12 + 341, 246 + var13, "Other player", 16777215, 1, -1);
            this.M.c(var12 + 341, 256 + var13, "has accepted", 16777215, 1, -1);
         }

         if (this.lD) {
            this.M.c(var12 + 217 + 35, var13 + 246, "Waiting for", 16777215, 1, -1);
            this.M.c(var12 + 252, 256 + var13, "other player", 16777215, 1, -1);
         }

         for(var6 = 0; var6 < this.a.dG(); ++var6) {
            var7 = var12 + 217 + var6 % 5 * 49;
            var8 = 31 + var13 + var6 / 5 * 34;
            this.M.a(this.M.ad(this.a.ng[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.a.ng[var6]).aB(), 0, 0, 255, false, 0, 1);
            if (com.rsc.a.a.l(this.a.ng[var6]).aA()) {
               this.M.a((String)("" + l.aS(this.a.nh[var6])), 1 + var7, 10 + var8, 16776960, 1);
            }
         }

         for(var6 = 0; this.lH > var6; ++var6) {
            var7 = var6 % 4 * 49 + 9 + var12;
            var8 = var6 / 4 * 34 + var13 + 31;
            this.M.a(this.M.ad(this.lv[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.lv[var6]).aB(), 0, 0, 255, false, 0, 1);
            if (com.rsc.a.a.l(this.lv[var6]).aA()) {
               this.M.a((String)("" + l.aS(this.lw[var6])), var7 + 1, 10 + var8, 16776960, 1);
            }

            if (var7 < this.a.u() && 48 + var7 > this.a.u() && var8 < this.a.w() && this.a.w() < var8 + 32) {
               this.M.a((String)(com.rsc.a.a.l(this.lv[var6]).ad() + ": @whi@" + com.rsc.a.a.l(this.lv[var6]).ar()), 8 + var12, 273 + var13, 16776960, 1);
            }
         }

         for(var6 = 0; this.lL > var6; ++var6) {
            var7 = var12 + 9 + var6 % 4 * 49;
            var8 = var13 + 156 + var6 / 4 * 34;
            this.M.a(this.M.ad(this.lz[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.lz[var6]).aB(), 0, 0, 255, false, 0, 1);
            if (com.rsc.a.a.l(this.lz[var6]).aA()) {
               this.M.a((String)("" + this.lA[var6]), var7 + 1, 10 + var8, 16776960, 1);
            }

            if (var7 < this.a.u() && this.a.u() < var7 + 48 && this.a.w() > var8 && var8 + 32 > this.a.w()) {
               this.M.a((String)(com.rsc.a.a.l(this.lz[var6]).ad() + ": @whi@" + com.rsc.a.a.l(this.lz[var6]).ar()), var12 + 8, var13 + 273, 16776960, 1);
            }
         }

         if (this.lP) {
            this.ls.b(this.lC, this.lB, this.a.w(), this.a.u());
         }
      }

   }

   private void bT() {
      byte var1 = 22;
      byte var2 = 36;
      this.M.e(var1, var2, 468, 16, 192);
      int var3 = 10000536;
      this.M.g(var1, var2 + 16, 468, 246, var3, 160);
      this.M.c(234 + var1, var2 + 12, "Please confirm your trade with @yel@" + this.lK, 16777215, 1, -1);
      this.M.c(var1 + 117, 30 + var2, "You are about to give:", 16776960, 1, -1);

      int var4;
      String var5;
      for(var4 = 0; this.lF > var4; ++var4) {
         var5 = com.rsc.a.a.l(this.lt[var4]).ad();
         if (com.rsc.a.a.l(this.lt[var4]).aA()) {
            var5 = var5 + " x " + l.aR(this.lu[var4]);
         }

         this.M.c(var1 + 117, var4 * 12 + 42 + var2, var5, 16777215, 1, -1);
      }

      if (this.lF == 0) {
         this.M.c(var1 + 117, 42 + var2, "Nothing!", 16777215, 1, -1);
      }

      this.M.c(351 + var1, 30 + var2, "In return you will receive:", 16776960, 1, -1);

      for(var4 = 0; var4 < this.lJ; ++var4) {
         var5 = com.rsc.a.a.l(this.ly[var4]).ad();
         if (com.rsc.a.a.l(this.ly[var4]).aA()) {
            var5 = var5 + " x " + l.aR(this.lx[var4]);
         }

         this.M.c(351 + var1, 42 + var2 + var4 * 12, var5, 16777215, 1, -1);
      }

      if (this.lJ == 0) {
         this.M.c(351 + var1, var2 + 42, "Nothing!", 16777215, 1, -1);
      }

      this.M.c(var1 + 234, 200 + var2, "Are you sure you want to do this?", 65535, 4, -1);
      this.M.c(var1 + 234, var2 + 215, "There is NO WAY to reverse a trade if you change your mind.", 16777215, 1, -1);
      this.M.c(234 + var1, var2 + 230, "Remember that not all players are trustworthy", 16777215, 1, -1);
      if (this.lE) {
         this.M.c(234 + var1, 250 + var2, "Waiting for other player...", 16776960, 1, -1);
      } else {
         this.M.a(this.M.ae(23), var1 - 35 + 118, 238 + var2);
         this.M.a(this.M.ae(24), var1 + 352 - 35, var2 + 238);
      }

      if (this.a.t() == 1) {
         if (this.a.u() < var1 || this.a.w() < var2 || this.a.u() > 468 + var1 || this.a.w() > var2 + 262) {
            this.lO = false;
            this.a.n().aO(230);
            this.a.n().dW();
         }

         if (this.a.u() >= var1 + 118 - 35 && this.a.u() <= var1 + 118 + 70 && this.a.w() >= var2 + 238 && this.a.w() <= 238 + var2 + 21) {
            this.lE = true;
            this.a.n().aO(104);
            this.a.n().dW();
         }

         if (352 + var1 - 35 <= this.a.u() && this.a.u() <= var1 + 423 && this.a.w() >= var2 + 238 && this.a.w() <= 238 + var2 + 21) {
            this.lO = false;
            this.a.n().aO(230);
            this.a.n().dW();
         }

         this.a.e(0);
      }

   }

   public void A(int var1, int var2) {
      boolean var3 = false;
      int var4 = 0;
      int var5 = this.a.ng[var2];

      int var6;
      int var7;
      for(var6 = 0; this.lH > var6; ++var6) {
         if (var5 == this.lv[var6]) {
            if (com.rsc.a.a.l(var5).aA()) {
               if (var1 >= 0) {
                  int[] var10000 = this.lw;
                  var10000[var6] += var1;
                  if (this.lw[var6] > this.a.nh[var2]) {
                     this.lw[var6] = this.a.nh[var2];
                  }

                  var3 = true;
               } else {
                  for(var7 = 0; var7 < this.a.v(); ++var7) {
                     var3 = true;
                     if (this.a.nh[var2] > this.lw[var6]) {
                        int var10002 = this.lw[var6]++;
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

      if (com.rsc.a.a.l(var5).bC) {
         var3 = true;
         this.a.a(h.ml, (String)null, (String)null, "This object cannot be traded with other players", 0);
      }

      if (!var3) {
         if (var1 < 0) {
            if (this.lH < 12) {
               this.lv[this.lH] = var5;
               this.lw[this.lH] = 1;
               var3 = true;
               ++this.lH;
            }
         } else {
            for(var7 = 0; var7 < var1 && this.lH < 12 && var6 > var4; ++var7) {
               this.lv[this.lH] = var5;
               this.lw[this.lH] = 1;
               var3 = true;
               ++var4;
               ++this.lH;
               if (var7 == 0 && com.rsc.a.a.l(var5).aA()) {
                  this.lw[this.lH - 1] = Math.min(var1, this.a.nh[var2]);
                  break;
               }
            }
         }
      }

      if (var3) {
         this.a.n().aO(46);
         this.a.n().aK(this.lH);

         for(var7 = 0; this.lH > var7; ++var7) {
            this.a.n().aL(this.lv[var7]);
            this.a.n().aN(this.lw[var7]);
         }

         this.a.n().dW();
         this.lI = false;
         this.lD = false;
      }

   }

   public void B(int var1, int var2) {
      int var3 = this.lv[var2];
      int var4 = var1 < 0 ? this.a.v() : var1;
      int var5;
      if (!com.rsc.a.a.l(var3).aA()) {
         var5 = 0;

         for(int var6 = 0; var6 < this.lH && var5 < var4; ++var6) {
            if (var3 == this.lv[var6]) {
               ++var5;
               --this.lH;

               for(int var7 = var6; this.lH > var7; ++var7) {
                  this.lv[var7] = this.lv[var7 + 1];
                  this.lw[var7] = this.lw[var7 + 1];
               }

               --var6;
            }
         }
      } else {
         int[] var10000 = this.lw;
         var10000[var2] -= var4;
         if (this.lw[var2] <= 0) {
            --this.lH;

            for(var5 = var2; var5 < this.lH; ++var5) {
               this.lv[var5] = this.lv[1 + var5];
               this.lw[var5] = this.lw[var5 + 1];
            }
         }
      }

      this.a.n().aO(46);
      this.a.n().aK(this.lH);

      for(var5 = 0; var5 < this.lH; ++var5) {
         this.a.n().aL(this.lv[var5]);
         this.a.n().aN(this.lw[var5]);
      }

      this.a.n().dW();
      this.lD = false;
      this.lI = false;
   }
}
