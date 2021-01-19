package com.rsc.d.a;

import java.util.ArrayList;
import java.util.Iterator;

public class e {
   private int jX;
   private int jY;
   private final int bq;
   private final int br;
   private boolean gG;
   private final com.rsc.d jZ;
   public final com.rsc.c.e kh;
   public final int ki;
   private final int kj;
   public final int kk;
   private int kl = -1;
   private final ArrayList<i> km;
   private boolean kn;
   private int ko;

   public e(com.rsc.d var1) {
      this.jZ = var1;
      this.bq = 408;
      this.br = 254;
      this.jX = var1.au() / 2 - this.bq;
      this.jY = var1.av() / 2 - this.br;
      this.kh = new com.rsc.c.e(var1.dB(), 3);
      this.ki = this.kh.b(this.jX + 5, this.jY + 20, 170, 234, 1000, 7, true);
      this.kj = this.kh.b(this.jX + 233, this.jY + 151, 403, 96, 1000, 7, true);
      this.kk = this.kh.b(this.jX + 260, this.jY + 36, 174, 18, 1, 12, false, true);
      this.km = new ArrayList();
   }

   private void bB() {
      this.jX = (this.jZ.au() - this.bq) / 2;
      this.jY = (this.jZ.av() - this.br) / 2;
      this.kh.b(this.ki, this.jX + 5, this.jY + 20, 170, 234);
      this.kh.b(this.kj, this.jX, this.jY + 151, 403, 96);
      this.kh.b(this.kk, this.jX + 260, this.jY + 36, 174, 18);
   }

   public boolean b(com.rsc.c.k var1) {
      this.bB();
      this.kh.Q(this.kk);
      var1.g(this.jX, this.jY, this.bq, this.br, com.rsc.g.f.a(160, 160, 160), 128);
      var1.e(this.jX, this.jY, this.bq - 100, 20, 192);
      var1.a((String)"Monsters", this.jX + 5, this.jY + 14, 16777215, 1);
      var1.f(this.jX - 1, this.bq + 2, this.jY - 1, this.br + 2, 0);
      var1.m(this.jX, this.jY + 20, this.bq, 0);
      var1.n(this.jX + 175, this.jY + 21, 0, this.br - 21);
      var1.a((String)"Search NPC:", this.jX + 184, this.jY + 40, 16777215, 1);
      var1.g(this.jX + 258, this.jY + 27, 145, 20, 4013373, 198);
      var1.f(this.jX + 257, 146, this.jY + 26, 21, 0);
      var1.m(this.jX + 176, this.jY + 52, 232, 0);
      String var2 = this.kh.J(this.kk);
      ArrayList var3 = new ArrayList();
      Iterator var4 = com.rsc.a.a.aM.iterator();

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
      int var6 = this.jY + 24;
      int var7 = this.jX;
      this.kh.G(this.ki);
      this.kh.Q(this.ki);
      this.kh.f(this.jZ.u(), this.jZ.w(), this.jZ.x(), this.jZ.y());
      int var8 = this.kh.R(this.ki);
      int var9 = var8 + 5;

      int var10;
      int var12;
      for(var10 = -1; var10 < var3.size(); ++var10) {
         this.kh.a(this.ki, var10 + 1, "", 0, (String)null, (String)null);
         if (var10 >= var8 && var10 <= var9) {
            com.rsc.a.a.g var11 = (com.rsc.a.a.g)var3.get(var10);
            if (this.jZ.u() >= var7 && this.jZ.w() >= var6 - 4 && this.jZ.u() <= var7 + 175 - 14 && this.jZ.w() <= var6 + var19 - 4 && this.kl != var11.bo) {
               var1.g(var7, var6 - 3, 175, var19, 9961472, 128);
               if (this.jZ.t() == 1) {
                  this.ah(var11.bo);
                  this.jZ.e(0);
               }
            } else if (this.kl == var11.bo) {
               var1.g(var7, var6 - 3, 175, var19, 16711680, 128);
            } else {
               var1.g(var7, var6 - 3, 175, var19, 1162167621, 128);
            }

            if (var11 != null) {
               var1.a((com.rsc.a.a.g)var11, var7, var6, var18, 32, 0);
               var1.a((String)this.jZ.d(var11.ad(), 17), var7 + 50, var6 + 8, 16776960, 1);
               var1.a((String)this.jZ.d(var11.ar(), 21), var7 + 50, var6 + 20, 16777215, 0);
               var12 = (var11.aO() + var11.aM() + var11.aN() + var11.aL()) / 4;
               var1.a((String)(var11.aP() ? "Level: " + var12 : ""), var7 + 50, var6 + 32, 16777215, 0);
               var1.m(var7, var6 - 4, 175, 0);
               var6 += 39;
            }
         }
      }

      if (this.kl != -1) {
         com.rsc.a.a.g var20 = com.rsc.a.a.k(this.kl);
         if (var20 != null) {
            var1.a((com.rsc.a.a.g)var20, this.jX + 175, this.jY + 55, 64, 64, 5);
            int var21 = (var20.aO() + var20.aM() + var20.aN() + var20.aL()) / 4;
            var1.a((String)(var20.ad() + " " + (var20.aP() ? "@whi@(Level-" + var21 + ")" : "")), this.jX + 240, this.jY + 70, 16776960, 1);
            var1.a(var20.ar(), this.jX + 240, this.jY + 82, 172, 0, 16777215, false, false);
            if (var20.aP()) {
               var1.a((String)("Attack: @yel@" + var20.aM()), this.jX + 240, this.jY + 106, 16777215, 1);
               var1.a((String)("Strength: @yel@" + var20.aO()), this.jX + 240, this.jY + 118, 16777215, 1);
               var1.a((String)("Defense: @yel@" + var20.aN()), this.jX + 330, this.jY + 106, 16777215, 1);
               var1.a((String)("Hits: @yel@" + var20.aL()), this.jX + 330, this.jY + 118, 16777215, 1);
               var1.a((String)("Respawn: @yel@" + this.bK() + "s"), this.jX + 240, this.jY + 130, 16777215, 1);
               var1.a((String)("Aggro: @yel@" + (this.bJ() ? "Yes" : "No")), this.jX + 330, this.jY + 130, 16777215, 1);
            }

            if (this.km.size() > 0 && var20.aP()) {
               this.kh.G(this.kj);
               this.kh.Q(this.kj);
               var12 = this.jX + 180;
               int var13 = this.jY + 145;
               var1.a((String)"@bla@Drop Table", this.jX + 185, this.jY + 150, 16777215, 1);
               var1.f(this.jX + 181, 223, this.jY + 138, 14, 0);
               int var14 = this.kh.R(this.kj);
               int var15 = var14 + 2;

               for(int var16 = 0; var16 < this.km.size(); ++var16) {
                  this.kh.a(this.kj, var16, "", 0, (String)null, (String)null);
                  if (var16 >= var14 && var16 <= var15) {
                     i var17 = (i)this.km.get(var16);
                     var1.f(this.jX + 181, 223, var13 + 6, 33, 0);
                     var1.a((String)(var17.bM() == -1 ? "Nothing" : com.rsc.a.a.l(var17.bM()).ad()), var12 + 50, var13 + 20, 16777215, 0);
                     if (var17.bM() != -1) {
                        this.jZ.dB().a(this.jZ.dB().ad(var17.bM()), var12 + 2, var13 + 7, 48, 32, com.rsc.a.a.l(var17.bM()).aB(), 0, false, 0, 1);
                        if (com.rsc.a.a.l(var17.bM()).aA()) {
                           var1.a((String)("Amount: @yel@" + var17.bN()), var12 + 50, var13 + 31, 16777215, 0);
                        }
                     }

                     var1.a((String)i.a(var17), var12 + 157, var13 + 20, 16776960, 0);
                     var13 += 32;
                  }
               }
            } else {
               this.kh.K(this.kj);
            }
         }
      } else {
         var10 = this.jX + 290;
         var1.a(var10, com.rsc.c.Y + " NPC Database", 16776960, -1, 1, this.jY + 70);
         var1.a("Select NPC from the left side menu in order to check it's full information, including their drop table. % % You can also use the 'search' function.", var10, this.jY + 86, 220, 2, 16777215, true, true);
      }

      this.a(var1, this.jX + this.bq - 180, this.jY, 80, 20, "< Go back", new f(this));
      this.b(var1, this.jX + this.bq - 100, this.jY, 100, 20, com.rsc.c.A() ? "Tap to close" : "Click to close", new g(this));
      this.kh.bi();
      return true;
   }

   public boolean bF() {
      return this.gG;
   }

   public void d(boolean var1) {
      this.gG = var1;
   }

   public boolean af(int var1) {
      if (this.kh.P(this.kk)) {
         this.kh.M(var1);
      }

      return true;
   }

   private void bI() {
      this.kh.N(this.kk);
      this.kh.a(this.kk, "");
      this.kh.N(this.kj);
      this.kh.K(this.kj);
      this.kh.O(-1);
      this.kl = -1;
   }

   public void e(boolean var1) {
      this.kn = var1;
   }

   private boolean bJ() {
      return this.kn;
   }

   public void ag(int var1) {
      this.ko = var1;
   }

   private int bK() {
      return this.ko;
   }

   public void bL() {
      this.km.clear();
   }

   public void a(int var1, int var2, String var3) {
      this.km.add(new i(var1, var2, var3));
   }

   private void ah(int var1) {
      this.kh.N(this.kj);
      this.jZ.n().aO(199);
      this.jZ.n().aK(0);
      this.jZ.n().aL(var1);
      this.jZ.n().dW();
      this.kl = var1;
   }

   private void a(com.rsc.c.k var1, int var2, int var3, int var4, int var5, String var6, h var7) {
      short var8 = 192;
      if (this.jZ.u() >= var2 && this.jZ.w() >= var3 && this.jZ.u() <= var2 + var4 && this.jZ.w() <= var3 + var5) {
         var8 = 127;
         if (this.jZ.t() == 1) {
            var7.bH();
            this.jZ.e(0);
         }
      }

      var1.g(var2, var3, var4, var5, var8, 192);
      var1.n(var2, var3, 0, 20);
      var1.a((String)var6, var2 + (var4 / 2 - var1.c(1, var6) / 2), var3 + var5 / 2 + 5, 16777215, 1);
   }

   private void b(com.rsc.c.k var1, int var2, int var3, int var4, int var5, String var6, h var7) {
      int var8 = 13175581;
      short var9 = 255;
      if (this.jZ.u() >= var2 && this.jZ.w() >= var3 && this.jZ.u() <= var2 + var4 && this.jZ.w() <= var3 + var5) {
         var8 = 13175581;
         var9 = 148;
         if (this.jZ.t() == 1) {
            var7.bH();
            this.jZ.e(0);
         }
      }

      var1.g(var2, var3, var4, var5, var8, var9);
      var1.n(var2, var3, 0, 20);
      var1.a((String)var6, var2 + (var4 / 2 - var1.c(1, var6) / 2), var3 + var5 / 2 + 5, 16777215, 1);
   }
}
