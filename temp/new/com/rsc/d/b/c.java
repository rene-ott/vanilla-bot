package com.rsc.d.b;

import com.rsc.c.k;
import com.rsc.g.f;

public class c {
   private final com.rsc.d a;
   private final k M;
   public boolean lm;
   public byte ln;
   public int lo;
   public int lp = 0;
   public int lq = 0;
   public int lr = -1;
   public int ls = -2;
   public int lt = 0;
   public final int[] lu = new int[256];
   public final int[] lv = new int[256];
   public final int[] lw = new int[256];
   public final int[] lx = new int[256];

   public c(com.rsc.d var1) {
      this.a = var1;
      this.M = var1.dC();
   }

   public void bS() {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if (this.a.t() != 0 && this.a.cF() == com.rsc.b.b.cv) {
         this.a.e(0);
         var1 = this.a.u() - (this.a.au() - 408) / 2;
         var2 = this.a.w() - (this.a.av() - 246) / 2;
         if (var1 < 0 || var2 < 12 || var1 >= 408 || var2 >= 265) {
            this.a.n().aO(166);
            this.a.n().dX();
            this.lm = false;
            return;
         }

         var3 = 0;

         for(var4 = 0; var4 < 5; ++var4) {
            for(var5 = 0; var5 < 8; ++var5) {
               var6 = var5 * 49 + 7;
               var7 = var4 * 34 + 28;
               if (var1 > var6 && 49 + var6 > var1 && var2 > var7 && var7 + 34 > var2 && this.lv[var3] != -1) {
                  this.lr = var3;
                  this.ls = this.lv[var3];
               }

               ++var3;
            }
         }

         if (this.lr >= 0) {
            var4 = this.lv[this.lr];
            if (var4 != -1) {
               var5 = this.lu[this.lr];
               if (var5 > 0 && var2 >= 204 && var2 <= 215) {
                  byte var10 = 0;
                  if (var1 > 318 && var1 < 330) {
                     var10 = 1;
                  }

                  if (var5 >= 5 && var1 > 333 && var1 < 345) {
                     var10 = 5;
                  }

                  if (var5 >= 10 && var1 > 348 && var1 < 365) {
                     var10 = 10;
                  }

                  if (var5 >= 50 && var1 > 368 && var1 < 385) {
                     var10 = 50;
                  }

                  if (var1 > 388 && var1 < 400) {
                     this.a.a(new String[]{"Type the number of items to buy and press enter"}, com.rsc.b.b.cA, true);
                  }

                  if (var10 > 0) {
                     this.a.n().aO(236);
                     this.a.n().aL(this.lv[this.lr]);
                     this.a.n().aL(var5);
                     this.a.n().aL(var10);
                     this.a.n().dX();
                  }
               }

               var6 = this.a.aB(var4);
               if (var6 > 0 && var2 >= 229 && var2 <= 240) {
                  byte var11 = 0;
                  if (var1 > 318 && var1 < 330) {
                     var11 = 1;
                  }

                  if (var6 >= 5 && var1 > 333 && var1 < 345) {
                     var11 = 5;
                  }

                  if (var6 >= 10 && var1 > 348 && var1 < 365) {
                     var11 = 10;
                  }

                  if (var1 > 388 && var1 < 400) {
                     this.a.a(new String[]{"Type the number of items to sell and press enter"}, com.rsc.b.b.cB, true);
                  }

                  if (var6 >= 50 && var1 > 368 && var1 < 385) {
                     var11 = 50;
                  }

                  if (var11 > 0) {
                     this.a.n().aO(221);
                     this.a.n().aL(this.lv[this.lr]);
                     this.a.n().aL(var5);
                     this.a.n().aL(var11);
                     this.a.n().dX();
                  }
               }
            }
         }
      }

      var1 = (this.a.au() - 408) / 2;
      var2 = (this.a.av() - 246) / 2;
      this.M.e(var1, var2, 408, 12, 192);
      var3 = 10000536;
      this.M.g(var1, 12 + var2, 408, 17, var3, 160);
      this.M.g(var1, var2 + 29, 8, 170, var3, 160);
      this.M.g(var1 + 399, 29 + var2, 9, 170, var3, 160);
      this.M.g(var1, 199 + var2, 408, 47, var3, 160);
      this.M.a((String)"Buying and selling items", var1 + 1, var2 + 10, 16777215, 1);
      var4 = 16777215;
      if (this.a.u() > 320 + var1 && var2 <= this.a.w() && this.a.u() < var1 + 408 && this.a.w() < var2 + 12) {
         var4 = 16711680;
      }

      this.M.a(var1 + 406, "Close window", var2 + 10, var4, 1);
      this.M.a((String)"Shops stock in green", 2 + var1, 24 + var2, 65280, 1);
      this.M.a((String)"Number you own in blue", var1 + 135, var2 + 24, 65535, 1);
      this.M.a((String)("Your money: " + this.a.aB(10) + "gp"), 280 + var1, 24 + var2, 16776960, 1);
      var5 = 0;

      int var8;
      for(var6 = 0; var6 < 5; ++var6) {
         for(var7 = 0; var7 < 8; ++var7) {
            var8 = var7 * 49 + 7 + var1;
            int var9 = var2 + 28 + var6 * 34;
            if (this.lr == var5) {
               this.M.g(var8, var9, 49, 34, 16711680, 160);
            } else {
               this.M.g(var8, var9, 49, 34, 13684944, 160);
            }

            this.M.f(var8, 50, var9, 35, 0);
            if (this.lv[var5] != -1) {
               this.M.a(this.M.ad(this.lv[var5]), var8, var9, 48, 32, com.rsc.a.a.l(this.lv[var5]).aB(), 0, 0, 255, false, 0, 1);
               this.M.a((String)("" + this.lu[var5]), 1 + var8, 10 + var9, 65280, 1);
               this.M.a(47 + var8, "" + this.a.aB(this.lv[var5]), 10 + var9, 65535, 1);
            }

            ++var5;
         }
      }

      this.M.m(5 + var1, var2 + 222, 398, 0);
      if (this.lr != -1) {
         var5 = this.lv[this.lr];
         if (var5 != -1) {
            var6 = this.lu[this.lr];
            if (var6 <= 0) {
               this.M.c(204 + var1, 214 + var2, "This item is not currently available to buy", 16776960, 3, -1);
            } else {
               var7 = f.a(com.rsc.a.a.l(var5).az(), this.lw[this.lr], this.lp, true, 1, var6, this.lq);
               this.M.a((String)(com.rsc.a.a.l(var5).ad() + ": buy for " + var7 + "gp each"), 2 + var1, var2 + 214, 16776960, 1);
               boolean var12 = 204 + var2 <= this.a.w() && var2 + 215 >= this.a.w();
               this.M.a((String)"Buy:", var1 + 285, 214 + var2, 16777215, 3);
               var4 = 16777215;
               if (var12 && this.a.u() > 318 + var1 && this.a.u() < var1 + 330) {
                  var4 = 16711680;
               }

               this.M.a((String)"1", var1 + 320, 214 + var2, var4, 3);
               if (var6 >= 5) {
                  var4 = 16777215;
                  if (var12 && this.a.u() > 333 + var1 && this.a.u() < 345 + var1) {
                     var4 = 16711680;
                  }

                  this.M.a((String)"5", 335 + var1, 214 + var2, var4, 3);
               }

               if (var6 >= 10) {
                  var4 = 16777215;
                  if (var12 && 348 + var1 < this.a.u() && this.a.u() < var1 + 365) {
                     var4 = 16711680;
                  }

                  this.M.a((String)"10", 350 + var1, 214 + var2, var4, 3);
               }

               if (var6 >= 50) {
                  var4 = 16777215;
                  if (var12 && this.a.u() > 368 + var1 && 385 + var1 > this.a.u()) {
                     var4 = 16711680;
                  }

                  this.M.a((String)"50", var1 + 370, 214 + var2, var4, 3);
               }

               var4 = 16777215;
               if (var12 && this.a.u() > var1 + 388 && this.a.u() < 400 + var1) {
                  var4 = 16711680;
               }

               this.M.a((String)"X", 390 + var1, 214 + var2, var4, 3);
            }

            var7 = this.a.aB(var5);
            if (var7 <= 0) {
               this.M.c(var1 + 204, 239 + var2, "You do not have any of this item to sell", 16776960, 3, -1);
            } else {
               var8 = f.a(com.rsc.a.a.l(var5).az(), this.lx[this.lr], this.lt, false, 1, var6, this.lq);
               this.M.a((String)(com.rsc.a.a.l(var5).ad() + ": sell for " + var8 + "gp each"), 2 + var1, var2 + 239, 16776960, 1);
               boolean var13 = this.a.w() >= var2 + 229 && var2 + 240 >= this.a.w();
               var4 = 16777215;
               this.M.a((String)"Sell:", var1 + 285, var2 + 239, 16777215, 3);
               if (var13 && var1 + 318 < this.a.u() && this.a.u() < var1 + 330) {
                  var4 = 16711680;
               }

               this.M.a((String)"1", var1 + 320, 239 + var2, var4, 3);
               if (var7 >= 5) {
                  var4 = 16777215;
                  if (var13 && var1 + 333 < this.a.u() && this.a.u() < var1 + 345) {
                     var4 = 16711680;
                  }

                  this.M.a((String)"5", 335 + var1, 239 + var2, var4, 3);
               }

               if (var7 >= 10) {
                  var4 = 16777215;
                  if (var13 && 348 + var1 < this.a.u() && 365 + var1 > this.a.u()) {
                     var4 = 16711680;
                  }

                  this.M.a((String)"10", var1 + 350, 239 + var2, var4, 3);
               }

               if (var7 >= 50) {
                  var4 = 16777215;
                  if (var13 && this.a.u() > var1 + 368 && 385 + var1 > this.a.u()) {
                     var4 = 16711680;
                  }

                  this.M.a((String)"50", var1 + 370, 239 + var2, var4, 3);
               }

               var4 = 16777215;
               if (var13 && this.a.u() > 388 + var1 && var1 + 400 > this.a.u()) {
                  var4 = 16711680;
               }

               this.M.a((String)"X", var1 + 390, var2 + 239, var4, 3);
            }
         }
      } else {
         this.M.c(204 + var1, 214 + var2, "Select an object to buy or sell", 16776960, 3, -1);
      }

   }
}
