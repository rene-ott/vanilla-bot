package com.rsc.c;

public final class b {
   private int du;
   private int dv = 0;
   private int dw = 0;
   private c[] dx;
   public String dy;
   private int dz = 0;
   private k dA;

   public b(k var1, int var2, String var3) {
      this.du = var2;
      this.dx = new c[10];
      this.dA = var1;
      this.dy = var3;

      for(int var4 = 0; var4 < 10; ++var4) {
         this.dx[var4] = new c();
      }

      this.be();
   }

   private final void a(d var1, String var2, String var3, int var4, int var5, int var6, int var7, int var8, String var9) {
      if (this.dx.length == this.dv) {
         c[] var10 = this.dx;
         this.dx = new c[10 + this.dv];

         for(int var11 = 0; this.dx.length > var11; ++var11) {
            if (this.dv > var11) {
               this.dx[var11] = var10[var11];
            } else {
               this.dx[var11] = new c();
            }
         }
      }

      this.dx[this.dv++].b(var1, var2, var3, var5, var8, var7, var4, var6, var9);
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
      int var1 = this.dA.ac(this.du) + 1;
      if (null == this.dy) {
         this.dw = 0;
         this.dz = 0;
      } else {
         this.dw = var1;
         this.dz = 5 + this.dA.c(this.du, this.dy);
      }

      for(int var2 = 0; this.dv > var2; ++var2) {
         this.dw += var1;
         int var3 = 5 + this.dA.c(this.du, this.dx[var2].dH + " " + this.dx[var2].dI);
         if (var3 > this.dz) {
            this.dz = var3;
         }
      }

   }

   public final int av() {
      return this.dw;
   }

   public final d v(int var1) {
      return this.dx[var1].dJ;
   }

   public final String w(int var1) {
      return this.dx[var1].dI;
   }

   public final String x(int var1) {
      return this.dx[var1].dH;
   }

   public final int y(int var1) {
      return this.dx[var1].dF;
   }

   public final int z(int var1) {
      return this.dx[var1].dB;
   }

   public final int A(int var1) {
      return this.dx[var1].dD;
   }

   public final int B(int var1) {
      return this.dx[var1].dE;
   }

   public final int C(int var1) {
      return this.dx[var1].dC;
   }

   public final String D(int var1) {
      return this.dx[var1].dG;
   }

   public final int au() {
      return this.dz;
   }

   public final int a(int var1, int var2, int var3, int var4) {
      return this.a(var2, var1, var4, var3, false);
   }

   private final int a(int var1, int var2, int var3, int var4, boolean var5) {
      if (this.dz != 0 && this.dw != 0) {
         if (var5) {
            this.dA.g(var4, var3, this.dz, this.dw, 13684944, 160);
         }

         int var6 = 1 + this.dA.ac(this.du);
         int var7 = var6 + var3 - 3;
         int var8 = -1;
         if (null != this.dy) {
            if (var4 < var2 && var1 > var7 + (3 - var6) && var7 + 3 > var1 && var2 < var4 + this.dz) {
               if (!var5) {
                  return -2;
               }

               var8 = -2;
            }

            if (var5) {
               this.dA.a((String)this.dy, 2 + var4, var7, 65535, this.du);
            }

            var7 += var6;
         }

         for(int var9 = 0; var9 < this.dv; ++var9) {
            int var10 = 16777215;
            if (var4 < var2 && var1 > 3 + var7 - var6 && var1 < 3 + var7 && var4 + this.dz > var2) {
               var10 = 16776960;
               if (!var5) {
                  return var9;
               }

               var8 = var9;
            }

            if (var5) {
               this.dA.a(this.dx[var9].dH + " " + this.dx[var9].dI, var4 + 2, var7, var10, this.du);
            }

            var7 += var6;
         }

         return var8;
      } else {
         return -1;
      }
   }

   public final void E(int var1) {
      this.dv = var1;
      this.be();
   }

   public final int bf() {
      return this.dv;
   }

   public final void F(int var1) {
      if (var1 >= 0 && this.dv > var1) {
         c var2 = this.dx[var1];

         for(int var3 = var1; var3 < this.dv - 1; ++var3) {
            this.dx[var3] = this.dx[1 + var3];
         }

         this.dx[--this.dv] = var2;
         this.be();
      }

   }

   public final int b(int var1, int var2, int var3, int var4) {
      return this.a(var3, var4, var1, var2, true);
   }

   public final void bg() {
      if (this.dv != 0) {
         int[] var1 = new int[this.dv];
         c[] var2 = new c[this.dv];

         int var3;
         for(var3 = 0; this.dv > var3; ++var3) {
            c var4 = this.dx[var3];
            var1[var3] = var4.dJ.bh();
            var2[var3] = var4;
         }

         com.rsc.g.a.a(var2, var1);

         for(var3 = 0; var3 < this.dv; ++var3) {
            this.dx[var3] = var2[var3];
         }
      }

   }
}
