package com.rsc.a.b;

public class c {
   public int bo = -1;
   public String cf = "";
   public String cg = "";
   public boolean ch;
   public int ci = 0;
   public int cj = 0;
   public int ck = 0;
   public int cl = 0;
   public a cm;

   public c() {
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof c)) {
         return super.equals(var1);
      } else {
         c var2 = (c)var1;
         return var2.bo == this.bo && var2.cg.equals(this.cg) && var2.cf.equals(this.cf);
      }
   }

   public String toString() {
      return this.bo + "";
   }

   public int[] bb() {
      return this.cm.ba() ? this.cm.aZ() : this.a(this.cm);
   }

   private int[] a(a var1) {
      int[] var2 = new int[var1.bq * var1.br];

      for(int var3 = 0; var3 < var1.br; ++var3) {
         for(int var4 = 0; var4 < var1.bq; ++var4) {
            int var5 = var1.aY()[var4 + var3 * var1.bq] & 255;
            int var6 = var1.aZ()[var5];
            var2[var4 + var3 * var1.bq] = var6;
         }
      }

      return var2;
   }
}
