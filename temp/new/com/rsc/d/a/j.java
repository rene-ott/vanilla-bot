package com.rsc.d.a;

public final class j {
   private int jY;
   private int jZ;
   private final int br;
   private final int bs;
   private boolean gH;
   private final String[] ku = new String[]{"Options", "Privacy", "Android"};
   private int kv = 0;
   private int kw = 0;
   private final com.rsc.d ka;

   public j(com.rsc.d var1) {
      this.ka = var1;
      this.br = 408;
      this.bs = 256;
      this.jY = var1.au() / 2 - this.br;
      this.jZ = var1.av() / 2 - this.bs;
   }

   private void bB() {
      this.jY = (this.ka.au() - this.br) / 2;
      this.jZ = (this.ka.av() - this.bs) / 2;
   }

   public boolean b(com.rsc.c.k var1) {
      this.bB();
      var1.g(this.jY, this.jZ, this.br, this.bs, com.rsc.g.f.a(160, 160, 160), 128);
      var1.e(this.jY, this.jZ, this.br - 100, 20, 192);
      var1.a((String)"Extra Settings", this.jY + 5, this.jZ + 14, 16777215, 1);
      var1.f(this.jY - 1, this.br + 2, this.jZ - 1, this.bs + 2, 0);
      var1.m(this.jY, this.jZ + 20, this.br, 0);
      int var2 = 29;

      int var3;
      for(var3 = 0; var3 < this.ku.length; ++var3) {
         if (var3 != 2 || com.rsc.c.A()) {
            this.kw = var3;
            this.a(var1, this.jY + 8, this.jZ + var2, 100, 25, this.ku[var3], this.kv == var3, new k(this));
            var2 += 30;
         }
      }

      this.a(var1, this.jY + 8, this.jZ + var2, 100, 25, "Monsters", false, new v(this));
      var3 = this.jY + 125;
      int var4 = this.jZ + 29;
      switch(this.kv) {
      case 0:
         this.a(var1, "Fog of war:", com.rsc.c.ag, var3, var4, new A(this));
         var4 += 20;
         this.a(var1, "Show roof on buildings:", com.rsc.c.ah, var3, var4, new B(this));
         var4 += 20;
         this.a(var1, "Show sidebar menu:", com.rsc.c.ai, var3, var4, new C(this));
         var4 += 20;
         this.a(var1, "Show kill feed:", com.rsc.c.ak, var3, var4, new l(this));
         var4 += 20;
         var1.m(var3, var4, 275, 0);
         var4 += 14;
         var1.a((String)"Fightmode selection", var3 + 1, var4, 16777215, 1);
         var4 += 5;
         this.a(var1, com.rsc.c.al == 0 ? "@red@Disabled" : (com.rsc.c.al == 1 ? "@yel@Standard" : "@gre@Always"), var3, var4, 75, 20, new m(this));
         var4 += 33;
         var1.a((String)"Zoom distance", var3 + 1, var4, 16777215, 1);
         var4 += 5;
         this.a(var1, com.rsc.c.am == 0 ? "@yel@Normal" : (com.rsc.c.am == 1 ? "@ora@Far" : (com.rsc.c.am == 2 ? "@red@Super" : "@gre@Near")), var3, var4, 75, 20, new n(this));
         var4 -= 43;
         var1.a((String)"Ground items", var3 + 1 + 130, var4, 16777215, 1);
         var4 += 5;
         this.a(var1, com.rsc.c.an == 0 ? "@gre@Standard" : (com.rsc.c.an == 1 ? "@red@Hide all items" : (com.rsc.c.an == 2 ? "@gr1@Show only bones" : "@ora@Hide all bones")), var3 + 130, var4, 145, 20, new o(this));
         break;
      case 1:
         this.a(var1, "Show username above player head:", com.rsc.c.ac, var3, var4, new w(this));
         var4 += 20;
         this.a(var1, "Limit chat messages to maximum of (5):", com.rsc.c.ad, var3, var4, new x(this));
         var4 += 20;
         this.a(var1, "Allow chat tab auto switch:", com.rsc.c.ae, var3, var4, new y(this));
         var4 += 20;
         this.a(var1, "Allow global chat:", com.rsc.c.af, var3, var4, new z(this));
         break;
      case 2:
         this.a(var1, "Enable hold and choose:", com.rsc.c.aq, var3, var4, new p(this));
         var4 += 20;
         this.a(var1, "Use swipe to scroll:", com.rsc.c.at, var3, var4, new q(this));
         var4 += 20;
         this.a(var1, "Use swipe to rotate:", com.rsc.c.au, var3, var4, new r(this));
         var4 += 20;
         var1.m(var3, var4, 275, 0);
         var4 += 14;
         var1.a((String)"Hold timer for menus (Min: 50ms, Max: 600ms)", var3, var4, 16777215, 1);
         var4 += 5;
         this.a(var1, "@gre@" + com.rsc.c.ar + "ms", var3, var4, 75, 18, new s(this));
         var4 += 31;
         var1.a((String)"Menu font size", var3, var4, 16777215, 1);
         var4 += 5;
         this.a(var1, "@lre@Type: " + com.rsc.c.as + " (" + var1.ac(com.rsc.c.as) + "px)", var3, var4, 100, 18, new t(this));
      }

      var1.n(this.jY + 116, this.jZ + 20, 0, this.bs - 20);
      this.a(var1, this.jY + this.br - 100, this.jZ, 100, 20, com.rsc.c.A() ? "Tap to close" : "Click to close", new u(this));
      return true;
   }

   private void a(com.rsc.c.k var1, String var2, int var3, int var4, int var5, int var6, D var7) {
      int var8 = com.rsc.g.f.a(220, 220, 220);
      if (this.ka.u() >= var3 && this.ka.w() >= var4 && this.ka.u() <= var3 + var5 && this.ka.w() <= var4 + var6) {
         var8 = com.rsc.g.f.a(220, 220, 220);
         if (this.ka.t() == 1) {
            var7.bH();
            this.ka.e(0);
         }
      }

      var1.g(var3, var4, var5, var6, var8, 128);
      var1.f(var3, var5, var4, var6, 0);
      var1.a((String)var2, var3 + (var5 / 2 - var1.c(1, var2) / 2), var4 + var6 / 2 + 4, 16777215, 1);
   }

   private void a(com.rsc.c.k var1, String var2, boolean var3, int var4, int var5, D var6) {
      String var7 = var3 ? " @gre@<on>" : " @red@<off>";
      if (this.ka.u() >= var4 && this.ka.w() >= var5 && this.ka.u() <= var4 + var1.c(1, var2 + var7) && this.ka.w() <= var5 + var1.ac(1) && this.ka.t() == 1) {
         var6.bH();
         this.ka.e(0);
      }

      var1.a((String)(var2 + var7), var4, var5 + 12, 16777215, 1);
   }

   private void a(com.rsc.c.k var1, int var2, int var3, int var4, int var5, String var6, boolean var7, D var8) {
      int var9 = com.rsc.g.f.a(220, 220, 220);
      if (var7) {
         var9 = 192;
      }

      if (this.ka.u() >= var2 && this.ka.w() >= var3 && this.ka.u() <= var2 + var4 && this.ka.w() <= var3 + var5 && this.ka.t() == 1) {
         var8.bH();
         this.ka.e(0);
      }

      var1.g(var2, var3, var4, var5, var9, var7 ? 198 : 128);
      var1.f(var2, var4, var3, var5, 0);
      var1.a((String)var6, var2 + (var4 / 2 - var1.c(1, var6) / 2), var3 + var5 / 2 + 5, 16777215, 1);
   }

   private void a(com.rsc.c.k var1, int var2, int var3, int var4, int var5, String var6, D var7) {
      int var8 = 13175581;
      if (this.ka.u() >= var2 && this.ka.w() >= var3 && this.ka.u() <= var2 + var4 && this.ka.w() <= var3 + var5) {
         var8 = 8323072;
         if (this.ka.t() == 1) {
            var7.bH();
            this.ka.e(0);
         }
      }

      var1.g(var2, var3, var4, var5, var8, 192);
      var1.n(var2, var3, 0, 20);
      var1.a((String)var6, var2 + (var4 / 2 - var1.c(1, var6) / 2), var3 + var5 / 2 + 5, 16777215, 1);
   }

   public boolean bF() {
      return this.gH;
   }

   public void d(boolean var1) {
      this.gH = var1;
   }

   public void bE() {
      this.d(true);
   }

   private void bG() {
      this.d(false);
   }
}
