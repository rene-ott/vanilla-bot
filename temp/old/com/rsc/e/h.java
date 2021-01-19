package com.rsc.e;

public enum h {
   ml(0, "@whi@"),
   mm(1, "@cya@"),
   mn(2, "@cya@"),
   mo(3, "@whi@"),
   mp(4, "@yel@"),
   mq(5, "@cya@"),
   mr(6, "@whi@"),
   ms(7, "@whi@"),
   mt(8, "@whi@"),
   mu(10, "@yel@");

   private static final h[] mv;
   final int cM;
   public String mj;

   private h(int var3, String var4) {
      this.cM = var3;
      this.mj = var4;
   }

   public static h ar(int var0) {
      return var0 >= 0 && var0 < mv.length ? mv[var0] : null;
   }

   static {
      int var0 = 0;
      h[] var1 = values();
      int var2 = var1.length;

      int var3;
      h var4;
      for(var3 = 0; var3 < var2; ++var3) {
         var4 = var1[var3];
         var0 = Math.max(1 + var4.cM, var0);
      }

      mv = new h[var0];
      var1 = values();
      var2 = var1.length;

      for(var3 = 0; var3 < var2; ++var3) {
         var4 = var1[var3];
         if (var4.cM >= 0) {
            mv[var4.cM] = var4;
         }
      }

   }
}
