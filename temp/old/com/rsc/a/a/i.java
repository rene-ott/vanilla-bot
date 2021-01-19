package com.rsc.a.a;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class i extends d {
   private final int bT;
   private final int bp;
   private final int bV;
   private final HashMap<Integer, Integer> bW;

   public i(String var1, String var2, int var3, int var4, int var5, HashMap<Integer, Integer> var6) {
      super(var1, var2);
      this.bT = var3;
      this.bp = var4;
      this.bV = var5;
      this.bW = var6;
   }

   public int aQ() {
      return this.bT;
   }

   public int aS() {
      return this.bp;
   }

   public int aT() {
      return this.bV;
   }

   public Set<Entry<Integer, Integer>> aU() {
      return this.bW.entrySet();
   }
}
