package com.rsc.d.b;

import com.rsc.c.k;
import com.rsc.e.h;
import com.rsc.g.l;

public class b {
   private final com.rsc.d a;
   private final k M;
   private final com.rsc.c.b kA;
   public final int[] kB = new int[8];
   public final int[] kC = new int[8];
   public int kD = 0;
   public boolean kE = false;
   public boolean kF = false;
   private boolean kG = false;
   private int kH;
   private int kI;
   public int kJ;
   public int kK;
   public int kL;
   public int kM;
   public int kN;
   public boolean kO = false;
   public boolean kP = false;
   public boolean kQ = false;
   public boolean kR = false;
   public boolean kS = false;
   public boolean kT = false;
   public boolean kU = false;
   public String kV = "";
   public String kW;
   public int kX = 0;
   public int kY = 0;
   public int kZ = 0;
   public final int[] la = new int[8];
   public final int[] lb = new int[8];
   public final int[] lc = new int[8];
   public final int[] ld = new int[8];
   public final int[] le = new int[8];
   public final int[] lf = new int[8];

   public b(com.rsc.d var1) {
      this.a = var1;
      this.M = var1.dB();
      this.kA = new com.rsc.c.b(this.M, 1, "");
   }

   public void bv() {
      if (this.kS) {
         this.bP();
      } else if (this.kT) {
         this.bQ();
      }

   }

   private void bP() {
      int var1 = -1;
      if (this.a.t() != 0 && this.kG) {
         var1 = this.kA.a(this.a.u(), this.a.w(), this.kH, this.kI);
      }

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (var1 >= 0) {
         this.a.e(0);
         this.kG = false;
         com.rsc.c.d var2 = this.kA.v(var1);
         var3 = this.kA.B(var1);
         var4 = -1;
         var5 = 0;
         if (var2 != com.rsc.c.d.eJ) {
            for(var6 = 0; this.kD > var6; ++var6) {
               if (this.kB[var6] == var3) {
                  if (var4 < 0) {
                     var4 = var6;
                  }

                  if (com.rsc.a.a.l(var3).aA()) {
                     var5 = this.kC[var6];
                     break;
                  }

                  ++var5;
               }
            }
         } else {
            for(var6 = 0; this.a.dG() > var6; ++var6) {
               if (var3 == this.a.ng[var6]) {
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
         }

         if (var4 >= 0) {
            var6 = this.kA.y(var1);
            if (var6 != -2) {
               if (var6 == -1) {
                  var6 = var5;
               }

               if (var2 == com.rsc.c.d.eJ) {
                  this.z(var6, var4);
               } else {
                  this.y(var4, var6);
               }
            } else {
               this.kJ = var4;
               if (var2 == com.rsc.c.d.eJ) {
                  this.a.a(new String[]{"Enter number of items to stake and press enter"}, com.rsc.b.b.cB, true);
               } else {
                  this.a.a(new String[]{"Enter number of items to remove and press enter"}, com.rsc.b.b.cC, true);
               }
            }
         }
      } else if (this.a.cE() == com.rsc.b.b.cu) {
         if (this.a.t() == 1 && this.a.v() == 0) {
            this.a.f(1);
         }

         int var10 = this.a.u() - 22;
         var3 = this.a.w() - 36;
         if (var10 >= 0 && var3 >= 0 && var10 < 468 && var3 < 262) {
            if (this.a.v() > 0) {
               if (var10 > 216 && var3 > 30 && var10 < 462 && var3 < 235) {
                  var4 = (var10 - 217) / 49 + (var3 - 31) / 34 * 5;
                  if (var4 >= 0 && this.a.dG() > var4) {
                     this.z(-1, var4);
                  }
               }

               if (var10 > 8 && var3 > 30 && var10 < 205 && var3 < 129) {
                  var4 = (var10 - 9) / 49 + (var3 - 31) / 34 * 4;
                  if (var4 >= 0 && var4 < this.kD) {
                     this.y(var4, -1);
                  }
               }

               boolean var13 = false;
               if (var10 >= 93 && var3 >= 221 && var10 <= 104 && var3 <= 232) {
                  var13 = true;
                  this.kQ = !this.kQ;
               }

               if (var10 >= 93 && var3 >= 240 && var10 <= 104 && var3 <= 251) {
                  this.kO = !this.kO;
                  var13 = true;
               }

               if (var10 >= 191 && var3 >= 221 && var10 <= 202 && var3 <= 232) {
                  this.kP = !this.kP;
                  var13 = true;
               }

               if (var10 >= 191 && var3 >= 240 && var10 <= 202 && var3 <= 251) {
                  var13 = true;
                  this.kR = !this.kR;
               }

               if (var13) {
                  this.a.n().aO(8);
                  this.a.n().aK(!this.kQ ? 0 : 1);
                  this.a.n().aK(this.kO ? 1 : 0);
                  this.a.n().aK(!this.kP ? 0 : 1);
                  this.a.n().aK(!this.kR ? 0 : 1);
                  this.a.n().dW();
                  this.kF = false;
                  this.kE = false;
               }

               if (var10 >= 217 && var3 >= 238 && var10 <= 286 && var3 <= 259) {
                  this.kE = true;
                  this.a.n().aO(176);
                  this.a.n().dW();
               }

               if (var10 >= 394 && var3 >= 238 && var10 < 463 && var3 < 259) {
                  this.kS = false;
                  this.a.n().aO(197);
                  this.a.n().dW();
               }

               this.a.f(0);
               this.a.e(0);
            }

            if (this.a.t() == 2) {
               if (var10 > 216 && var3 > 30 && var10 < 462 && var3 < 235) {
                  var4 = this.a.om.au();
                  var5 = this.a.om.av();
                  this.a.oo = this.a.w() - 7;
                  this.a.on = this.a.u() - var4 / 2;
                  this.a.ov = true;
                  if (this.a.oo < 0) {
                     this.a.oo = 0;
                  }

                  if (this.a.on < 0) {
                     this.a.on = 0;
                  }

                  if (var4 + this.a.on > 510) {
                     this.a.on = 510 - var4;
                  }

                  if (var5 + this.a.oo > 315) {
                     this.a.oo = 315 - var5;
                  }

                  var6 = (var10 - 217) / 49 + (var3 - 31) / 34 * 5;
                  if (var6 >= 0 && this.a.dG() > var6) {
                     var7 = this.a.ng[var6];
                     this.kG = true;
                     this.kA.E(0);
                     this.kA.a(com.rsc.c.d.eJ, "Stake 1", "@lre@" + com.rsc.a.a.l(var7).ad(), var7, 1);
                     this.kA.a(com.rsc.c.d.eJ, "Stake 5", "@lre@" + com.rsc.a.a.l(var7).ad(), var7, 5);
                     this.kA.a(com.rsc.c.d.eJ, "Stake 10", "@lre@" + com.rsc.a.a.l(var7).ad(), var7, 10);
                     this.kA.a(com.rsc.c.d.eJ, "Stake All", "@lre@" + com.rsc.a.a.l(var7).ad(), var7, -1);
                     this.kA.a(com.rsc.c.d.eJ, "Stake X", "@lre@" + com.rsc.a.a.l(var7).ad(), var7, -2);
                     var8 = this.kA.au();
                     int var9 = this.kA.av();
                     this.kI = this.a.w() - 7;
                     this.kH = this.a.u() - var8 / 2;
                     if (this.kH < 0) {
                        this.kH = 0;
                     }

                     if (this.kI < 0) {
                        this.kI = 0;
                     }

                     if (this.kH + var8 > 510) {
                        this.kH = 510 - var8;
                     }

                     if (this.kI + var9 > 315) {
                        this.kI = 315 - var9;
                     }
                  }
               }

               if (var10 > 8 && var3 > 30 && var10 < 205 && var3 < 133) {
                  var4 = (var10 - 9) / 49 + (var3 - 31) / 34 * 4;
                  if (var4 >= 0 && this.kD > var4) {
                     var5 = this.kB[var4];
                     this.kG = true;
                     this.kA.E(0);
                     this.kA.a(com.rsc.c.d.eK, "Remove 1", "@lre@" + com.rsc.a.a.l(var5).ad(), var5, 1);
                     this.kA.a(com.rsc.c.d.eK, "Remove 5", "@lre@" + com.rsc.a.a.l(var5).ad(), var5, 5);
                     this.kA.a(com.rsc.c.d.eK, "Remove 10", "@lre@" + com.rsc.a.a.l(var5).ad(), var5, 10);
                     this.kA.a(com.rsc.c.d.eK, "Remove All", "@lre@" + com.rsc.a.a.l(var5).ad(), var5, -1);
                     this.kA.a(com.rsc.c.d.eK, "Remove X", "@lre@" + com.rsc.a.a.l(var5).ad(), var5, -2);
                     var6 = this.kA.au();
                     var7 = this.kA.av();
                     this.kI = this.a.w() - 7;
                     this.kH = this.a.u() - var6 / 2;
                     if (this.kH < 0) {
                        this.kH = 0;
                     }

                     if (this.kI < 0) {
                        this.kI = 0;
                     }

                     if (this.kH + var6 > 510) {
                        this.kH = 510 - var6;
                     }

                     if (var7 + this.kI > 315) {
                        this.kI = 315 - var7;
                     }
                  }
               }

               this.a.e(0);
            }

            if (this.kG) {
               var4 = this.kA.au();
               var5 = this.kA.av();
               if (this.kH - 10 > this.a.u() || this.a.w() < this.kI - 10 || this.a.u() > this.kH + var4 + 10 || this.a.w() > 10 + var5 + this.kI) {
                  this.kG = false;
               }
            }
         } else if (this.a.t() != 0) {
            this.kS = false;
            this.a.n().aO(197);
            this.a.n().dW();
         }
      }

      if (this.kS) {
         byte var11 = 22;
         byte var12 = 36;
         this.M.e(var11, var12, 468, 12, 13175581);
         var4 = 10000536;
         this.M.g(var11, 12 + var12, 468, 18, var4, 160);
         this.M.g(var11, 30 + var12, 8, 248, var4, 160);
         this.M.g(var11 + 205, 30 + var12, 11, 248, var4, 160);
         this.M.g(var11 + 462, 30 + var12, 6, 248, var4, 160);
         this.M.g(var11 + 8, var12 + 99, 197, 24, var4, 160);
         this.M.g(8 + var11, 192 + var12, 197, 23, var4, 160);
         this.M.g(var11 + 8, var12 + 258, 197, 20, var4, 160);
         this.M.g(var11 + 216, var12 + 235, 246, 43, var4, 160);
         var5 = 13684944;
         this.M.g(8 + var11, var12 + 30, 197, 69, var5, 160);
         this.M.g(var11 + 8, 123 + var12, 197, 69, var5, 160);
         this.M.g(8 + var11, var12 + 215, 197, 43, var5, 160);
         this.M.g(216 + var11, var12 + 30, 246, 205, var5, 160);

         for(var6 = 0; var6 < 3; ++var6) {
            this.M.m(var11 + 8, var12 + 30 + var6 * 34, 197, 0);
         }

         for(var6 = 0; var6 < 3; ++var6) {
            this.M.m(8 + var11, var6 * 34 + var12 + 123, 197, 0);
         }

         for(var6 = 0; var6 < 7; ++var6) {
            this.M.m(216 + var11, var6 * 34 + var12 + 30, 246, 0);
         }

         for(var6 = 0; var6 < 6; ++var6) {
            if (var6 < 5) {
               this.M.n(var6 * 49 + 8 + var11, var12 + 30, 0, 69);
               this.M.n(var6 * 49 + var11 + 8, var12 + 123, 0, 69);
            }

            this.M.n(var6 * 49 + var11 + 216, var12 + 30, 0, 205);
         }

         this.M.m(var11 + 8, 215 + var12, 197, 0);
         this.M.m(var11 + 8, var12 + 257, 197, 0);
         this.M.n(8 + var11, var12 + 215, 0, 43);
         this.M.n(var11 + 204, var12 + 215, 0, 43);
         this.M.a((String)("Preparing to duel with: " + this.kV), 1 + var11, var12 + 10, 16777215, 1);
         this.M.a((String)"Your Stake", var11 + 9, 27 + var12, 16777215, 4);
         this.M.a((String)"Opponent's Stake", 9 + var11, 120 + var12, 16777215, 4);
         this.M.a((String)"Duel Options", var11 + 9, var12 + 212, 16777215, 4);
         this.M.a((String)"Your Inventory", var11 + 216, var12 + 27, 16777215, 4);
         this.M.a((String)"No retreating", 9 + var11, 215 + var12 + 16, 16776960, 3);
         this.M.a((String)"No magic", 9 + var11, 250 + var12, 16776960, 3);
         this.M.a((String)"No prayer", 8 + var11 + 102, var12 + 231, 16776960, 3);
         this.M.a((String)"No weapons", 110 + var11, 35 + var12 + 215, 16776960, 3);
         this.M.f(var11 + 93, 11, 215 + var12 + 6, 11, 16776960);
         if (this.kQ) {
            this.M.e(var11 + 95, 223 + var12, 7, 7, 16776960);
         }

         this.M.f(93 + var11, 11, 25 + var12 + 215, 11, 16776960);
         if (this.kO) {
            this.M.e(var11 + 95, 215 + var12 + 27, 7, 7, 16776960);
         }

         this.M.f(191 + var11, 11, 221 + var12, 11, 16776960);
         if (this.kP) {
            this.M.e(var11 + 193, 8 + var12 + 215, 7, 7, 16776960);
         }

         this.M.f(var11 + 191, 11, var12 + 215 + 25, 11, 16776960);
         if (this.kR) {
            this.M.e(193 + var11, 215 + var12 + 27, 7, 7, 16776960);
         }

         if (!this.kE) {
            this.M.a(this.M.ae(23), 217 + var11, var12 + 238);
         }

         this.M.a(this.M.ae(24), var11 + 394, var12 + 238);
         if (this.kF) {
            this.M.a(var11 + 341, "Other player", 16777215, -1, 1, 246 + var12);
            this.M.a(341 + var11, "has accepted", 16777215, -1, 1, 256 + var12);
         }

         if (this.kE) {
            this.M.a(252 + var11, "Waiting for", 16777215, -1, 1, var12 + 246);
            this.M.a(252 + var11, "other player", 16777215, -1, 1, 256 + var12);
         }

         for(var6 = 0; this.a.dG() > var6; ++var6) {
            var7 = 217 + var11 + var6 % 5 * 49;
            var8 = var12 + 31 + var6 / 5 * 34;
            this.M.a(this.M.ad(this.a.ng[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.a.ng[var6]).aB(), 0, false, 0, 1);
            if (com.rsc.a.a.l(this.a.ng[var6]).aA()) {
               this.M.a((String)("" + this.a.nh[var6]), var7 + 1, 10 + var8, 16776960, 1);
            }
         }

         for(var6 = 0; this.kD > var6; ++var6) {
            var7 = var11 + 9 + var6 % 4 * 49;
            var8 = var12 + 31 + var6 / 4 * 34;
            this.M.a(this.M.ad(this.kB[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.kB[var6]).aB(), 0, false, 0, 1);
            if (com.rsc.a.a.l(this.kB[var6]).aA()) {
               this.M.a((String)("" + this.kC[var6]), 1 + var7, 10 + var8, 16776960, 1);
            }

            if (var7 < this.a.u() && this.a.u() < 48 + var7 && var8 < this.a.w() && 32 + var8 > this.a.w()) {
               this.M.a((String)(com.rsc.a.a.l(this.kB[var6]).ad() + ": @whi@" + com.rsc.a.a.l(this.kB[var6]).ar()), 8 + var11, var12 + 273, 16776960, 1);
            }
         }

         for(var6 = 0; var6 < this.kX; ++var6) {
            var7 = var6 % 4 * 49 + 9 + var11;
            var8 = var6 / 4 * 34 + 124 + var12;
            this.M.a(this.M.ad(this.la[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.la[var6]).aB(), 0, false, 0, 1);
            if (com.rsc.a.a.l(this.la[var6]).aA()) {
               this.M.a((String)("" + this.lb[var6]), 1 + var7, 10 + var8, 16776960, 1);
            }

            if (this.a.u() > var7 && 48 + var7 > this.a.u() && var8 < this.a.w() && this.a.w() < var8 + 32) {
               this.M.a((String)(com.rsc.a.a.l(this.la[var6]).ad() + ": @whi@" + com.rsc.a.a.l(this.la[var6]).ar()), var11 + 8, 273 + var12, 16776960, 1);
            }
         }

         if (this.kG) {
            this.kA.b(this.kI, this.kH, this.a.w(), this.a.u());
         }
      }

   }

   private void bQ() {
      byte var1 = 22;
      byte var2 = 36;
      this.M.e(var1, var2, 468, 16, 192);
      int var3 = 10000536;
      this.M.g(var1, var2 + 16, 468, 246, var3, 160);
      this.M.a(var1 + 234, "Please confirm your duel with @yel@" + this.kW, 16777215, -1, 1, var2 + 12);
      this.M.a(var1 + 117, "Your stake:", 16776960, -1, 1, var2 + 30);

      int var4;
      String var5;
      for(var4 = 0; this.kY > var4; ++var4) {
         var5 = com.rsc.a.a.l(this.lc[var4]).ad();
         if (com.rsc.a.a.l(this.lc[var4]).aA()) {
            var5 = var5 + " x " + l.aR(this.ld[var4]);
         }

         this.M.a(var1 + 117, var5, 16777215, -1, 1, 42 + var2 + var4 * 12);
      }

      if (this.kY == 0) {
         this.M.a(var1 + 117, "Nothing!", 16777215, -1, 1, 42 + var2);
      }

      this.M.a(351 + var1, "Your opponent's stake:", 16776960, -1, 1, 30 + var2);

      for(var4 = 0; var4 < this.kZ; ++var4) {
         var5 = com.rsc.a.a.l(this.le[var4]).ad();
         if (com.rsc.a.a.l(this.le[var4]).aA()) {
            var5 = var5 + " x " + l.aR(this.lf[var4]);
         }

         this.M.a(var1 + 351, var5, 16777215, -1, 1, var4 * 12 + 42 + var2);
      }

      if (this.kZ == 0) {
         this.M.a(351 + var1, "Nothing!", 16777215, -1, 1, 42 + var2);
      }

      if (this.kM == 0) {
         this.M.a(var1 + 234, "You can retreat from this duel", 65280, -1, 1, var2 + 180);
      } else {
         this.M.a(234 + var1, "No retreat is possible!", 16711680, -1, 1, 180 + var2);
      }

      if (this.kK == 0) {
         this.M.a(234 + var1, "Magic may be used", 65280, -1, 1, var2 + 192);
      } else {
         this.M.a(var1 + 234, "Magic cannot be used", 16711680, -1, 1, 192 + var2);
      }

      if (this.kL == 0) {
         this.M.a(var1 + 234, "Prayer may be used", 65280, -1, 1, 204 + var2);
      } else {
         this.M.a(var1 + 234, "Prayer cannot be used", 16711680, -1, 1, var2 + 204);
      }

      if (this.kN != 0) {
         this.M.a(var1 + 234, "Weapons cannot be used", 16711680, -1, 1, 216 + var2);
      } else {
         this.M.a(var1 + 234, "Weapons may be used", 65280, -1, 1, var2 + 216);
      }

      this.M.a(var1 + 234, "If you are sure click 'Accept' to begin the duel", 16777215, -1, 1, var2 + 230);
      if (!this.kU) {
         this.M.a(this.M.ae(23), 83 + var1, 238 + var2);
         this.M.a(this.M.ae(24), var1 - 35 + 352, var2 + 238);
      } else {
         this.M.a(var1 + 234, "Waiting for other player...", 16776960, -1, 1, var2 + 250);
      }

      if (this.a.t() == 1) {
         if (var1 > this.a.u() || this.a.w() < var2 || var1 + 468 < this.a.u() || this.a.w() > 262 + var2) {
            this.kT = false;
            this.a.n().aO(230);
            this.a.n().dW();
         }

         if (118 + var1 - 35 <= this.a.u() && this.a.u() <= var1 + 118 + 70 && var2 + 238 <= this.a.w() && 238 + var2 + 21 >= this.a.w()) {
            this.kU = true;
            this.a.n().aO(77);
            this.a.n().dW();
         }

         if (352 + (var1 - 35) <= this.a.u() && 353 + var1 + 70 >= this.a.u() && var2 + 238 <= this.a.w() && 259 + var2 >= this.a.w()) {
            this.kT = false;
            this.a.n().aO(197);
            this.a.n().dW();
         }

         this.a.e(0);
      }

   }

   public final void y(int var1, int var2) {
      int var3 = this.kB[var1];
      int var4 = var2 >= 0 ? var2 : this.a.v();
      int var5;
      if (com.rsc.a.a.l(var3).aA()) {
         int[] var10000 = this.kC;
         var10000[var1] -= var4;
         if (this.kC[var1] <= 0) {
            --this.kD;

            for(var5 = var1; var5 < this.kD; ++var5) {
               this.kB[var5] = this.kB[var5 + 1];
               this.kC[var5] = this.kC[var5 + 1];
            }
         }
      } else {
         var5 = 0;

         for(int var6 = 0; var6 < this.kD && var5 < var4; ++var6) {
            if (this.kB[var6] == var3) {
               --this.kD;
               ++var5;

               for(int var7 = var6; this.kD > var7; ++var7) {
                  this.kB[var7] = this.kB[1 + var7];
                  this.kC[var7] = this.kC[1 + var7];
               }

               --var6;
            }
         }
      }

      this.a.n().aO(33);
      this.a.n().aK(this.kD);

      for(var5 = 0; this.kD > var5; ++var5) {
         this.a.n().aL(this.kB[var5]);
         this.a.n().aN(this.kC[var5]);
      }

      this.a.n().dW();
      this.kE = false;
      this.kF = false;
   }

   public final void z(int var1, int var2) {
      boolean var3 = false;
      int var4 = 0;
      int var5 = this.a.ng[var2];

      int var6;
      int var7;
      for(var6 = 0; var6 < this.kD; ++var6) {
         if (this.kB[var6] == var5) {
            if (com.rsc.a.a.l(var5).aA()) {
               if (var1 < 0) {
                  for(var7 = 0; var7 < this.a.v(); ++var7) {
                     if (this.kC[var6] < this.a.nh[var2]) {
                        int var10002 = this.kC[var6]++;
                     }

                     var3 = true;
                  }
               } else {
                  int[] var10000 = this.kC;
                  var10000[var6] += var1;
                  if (this.a.nh[var2] < this.kC[var6]) {
                     this.kC[var6] = this.a.nh[var2];
                  }

                  var3 = true;
               }
            } else {
               ++var4;
            }
         }
      }

      var6 = this.a.aB(var5);
      if (var4 >= var6) {
         var3 = true;
      }

      if (com.rsc.a.a.l(var5).bC) {
         var3 = true;
         this.a.a(h.ml, (String)null, (String)null, "This object cannot be added to a duel offer", 0);
      }

      if (!var3) {
         if (var1 < 0) {
            if (this.kD < 8) {
               this.kB[this.kD] = var5;
               this.kC[this.kD] = 1;
               ++this.kD;
               var3 = true;
            }
         } else {
            for(var7 = 0; var1 > var7 && this.kD < 8 && var4 < var6; ++var7) {
               this.kB[this.kD] = var5;
               this.kC[this.kD] = 1;
               ++var4;
               ++this.kD;
               var3 = true;
               if (var7 == 0 && com.rsc.a.a.l(var5).aA()) {
                  this.kC[this.kD - 1] = this.a.nh[var2] < var1 ? this.a.nh[var2] : var1;
                  break;
               }
            }
         }
      }

      if (var3) {
         this.a.n().aO(33);
         this.a.n().aK(this.kD);

         for(var7 = 0; this.kD > var7; ++var7) {
            this.a.n().aL(this.kB[var7]);
            this.a.n().aN(this.kC[var7]);
         }

         this.a.n().dW();
         this.kF = false;
         this.kE = false;
      }

   }
}
