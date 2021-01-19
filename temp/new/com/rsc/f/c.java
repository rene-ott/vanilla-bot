package com.rsc.f;

import java.io.IOException;
import java.io.InputStream;

public class c implements Runnable {
   private final b V;
   int sb = 0;
   private InputStream sc;
   private boolean sd;
   private byte[] se = new byte[1];

   public c(b var1, InputStream var2) {
      this.V = var1;
      this.sc = var2;
   }

   public int dV() {
      if (this.V.dU()) {
         return 0;
      } else {
         this.c(this.se, 0, 1);
         return 255 & this.se[0];
      }
   }

   public int dW() {
      return this.V.dU() ? 0 : this.sc.available();
   }

   public void c(byte[] var1, int var2, int var3) {
      if (!this.V.dU()) {
         while(var3 > 0) {
            int var4 = this.sc.read(var1, var2, var3);
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
         if (this.sb == 0 && this.dW() >= 2) {
            this.sb = (short)(this.dV() << 8) | (short)this.dV();
            this.sb -= 2;
         }

         if (this.sb > 0 && this.dW() >= this.sb) {
            this.c(var1, 0, this.sb);
            int var2 = this.sb;
            this.sb = 0;
            return var2;
         }
      } catch (IOException var3) {
         this.sd = true;
         var3.printStackTrace();
      }

      return 0;
   }

   public void run() {
   }
}
