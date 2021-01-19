package com.rsc.f;

import java.io.IOException;
import java.io.InputStream;

public class c implements Runnable {
   private final b V;
   int rU = 0;
   private InputStream rV;
   private boolean rW;
   private byte[] rX = new byte[1];

   public c(b var1, InputStream var2) {
      this.V = var1;
      this.rV = var2;
   }

   public int dU() {
      if (this.V.dT()) {
         return 0;
      } else {
         this.c(this.rX, 0, 1);
         return 255 & this.rX[0];
      }
   }

   public int dV() {
      return this.V.dT() ? 0 : this.rV.available();
   }

   public void c(byte[] var1, int var2, int var3) {
      if (!this.V.dT()) {
         while(var3 > 0) {
            int var4 = this.rV.read(var1, var2, var3);
            if (var4 <= 0) {
               throw new IOException("EOF");
            }

            var2 += var4;
            var3 -= var4;
         }
      }

   }

   public int b(byte[] var1) {
      try {
         if (this.rU == 0 && this.dV() >= 2) {
            this.rU = (short)(this.dU() << 8) | (short)this.dU();
            this.rU -= 2;
         }

         if (this.rU > 0 && this.dV() >= this.rU) {
            this.c(var1, 0, this.rU);
            int var2 = this.rU;
            this.rU = 0;
            return var2;
         }
      } catch (IOException var3) {
         this.rW = true;
         var3.printStackTrace();
      }

      return 0;
   }

   public void run() {
   }
}
