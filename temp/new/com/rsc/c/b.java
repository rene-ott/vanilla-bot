package com.rsc.c;

public final class b {
   private int dv;
   private int dw = 0;
   private int dx = 0;
   private c[] dy;
   public String dz;
   private int dA = 0;
   private k dB;

   public b(k var1, int var2, String var3) {
      this.dv = var2;
      this.dy = new c[10];
      this.dB = var1;
      this.dz = var3;

      for(int var4 = 0; var4 < 10; ++var4) {
         this.dy[var4] = new c();
      }

      this.be();
   }

   private final void a(d var1, String var2, String var3, int var4, int var5, int var6, int var7, int var8, String var9) {
      if (this.dy.length == this.dw) {
         c[] var10 = this.dy;
         this.dy = new c[10 + this.dw];

         for(int var11 = 0; this.dy.length > var11; ++var11) {
            if (this.dw > var11) {
               this.dy[var11] = var10[var11];
            } else {
               this.dy[var11] = new c();
            }
         }
      }

      this.dy[this.dw++].b(var1, var2, var3, var5, var8, var7, var4, var6, var9);
      this.be();
   }

   public final void a(d var1, String var2, String var3, int var4) {
      this.a(var1, var2, var3, var4, 0, 0, 0, 0, (String)null);
   }

   public final void a(d var1, String var2, String var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 0, 0, 0, (String)null);
   }

   public final void a(d var1, String var2, String var3, int var4, int var5, int var6) {
      this.a(var1, var2, var3, var4, var5, var6, 0, 0, (String)null);
   }

   public final void a(d var1, String var2, String var3, int var4, int var5, int var6, int var7) {
      this.a(var1, var2, var3, var4, var5, var6, 0, var7, (String)null);
   }

   public final void a(d var1, String var2, String var3) {
      this.a(var1, var3, var2, 0, 0, 0, 0, 0, (String)null);
   }

   public final void a(d var1, String var2, String var3, String var4) {
      this.a(var1, var3, var2, 0, 0, 0, 0, 0, var4);
   }

   public final void a(d var1, String var2, String var3, int var4, int var5, int var6, int var7, int var8) {
      this.a(var1, var2, var3, var8, var4, var7, var5, var6, (String)null);
   }

   private final void be() {
      int var1 = this.dB.ac(this.dv) + 1;
      if (null == this.dz) {
         this.dx = 0;
         this.dA = 0;
      } else {
         this.dx = var1;
         this.dA = 5 + this.dB.c(this.dv, this.dz);
      }

      for(int var2 = 0; this.dw > var2; ++var2) {
         this.dx += var1;
         int var3 = 5 + this.dB.c(this.dv, this.dy[var2].dI + " " + this.dy[var2].dJ);
         if (var3 > this.dA) {
            this.dA = var3;
         }
      }

   }

   public final int av() {
      return this.dx;
   }

   public final d v(int var1) {
      return this.dy[var1].dK;
   }

   public final String w(int var1) {
      return this.dy[var1].dJ;
   }

   public final String x(int var1) {
      return this.dy[var1].dI;
   }

   public final int y(int var1) {
      return this.dy[var1].dG;
   }

   public final int z(int var1) {
      return this.dy[var1].dC;
   }

   public final int A(int var1) {
      return this.dy[var1].dE;
   }

   public final int B(int var1) {
      return this.dy[var1].dF;
   }

   public final int C(int var1) {
      return this.dy[var1].dD;
   }

   public final String D(int var1) {
      return this.dy[var1].dH;
   }

   public final int au() {
      return this.dA;
   }

   public final int a(int var1, int var2, int var3, int var4) {
      return this.a(var2, var1, var4, var3, false);
   }

   private final int a(int var1, int var2, int var3, int var4, boolean var5) {
      if (this.dA != 0 && this.dx != 0) {
         if (var5) {
            this.dB.g(var4, var3, this.dA, this.dx, 13684944, 160);
         }

         int var6 = 1 + this.dB.ac(this.dv);
         int var7 = var6 + var3 - 3;
         int var8 = -1;
         if (null != this.dz) {
            if (var4 < var2 && var1 > var7 + (3 - var6) && var7 + 3 > var1 && var2 < var4 + this.dA) {
               if (!var5) {
                  return -2;
               }

               var8 = -2;
            }

            if (var5) {
               this.dB.a((String)this.dz, 2 + var4, var7, 65535, this.dv);
            }

            var7 += var6;
         }

         for(int var9 = 0; var9 < this.dw; ++var9) {
            int var10 = 16777215;
            if (var4 < var2 && var1 > 3 + var7 - var6 && var1 < 3 + var7 && var4 + this.dA > var2) {
               var10 = 16776960;
               if (!var5) {
                  return var9;
               }

               var8 = var9;
            }

            if (var5) {
               this.dB.a(this.dy[var9].dI + " " + this.dy[var9].dJ, var4 + 2, var7, var10, this.dv);
            }

            var7 += var6;
         }

         return var8;
      } else {
         return -1;
      }
   }

   public final void E(int var1) {
      this.dw = var1;
      this.be();
   }

   public final int bf() {
      return this.dw;
   }

   public final void F(int var1) {
      if (var1 >= 0 && this.dw > var1) {
         c var2 = this.dy[var1];

         for(int var3 = var1; var3 < this.dw - 1; ++var3) {
            this.dy[var3] = this.dy[1 + var3];
         }

         this.dy[--this.dw] = var2;
         this.be();
      }

   }

   public final int b(int var1, int var2, int var3, int var4) {
      return this.a(var3, var4, var1, var2, true);
   }

   public final void bg() {
      if (this.dw != 0) {
         int[] var1 = new int[this.dw];
         c[] var2 = new c[this.dw];

         int var3;
         for(var3 = 0; this.dw > var3; ++var3) {
            c var4 = this.dy[var3];
            var1[var3] = var4.dK.bh();
            var2[var3] = var4;
         }

         com.rsc.g.a.a(var2, var1);

         for(var3 = 0; var3 < this.dw; ++var3) {
            this.dy[var3] = var2[var3];
         }
      }

   }
}
