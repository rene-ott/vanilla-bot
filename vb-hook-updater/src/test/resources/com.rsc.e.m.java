package com.rsc.e;

public class m extends d {
   private com.rsc.c.h nb;
   private int lZ;
   private com.rsc.a.a.b nc;

   public m() {
   }

   public com.rsc.c.h cB() {
      return this.nb;
   }

   public void e(com.rsc.c.h var1) {
      this.nb = var1;
   }

   public int ck() {
      return this.lZ;
   }

   public void ap(int var1) {
      this.lZ = var1;
   }

   public com.rsc.a.a.b cC() {
      if (this.nc == null) {
         this.nc = com.rsc.a.a.q(this.at());
      }

      return this.nc;
   }

   public void c(m var1) {
      this.nc = var1.nc;
      this.lZ = var1.ck();
      this.lU = var1.ce();
      this.lV = var1.cf();
      this.bp = var1.at();
      this.nb = var1.cB();
   }
}
