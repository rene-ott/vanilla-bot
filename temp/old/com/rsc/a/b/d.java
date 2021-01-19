package com.rsc.a.b;

import java.io.IOException;
import java.nio.ByteBuffer;

public class d {
   public byte cn = 0;
   public byte co = 0;
   public byte cp = 0;
   public byte cq = 0;
   public byte cr = 0;
   public int cs = 0;
   public byte ct = 0;

   public d() {
   }

   public static d b(ByteBuffer var0) {
      if (var0.remaining() < 10) {
         throw new IOException("Provided buffer too short");
      } else {
         d var1 = new d();
         var1.cn = var0.get();
         var1.co = var0.get();
         var1.ct = var0.get();
         var1.cp = var0.get();
         var1.cq = var0.get();
         var1.cr = var0.get();
         var1.cs = var0.getInt();
         return var1;
      }
   }

   public int bc() {
      return this.co & 255;
   }
}
