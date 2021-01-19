package com.rsc.e;

public class f extends d {
   private int mb;
   private com.rsc.a.a.f mc;

   public f() {
   }

   public void a(f var1) {
      this.ge = var1.cc();
      this.lU = var1.ce();
      this.lV = var1.cf();
      this.bp = var1.at();
      this.mb = var1.mb;
      this.mc = var1.cm();
   }

   public void aq(int var1) {
      this.mb = var1;
   }

   public com.rsc.a.a.f cm() {
      if (this.mc == null) {
         this.mc = com.rsc.a.a.l(this.at());
      }

      return this.mc;
   }

   public int cn() {
      return this.mb;
   }
}
