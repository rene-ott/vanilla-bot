package com.rsc.d.b;

import com.rsc.c.k;
import com.rsc.e.h;
import com.rsc.g.l;

public class b {
   private final com.rsc.d a;
   private final k M;
   private final com.rsc.c.b kG;
   public final int[] kH = new int[8];
   public final int[] kI = new int[8];
   public int kJ = 0;
   public boolean kK = false;
   public boolean kL = false;
   private boolean kM = false;
   private int kN;
   private int kO;
   public int kP;
   public int kQ;
   public int kR;
   public int kS;
   public int kT;
   public boolean kU = false;
   public boolean kV = false;
   public boolean kW = false;
   public boolean kX = false;
   public boolean kY = false;
   public boolean kZ = false;
   public boolean la = false;
   public String lb = "";
   public String lc;
   public int ld = 0;
   public int le = 0;
   public int lf = 0;
   public final int[] lg = new int[8];
   public final int[] lh = new int[8];
   public final int[] li = new int[8];
   public final int[] lj = new int[8];
   public final int[] lk = new int[8];
   public final int[] ll = new int[8];

   public b(com.rsc.d var1) {
      this.a = var1;
      this.M = var1.dC();
      this.kG = new com.rsc.c.b(this.M, 1, "");
   }

   public void bv() {
      if (this.kY) {
         this.bQ();
      } else if (this.kZ) {
         this.bR();
      }

   }

   private void bQ() {
      int var1 = -1;
      if (this.a.t() != 0 && this.kM) {
         var1 = this.kG.a(this.a.u(), this.a.w(), this.kN, this.kO);
      }

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (var1 >= 0) {
         this.a.e(0);
         this.kM = false;
         com.rsc.c.d var2 = this.kG.v(var1);
         var3 = this.kG.B(var1);
         var4 = -1;
         var5 = 0;
         if (var2 != com.rsc.c.d.eK) {
            for(var6 = 0; this.kJ > var6; ++var6) {
               if (this.kH[var6] == var3) {
                  if (var4 < 0) {
                     var4 = var6;
                  }

                  if (com.rsc.a.a.l(var3).aA()) {
                     var5 = this.kI[var6];
                     break;
                  }

                  ++var5;
               }
            }
         } else {
            for(var6 = 0; this.a.dH() > var6; ++var6) {
               if (var3 == this.a.nm[var6]) {
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
         }

         if (var4 >= 0) {
            var6 = this.kG.y(var1);
            if (var6 != -2) {
               if (var6 == -1) {
                  var6 = var5;
               }

               if (var2 == com.rsc.c.d.eK) {
                  this.z(var6, var4);
               } else {
                  this.y(var4, var6);
               }
            } else {
               this.kP = var4;
               if (var2 == com.rsc.c.d.eK) {
                  this.a.a(new String[]{"Enter number of items to stake and press enter"}, com.rsc.b.b.cC, true);
               } else {
                  this.a.a(new String[]{"Enter number of items to remove and press enter"}, com.rsc.b.b.cD, true);
               }
            }
         }
      } else if (this.a.cF() == com.rsc.b.b.cv) {
         if (this.a.t() == 1 && this.a.v() == 0) {
            this.a.f(1);
         }

         int var10 = this.a.u() - 22;
         var3 = this.a.w() - 36;
         if (var10 >= 0 && var3 >= 0 && var10 < 468 && var3 < 262) {
            if (this.a.v() > 0) {
               if (var10 > 216 && var3 > 30 && var10 < 462 && var3 < 235) {
                  var4 = (var10 - 217) / 49 + (var3 - 31) / 34 * 5;
                  if (var4 >= 0 && this.a.dH() > var4) {
                     this.z(-1, var4);
                  }
               }

               if (var10 > 8 && var3 > 30 && var10 < 205 && var3 < 129) {
                  var4 = (var10 - 9) / 49 + (var3 - 31) / 34 * 4;
                  if (var4 >= 0 && var4 < this.kJ) {
                     this.y(var4, -1);
                  }
               }

               boolean var13 = false;
               if (var10 >= 93 && var3 >= 221 && var10 <= 104 && var3 <= 232) {
                  var13 = true;
                  this.kW = !this.kW;
               }

               if (var10 >= 93 && var3 >= 240 && var10 <= 104 && var3 <= 251) {
                  this.kU = !this.kU;
                  var13 = true;
               }

               if (var10 >= 191 && var3 >= 221 && var10 <= 202 && var3 <= 232) {
                  this.kV = !this.kV;
                  var13 = true;
               }

               if (var10 >= 191 && var3 >= 240 && var10 <= 202 && var3 <= 251) {
                  var13 = true;
                  this.kX = !this.kX;
               }

               if (var13) {
                  this.a.n().aO(8);
                  this.a.n().aK(!this.kW ? 0 : 1);
                  this.a.n().aK(this.kU ? 1 : 0);
                  this.a.n().aK(!this.kV ? 0 : 1);
                  this.a.n().aK(!this.kX ? 0 : 1);
                  this.a.n().dX();
                  this.kL = false;
                  this.kK = false;
               }

               if (var10 >= 217 && var3 >= 238 && var10 <= 286 && var3 <= 259) {
                  this.kK = true;
                  this.a.n().aO(176);
                  this.a.n().dX();
               }

               if (var10 >= 394 && var3 >= 238 && var10 < 463 && var3 < 259) {
                  this.kY = false;
                  this.a.n().aO(197);
                  this.a.n().dX();
               }

               this.a.f(0);
               this.a.e(0);
            }

            if (this.a.t() == 2) {
               if (var10 > 216 && var3 > 30 && var10 < 462 && var3 < 235) {
                  var4 = this.a.os.au();
                  var5 = this.a.os.av();
                  this.a.ou = this.a.w() - 7;
                  this.a.ot = this.a.u() - var4 / 2;
                  this.a.oB = true;
                  if (this.a.ou < 0) {
                     this.a.ou = 0;
                  }

                  if (this.a.ot < 0) {
                     this.a.ot = 0;
                  }

                  if (var4 + this.a.ot > 510) {
                     this.a.ot = 510 - var4;
                  }

                  if (var5 + this.a.ou > 315) {
                     this.a.ou = 315 - var5;
                  }

                  var6 = (var10 - 217) / 49 + (var3 - 31) / 34 * 5;
                  if (var6 >= 0 && this.a.dH() > var6) {
                     var7 = this.a.nm[var6];
                     this.kM = true;
                     this.kG.E(0);
                     this.kG.a(com.rsc.c.d.eK, "Stake 1", "@lre@" + com.rsc.a.a.l(var7).ad(), var7, 1);
                     this.kG.a(com.rsc.c.d.eK, "Stake 5", "@lre@" + com.rsc.a.a.l(var7).ad(), var7, 5);
                     this.kG.a(com.rsc.c.d.eK, "Stake 10", "@lre@" + com.rsc.a.a.l(var7).ad(), var7, 10);
                     this.kG.a(com.rsc.c.d.eK, "Stake All", "@lre@" + com.rsc.a.a.l(var7).ad(), var7, -1);
                     this.kG.a(com.rsc.c.d.eK, "Stake X", "@lre@" + com.rsc.a.a.l(var7).ad(), var7, -2);
                     var8 = this.kG.au();
                     int var9 = this.kG.av();
                     this.kO = this.a.w() - 7;
                     this.kN = this.a.u() - var8 / 2;
                     if (this.kN < 0) {
                        this.kN = 0;
                     }

                     if (this.kO < 0) {
                        this.kO = 0;
                     }

                     if (this.kN + var8 > 510) {
                        this.kN = 510 - var8;
                     }

                     if (this.kO + var9 > 315) {
                        this.kO = 315 - var9;
                     }
                  }
               }

               if (var10 > 8 && var3 > 30 && var10 < 205 && var3 < 133) {
                  var4 = (var10 - 9) / 49 + (var3 - 31) / 34 * 4;
                  if (var4 >= 0 && this.kJ > var4) {
                     var5 = this.kH[var4];
                     this.kM = true;
                     this.kG.E(0);
                     this.kG.a(com.rsc.c.d.eL, "Remove 1", "@lre@" + com.rsc.a.a.l(var5).ad(), var5, 1);
                     this.kG.a(com.rsc.c.d.eL, "Remove 5", "@lre@" + com.rsc.a.a.l(var5).ad(), var5, 5);
                     this.kG.a(com.rsc.c.d.eL, "Remove 10", "@lre@" + com.rsc.a.a.l(var5).ad(), var5, 10);
                     this.kG.a(com.rsc.c.d.eL, "Remove All", "@lre@" + com.rsc.a.a.l(var5).ad(), var5, -1);
                     this.kG.a(com.rsc.c.d.eL, "Remove X", "@lre@" + com.rsc.a.a.l(var5).ad(), var5, -2);
                     var6 = this.kG.au();
                     var7 = this.kG.av();
                     this.kO = this.a.w() - 7;
                     this.kN = this.a.u() - var6 / 2;
                     if (this.kN < 0) {
                        this.kN = 0;
                     }

                     if (this.kO < 0) {
                        this.kO = 0;
                     }

                     if (this.kN + var6 > 510) {
                        this.kN = 510 - var6;
                     }

                     if (var7 + this.kO > 315) {
                        this.kO = 315 - var7;
                     }
                  }
               }

               this.a.e(0);
            }

            if (this.kM) {
               var4 = this.kG.au();
               var5 = this.kG.av();
               if (this.kN - 10 > this.a.u() || this.a.w() < this.kO - 10 || this.a.u() > this.kN + var4 + 10 || this.a.w() > 10 + var5 + this.kO) {
                  this.kM = false;
               }
            }
         } else if (this.a.t() != 0) {
            this.kY = false;
            this.a.n().aO(197);
            this.a.n().dX();
         }
      }

      if (this.kY) {
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
         this.M.a((String)("Preparing to duel with: " + this.lb), 1 + var11, var12 + 10, 16777215, 1);
         this.M.a((String)"Your Stake", var11 + 9, 27 + var12, 16777215, 4);
         this.M.a((String)"Opponent's Stake", 9 + var11, 120 + var12, 16777215, 4);
         this.M.a((String)"Duel Options", var11 + 9, var12 + 212, 16777215, 4);
         this.M.a((String)"Your Inventory", var11 + 216, var12 + 27, 16777215, 4);
         this.M.a((String)"No retreating", 9 + var11, 215 + var12 + 16, 16776960, 3);
         this.M.a((String)"No magic", 9 + var11, 250 + var12, 16776960, 3);
         this.M.a((String)"No prayer", 8 + var11 + 102, var12 + 231, 16776960, 3);
         this.M.a((String)"No weapons", 110 + var11, 35 + var12 + 215, 16776960, 3);
         this.M.f(var11 + 93, 11, 215 + var12 + 6, 11, 16776960);
         if (this.kW) {
            this.M.e(var11 + 95, 223 + var12, 7, 7, 16776960);
         }

         this.M.f(93 + var11, 11, 25 + var12 + 215, 11, 16776960);
         if (this.kU) {
            this.M.e(var11 + 95, 215 + var12 + 27, 7, 7, 16776960);
         }

         this.M.f(191 + var11, 11, 221 + var12, 11, 16776960);
         if (this.kV) {
            this.M.e(var11 + 193, 8 + var12 + 215, 7, 7, 16776960);
         }

         this.M.f(var11 + 191, 11, var12 + 215 + 25, 11, 16776960);
         if (this.kX) {
            this.M.e(193 + var11, 215 + var12 + 27, 7, 7, 16776960);
         }

         if (!this.kK) {
            this.M.a(this.M.ae(23), 217 + var11, var12 + 238);
         }

         this.M.a(this.M.ae(24), var11 + 394, var12 + 238);
         if (this.kL) {
            this.M.a(var11 + 341, "Other player", 16777215, -1, 1, 246 + var12);
            this.M.a(341 + var11, "has accepted", 16777215, -1, 1, 256 + var12);
         }

         if (this.kK) {
            this.M.a(252 + var11, "Waiting for", 16777215, -1, 1, var12 + 246);
            this.M.a(252 + var11, "other player", 16777215, -1, 1, 256 + var12);
         }

         for(var6 = 0; this.a.dH() > var6; ++var6) {
            var7 = 217 + var11 + var6 % 5 * 49;
            var8 = var12 + 31 + var6 / 5 * 34;
            this.M.a(this.M.ad(this.a.nm[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.a.nm[var6]).aB(), 0, false, 0, 1);
            if (com.rsc.a.a.l(this.a.nm[var6]).aA()) {
               this.M.a((String)("" + this.a.nn[var6]), var7 + 1, 10 + var8, 16776960, 1);
            }
         }

         for(var6 = 0; this.kJ > var6; ++var6) {
            var7 = var11 + 9 + var6 % 4 * 49;
            var8 = var12 + 31 + var6 / 4 * 34;
            this.M.a(this.M.ad(this.kH[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.kH[var6]).aB(), 0, false, 0, 1);
            if (com.rsc.a.a.l(this.kH[var6]).aA()) {
               this.M.a((String)("" + this.kI[var6]), 1 + var7, 10 + var8, 16776960, 1);
            }

            if (var7 < this.a.u() && this.a.u() < 48 + var7 && var8 < this.a.w() && 32 + var8 > this.a.w()) {
               this.M.a((String)(com.rsc.a.a.l(this.kH[var6]).ad() + ": @whi@" + com.rsc.a.a.l(this.kH[var6]).ar()), 8 + var11, var12 + 273, 16776960, 1);
            }
         }

         for(var6 = 0; var6 < this.ld; ++var6) {
            var7 = var6 % 4 * 49 + 9 + var11;
            var8 = var6 / 4 * 34 + 124 + var12;
            this.M.a(this.M.ad(this.lg[var6]), var7, var8, 48, 32, com.rsc.a.a.l(this.lg[var6]).aB(), 0, false, 0, 1);
            if (com.rsc.a.a.l(this.lg[var6]).aA()) {
               this.M.a((String)("" + this.lh[var6]), 1 + var7, 10 + var8, 16776960, 1);
            }

            if (this.a.u() > var7 && 48 + var7 > this.a.u() && var8 < this.a.w() && this.a.w() < var8 + 32) {
               this.M.a((String)(com.rsc.a.a.l(this.lg[var6]).ad() + ": @whi@" + com.rsc.a.a.l(this.lg[var6]).ar()), var11 + 8, 273 + var12, 16776960, 1);
            }
         }

         if (this.kM) {
            this.kG.b(this.kO, this.kN, this.a.w(), this.a.u());
         }
      }

   }

   private void bR() {
      byte var1 = 22;
      byte var2 = 36;
      this.M.e(var1, var2, 468, 16, 192);
      int var3 = 10000536;
      this.M.g(var1, var2 + 16, 468, 246, var3, 160);
      this.M.a(var1 + 234, "Please confirm your duel with @yel@" + this.lc, 16777215, -1, 1, var2 + 12);
      this.M.a(var1 + 117, "Your stake:", 16776960, -1, 1, var2 + 30);

      int var4;
      String var5;
      for(var4 = 0; this.le > var4; ++var4) {
         var5 = com.rsc.a.a.l(this.li[var4]).ad();
         if (com.rsc.a.a.l(this.li[var4]).aA()) {
            var5 = var5 + " x " + l.aR(this.lj[var4]);
         }

         this.M.a(var1 + 117, var5, 16777215, -1, 1, 42 + var2 + var4 * 12);
      }

      if (this.le == 0) {
         this.M.a(var1 + 117, "Nothing!", 16777215, -1, 1, 42 + var2);
      }

      this.M.a(351 + var1, "Your opponent's stake:", 16776960, -1, 1, 30 + var2);

      for(var4 = 0; var4 < this.lf; ++var4) {
         var5 = com.rsc.a.a.l(this.lk[var4]).ad();
         if (com.rsc.a.a.l(this.lk[var4]).aA()) {
            var5 = var5 + " x " + l.aR(this.ll[var4]);
         }

         this.M.a(var1 + 351, var5, 16777215, -1, 1, var4 * 12 + 42 + var2);
      }

      if (this.lf == 0) {
         this.M.a(351 + var1, "Nothing!", 16777215, -1, 1, 42 + var2);
      }

      if (this.kS == 0) {
         this.M.a(var1 + 234, "You can retreat from this duel", 65280, -1, 1, var2 + 180);
      } else {
         this.M.a(234 + var1, "No retreat is possible!", 16711680, -1, 1, 180 + var2);
      }

      if (this.kQ == 0) {
         this.M.a(234 + var1, "Magic may be used", 65280, -1, 1, var2 + 192);
      } else {
         this.M.a(var1 + 234, "Magic cannot be used", 16711680, -1, 1, 192 + var2);
      }

      if (this.kR == 0) {
         this.M.a(var1 + 234, "Prayer may be used", 65280, -1, 1, 204 + var2);
      } else {
         this.M.a(var1 + 234, "Prayer cannot be used", 16711680, -1, 1, var2 + 204);
      }

      if (this.kT != 0) {
         this.M.a(var1 + 234, "Weapons cannot be used", 16711680, -1, 1, 216 + var2);
      } else {
         this.M.a(var1 + 234, "Weapons may be used", 65280, -1, 1, var2 + 216);
      }

      this.M.a(var1 + 234, "If you are sure click 'Accept' to begin the duel", 16777215, -1, 1, var2 + 230);
      if (!this.la) {
         this.M.a(this.M.ae(23), 83 + var1, 238 + var2);
         this.M.a(this.M.ae(24), var1 - 35 + 352, var2 + 238);
      } else {
         this.M.a(var1 + 234, "Waiting for other player...", 16776960, -1, 1, var2 + 250);
      }

      if (this.a.t() == 1) {
         if (var1 > this.a.u() || this.a.w() < var2 || var1 + 468 < this.a.u() || this.a.w() > 262 + var2) {
            this.kZ = false;
            this.a.n().aO(230);
            this.a.n().dX();
         }

         if (118 + var1 - 35 <= this.a.u() && this.a.u() <= var1 + 118 + 70 && var2 + 238 <= this.a.w() && 238 + var2 + 21 >= this.a.w()) {
            this.la = true;
            this.a.n().aO(77);
            this.a.n().dX();
         }

         if (352 + (var1 - 35) <= this.a.u() && 353 + var1 + 70 >= this.a.u() && var2 + 238 <= this.a.w() && 259 + var2 >= this.a.w()) {
            this.kZ = false;
            this.a.n().aO(197);
            this.a.n().dX();
         }

         this.a.e(0);
      }

   }

   public final void y(int var1, int var2) {
      int var3 = this.kH[var1];
      int var4 = var2 >= 0 ? var2 : this.a.v();
      int var5;
      if (com.rsc.a.a.l(var3).aA()) {
         int[] var10000 = this.kI;
         var10000[var1] -= var4;
         if (this.kI[var1] <= 0) {
            --this.kJ;

            for(var5 = var1; var5 < this.kJ; ++var5) {
               this.kH[var5] = this.kH[var5 + 1];
               this.kI[var5] = this.kI[var5 + 1];
            }
         }
      } else {
         var5 = 0;

         for(int var6 = 0; var6 < this.kJ && var5 < var4; ++var6) {
            if (this.kH[var6] == var3) {
               --this.kJ;
               ++var5;

               for(int var7 = var6; this.kJ > var7; ++var7) {
                  this.kH[var7] = this.kH[1 + var7];
                  this.kI[var7] = this.kI[1 + var7];
               }

               --var6;
            }
         }
      }

      this.a.n().aO(33);
      this.a.n().aK(this.kJ);

      for(var5 = 0; this.kJ > var5; ++var5) {
         this.a.n().aL(this.kH[var5]);
         this.a.n().aN(this.kI[var5]);
      }

      this.a.n().dX();
      this.kK = false;
      this.kL = false;
   }

   public final void z(int var1, int var2) {
      boolean var3 = false;
      int var4 = 0;
      int var5 = this.a.nm[var2];

      int var6;
      int var7;
      for(var6 = 0; var6 < this.kJ; ++var6) {
         if (this.kH[var6] == var5) {
            if (com.rsc.a.a.l(var5).aA()) {
               if (var1 < 0) {
                  for(var7 = 0; var7 < this.a.v(); ++var7) {
                     if (this.kI[var6] < this.a.nn[var2]) {
                        int var10002 = this.kI[var6]++;
                     }

                     var3 = true;
                  }
               } else {
                  int[] var10000 = this.kI;
                  var10000[var6] += var1;
                  if (this.a.nn[var2] < this.kI[var6]) {
                     this.kI[var6] = this.a.nn[var2];
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

      if (com.rsc.a.a.l(var5).bD) {
         var3 = true;
         this.a.a(h.mr, (String)null, (String)null, "This object cannot be added to a duel offer", 0);
      }

      if (!var3) {
         if (var1 < 0) {
            if (this.kJ < 8) {
               this.kH[this.kJ] = var5;
               this.kI[this.kJ] = 1;
               ++this.kJ;
               var3 = true;
            }
         } else {
            for(var7 = 0; var1 > var7 && this.kJ < 8 && var4 < var6; ++var7) {
               this.kH[this.kJ] = var5;
               this.kI[this.kJ] = 1;
               ++var4;
               ++this.kJ;
               var3 = true;
               if (var7 == 0 && com.rsc.a.a.l(var5).aA()) {
                  this.kI[this.kJ - 1] = this.a.nn[var2] < var1 ? this.a.nn[var2] : var1;
                  break;
               }
            }
         }
      }

      if (var3) {
         this.a.n().aO(33);
         this.a.n().aK(this.kJ);

         for(var7 = 0; this.kJ > var7; ++var7) {
            this.a.n().aL(this.kH[var7]);
            this.a.n().aN(this.kI[var7]);
         }

         this.a.n().dX();
         this.kL = false;
         this.kK = false;
      }

   }
}
