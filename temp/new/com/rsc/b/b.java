package com.rsc.b;

public enum b {
   cv(0),
   cw(1),
   cx(2),
   cy(3),
   cz(4),
   cA(5),
   cB(6),
   cC(7),
   cD(8),
   cE(9);

   public final int bp;
   public a cF;

   private b(int var3) {
      this.bp = var3;
   }

   public boolean bd() {
      return this.bp >= 1 && this.bp <= 8 || this.bp == 10;
   }

   public void b(String var1) {
      if (this.cF != null) {
         this.cF.b(var1);
      }

   }
}
