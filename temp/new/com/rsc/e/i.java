package com.rsc.e;

public class i extends d {
   public int mD;
   public int mE = 0;
   public int mF = 0;
   public int mG;
   public int mH = 0;
   public int mI;
   public i mJ;
   public int mK = 0;
   public int mL = 0;
   public com.rsc.a.a.a[] mM = new com.rsc.a.a.a[12];
   public int mN = 0;
   public int mO = 0;
   public int mP = 0;
   public int mQ = -1;
   public String mo;
   public int mR = 0;
   public int mS;
   public int mT = 0;
   public int mU;
   public int mV;
   public int[] mW = new int[10];
   public int[] mX = new int[10];
   private int mf = 0;

   public i() {
   }

   public void u(int var1, int var2, int var3) {
      this.mV = var1;
      this.mW[var1] = var2;
      this.mX[var1] = var3;
   }

   public void d(String var1) {
      this.mo = var1;
      this.mR = 150;
   }

   public void as(int var1) {
      this.mD = var1;
      this.mE = 150;
   }

   public void at(int var1) {
      this.mI = var1;
   }

   public void cx() {
      this.mS = 0;
      this.mU = 0;
      this.mV = 0;
   }

   public void ap(int var1) {
      this.mf = var1;
   }

   public int cl() {
      return this.mf;
   }

   public i cy() {
      return this.mJ;
   }

   public void cz() {
      int var1 = (1 + this.mV) % 10;
      if (this.mS == var1) {
         this.mf = this.mI;
      } else {
         byte var2 = -1;
         int var3;
         if (this.mS < var1) {
            var3 = var1 - this.mS;
         } else {
            var3 = 10 + var1 - this.mS;
         }

         int var4 = 4;
         if (var3 > 2) {
            var4 = var3 * 4 - 4;
         }

         if (this.mW[this.mS] - this.mc <= 384 && this.mX[this.mS] - this.md <= 384 && this.mW[this.mS] - this.mc >= -384 && this.mX[this.mS] - this.md >= -384 && var3 <= 8) {
            if (this.mW[this.mS] > this.mc) {
               var2 = 2;
               this.mc += var4;
               ++this.mU;
            } else if (this.mW[this.mS] < this.mc) {
               ++this.mU;
               var2 = 6;
               this.mc -= var4;
            }

            if (this.mc - this.mW[this.mS] < var4 && this.mc - this.mW[this.mS] > -var4) {
               this.mc = this.mW[this.mS];
            }

            if (this.mX[this.mS] > this.md) {
               if (var2 > -1) {
                  if (var2 == 2) {
                     var2 = 3;
                  } else {
                     var2 = 5;
                  }
               } else {
                  var2 = 4;
               }

               this.md += var4;
               ++this.mU;
            } else if (this.mX[this.mS] < this.md) {
               ++this.mU;
               this.md -= var4;
               if (var2 > -1) {
                  if (var2 == 2) {
                     var2 = 1;
                  } else {
                     var2 = 7;
                  }
               } else {
                  var2 = 0;
               }
            }

            if (this.md - this.mX[this.mS] < var4 && this.md - this.mX[this.mS] > -var4) {
               this.md = this.mX[this.mS];
            }
         } else {
            this.mc = this.mW[this.mS];
            this.md = this.mX[this.mS];
         }

         if (var2 > -1) {
            this.mf = var2;
         }

         if (this.mW[this.mS] == this.mc && this.mX[this.mS] == this.md) {
            this.mS = (1 + this.mS) % 10;
         }
      }

      if (this.mE > 0) {
         --this.mE;
      }

      if (this.mF > 0) {
         --this.mF;
      }

      if (this.mG > 0) {
         --this.mG;
      }

      if (this.mR > 0) {
         --this.mR;
      }

      if (this.mT > 0) {
         --this.mT;
      }

   }
}
