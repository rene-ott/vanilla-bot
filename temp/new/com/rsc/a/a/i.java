package com.rsc.a.a;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class i extends d {
   private final int bU;
   private final int bq;
   private final int bW;
   private final HashMap<Integer, Integer> bX;

   public i(String var1, String var2, int var3, int var4, int var5, HashMap<Integer, Integer> var6) {
      super(var1, var2);
      this.bU = var3;
      this.bq = var4;
      this.bW = var5;
      this.bX = var6;
   }

   public int aQ() {
      return this.bU;
   }

   public int aS() {
      return this.bq;
   }

   public int aT() {
      return this.bW;
   }

   public Set<Entry<Integer, Integer>> aU() {
      return this.bX.entrySet();
   }
}
