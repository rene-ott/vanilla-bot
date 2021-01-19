package com.rsc.f;

import java.net.InetAddress;
import java.net.Socket;

public class b {
   private final Socket rX;
   private final c rY;
   private final d rZ;
   protected com.rsc.d ka;
   private boolean sa;

   public b(com.rsc.d var1, String var2, int var3) {
      this.ka = var1;
      this.rX = this.d(var3, var2);
      this.rX.setSoTimeout(30000);
      this.rX.setTcpNoDelay(true);
      this.rY = new c(this, this.rX.getInputStream());
      this.rZ = new d(this, this.rX.getOutputStream());
   }

   private Socket d(int var1, String var2) {
      Socket var3 = new Socket(InetAddress.getByName(var2), var1);
      var3.setSoTimeout(30000);
      var3.setTcpNoDelay(true);
      return var3;
   }

   public int b(byte[] var1) {
      return this.rY.b(var1);
   }

   public boolean dU() {
      return this.sa;
   }

   public void a(e var1) {
      this.rZ.a(var1.rV, var1.rU, 0);
   }

   public int dV() {
      return this.rY.dV();
   }
}
