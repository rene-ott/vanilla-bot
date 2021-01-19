package com.rsc.f;

import java.net.InetAddress;
import java.net.Socket;

public class b {
   private final Socket rQ;
   private final c rR;
   private final d rS;
   protected com.rsc.d jZ;
   private boolean rT;

   public b(com.rsc.d var1, String var2, int var3) {
      this.jZ = var1;
      this.rQ = this.d(var3, var2);
      this.rQ.setSoTimeout(30000);
      this.rQ.setTcpNoDelay(true);
      this.rR = new c(this, this.rQ.getInputStream());
      this.rS = new d(this, this.rQ.getOutputStream());
   }

   private Socket d(int var1, String var2) {
      Socket var3 = new Socket(InetAddress.getByName(var2), var1);
      var3.setSoTimeout(30000);
      var3.setTcpNoDelay(true);
      return var3;
   }

   public int b(byte[] var1) {
      return this.rR.b(var1);
   }

   public boolean dT() {
      return this.rT;
   }

   public void a(e var1) {
      this.rS.a(var1.rO, var1.rN, 0);
   }

   public int dU() {
      return this.rR.dU();
   }
}
