package com.rsc.e;

public class m extends d {
   private com.rsc.c.h nh;
   private int mf;
   private com.rsc.a.a.b ni;

   public m() {
   }

   public com.rsc.c.h cC() {
      return this.nh;
   }

   public void e(com.rsc.c.h var1) {
      this.nh = var1;
   }

   public int cl() {
      return this.mf;
   }

   public void ap(int var1) {
      this.mf = var1;
   }

   public com.rsc.a.a.b cD() {
      if (this.ni == null) {
         this.ni = com.rsc.a.a.q(this.at());
      }

      return this.ni;
   }

   public void c(m var1) {
      this.ni = var1.ni;
      this.mf = var1.cl();
      this.ma = var1.cf();
      this.mb = var1.cg();
      this.bq = var1.at();
      this.nh = var1.cC();
   }
}
