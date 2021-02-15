package com.rsc.f;

public class e extends a {
   private int sd;
   private boolean se;

   public e(int var1) {
      super(var1);
      this.dX();
   }

   public void aO(int var1) {
      if (this.se) {
         throw new IllegalStateException("Another packet construction in process!");
      } else {
         this.rO = this.sd + 2;
         this.aK(var1);
         this.se = true;
      }
   }

   public final void dW() {
      if (!this.se) {
         throw new IllegalStateException("packet construction not in process!");
      } else {
         int var1 = this.rO - this.sd - 2;
         this.rN[this.sd] = (byte)(var1 >> 8);
         this.rN[this.sd + 1] = (byte)var1;
         this.sd = this.rO;
         this.se = false;
      }
   }

   public void dX() {
      this.sd = 0;
      this.rO = 3;
   }
}
