package com.rsc.d.b;

import com.rsc.a.a.f;
import com.rsc.c.e;

public final class a {
   public int kx = -1;
   private int bq;
   private int br;
   private static final int ky;
   public final e kz;
   private final com.rsc.d jZ;

   public a(com.rsc.d var1) {
      this.jZ = var1;
      this.kz = new e(var1.dB(), 1);
      int var2 = (var1.au() - this.bq) / 2;
      int var3 = (var1.av() - this.br) / 2;
   }

   public void bO() {
      short var1 = 408;
      short var2 = 334;
      if (this.jZ.oP > 0 && this.jZ.oL <= 48) {
         this.jZ.oP = 0;
      }

      if (this.jZ.oP > 1 && this.jZ.oL <= 96) {
         this.jZ.oP = 1;
      }

      if (this.jZ.oL <= this.jZ.oR || this.jZ.oR < 0) {
         this.jZ.oR = -1;
      }

      if (this.jZ.oP > 2 && this.jZ.oL <= 144) {
         this.jZ.oP = 2;
      }

      if (this.jZ.oR != -1 && this.jZ.oM[this.jZ.oR] != this.jZ.oQ) {
         this.jZ.oR = -1;
         this.jZ.oQ = -2;
      }

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      if (this.jZ.cE() == com.rsc.b.b.cu && this.jZ.t() != 0) {
         this.jZ.e(0);
         var3 = var1 / 2 + (this.jZ.u() - 256);
         var4 = this.jZ.w() - (170 - var2 / 2);
         if (var3 >= 0 && var4 >= 12 && var3 < 408 && var4 < 280) {
            var5 = this.jZ.oP * 48;

            for(var6 = 0; var6 < 6; ++var6) {
               for(var7 = 0; var7 < 8; ++var7) {
                  var8 = 7 + var7 * 49;
                  var9 = var6 * 34 + 28;
                  if (var8 < var3 && 49 + var8 > var3 && var9 < var4 && var9 + 34 > var4 && this.jZ.oL > var5 && this.jZ.oM[var5] != -1) {
                     this.jZ.oQ = this.jZ.oM[var5];
                     this.jZ.oR = var5;
                  }

                  ++var5;
               }
            }

            var4 = 170 - var2 / 2;
            var3 = 256 - var1 / 2;
            if (this.jZ.oR >= 0) {
               var5 = this.jZ.oM[this.jZ.oR];
            } else {
               var5 = -1;
            }

            if (var5 != -1) {
               var6 = this.jZ.oN[this.jZ.oR];
               if (var6 >= 1 && 220 + var3 <= this.jZ.u() && this.jZ.w() >= 238 + var4 && this.jZ.u() < var3 + 250 && 249 + var4 >= this.jZ.w()) {
                  this.jZ.n().aO(22);
                  this.jZ.n().aL(var5);
                  this.jZ.n().aN(1);
                  this.jZ.n().aN(305419896);
                  this.jZ.n().dW();
               }

               if (var6 >= 5 && this.jZ.u() >= 250 + var3 && this.jZ.w() >= var4 + 238 && 280 + var3 > this.jZ.u() && var4 + 249 >= this.jZ.w()) {
                  this.jZ.n().aO(22);
                  this.jZ.n().aL(var5);
                  this.jZ.n().aN(5);
                  this.jZ.n().aN(305419896);
                  this.jZ.n().dW();
               }

               if (var6 >= 10 && var3 + 280 <= this.jZ.u() && 238 + var4 <= this.jZ.w() && this.jZ.u() < var3 + 305 && this.jZ.w() <= 249 + var4) {
                  this.jZ.n().aO(22);
                  this.jZ.n().aL(var5);
                  this.jZ.n().aN(10);
                  this.jZ.n().aN(305419896);
                  this.jZ.n().dW();
               }

               if (var6 >= 50 && this.jZ.u() >= var3 + 305 && var4 + 238 <= this.jZ.w() && this.jZ.u() < 335 + var3 && var4 + 249 >= this.jZ.w()) {
                  this.jZ.n().aO(22);
                  this.jZ.n().aL(var5);
                  this.jZ.n().aN(50);
                  this.jZ.n().aN(305419896);
                  this.jZ.n().dW();
               }

               if (335 + var3 <= this.jZ.u() && var4 + 238 <= this.jZ.w() && var3 + 368 > this.jZ.u() && this.jZ.w() <= 249 + var4) {
                  this.jZ.a(new String[]{"Please enter the number of items to withdraw", "and press enter"}, com.rsc.b.b.cx, true);
               }

               if (this.jZ.u() >= var3 + 370 && var4 + 238 <= this.jZ.w() && var3 + 400 > this.jZ.u() && 249 + var4 >= this.jZ.w()) {
                  this.jZ.n().aO(22);
                  this.jZ.n().aL(var5);
                  this.jZ.n().aN(var6);
                  this.jZ.n().aN(305419896);
                  this.jZ.n().dW();
               }

               if (this.jZ.aB(var5) >= 1 && var3 + 220 <= this.jZ.u() && var4 + 263 <= this.jZ.w() && var3 + 250 > this.jZ.u() && 274 + var4 >= this.jZ.w()) {
                  this.jZ.n().aO(23);
                  this.jZ.n().aL(var5);
                  this.jZ.n().aN(1);
                  this.jZ.n().aN(-2023406815);
                  this.jZ.n().dW();
               }

               if (this.jZ.aB(var5) >= 5 && var3 + 250 <= this.jZ.u() && 263 + var4 <= this.jZ.w() && var3 + 280 > this.jZ.u() && 274 + var4 >= this.jZ.w()) {
                  this.jZ.n().aO(23);
                  this.jZ.n().aL(var5);
                  this.jZ.n().aN(5);
                  this.jZ.n().aN(-2023406815);
                  this.jZ.n().dW();
               }

               if (this.jZ.aB(var5) >= 10 && this.jZ.u() >= var3 + 280 && this.jZ.w() >= var4 + 263 && this.jZ.u() < var3 + 305 && this.jZ.w() <= var4 + 274) {
                  this.jZ.n().aO(23);
                  this.jZ.n().aL(var5);
                  this.jZ.n().aN(10);
                  this.jZ.n().aN(-2023406815);
                  this.jZ.n().dW();
               }

               if (this.jZ.aB(var5) >= 50 && var3 + 305 <= this.jZ.u() && 263 + var4 <= this.jZ.w() && this.jZ.u() < var3 + 335 && 274 + var4 >= this.jZ.w()) {
                  this.jZ.n().aO(23);
                  this.jZ.n().aL(var5);
                  this.jZ.n().aN(50);
                  this.jZ.n().aN(-2023406815);
                  this.jZ.n().dW();
               }

               if (this.jZ.u() >= var3 + 335 && this.jZ.w() >= var4 + 263 && var3 + 368 > this.jZ.u() && var4 + 274 >= this.jZ.w()) {
                  this.jZ.a(new String[]{"Please enter the number of items to deposit", "and press enter"}, com.rsc.b.b.cy, true);
               }

               if (this.jZ.u() >= 370 + var3 && this.jZ.w() >= 263 + var4 && this.jZ.u() < 400 + var3 && var4 + 274 >= this.jZ.w()) {
                  this.jZ.n().aO(23);
                  this.jZ.n().aL(var5);
                  this.jZ.n().aN(this.jZ.aB(var5));
                  this.jZ.n().aN(-2023406815);
                  this.jZ.n().dW();
               }
            }
         } else if (this.jZ.oL > 48 && var3 >= 50 && var3 <= 115 && var4 <= 12) {
            this.jZ.oP = 0;
         } else if (this.jZ.oL > 48 && var3 >= 115 && var3 <= 180 && var4 <= 12) {
            this.jZ.oP = 1;
         } else if (this.jZ.oL > 96 && var3 >= 180 && var3 <= 245 && var4 <= 12) {
            this.jZ.oP = 2;
         } else {
            if (this.jZ.oL <= 144 || var3 < 245 || var3 > 310 || var4 > 12) {
               this.jZ.n().aO(212);
               this.jZ.n().dW();
               this.jZ.qV = false;
               return;
            }

            this.jZ.oP = 3;
         }
      }

      var3 = 256 - var1 / 2;
      var4 = 170 - var2 / 2;
      this.jZ.dB().e(var3, var4, 408, 12, 192);
      var5 = 10000536;
      this.jZ.dB().g(var3, var4 + 12, 408, 17, var5, 160);
      this.jZ.dB().g(var3, var4 + 29, 8, 204, var5, 160);
      this.jZ.dB().g(var3 + 399, var4 + 29, 9, 204, var5, 160);
      this.jZ.dB().g(var3, 233 + var4, 408, 47, var5, 160);
      this.jZ.dB().a((String)"Bank", var3 + 1, 10 + var4, 16777215, 1);
      var5 = 50;
      if (this.jZ.oL > 48) {
         var6 = 16777215;
         if (this.jZ.oP == 0) {
            var6 = 16711680;
         } else if (var5 + var3 < this.jZ.u() && this.jZ.w() >= var4 && this.jZ.u() < 65 + var3 + var5 && this.jZ.w() < var4 + 12) {
            var6 = 16776960;
         }

         this.jZ.dB().a((String)"<page 1>", var3 + var5, 10 + var4, var6, 1);
         var5 += 65;
         var6 = 16777215;
         if (this.jZ.oP == 1) {
            var6 = 16711680;
         } else if (var3 + var5 < this.jZ.u() && this.jZ.w() >= var4 && 65 + var5 + var3 > this.jZ.u() && this.jZ.w() < 12 + var4) {
            var6 = 16776960;
         }

         this.jZ.dB().a((String)"<page 2>", var3 + var5, var4 + 10, var6, 1);
         var5 += 65;
      }

      if (this.jZ.oL > 96) {
         var6 = 16777215;
         if (this.jZ.oP != 2) {
            if (var3 + var5 < this.jZ.u() && this.jZ.w() >= var4 && this.jZ.u() < 65 + var5 + var3 && this.jZ.w() < var4 + 12) {
               var6 = 16776960;
            }
         } else {
            var6 = 16711680;
         }

         this.jZ.dB().a((String)"<page 3>", var3 + var5, var4 + 10, var6, 1);
         var5 += 65;
      }

      if (this.jZ.oL > 144) {
         var6 = 16777215;
         if (this.jZ.oP == 3) {
            var6 = 16711680;
         } else if (var5 + var3 < this.jZ.u() && this.jZ.w() >= var4 && 65 + var3 + var5 > this.jZ.u() && var4 + 12 > this.jZ.w()) {
            var6 = 16776960;
         }

         this.jZ.dB().a((String)"<page 4>", var5 + var3, var4 + 10, var6, 1);
         var5 += 65;
      }

      var5 = 16777215;
      if (this.jZ.u() > 320 + var3 && var4 <= this.jZ.w() && this.jZ.u() < 408 + var3 && this.jZ.w() < var4 + 12) {
         var5 = 16711680;
      }

      this.jZ.dB().a(406 + var3, "Close window", var4 + 10, var5, 1);
      this.jZ.dB().a((String)"Number in bank in green", var3 + 7, 24 + var4, 65280, 1);
      this.jZ.dB().a((String)"Number held in blue", 289 + var3, 24 + var4, 65535, 1);
      var5 = this.jZ.oP * 48;

      for(var6 = 0; var6 < 6; ++var6) {
         for(var7 = 0; var7 < 8; ++var7) {
            var8 = var7 * 49 + var3 + 7;
            var9 = var6 * 34 + var4 + 28;
            if (var5 == this.jZ.oR) {
               this.jZ.dB().g(var8, var9, 49, 34, 16711680, 160);
            } else {
               this.jZ.dB().g(var8, var9, 49, 34, 13684944, 160);
            }

            this.jZ.dB().f(var8, 50, var9, 35, 0);
            if (this.jZ.oL > var5 && this.jZ.oM[var5] != -1) {
               f var10 = com.rsc.a.a.l(this.jZ.oM[var5]);
               this.jZ.dB().a(this.jZ.dB().ad(var10.bo), var8, var9, 48, 32, var10.aB(), 0, 0, 255, false, 0, 1);
               this.jZ.dB().a((String)("" + this.jZ.oN[var5]), var8 + 1, var9 + 10, 65280, 1);
               this.jZ.dB().a(var8 + 47, "" + this.jZ.aB(this.jZ.oM[var5]), 29 + var9, 65535, 1);
            }

            ++var5;
         }
      }

      this.jZ.dB().m(var3 + 5, var4 + 256, 398, 0);
      if (this.jZ.oR != -1) {
         if (this.jZ.oR < 0) {
            var5 = -1;
         } else {
            var5 = this.jZ.oM[this.jZ.oR];
         }

         if (var5 != -1) {
            var6 = this.jZ.oN[this.jZ.oR];
            if (com.rsc.a.a.l(var5).aA() && var6 > 1) {
               var6 = 1;
            }

            if (var6 > 0) {
               var7 = 16777215;
               this.jZ.dB().a((String)("Withdraw " + com.rsc.a.a.l(var5).ad()), var3 + 2, 248 + var4, 16777215, 1);
               if (this.jZ.u() >= 220 + var3 && 238 + var4 <= this.jZ.w() && this.jZ.u() < var3 + 250 && this.jZ.w() <= var4 + 249) {
                  var7 = 16711680;
               }

               this.jZ.dB().a((String)"One", 222 + var3, 248 + var4, var7, 1);
               if (var6 >= 5) {
                  var7 = 16777215;
                  if (250 + var3 <= this.jZ.u() && 238 + var4 <= this.jZ.w() && this.jZ.u() < var3 + 280 && var4 + 249 >= this.jZ.w()) {
                     var7 = 16711680;
                  }

                  this.jZ.dB().a((String)"Five", var3 + 252, 248 + var4, var7, 1);
               }

               if (var6 >= 10) {
                  var7 = 16777215;
                  if (var3 + 280 <= this.jZ.u() && 238 + var4 <= this.jZ.w() && 305 + var3 > this.jZ.u() && this.jZ.w() <= 249 + var4) {
                     var7 = 16711680;
                  }

                  this.jZ.dB().a((String)"10", 282 + var3, 248 + var4, var7, 1);
               }

               if (var6 >= 50) {
                  var7 = 16777215;
                  if (this.jZ.u() >= 305 + var3 && var4 + 238 <= this.jZ.w() && this.jZ.u() < 335 + var3 && var4 + 249 >= this.jZ.w()) {
                     var7 = 16711680;
                  }

                  this.jZ.dB().a((String)"50", 307 + var3, var4 + 248, var7, 1);
               }

               var7 = 16777215;
               if (this.jZ.u() >= 335 + var3 && 238 + var4 <= this.jZ.w() && this.jZ.u() < var3 + 368 && var4 + 249 >= this.jZ.w()) {
                  var7 = 16711680;
               }

               this.jZ.dB().a((String)"X", 337 + var3, 248 + var4, var7, 1);
               var7 = 16777215;
               if (370 + var3 <= this.jZ.u() && this.jZ.w() >= 238 + var4 && this.jZ.u() < 400 + var3 && this.jZ.w() <= var4 + 249) {
                  var7 = 16711680;
               }

               this.jZ.dB().a((String)"All", 370 + var3, 248 + var4, var7, 1);
            }

            if (this.jZ.aB(var5) > 0) {
               this.jZ.dB().a((String)("Deposit " + com.rsc.a.a.l(var5).ad()), var3 + 2, var4 + 273, 16777215, 1);
               var7 = 16777215;
               if (this.jZ.u() >= var3 + 220 && var4 + 263 <= this.jZ.w() && 250 + var3 > this.jZ.u() && var4 + 274 >= this.jZ.w()) {
                  var7 = 16711680;
               }

               this.jZ.dB().a((String)"One", 222 + var3, var4 + 273, var7, 1);
               if (this.jZ.aB(var5) >= 5) {
                  var7 = 16777215;
                  if (this.jZ.u() >= var3 + 250 && this.jZ.w() >= var4 + 263 && this.jZ.u() < var3 + 280 && 274 + var4 >= this.jZ.w()) {
                     var7 = 16711680;
                  }

                  this.jZ.dB().a((String)"Five", var3 + 252, 273 + var4, var7, 1);
               }

               if (this.jZ.aB(var5) >= 10) {
                  var7 = 16777215;
                  if (this.jZ.u() >= 280 + var3 && this.jZ.w() >= var4 + 263 && var3 + 305 > this.jZ.u() && this.jZ.w() <= 274 + var4) {
                     var7 = 16711680;
                  }

                  this.jZ.dB().a((String)"10", 282 + var3, 273 + var4, var7, 1);
               }

               if (this.jZ.aB(var5) >= 50) {
                  var7 = 16777215;
                  if (this.jZ.u() >= var3 + 305 && var4 + 263 <= this.jZ.w() && this.jZ.u() < 335 + var3 && 274 + var4 >= this.jZ.w()) {
                     var7 = 16711680;
                  }

                  this.jZ.dB().a((String)"50", 307 + var3, 273 + var4, var7, 1);
               }

               var7 = 16777215;
               if (335 + var3 <= this.jZ.u() && var4 + 263 <= this.jZ.w() && this.jZ.u() < 368 + var3 && this.jZ.w() <= 274 + var4) {
                  var7 = 16711680;
               }

               this.jZ.dB().a((String)"X", 337 + var3, var4 + 273, var7, 1);
               var7 = 16777215;
               if (this.jZ.u() >= 370 + var3 && this.jZ.w() >= 263 + var4 && this.jZ.u() < 400 + var3 && var4 + 274 >= this.jZ.w()) {
                  var7 = 16711680;
               }

               this.jZ.dB().a((String)"All", 370 + var3, 273 + var4, var7, 1);
            }
         }
      } else {
         this.jZ.dB().a(var3 + 204, "Select an object to withdraw or deposit", 16776960, 0, 3, 248 + var4);
      }

   }

   static {
      ky = com.rsc.c.A() ? com.rsc.c.ar : 1;
   }
}
