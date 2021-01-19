package com.rsc.c;

import java.util.ArrayList;

public class k {
   public boolean ja = false;
   public boolean jm;
   public boolean jn = false;
   public int jo;
   public int iT;
   public int[] jp;
   public com.rsc.d a;
   private int jq = 0;
   private int jr = 0;
   private int js = 0;
   private int jt = 0;
   private int[] ju;
   private int[] jv;
   private int[] jw;
   private int[] jx;
   private int[] jy;
   private int[] jz;
   private final int[] jA = new int[]{12, 14, 14, 15, 15, 19, 24, 29};

   public k(int var1, int var2) {
      this.iT = var1;
      this.jo = var2;
      this.jt = var2;
      this.js = var1;
      this.jp = new int[var1 * var2];
   }

   public static com.rsc.a.b.a a(int[] var0, int var1, int var2) {
      ArrayList var3 = new ArrayList();
      byte[] var4 = new byte[var1 * var2];

      int var6;
      for(int var5 = 0; var5 < var2; ++var5) {
         for(var6 = 0; var6 < var1; ++var6) {
            int var7 = var0[var6 + var5 * var1];
            if (!var3.contains(var7)) {
               var3.add(new Integer(var7));
            }

            var4[var6 + var5 * var1] = (byte)var3.indexOf(var7);
         }
      }

      int[] var8 = new int[var3.size()];

      for(var6 = 0; var6 < var8.length; ++var6) {
         var8[var6] = (Integer)var3.get(var6);
      }

      return new com.rsc.a.b.a(var4, var8, var1, var2);
   }

   public void l(int var1, int var2) {
      this.jt = var2;
      this.js = var1;
      this.jp = new int[var1 * var2];
      this.jo = var2;
      this.iT = var1;
   }

   public void b(int var1, String var2) {
      int var3 = (this.iT - 281) / 2;
      var3 += 2;
      int var4 = (this.jo - 148) / 2;
      var4 += 90;
      int var5 = var1 * 277 / 100;
      this.by();
      this.e(var3, var4, var5, 20, 8684676);
      this.e(var5 + var3, var4, 277 - var5, 20, 0);
      this.c(var3 + 138, var4 + 15, var2, 13027014, 2, -1);
      this.a.z().G();
   }

   private final void a(boolean var1, byte[] var2, int var3, int var4, int var5, int var6) {
      int var7 = var2[var5 + 3];
      int var8 = var2[var5 + 4];
      int var9 = var3 + var2[var5 + 5];
      int var10 = var6 - var2[var5 + 6];
      int var11 = (var2[var5] << 14) + (var2[var5 + 1] << 7) + var2[var5 + 2];
      int var12 = var9 + var10 * this.iT;
      int var13 = this.iT - var7;
      int var14;
      if (var10 < this.jq) {
         var14 = this.jq - var10;
         var11 += var14 * var7;
         var12 += this.iT * var14;
         var8 -= var14;
         var10 = this.jq;
      }

      if (var10 + var8 >= this.jt) {
         var8 -= 1 + var10 + var8 - this.jt;
      }

      var14 = 0;
      int var15;
      if (this.jr > var9) {
         var15 = this.jr - var9;
         var14 += var15;
         var7 -= var15;
         var11 += var15;
         var9 = this.jr;
         var13 += var15;
         var12 += var15;
      }

      if (this.js <= var7 + var9) {
         var15 = var7 + var9 - this.js + 1;
         var13 += var15;
         var14 += var15;
         var7 -= var15;
      }

      if (var7 > 0 && var8 > 0) {
         if (var1) {
            this.a(var2, var4, var7, var12, var8, var14, var13, this.jp, var11);
         } else {
            this.a(var4, this.jp, var12, var13, var8, var7, var11, var2, var14);
         }
      }

   }

   public final void bx() {
      this.jr = 0;
      this.jq = 0;
      this.js = this.iT;
      this.jt = this.jo;
   }

   public final void a(com.rsc.a.b.c var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = var1.cm.bq;
         int var8 = var1.cm.br;
         int var9 = 0;
         int var10 = 0;
         int var11 = (var7 << 16) / var4;
         int var12 = (var8 << 16) / var5;
         int var13;
         int var14;
         if (var1.ch) {
            var13 = var1.ck;
            var14 = var1.cl;
            if (var13 == 0 || var14 == 0) {
               return;
            }

            var12 = (var14 << 16) / var5;
            var2 += (var14 + var5 * var1.cj - 1) / var14;
            var3 += (var13 + var1.ci * var4 - 1) / var13;
            var11 = (var13 << 16) / var4;
            if (var4 * var1.ci % var13 != 0) {
               var9 = (var13 - var1.ci * var4 % var13 << 16) / var4;
            }

            if (var1.cj * var5 % var14 != 0) {
               var10 = (var14 - var1.cj * var5 % var14 << 16) / var5;
            }

            var4 = var4 * (var1.cm.bq - (var9 >> 16)) / var13;
            var5 = (var1.cm.br - (var10 >> 16)) * var5 / var14;
         }

         var13 = var2 * this.iT + var3;
         if (this.jq > var2) {
            var14 = this.jq - var2;
            var5 -= var14;
            var2 = 0;
            var13 += this.iT * var14;
            var10 += var12 * var14;
         }

         var14 = this.iT - var4;
         int var15;
         if (var3 < this.jr) {
            var15 = this.jr - var3;
            var3 = 0;
            var9 += var15 * var11;
            var13 += var15;
            var4 -= var15;
            var14 += var15;
         }

         if (var2 + var5 >= this.jt) {
            var5 -= 1 + var5 + (var2 - this.jt);
         }

         if (var3 + var4 >= this.js) {
            var15 = 1 + var3 + (var4 - this.js);
            var14 += var15;
            var4 -= var15;
         }

         byte var17 = 1;
         if (this.ja) {
            var12 += var12;
            var14 += this.iT;
            if ((var2 & 1) != 0) {
               var13 += this.iT;
               --var5;
            }

            var17 = 2;
         }

         this.a(var1.bb(), var9, var10, this.jp, var13, var4, var14, var7, var5, var11, var12, var6, var17);
      } catch (Exception var16) {
         System.out.println("error in sprite clipping routine");
      }

   }

   public final void a(com.rsc.a.b.c var1, int var2, int var3, int var4) {
      if (var1 != null) {
         if (var1.ch) {
            var2 += var1.ci;
            var3 += var1.cj;
         }

         int var5 = 0;
         int var6 = var1.cm.br;
         int var7 = var1.cm.bq;
         int var8 = this.iT * var3 + var2;
         int var9 = this.iT - var7;
         int var10 = 0;
         int var11;
         if (var3 < this.jq) {
            var11 = this.jq - var3;
            var3 = this.jq;
            var6 -= var11;
            var5 = var11 * var7;
            var8 += var11 * this.iT;
         }

         if (var6 + var3 >= this.jt) {
            var6 -= 1 + var6 + (var3 - this.jt);
         }

         if (var2 < this.jr) {
            var11 = this.jr - var2;
            var9 += var11;
            var10 += var11;
            var8 += var11;
            var5 += var11;
            var2 = this.jr;
            var7 -= var11;
         }

         if (this.js <= var2 + var7) {
            var11 = var2 - (-var7 - 1) - this.js;
            var9 += var11;
            var7 -= var11;
            var10 += var11;
         }

         if (var7 > 0 && var6 > 0) {
            byte var12 = 1;
            if (this.ja) {
               var10 += var1.cm.bq;
               var12 = 2;
               if ((1 & var3) != 0) {
                  --var6;
                  var8 += this.iT;
               }

               var9 += this.iT;
            }

            this.a(var5, var6, var8, var1.bb(), var4, var12, this.jp, var10, var9, var7);
         }

      }
   }

   public final void a(int var1, int var2, com.rsc.a.b.c var3, int var4, int var5, int var6) {
      try {
         int var7 = var3.cm.bq;
         int var8 = var3.cm.br;
         int var9 = 0;
         int var10 = 0;
         int var11 = (var7 << 16) / var6;
         int var12 = (var8 << 16) / var5;
         int var13;
         int var14;
         if (var3.ch) {
            var13 = var3.ck;
            var14 = var3.cl;
            if (var13 == 0 || var14 == 0) {
               return;
            }

            if (var3.ci * var6 % var13 != 0) {
               var9 = (var13 - var3.ci * var6 % var13 << 16) / var6;
            }

            var1 += (var6 * var3.ci + var13 - 1) / var13;
            var11 = (var13 << 16) / var6;
            var4 += (var14 + var5 * var3.cj - 1) / var14;
            var12 = (var14 << 16) / var5;
            if (var3.cj * var5 % var14 != 0) {
               var10 = (var14 - var5 * var3.cj % var14 << 16) / var5;
            }

            var5 = var5 * (var3.cm.br - (var10 >> 16)) / var14;
            var6 = (var3.cm.bq - (var9 >> 16)) * var6 / var13;
         }

         var13 = var1 + var4 * this.iT;
         var14 = this.iT - var6;
         int var15;
         if (this.jq > var4) {
            var15 = this.jq - var4;
            var4 = 0;
            var5 -= var15;
            var13 += var15 * this.iT;
            var10 += var15 * var12;
         }

         if (this.jr > var1) {
            var15 = this.jr - var1;
            var6 -= var15;
            var14 += var15;
            var9 += var15 * var11;
            var13 += var15;
            var1 = 0;
         }

         if (this.jt <= var4 + var5) {
            var5 -= var4 + var5 - (this.jt - 1);
         }

         if (this.js <= var1 + var6) {
            var15 = var1 + var6 + (1 - this.js);
            var6 -= var15;
            var14 += var15;
         }

         byte var16 = 1;
         if (this.ja) {
            var12 += var12;
            if ((1 & var4) != 0) {
               --var5;
               var13 += this.iT;
            }

            var16 = 2;
            var14 += this.iT;
         }

         this.a(var10, var11, var6, var9, var14, var3.bb(), var13, this.jp, var7, false, var12, var5, var2, var16);
      } catch (Exception var17) {
         System.out.println("error in sprite clipping routine");
      }

   }

   public final void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < 50000) {
         if (var1 < 40000) {
            if (var1 >= 20000) {
               this.a.b(var1 - 20000, var2, var3, var4, var5, var7, 105, var6);
            } else if (var1 < 5000) {
               this.b(this.b("projectiles", var1), var2, var3, var4, var5);
            } else {
               this.a.c(var1 - 5000, var2, var3, var4, var5, var7, 20, var6);
            }
         } else {
            this.a.m(var1 - '鱀', var2, var3, var4, var5);
         }
      } else {
         this.a.n(var1 - '썐', var2, var3, var4, var5);
      }

   }

   public final void e(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = var4; var7 < var4 + var5; ++var7) {
         for(int var8 = var3; var3 + var1 > var8; ++var8) {
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;

            for(int var13 = var7 - var6; var13 <= var6 + var7; ++var13) {
               if (var13 >= 0 && this.iT > var13) {
                  for(int var14 = var8 - var2; var14 <= var8 + var2; ++var14) {
                     if (var14 >= 0 && this.jo > var14) {
                        int var15 = this.jp[this.iT * var14 + var13];
                        var11 += 255 & var15;
                        ++var12;
                        var10 += (var15 & 'ﾁ') >> 8;
                        var9 += (var15 & 16737446) >> 16;
                     }
                  }
               }
            }

            this.jp[var7 + var8 * this.iT] = var11 / var12 + (var9 / var12 << 16) + (var10 / var12 << 8);
         }
      }

   }

   private final void a(int var1, int var2, int var3, int var4, int var5, int[] var6, int var7, int[] var8, int var9, boolean var10, int var11, int var12, int var13, int var14) {
      int var15 = (var13 & 16736117) >> 16;
      int var16 = 255 & var13 >> 8;
      int var17 = 255 & var13;

      try {
         int var18 = var4;

         for(int var19 = -var12; var19 < 0; var19 += var14) {
            int var20 = (var1 >> 16) * var9;

            for(int var21 = -var3; var21 < 0; ++var21) {
               int var22 = var6[var20 + (var4 >> 16)];
               if (var22 != 0) {
                  int var23 = var22 >> 16 & 255;
                  int var24 = ('｠' & var22) >> 8;
                  int var25 = 255 & var22;
                  if (var23 == var24 && var25 == var24) {
                     var8[var7++] = (var23 * var15 >> 8 << 16) + (var16 * var24 >> 8 << 8) + (var25 * var17 >> 8);
                  } else {
                     var8[var7++] = var22;
                  }
               } else {
                  ++var7;
               }

               var4 += var2;
            }

            var1 += var11;
            var7 += var5;
            var4 = var18;
         }
      } catch (Exception var26) {
         System.out.println("error in plot_scale");
      }

   }

   private final void a(int var1, int var2, int[] var3, int var4, int var5, int var6, int[] var7, int var8, int var9) {
      for(int var10 = var1; var10 < 0; ++var10) {
         var3[var9++] = var7[(var5 >> 17) * var2 + (var6 >> 17)];
         var6 += var4;
         var5 += var8;
      }

   }

   private final void a(int var1, int var2, int var3, int[] var4, int var5, int var6, int[] var7, int var8, int var9, int var10) {
      int var11 = 256 - var5;

      for(int var12 = -var2; var12 < 0; var12 += var6) {
         for(int var13 = -var10; var13 < 0; ++var13) {
            int var14 = var4[var1++];
            if (var14 == 0) {
               ++var3;
            } else {
               int var15 = var7[var3];
               var7[var3++] = ((var14 & 16711935) * var5 + (var15 & 16711935) * var11 & -16711936) + ((var14 & '\uff00') * var5 + (var15 & '\uff00') * var11 & 16711680) >> 8;
            }
         }

         var1 += var8;
         var3 += var9;
      }

   }

   private final void a(int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9) {
      for(int var10 = var2; var10 < 0; ++var10) {
         int var11 = var4[(var6 >> 17) * var8 + (var3 >> 17)];
         if (var11 == 0) {
            ++var7;
         } else {
            var5[var7++] = var11;
         }

         var3 += var9;
         var6 += var1;
      }

   }

   private final void a(int var1, int var2, String var3, int var4, int var5, int var6, int var7) {
      this.b(var1 - this.c(var6, var3), var2, var3, var6, var4, var7, (String)null);
   }

   private final void a(int var1, int[] var2, int var3, int var4, int var5, int var6, int[] var7, int var8, int var9) {
      int var10 = -(var1 >> 2);
      var1 = -(3 & var1);

      for(int var11 = -var4; var11 < 0; var11 += var3) {
         int var12;
         int var13;
         for(var12 = var10; var12 < 0; ++var12) {
            var13 = var7[var5++];
            if (var13 == 0) {
               ++var6;
            } else {
               var2[var6++] = var13;
            }

            var13 = var7[var5++];
            if (var13 == 0) {
               ++var6;
            } else {
               var2[var6++] = var13;
            }

            var13 = var7[var5++];
            if (var13 != 0) {
               var2[var6++] = var13;
            } else {
               ++var6;
            }

            var13 = var7[var5++];
            if (var13 == 0) {
               ++var6;
            } else {
               var2[var6++] = var13;
            }
         }

         for(var12 = var1; var12 < 0; ++var12) {
            var13 = var7[var5++];
            if (var13 == 0) {
               ++var6;
            } else {
               var2[var6++] = var13;
            }
         }

         var5 += var9;
         var6 += var8;
      }

   }

   public final void a(String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      try {
         int var8 = 0;
         byte[] var9 = com.rsc.c.a.dp[var5];
         int var10 = 0;
         int var11 = 0;

         for(int var12 = 0; var1.length() > var12; ++var12) {
            if (var1.charAt(var12) == '@' && 4 + var12 < var1.length() && var1.charAt(var12 + 4) == '@') {
               var6 = this.a(var1.substring(var12 + 1, var12 + 4), var6);
               var12 += 4;
            } else if (var1.charAt(var12) == '~' && var1.length() > 4 + var12 && var1.charAt(4 + var12) == '~') {
               var12 += 4;
            } else {
               char var13 = var1.charAt(var12);
               if (var13 < 0 || var13 >= com.rsc.c.a.dq.length) {
                  var13 = ' ';
               }

               var8 += var9[7 + com.rsc.c.a.dq[var13]];
            }

            if (var1.charAt(var12) == ' ') {
               var11 = var12;
            }

            if (var1.charAt(var12) == '%' && var7) {
               var8 = 1000;
               var11 = var12;
            }

            if (var8 > var4) {
               if (var11 <= var10) {
                  var11 = var12;
               }

               var8 = 0;
               this.c(var2, var3, var1.substring(var10, var11), var6, var5, -1);
               var10 = var12 = 1 + var11;
               var3 += this.ac(var5);
            }
         }

         if (var8 > 0) {
            this.c(var2, var3, var1.substring(var10), var6, var5, -1);
         }
      } catch (Exception var14) {
         System.out.println("centrepara: " + var14);
         var14.printStackTrace();
      }

   }

   public final void a(String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      try {
         int var9 = 0;
         byte[] var10 = com.rsc.c.a.dp[var5];
         int var11 = 0;
         int var12 = 0;

         for(int var13 = 0; var1.length() > var13; ++var13) {
            if (var1.charAt(var13) == '@' && 4 + var13 < var1.length() && var1.charAt(var13 + 4) == '@') {
               var13 += 4;
            } else if (var1.charAt(var13) == '~' && var1.length() > 4 + var13 && var1.charAt(4 + var13) == '~') {
               var13 += 4;
            } else {
               char var14 = var1.charAt(var13);
               if (var14 < 0 || var14 >= com.rsc.c.a.dq.length) {
                  var14 = ' ';
               }

               var9 += var10[7 + com.rsc.c.a.dq[var14]];
            }

            if (var1.charAt(var13) == ' ') {
               var12 = var13;
            }

            if (var1.charAt(var13) == '%' && var7) {
               var9 = 1000;
               var12 = var13;
            }

            if (var9 > var4) {
               if (var12 <= var11) {
                  var12 = var13;
               }

               var9 = 0;
               if (var8) {
                  this.a(var6, var5, 0, var1.substring(var11, var12), var2, var3);
               } else {
                  this.a(var2, var3, (String)var1.substring(var11, var12), var5, var6, -1);
               }

               var11 = var13 = 1 + var12;
               var3 += this.ac(var5);
            }
         }

         if (var9 > 0) {
            if (var8) {
               this.a(var6, var5, 0, var1.substring(var11), var2, var3);
            } else {
               this.a(var2, var3, (String)var1.substring(var11), var5, var6, -1);
            }
         }
      } catch (Exception var15) {
         System.out.println("centrepara: " + var15);
         var15.printStackTrace();
      }

   }

   private final void a(int[] var1, int var2, int var3, int var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      try {
         int var13 = var2;

         for(int var14 = -var8; var14 < 0; var14 += var10) {
            int var15 = (var3 >> 16) * var4;
            var3 += var12;

            for(int var16 = -var7; var16 < 0; ++var16) {
               int var17 = var1[(var2 >> 16) + var15];
               var2 += var11;
               if (var17 != 0) {
                  var5[var6++] = var17;
               } else {
                  ++var6;
               }
            }

            var6 += var9;
            var2 = var13;
         }
      } catch (Exception var18) {
         System.out.println("error in plot_scale");
      }

   }

   private final void a(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17) {
      int var18 = var13 >> 16 & 255;
      int var19 = var13 >> 8 & 255;
      int var20 = var13 & 255;
      int var21 = 256 - var17;
      int var22 = var6 >> 16 & 255;
      int var23 = var6 >> 8 & 255;
      int var24 = 255 & var6;
      int var25 = var16 >> 16 & 255;
      int var26 = var16 >> 8 & 255;
      int var27 = 255 & var16;

      try {
         int var28 = var9;

         for(int var29 = -var14; var29 < 0; ++var29) {
            int var30 = (var11 >> 16) * var12;
            int var31 = var5 >> 16;
            int var32 = var3;
            int var33;
            if (this.jr > var31) {
               var33 = this.jr - var31;
               var32 = var3 - var33;
               var9 += var33 * var8;
               var31 = this.jr;
            }

            if (this.js <= var31 + var32) {
               var33 = var31 - this.js + var32;
               var32 -= var33;
            }

            var10 = 1 - var10;
            if (var10 != 0) {
               for(var33 = var31; var31 + var32 > var33; ++var33) {
                  int var34 = var2[var30 + (var9 >> 16)];
                  if (var34 != 0) {
                     int var35 = 255 & var34 >> 16;
                     int var36 = 255 & var34 >> 8;
                     int var37 = var34 & 255;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var43;
                     if (var35 == var36 && var37 == var36) {
                        var38 = (var37 * var20 >> 8) + (var19 * var36 >> 8 << 8) + (var35 * var18 >> 8 << 16);
                        var39 = var17 * (255 & var38 >> 16);
                        var40 = (255 & var38 >> 8) * var17;
                        var41 = var17 * (var38 & 255);
                        var42 = (this.jp[var33 + var15] & 255) * var21;
                        var43 = var21 * (('\uff00' & this.jp[var33 + var15]) >> 8);
                        int var44 = var21 * ((this.jp[var33 + var15] & 16711680) >> 16);
                        var1[var33 + var15] = (var42 + var41 >> 8) + (var40 + var43 >> 8 << 8) + (var39 + var44 >> 8 << 16) + -16777216;
                     } else if (var35 == 255 && var36 == var37) {
                        var1[var33 + var15] = (var24 * var37 >> 8) + (var35 * var22 >> 8 << 16) + (var36 * var23 >> 8 << 8);
                     } else if (var35 == var36 && var37 == 255) {
                        var1[var33 + var15] = (var27 * var35 >> 8) + (var35 * var25 >> 8 << 16) + (var36 * var26 >> 8 << 8);
                     } else {
                        var38 = var17 * (255 & var34 >> 16);
                        var39 = (255 & var34 >> 8) * var17;
                        var40 = var17 * (var34 & 255);
                        var41 = (this.jp[var33 + var15] & 255) * var21;
                        var42 = var21 * (('\uff00' & this.jp[var33 + var15]) >> 8);
                        var43 = var21 * ((this.jp[var33 + var15] & 16711680) >> 16);
                        var1[var33 + var15] = (var41 + var40 >> 8) + (var39 + var42 >> 8 << 8) + (var38 + var43 >> 8 << 16) + -16777216;
                     }
                  }

                  var9 += var8;
               }
            }

            var11 += var7;
            var9 = var28;
            var15 += this.iT;
            var5 += var4;
         }
      } catch (Exception var45) {
         System.out.println("error in transparent sprite plot routine");
      }

   }

   public final com.rsc.a.b.c k(int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var3 * var4];
      int var6 = 0;

      for(int var7 = var1; var7 < var1 + var3; ++var7) {
         for(int var8 = var2; var8 < var2 + var4; ++var8) {
            var5[var6++] = this.jp[var7 + var8 * this.iT];
         }
      }

      com.rsc.a.b.c var9 = new com.rsc.a.b.c();
      var9.cm = a(var5, var3, var4);
      var9.ck = var3;
      var9.cl = var4;
      return var9;
   }

   public final void f(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.jr > var1) {
         var3 -= this.jr - var1;
         var1 = this.jr;
      }

      if (this.js < var3 + var1) {
         var3 = this.js - var1;
      }

      int var7 = (var5 & 16711680) >> 16;
      int var8 = var5 >> 8 & 255;
      int var9 = var5 & 255;
      int var10 = (var6 & 16711680) >> 16;
      int var11 = var6 >> 8 & 255;
      int var12 = var6 & 255;
      int var13 = this.iT - var3;
      byte var14 = 1;
      if (this.ja) {
         var13 += this.iT;
         var14 = 2;
         if ((var2 & 1) != 0) {
            ++var2;
            --var4;
         }
      }

      int var15 = var1 + this.iT * var2;

      for(int var16 = 0; var4 > var16; var16 += var14) {
         if (this.jq <= var16 + var2 && var2 + var16 < this.jt) {
            int var17 = ((var8 * var16 + var11 * (var4 - var16)) / var4 << 8) + ((var10 * (var4 - var16) + var7 * var16) / var4 << 16) + (var16 * var9 + var12 * (var4 - var16)) / var4;

            for(int var18 = -var3; var18 < 0; ++var18) {
               this.jp[var15++] = var17;
            }

            var15 += var13;
         } else {
            var15 += this.iT;
         }
      }

   }

   public final void a(int var1, String var2, int var3, int var4, int var5) {
      this.a(var1, var3, var2, var4, -12200, var5, 0);
   }

   public final void c(boolean var1) {
      int var2 = this.jo * this.iT;
      int var3;
      if (var1 == !this.ja) {
         for(var3 = 0; var2 > var3; ++var3) {
            this.jp[var3] = 0;
         }
      } else {
         var3 = 0;

         for(int var4 = -this.jo; var4 < 0; var4 += 2) {
            for(int var5 = -this.iT; var5 < 0; ++var5) {
               this.jp[var3++] = 0;
            }

            var3 += this.iT;
         }
      }

   }

   private final int ab(int var1) {
      return var1 != 0 ? com.rsc.c.a.dp[var1][8] - 1 : com.rsc.c.a.dp[var1][8] - 2;
   }

   public final com.rsc.a.b.c l(int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var3 * var4];
      int var6 = 0;

      for(int var7 = var2; var7 < var2 + var4; ++var7) {
         for(int var8 = var1; var8 < var1 + var3; ++var8) {
            var5[var6++] = this.jp[var8 + var7 * this.iT];
         }
      }

      com.rsc.a.b.c var9 = new com.rsc.a.b.c();
      var9.cm = new com.rsc.a.b.a((byte[])null, var5, var3, var4);
      var9.ck = var3;
      var9.cl = var4;
      return var9;
   }

   public final void e(int var1, int var2, int var3, int var4, int var5) {
      if (var1 < this.jr) {
         var3 -= this.jr - var1;
         var1 = this.jr;
      }

      if (this.jq > var2) {
         var4 -= this.jq - var2;
         var2 = this.jq;
      }

      if (this.jt < var2 + var4) {
         var4 = this.jt - var2;
      }

      if (this.js < var3 + var1) {
         var3 = this.js - var1;
      }

      int var6 = this.iT - var3;
      byte var7 = 1;
      if (this.ja) {
         var6 += this.iT;
         if ((var2 & 1) != 0) {
            --var4;
            ++var2;
         }

         var7 = 2;
      }

      int var8 = var1 + this.iT * var2;

      for(int var9 = -var4; var9 < 0; var9 += var7) {
         for(int var10 = -var3; var10 < 0; ++var10) {
            this.jp[var8++] = var5;
         }

         var8 += var6;
      }

   }

   public final void g(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 < this.jq) {
         var4 -= this.jq - var2;
         var2 = this.jq;
      }

      if (this.jr > var1) {
         var3 -= this.jr - var1;
         var1 = this.jr;
      }

      if (this.js < var1 + var3) {
         var3 = this.js - var1;
      }

      if (this.jt < var4 + var2) {
         var4 = this.jt - var2;
      }

      int var7 = 256 - var6;
      int var8 = var6 * (var5 >> 16 & 255);
      int var9 = ((var5 & 'ￄ') >> 8) * var6;
      int var10 = var6 * (var5 & 255);
      int var11 = this.iT - var3;
      byte var12 = 1;
      if (this.ja) {
         if ((var2 & 1) != 0) {
            --var4;
            ++var2;
         }

         var11 += this.iT;
         var12 = 2;
      }

      int var13 = var1 + this.iT * var2;

      for(int var14 = 0; var14 < var4; var14 += var12) {
         for(int var15 = -var3; var15 < 0; ++var15) {
            int var16 = var7 * (this.jp[var13] & 255);
            int var17 = var7 * ((16711680 & this.jp[var13]) >> 16);
            int var18 = var7 * (('\uff00' & this.jp[var13]) >> 8);
            int var19 = (var16 + var10 >> 8) + (var18 + var9 >> 8 << 8) + (var8 + var17 >> 8 << 16);
            this.jp[var13++] = var19;
         }

         var13 += var11;
      }

   }

   public final void f(int var1, int var2, int var3, int var4, int var5) {
      this.m(var1, var3, var2, var5);
      this.m(var1, var4 - 1 + var3, var2, var5);
      this.n(var1, var3, var5, var4);
      this.n(var2 + var1 - 1, var3, var5, var4);
   }

   public final void g(int var1, int var2, int var3, int var4, int var5) {
      int var6 = 256 - var5;
      int var7 = var5 * (255 & var4 >> 16);
      int var8 = (255 & var4 >> 8) * var5;
      int var9 = var5 * (var4 & 255);
      int var10 = var2 - var3;
      if (var10 < 0) {
         var10 = 0;
      }

      int var11 = var2 + var3;
      if (this.jo <= var11) {
         var11 = this.jo - 1;
      }

      byte var12 = 1;
      if (this.ja) {
         if ((1 & var10) != 0) {
            ++var10;
         }

         var12 = 2;
      }

      for(int var13 = var10; var11 >= var13; var13 += var12) {
         int var14 = var13 - var2;
         int var15 = (int)Math.sqrt((double)(var3 * var3 - var14 * var14));
         int var16 = var1 - var15;
         if (var16 < 0) {
            var16 = 0;
         }

         int var17 = var1 + var15;
         if (this.iT <= var17) {
            var17 = this.iT - 1;
         }

         int var18 = var16 + this.iT * var13;

         for(int var19 = var16; var17 >= var19; ++var19) {
            int var20 = (this.jp[var18] & 255) * var6;
            int var21 = var6 * (('\uff00' & this.jp[var18]) >> 8);
            int var22 = var6 * ((this.jp[var18] & 16711680) >> 16);
            int var23 = (var20 + var9 >> 8) + (var8 + var21 >> 8 << 8) + (var7 + var22 >> 8 << 16);
            this.jp[var18++] = var23;
         }
      }

   }

   public final void a(int var1, int var2, String var3, int var4, int var5, int var6, String var7) {
      this.b(var1, var2, var3, var4, var5, var6, var7);
   }

   public final void a(int var1, int var2, String var3, int var4, int var5, int var6) {
      this.b(var1, var2, var3, var4, var5, var6, (String)null);
   }

   public final void b(int var1, int var2, String var3, int var4, int var5, int var6) {
      this.b(var1, var2, var3, var4, var5, var6, (String)null);
   }

   public final void b(int var1, int var2, String var3, int var4, int var5, int var6, String var7) {
      try {
         if (var7 != null) {
            this.a(var7, var1, var2, var5, var4);
            var1 += this.c(var4, var7);
         }

         if (var6 > 0) {
            com.rsc.a.b.c var8 = this.b("crowns", var6);
            if (var8 != null) {
               this.a(var8, var1, var2 - var8.cm.br);
               var1 += var8.cm.bq + 3;
            }
         }

         this.jm = false;
         byte[] var15 = com.rsc.c.a.dp[var4];

         for(int var9 = 0; var3.length() > var9; ++var9) {
            if (var3.charAt(var9) == '@' && var9 + 4 < var3.length() && var3.charAt(var9 + 4) == '@') {
               String var17 = var3.substring(var9 + 1, var9 + 4);
               var5 = this.a(var17, var5);
               var9 += 4;
            } else {
               char var10;
               char var16;
               char var18;
               if (var3.charAt(var9) == '~' && 4 + var9 < var3.length() && var3.charAt(4 + var9) == '~') {
                  var10 = var3.charAt(var9 + 1);
                  var16 = var3.charAt(var9 + 2);
                  var18 = var3.charAt(var9 + 3);
                  if (var10 >= '0' && var10 <= '9' && var16 >= '0' && var16 <= '9' && var18 >= '0' && var18 <= '9') {
                     var1 = Integer.parseInt(var3.substring(var9 + 1, var9 + 4));
                  }

                  var9 += 4;
               } else if (var3.charAt(var9) == '~' && var9 + 5 < var3.length() && var3.charAt(var9 + 5) == '~') {
                  var10 = var3.charAt(var9 + 1);
                  var16 = var3.charAt(var9 + 2);
                  var18 = var3.charAt(var9 + 3);
                  char var13 = var3.charAt(var9 + 4);
                  if (var10 >= '0' && var10 <= '9' && var16 >= '0' && var16 <= '9' && var18 >= '0' && var18 <= '9' && var13 >= '0' && var13 <= '9') {
                     var1 = Integer.parseInt(var3.substring(var9 + 1, var9 + 5));
                  }

                  var9 += 5;
               } else {
                  var10 = var3.charAt(var9);
                  if (var10 == 160) {
                     var10 = ' ';
                  }

                  if (var10 < 0 || var10 >= com.rsc.c.a.dq.length) {
                     var10 = ' ';
                  }

                  int var11 = com.rsc.c.a.dq[var10];
                  if (this.jn && !com.rsc.c.a.ds[var4] && var5 != 0) {
                     this.a(com.rsc.c.a.ds[var4], var15, 1 + var1, 0, var11, var2);
                  }

                  if (this.jn && !com.rsc.c.a.ds[var4] && var5 != 0) {
                     this.a(com.rsc.c.a.ds[var4], var15, var1, 0, var11, var2 + 1);
                  }

                  this.a(com.rsc.c.a.ds[var4], var15, var1, var5, var11, var2);
                  if (this.jm) {
                     byte var12 = var15[var11 + 3];
                     this.m(var1 - 1, var2 - 4, var12 + (int)((double)var12 * 0.7D), 8388608);
                  }

                  var1 += var15[var11 + 7];
               }
            }
         }
      } catch (Exception var14) {
         System.out.println("drawstring: " + var14);
         var14.printStackTrace();
      }

   }

   public final void c(int var1, int var2, String var3, int var4, int var5, int var6) {
      this.b(var1 - this.c(var5, var3) / 2, var2, var3, var5, var4, var6, (String)null);
   }

   private void a(int var1, int var2, int var3, String var4, int var5, int var6) {
      this.a(var5 - this.c(var2, var4) / 2, var6, var4, var2, var1, var3);
   }

   public final void a(int var1, String var2, int var3, int var4, int var5, int var6) {
      this.a(var3, var5, var4, var2, var1, var6);
   }

   public final void m(int var1, int var2, int var3, int var4) {
      if (this.jq <= var2 && var2 < this.jt) {
         if (this.jr > var1) {
            var3 -= this.jr - var1;
            var1 = this.jr;
         }

         if (var1 + var3 > this.js) {
            var3 = this.js - var1;
         }

         if (var3 > 0) {
            int var5 = var1 + this.iT * var2;

            for(int var6 = 0; var3 > var6; ++var6) {
               this.jp[var5 + var6] = var4;
            }
         }
      }

   }

   public final void n(int var1, int var2, int var3, int var4) {
      if (this.jr <= var1 && var1 < this.js) {
         if (var2 < this.jq) {
            var4 -= this.jq - var2;
            var2 = this.jq;
         }

         if (var2 + var4 > this.jt) {
            var4 = this.jt - var2;
         }

         if (var4 > 0) {
            int var5 = var1 + this.iT * var2;

            for(int var6 = 0; var4 > var6; ++var6) {
               this.jp[var5 + this.iT * var6] = var3;
            }
         }
      }

   }

   public final void a(com.rsc.a.b.c var1, int var2, int var3, int var4, int var5) {
      int var6 = this.iT;
      int var7 = this.jo;
      int var8 = -var1.ck / 2;
      int var9 = -var1.cl / 2;
      if (var1.ch) {
         var8 += var1.ci;
         var9 += var1.cj;
      }

      int var10 = var1.cm.bq + var8;
      int var11 = var1.cm.br + var9;
      var5 &= 255;
      int var12 = i.hO[var5] * var4;
      int var13 = i.hP[var5] * var4;
      int var14 = var3 + (var13 * var8 + var9 * var12 >> 22);
      int var15 = var2 + (var9 * var13 - var8 * var12 >> 22);
      int var16 = (var10 * var13 + var9 * var12 >> 22) + var3;
      int var17 = var2 + (var13 * var9 - var10 * var12 >> 22);
      int var18 = (var12 * var11 + var13 * var10 >> 22) + var3;
      int var19 = (var13 * var11 - var12 * var10 >> 22) + var2;
      int var20 = (var8 * var13 + var12 * var11 >> 22) + var3;
      int var21 = var2 + (var11 * var13 - var8 * var12 >> 22);
      int var22 = var15;
      int var23 = var15;
      if (var15 > var17) {
         var22 = var17;
      } else if (var17 > var15) {
         var23 = var17;
      }

      if (var22 > var19) {
         var22 = var19;
      } else if (var19 > var23) {
         var23 = var19;
      }

      if (var22 > var21) {
         var22 = var21;
      } else if (var21 > var23) {
         var23 = var21;
      }

      if (this.jq > var22) {
         var22 = this.jq;
      }

      if (this.jz == null || var7 + 1 != this.jz.length) {
         this.ju = new int[var7 + 1];
         this.jv = new int[1 + var7];
         this.jw = new int[var7 + 1];
         this.jx = new int[1 + var7];
         this.jy = new int[1 + var7];
         this.jz = new int[var7 + 1];
      }

      if (var23 > this.jt) {
         var23 = this.jt;
      }

      int var24;
      for(var24 = var22; var24 <= var23; ++var24) {
         this.jz[var24] = 99999999;
         this.jw[var24] = -99999999;
      }

      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = var1.cm.bq;
      var10 = var28 - 1;
      int var29 = var1.cm.br;
      int var30 = var28 - 1;
      byte var31 = 0;
      byte var32 = 0;
      byte var33 = 0;
      byte var34 = 0;
      var11 = var29 - 1;
      int var35 = var29 - 1;
      int var36;
      int var37;
      int var38;
      if (var15 > var21) {
         var36 = var15;
         var38 = var35 << 8;
         var24 = var21;
         var37 = var20 << 8;
      } else {
         var36 = var21;
         var24 = var15;
         var38 = var32 << 8;
         var37 = var14 << 8;
      }

      if (var15 != var21) {
         var27 = (var35 - var32 << 8) / (var21 - var15);
         var25 = (var20 - var14 << 8) / (var21 - var15);
      }

      if (var24 < 0) {
         var37 -= var25 * var24;
         var38 -= var24 * var27;
         var24 = 0;
      }

      if (var7 - 1 < var36) {
         var36 = var7 - 1;
      }

      int var39;
      int[] var40;
      for(var39 = var24; var36 >= var39; ++var39) {
         this.jz[var39] = this.jw[var39] = var37;
         var37 += var25;
         var40 = this.jv;
         this.jx[var39] = 0;
         var40[var39] = 0;
         this.ju[var39] = this.jy[var39] = var38;
         var38 += var27;
      }

      if (var15 != var17) {
         var25 = (var16 - var14 << 8) / (var17 - var15);
         var26 = (var30 - var31 << 8) / (var17 - var15);
      }

      int var41;
      if (var17 < var15) {
         var41 = var30 << 8;
         var36 = var15;
         var24 = var17;
         var37 = var16 << 8;
      } else {
         var37 = var14 << 8;
         var24 = var15;
         var41 = var31 << 8;
         var36 = var17;
      }

      if (var7 - 1 < var36) {
         var36 = var7 - 1;
      }

      if (var24 < 0) {
         var41 -= var26 * var24;
         var37 -= var25 * var24;
         var24 = 0;
      }

      for(var39 = var24; var36 >= var39; ++var39) {
         if (this.jz[var39] > var37) {
            this.jz[var39] = var37;
            this.jv[var39] = var41;
            this.ju[var39] = 0;
         }

         if (var37 > this.jw[var39]) {
            this.jw[var39] = var37;
            this.jx[var39] = var41;
            this.jy[var39] = 0;
         }

         var37 += var25;
         var41 += var26;
      }

      if (var19 >= var17) {
         var41 = var30 << 8;
         var38 = var33 << 8;
         var24 = var17;
         var37 = var16 << 8;
         var36 = var19;
      } else {
         var41 = var10 << 8;
         var36 = var17;
         var38 = var11 << 8;
         var37 = var18 << 8;
         var24 = var19;
      }

      if (var17 != var19) {
         var27 = (var11 - var33 << 8) / (var19 - var17);
         var25 = (var18 - var16 << 8) / (var19 - var17);
      }

      if (var36 > var7 - 1) {
         var36 = var7 - 1;
      }

      if (var24 < 0) {
         var37 -= var25 * var24;
         var38 -= var27 * var24;
         var24 = 0;
      }

      for(var39 = var24; var39 <= var36; ++var39) {
         if (this.jz[var39] > var37) {
            this.jz[var39] = var37;
            this.jv[var39] = var41;
            this.ju[var39] = var38;
         }

         if (var37 > this.jw[var39]) {
            this.jw[var39] = var37;
            this.jx[var39] = var41;
            this.jy[var39] = var38;
         }

         var37 += var25;
         var38 += var27;
      }

      if (var21 != var19) {
         var25 = (var20 - var18 << 8) / (var21 - var19);
         var26 = (var34 - var10 << 8) / (var21 - var19);
      }

      if (var21 < var19) {
         var41 = var34 << 8;
         var36 = var19;
         var24 = var21;
         var38 = var35 << 8;
         var37 = var20 << 8;
      } else {
         var24 = var19;
         var38 = var11 << 8;
         var37 = var18 << 8;
         var41 = var10 << 8;
         var36 = var21;
      }

      if (var24 < 0) {
         var37 -= var24 * var25;
         var41 -= var24 * var26;
         var24 = 0;
      }

      if (var7 - 1 < var36) {
         var36 = var7 - 1;
      }

      for(var39 = var24; var36 >= var39; ++var39) {
         if (var37 < this.jz[var39]) {
            this.jz[var39] = var37;
            this.jv[var39] = var41;
            this.ju[var39] = var38;
         }

         if (var37 > this.jw[var39]) {
            this.jw[var39] = var37;
            this.jx[var39] = var41;
            this.jy[var39] = var38;
         }

         var37 += var25;
         var41 += var26;
      }

      var39 = var22 * var6;
      var40 = var1.bb();

      for(int var42 = var22; var42 < var23; ++var42) {
         int var43 = this.jz[var42] >> 8;
         int var44 = this.jw[var42] >> 8;
         if (var44 - var43 > 0) {
            int var45 = this.jv[var42] << 9;
            int var46 = ((this.jx[var42] << 9) - var45) / (var44 - var43);
            int var47 = this.ju[var42] << 9;
            int var48 = ((this.jy[var42] << 9) - var47) / (var44 - var43);
            if (var44 > this.js) {
               var44 = this.js;
            }

            if (var43 < this.jr) {
               var47 += (this.jr - var43) * var48;
               var45 += (this.jr - var43) * var46;
               var43 = this.jr;
            }

            if (!this.ja || (var42 & 1) == 0) {
               if (var1.ch) {
                  this.a(var48, var43 - var44, var45, var40, this.jp, var47, var43 + var39, var28, var46);
               } else {
                  this.a(var43 - var44, var28, this.jp, var46, var47, var45, var40, var48, var43 + var39);
               }
            }

            var39 += var6;
         } else {
            var39 += var6;
         }
      }

   }

   public final void a(com.rsc.a.b.c var1, int var2, int var3) {
      if (var1.ch) {
         var2 += var1.ci;
         var3 += var1.cj;
      }

      int var4 = var3 * this.iT + var2;
      int var5 = 0;
      int var6 = var1.cm.br;
      int var7 = var1.cm.bq;
      int var8 = this.iT - var7;
      int var9 = 0;
      int var10;
      if (this.jq > var3) {
         var10 = this.jq - var3;
         var6 -= var10;
         var3 = this.jq;
         var4 += this.iT * var10;
         var5 += var10 * var7;
      }

      if (var3 + var6 >= this.jt) {
         var6 -= 1 + (var6 + var3 - this.jt);
      }

      if (var2 < this.jr) {
         var10 = this.jr - var2;
         var5 += var10;
         var8 += var10;
         var7 -= var10;
         var9 += var10;
         var2 = this.jr;
         var4 += var10;
      }

      if (var2 + var7 >= this.js) {
         var10 = var2 + var7 - this.js + 1;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         byte var11 = 1;
         if (this.ja) {
            var8 += this.iT;
            if ((1 & var3) != 0) {
               var4 += this.iT;
               --var6;
            }

            var11 = 2;
            var9 += var1.cm.bq;
         }

         this.a(var7, this.jp, var11, var6, var5, var4, var1.bb(), var8, var9);
      }

   }

   public void a(com.rsc.a.a.g var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < 12; ++var7) {
         int var8 = this.a.dC()[0][var7];
         int var9 = var1.t(var8);
         com.rsc.a.a.a var10 = com.rsc.a.a.m(var9);
         if (var10 != null && var9 >= 0) {
            com.rsc.a.b.c var11 = this.a.dB().c(var10.ad(), var6);
            int var12 = com.rsc.a.a.m(var9).ae();
            int var13 = var1.aF();
            if (var12 == 1) {
               var12 = var1.aC();
            } else if (var12 == 2) {
               var12 = var1.aD();
            } else if (var12 == 3) {
               var12 = var1.aE();
            }

            this.a(var11, var2, var3, var4, var5, var12, var13, false, 0, 1);
         }
      }

   }

   public final void a(String var1, int var2, int var3, int var4, int var5) {
      this.b(var2, var3, var1, var5, var4, -1, (String)null);
   }

   public final void b(com.rsc.a.b.c var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = var1.cm.bq;
         int var7 = var1.cm.br;
         int var8 = 0;
         int var9 = 0;
         int var10 = (var6 << 16) / var4;
         int var11 = (var7 << 16) / var5;
         int var12;
         int var13;
         if (var1.ch) {
            var12 = var1.ck;
            var13 = var1.cl;
            if (var12 == 0 || var13 == 0) {
               return;
            }

            if (var1.cj * var5 % var13 != 0) {
               var9 = (var13 - var5 * var1.cj % var13 << 16) / var5;
            }

            var10 = (var12 << 16) / var4;
            if (var1.ci * var4 % var12 != 0) {
               var8 = (var12 - var1.ci * var4 % var12 << 16) / var4;
            }

            var2 += (var4 * var1.ci + var12 - 1) / var12;
            var11 = (var13 << 16) / var5;
            var3 += (var13 + var5 * var1.cj - 1) / var13;
            var5 = (var1.cm.br - (var9 >> 16)) * var5 / var13;
            var4 = var4 * (var1.cm.bq - (var8 >> 16)) / var12;
         }

         var12 = var2 + this.iT * var3;
         int var14;
         if (var3 < this.jq) {
            var14 = this.jq - var3;
            var9 += var11 * var14;
            var5 -= var14;
            var12 += this.iT * var14;
            var3 = 0;
         }

         var13 = this.iT - var4;
         if (var3 + var5 >= this.jt) {
            var5 -= var3 - this.jt + var5 + 1;
         }

         if (var2 < this.jr) {
            var14 = this.jr - var2;
            var4 -= var14;
            var13 += var14;
            var12 += var14;
            var2 = 0;
            var8 += var10 * var14;
         }

         if (this.js <= var2 + var4) {
            var14 = 1 + var2 + (var4 - this.js);
            var13 += var14;
            var4 -= var14;
         }

         byte var16 = 1;
         if (this.ja) {
            if ((var3 & 1) != 0) {
               --var5;
               var12 += this.iT;
            }

            var13 += this.iT;
            var16 = 2;
            var11 += var11;
         }

         this.a(var1.bb(), var8, var9, var6, this.jp, var12, var4, var5, var13, var16, var10, var11);
      } catch (Exception var15) {
         System.out.println("error in sprite clipping routine");
      }

   }

   public final void by() {
      int var1 = this.jo * this.iT;

      for(int var2 = 0; var1 > var2; ++var2) {
         int var3 = 16777215 & this.jp[var2];
         this.jp[var2] = (var3 >>> 1 & 8355711) + (var3 >>> 2 & 4144959) + (var3 >>> 3 & 2039583) + (var3 >>> 4 & 986895);
      }

   }

   public int ac(int var1) {
      return var1 < this.jA.length ? this.jA[var1] : this.ab(var1);
   }

   private final void a(int var1, int[] var2, int var3, int var4, int var5, int var6, int var7, byte[] var8, int var9) {
      try {
         int var10 = -(var6 >> 2);
         var6 = -(var6 & 3);

         for(int var11 = -var5; var11 < 0; ++var11) {
            int var12;
            for(var12 = var10; var12 < 0; ++var12) {
               if (var8[var7++] != 0) {
                  var2[var3++] = var1;
               } else {
                  ++var3;
               }

               if (var8[var7++] == 0) {
                  ++var3;
               } else {
                  var2[var3++] = var1;
               }

               if (var8[var7++] == 0) {
                  ++var3;
               } else {
                  var2[var3++] = var1;
               }

               if (var8[var7++] != 0) {
                  var2[var3++] = var1;
               } else {
                  ++var3;
               }
            }

            for(var12 = var6; var12 < 0; ++var12) {
               if (var8[var7++] == 0) {
                  ++var3;
               } else {
                  var2[var3++] = var1;
               }
            }

            var7 += var9;
            var3 += var4;
         }
      } catch (Exception var13) {
         System.out.println("plotletter: " + var13);
         var13.printStackTrace();
      }

   }

   private final void a(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int var9) {
      for(int var10 = -var5; var10 < 0; ++var10) {
         for(int var11 = -var3; var11 < 0; ++var11) {
            int var12 = 255 & var1[var9++];
            if (var12 <= 30) {
               ++var4;
            } else if (var12 < 230) {
               int var13 = var8[var4];
               var8[var4++] = ((var10 & 16711935) * var12 + (var13 & 16711935) * (256 - var12) & -16711936) + ((var10 & '\uff00') * var12 + (var13 & '\uff00') * (256 - var12) & 16711680) >> 8;
            } else {
               var8[var4++] = var2;
            }
         }

         var9 += var6;
         var4 += var7;
      }

   }

   public final void o(int var1, int var2, int var3, int var4) {
      if (this.jo < var3) {
         var3 = this.jo;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > this.iT) {
         var2 = this.iT;
      }

      this.jq = var4;
      this.jt = var3;
      this.js = var2;
      this.jr = var1;
   }

   public final void n(int var1, int var2, int var3) {
      if (this.jr <= var1 && this.jq <= var2 && this.js > var1 && this.jt > var2) {
         this.jp[var1 + this.iT * var2] = var3;
      }

   }

   public final void a(com.rsc.a.b.c var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10) {
      this.a(var1, var2, var3, var4, var5, var6, var7, 0, 255, var8, var9, var10);
   }

   public final void a(com.rsc.a.b.c var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12) {
      try {
         if (var7 == 0) {
            var7 = 16777215;
         }

         if (var6 == 0) {
            var6 = 16777215;
         }

         if (var8 == 0) {
            var8 = 16777215;
         }

         int var13 = var1.cm.bq;
         int var14 = var1.cm.br;
         int var15 = 0;
         int var16 = 0;
         int var17 = var11 << 16;
         int var18 = (var13 << 16) / var4;
         int var19 = (var14 << 16) / var5;
         int var20 = -(var11 << 16) / var5;
         int var21;
         int var22;
         if (var1.ch) {
            var21 = var1.ck;
            var22 = var1.cl;
            if (var21 == 0 || var22 == 0) {
               return;
            }

            var18 = (var21 << 16) / var4;
            var19 = (var22 << 16) / var5;
            int var23 = var1.ci;
            int var24 = var1.cj;
            if (var10) {
               var23 = var21 - var1.cm.bq - var23;
            }

            var2 += (var21 + var23 * var4 - 1) / var21;
            int var25 = (var24 * var5 + var22 - 1) / var22;
            if (var23 * var4 % var21 != 0) {
               var15 = (var21 - var4 * var23 % var21 << 16) / var4;
            }

            var3 += var25;
            var17 += var25 * var20;
            if (var24 * var5 % var22 != 0) {
               var16 = (var22 - var5 * var24 % var22 << 16) / var5;
            }

            var4 = (var18 + ((var1.cm.bq << 16) - (var15 + 1))) / var18;
            var5 = ((var1.cm.br << 16) - var16 - (1 - var19)) / var19;
         }

         var21 = this.iT * var3;
         var17 += var2 << 16;
         if (var3 < this.jq) {
            var22 = this.jq - var3;
            var17 += var20 * var22;
            var5 -= var22;
            var16 += var22 * var19;
            var21 += this.iT * var22;
            var3 = this.jq;
         }

         if (var3 + var5 >= this.jt) {
            var5 -= 1 + var3 + var5 - this.jt;
         }

         var22 = var21 / this.iT & var12;
         if (!this.ja) {
            var22 = 2;
         }

         if (var7 == 16777215 && var8 == 16777215 && var9 == 255) {
            if (null != var1.cm) {
               if (var10) {
                  this.a(var1.bb(), var16, (var1.cm.bq << 16) - (var15 + 1), var13, this.jp, var4, var5, var20, var21, var17, -var18, var19, var22, var6);
               } else {
                  this.a(var1.bb(), var16, var15, var13, this.jp, var4, var5, var20, var21, var17, var18, var19, var22, var6);
               }
            }
         } else if (var10) {
            this.a(this.jp, var1.bb(), var4, var20, var17, var7, var19, -var18, (var1.cm.bq << 16) - var15 - 1, var22, var16, var13, var6, var5, var21, var8, var9);
         } else {
            this.a(this.jp, var1.bb(), var4, var20, var17, var7, var19, var18, var15, var22, var16, var13, var6, var5, var21, var8, var9);
         }
      } catch (Exception var26) {
         var26.printStackTrace();
         System.out.println("error in sprite clipping routine");
      }

   }

   public final int c(int var1, String var2) {
      int var3 = 0;
      byte[] var4 = com.rsc.c.a.dp[var1];

      for(int var5 = 0; var5 < var2.length(); ++var5) {
         if (var2.charAt(var5) == '@' && 4 + var5 < var2.length() && var2.charAt(var5 + 4) == '@') {
            var5 += 4;
         } else if (var2.charAt(var5) == '~' && var5 + 4 < var2.length() && var2.charAt(var5 + 4) == '~') {
            var5 += 4;
         } else {
            char var6 = var2.charAt(var5);
            if (var6 < 0 || var6 >= com.rsc.c.a.dq.length) {
               var6 = ' ';
            }

            var3 += var4[com.rsc.c.a.dq[var6] + 7];
         }
      }

      return var3;
   }

   private final void a(int[] var1, int var2, int var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      int var14 = 256 - var12;

      try {
         int var15 = var2;

         for(int var16 = -var9; var16 < 0; var16 += var13) {
            int var17 = var8 * (var3 >> 16);
            var3 += var11;

            for(int var18 = -var6; var18 < 0; ++var18) {
               int var19 = var1[var17 + (var2 >> 16)];
               var2 += var10;
               if (var19 == 0) {
                  ++var5;
               } else {
                  int var20 = var4[var5];
                  var4[var5++] = ((var19 & 16711935) * var12 + (var20 & 16711935) * var14 & -16711936) + ((var16 & '\uff00') * var12 + (var20 & '\uff00') * var14 & 16711680) >> 8;
               }
            }

            var5 += var7;
            var2 = var15;
         }
      } catch (Exception var21) {
         System.out.println("error in tran_scale");
      }

   }

   private final void a(int[] var1, int var2, int var3, int var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      int var15 = (16711680 & var14) >> 16;
      int var16 = (var14 & '\uff00') >> 8;
      int var17 = 255 & var14;

      try {
         int var18 = var3;

         for(int var19 = -var7; var19 < 0; ++var19) {
            int var20 = (var2 >> 16) * var4;
            int var21 = var10 >> 16;
            int var22 = var6;
            int var23;
            if (var21 < this.jr) {
               var23 = this.jr - var21;
               var21 = this.jr;
               var22 = var6 - var23;
               var3 += var11 * var23;
            }

            var13 = 1 - var13;
            if (var21 + var22 >= this.js) {
               var23 = var22 + var21 - this.js;
               var22 -= var23;
            }

            if (var13 != 0) {
               for(var23 = var21; var23 < var22 + var21; ++var23) {
                  int var24 = var1[var20 + (var3 >> 16)];
                  if (var24 != 0) {
                     int var25 = var24 & 255;
                     int var26 = (var24 & 16711680) >> 16;
                     int var27 = 255 & var24 >> 8;
                     if (var26 == var27 && var25 == var27) {
                        var5[var9 + var23] = (var25 * var17 >> 8) + (var16 * var27 >> 8 << 8) + (var15 * var26 >> 8 << 16) + -16777216;
                     } else {
                        var5[var9 + var23] = var24;
                     }
                  }

                  var3 += var11;
               }
            }

            var2 += var12;
            var3 = var18;
            var10 += var8;
            var9 += this.iT;
         }
      } catch (Exception var28) {
         System.out.println("error in transparent sprite plot routine");
      }

   }

   public int a(String var1, int var2) {
      var1 = var1.replaceAll("@", "");
      if (var1.equalsIgnoreCase("red")) {
         var2 = 16711680;
      } else if (var1.equalsIgnoreCase("lre")) {
         var2 = 16748608;
      } else if (var1.equalsIgnoreCase("yel")) {
         var2 = 16776960;
      } else if (var1.equalsIgnoreCase("gre")) {
         var2 = 65280;
      } else if (var1.equalsIgnoreCase("blu")) {
         var2 = 255;
      } else if (var1.equalsIgnoreCase("qlu")) {
         var2 = 128;
      } else if (var1.equalsIgnoreCase("cya")) {
         var2 = 65535;
      } else if (var1.equalsIgnoreCase("mag")) {
         var2 = 16711935;
      } else if (var1.equalsIgnoreCase("whi")) {
         var2 = 16777215;
      } else if (var1.equalsIgnoreCase("bla")) {
         var2 = 0;
      } else if (var1.equalsIgnoreCase("dre")) {
         var2 = 12582912;
      } else if (var1.equalsIgnoreCase("sil")) {
         var2 = 12632256;
      } else if (var1.equalsIgnoreCase("lsi")) {
         var2 = 13882323;
      } else if (var1.equalsIgnoreCase("pre")) {
         var2 = 172031;
      } else if (var1.equalsIgnoreCase("ora")) {
         var2 = 16748608;
      } else if (var1.equalsIgnoreCase("ran")) {
         var2 = (int)(1.6777215E7D * Math.random());
      } else if (var1.equalsIgnoreCase("or1")) {
         var2 = 16756736;
      } else if (var1.equalsIgnoreCase("or2")) {
         var2 = 16740352;
      } else if (var1.equalsIgnoreCase("or3")) {
         var2 = 16723968;
      } else if (var1.equalsIgnoreCase("gr1")) {
         var2 = 12648192;
      } else if (var1.equalsIgnoreCase("gr2")) {
         var2 = 8453888;
      } else if (var1.equalsIgnoreCase("gr3")) {
         var2 = 4259584;
      } else if (var1.equalsIgnoreCase("pur")) {
         var2 = 10494192;
      } else if (var1.equalsIgnoreCase("pty")) {
         var2 = 11184127;
      } else if (var1.equalsIgnoreCase("ptl")) {
         var2 = 7783935;
      } else if (var1.equalsIgnoreCase("gng")) {
         var2 = 16743680;
      } else if (var1.equalsIgnoreCase("gnl")) {
         var2 = 16729865;
      } else if (var1.equalsIgnoreCase("gry")) {
         var2 = 8421504;
      } else if (var1.equalsIgnoreCase("str")) {
         this.jm = true;
      } else if (var1.equalsIgnoreCase("end")) {
         this.jm = false;
      } else if (var1.equalsIgnoreCase("leg")) {
         var2 = 8293641;
      }

      return var2;
   }

   public com.rsc.a.b.c b(String var1, int var2) {
      return com.rsc.g.i.s(var1).t("").aQ(var2);
   }

   public com.rsc.a.b.c b(String var1, String var2, int var3) {
      return com.rsc.g.i.s(var1).t(var2.toLowerCase()).aQ(var3);
   }

   public com.rsc.a.b.c c(String var1, int var2) {
      return this.b("animations", var1.toLowerCase(), var2);
   }

   public com.rsc.a.b.c m(int var1, int var2) {
      return this.b("animations", com.rsc.a.a.m(var1).ad().toLowerCase(), var2);
   }

   public com.rsc.a.b.c ad(int var1) {
      com.rsc.a.a.f var2 = com.rsc.a.a.l(var1);
      return var2 == null ? null : this.b("items", var2.ay());
   }

   public com.rsc.a.b.c ae(int var1) {
      return this.b("interfaces", var1);
   }

   public int av() {
      return this.jo;
   }

   public int au() {
      return this.iT;
   }
}
