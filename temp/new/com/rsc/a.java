package com.rsc;

import com.rsc.c.i;

public class a {
   private final d a;
   private final boolean b = false;
   public boolean c;
   public int d = 550;
   private int e;
   private int f = 0;
   private int g = 0;
   private int h = 1;
   private int i = 0;
   private int j = 0;
   private int k = 128;
   private int l = 912;

   public a(d var1) {
      this.a = var1;
   }

   public void a(i var1) {
      var1.iy = com.rsc.c.ag ? 2800 : 10000;
      var1.iz = 1;
      var1.io = com.rsc.c.ag ? 3100 : 10000;
      if (this.a.rI && !this.c) {
         this.c();
      }

      int var2 = this.i + this.f;
      int var3 = this.j + this.g;
      float var4 = com.rsc.c.am == 0 ? 0.0F : (com.rsc.c.am == 1 ? 200.0F : (com.rsc.c.am == 2 ? 400.0F : -200.0F));
      var1.b(var2, -this.a.N.p(var2, var3) - 64, var3, this.l, this.k * 4, 0, (int)((float)this.d + var4) * 2);
   }

   public void a() {
      this.b();
      if (this.a.rI) {
         byte var1 = 8;
         byte var2 = 7;
         int var3 = this.h * 32;
         int var4 = var3 - this.k;
         byte var5 = 1;
         if (var4 != 0) {
            ++this.e;
            if (var4 <= 128) {
               if (var4 <= 0) {
                  if (var4 >= -128) {
                     if (var4 < 0) {
                        var5 = -1;
                        var4 = -var4;
                     }
                  } else {
                     var4 += 256;
                     var5 = 1;
                  }
               } else {
                  var5 = 1;
               }
            } else {
               var5 = -1;
               var4 = 256 - var4;
            }

            this.k += (var4 * this.e + 255) / 256 * var5;
            this.k &= 255;
         } else {
            this.e = 0;
         }

         if (this.e == 0) {
            int var6;
            if (this.a.oj) {
               this.a.oj = false;
               this.h = 1 + this.h & var2;
               if (!this.c) {
                  if ((1 & this.h) == 0) {
                     this.h = var2 & 1 + this.h;
                  }

                  for(var6 = 0; var6 < var1 && !this.b(this.h); ++var6) {
                     this.h = 1 + this.h & var2;
                  }
               }
            }

            if (this.a.ok) {
               this.a.ok = false;
               this.h = var2 + this.h & var2;
               if (!this.c) {
                  if ((1 & this.h) == 0) {
                     this.h = this.h + var2 & var2;
                  }

                  for(var6 = 0; var6 < var1 && !this.b(this.h); ++var6) {
                     this.h = this.h + var2 & var2;
                  }
               }
            }
         }
      } else if (this.a.oj) {
         this.k = 255 & this.k + 2;
      } else if (this.a.ok) {
         this.k = 255 & this.k - 2;
      } else if (this.a.om) {
         this.d += 20;
         if (this.d > 1200) {
            this.d = 1200;
         }
      } else if (this.a.ol) {
         this.d -= 20;
         if (this.d < 550) {
            this.d = 550;
         }
      }

   }

   private void b() {
      if (this.i - this.a.oG.ch() < -500 || this.i - this.a.oG.ch() > 500 || this.j - this.a.oG.ci() < -500 || this.j - this.a.oG.ci() > 500) {
         this.i = this.a.oG.ch();
         this.j = this.a.oG.ci();
      }

      if (this.a.oG.ci() != this.j) {
         this.j += (this.a.oG.ci() - this.j) / ((this.d - 500) / 15 + 16);
      }

      if (this.i != this.a.oG.ch()) {
         this.i += (this.a.oG.ch() - this.i) / ((this.d - 500) / 15 + 16);
      }

   }

   private final void c() {
      byte var1 = 8;
      int var2 = var1 - 1;
      if ((this.d() & 1) != 1 || !this.b(this.d())) {
         if ((1 & this.d()) == 0 && this.b(this.d())) {
            if (!this.b(1 + this.d() & var2)) {
               if (this.b(var2 & var2 + this.d())) {
                  this.a(var2 & var2 + this.d());
               }
            } else {
               this.a(var2 & 1 + this.d());
            }
         } else {
            int[] var3 = new int[]{1, -1, 2, -2, 3, -3, 4};

            for(int var4 = 0; var4 < var2; ++var4) {
               if (this.b(var2 & var1 + this.d() + var3[var4])) {
                  this.a(var2 & this.d() + var3[var4] + var1);
                  break;
               }
            }

            if ((1 & this.d()) == 0 && this.b(this.d())) {
               if (this.b(var2 & 1 + this.d())) {
                  this.a(1 + this.d() & var2);
               } else if (this.b(var2 + this.d() & var2)) {
                  this.a(var2 & var2 + this.d());
               }
            }
         }
      }

   }

   private int d() {
      return this.h;
   }

   private void a(int var1) {
      this.h = var1;
   }

   private final boolean b(int var1) {
      int var2 = this.a.oG.ch() / 128;
      int var3 = this.a.oG.ci() / 128;

      for(int var4 = 2; var4 >= 1; --var4) {
         if (var1 == 1 && ((128 & this.a.N.jH[var2][var3 - var4]) == 128 || (128 & this.a.N.jH[var2 - var4][var3]) == 128 || (this.a.N.jH[var2 - var4][var3 - var4] & 128) == 128)) {
            return false;
         }

         if (var1 == 3 && ((128 & this.a.N.jH[var2][var4 + var3]) == 128 || (this.a.N.jH[var2 - var4][var3] & 128) == 128 || (128 & this.a.N.jH[var2 - var4][var4 + var3]) == 128)) {
            return false;
         }

         if (var1 == 5 && ((this.a.N.jH[var2][var3 + var4] & 128) == 128 || (this.a.N.jH[var4 + var2][var3] & 128) == 128 || (this.a.N.jH[var2 + var4][var3 + var4] & 128) == 128)) {
            return false;
         }

         if (var1 == 7 && ((this.a.N.jH[var2][var3 - var4] & 128) == 128 || (128 & this.a.N.jH[var4 + var2][var3]) == 128 || (128 & this.a.N.jH[var4 + var2][var3 - var4]) == 128)) {
            return false;
         }

         if (var1 == 0 && (this.a.N.jH[var2][var3 - var4] & 128) == 128) {
            return false;
         }

         if (var1 == 2 && (this.a.N.jH[var2 - var4][var3] & 128) == 128) {
            return false;
         }

         if (var1 == 4 && (128 & this.a.N.jH[var2][var4 + var3]) == 128) {
            return false;
         }

         if (var1 == 6 && (this.a.N.jH[var2 + var4][var3] & 128) == 128) {
            return false;
         }
      }

      return true;
   }

   public int e() {
      return this.k;
   }

   public void c(int var1) {
      this.k = var1;
   }
}
