package com.rsc.b;

public enum b {
   cu(0),
   cv(1),
   cw(2),
   cx(3),
   cy(4),
   cz(5),
   cA(6),
   cB(7),
   cC(8),
   cD(9);

   public final int bo;
   public a cE;

   private b(int var3) {
      this.bo = var3;
   }

   public boolean bd() {
      return this.bo >= 1 && this.bo <= 8 || this.bo == 10;
   }

   public void b(String var1) {
      if (this.cE != null) {
         this.cE.b(var1);
      }

   }
}
