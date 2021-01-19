package com.rsc.g;

public class b {
   public static int a(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      c var5 = new c();
      var5.sn = var2;
      var5.so = var4;
      var5.ss = var0;
      var5.st = 0;
      var5.sp = var3;
      var5.su = var1;
      var5.sB = 0;
      var5.sA = 0;
      var5.sq = 0;
      var5.sr = 0;
      var5.sv = 0;
      var5.sw = 0;
      var5.sD = 0;
      b(var5);
      var1 -= var5.su;
      return var1;
   }

   private static void a(c var0) {
      byte var1 = var0.sx;
      int var2 = var0.sy;
      int var3 = var0.sI;
      int var4 = var0.sG;
      int[] var5 = var0.sm;
      int var6 = var0.sF;
      byte[] var7 = var0.ss;
      int var8 = var0.st;
      int var9 = var0.su;
      int var11 = var0.sX + 1;

      label68:
      while(true) {
         if (var2 > 0) {
            while(true) {
               if (var9 == 0) {
                  break label68;
               }

               if (var2 == 1) {
                  if (var9 == 0) {
                     var2 = 1;
                     break label68;
                  }

                  var7[var8] = var1;
                  ++var8;
                  --var9;
                  break;
               }

               var7[var8] = var1;
               --var2;
               ++var8;
               --var9;
            }
         }

         boolean var12 = true;

         byte var13;
         while(var12) {
            var12 = false;
            if (var3 == var11) {
               var2 = 0;
               break label68;
            }

            var1 = (byte)var4;
            var6 = var5[var6];
            var13 = (byte)(var6 & 255);
            var6 >>= 8;
            ++var3;
            if (var13 != var4) {
               var4 = var13;
               if (var9 == 0) {
                  var2 = 1;
                  break label68;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
               var12 = true;
            } else if (var3 == var11) {
               if (var9 == 0) {
                  var2 = 1;
                  break label68;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
               var12 = true;
            }
         }

         var2 = 2;
         var6 = var5[var6];
         var13 = (byte)(var6 & 255);
         var6 >>= 8;
         ++var3;
         if (var3 != var11) {
            if (var13 != var4) {
               var4 = var13;
            } else {
               var2 = 3;
               var6 = var5[var6];
               byte var14 = (byte)(var6 & 255);
               var6 >>= 8;
               ++var3;
               if (var3 != var11) {
                  if (var14 != var4) {
                     var4 = var14;
                  } else {
                     var6 = var5[var6];
                     byte var15 = (byte)(var6 & 255);
                     var6 >>= 8;
                     ++var3;
                     var2 = (var15 & 255) + 4;
                     var6 = var5[var6];
                     var4 = (byte)(var6 & 255);
                     var6 >>= 8;
                     ++var3;
                  }
               }
            }
         }
      }

      int var16 = var0.sv;
      var0.sv += var9 - var9;
      if (var0.sv < var16) {
         ++var0.sw;
      }

      var0.sx = var1;
      var0.sy = var2;
      var0.sI = var3;
      var0.sG = var4;
      var0.sm = var5;
      var0.sF = var6;
      var0.ss = var7;
      var0.st = var8;
      var0.su = var9;
   }

   private static void b(c var0) {
      int var1 = 0;
      int[] var2 = null;
      int[] var3 = null;
      int[] var4 = null;
      var0.sC = 1;
      if (var0.sm == null) {
         var0.sm = new int[var0.sC * 100000];
      }

      for(boolean var5 = true; var5; var5 = var0.sI == var0.sX + 1 && var0.sy == 0) {
         byte var6 = c(var0);
         if (var6 == 23) {
            return;
         }

         var6 = c(var0);
         var6 = c(var0);
         var6 = c(var0);
         var6 = c(var0);
         var6 = c(var0);
         ++var0.sD;
         var6 = c(var0);
         var6 = c(var0);
         var6 = c(var0);
         var6 = c(var0);
         var6 = d(var0);
         var0.sz = var6 != 0;
         if (var0.sz) {
            System.out.println("PANIC! RANDOMISED BLOCK!");
         }

         var0.sE = 0;
         var6 = c(var0);
         var0.sE = var0.sE << 8 | var6 & 255;
         var6 = c(var0);
         var0.sE = var0.sE << 8 | var6 & 255;
         var6 = c(var0);
         var0.sE = var0.sE << 8 | var6 & 255;

         int var7;
         for(var7 = 0; var7 < 16; ++var7) {
            var6 = d(var0);
            var0.sM[var7] = var6 == 1;
         }

         for(var7 = 0; var7 < 256; ++var7) {
            var0.sL[var7] = false;
         }

         int var8;
         for(var7 = 0; var7 < 16; ++var7) {
            if (var0.sM[var7]) {
               for(var8 = 0; var8 < 16; ++var8) {
                  var6 = d(var0);
                  if (var6 == 1) {
                     var0.sL[var7 * 16 + var8] = true;
                  }
               }
            }
         }

         e(var0);
         var7 = var0.sK + 2;
         var8 = a(3, var0);
         int var9 = a(15, var0);

         int var11;
         for(int var10 = 0; var10 < var9; ++var10) {
            var11 = 0;

            while(true) {
               var6 = d(var0);
               if (var6 == 0) {
                  var0.sR[var10] = (byte)var11;
                  break;
               }

               ++var11;
            }
         }

         byte[] var27 = new byte[6];

         for(byte var28 = 0; var28 < var8; var27[var28] = var28++) {
         }

         byte var12;
         byte var13;
         for(var11 = 0; var11 < var9; ++var11) {
            var12 = var0.sR[var11];

            for(var13 = var27[var12]; var12 > 0; --var12) {
               var27[var12] = var27[var12 - 1];
            }

            var27[0] = var13;
            var0.sQ[var11] = var13;
         }

         int var29;
         int var30;
         for(var11 = 0; var11 < var8; ++var11) {
            var29 = a(5, var0);

            for(var30 = 0; var30 < var7; ++var30) {
               while(true) {
                  var6 = d(var0);
                  if (var6 == 0) {
                     var0.sS[var11][var30] = (byte)var29;
                     break;
                  }

                  var6 = d(var0);
                  if (var6 == 0) {
                     ++var29;
                  } else {
                     --var29;
                  }
               }
            }
         }

         int var14;
         for(var11 = 0; var11 < var8; ++var11) {
            var12 = 32;
            var13 = 0;

            for(var14 = 0; var14 < var7; ++var14) {
               if (var0.sS[var11][var14] > var13) {
                  var13 = var0.sS[var11][var14];
               }

               if (var0.sS[var11][var14] < var12) {
                  var12 = var0.sS[var11][var14];
               }
            }

            a(var0.sT[var11], var0.sU[var11], var0.sV[var11], var0.sS[var11], var12, var13, var7);
            var0.sW[var11] = var12;
         }

         var11 = var0.sK + 1;
         var29 = 100000 * var0.sC;
         var30 = -1;
         byte var31 = 0;

         int var15;
         for(var15 = 0; var15 <= 255; ++var15) {
            var0.sH[var15] = 0;
         }

         var15 = 4095;

         int var16;
         int var17;
         for(var16 = 15; var16 >= 0; --var16) {
            for(var17 = 15; var17 >= 0; --var17) {
               var0.sO[var15] = (byte)(var16 * 16 + var17);
               --var15;
            }

            var0.sP[var16] = var15 + 1;
         }

         var16 = 0;
         if (var31 == 0) {
            ++var30;
            var31 = 50;
            byte var32 = var0.sQ[var30];
            var1 = var0.sW[var32];
            var2 = var0.sT[var32];
            var4 = var0.sV[var32];
            var3 = var0.sU[var32];
         }

         var14 = var31 - 1;
         var17 = var1;

         int var18;
         byte var19;
         for(var18 = a(var1, var0); var18 > var2[var17]; var18 = var18 << 1 | var19) {
            ++var17;
            var19 = d(var0);
         }

         int var20 = var4[var18 - var3[var17]];

         while(true) {
            int[] var10000;
            int var10002;
            while(var20 != var11) {
               int var21;
               int var22;
               int var24;
               int var33;
               if (var20 != 0 && var20 != 1) {
                  var21 = var20 - 1;
                  if (var21 < 16) {
                     var22 = var0.sP[0];

                     for(var6 = var0.sO[var22 + var21]; var21 > 3; var21 -= 4) {
                        var33 = var22 + var21;
                        var0.sO[var33] = var0.sO[var33 - 1];
                        var0.sO[var33 - 1] = var0.sO[var33 - 2];
                        var0.sO[var33 - 2] = var0.sO[var33 - 3];
                        var0.sO[var33 - 3] = var0.sO[var33 - 4];
                     }

                     while(var21 > 0) {
                        var0.sO[var22 + var21] = var0.sO[var22 + var21 - 1];
                        --var21;
                     }

                     var0.sO[var22] = var6;
                  } else {
                     var22 = var21 / 16;
                     var33 = var21 % 16;
                     var24 = var0.sP[var22] + var33;

                     for(var6 = var0.sO[var24]; var24 > var0.sP[var22]; --var24) {
                        var0.sO[var24] = var0.sO[var24 - 1];
                     }

                     for(var10002 = var0.sP[var22]++; var22 > 0; --var22) {
                        var10002 = var0.sP[var22]--;
                        var0.sO[var0.sP[var22]] = var0.sO[var0.sP[var22 - 1] + 16 - 1];
                     }

                     var10002 = var0.sP[0]--;
                     var0.sO[var0.sP[0]] = var6;
                     if (var0.sP[0] == 0) {
                        var15 = 4095;

                        for(int var35 = 15; var35 >= 0; --var35) {
                           for(int var26 = 15; var26 >= 0; --var26) {
                              var0.sO[var15] = var0.sO[var0.sP[var35] + var26];
                              --var15;
                           }

                           var0.sP[var35] = var15 + 1;
                        }
                     }
                  }

                  var10002 = var0.sH[var0.sN[var6 & 255] & 255]++;
                  var0.sm[var16] = var0.sN[var6 & 255] & 255;
                  ++var16;
                  if (var14 == 0) {
                     ++var30;
                     var14 = 50;
                     byte var34 = var0.sQ[var30];
                     var1 = var0.sW[var34];
                     var2 = var0.sT[var34];
                     var4 = var0.sV[var34];
                     var3 = var0.sU[var34];
                  }

                  --var14;
                  var22 = var1;

                  byte var36;
                  for(var33 = a(var1, var0); var33 > var2[var22]; var33 = var33 << 1 | var36) {
                     ++var22;
                     var36 = d(var0);
                  }

                  var20 = var4[var33 - var3[var22]];
               } else {
                  var21 = -1;
                  var22 = 1;

                  do {
                     if (var20 == 0) {
                        var21 += var22;
                     } else if (var20 == 1) {
                        var21 += 2 * var22;
                     }

                     var22 *= 2;
                     if (var14 == 0) {
                        ++var30;
                        var14 = 50;
                        byte var23 = var0.sQ[var30];
                        var1 = var0.sW[var23];
                        var2 = var0.sT[var23];
                        var4 = var0.sV[var23];
                        var3 = var0.sU[var23];
                     }

                     --var14;
                     var33 = var1;

                     byte var25;
                     for(var24 = a(var1, var0); var24 > var2[var33]; var24 = var24 << 1 | var25) {
                        ++var33;
                        var25 = d(var0);
                     }

                     var20 = var4[var24 - var3[var33]];
                  } while(var20 == 0 || var20 == 1);

                  ++var21;
                  var6 = var0.sN[var0.sO[var0.sP[0]] & 255];
                  var10000 = var0.sH;

                  for(var10000[var6 & 255] += var21; var21 > 0; --var21) {
                     var0.sm[var16] = var6 & 255;
                     ++var16;
                  }
               }
            }

            var0.sy = 0;
            var0.sx = 0;
            var0.sJ[0] = 0;

            for(var20 = 1; var20 <= 256; ++var20) {
               var0.sJ[var20] = var0.sH[var20 - 1];
            }

            for(var20 = 1; var20 <= 256; ++var20) {
               var10000 = var0.sJ;
               var10000[var20] += var0.sJ[var20 - 1];
            }

            for(var20 = 0; var20 < var16; ++var20) {
               var6 = (byte)(var0.sm[var20] & 255);
               var10000 = var0.sm;
               int var10001 = var0.sJ[var6 & 255];
               var10000[var10001] |= var20 << 8;
               var10002 = var0.sJ[var6 & 255]++;
            }

            var0.sF = var0.sm[var0.sE] >> 8;
            var0.sI = 0;
            var0.sF = var0.sm[var0.sF];
            var0.sG = (byte)(var0.sF & 255);
            var0.sF >>= 8;
            ++var0.sI;
            var0.sX = var16;
            a(var0);
            break;
         }
      }

   }

   private static byte c(c var0) {
      return (byte)a(8, var0);
   }

   private static byte d(c var0) {
      return (byte)a(1, var0);
   }

   private static int a(int var0, c var1) {
      while(var1.sB < var0) {
         var1.sA = var1.sA << 8 | var1.sn[var1.so] & 255;
         var1.sB += 8;
         ++var1.so;
         --var1.sp;
         ++var1.sq;
         if (var1.sq == 0) {
            ++var1.sr;
         }
      }

      int var3 = var1.sA >> var1.sB - var0 & (1 << var0) - 1;
      var1.sB -= var0;
      return var3;
   }

   private static void e(c var0) {
      var0.sK = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.sL[var1]) {
            var0.sN[var0.sK] = (byte)var1;
            ++var0.sK;
         }
      }

   }

   private static void a(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      int var9;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      var8 = 0;

      for(var9 = var4; var9 <= var5; ++var9) {
         var8 += var1[var9 + 1] - var1[var9];
         var0[var9] = var8 - 1;
         var8 <<= 1;
      }

      for(var9 = var4 + 1; var9 <= var5; ++var9) {
         var1[var9] = (var0[var9 - 1] + 1 << 1) - var1[var9];
      }

   }
}
