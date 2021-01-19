package com.rsc.f;

import java.io.IOException;
import java.io.OutputStream;

public class d implements Runnable {
   private final b V;
   private byte[] sf;
   private int sg;
   private int sh;
   private boolean si = false;
   private boolean sd = false;
   private OutputStream sj;

   public d(b var1, OutputStream var2) {
      this.V = var1;
      this.sj = var2;
   }

   public void a(int var1, byte[] var2, int var3) {
      if (!this.V.dU()) {
         if (this.sd) {
            this.sd = false;
            throw new IOException("Error in writer thread");
         }

         if (this.sf == null) {
            this.sf = new byte[5000];
         }

         synchronized(this) {
            for(int var5 = 0; var5 < var1; ++var5) {
               this.sf[this.sh] = var2[var5 + var3];
               this.sh = (this.sh + 1) % 5000;
               if (this.sh == (this.sg + 4900) % 5000) {
                  throw new IOException("buffer overflow");
               }
            }

            if (!this.si) {
               this.si = true;
               com.rsc.d.a(3, this);
            }

            this.notify();
         }
      }

   }

   public void run() {
      while(this.si) {
         int var1;
         synchronized(this) {
            if (this.sh == this.sg) {
               try {
                  this.wait();
               } catch (InterruptedException var7) {
               }
            }

            if (!this.si) {
               break;
            }

            if (this.sh >= this.sg) {
               var1 = this.sh - this.sg;
            } else {
               var1 = 5000 - this.sg;
            }
         }

         if (var1 > 0) {
            try {
               this.sj.write(this.sf, this.sg, var1);
            } catch (IOException var6) {
               var6.printStackTrace();
               this.sd = true;
            }

            this.sg = (this.sg + var1) % 5000;

            try {
               if (this.sh == this.sg) {
                  this.sj.flush();
               }
            } catch (IOException var5) {
               var5.printStackTrace();
               this.sd = true;
            }
         }
      }

   }
}
