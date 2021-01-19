package com.rsc.d.a.a;

import com.rsc.g.f;
import java.util.Iterator;
import java.util.LinkedList;

public class b {
   public final LinkedList<a> kC = new LinkedList();

   public b() {
   }

   public void a(a var1) {
      try {
         this.kC.addFirst(var1);
         if (this.kC.size() >= 10) {
            this.kC.removeLast();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void bO() {
      try {
         Iterator var1 = this.kC.iterator();

         while(var1.hasNext()) {
            a var2 = (a)var1.next();
            if (f.dZ() - var2.kB > 8000L) {
               this.kC.remove(var2);
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }
}
