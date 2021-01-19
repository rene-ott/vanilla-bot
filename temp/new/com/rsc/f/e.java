package com.rsc.f;

public class e extends a {
   private int sk;
   private boolean sl;

   public e(int var1) {
      super(var1);
      this.dY();
   }

   public void aO(int var1) {
      if (this.sl) {
         throw new IllegalStateException("Another packet construction in process!");
      } else {
         this.rV = this.sk + 2;
         this.aK(var1);
         this.sl = true;
      }
   }

   public final void dX() {
      if (!this.sl) {
         throw new IllegalStateException("packet construction not in process!");
      } else {
         int var1 = this.rV - this.sk - 2;
         this.rU[this.sk] = (byte)(var1 >> 8);
         this.rU[this.sk + 1] = (byte)var1;
         this.sk = this.rV;
         this.sl = false;
      }
   }

   public void dY() {
      this.sk = 0;
      this.rV = 2;
   }
}
