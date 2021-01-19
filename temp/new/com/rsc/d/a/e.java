package com.rsc.d.a;

import java.util.ArrayList;
import java.util.Iterator;

public class e {
   private int jY;
   private int jZ;
   private final int br;
   private final int bs;
   private boolean gH;
   private final com.rsc.d ka;
   public final com.rsc.c.e ki;
   public final int kj;
   private final int kk;
   public final int kl;
   private int km = -1;
   private final ArrayList<i> kn;
   private boolean ko;
   private int kp;

   public e(com.rsc.d var1) {
      this.ka = var1;
      this.br = 408;
      this.bs = 254;
      this.jY = var1.au() / 2 - this.br;
      this.jZ = var1.av() / 2 - this.bs;
      this.ki = new com.rsc.c.e(var1.dC(), 3);
      this.kj = this.ki.b(this.jY + 5, this.jZ + 20, 170, 234, 1000, 7, true);
      this.kk = this.ki.b(this.jY + 233, this.jZ + 151, 403, 96, 1000, 7, true);
      this.kl = this.ki.b(this.jY + 260, this.jZ + 36, 174, 18, 1, 12, false, true);
      this.kn = new ArrayList();
   }

   private void bB() {
      this.jY = (this.ka.au() - this.br) / 2;
      this.jZ = (this.ka.av() - this.bs) / 2;
      this.ki.b(this.kj, this.jY + 5, this.jZ + 20, 170, 234);
      this.ki.b(this.kk, this.jY, this.jZ + 151, 403, 96);
      this.ki.b(this.kl, this.jY + 260, this.jZ + 36, 174, 18);
   }

   public boolean b(com.rsc.c.k var1) {
      this.bB();
      this.ki.Q(this.kl);
      var1.g(this.jY, this.jZ, this.br, this.bs, com.rsc.g.f.a(160, 160, 160), 128);
      var1.e(this.jY, this.jZ, this.br - 100, 20, 192);
      var1.a((String)"Monsters", this.jY + 5, this.jZ + 14, 16777215, 1);
      var1.f(this.jY - 1, this.br + 2, this.jZ - 1, this.bs + 2, 0);
      var1.m(this.jY, this.jZ + 20, this.br, 0);
      var1.n(this.jY + 175, this.jZ + 21, 0, this.bs - 21);
      var1.a((String)"Search NPC:", this.jY + 184, this.jZ + 40, 16777215, 1);
      var1.g(this.jY + 258, this.jZ + 27, 145, 20, 4013373, 198);
      var1.f(this.jY + 257, 146, this.jZ + 26, 21, 0);
      var1.m(this.jY + 176, this.jZ + 52, 232, 0);
      String var2 = this.ki.J(this.kl);
      ArrayList var3 = new ArrayList();
      Iterator var4 = com.rsc.a.a.aN.iterator();

      while(var4.hasNext()) {
         com.rsc.a.a.g var5 = (com.rsc.a.a.g)var4.next();
         if (var2.length() > 0) {
            if (var5.ad().toLowerCase().contains(var2)) {
               var3.add(var5);
            }
         } else {
            var3.add(var5);
         }
      }

      byte var18 = 48;
      byte var19 = 38;
      int var6 = this.jZ + 24;
      int var7 = this.jY;
      this.ki.G(this.kj);
      this.ki.Q(this.kj);
      this.ki.f(this.ka.u(), this.ka.w(), this.ka.x(), this.ka.y());
      int var8 = this.ki.R(this.kj);
      int var9 = var8 + 5;

      int var10;
      int var12;
      for(var10 = -1; var10 < var3.size(); ++var10) {
         this.ki.a(this.kj, var10 + 1, "", 0, (String)null, (String)null);
         if (var10 >= var8 && var10 <= var9) {
            com.rsc.a.a.g var11 = (com.rsc.a.a.g)var3.get(var10);
            if (this.ka.u() >= var7 && this.ka.w() >= var6 - 4 && this.ka.u() <= var7 + 175 - 14 && this.ka.w() <= var6 + var19 - 4 && this.km != var11.bp) {
               var1.g(var7, var6 - 3, 175, var19, 9961472, 128);
               if (this.ka.t() == 1) {
                  this.ah(var11.bp);
                  this.ka.e(0);
               }
            } else if (this.km == var11.bp) {
               var1.g(var7, var6 - 3, 175, var19, 16711680, 128);
            } else {
               var1.g(var7, var6 - 3, 175, var19, 1162167621, 128);
            }

            if (var11 != null) {
               var1.a((com.rsc.a.a.g)var11, var7, var6, var18, 32, 0);
               var1.a((String)this.ka.d(var11.ad(), 17), var7 + 50, var6 + 8, 16776960, 1);
               var1.a((String)this.ka.d(var11.ar(), 21), var7 + 50, var6 + 20, 16777215, 0);
               var12 = (var11.aO() + var11.aM() + var11.aN() + var11.aL()) / 4;
               var1.a((String)(var11.aP() ? "Level: " + var12 : ""), var7 + 50, var6 + 32, 16777215, 0);
               var1.m(var7, var6 - 4, 175, 0);
               var6 += 39;
            }
         }
      }

      if (this.km != -1) {
         com.rsc.a.a.g var20 = com.rsc.a.a.k(this.km);
         if (var20 != null) {
            var1.a((com.rsc.a.a.g)var20, this.jY + 175, this.jZ + 55, 64, 64, 5);
            int var21 = (var20.aO() + var20.aM() + var20.aN() + var20.aL()) / 4;
            var1.a((String)(var20.ad() + " " + (var20.aP() ? "@whi@(Level-" + var21 + ")" : "")), this.jY + 240, this.jZ + 70, 16776960, 1);
            var1.a(var20.ar(), this.jY + 240, this.jZ + 82, 172, 0, 16777215, false, false);
            if (var20.aP()) {
               var1.a((String)("Attack: @yel@" + var20.aM()), this.jY + 240, this.jZ + 106, 16777215, 1);
               var1.a((String)("Strength: @yel@" + var20.aO()), this.jY + 240, this.jZ + 118, 16777215, 1);
               var1.a((String)("Defense: @yel@" + var20.aN()), this.jY + 330, this.jZ + 106, 16777215, 1);
               var1.a((String)("Hits: @yel@" + var20.aL()), this.jY + 330, this.jZ + 118, 16777215, 1);
               var1.a((String)("Respawn: @yel@" + this.bK() + "s"), this.jY + 240, this.jZ + 130, 16777215, 1);
               var1.a((String)("Aggro: @yel@" + (this.bJ() ? "Yes" : "No")), this.jY + 330, this.jZ + 130, 16777215, 1);
            }

            if (this.kn.size() > 0 && var20.aP()) {
               this.ki.G(this.kk);
               this.ki.Q(this.kk);
               var12 = this.jY + 180;
               int var13 = this.jZ + 145;
               var1.a((String)"@bla@Drop Table", this.jY + 185, this.jZ + 150, 16777215, 1);
               var1.f(this.jY + 181, 223, this.jZ + 138, 14, 0);
               int var14 = this.ki.R(this.kk);
               int var15 = var14 + 2;

               for(int var16 = 0; var16 < this.kn.size(); ++var16) {
                  this.ki.a(this.kk, var16, "", 0, (String)null, (String)null);
                  if (var16 >= var14 && var16 <= var15) {
                     i var17 = (i)this.kn.get(var16);
                     var1.f(this.jY + 181, 223, var13 + 6, 33, 0);
                     var1.a((String)(var17.bM() == -1 ? "Nothing" : com.rsc.a.a.l(var17.bM()).ad()), var12 + 50, var13 + 20, 16777215, 0);
                     if (var17.bM() != -1) {
                        this.ka.dC().a(this.ka.dC().ad(var17.bM()), var12 + 2, var13 + 7, 48, 32, com.rsc.a.a.l(var17.bM()).aB(), 0, false, 0, 1);
                        if (com.rsc.a.a.l(var17.bM()).aA()) {
                           var1.a((String)("Amount: @yel@" + var17.bN()), var12 + 50, var13 + 31, 16777215, 0);
                        }
                     }

                     var1.a((String)i.a(var17), var12 + 157, var13 + 20, 16776960, 0);
                     var13 += 32;
                  }
               }
            } else {
               this.ki.K(this.kk);
            }
         }
      } else {
         var10 = this.jY + 290;
         var1.a(var10, com.rsc.c.Y + " NPC Database", 16776960, -1, 1, this.jZ + 70);
         var1.a("Select NPC from the left side menu in order to check it's full information, including their drop table. % % You can also use the 'search' function.", var10, this.jZ + 86, 220, 2, 16777215, true, true);
      }

      this.a(var1, this.jY + this.br - 180, this.jZ, 80, 20, "< Go back", new f(this));
      this.b(var1, this.jY + this.br - 100, this.jZ, 100, 20, com.rsc.c.A() ? "Tap to close" : "Click to close", new g(this));
      this.ki.bi();
      return true;
   }

   public boolean bF() {
      return this.gH;
   }

   public void d(boolean var1) {
      this.gH = var1;
   }

   public boolean af(int var1) {
      if (this.ki.P(this.kl)) {
         this.ki.M(var1);
      }

      return true;
   }

   private void bI() {
      this.ki.N(this.kl);
      this.ki.a(this.kl, "");
      this.ki.N(this.kk);
      this.ki.K(this.kk);
      this.ki.O(-1);
      this.km = -1;
   }

   public void e(boolean var1) {
      this.ko = var1;
   }

   private boolean bJ() {
      return this.ko;
   }

   public void ag(int var1) {
      this.kp = var1;
   }

   private int bK() {
      return this.kp;
   }

   public void bL() {
      this.kn.clear();
   }

   public void a(int var1, int var2, String var3) {
      this.kn.add(new i(var1, var2, var3));
   }

   private void ah(int var1) {
      this.ki.N(this.kk);
      this.ka.n().aO(199);
      this.ka.n().aK(0);
      this.ka.n().aL(var1);
      this.ka.n().dX();
      this.km = var1;
   }

   private void a(com.rsc.c.k var1, int var2, int var3, int var4, int var5, String var6, h var7) {
      short var8 = 192;
      if (this.ka.u() >= var2 && this.ka.w() >= var3 && this.ka.u() <= var2 + var4 && this.ka.w() <= var3 + var5) {
         var8 = 127;
         if (this.ka.t() == 1) {
            var7.bH();
            this.ka.e(0);
         }
      }

      var1.g(var2, var3, var4, var5, var8, 192);
      var1.n(var2, var3, 0, 20);
      var1.a((String)var6, var2 + (var4 / 2 - var1.c(1, var6) / 2), var3 + var5 / 2 + 5, 16777215, 1);
   }

   private void b(com.rsc.c.k var1, int var2, int var3, int var4, int var5, String var6, h var7) {
      int var8 = 13175581;
      short var9 = 255;
      if (this.ka.u() >= var2 && this.ka.w() >= var3 && this.ka.u() <= var2 + var4 && this.ka.w() <= var3 + var5) {
         var8 = 13175581;
         var9 = 148;
         if (this.ka.t() == 1) {
            var7.bH();
            this.ka.e(0);
         }
      }

      var1.g(var2, var3, var4, var5, var8, var9);
      var1.n(var2, var3, 0, 20);
      var1.a((String)var6, var2 + (var4 / 2 - var1.c(1, var6) / 2), var3 + var5 / 2 + 5, 16777215, 1);
   }
}
