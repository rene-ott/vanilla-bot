package com.rsc.a.b;

public class c {
   public int bp = -1;
   public String cg = "";
   public String ch = "";
   public boolean ci;
   public int cj = 0;
   public int ck = 0;
   public int cl = 0;
   public int cm = 0;
   public a cn;

   public c() {
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof c)) {
         return super.equals(var1);
      } else {
         c var2 = (c)var1;
         return var2.bp == this.bp && var2.ch.equals(this.ch) && var2.cg.equals(this.cg);
      }
   }

   public String toString() {
      return this.bp + "";
   }

   public int[] bb() {
      return this.cn.ba() ? this.cn.aZ() : this.a(this.cn);
   }

   private int[] a(a var1) {
      int[] var2 = new int[var1.br * var1.bs];

      for(int var3 = 0; var3 < var1.bs; ++var3) {
         for(int var4 = 0; var4 < var1.br; ++var4) {
            int var5 = var1.aY()[var4 + var3 * var1.br] & 255;
            int var6 = var1.aZ()[var5];
            var2[var4 + var3 * var1.br] = var6;
         }
      }

      return var2;
   }
}
