package com.rsc.e;

public class i extends d {
   public int mx;
   public int my = 0;
   public int mz = 0;
   public int mA;
   public int mB = 0;
   public int mC;
   public i mD;
   public int mE = 0;
   public int mF = 0;
   public com.rsc.a.a.a[] mG = new com.rsc.a.a.a[12];
   public int mH = 0;
   public int mI = 0;
   public int mJ = 0;
   public int mK = -1;
   public String mi;
   public int mL = 0;
   public int mM;
   public int mN = 0;
   public int mO;
   public int mP;
   public int[] mQ = new int[10];
   public int[] mR = new int[10];
   private int lZ = 0;

   public i() {
   }

   public void u(int var1, int var2, int var3) {
      this.mP = var1;
      this.mQ[var1] = var2;
      this.mR[var1] = var3;
   }

   public void d(String var1) {
      this.mi = var1;
      this.mL = 150;
   }

   public void as(int var1) {
      this.mx = var1;
      this.my = 150;
   }

   public void at(int var1) {
      this.mC = var1;
   }

   public void cw() {
      this.mM = 0;
      this.mO = 0;
      this.mP = 0;
   }

   public void ap(int var1) {
      this.lZ = var1;
   }

   public int ck() {
      return this.lZ;
   }

   public i cx() {
      return this.mD;
   }

   public void cy() {
      int var1 = (1 + this.mP) % 10;
      if (this.mM == var1) {
         this.lZ = this.mC;
      } else {
         byte var2 = -1;
         int var3;
         if (this.mM < var1) {
            var3 = var1 - this.mM;
         } else {
            var3 = 10 + var1 - this.mM;
         }

         int var4 = 4;
         if (var3 > 2) {
            var4 = var3 * 4 - 4;
         }

         if (this.mQ[this.mM] - this.lW <= 384 && this.mR[this.mM] - this.lX <= 384 && this.mQ[this.mM] - this.lW >= -384 && this.mR[this.mM] - this.lX >= -384 && var3 <= 8) {
            if (this.mQ[this.mM] > this.lW) {
               var2 = 2;
               this.lW += var4;
               ++this.mO;
            } else if (this.mQ[this.mM] < this.lW) {
               ++this.mO;
               var2 = 6;
               this.lW -= var4;
            }

            if (this.lW - this.mQ[this.mM] < var4 && this.lW - this.mQ[this.mM] > -var4) {
               this.lW = this.mQ[this.mM];
            }

            if (this.mR[this.mM] > this.lX) {
               if (var2 > -1) {
                  if (var2 == 2) {
                     var2 = 3;
                  } else {
                     var2 = 5;
                  }
               } else {
                  var2 = 4;
               }

               this.lX += var4;
               ++this.mO;
            } else if (this.mR[this.mM] < this.lX) {
               ++this.mO;
               this.lX -= var4;
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

            if (this.lX - this.mR[this.mM] < var4 && this.lX - this.mR[this.mM] > -var4) {
               this.lX = this.mR[this.mM];
            }
         } else {
            this.lW = this.mQ[this.mM];
            this.lX = this.mR[this.mM];
         }

         if (var2 > -1) {
            this.lZ = var2;
         }

         if (this.mQ[this.mM] == this.lW && this.mR[this.mM] == this.lX) {
            this.mM = (1 + this.mM) % 10;
         }
      }

      if (this.my > 0) {
         --this.my;
      }

      if (this.mz > 0) {
         --this.mz;
      }

      if (this.mA > 0) {
         --this.mA;
      }

      if (this.mL > 0) {
         --this.mL;
      }

      if (this.mN > 0) {
         --this.mN;
      }

   }
}
