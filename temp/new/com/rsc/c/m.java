package com.rsc.c;

import java.io.BufferedInputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class m {
   public final int[] jC = new int[256];
   private final com.rsc.d a;
   private final int[][] jD = new int[96][96];
   private final int[][] jE = new int[96][96];
   private final int[][] jF = new int[96][96];
   private final boolean jG = false;
   public int[][] jH = new int[96][96];
   public int[] jI = new int[18432];
   public int[] jJ = new int[18432];
   public k jK;
   public boolean jL = false;
   public h[][] jM = new h[4][64];
   public h[][] jN = new h[4][64];
   public com.rsc.a.b.c jO;
   public ZipFile jP;
   private boolean jQ = true;
   private i L;
   private h jR;
   private h[] jS = new h[64];
   private com.rsc.a.b.b[] jT;
   private int[] jU = new int[4];
   private int[] jV = new int[4];
   private int[] jW = new int[4];
   public static boolean jX = false;

   public m(com.rsc.d var1, i var2, k var3) {
      this.a = var1;
      this.jK = var3;
      this.L = var2;

      int var4;
      for(var4 = 0; var4 < 64; ++var4) {
         this.jC[var4] = o(255 - var4 * 4, 255 - (int)((double)var4 * 1.75D), 255 - var4 * 4);
      }

      for(var4 = 0; var4 < 64; ++var4) {
         this.jC[64 + var4] = o(var4 * 3, 144, 0);
      }

      for(var4 = 0; var4 < 64; ++var4) {
         this.jC[128 + var4] = o(192 - (int)((double)var4 * 1.5D), 144 - (int)((double)var4 * 1.5D), 0);
      }

      for(var4 = 0; var4 < 64; ++var4) {
         this.jC[192 + var4] = o(96 - (int)((double)var4 * 1.5D), (int)((double)var4 * 1.5D) + 48, 0);
      }

      this.jT = new com.rsc.a.b.b[4];

      try {
         this.jP = new ZipFile(new File(com.rsc.c.aa + File.separator + "Landscape.rscd"));
      } catch (Exception var6) {
         var6.printStackTrace();
         System.exit(1);
      }

   }

   public static final int o(int var0, int var1, int var2) {
      var2 >>= 3;
      var0 >>= 3;
      var1 >>= 3;
      return -(var1 << 5) - 1 - (var0 << 10) - var2;
   }

   public final void a(h[] var1) {
      int var2 = 0;
      int[][] var3 = new int[][]{{65, 74, 83, 84, 97, 98, 101, 110}, {222}, {122}, {0, 1, 2, 4, 7, 9, 13, 14, 15, 24, 29, 35, 37, 39, 43, 48, 50, 55, 57, 62, 63, 64, 66, 68, 71, 75, 77, 79, 80, 81, 88, 89, 104, 124, 125, 147, 150, 158, 161, 164, 167, 181, 198, 208, 215, 221, 224, 228}, {129, 142}, {58, 61, 82, 102, 103, 154, 189}};

      for(int var4 = 0; var4 < 94; ++var4) {
         for(int var5 = 0; var5 < 94; ++var5) {
            if (this.t(var4, var5) > 48000 && this.t(var4, var5) < 60000) {
               int var6 = this.t(var4, var5) - '뮁';
               int var7 = this.r(var4, var5);

               int var8;
               int var9;
               for(var8 = 0; var8 < var3.length; ++var8) {
                  for(var9 = 0; var9 < var3[var8].length; ++var9) {
                     if (var2 == var3[var8][var9]) {
                        var7 = var8 + 1;
                        break;
                     }
                  }
               }

               if (var7 != 0 && var7 != 4) {
                  var8 = com.rsc.a.a.s(var6).av();
                  var9 = com.rsc.a.a.s(var6).au();
               } else {
                  var9 = com.rsc.a.a.s(var6).av();
                  var8 = com.rsc.a.a.s(var6).au();
               }

               this.s(var4, var5, var6, var7);
               int var10 = com.rsc.a.a.s(var6).bv;
               h var11 = var1[var10].a(false, false, false, true);
               int var12 = (var4 * 2 + var8) * 128 / 2;
               int var13 = (var5 * 2 + var9) * 128 / 2;
               var11.i(var12, -this.p(var12, var13), var13);
               var11.h(0, var7 * 32, 0);
               this.L.b(var11);
               var11.c(48, 48, -10, -50, -50);
               if (var8 > 1 || var9 > 1) {
                  for(int var14 = var4; var4 + var8 > var14; ++var14) {
                     for(int var15 = var5; var9 + var5 > var15; ++var15) {
                        if ((var4 < var14 || var5 < var15) && var6 == this.t(var14, var15) - '뮁') {
                           var13 = var15;
                           var12 = var14;
                           byte var16 = 0;
                           if (var14 >= 48 && var15 < 48) {
                              var12 = var14 - 48;
                              var16 = 1;
                           } else if (var14 < 48 && var15 >= 48) {
                              var16 = 2;
                              var13 = var15 - 48;
                           } else if (var14 >= 48 && var15 >= 48) {
                              var16 = 3;
                              var13 = var15 - 48;
                              var12 = var14 - 48;
                           }

                           this.jT[var16].d(var12, var13).ct = 0;
                        }
                     }
                  }
               }

               ++var2;
            }
         }
      }

   }

   public final void a(com.rsc.e.m var1) {
      if (var1.cf() >= 0 && var1.cg() >= 0 && var1.cf() < 95 && var1.cg() < 95 && var1.cD().ak() == 1) {
         int var2 = var1.cf();
         int var3 = var1.cg();
         int var4 = var1.cl();
         if (var4 == 0) {
            this.jH[var2][var3] |= 1;
            if (var3 > 0) {
               this.p(var2, var3 - 1, 4);
            }
         } else if (var4 == 1) {
            this.jH[var2][var3] |= 2;
            if (var2 > 0) {
               this.p(var2 - 1, var3, 8);
            }
         } else if (var4 == 2) {
            this.jH[var2][var3] |= 16;
         } else if (var4 == 3) {
            this.jH[var2][var3] |= 32;
         }

         this.t(var2, var3, 1, 1);
      }

   }

   private final void h(int var1, int var2, int var3, int var4, int var5) {
      int var6 = com.rsc.a.a.q(var1).am();
      int[] var10000;
      if (this.jD[var2][var3] < 80000) {
         var10000 = this.jD[var2];
         var10000[var3] += var6 + 80000;
      }

      if (this.jD[var4][var5] < 80000) {
         var10000 = this.jD[var4];
         var10000[var5] += var6 + 80000;
      }

   }

   private final void p(int var1, int var2, int var3) {
      this.jH[var1][var2] |= var3;
   }

   public final void p(int var1, int var2, int var3, int var4) {
      this.jH[var1][var2] &= var3 - var4;
   }

   private final int o(int var1, int var2) {
      return var1 >= 0 && var2 >= 0 && var1 < 96 && var2 < 96 ? this.jH[var1][var2] : 0;
   }

   public final void i(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 * 3;
      int var7 = var2 * 3;
      int var8 = this.L.a(var5, true);
      var8 = var8 >> 1 & 8355711;
      int var9 = this.L.a(var4, true);
      var9 = (16711423 & var9) >> 1;
      if (var3 == 0) {
         this.jK.m(var6, var7, 3, var8);
         this.jK.m(var6, 1 + var7, 2, var8);
         this.jK.m(var6, var7 + 2, 1, var8);
         this.jK.m(2 + var6, var7 + 1, 1, var9);
         this.jK.m(var6 + 1, var7 + 2, 2, var9);
      } else if (var3 == 1) {
         this.jK.m(var6, var7, 3, var9);
         this.jK.m(1 + var6, 1 + var7, 2, var9);
         this.jK.m(var6 + 2, var7 + 2, 1, var9);
         this.jK.m(var6, var7 + 1, 1, var8);
         this.jK.m(var6, 2 + var7, 2, var8);
      }

   }

   public final int a(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      int var11;
      for(int var10 = 0; var10 < 96; ++var10) {
         for(var11 = 0; var11 < 96; ++var11) {
            this.jE[var10][var11] = 0;
         }
      }

      byte var19 = 0;
      var11 = 0;
      int var12 = var3;
      int var13 = var4;
      this.jE[var3][var4] = 99;
      var1[var19] = var3;
      var2[var19] = var4;
      int var14 = var19 + 1;
      int var15 = var1.length;
      boolean var16 = false;

      while(var11 != var14) {
         var12 = var1[var11];
         var13 = var2[var11];
         var11 = (1 + var11) % var15;
         if (var12 >= var5 && var12 <= var6 && var13 >= var7 && var13 <= var8) {
            var16 = true;
            break;
         }

         if (var9) {
            if (var12 > 0 && var5 <= var12 - 1 && var6 >= var12 - 1 && var7 <= var13 && var8 >= var13 && (jX || (this.jH[var12 - 1][var13] & 8) == 0)) {
               var16 = true;
               break;
            }

            if (var12 < 95 && 1 + var12 >= var5 && var12 + 1 <= var6 && var13 >= var7 && var8 >= var13 && (jX || (2 & this.jH[var12 + 1][var13]) == 0)) {
               var16 = true;
               break;
            }

            if (var13 > 0 && var5 <= var12 && var6 >= var12 && var13 - 1 >= var7 && var8 >= var13 - 1 && (jX || (4 & this.jH[var12][var13 - 1]) == 0)) {
               var16 = true;
               break;
            }

            if (var13 < 95 && var5 <= var12 && var12 <= var6 && var7 <= var13 + 1 && var8 >= var13 + 1 && (jX || (1 & this.jH[var12][var13 + 1]) == 0)) {
               var16 = true;
               break;
            }
         }

         if (var12 > 0 && this.jE[var12 - 1][var13] == 0 && (jX || (this.jH[var12 - 1][var13] & 120) == 0)) {
            var1[var14] = var12 - 1;
            var2[var14] = var13;
            this.jE[var12 - 1][var13] = 2;
            var14 = (var14 + 1) % var15;
         }

         if (var12 < 95 && this.jE[1 + var12][var13] == 0 && (jX || (this.jH[1 + var12][var13] & 114) == 0)) {
            var1[var14] = 1 + var12;
            var2[var14] = var13;
            this.jE[var12 + 1][var13] = 8;
            var14 = (1 + var14) % var15;
         }

         if (var13 > 0 && this.jE[var12][var13 - 1] == 0 && (jX || (116 & this.jH[var12][var13 - 1]) == 0)) {
            var1[var14] = var12;
            var2[var14] = var13 - 1;
            this.jE[var12][var13 - 1] = 1;
            var14 = (var14 + 1) % var15;
         }

         if (var13 < 95 && this.jE[var12][1 + var13] == 0 && (jX || (113 & this.jH[var12][1 + var13]) == 0)) {
            var1[var14] = var12;
            var2[var14] = var13 + 1;
            this.jE[var12][var13 + 1] = 4;
            var14 = (var14 + 1) % var15;
         }

         if (var12 > 0 && var13 > 0 && (jX || (116 & this.jH[var12][var13 - 1]) == 0) && (jX || (120 & this.jH[var12 - 1][var13]) == 0) && (jX || (124 & this.jH[var12 - 1][var13 - 1]) == 0) && this.jE[var12 - 1][var13 - 1] == 0) {
            var1[var14] = var12 - 1;
            var2[var14] = var13 - 1;
            this.jE[var12 - 1][var13 - 1] = 3;
            var14 = (1 + var14) % var15;
         }

         if (var12 < 95 && var13 > 0 && (jX || (this.jH[var12][var13 - 1] & 116) == 0) && (jX || (this.jH[1 + var12][var13] & 114) == 0) && (jX || (this.jH[var12 + 1][var13 - 1] & 118) == 0) && this.jE[1 + var12][var13 - 1] == 0) {
            var1[var14] = 1 + var12;
            var2[var14] = var13 - 1;
            this.jE[var12 + 1][var13 - 1] = 9;
            var14 = (1 + var14) % var15;
         }

         if (var12 > 0 && var13 < 95 && (jX || (this.jH[var12][1 + var13] & 113) == 0) && (jX || (this.jH[var12 - 1][var13] & 120) == 0) && (jX || (this.jH[var12 - 1][1 + var13] & 121) == 0) && this.jE[var12 - 1][1 + var13] == 0) {
            var1[var14] = var12 - 1;
            var2[var14] = 1 + var13;
            var14 = (1 + var14) % var15;
            this.jE[var12 - 1][var13 + 1] = 6;
         }

         if (var12 < 95 && var13 < 95 && (jX || (113 & this.jH[var12][1 + var13]) == 0) && (jX || (this.jH[var12 + 1][var13] & 114) == 0) && (jX || (115 & this.jH[var12 + 1][1 + var13]) == 0) && this.jE[var12 + 1][1 + var13] == 0) {
            var1[var14] = 1 + var12;
            var2[var14] = 1 + var13;
            this.jE[1 + var12][1 + var13] = 12;
            var14 = (var14 + 1) % var15;
         }
      }

      if (!var16) {
         return -1;
      } else {
         var1[0] = var12;
         var2[0] = var13;
         var11 = 1;

         int var17;
         for(int var18 = var17 = this.jE[var12][var13]; var12 != var3 || var13 != var4; var18 = this.jE[var12][var13]) {
            if (var17 != var18) {
               var17 = var18;
               var1[var11] = var12;
               var2[var11++] = var13;
            }

            if ((var18 & 1) != 0) {
               ++var13;
            } else if ((4 & var18) != 0) {
               --var13;
            }

            if ((2 & var18) != 0) {
               ++var12;
            } else if ((var18 & 8) != 0) {
               --var12;
            }
         }

         return var11;
      }
   }

   private final void a(int var1, int var2, boolean var3, int var4, int var5) {
      int var6 = (24 + var1) / 48;
      int var7 = (24 + var5) / 48;
      this.u(0, var4, var6 - 1, var7 - 1);
      this.u(1, var4, var6, var7 - 1);
      if (var2 >= 66) {
         this.u(2, var4, var6 - 1, var7);
         this.u(3, var4, var6, var7);
         this.bA();
         if (this.jR == null) {
            this.jR = new h(18688, 18688, true, true, false, false, true);
         }

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var17;
         int var18;
         int var36;
         if (var3) {
            this.jK.c(true);
            var8 = 0;

            label710:
            while(true) {
               if (var8 >= 96) {
                  h var33 = this.jR;
                  var33.bq();

                  for(var9 = 0; var9 < 96; ++var9) {
                     for(var10 = 0; var10 < 96; ++var10) {
                        var11 = -this.s(var9, var10);
                        if (this.q(var9, var10, var4) > 0 && com.rsc.a.a.p(this.q(var9, var10, var4) - 1).aW() == 4) {
                           var11 = 0;
                        }

                        if (this.q(var9 - 1, var10, var4) > 0 && com.rsc.a.a.p(this.q(var9 - 1, var10, var4) - 1).aW() == 4) {
                           var11 = 0;
                        }

                        if (this.q(var9, var10 - 1, var4) > 0 && com.rsc.a.a.p(this.q(var9, var10 - 1, var4) - 1).aW() == 4) {
                           var11 = 0;
                        }

                        if (this.q(var9 - 1, var10 - 1, var4) > 0 && com.rsc.a.a.p(this.q(var9 - 1, var10 - 1, var4) - 1).aW() == 4) {
                           var11 = 0;
                        }

                        var12 = var33.c(var9 * 128, var11, var10 * 128);
                        var13 = (int)(Math.random() * 10.0D) - 5;
                        var33.j(var12, var13);
                     }
                  }

                  int[] var34;
                  for(var9 = 0; var9 < 95; ++var9) {
                     for(var10 = 0; var10 < 95; ++var10) {
                        var11 = this.jC[this.q(var9, var10)];
                        var12 = var11;
                        var13 = var11;
                        if (var4 == 1 || var4 == 2) {
                           var11 = 12345678;
                           var12 = 12345678;
                           var13 = 12345678;
                        }

                        byte var14 = 0;
                        if (this.q(var9, var10, var4) > 0) {
                           var15 = this.q(var9, var10, var4);
                           var16 = com.rsc.a.a.p(var15 - 1).aW();
                           var17 = this.r(var9, var10, var4, 15282);
                           var11 = var12 = com.rsc.a.a.p(var15 - 1).aV();
                           if (var16 == 4) {
                              var11 = 1;
                              var12 = 1;
                              if (var15 == 12) {
                                 var11 = 31;
                                 var12 = 31;
                              }
                           }

                           if (var16 == 5) {
                              if (this.t(var9, var10) > 0 && this.t(var9, var10) < 24000) {
                                 if (this.q(var9 - 1, var10, var4, var13) != 12345678 && this.q(var9, var10 - 1, var4, var13) != 12345678) {
                                    var14 = 0;
                                    var11 = this.q(var9 - 1, var10, var4, var13);
                                 } else if (this.q(1 + var9, var10, var4, var13) != 12345678 && this.q(var9, 1 + var10, var4, var13) != 12345678) {
                                    var12 = this.q(var9 + 1, var10, var4, var13);
                                    var14 = 0;
                                 } else if (this.q(1 + var9, var10, var4, var13) != 12345678 && this.q(var9, var10 - 1, var4, var13) != 12345678) {
                                    var12 = this.q(var9 + 1, var10, var4, var13);
                                    var14 = 1;
                                 } else if (this.q(var9 - 1, var10, var4, var13) != 12345678 && this.q(var9, var10 + 1, var4, var13) != 12345678) {
                                    var14 = 1;
                                    var11 = this.q(var9 - 1, var10, var4, var13);
                                 }
                              }
                           } else if (var16 != 2 || this.t(var9, var10) > 0 && this.t(var9, var10) < 24000) {
                              if (var17 != this.r(var9 - 1, var10, var4, 15282) && this.r(var9, var10 - 1, var4, 15282) != var17) {
                                 var11 = var13;
                                 var14 = 0;
                              } else if (var17 != this.r(var9 + 1, var10, var4, 15282) && this.r(var9, var10 + 1, var4, 15282) != var17) {
                                 var14 = 0;
                                 var12 = var13;
                              } else if (var17 != this.r(1 + var9, var10, var4, 15282) && this.r(var9, var10 - 1, var4, 15282) != var17) {
                                 var12 = var13;
                                 var14 = 1;
                              } else if (var17 != this.r(var9 - 1, var10, var4, 15282) && var17 != this.r(var9, 1 + var10, var4, 15282)) {
                                 var11 = var13;
                                 var14 = 1;
                              }
                           }

                           if (com.rsc.a.a.p(var15 - 1).aX() != 0) {
                              this.jH[var9][var10] |= 64;
                           }

                           if (com.rsc.a.a.p(var15 - 1).aW() == 2) {
                              this.jH[var9][var10] |= 128;
                           }
                        }

                        this.i(var9, var10, var14, var12, var11);
                        var15 = this.s(var9 + 1, 1 + var10) - this.s(var9, var10) + this.s(var9, var10 + 1) - this.s(var9 + 1, var10);
                        if (var11 == var12 && var15 == 0) {
                           if (var11 != 12345678) {
                              var34 = new int[]{var10 - (-(var9 * 96) - 96), var10 + var9 * 96, 1 + var9 * 96 + var10, var10 - (-(var9 * 96) - 96) + 1};
                              var17 = var33.a(4, var34, 12345678, var11);
                              this.jI[var17] = var9;
                              this.jJ[var17] = var10;
                              var33.gA[var17] = var17 + 200000;
                           }
                        } else {
                           var34 = new int[3];
                           int[] var35 = new int[3];
                           if (var14 == 0) {
                              if (var11 != 12345678) {
                                 var34[0] = 96 + var10 + var9 * 96;
                                 var34[1] = var9 * 96 + var10;
                                 var34[2] = 1 + var10 + var9 * 96;
                                 var18 = var33.a(3, var34, 12345678, var11);
                                 this.jI[var18] = var9;
                                 this.jJ[var18] = var10;
                                 var33.gA[var18] = var18 + 200000;
                              }

                              if (var12 != 12345678) {
                                 var35[0] = 1 + var9 * 96 + var10;
                                 var35[1] = 97 + var9 * 96 + var10;
                                 var35[2] = var10 + var9 * 96 + 96;
                                 var18 = var33.a(3, var35, 12345678, var12);
                                 this.jI[var18] = var9;
                                 this.jJ[var18] = var10;
                                 var33.gA[var18] = var18 + 200000;
                              }
                           } else {
                              if (var11 != 12345678) {
                                 var34[2] = var10 + var9 * 96;
                                 var34[1] = 96 + var9 * 96 + var10 + 1;
                                 var34[0] = 1 + var9 * 96 + var10;
                                 var18 = var33.a(3, var34, 12345678, var11);
                                 this.jI[var18] = var9;
                                 this.jJ[var18] = var10;
                                 var33.gA[var18] = 200000 + var18;
                              }

                              if (var12 != 12345678) {
                                 var35[1] = var10 + var9 * 96;
                                 var35[2] = var10 - (-(var9 * 96) - 97);
                                 var35[0] = var9 * 96 + var10 + 96;
                                 var18 = var33.a(3, var35, 12345678, var12);
                                 this.jI[var18] = var9;
                                 this.jJ[var18] = var10;
                                 var33.gA[var18] = var18 + 200000;
                              }
                           }
                        }
                     }
                  }

                  for(var9 = 1; var9 < 95; ++var9) {
                     for(var10 = 1; var10 < 95; ++var10) {
                        if (this.q(var9, var10, var4) > 0 && com.rsc.a.a.p(this.q(var9, var10, var4) - 1).aW() == 4) {
                           var11 = com.rsc.a.a.p(this.q(var9, var10, var4) - 1).aV();
                           var12 = var33.c(var9 * 128, -this.s(var9, var10), var10 * 128);
                           var13 = var33.c((var9 + 1) * 128, -this.s(1 + var9, var10), var10 * 128);
                           var36 = var33.c((1 + var9) * 128, -this.s(var9 + 1, var10 + 1), (var10 + 1) * 128);
                           var15 = var33.c(var9 * 128, -this.s(var9, 1 + var10), 128 + var10 * 128);
                           var34 = new int[]{var12, var13, var36, var15};
                           var17 = var33.a(4, var34, var11, 12345678);
                           this.jI[var17] = var9;
                           this.jJ[var17] = var10;
                           var33.gA[var17] = var17 + 200000;
                           this.i(var9, var10, 0, var11, var11);
                        } else if (this.q(var9, var10, var4) == 0 || com.rsc.a.a.p(this.q(var9, var10, var4) - 1).aW() != 3) {
                           if (this.q(var9, var10 + 1, var4) > 0 && com.rsc.a.a.p(this.q(var9, 1 + var10, var4) - 1).aW() == 4) {
                              var11 = com.rsc.a.a.p(this.q(var9, var10 + 1, var4) - 1).aV();
                              var12 = var33.c(var9 * 128, -this.s(var9, var10), var10 * 128);
                              var13 = var33.c((var9 + 1) * 128, -this.s(1 + var9, var10), var10 * 128);
                              var36 = var33.c(128 + var9 * 128, -this.s(1 + var9, var10 + 1), (var10 + 1) * 128);
                              var15 = var33.c(var9 * 128, -this.s(var9, 1 + var10), var10 * 128 + 128);
                              var34 = new int[]{var12, var13, var36, var15};
                              var17 = var33.a(4, var34, var11, 12345678);
                              this.jI[var17] = var9;
                              this.jJ[var17] = var10;
                              var33.gA[var17] = var17 + 200000;
                              this.i(var9, var10, 0, var11, var11);
                           }

                           if (this.q(var9, var10 - 1, var4) > 0 && com.rsc.a.a.p(this.q(var9, var10 - 1, var4) - 1).aW() == 4) {
                              var11 = com.rsc.a.a.p(this.q(var9, var10 - 1, var4) - 1).aV();
                              var12 = var33.c(var9 * 128, -this.s(var9, var10), var10 * 128);
                              var13 = var33.c((1 + var9) * 128, -this.s(var9 + 1, var10), var10 * 128);
                              var36 = var33.c((1 + var9) * 128, -this.s(var9 + 1, var10 + 1), (var10 + 1) * 128);
                              var15 = var33.c(var9 * 128, -this.s(var9, var10 + 1), 128 + var10 * 128);
                              var34 = new int[]{var12, var13, var36, var15};
                              var17 = var33.a(4, var34, var11, 12345678);
                              this.jI[var17] = var9;
                              this.jJ[var17] = var10;
                              var33.gA[var17] = 200000 + var17;
                              this.i(var9, var10, 0, var11, var11);
                           }

                           if (this.q(var9 + 1, var10, var4) > 0 && com.rsc.a.a.p(this.q(var9 + 1, var10, var4) - 1).aW() == 4) {
                              var11 = com.rsc.a.a.p(this.q(1 + var9, var10, var4) - 1).aV();
                              var12 = var33.c(var9 * 128, -this.s(var9, var10), var10 * 128);
                              var13 = var33.c(128 + var9 * 128, -this.s(1 + var9, var10), var10 * 128);
                              var36 = var33.c((1 + var9) * 128, -this.s(1 + var9, 1 + var10), var10 * 128 + 128);
                              var15 = var33.c(var9 * 128, -this.s(var9, var10 + 1), (1 + var10) * 128);
                              var34 = new int[]{var12, var13, var36, var15};
                              var17 = var33.a(4, var34, var11, 12345678);
                              this.jI[var17] = var9;
                              this.jJ[var17] = var10;
                              var33.gA[var17] = var17 + 200000;
                              this.i(var9, var10, 0, var11, var11);
                           }

                           if (this.q(var9 - 1, var10, var4) > 0 && com.rsc.a.a.p(this.q(var9 - 1, var10, var4) - 1).aW() == 4) {
                              var11 = com.rsc.a.a.p(this.q(var9 - 1, var10, var4) - 1).aV();
                              var12 = var33.c(var9 * 128, -this.s(var9, var10), var10 * 128);
                              var13 = var33.c((var9 + 1) * 128, -this.s(1 + var9, var10), var10 * 128);
                              var36 = var33.c(128 + var9 * 128, -this.s(1 + var9, 1 + var10), var10 * 128 + 128);
                              var15 = var33.c(var9 * 128, -this.s(var9, var10 + 1), (1 + var10) * 128);
                              var34 = new int[]{var12, var13, var36, var15};
                              var17 = var33.a(4, var34, var11, 12345678);
                              this.jI[var17] = var9;
                              this.jJ[var17] = var10;
                              var33.gA[var17] = var17 + 200000;
                              this.i(var9, var10, 0, var11, var11);
                           }
                        }
                     }
                  }

                  var33.b(-50, -10, -50, 40, 48, true);
                  this.jS = this.jR.a(8, 1536, 1536, 64, 233, false);

                  for(var9 = 0; var9 < 64; ++var9) {
                     this.L.b(this.jS[var9]);
                  }

                  var9 = 0;

                  while(true) {
                     if (var9 >= 96) {
                        break label710;
                     }

                     for(var10 = 0; var10 < 96; ++var10) {
                        this.jD[var9][var10] = this.s(var9, var10);
                     }

                     ++var9;
                  }
               }

               for(var9 = 0; var9 < 96; ++var9) {
                  this.jH[var8][var9] = 0;
               }

               ++var8;
            }
         }

         this.jR.bq();
         var8 = 6316128;

         for(var9 = 0; var9 < 95; ++var9) {
            for(var10 = 0; var10 < 95; ++var10) {
               var11 = this.u(var9, var10);
               if (var11 > 0) {
                  if (com.rsc.a.a.q(var11 - 1).al() != 0) {
                     this.getClass();
                  } else {
                     this.a(var11 - 1, this.jR, 1 + var9, var10, var9, -14584, var10);
                     if (var3 && com.rsc.a.a.q(var11 - 1).ak() != 0) {
                        this.p(var9, var10, 1);
                        if (var10 > 0) {
                           this.p(var9, var10 - 1, 4);
                        }
                     }

                     if (var3) {
                        this.jK.m(var9 * 3, var10 * 3, 3, 6316128);
                     }
                  }
               }

               var11 = this.v(var9, var10);
               if (var11 > 0) {
                  if (com.rsc.a.a.q(var11 - 1).al() != 0) {
                     this.getClass();
                  } else {
                     this.a(var11 - 1, this.jR, var9, var10, var9, -14584, 1 + var10);
                     if (var3 && com.rsc.a.a.q(var11 - 1).ak() != 0) {
                        this.p(var9, var10, 2);
                        if (var9 > 0) {
                           this.p(var9 - 1, var10, 8);
                        }
                     }

                     if (var3) {
                        this.jK.n(var9 * 3, var10 * 3, 6316128, 3);
                     }
                  }
               }

               var11 = this.t(var9, var10);
               if (var11 > 0 && var11 < 12000) {
                  if (com.rsc.a.a.q(var11 - 1).al() != 0) {
                     this.getClass();
                  } else {
                     this.a(var11 - 1, this.jR, var9 + 1, var10, var9, -14584, 1 + var10);
                     if (var3 && com.rsc.a.a.q(var11 - 1).ak() != 0) {
                        this.p(var9, var10, 32);
                     }

                     if (var3) {
                        this.jK.n(var9 * 3, var10 * 3, 6316128);
                        this.jK.n(1 + var9 * 3, 1 + var10 * 3, 6316128);
                        this.jK.n(var9 * 3 + 2, 2 + var10 * 3, 6316128);
                     }
                  }
               }

               if (var11 > 12000 && var11 < 24000) {
                  if (com.rsc.a.a.q(var11 - 12001).al() != 0) {
                     this.getClass();
                  } else {
                     this.a(var11 - 12001, this.jR, var9, var10, var9 + 1, -14584, 1 + var10);
                     if (var3 && com.rsc.a.a.q(var11 - 12001).ak() != 0) {
                        this.p(var9, var10, 16);
                     }

                     if (var3) {
                        this.jK.n(2 + var9 * 3, var10 * 3, 6316128);
                        this.jK.n(var9 * 3 + 1, var10 * 3 + 1, 6316128);
                        this.jK.n(var9 * 3, 2 + var10 * 3, 6316128);
                     }
                  }
               }
            }
         }

         if (var3) {
            this.jO = this.jK.k(0, 0, 285, 285);
         }

         this.jR.b(-50, -10, -50, 60, 24, false);
         this.jM[var4] = this.jR.a(8, 1536, 1536, 64, 338, true);

         for(var9 = 0; var9 < 64; ++var9) {
            this.L.b(this.jM[var4][var9]);
         }

         this.jR.bq();

         for(var9 = 0; var9 < 95; ++var9) {
            for(var10 = 0; var10 < 95; ++var10) {
               var11 = this.u(var9, var10);
               if (var11 > 0) {
                  this.h(var11 - 1, var9, var10, var9 + 1, var10);
               }

               var11 = this.v(var9, var10);
               if (var11 > 0) {
                  this.h(var11 - 1, var9, var10, var9, var10 + 1);
               }

               var11 = this.t(var9, var10);
               if (var11 > 0 && var11 < 12000) {
                  this.h(var11 - 1, var9, var10, var9 + 1, var10 + 1);
               }

               if (var11 > 12000 && var11 < 24000) {
                  this.h(var11 - 12001, var9 + 1, var10, var9, var10 + 1);
               }
            }
         }

         int[] var10000;
         int var19;
         int var20;
         for(var9 = 1; var9 < 95; ++var9) {
            for(var10 = 1; var10 < 95; ++var10) {
               var11 = this.w(var9, var10);
               if (var11 > 0) {
                  var12 = var9 + 1;
                  var13 = 1 + var9;
                  var36 = var10 + 1;
                  var15 = 1 + var10;
                  var16 = 0;
                  var17 = this.jD[var9][var10];
                  var18 = this.jD[var12][var10];
                  var19 = this.jD[var13][var36];
                  var20 = this.jD[var9][var15];
                  if (var17 > 80000) {
                     var17 -= 80000;
                  }

                  if (var18 > 80000) {
                     var18 -= 80000;
                  }

                  if (var19 > 80000) {
                     var19 -= 80000;
                  }

                  if (var20 > 80000) {
                     var20 -= 80000;
                  }

                  if (var17 > var16) {
                     var16 = var17;
                  }

                  if (var16 < var18) {
                     var16 = var18;
                  }

                  if (var16 < var19) {
                     var16 = var19;
                  }

                  if (var16 < var20) {
                     var16 = var20;
                  }

                  if (var16 >= 80000) {
                     var16 -= 80000;
                  }

                  if (var17 < 80000) {
                     this.jD[var9][var10] = var16;
                  } else {
                     var10000 = this.jD[var9];
                     var10000[var10] -= 80000;
                  }

                  if (var18 < 80000) {
                     this.jD[var12][var10] = var16;
                  } else {
                     var10000 = this.jD[var12];
                     var10000[var10] -= 80000;
                  }

                  if (var19 < 80000) {
                     this.jD[var13][var36] = var16;
                  } else {
                     var10000 = this.jD[var13];
                     var10000[var36] -= 80000;
                  }

                  if (var20 < 80000) {
                     this.jD[var9][var15] = var16;
                  } else {
                     var10000 = this.jD[var9];
                     var10000[var15] -= 80000;
                  }
               }
            }
         }

         for(var9 = 1; var9 < 95; ++var9) {
            for(var10 = 1; var10 < 95; ++var10) {
               var11 = this.w(var9, var10);
               if (var11 > 0) {
                  var12 = var9 + 1;
                  var13 = var9 + 1;
                  var36 = 1 + var10;
                  var15 = var10 + 1;
                  var16 = var9 * 128;
                  var17 = var10 * 128;
                  var18 = 128 + var16;
                  var19 = 128 + var17;
                  var20 = var16;
                  int var21 = var17;
                  int var22 = var18;
                  int var23 = var19;
                  int var24 = this.jD[var9][var10];
                  int var25 = this.jD[var12][var10];
                  int var26 = this.jD[var13][var36];
                  int var27 = this.jD[var9][var15];
                  int var28 = com.rsc.a.a.r(var11 - 1).ap();
                  if (this.a(false, var9, var10) && var24 < 80000) {
                     var24 += var28 + 80000;
                     this.jD[var9][var10] = var24;
                  }

                  if (this.a(false, var12, var10) && var25 < 80000) {
                     var25 += var28 + 80000;
                     this.jD[var12][var10] = var25;
                  }

                  if (this.a(false, var13, var36) && var26 < 80000) {
                     var26 += 80000 + var28;
                     this.jD[var13][var36] = var26;
                  }

                  if (var25 >= 80000) {
                     var25 -= 80000;
                  }

                  if (var26 >= 80000) {
                     var26 -= 80000;
                  }

                  if (this.a(false, var9, var15) && var27 < 80000) {
                     var27 += var28 + 80000;
                     this.jD[var9][var15] = var27;
                  }

                  if (var24 >= 80000) {
                     var24 -= 80000;
                  }

                  if (var27 >= 80000) {
                     var27 -= 80000;
                  }

                  boolean var29 = true;
                  if (!this.x(var9 - 1, var10)) {
                     var16 -= 16;
                  }

                  if (!this.x(var9 + 1, var10)) {
                     var16 += 16;
                  }

                  if (!this.x(var9, var10 - 1)) {
                     var17 -= 16;
                  }

                  if (!this.x(var9, 1 + var10)) {
                     var17 += 16;
                  }

                  if (!this.x(var12 - 1, var10)) {
                     var18 -= 16;
                  }

                  if (!this.x(var12 + 1, var10)) {
                     var18 += 16;
                  }

                  if (!this.x(var12, var10 - 1)) {
                     var21 = var17 - 16;
                  }

                  if (!this.x(var12, var10 + 1)) {
                     var21 += 16;
                  }

                  if (!this.x(var13 - 1, var36)) {
                     var22 = var18 - 16;
                  }

                  if (!this.x(1 + var13, var36)) {
                     var22 += 16;
                  }

                  if (!this.x(var13, var36 - 1)) {
                     var19 -= 16;
                  }

                  if (!this.x(var13, 1 + var36)) {
                     var19 += 16;
                  }

                  if (!this.x(var9 - 1, var15)) {
                     var20 = var16 - 16;
                  }

                  if (!this.x(var9 + 1, var15)) {
                     var20 += 16;
                  }

                  if (!this.x(var9, var15 - 1)) {
                     var23 = var19 - 16;
                  }

                  if (!this.x(var9, var15 + 1)) {
                     var23 += 16;
                  }

                  var11 = com.rsc.a.a.r(var11 - 1).aq();
                  var25 = -var25;
                  var27 = -var27;
                  var26 = -var26;
                  var24 = -var24;
                  int[] var37;
                  if (this.t(var9, var10) > 12000 && this.t(var9, var10) < 24000 && this.w(var9 - 1, var10 - 1) == 0) {
                     var37 = new int[]{this.jR.c(var22, var26, var19), this.jR.c(var20, var27, var23), this.jR.c(var18, var25, var21)};
                     this.jR.a(3, var37, var11, 12345678);
                  } else if (this.t(var9, var10) > 12000 && this.t(var9, var10) < 24000 && this.w(1 + var9, var10 + 1) == 0) {
                     var37 = new int[]{this.jR.c(var16, var24, var17), this.jR.c(var18, var25, var21), this.jR.c(var20, var27, var23)};
                     this.jR.a(3, var37, var11, 12345678);
                  } else if (this.t(var9, var10) > 0 && this.t(var9, var10) < 12000 && this.w(var9 + 1, var10 - 1) == 0) {
                     var37 = new int[]{this.jR.c(var20, var27, var23), this.jR.c(var16, var24, var17), this.jR.c(var22, var26, var19)};
                     this.jR.a(3, var37, var11, 12345678);
                  } else if (this.t(var9, var10) > 0 && this.t(var9, var10) < 12000 && this.w(var9 - 1, 1 + var10) == 0) {
                     var37 = new int[]{this.jR.c(var18, var25, var21), this.jR.c(var22, var26, var19), this.jR.c(var16, var24, var17)};
                     this.jR.a(3, var37, var11, 12345678);
                  } else if (var25 == var24 && var26 == var27) {
                     var37 = new int[]{this.jR.c(var16, var24, var17), this.jR.c(var18, var25, var21), this.jR.c(var22, var26, var19), this.jR.c(var20, var27, var23)};
                     this.jR.a(4, var37, var11, 12345678);
                  } else if (var24 == var27 && var26 == var25) {
                     var37 = new int[]{this.jR.c(var20, var27, var23), this.jR.c(var16, var24, var17), this.jR.c(var18, var25, var21), this.jR.c(var22, var26, var19)};
                     this.jR.a(4, var37, var11, 12345678);
                  } else {
                     boolean var30 = true;
                     if (this.w(var9 - 1, var10 - 1) > 0) {
                        var30 = false;
                     }

                     if (this.w(var9 + 1, var10 + 1) > 0) {
                        var30 = false;
                     }

                     int[] var31;
                     int[] var32;
                     if (!var30) {
                        var31 = new int[]{this.jR.c(var18, var25, var21), this.jR.c(var22, var26, var19), this.jR.c(var16, var24, var17)};
                        this.jR.a(3, var31, var11, 12345678);
                        var32 = new int[]{this.jR.c(var20, var27, var23), this.jR.c(var16, var24, var17), this.jR.c(var22, var26, var19)};
                        this.jR.a(3, var32, var11, 12345678);
                     } else {
                        var31 = new int[]{this.jR.c(var16, var24, var17), this.jR.c(var18, var25, var21), this.jR.c(var20, var27, var23)};
                        this.jR.a(3, var31, var11, 12345678);
                        var32 = new int[]{this.jR.c(var22, var26, var19), this.jR.c(var20, var27, var23), this.jR.c(var18, var25, var21)};
                        this.jR.a(3, var32, var11, 12345678);
                     }
                  }
               }
            }
         }

         this.jR.b(-50, -10, -50, 50, 50, true);
         this.jN[var4] = this.jR.a(8, 1536, 1536, 64, 169, true);

         for(var9 = 0; var9 < 64; ++var9) {
            this.L.b(this.jN[var4][var9]);
         }

         if (this.jN[var4][0] == null) {
            throw new RuntimeException("null roof!");
         }

         for(var9 = 0; var9 < 96; ++var9) {
            for(var10 = 0; var10 < 96; ++var10) {
               if (this.jD[var9][var10] >= 80000) {
                  var10000 = this.jD[var9];
                  var10000[var10] -= 80000;
               }
            }
         }
      }

   }

   public final int p(int var1, int var2) {
      int var3 = var1 >> 7;
      int var4 = var2 >> 7;
      int var5 = 127 & var1;
      int var6 = 127 & var2;
      if (var3 >= 0 && var4 >= 0 && var3 < 95 && var4 < 95) {
         int var7;
         int var8;
         int var9;
         if (var5 <= 128 - var6) {
            var7 = this.s(var3, var4);
            var8 = this.s(1 + var3, var4) - var7;
            var9 = this.s(var3, 1 + var4) - var7;
         } else {
            var7 = this.s(1 + var3, var4 + 1);
            var8 = this.s(var3, var4 + 1) - var7;
            var9 = this.s(1 + var3, var4) - var7;
            var5 = 128 - var5;
            var6 = 128 - var6;
         }

         return var9 * var6 / 128 + var7 + var8 * var5 / 128;
      } else {
         return 0;
      }
   }

   public final int q(int var1, int var2) {
      if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if (var1 >= 48 && var2 < 48) {
            var1 -= 48;
            var3 = 1;
         } else if (var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
         } else if (var1 >= 48 && var2 >= 48) {
            var1 -= 48;
            var3 = 3;
            var2 -= 48;
         }

         return this.jT[var3].d(var1, var2).bc();
      } else {
         return 0;
      }
   }

   public final int q(int var1, int var2, int var3, int var4) {
      int var5 = this.q(var1, var2, var3);
      return var5 == 0 ? var4 : com.rsc.a.a.p(var5 - 1).aV();
   }

   public final int q(int var1, int var2, int var3) {
      if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var4 = 0;
         if (var1 >= 48 && var2 < 48) {
            var1 -= 48;
            var4 = 1;
         } else if (var1 < 48 && var2 >= 48) {
            var2 -= 48;
            var4 = 2;
         } else if (var1 >= 48 && var2 >= 48) {
            var2 -= 48;
            var1 -= 48;
            var4 = 3;
         }

         return this.jT[var4].d(var1, var2).cu & 255;
      } else {
         return 0;
      }
   }

   public final int r(int var1, int var2) {
      return var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96 ? this.jF[var1][var2] : 0;
   }

   private final int s(int var1, int var2) {
      if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if (var1 >= 48 && var2 < 48) {
            var3 = 1;
            var1 -= 48;
         } else if (var1 < 48 && var2 >= 48) {
            var2 -= 48;
            var3 = 2;
         } else if (var1 >= 48 && var2 >= 48) {
            var3 = 3;
            var2 -= 48;
            var1 -= 48;
         }

         return (this.jT[var3].d(var1, var2).co & 255) * 3;
      } else {
         return 0;
      }
   }

   public final int t(int var1, int var2) {
      if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if (var1 >= 48 && var2 < 48) {
            var1 -= 48;
            var3 = 1;
         } else if (var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
         } else if (var1 >= 48 && var2 >= 48) {
            var2 -= 48;
            var3 = 3;
            var1 -= 48;
         }

         return this.jT[var3].d(var1, var2).ct;
      } else {
         return 0;
      }
   }

   public final int u(int var1, int var2) {
      if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if (var1 >= 48 && var2 < 48) {
            var1 -= 48;
            var3 = 1;
         } else if (var1 < 48 && var2 >= 48) {
            var2 -= 48;
            var3 = 2;
         } else if (var1 >= 48 && var2 >= 48) {
            var2 -= 48;
            var1 -= 48;
            var3 = 3;
         }

         return this.jT[var3].d(var1, var2).cs & 255;
      } else {
         return 0;
      }
   }

   public final int v(int var1, int var2) {
      if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if (var1 >= 48 && var2 < 48) {
            var1 -= 48;
            var3 = 1;
         } else if (var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
         } else if (var1 >= 48 && var2 >= 48) {
            var2 -= 48;
            var1 -= 48;
            var3 = 3;
         }

         return this.jT[var3].d(var1, var2).cr & 255;
      } else {
         return 0;
      }
   }

   private final int w(int var1, int var2) {
      if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var3 = 0;
         if (var1 >= 48 && var2 < 48) {
            var3 = 1;
            var1 -= 48;
         } else if (var1 < 48 && var2 >= 48) {
            var3 = 2;
            var2 -= 48;
         } else if (var1 >= 48 && var2 >= 48) {
            var3 = 3;
            var1 -= 48;
            var2 -= 48;
         }

         return this.jT[var3].d(var1, var2).cq;
      } else {
         return 0;
      }
   }

   private final boolean x(int var1, int var2) {
      return this.w(var1, var2) > 0 || this.w(var1 - 1, var2) > 0 || this.w(var1 - 1, var2 - 1) > 0 || this.w(var1, var2 - 1) > 0;
   }

   private final boolean a(boolean var1, int var2, int var3) {
      return this.w(var2, var3) > 0 && this.w(var2 - 1, var3) > 0 && this.w(var2 - 1, var3 - 1) > 0 && this.w(var2, var3 - 1) > 0;
   }

   private final void a(int var1, h var2, int var3, int var4, int var5, int var6, int var7) {
      this.t(var5, var4, 40);
      this.t(var3, var7, 40);
      int var8 = com.rsc.a.a.q(var1).am();
      int var9 = com.rsc.a.a.q(var1).an();
      if (var6 != -14584) {
         this.q(104, -113);
      }

      int var10 = com.rsc.a.a.q(var1).ao();
      int var11 = var5 * 128;
      int var12 = var4 * 128;
      int var13 = var3 * 128;
      int var14 = var7 * 128;
      int var15 = var2.c(var11, -this.jD[var5][var4], var12);
      int var16 = var2.c(var11, -this.jD[var5][var4] - var8, var12);
      int var17 = var2.c(var13, -var8 - this.jD[var3][var7], var14);
      int var18 = var2.c(var13, -this.jD[var3][var7], var14);
      int[] var19 = new int[]{var15, var16, var17, var18};
      int var20 = var2.a(4, var19, var9, var10);
      if (com.rsc.a.a.q(var1).al() == 5) {
         var2.gA[var20] = 30000 + var1;
      } else {
         var2.gA[var20] = 0;
      }

   }

   public final int r(int var1, int var2, int var3, int var4) {
      int var5 = this.q(var1, var2, var3);
      if (var5 == 0) {
         return -1;
      } else {
         int var6 = com.rsc.a.a.p(var5 - 1).aW();
         return var6 != 2 ? 0 : 1;
      }
   }

   public final void r(int var1, int var2, int var3) {
      this.bz();
      this.a(var1, 122, true, var3, var2);
      if (var3 == 0) {
         this.a(var1, 112, false, 1, var2);
         this.a(var1, 69, false, 2, var2);
         int var4 = (24 + var1) / 48;
         int var5 = (24 + var2) / 48;
         this.u(0, var3, var4 - 1, var5 - 1);
         this.u(1, var3, var4, var5 - 1);
         this.u(2, var3, var4 - 1, var5);
         this.u(3, var3, var4, var5);
         this.bA();
      }

   }

   public final void a(com.rsc.e.e var1) {
      if (var1.cm().at() == 1 || var1.cm().at() == 2) {
         if (var1.cf() >= 0 && var1.cg() >= 0 && var1.cf() < 95 && var1.cg() < 95) {
            for(int var2 = var1.cf(); var2 < var1.cf() + var1.au(); ++var2) {
               for(int var3 = var1.cg(); var1.cg() + var1.av() > var3; ++var3) {
                  if (var1.cm().at() == 1) {
                     this.p(var2, var3, 64);
                  } else if (var1.cl() == 0) {
                     this.p(var2, var3, 2);
                     if (var2 > 0) {
                        this.p(var2 - 1, var3, 8);
                     }
                  } else if (var1.cl() == 2) {
                     this.p(var2, var3, 4);
                     if (var3 < 95) {
                        this.p(var2, 1 + var3, 1);
                     }
                  } else if (var1.cl() == 6) {
                     this.p(var2, var3, 1);
                     if (var3 < 95) {
                        this.p(var2, var3 - 1, 4);
                     }
                  } else if (var1.cl() == 4) {
                     this.p(var2, var3, 8);
                     if (var2 < 95) {
                        this.p(var2 + 1, var3, 2);
                     }
                  }
               }
            }

            this.t(var1.cf(), var1.cg(), var1.au(), var1.av());
         }

      }
   }

   public final void s(int var1, int var2, int var3, int var4) {
      if (com.rsc.a.a.s(var3).at() == 1 || com.rsc.a.a.s(var3).at() == 2) {
         if (var1 >= 0 && var2 >= 0 && var1 < 95 && var2 < 95) {
            int var5;
            int var6;
            if (var4 != 0 && var4 != 4) {
               var5 = com.rsc.a.a.s(var3).av();
               var6 = com.rsc.a.a.s(var3).au();
            } else {
               var5 = com.rsc.a.a.s(var3).au();
               var6 = com.rsc.a.a.s(var3).av();
            }

            for(int var7 = var1; var7 < var5 + var1; ++var7) {
               for(int var8 = var2; var2 + var6 > var8; ++var8) {
                  if (com.rsc.a.a.s(var3).at() == 1) {
                     this.p(var7, var8, 64);
                  } else if (var4 == 0) {
                     this.p(var7, var8, 2);
                     if (var7 > 0) {
                        this.p(var7 - 1, var8, 8);
                     }
                  } else if (var4 == 2) {
                     this.p(var7, var8, 4);
                     if (var8 < 95) {
                        this.p(var7, 1 + var8, 1);
                     }
                  } else if (var4 == 6) {
                     this.p(var7, var8, 1);
                     if (var8 < 95) {
                        this.p(var7, var8 - 1, 4);
                     }
                  } else if (var4 == 4) {
                     this.p(var7, var8, 8);
                     if (var7 < 95) {
                        this.p(var7 + 1, var8, 2);
                     }
                  }
               }
            }

            this.t(var1, var2, var5, var6);
         }

      }
   }

   public final void b(com.rsc.e.e var1) {
      if (var1.cm().at() == 1 || var1.cm().at() == 2) {
         if (var1.cf() >= 0 && var1.cg() >= 0 && var1.cf() < 95 && var1.cg() < 95) {
            int var2;
            int var3;
            if (var1.cl() != 0 && var1.cl() != 4) {
               var2 = var1.cm().av();
               var3 = var1.cm().au();
            } else {
               var2 = var1.cm().au();
               var3 = var1.cm().av();
            }

            for(int var4 = var1.cf(); var1.cf() + var2 > var4; ++var4) {
               for(int var5 = var1.cg(); var3 + var1.cg() > var5; ++var5) {
                  if (var1.cm().at() == 1) {
                     this.jH[var4][var5] &= -65;
                  } else if (var1.cl() == 0) {
                     this.jH[var4][var5] &= -3;
                     if (var4 > 0) {
                        this.p(var4 - 1, var5, 65535, 8);
                     }
                  } else if (var1.cl() == 2) {
                     this.jH[var4][var5] &= -5;
                     if (var5 < 95) {
                        this.p(var4, var5 + 1, 65535, 1);
                     }
                  } else if (var1.cl() == 4) {
                     this.jH[var4][var5] &= -9;
                     if (var4 < 95) {
                        this.p(1 + var4, var5, 65535, 2);
                     }
                  } else if (var1.cl() == 6) {
                     this.jH[var4][var5] &= -2;
                     if (var5 > 0) {
                        this.p(var4, var5 - 1, 65535, 4);
                     }
                  }
               }
            }

            this.t(var1.cf(), var1.cg(), var2, var3);
         }

      }
   }

   public final void b(com.rsc.e.m var1) {
      if (var1.cf() >= 0 && var1.cg() >= 0 && var1.cf() < 95 && var1.cg() < 95 && var1.cD().ak() == 1) {
         int var2 = var1.cf();
         int var3 = var1.cg();
         if (var1.cl() == 0) {
            this.jH[var2][var3] &= -2;
            if (var3 > 0) {
               this.p(var2, var3 - 1, 65535, 4);
            }
         } else if (var1.cl() == 1) {
            this.jH[var2][var3] &= -3;
            if (var2 > 0) {
               this.p(var2 - 1, var3, 65535, 8);
            }
         } else if (var1.cl() == 2) {
            this.jH[var2][var3] &= -17;
         } else if (var1.cl() == 3) {
            this.jH[var2][var3] &= -33;
         }

         this.t(var2, var3, 1, 1);
      }

   }

   private final void bz() {
      if (this.jQ) {
         this.L.bw();
      }

      for(int var1 = 0; var1 < 64; ++var1) {
         this.jS[var1] = null;

         int var2;
         for(var2 = 0; var2 < 4; ++var2) {
            this.jM[var2][var1] = null;
         }

         for(var2 = 0; var2 < 4; ++var2) {
            this.jN[var2][var1] = null;
         }
      }

      System.gc();
   }

   private final void s(int var1, int var2, int var3) {
      if (var1 >= 0 && var1 < 96 && var2 >= 0 && var2 < 96) {
         byte var4 = 0;
         if (var1 >= 48 && var2 < 48) {
            var4 = 1;
            var1 -= 48;
         } else if (var1 < 48 && var2 >= 48) {
            var4 = 2;
            var2 -= 48;
         } else if (var1 >= 48 && var2 >= 48) {
            var1 -= 48;
            var2 -= 48;
            var4 = 3;
         }

         this.jT[var4].d(var1, var2).cu = (byte)var3;
      }

   }

   private final void bA() {
      for(int var1 = 0; var1 < 96; ++var1) {
         for(int var2 = 0; var2 < 96; ++var2) {
            if (this.q(var1, var2, 0) == 250) {
               if (var1 == 47 && this.q(var1 + 1, var2, 0) != 250 && this.q(1 + var1, var2, 0) != 2) {
                  this.s(var1, var2, 9);
               } else if (var2 == 47 && this.q(var1, var2 + 1, 0) != 250 && this.q(var1, 1 + var2, 0) != 2) {
                  this.s(var1, var2, 9);
               } else {
                  this.s(var1, var2, 2);
               }
            }
         }
      }

   }

   private final void t(int var1, int var2, int var3, int var4) {
      if (var1 >= 1 && var2 >= 1 && var3 + var1 < 96 && var4 + var2 < 96) {
         for(int var5 = var1; var5 <= var3 + var1; ++var5) {
            for(int var6 = var2; var2 + var4 >= var6; ++var6) {
               boolean var7 = true;
               boolean var8 = true;
               boolean var9 = true;
               boolean var10 = true;
               if ((99 & this.o(var5, var6)) == 0 && (89 & this.o(var5 - 1, var6)) == 0 && (this.o(var5, var6 - 1) & 86) == 0 && (this.o(var5 - 1, var6 - 1) & 108) == 0) {
                  this.t(var5, var6, 0);
               } else {
                  this.t(var5, var6, 35);
               }
            }
         }
      }

   }

   private final void t(int var1, int var2, int var3) {
      int var4 = var1 / 12;
      int var5 = var2 / 12;
      int var6 = (var1 - 1) / 12;
      int var7 = (var2 - 1) / 12;
      this.j(var4, var5, var1, var2, var3);
      if (var4 != var6) {
         this.j(var6, var5, var1, var2, var3);
      }

      if (var7 != var5) {
         this.j(var4, var7, var1, var2, var3);
      }

      if (var6 != var4 && var5 != var7) {
         this.j(var6, var7, var1, var2, var3);
      }

   }

   private final void j(int var1, int var2, int var3, int var4, int var5) {
      h var6 = this.jS[var1 + var2 * 8];

      for(int var7 = 0; var6.gP > var7; ++var7) {
         if (var6.gQ[var7] == var3 * 128 && var4 * 128 == var6.gS[var7]) {
            var6.j(var7, var5);
            return;
         }
      }

   }

   public void u(int var1, int var2, int var3, int var4) {
      com.rsc.a.b.b var5 = null;

      try {
         String var6 = "h" + var2 + "x" + var3 + "y" + var4;
         ZipEntry var7 = this.jP.getEntry(var6);
         if (var7 == null) {
            var5 = new com.rsc.a.b.b();
            if (var2 == 0 || var2 == 3) {
               for(int var8 = 0; var8 < 2304; ++var8) {
                  var5.u(var8).cu = (byte)(var2 == 0 ? -6 : 8);
               }
            }
         } else {
            ByteBuffer var10 = com.rsc.g.d.a(new BufferedInputStream(this.jP.getInputStream(var7)));
            var5 = com.rsc.a.b.b.a(var10);
         }
      } catch (Exception var9) {
         var9.printStackTrace();
         System.exit(1);
      }

      this.jU[var1] = var3;
      this.jV[var1] = var4;
      this.jW[var1] = var2;
      this.jT[var1] = var5;
   }
}
