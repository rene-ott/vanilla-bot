package com.rsc.f;

import java.io.IOException;
import java.io.OutputStream;

public class d implements Runnable {
   private final b V;
   private byte[] rY;
   private int rZ;
   private int sa;
   private boolean sb = false;
   private boolean rW = false;
   private OutputStream sc;

   public d(b var1, OutputStream var2) {
      this.V = var1;
      this.sc = var2;
   }

   public void a(int var1, byte[] var2, int var3) {
      if (!this.V.dT()) {
         if (this.rW) {
            this.rW = false;
            throw new IOException("Error in writer thread");
         }

         if (this.rY == null) {
            this.rY = new byte[5000];
         }

         synchronized(this) {
            for(int var5 = 0; var5 < var1; ++var5) {
               this.rY[this.sa] = var2[var5 + var3];
               this.sa = (this.sa + 1) % 5000;
               if (this.sa == (this.rZ + 4900) % 5000) {
                  throw new IOException("buffer overflow");
               }
            }

            if (!this.sb) {
               this.sb = true;
               com.rsc.d.a(3, this);
            }

            this.notify();
         }
      }

   }

   public void run() {
      while(this.sb) {
         int var1;
         synchronized(this) {
            if (this.sa == this.rZ) {
               try {
                  this.wait();
               } catch (InterruptedException var7) {
               }
            }

            if (!this.sb) {
               break;
            }

            if (this.sa >= this.rZ) {
               var1 = this.sa - this.rZ;
            } else {
               var1 = 5000 - this.rZ;
            }
         }

         if (var1 > 0) {
            try {
               this.sc.write(this.rY, this.rZ, var1);
            } catch (IOException var6) {
               var6.printStackTrace();
               this.rW = true;
            }

            this.rZ = (this.rZ + var1) % 5000;

            try {
               if (this.sa == this.rZ) {
                  this.sc.flush();
               }
            } catch (IOException var5) {
               var5.printStackTrace();
               this.rW = true;
            }
         }
      }

   }
}
