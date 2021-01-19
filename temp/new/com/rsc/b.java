package com.rsc;

import com.rsc.c.h;
import com.rsc.c.i;
import com.rsc.c.k;
import com.rsc.c.m;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class b implements Runnable {
   protected int m = 0;
   protected int n = 0;
   protected int o;
   protected int p;
   protected int q;
   protected int r;
   protected int s = 0;
   protected int t = 0;
   protected int u = 0;
   protected int v = 0;
   protected int w = 0;
   protected int x = 0;
   protected int y = 0;
   protected int z = 0;
   protected int A = 0;
   protected int B = 0;
   public int C = 0;
   protected com.rsc.g.e D;
   public Thread E = null;
   protected int F = 1;
   protected int G = 20;
   protected final long[] H = new long[10];
   protected boolean I;
   protected boolean J;
   protected boolean K;
   protected i L;
   protected k M;
   protected m N;
   protected a O;
   private boolean P;
   protected byte[] Q;
   protected final h[] R = new h[1000];
   protected int S;
   protected final com.rsc.f.e T = new com.rsc.f.e(5000);
   protected final com.rsc.f.a U = new com.rsc.f.a(25000);
   protected com.rsc.f.b V;
   protected int W;
   private long X;

   public b() {
   }

   public final void run() {
      try {
         if (this.F == 1) {
            for(this.F = 2; !this.D.isDisplayable() && this.C >= 0; com.rsc.g.f.b((long)this.G)) {
               if (this.C > 0) {
                  --this.C;
                  if (this.C == 0) {
                     this.m();
                     this.E = null;
                     return;
                  }
               }
            }

            if (this.C < 0) {
               if (this.C == -1) {
                  this.m();
               }

               this.E = null;
               return;
            }

            this.f();
            this.F = 0;
         }

         int var1 = 0;
         int var2 = 256;
         int var3 = 1;
         int var4 = 0;

         int var5;
         for(var5 = 0; var5 < 10; ++var5) {
            this.H[var5] = com.rsc.g.f.dZ();
         }

         while(this.C >= 0) {
            if (this.C > 0) {
               --this.C;
               if (this.C == 0) {
                  this.m();
                  this.E = null;
                  return;
               }
            }

            var5 = var2;
            int var6 = var3;
            var2 = 300;
            var3 = 1;
            long var7 = com.rsc.g.f.dZ();
            if (this.H[var1] == 0L) {
               var3 = var6;
               var2 = var5;
            } else if (var7 > this.H[var1]) {
               var2 = (int)((long)(this.G * 2560) / (var7 - this.H[var1]));
            }

            if (var2 < 25) {
               var2 = 25;
            }

            if (var2 > 256) {
               var2 = 256;
               var3 = (int)((long)this.G - (var7 - this.H[var1]) / 10L);
            }

            if (var3 > this.G) {
               var3 = this.G;
            }

            this.H[var1] = var7;
            var1 = (1 + var1) % 10;
            if (var3 > 1) {
               for(int var9 = 0; var9 < 10; ++var9) {
                  if (this.H[var9] != 0L) {
                     long[] var10000 = this.H;
                     var10000[var9] += (long)var3;
                  }
               }
            }

            if (var3 < 1) {
               var3 = 1;
            }

            com.rsc.g.f.b((long)var3);

            while(var4 < 256) {
               this.a();
               var4 += var2;
            }

            var4 &= 255;
            if (this.G > 0) {
               this.S = 1000 * var2 / (this.G * 256);
            }

            this.g();
            this.D.G();
         }

         if (this.C == -1) {
            this.m();
         }

         this.E = null;
      } catch (Exception var13) {
         var13.printStackTrace();
         this.a(true);
      } finally {
         this.I = true;
         this.g();
         this.D.G();
      }

   }

   protected void f() {
   }

   protected void a() {
   }

   protected void g() {
   }

   protected byte[] a(String var1, String var2, int var3) {
      if (this.P) {
         this.M.b(var3, "Loading " + var2 + " - 0%");
      }

      InputStream var4 = com.rsc.g.d.r(this.D.C() + var1);
      DataInputStream var5 = new DataInputStream(var4);
      byte[] var6 = new byte[6];
      var5.readFully(var6, 0, 6);
      int var7 = ((var6[0] & 255) << 16) + ((var6[1] & 255) << 8) + (var6[2] & 255);
      int var8 = ((var6[3] & 255) << 16) + ((var6[4] & 255) << 8) + (var6[5] & 255);
      if (this.P) {
         this.M.b(var3, "Loading " + var2 + " - 5%");
      }

      int var9 = 0;
      byte[] var10 = new byte[var8];

      while(var9 < var8) {
         int var11 = var8 - var9;
         if (var11 > 1000) {
            var11 = 1000;
         }

         var5.readFully(var10, var9, var11);
         var9 += var11;
         if (this.P) {
            this.M.b(var3, "Loading " + var2 + " - " + (5 + var9 * 95 / var8) + " % ");
         }
      }

      var5.close();
      if (this.P) {
         this.M.b(var3, "Unpacking " + var2);
      }

      if (var8 != var7) {
         byte[] var12 = new byte[var7];
         com.rsc.g.b.a(var12, var7, var10, var8, 0);
         return var12;
      } else {
         return var10;
      }
   }

   protected void h() {
      byte[] var1 = this.a("models.jag", "3d models", 60);
      String[] var2 = new String[]{"torcha2", "torcha3", "torcha4", "skulltorcha2", "skulltorcha3", "skulltorcha4", "firea2", "firea3", "fireplacea2", "fireplacea3", "firespell2", "firespell3", "lightning2", "lightning3", "clawspell2", "clawspell3", "clawspell4", "clawspell5", "spellcharge2", "spellcharge3"};
      String[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         com.rsc.a.a.a(var6);
      }

      if (var1 == null) {
         throw new Exception("Failed to load models");
      } else {
         for(int var7 = 0; var7 < com.rsc.a.a.K(); ++var7) {
            var4 = com.rsc.g.d.a(com.rsc.a.a.j(var7) + ".ob3", var1);
            if (var4 == 0) {
               this.R[var7] = new h(1, 1);
            } else {
               this.R[var7] = new h(var1, var4);
            }

            this.R[var7].gz = com.rsc.a.a.j(var7).equals("giantcrystal");
         }

      }
   }

   protected void i() {
      try {
         this.Q = this.a("sounds.mem", "Sound effects", 90);
      } catch (Throwable var2) {
         System.out.println("Unable to init sounds:" + var2);
      }

   }

   protected void j() {
      this.M.b(50, "Textures");
      this.L.V(com.rsc.a.a.L());

      for(int var1 = 0; var1 < com.rsc.a.a.L(); ++var1) {
         float var2 = (float)var1 / (float)com.rsc.a.a.L() * 100.0F;
         this.M.b(50, "Textures - " + var2 + " % ");
         com.rsc.a.b.c var3 = this.M.b("textures", var1);
         int var4 = var3.cn.br * var3.cn.bs;
         int[] var5 = var3.bb();
         int[] var6 = new int['耀'];

         int var7;
         for(var7 = 0; var7 < var4; ++var7) {
            int var8 = ((var5[var7] & 16252928) >> 9) + ((var5[var7] & '\uf800') >> 6) + ((var5[var7] & 248) >> 3);
            int var10002 = var6[var8]++;
         }

         for(var7 = 0; var7 < var5.length; ++var7) {
            if (var5[var7] == 0) {
               var5[var7] = 16711935;
            }
         }

         int[] var24 = new int[256];
         var24[0] = 16711935;
         int[] var25 = new int[256];

         int var10;
         int var11;
         int var12;
         for(int var9 = 0; var9 < var6.length; ++var9) {
            var10 = var6[var9];
            if (var10 > var25[255]) {
               for(var11 = 1; var11 < 256; ++var11) {
                  if (var10 > var25[var11]) {
                     for(var12 = 255; var12 > var11; --var12) {
                        var24[var12] = var24[var12 - 1];
                        var25[var12] = var25[var12 - 1];
                     }

                     var24[var11] = ((var9 & 31744) << 9) + ((var9 & 992) << 6) + ((var9 & 31) << 3) + 263172;
                     var25[var11] = var10;
                     break;
                  }
               }
            }

            var6[var9] = -1;
         }

         byte[] var26 = new byte[var4];

         for(var10 = 0; var10 < var4; ++var10) {
            var11 = var5[var10];
            var12 = ((var11 & 16252928) >> 9) + ((var11 & '\uf800') >> 6) + ((var11 & 248) >> 3);
            int var13 = var6[var12];
            if (var13 == -1) {
               int var14 = 999999999;
               int var15 = var11 >> 16 & 255;
               int var16 = var11 >> 8 & 255;
               int var17 = var11 & 255;

               for(int var18 = 0; var18 < 256; ++var18) {
                  int var19 = var24[var18];
                  int var20 = var19 >> 16 & 255;
                  int var21 = var19 >> 8 & 255;
                  int var22 = var19 & 255;
                  int var23 = (var15 - var20) * (var15 - var20) + (var16 - var21) * (var16 - var21) + (var17 - var22) * (var17 - var22);
                  if (var23 < var14) {
                     var14 = var23;
                     var13 = var18;
                  }
               }

               var6[var12] = var13;
            }

            var26[var10] = (byte)var13;
         }

         this.L.a(var1, var3.cl / 64 - 1, var26, var24);
      }

   }

   protected boolean k() {
      byte[] var1 = this.a("jagex.jag", "Jagex library", 0);
      com.rsc.c.a.a(com.rsc.g.d.a("h11p.jf", 0, var1));
      com.rsc.c.a.a(com.rsc.g.d.a("h12b.jf", 0, var1));
      com.rsc.c.a.a(com.rsc.g.d.a("h12p.jf", 0, var1));
      com.rsc.c.a.a(com.rsc.g.d.a("h13b.jf", 0, var1));
      com.rsc.c.a.a(com.rsc.g.d.a("h14b.jf", 0, var1));
      com.rsc.c.a.a(com.rsc.g.d.a("h16b.jf", 0, var1));
      com.rsc.c.a.a(com.rsc.g.d.a("h20b.jf", 0, var1));
      com.rsc.c.a.a(com.rsc.g.d.a("h24b.jf", 0, var1));
      this.P = true;
      return true;
   }

   protected void l() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.H[var1] = 0L;
      }

   }

   protected void d(int var1) {
      this.G = 1000 / var1;
   }

   public void start() {
      if (this.E == null) {
         this.E = a(1, this);
         this.F = 1;
      }

   }

   private void m() {
      this.q();
      this.C = -2;
      System.out.println("Closing program");
      com.rsc.g.f.b(1000L);
      this.D.H();
   }

   public static Thread a(int var0, Runnable var1) {
      Thread var2 = new Thread(var1);
      if (!c.A()) {
         var2.setPriority(var0);
      }

      var2.start();
      return var2;
   }

   public com.rsc.f.e n() {
      return this.T;
   }

   public void o() {
      if (this.W++ > 750) {
         this.r();
      } else {
         for(int var1 = 0; var1 < 5 && this.p(); ++var1) {
         }

      }
   }

   public boolean p() {
      this.U.rV = 0;
      int var1 = this.V.b(this.U.rU);
      if (var1 > 0) {
         int var2 = this.U.dO();
         this.a(this.U, var2, var1);
         this.W = 0;
         return true;
      } else {
         return false;
      }
   }

   protected void a(boolean var1) {
   }

   protected void q() {
   }

   protected void a(com.rsc.f.a var1, int var2, int var3) {
   }

   protected void r() {
   }

   public void s() {
      if (this.V != null) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.X >= 5000L) {
            this.n().aO(67);
            this.n().dX();
         }

         if (this.T.rV > 2) {
            try {
               this.V.a(this.T);
               this.T.dY();
               this.X = var1;
            } catch (IOException var4) {
               var4.printStackTrace();
               this.r();
            }
         }
      }
   }

   public int t() {
      return this.s;
   }

   public void e(int var1) {
      this.s = var1;
   }

   public int u() {
      return this.A;
   }

   public int v() {
      return this.n;
   }

   public void f(int var1) {
      this.n = var1;
   }

   public int w() {
      return this.B;
   }

   public int x() {
      return this.m;
   }

   public void g(int var1) {
      this.m = var1;
   }

   public void h(int var1) {
      this.y = var1;
   }

   public int y() {
      return this.z;
   }

   public void i(int var1) {
      this.z = var1;
   }

   public com.rsc.g.e z() {
      return this.D;
   }

   public void a(int var1, int var2) {
      this.A = var1;
      this.B = var2;
   }
}
