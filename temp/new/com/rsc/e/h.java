package com.rsc.e;

public enum h {
   mr(0, "@whi@"),
   ms(1, "@cya@"),
   mt(2, "@cya@"),
   mu(3, "@whi@"),
   mv(4, "@yel@"),
   mw(5, "@cya@"),
   mx(6, "@whi@"),
   my(7, "@whi@"),
   mz(8, "@whi@"),
   mA(10, "@yel@");

   private static final h[] mB;
   final int cN;
   public String mp;

   private h(int var3, String var4) {
      this.cN = var3;
      this.mp = var4;
   }

   public static h ar(int var0) {
      return var0 >= 0 && var0 < mB.length ? mB[var0] : null;
   }

   static {
      int var0 = 0;
      h[] var1 = values();
      int var2 = var1.length;

      int var3;
      h var4;
      for(var3 = 0; var3 < var2; ++var3) {
         var4 = var1[var3];
         var0 = Math.max(1 + var4.cN, var0);
      }

      mB = new h[var0];
      var1 = values();
      var2 = var1.length;

      for(var3 = 0; var3 < var2; ++var3) {
         var4 = var1[var3];
         if (var4.cN >= 0) {
            mB[var4.cN] = var4;
         }
      }

   }
}
