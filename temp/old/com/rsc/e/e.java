package com.rsc.e;

public class e extends d {
   private com.rsc.c.h gl;
   private int lZ;
   private com.rsc.a.a.e ma;

   public e() {
   }

   public com.rsc.c.h cj() {
      return this.gl;
   }

   public void d(com.rsc.c.h var1) {
      this.gl = var1;
   }

   public int ck() {
      return this.lZ;
   }

   public void ap(int var1) {
      this.lZ = var1;
   }

   public com.rsc.a.a.e cl() {
      if (this.ma == null) {
         this.ma = com.rsc.a.a.s(this.at());
      }

      return this.ma;
   }

   public int au() {
      return this.lZ != 0 && this.lZ != 4 ? this.cl().av() : this.cl().au();
   }

   public int av() {
      return this.lZ != 0 && this.lZ != 4 ? this.cl().au() : this.cl().av();
   }

   public e c(e var1) {
      this.ma = var1.ma;
      this.lZ = var1.ck();
      this.lU = var1.ce();
      this.lV = var1.cf();
      this.bp = var1.at();
      this.gl = var1.gl;
      return this;
   }
}
