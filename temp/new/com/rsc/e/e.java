package com.rsc.e;

public class e extends d {
   private com.rsc.c.h gm;
   private int mf;
   private com.rsc.a.a.e mg;

   public e() {
   }

   public com.rsc.c.h ck() {
      return this.gm;
   }

   public void d(com.rsc.c.h var1) {
      this.gm = var1;
   }

   public int cl() {
      return this.mf;
   }

   public void ap(int var1) {
      this.mf = var1;
   }

   public com.rsc.a.a.e cm() {
      if (this.mg == null) {
         this.mg = com.rsc.a.a.s(this.at());
      }

      return this.mg;
   }

   public int au() {
      return this.mf != 0 && this.mf != 4 ? this.cm().av() : this.cm().au();
   }

   public int av() {
      return this.mf != 0 && this.mf != 4 ? this.cm().au() : this.cm().av();
   }

   public e c(e var1) {
      this.mg = var1.mg;
      this.mf = var1.cl();
      this.ma = var1.cf();
      this.mb = var1.cg();
      this.bq = var1.at();
      this.gm = var1.gm;
      return this;
   }
}
