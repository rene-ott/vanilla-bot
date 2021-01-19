package com.rsc.b;

public enum c {
   cH(0),
   cI(1),
   cJ(2),
   cK(3),
   cL(4);

   private static final c[] cM;
   private final int cN;

   private c(int var3) {
      this.cN = var3;
   }

   static {
      int var0 = 0;
      c[] var1 = values();
      int var2 = var1.length;

      int var3;
      c var4;
      for(var3 = 0; var3 < var2; ++var3) {
         var4 = var1[var3];
         var0 = Math.max(1 + var4.cN, var0);
      }

      cM = new c[var0];
      var1 = values();
      var2 = var1.length;

      for(var3 = 0; var3 < var2; ++var3) {
         var4 = var1[var3];
         if (var4.cN >= 0) {
            cM[var4.cN] = var4;
         }
      }

   }
}
