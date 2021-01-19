package com.rsc.b;

public enum c {
   cG(0),
   cH(1),
   cI(2),
   cJ(3),
   cK(4);

   private static final c[] cL;
   private final int cM;

   private c(int var3) {
      this.cM = var3;
   }

   static {
      int var0 = 0;
      c[] var1 = values();
      int var2 = var1.length;

      int var3;
      c var4;
      for(var3 = 0; var3 < var2; ++var3) {
         var4 = var1[var3];
         var0 = Math.max(1 + var4.cM, var0);
      }

      cL = new c[var0];
      var1 = values();
      var2 = var1.length;

      for(var3 = 0; var3 < var2; ++var3) {
         var4 = var1[var3];
         if (var4.cM >= 0) {
            cL[var4.cM] = var4;
         }
      }

   }
}
