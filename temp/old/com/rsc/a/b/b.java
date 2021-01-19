package com.rsc.a.b;

import java.io.IOException;
import java.nio.ByteBuffer;

public class b {
   private d[] ce = new d[2304];

   public b() {
      for(int var1 = 0; var1 < this.ce.length; ++var1) {
         this.ce[var1] = new d();
      }

   }

   public void a(int var1, d var2) {
      this.ce[var1] = var2;
   }

   public d d(int var1, int var2) {
      return this.u(var1 * 48 + var2);
   }

   public d u(int var1) {
      return var1 >= 0 && var1 < this.ce.length ? this.ce[var1] : new d();
   }

   public static b a(ByteBuffer var0) {
      short var1 = 2304;
      if (var0.remaining() < 10 * var1) {
         throw new IOException("Provided buffer too short");
      } else {
         b var2 = new b();

         for(int var3 = 0; var3 < var1; ++var3) {
            var2.a(var3, d.b(var0));
         }

         return var2;
      }
   }
}
