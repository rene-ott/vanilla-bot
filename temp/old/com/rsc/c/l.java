package com.rsc.c;

public class l {
   public static void a(int[] var0, int var1, int var2, int[] var3, int var4, int var5) {
      if (var5 < 0) {
         var1 <<= 1;
         int var6 = var0[var2 >> 8 & 255];
         var2 += var1;
         int var7 = var5 / 8;

         int var8;
         for(var8 = var7; var8 < 0; ++var8) {
            var3[var4++] = var6;
            var3[var4++] = var6;
            var6 = var0[var2 >> 8 & 255];
            var2 += var1;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var6 = var0[var2 >> 8 & 255];
            var2 += var1;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var6 = var0[var2 >> 8 & 255];
            var2 += var1;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var6 = var0[var2 >> 8 & 255];
            var2 += var1;
         }

         var7 = -(var5 % 8);

         for(var8 = 0; var8 < var7; ++var8) {
            var3[var4++] = var6;
            if ((var8 & 1) == 1) {
               var6 = var0[var2 >> 8 & 255];
               var2 += var1;
            }
         }

      }
   }

   public static final void b(int[] var0, int var1, int var2, int[] var3, int var4, int var5) {
      if (var5 < 0) {
         var1 <<= 2;
         int var6 = var0[var2 >> 8 & 255];
         var2 += var1;
         int var7 = var5 / 16;

         int var8;
         for(var8 = var7; var8 < 0; ++var8) {
            var3[var4++] = var6;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var6 = var0[var2 >> 8 & 255];
            var2 += var1;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var6 = var0[var2 >> 8 & 255];
            var2 += var1;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var6 = var0[var2 >> 8 & 255];
            var2 += var1;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var3[var4++] = var6;
            var6 = var0[var2 >> 8 & 255];
            var2 += var1;
         }

         var7 = -(var5 % 16);

         for(var8 = 0; var8 < var7; ++var8) {
            var3[var4++] = var6;
            if ((var8 & 3) == 3) {
               var6 = var0[var2 >> 8 & 255];
               var2 += var1;
            }
         }

      }
   }

   public static final void c(int[] var0, int var1, int var2, int[] var3, int var4, int var5) {
      if (var5 < 0) {
         var2 <<= 2;
         int var6 = var0[var1 >> 8 & 255];
         var1 += var2;
         int var7 = var5 / 16;

         int var8;
         for(var8 = var7; var8 < 0; ++var8) {
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var6 = var0[var1 >> 8 & 255];
            var1 += var2;
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var6 = var0[var1 >> 8 & 255];
            var1 += var2;
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var6 = var0[var1 >> 8 & 255];
            var1 += var2;
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            var6 = var0[var1 >> 8 & 255];
            var1 += var2;
         }

         var7 = -(var5 % 16);

         for(var8 = 0; var8 < var7; ++var8) {
            var3[var4++] = var6 + (var3[var4] >> 1 & 8355711);
            if ((var8 & 3) == 3) {
               var6 = var0[var1 >> 8 & 255];
               var1 += var2;
               var1 += var2;
            }
         }

      }
   }

   public static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var11 > 0) {
         int var12 = 0;
         int var13 = 0;
         var8 <<= 2;
         if (var2 != 0) {
            var13 = var5 / var2 << 7;
            var12 = var4 / var2 << 7;
         }

         if (var12 < 0) {
            var12 = 0;
         } else if (var12 > 16256) {
            var12 = 16256;
         }

         for(int var14 = var11; var14 > 0; var14 -= 16) {
            var4 += var9;
            int var15 = var13;
            var2 += var7;
            int var16 = var12;
            var5 += var10;
            if (var2 != 0) {
               var12 = var4 / var2 << 7;
               var13 = var5 / var2 << 7;
            }

            if (var12 >= 0) {
               if (var12 > 16256) {
                  var12 = 16256;
               }
            } else {
               var12 = 0;
            }

            int var17 = var12 - var16 >> 4;
            int var18 = var13 - var15 >> 4;
            int var19 = var3 >> 23;
            var16 += 6291456 & var3;
            var3 += var8;
            int var20;
            if (var14 < 16) {
               for(int var21 = 0; var14 > var21; ++var21) {
                  if ((var20 = var0[(var15 & 16256) + (var16 >> 7)] >>> var19) != 0) {
                     var1[var6] = var20;
                  }

                  ++var6;
                  var16 += var17;
                  var15 += var18;
                  if ((var21 & 3) == 3) {
                     var16 = (var3 & 6291456) + (16383 & var16);
                     var19 = var3 >> 23;
                     var3 += var8;
                  }
               }
            } else {
               if ((var20 = var0[(var15 & 16256) + (var16 >> 7)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var16 += var17;
               ++var6;
               var15 += var18;
               if ((var20 = var0[(var16 >> 7) + (16256 & var15)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               ++var6;
               var15 += var18;
               var16 += var17;
               if ((var20 = var0[(var16 >> 7) + (16256 & var15)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               ++var6;
               var15 += var18;
               var16 += var17;
               if ((var20 = var0[(var16 >> 7) + (var15 & 16256)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var16 += var17;
               var15 += var18;
               ++var6;
               var19 = var3 >> 23;
               var16 = (var3 & 6291456) + (16383 & var16);
               var3 += var8;
               if ((var20 = var0[(var15 & 16256) + (var16 >> 7)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var16 += var17;
               ++var6;
               var15 += var18;
               if ((var20 = var0[(16256 & var15) + (var16 >> 7)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               ++var6;
               var16 += var17;
               var15 += var18;
               if ((var20 = var0[(var16 >> 7) + (16256 & var15)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var16 += var17;
               var15 += var18;
               ++var6;
               if ((var20 = var0[(var16 >> 7) + (var15 & 16256)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var15 += var18;
               ++var6;
               var16 += var17;
               var19 = var3 >> 23;
               var16 = (var16 & 16383) + (6291456 & var3);
               if ((var20 = var0[(var16 >> 7) + (var15 & 16256)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var3 += var8;
               ++var6;
               var16 += var17;
               var15 += var18;
               if ((var20 = var0[(var16 >> 7) + (var15 & 16256)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var15 += var18;
               ++var6;
               var16 += var17;
               if ((var20 = var0[(16256 & var15) + (var16 >> 7)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var15 += var18;
               var16 += var17;
               ++var6;
               if ((var20 = var0[(var16 >> 7) + (var15 & 16256)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var16 += var17;
               var15 += var18;
               ++var6;
               var16 = (var16 & 16383) + (var3 & 6291456);
               var19 = var3 >> 23;
               if ((var20 = var0[(var15 & 16256) + (var16 >> 7)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var3 += var8;
               var15 += var18;
               ++var6;
               var16 += var17;
               if ((var20 = var0[(var16 >> 7) + (var15 & 16256)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               ++var6;
               var16 += var17;
               var15 += var18;
               if ((var20 = var0[(var16 >> 7) + (var15 & 16256)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               var15 += var18;
               var16 += var17;
               ++var6;
               if ((var20 = var0[(16256 & var15) + (var16 >> 7)] >>> var19) != 0) {
                  var1[var6] = var20;
               }

               ++var6;
            }
         }
      }

   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int var12, int var13) {
      if (var13 > 0) {
         int var14 = 0;
         int var15 = 0;
         if (var2 != 0) {
            var10 = var7 / var2 << 7;
            var9 = var0 / var2 << 7;
         }

         int var16 = 0;
         if (var10 < 0) {
            var10 = 0;
         } else if (var10 > 16256) {
            var10 = 16256;
         }

         var2 += var8;
         var0 += var12;
         var7 += var1;
         if (var2 != 0) {
            var15 = var0 / var2 << 7;
            var14 = var7 / var2 << 7;
         }

         if (var14 >= 0) {
            if (var14 > 16256) {
               var14 = 16256;
            }
         } else {
            var14 = 0;
         }

         int var17 = var14 - var10 >> 4;
         int var18 = var15 - var9 >> 4;

         int var19;
         for(var19 = var13 >> 4; var19 > 0; --var19) {
            var10 += var3 & 6291456;
            var16 = var3 >> 23;
            var11[var6++] = var5[n(16256, var9) + (var10 >> 7)] >>> var16;
            var3 += var4;
            var10 += var17;
            var9 += var18;
            var11[var6++] = var5[(var10 >> 7) + n(16256, var9)] >>> var16;
            var9 += var18;
            var10 += var17;
            var11[var6++] = var5[(var10 >> 7) + n(16256, var9)] >>> var16;
            var9 += var18;
            var10 += var17;
            var11[var6++] = var5[(var10 >> 7) + n(16256, var9)] >>> var16;
            var9 += var18;
            var10 += var17;
            var10 = (6291456 & var3) + (16383 & var10);
            var16 = var3 >> 23;
            var11[var6++] = var5[(var10 >> 7) + n(var9, 16256)] >>> var16;
            var3 += var4;
            var10 += var17;
            var9 += var18;
            var11[var6++] = var5[n(16256, var9) + (var10 >> 7)] >>> var16;
            var10 += var17;
            var9 += var18;
            var11[var6++] = var5[(var10 >> 7) + n(16256, var9)] >>> var16;
            var9 += var18;
            var10 += var17;
            var11[var6++] = var5[n(16256, var9) + (var10 >> 7)] >>> var16;
            var9 += var18;
            var10 += var17;
            var10 = (var3 & 6291456) + (16383 & var10);
            var16 = var3 >> 23;
            var3 += var4;
            var11[var6++] = var5[n(var9, 16256) + (var10 >> 7)] >>> var16;
            var10 += var17;
            var9 += var18;
            var11[var6++] = var5[n(16256, var9) + (var10 >> 7)] >>> var16;
            var10 += var17;
            var9 += var18;
            var11[var6++] = var5[(var10 >> 7) + n(16256, var9)] >>> var16;
            var9 += var18;
            var10 += var17;
            var11[var6++] = var5[(var10 >> 7) + n(var9, 16256)] >>> var16;
            var10 += var17;
            var9 += var18;
            var10 = (16383 & var10) + (6291456 & var3);
            var16 = var3 >> 23;
            var11[var6++] = var5[(var10 >> 7) + n(16256, var9)] >>> var16;
            var3 += var4;
            var10 += var17;
            var9 += var18;
            var11[var6++] = var5[(var10 >> 7) + n(var9, 16256)] >>> var16;
            var10 += var17;
            var9 += var18;
            var11[var6++] = var5[(var10 >> 7) + n(16256, var9)] >>> var16;
            var9 += var18;
            var10 += var17;
            var11[var6++] = var5[(var10 >> 7) + n(16256, var9)] >>> var16;
            var10 = var14;
            var9 = var15;
            var0 += var12;
            var2 += var8;
            var7 += var1;
            if (var2 != 0) {
               var15 = var0 / var2 << 7;
               var14 = var7 / var2 << 7;
            }

            if (var14 >= 0) {
               if (var14 > 16256) {
                  var14 = 16256;
               }
            } else {
               var14 = 0;
            }

            var18 = var15 - var9 >> 4;
            var17 = var14 - var10 >> 4;
         }

         for(var19 = 0; (15 & var13) > var19; ++var19) {
            if ((var19 & 3) == 0) {
               var16 = var3 >> 23;
               var10 = (var3 & 6291456) + (16383 & var10);
               var3 += var4;
            }

            var11[var6++] = var5[(var10 >> 7) + n(var9, 16256)] >>> var16;
            var9 += var18;
            var10 += var17;
         }
      }

   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int var11, int var12, int[] var13) {
      if (var11 > 0) {
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         if (var7 != 0) {
            var3 = var1 / var7 << 7;
            var6 = var2 / var7 << 7;
         }

         var7 += var12;
         if (var6 >= 0) {
            if (var6 > 16256) {
               var6 = 16256;
            }
         } else {
            var6 = 0;
         }

         var1 += var5;
         var2 += var8;
         if (var7 != 0) {
            var14 = var2 / var7 << 7;
            var15 = var1 / var7 << 7;
         }

         if (var14 >= 0) {
            if (var14 > 16256) {
               var14 = 16256;
            }
         } else {
            var14 = 0;
         }

         int var17 = var14 - var6 >> 4;
         int var18 = var15 - var3 >> 4;

         int var19;
         for(var19 = var11 >> 4; var19 > 0; --var19) {
            var16 = var4 >> 23;
            var6 += var4 & 6291456;
            var4 += var9;
            var13[var0++] = n(var13[var0] >> 1, 8355711) + (var10[(var6 >> 7) + n(var3, 16256)] >>> var16);
            var3 += var18;
            var6 += var17;
            var13[var0++] = n(var13[var0] >> 1, 8355711) + (var10[(var6 >> 7) + n(16256, var3)] >>> var16);
            var6 += var17;
            var3 += var18;
            var13[var0++] = (var10[n(16256, var3) + (var6 >> 7)] >>> var16) + (n(16711422, var13[var0]) >> 1);
            var3 += var18;
            var6 += var17;
            var13[var0++] = (n(16711422, var13[var0]) >> 1) + (var10[n(var3, 16256) + (var6 >> 7)] >>> var16);
            var3 += var18;
            var6 += var17;
            var16 = var4 >> 23;
            var6 = (var6 & 16383) + (var4 & 6291456);
            var4 += var9;
            var13[var0++] = n(var13[var0] >> 1, 8355711) + (var10[n(16256, var3) + (var6 >> 7)] >>> var16);
            var3 += var18;
            var6 += var17;
            var13[var0++] = (var10[(var6 >> 7) + n(var3, 16256)] >>> var16) + n(var13[var0] >> 1, 8355711);
            var3 += var18;
            var6 += var17;
            var13[var0++] = (n(var13[var0], 16711423) >> 1) + (var10[n(var3, 16256) + (var6 >> 7)] >>> var16);
            var6 += var17;
            var3 += var18;
            var13[var0++] = (var10[(var6 >> 7) + n(16256, var3)] >>> var16) + (n(var13[var0], 16711423) >> 1);
            var6 += var17;
            var3 += var18;
            var6 = (16383 & var6) + (var4 & 6291456);
            var16 = var4 >> 23;
            var13[var0++] = (n(16711423, var13[var0]) >> 1) + (var10[(var6 >> 7) + n(var3, 16256)] >>> var16);
            var4 += var9;
            var3 += var18;
            var6 += var17;
            var13[var0++] = n(var13[var0] >> 1, 8355711) + (var10[(var6 >> 7) + n(16256, var3)] >>> var16);
            var6 += var17;
            var3 += var18;
            var13[var0++] = (var10[n(var3, 16256) + (var6 >> 7)] >>> var16) + n(8355711, var13[var0] >> 1);
            var6 += var17;
            var3 += var18;
            var13[var0++] = (n(16711423, var13[var0]) >> 1) + (var10[n(16256, var3) + (var6 >> 7)] >>> var16);
            var3 += var18;
            var6 += var17;
            var6 = (var6 & 16383) + (var4 & 6291456);
            var16 = var4 >> 23;
            var13[var0++] = n(8355711, var13[var0] >> 1) + (var10[(var6 >> 7) + n(var3, 16256)] >>> var16);
            var4 += var9;
            var6 += var17;
            var3 += var18;
            var13[var0++] = n(var13[var0] >> 1, 8355711) + (var10[(var6 >> 7) + n(16256, var3)] >>> var16);
            var6 += var17;
            var3 += var18;
            var13[var0++] = (var10[n(var3, 16256) + (var6 >> 7)] >>> var16) + n(var13[var0] >> 1, 8355711);
            var6 += var17;
            var3 += var18;
            var13[var0++] = n(var13[var0] >> 1, 8355711) + (var10[(var6 >> 7) + n(16256, var3)] >>> var16);
            var7 += var12;
            var1 += var5;
            var2 += var8;
            var3 = var15;
            var6 = var14;
            if (var7 != 0) {
               var15 = var1 / var7 << 7;
               var14 = var2 / var7 << 7;
            }

            if (var14 >= 0) {
               if (var14 > 16256) {
                  var14 = 16256;
               }
            } else {
               var14 = 0;
            }

            var18 = var15 - var3 >> 4;
            var17 = var14 - var6 >> 4;
         }

         for(var19 = 0; (var11 & 15) > var19; ++var19) {
            if ((var19 & 3) == 0) {
               var6 = (var4 & 6291456) + (var6 & 16383);
               var16 = var4 >> 23;
               var4 += var9;
            }

            var13[var0++] = (var10[n(var3, 16256) + (var6 >> 7)] >>> var16) + (n(var13[var0], 16711422) >> 1);
            var6 += var17;
            var3 += var18;
         }
      }

   }

   public static int n(int var0, int var1) {
      return var0 & var1;
   }

   public static final void a(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int var10, int var11) {
      if (var7 > 0) {
         int var12 = 0;
         int var13 = 0;
         if (var3 != 0) {
            var13 = var11 / var3 << 6;
            var12 = var8 / var3 << 6;
         }

         var4 <<= 2;
         if (var12 < 0) {
            var12 = 0;
         } else if (var12 > 4032) {
            var12 = 4032;
         }

         for(int var14 = var7; var14 > 0; var14 -= 16) {
            int var15 = var12;
            int var16 = var13;
            var3 += var2;
            var8 += var10;
            var11 += var1;
            if (var3 != 0) {
               var12 = var8 / var3 << 6;
               var13 = var11 / var3 << 6;
            }

            if (var12 >= 0) {
               if (var12 > 4032) {
                  var12 = 4032;
               }
            } else {
               var12 = 0;
            }

            int var17 = var13 - var16 >> 4;
            int var18 = var12 - var15 >> 4;
            int var19 = var5 >> 20;
            var15 += var5 & 786432;
            var5 += var4;
            if (var14 >= 16) {
               var0[var6++] = n(var0[var6] >> 1, 8355711) + (var9[n(4032, var16) + (var15 >> 6)] >>> var19);
               var15 += var18;
               var16 += var17;
               var0[var6++] = (n(var0[var6], 16711423) >> 1) + (var9[n(4032, var16) + (var15 >> 6)] >>> var19);
               var16 += var17;
               var15 += var18;
               var0[var6++] = (n(16711423, var0[var6]) >> 1) + (var9[n(var16, 4032) + (var15 >> 6)] >>> var19);
               var16 += var17;
               var15 += var18;
               var0[var6++] = (n(var0[var6], 16711423) >> 1) + (var9[(var15 >> 6) + n(4032, var16)] >>> var19);
               var15 += var18;
               var16 += var17;
               var15 = (var5 & 786432) + (4095 & var15);
               var19 = var5 >> 20;
               var0[var6++] = (var9[n(var16, 4032) + (var15 >> 6)] >>> var19) + (n(var0[var6], 16711422) >> 1);
               var5 += var4;
               var15 += var18;
               var16 += var17;
               var0[var6++] = (var9[(var15 >> 6) + n(4032, var16)] >>> var19) + (n(var0[var6], 16711423) >> 1);
               var15 += var18;
               var16 += var17;
               var0[var6++] = (var9[n(4032, var16) + (var15 >> 6)] >>> var19) + (n(var0[var6], 16711423) >> 1);
               var16 += var17;
               var15 += var18;
               var0[var6++] = (var9[n(4032, var16) + (var15 >> 6)] >>> var19) + (n(16711423, var0[var6]) >> 1);
               var15 += var18;
               var16 += var17;
               var15 = (786432 & var5) + (4095 & var15);
               var19 = var5 >> 20;
               var0[var6++] = (var9[n(4032, var16) + (var15 >> 6)] >>> var19) + (n(var0[var6], 16711422) >> 1);
               var5 += var4;
               var15 += var18;
               var16 += var17;
               var0[var6++] = (var9[n(var16, 4032) + (var15 >> 6)] >>> var19) + n(var0[var6] >> 1, 8355711);
               var16 += var17;
               var15 += var18;
               var0[var6++] = (var9[n(4032, var16) + (var15 >> 6)] >>> var19) + (n(var0[var6], 16711423) >> 1);
               var15 += var18;
               var16 += var17;
               var0[var6++] = (n(16711422, var0[var6]) >> 1) + (var9[(var15 >> 6) + n(var16, 4032)] >>> var19);
               var15 += var18;
               var16 += var17;
               var15 = (var5 & 786432) + (var15 & 4095);
               var19 = var5 >> 20;
               var0[var6++] = (var9[n(var16, 4032) + (var15 >> 6)] >>> var19) + (n(16711422, var0[var6]) >> 1);
               var5 += var4;
               var15 += var18;
               var16 += var17;
               var0[var6++] = (n(var0[var6], 16711423) >> 1) + (var9[n(var16, 4032) + (var15 >> 6)] >>> var19);
               var15 += var18;
               var16 += var17;
               var0[var6++] = (var9[n(4032, var16) + (var15 >> 6)] >>> var19) + n(var0[var6] >> 1, 8355711);
               var16 += var17;
               var15 += var18;
               var0[var6++] = (var9[(var15 >> 6) + n(4032, var16)] >>> var19) + (n(var0[var6], 16711423) >> 1);
            } else {
               for(int var20 = 0; var14 > var20; ++var20) {
                  var0[var6++] = (var9[(var15 >> 6) + n(var16, 4032)] >>> var19) + (n(16711422, var0[var6]) >> 1);
                  var16 += var17;
                  var15 += var18;
                  if ((var20 & 3) == 3) {
                     var19 = var5 >> 20;
                     var15 = (var15 & 4095) + (786432 & var5);
                     var5 += var4;
                  }
               }
            }
         }
      }

   }

   public static final void b(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var11 > 0) {
         int var12 = 0;
         int var13 = 0;
         if (var2 != 0) {
            var13 = var3 / var2 << 6;
            var12 = var4 / var2 << 6;
         }

         var6 <<= 2;
         if (var12 >= 0) {
            if (var12 > 4032) {
               var12 = 4032;
            }
         } else {
            var12 = 0;
         }

         for(int var14 = var11; var14 > 0; var14 -= 16) {
            var2 += var9;
            var4 += var10;
            var3 += var7;
            int var15 = var12;
            int var16 = var13;
            if (var2 != 0) {
               var12 = var4 / var2 << 6;
               var13 = var3 / var2 << 6;
            }

            if (var12 < 0) {
               var12 = 0;
            } else if (var12 > 4032) {
               var12 = 4032;
            }

            int var17 = var13 - var16 >> 4;
            int var18 = var12 - var15 >> 4;
            int var19 = var5 >> 20;
            var15 += 786432 & var5;
            var5 += var6;
            if (var14 >= 16) {
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var16 += var17;
               var15 += var18;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var16 += var17;
               var15 += var18;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var15 += var18;
               var16 += var17;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var15 += var18;
               var16 += var17;
               var19 = var5 >> 20;
               var15 = (var5 & 786432) + (4095 & var15);
               var5 += var6;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var16 += var17;
               var15 += var18;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var15 += var18;
               var16 += var17;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var16 += var17;
               var15 += var18;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var15 += var18;
               var16 += var17;
               var19 = var5 >> 20;
               var15 = (786432 & var5) + (var15 & 4095);
               var5 += var6;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var16 += var17;
               var15 += var18;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var16 += var17;
               var15 += var18;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var16 += var17;
               var15 += var18;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var16 += var17;
               var15 += var18;
               var19 = var5 >> 20;
               var15 = (var15 & 4095) + (var5 & 786432);
               var5 += var6;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var15 += var18;
               var16 += var17;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var15 += var18;
               var16 += var17;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
               var15 += var18;
               var16 += var17;
               var1[var8++] = a(var0, 4032, var15, var16, var19);
            } else {
               for(int var20 = 0; var20 < var14; ++var20) {
                  var1[var8++] = a(var0, 4032, var15, var16, var19);
                  var16 += var17;
                  var15 += var18;
                  if ((3 & var20) == 3) {
                     var19 = var5 >> 20;
                     var15 = (var5 & 786432) + (var15 & 4095);
                     var5 += var6;
                  }
               }
            }
         }
      }

   }

   private static final int a(int[] var0, int var1, int var2, int var3, int var4) {
      return var0[(var2 >> 6) + (var3 & var1)] >>> var4;
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8, int var9, int var10, int var11) {
      if (var0 > 0) {
         int var12 = 0;
         int var13 = 0;
         if (var1 != 0) {
            var12 = var8 / var1 << 6;
            var13 = var11 / var1 << 6;
         }

         var4 <<= 2;
         if (var12 >= 0) {
            if (var12 > 4032) {
               var12 = 4032;
            }
         } else {
            var12 = 0;
         }

         for(int var14 = var0; var14 > 0; var14 -= 16) {
            int var15 = var13;
            int var16 = var12;
            var8 += var2;
            var1 += var3;
            var11 += var9;
            if (var1 != 0) {
               var13 = var11 / var1 << 6;
               var12 = var8 / var1 << 6;
            }

            if (var12 < 0) {
               var12 = 0;
            } else if (var12 > 4032) {
               var12 = 4032;
            }

            int var17 = var13 - var15 >> 4;
            int var18 = var12 - var16 >> 4;
            var16 += 786432 & var10;
            int var19 = var10 >> 20;
            var10 += var4;
            int var20;
            if (var14 >= 16) {
               if ((var20 = var5[(var16 >> 6) + (4032 & var15)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               ++var7;
               var15 += var17;
               var16 += var18;
               if ((var20 = var5[(var16 >> 6) + (var15 & 4032)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               var15 += var17;
               ++var7;
               var16 += var18;
               if ((var20 = var5[(var16 >> 6) + (4032 & var15)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               var15 += var17;
               ++var7;
               var16 += var18;
               if ((var20 = var5[(4032 & var15) + (var16 >> 6)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               ++var7;
               var16 += var18;
               var15 += var17;
               var19 = var10 >> 20;
               var16 = (786432 & var10) + (4095 & var16);
               var10 += var4;
               if ((var20 = var5[(var16 >> 6) + (4032 & var15)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               ++var7;
               var16 += var18;
               var15 += var17;
               if ((var20 = var5[(var15 & 4032) + (var16 >> 6)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               ++var7;
               var16 += var18;
               var15 += var17;
               if ((var20 = var5[(var15 & 4032) + (var16 >> 6)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               ++var7;
               var16 += var18;
               var15 += var17;
               if ((var20 = var5[(var15 & 4032) + (var16 >> 6)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               var15 += var17;
               ++var7;
               var16 += var18;
               var16 = (var16 & 4095) + (var10 & 786432);
               var19 = var10 >> 20;
               if ((var20 = var5[(var16 >> 6) + (var15 & 4032)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               var10 += var4;
               ++var7;
               var16 += var18;
               var15 += var17;
               if ((var20 = var5[(var16 >> 6) + (4032 & var15)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               var15 += var17;
               var16 += var18;
               ++var7;
               if ((var20 = var5[(var16 >> 6) + (4032 & var15)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               var16 += var18;
               var15 += var17;
               ++var7;
               if ((var20 = var5[(var15 & 4032) + (var16 >> 6)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               ++var7;
               var16 += var18;
               var15 += var17;
               var19 = var10 >> 20;
               var16 = (var10 & 786432) + (var16 & 4095);
               var10 += var4;
               if ((var20 = var5[(var15 & 4032) + (var16 >> 6)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               var15 += var17;
               var16 += var18;
               ++var7;
               if ((var20 = var5[(var15 & 4032) + (var16 >> 6)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               ++var7;
               var16 += var18;
               var15 += var17;
               if ((var20 = var5[(var15 & 4032) + (var16 >> 6)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               var15 += var17;
               ++var7;
               var16 += var18;
               if ((var20 = var5[(4032 & var15) + (var16 >> 6)] >>> var19) != 0) {
                  var6[var7] = var20;
               }

               ++var7;
            } else {
               for(int var21 = 0; var14 > var21; ++var21) {
                  if ((var20 = var5[(var16 >> 6) + (4032 & var15)] >>> var19) != 0) {
                     var6[var7] = var20;
                  }

                  ++var7;
                  var16 += var18;
                  var15 += var17;
                  if ((3 & var21) == 3) {
                     var19 = var10 >> 20;
                     var16 = (4095 & var16) + (var10 & 786432);
                     var10 += var4;
                  }
               }
            }
         }
      }

   }
}
