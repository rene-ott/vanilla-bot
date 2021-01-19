package com.rsc.d.b;

import com.rsc.a.a.f;
import com.rsc.c.e;

public final class a {
   public int kD = -1;
   private int br;
   private int bs;
   private static final int kE;
   public final e kF;
   private final com.rsc.d ka;

   public a(com.rsc.d var1) {
      this.ka = var1;
      this.kF = new e(var1.dC(), 1);
      int var2 = (var1.au() - this.br) / 2;
      int var3 = (var1.av() - this.bs) / 2;
   }

   public void bP() {
      short var1 = 408;
      short var2 = 334;
      if (this.ka.oV > 0 && this.ka.oR <= 48) {
         this.ka.oV = 0;
      }

      if (this.ka.oV > 1 && this.ka.oR <= 96) {
         this.ka.oV = 1;
      }

      if (this.ka.oR <= this.ka.oX || this.ka.oX < 0) {
         this.ka.oX = -1;
      }

      if (this.ka.oV > 2 && this.ka.oR <= 144) {
         this.ka.oV = 2;
      }

      if (this.ka.oX != -1 && this.ka.oS[this.ka.oX] != this.ka.oW) {
         this.ka.oX = -1;
         this.ka.oW = -2;
      }

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      if (this.ka.cF() == com.rsc.b.b.cv && this.ka.t() != 0) {
         this.ka.e(0);
         var3 = var1 / 2 + (this.ka.u() - 256);
         var4 = this.ka.w() - (170 - var2 / 2);
         if (var3 >= 0 && var4 >= 12 && var3 < 408 && var4 < 280) {
            var5 = this.ka.oV * 48;

            for(var6 = 0; var6 < 6; ++var6) {
               for(var7 = 0; var7 < 8; ++var7) {
                  var8 = 7 + var7 * 49;
                  var9 = var6 * 34 + 28;
                  if (var8 < var3 && 49 + var8 > var3 && var9 < var4 && var9 + 34 > var4 && this.ka.oR > var5 && this.ka.oS[var5] != -1) {
                     this.ka.oW = this.ka.oS[var5];
                     this.ka.oX = var5;
                  }

                  ++var5;
               }
            }

            var4 = 170 - var2 / 2;
            var3 = 256 - var1 / 2;
            if (this.ka.oX >= 0) {
               var5 = this.ka.oS[this.ka.oX];
            } else {
               var5 = -1;
            }

            if (var5 != -1) {
               var6 = this.ka.oT[this.ka.oX];
               if (var6 >= 1 && 220 + var3 <= this.ka.u() && this.ka.w() >= 238 + var4 && this.ka.u() < var3 + 250 && 249 + var4 >= this.ka.w()) {
                  this.ka.n().aO(22);
                  this.ka.n().aL(var5);
                  this.ka.n().aN(1);
                  this.ka.n().aN(305419896);
                  this.ka.n().dX();
               }

               if (var6 >= 5 && this.ka.u() >= 250 + var3 && this.ka.w() >= var4 + 238 && 280 + var3 > this.ka.u() && var4 + 249 >= this.ka.w()) {
                  this.ka.n().aO(22);
                  this.ka.n().aL(var5);
                  this.ka.n().aN(5);
                  this.ka.n().aN(305419896);
                  this.ka.n().dX();
               }

               if (var6 >= 10 && var3 + 280 <= this.ka.u() && 238 + var4 <= this.ka.w() && this.ka.u() < var3 + 305 && this.ka.w() <= 249 + var4) {
                  this.ka.n().aO(22);
                  this.ka.n().aL(var5);
                  this.ka.n().aN(10);
                  this.ka.n().aN(305419896);
                  this.ka.n().dX();
               }

               if (var6 >= 50 && this.ka.u() >= var3 + 305 && var4 + 238 <= this.ka.w() && this.ka.u() < 335 + var3 && var4 + 249 >= this.ka.w()) {
                  this.ka.n().aO(22);
                  this.ka.n().aL(var5);
                  this.ka.n().aN(50);
                  this.ka.n().aN(305419896);
                  this.ka.n().dX();
               }

               if (335 + var3 <= this.ka.u() && var4 + 238 <= this.ka.w() && var3 + 368 > this.ka.u() && this.ka.w() <= 249 + var4) {
                  this.ka.a(new String[]{"Please enter the number of items to withdraw", "and press enter"}, com.rsc.b.b.cy, true);
               }

               if (this.ka.u() >= var3 + 370 && var4 + 238 <= this.ka.w() && var3 + 400 > this.ka.u() && 249 + var4 >= this.ka.w()) {
                  this.ka.n().aO(22);
                  this.ka.n().aL(var5);
                  this.ka.n().aN(var6);
                  this.ka.n().aN(305419896);
                  this.ka.n().dX();
               }

               if (this.ka.aB(var5) >= 1 && var3 + 220 <= this.ka.u() && var4 + 263 <= this.ka.w() && var3 + 250 > this.ka.u() && 274 + var4 >= this.ka.w()) {
                  this.ka.n().aO(23);
                  this.ka.n().aL(var5);
                  this.ka.n().aN(1);
                  this.ka.n().aN(-2023406815);
                  this.ka.n().dX();
               }

               if (this.ka.aB(var5) >= 5 && var3 + 250 <= this.ka.u() && 263 + var4 <= this.ka.w() && var3 + 280 > this.ka.u() && 274 + var4 >= this.ka.w()) {
                  this.ka.n().aO(23);
                  this.ka.n().aL(var5);
                  this.ka.n().aN(5);
                  this.ka.n().aN(-2023406815);
                  this.ka.n().dX();
               }

               if (this.ka.aB(var5) >= 10 && this.ka.u() >= var3 + 280 && this.ka.w() >= var4 + 263 && this.ka.u() < var3 + 305 && this.ka.w() <= var4 + 274) {
                  this.ka.n().aO(23);
                  this.ka.n().aL(var5);
                  this.ka.n().aN(10);
                  this.ka.n().aN(-2023406815);
                  this.ka.n().dX();
               }

               if (this.ka.aB(var5) >= 50 && var3 + 305 <= this.ka.u() && 263 + var4 <= this.ka.w() && this.ka.u() < var3 + 335 && 274 + var4 >= this.ka.w()) {
                  this.ka.n().aO(23);
                  this.ka.n().aL(var5);
                  this.ka.n().aN(50);
                  this.ka.n().aN(-2023406815);
                  this.ka.n().dX();
               }

               if (this.ka.u() >= var3 + 335 && this.ka.w() >= var4 + 263 && var3 + 368 > this.ka.u() && var4 + 274 >= this.ka.w()) {
                  this.ka.a(new String[]{"Please enter the number of items to deposit", "and press enter"}, com.rsc.b.b.cz, true);
               }

               if (this.ka.u() >= 370 + var3 && this.ka.w() >= 263 + var4 && this.ka.u() < 400 + var3 && var4 + 274 >= this.ka.w()) {
                  this.ka.n().aO(23);
                  this.ka.n().aL(var5);
                  this.ka.n().aN(this.ka.aB(var5));
                  this.ka.n().aN(-2023406815);
                  this.ka.n().dX();
               }
            }
         } else if (this.ka.oR > 48 && var3 >= 50 && var3 <= 115 && var4 <= 12) {
            this.ka.oV = 0;
         } else if (this.ka.oR > 48 && var3 >= 115 && var3 <= 180 && var4 <= 12) {
            this.ka.oV = 1;
         } else if (this.ka.oR > 96 && var3 >= 180 && var3 <= 245 && var4 <= 12) {
            this.ka.oV = 2;
         } else {
            if (this.ka.oR <= 144 || var3 < 245 || var3 > 310 || var4 > 12) {
               this.ka.n().aO(212);
               this.ka.n().dX();
               this.ka.rb = false;
               return;
            }

            this.ka.oV = 3;
         }
      }

      var3 = 256 - var1 / 2;
      var4 = 170 - var2 / 2;
      this.ka.dC().e(var3, var4, 408, 12, 192);
      var5 = 10000536;
      this.ka.dC().g(var3, var4 + 12, 408, 17, var5, 160);
      this.ka.dC().g(var3, var4 + 29, 8, 204, var5, 160);
      this.ka.dC().g(var3 + 399, var4 + 29, 9, 204, var5, 160);
      this.ka.dC().g(var3, 233 + var4, 408, 47, var5, 160);
      this.ka.dC().a((String)"Bank", var3 + 1, 10 + var4, 16777215, 1);
      var5 = 50;
      if (this.ka.oR > 48) {
         var6 = 16777215;
         if (this.ka.oV == 0) {
            var6 = 16711680;
         } else if (var5 + var3 < this.ka.u() && this.ka.w() >= var4 && this.ka.u() < 65 + var3 + var5 && this.ka.w() < var4 + 12) {
            var6 = 16776960;
         }

         this.ka.dC().a((String)"<page 1>", var3 + var5, 10 + var4, var6, 1);
         var5 += 65;
         var6 = 16777215;
         if (this.ka.oV == 1) {
            var6 = 16711680;
         } else if (var3 + var5 < this.ka.u() && this.ka.w() >= var4 && 65 + var5 + var3 > this.ka.u() && this.ka.w() < 12 + var4) {
            var6 = 16776960;
         }

         this.ka.dC().a((String)"<page 2>", var3 + var5, var4 + 10, var6, 1);
         var5 += 65;
      }

      if (this.ka.oR > 96) {
         var6 = 16777215;
         if (this.ka.oV != 2) {
            if (var3 + var5 < this.ka.u() && this.ka.w() >= var4 && this.ka.u() < 65 + var5 + var3 && this.ka.w() < var4 + 12) {
               var6 = 16776960;
            }
         } else {
            var6 = 16711680;
         }

         this.ka.dC().a((String)"<page 3>", var3 + var5, var4 + 10, var6, 1);
         var5 += 65;
      }

      if (this.ka.oR > 144) {
         var6 = 16777215;
         if (this.ka.oV == 3) {
            var6 = 16711680;
         } else if (var5 + var3 < this.ka.u() && this.ka.w() >= var4 && 65 + var3 + var5 > this.ka.u() && var4 + 12 > this.ka.w()) {
            var6 = 16776960;
         }

         this.ka.dC().a((String)"<page 4>", var5 + var3, var4 + 10, var6, 1);
         var5 += 65;
      }

      var5 = 16777215;
      if (this.ka.u() > 320 + var3 && var4 <= this.ka.w() && this.ka.u() < 408 + var3 && this.ka.w() < var4 + 12) {
         var5 = 16711680;
      }

      this.ka.dC().a(406 + var3, "Close window", var4 + 10, var5, 1);
      this.ka.dC().a((String)"Number in bank in green", var3 + 7, 24 + var4, 65280, 1);
      this.ka.dC().a((String)"Number held in blue", 289 + var3, 24 + var4, 65535, 1);
      var5 = this.ka.oV * 48;

      for(var6 = 0; var6 < 6; ++var6) {
         for(var7 = 0; var7 < 8; ++var7) {
            var8 = var7 * 49 + var3 + 7;
            var9 = var6 * 34 + var4 + 28;
            if (var5 == this.ka.oX) {
               this.ka.dC().g(var8, var9, 49, 34, 16711680, 160);
            } else {
               this.ka.dC().g(var8, var9, 49, 34, 13684944, 160);
            }

            this.ka.dC().f(var8, 50, var9, 35, 0);
            if (this.ka.oR > var5 && this.ka.oS[var5] != -1) {
               f var10 = com.rsc.a.a.l(this.ka.oS[var5]);
               this.ka.dC().a(this.ka.dC().ad(var10.bp), var8, var9, 48, 32, var10.aB(), 0, 0, 255, false, 0, 1);
               this.ka.dC().a((String)("" + this.ka.oT[var5]), var8 + 1, var9 + 10, 65280, 1);
               this.ka.dC().a(var8 + 47, "" + this.ka.aB(this.ka.oS[var5]), 29 + var9, 65535, 1);
            }

            ++var5;
         }
      }

      this.ka.dC().m(var3 + 5, var4 + 256, 398, 0);
      if (this.ka.oX != -1) {
         if (this.ka.oX < 0) {
            var5 = -1;
         } else {
            var5 = this.ka.oS[this.ka.oX];
         }

         if (var5 != -1) {
            var6 = this.ka.oT[this.ka.oX];
            if (com.rsc.a.a.l(var5).aA() && var6 > 1) {
               var6 = 1;
            }

            if (var6 > 0) {
               var7 = 16777215;
               this.ka.dC().a((String)("Withdraw " + com.rsc.a.a.l(var5).ad()), var3 + 2, 248 + var4, 16777215, 1);
               if (this.ka.u() >= 220 + var3 && 238 + var4 <= this.ka.w() && this.ka.u() < var3 + 250 && this.ka.w() <= var4 + 249) {
                  var7 = 16711680;
               }

               this.ka.dC().a((String)"One", 222 + var3, 248 + var4, var7, 1);
               if (var6 >= 5) {
                  var7 = 16777215;
                  if (250 + var3 <= this.ka.u() && 238 + var4 <= this.ka.w() && this.ka.u() < var3 + 280 && var4 + 249 >= this.ka.w()) {
                     var7 = 16711680;
                  }

                  this.ka.dC().a((String)"Five", var3 + 252, 248 + var4, var7, 1);
               }

               if (var6 >= 10) {
                  var7 = 16777215;
                  if (var3 + 280 <= this.ka.u() && 238 + var4 <= this.ka.w() && 305 + var3 > this.ka.u() && this.ka.w() <= 249 + var4) {
                     var7 = 16711680;
                  }

                  this.ka.dC().a((String)"10", 282 + var3, 248 + var4, var7, 1);
               }

               if (var6 >= 50) {
                  var7 = 16777215;
                  if (this.ka.u() >= 305 + var3 && var4 + 238 <= this.ka.w() && this.ka.u() < 335 + var3 && var4 + 249 >= this.ka.w()) {
                     var7 = 16711680;
                  }

                  this.ka.dC().a((String)"50", 307 + var3, var4 + 248, var7, 1);
               }

               var7 = 16777215;
               if (this.ka.u() >= 335 + var3 && 238 + var4 <= this.ka.w() && this.ka.u() < var3 + 368 && var4 + 249 >= this.ka.w()) {
                  var7 = 16711680;
               }

               this.ka.dC().a((String)"X", 337 + var3, 248 + var4, var7, 1);
               var7 = 16777215;
               if (370 + var3 <= this.ka.u() && this.ka.w() >= 238 + var4 && this.ka.u() < 400 + var3 && this.ka.w() <= var4 + 249) {
                  var7 = 16711680;
               }

               this.ka.dC().a((String)"All", 370 + var3, 248 + var4, var7, 1);
            }

            if (this.ka.aB(var5) > 0) {
               this.ka.dC().a((String)("Deposit " + com.rsc.a.a.l(var5).ad()), var3 + 2, var4 + 273, 16777215, 1);
               var7 = 16777215;
               if (this.ka.u() >= var3 + 220 && var4 + 263 <= this.ka.w() && 250 + var3 > this.ka.u() && var4 + 274 >= this.ka.w()) {
                  var7 = 16711680;
               }

               this.ka.dC().a((String)"One", 222 + var3, var4 + 273, var7, 1);
               if (this.ka.aB(var5) >= 5) {
                  var7 = 16777215;
                  if (this.ka.u() >= var3 + 250 && this.ka.w() >= var4 + 263 && this.ka.u() < var3 + 280 && 274 + var4 >= this.ka.w()) {
                     var7 = 16711680;
                  }

                  this.ka.dC().a((String)"Five", var3 + 252, 273 + var4, var7, 1);
               }

               if (this.ka.aB(var5) >= 10) {
                  var7 = 16777215;
                  if (this.ka.u() >= 280 + var3 && this.ka.w() >= var4 + 263 && var3 + 305 > this.ka.u() && this.ka.w() <= 274 + var4) {
                     var7 = 16711680;
                  }

                  this.ka.dC().a((String)"10", 282 + var3, 273 + var4, var7, 1);
               }

               if (this.ka.aB(var5) >= 50) {
                  var7 = 16777215;
                  if (this.ka.u() >= var3 + 305 && var4 + 263 <= this.ka.w() && this.ka.u() < 335 + var3 && 274 + var4 >= this.ka.w()) {
                     var7 = 16711680;
                  }

                  this.ka.dC().a((String)"50", 307 + var3, 273 + var4, var7, 1);
               }

               var7 = 16777215;
               if (335 + var3 <= this.ka.u() && var4 + 263 <= this.ka.w() && this.ka.u() < 368 + var3 && this.ka.w() <= 274 + var4) {
                  var7 = 16711680;
               }

               this.ka.dC().a((String)"X", 337 + var3, var4 + 273, var7, 1);
               var7 = 16777215;
               if (this.ka.u() >= 370 + var3 && this.ka.w() >= 263 + var4 && this.ka.u() < 400 + var3 && var4 + 274 >= this.ka.w()) {
                  var7 = 16711680;
               }

               this.ka.dC().a((String)"All", 370 + var3, 273 + var4, var7, 1);
            }
         }
      } else {
         this.ka.dC().a(var3 + 204, "Select an object to withdraw or deposit", 16776960, 0, 3, 248 + var4);
      }

   }

   static {
      kE = com.rsc.c.A() ? com.rsc.c.as : 1;
   }
}
