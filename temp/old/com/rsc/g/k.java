package com.rsc.g;

public final class k {
   public static char[] tC = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   private static int[] tD;
   private static byte[] tE;
   private static int[] tF;

   public static final String a(com.rsc.f.a var0) {
      boolean var1 = true;

      try {
         int var2 = var0.dO();
         if (var2 > 32767) {
            var2 = 32767;
         }

         byte[] var3 = new byte[var2];
         var0.rO += a(var0.rN, var3, 0, var0.rO, -1, var2);
         return e(var3, 0, var2);
      } catch (Exception var4) {
         return "Cabbage";
      }
   }

   public static final int a(com.rsc.f.a var0, String var1) {
      int var2 = var0.rO;
      byte[] var3 = u(var1);
      var0.aM(var3.length);
      var0.rO += a(var3.length, var0.rN, var0.rO, var3);
      return var0.rO - var2;
   }

   public static int a(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var1 + var6);
         if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
            if (var7 == 8364) {
               var3[var4 + var6] = -128;
            } else if (var7 == 8218) {
               var3[var4 + var6] = -126;
            } else if (var7 == 402) {
               var3[var4 + var6] = -125;
            } else if (var7 == 8222) {
               var3[var4 + var6] = -124;
            } else if (var7 == 8230) {
               var3[var4 + var6] = -123;
            } else if (var7 == 8224) {
               var3[var4 + var6] = -122;
            } else if (var7 == 8225) {
               var3[var4 + var6] = -121;
            } else if (var7 == 710) {
               var3[var4 + var6] = -120;
            } else if (var7 == 8240) {
               var3[var4 + var6] = -119;
            } else if (var7 == 352) {
               var3[var4 + var6] = -118;
            } else if (var7 == 8249) {
               var3[var4 + var6] = -117;
            } else if (var7 == 338) {
               var3[var4 + var6] = -116;
            } else if (var7 == 381) {
               var3[var4 + var6] = -114;
            } else if (var7 == 8216) {
               var3[var4 + var6] = -111;
            } else if (var7 == 8217) {
               var3[var4 + var6] = -110;
            } else if (var7 == 8220) {
               var3[var4 + var6] = -109;
            } else if (var7 == 8221) {
               var3[var4 + var6] = -108;
            } else if (var7 == 8226) {
               var3[var4 + var6] = -107;
            } else if (var7 == 8211) {
               var3[var4 + var6] = -106;
            } else if (var7 == 8212) {
               var3[var4 + var6] = -105;
            } else if (var7 == 732) {
               var3[var4 + var6] = -104;
            } else if (var7 == 8482) {
               var3[var4 + var6] = -103;
            } else if (var7 == 353) {
               var3[var4 + var6] = -102;
            } else if (var7 == 8250) {
               var3[var4 + var6] = -101;
            } else if (var7 == 339) {
               var3[var4 + var6] = -100;
            } else if (var7 == 382) {
               var3[var4 + var6] = -98;
            } else if (var7 == 376) {
               var3[var4 + var6] = -97;
            } else {
               var3[var4 + var6] = 63;
            }
         } else {
            var3[var4 + var6] = (byte)var7;
         }
      }

      return var5;
   }

   public static byte[] u(String var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if ((var4 <= 0 || var4 >= 128) && (var4 < 160 || var4 > 255)) {
            if (var4 == 8364) {
               var2[var3] = -128;
            } else if (var4 == 8218) {
               var2[var3] = -126;
            } else if (var4 == 402) {
               var2[var3] = -125;
            } else if (var4 == 8222) {
               var2[var3] = -124;
            } else if (var4 == 8230) {
               var2[var3] = -123;
            } else if (var4 == 8224) {
               var2[var3] = -122;
            } else if (var4 == 8225) {
               var2[var3] = -121;
            } else if (var4 == 710) {
               var2[var3] = -120;
            } else if (var4 == 8240) {
               var2[var3] = -119;
            } else if (var4 == 352) {
               var2[var3] = -118;
            } else if (var4 == 8249) {
               var2[var3] = -117;
            } else if (var4 == 338) {
               var2[var3] = -116;
            } else if (var4 == 381) {
               var2[var3] = -114;
            } else if (var4 == 8216) {
               var2[var3] = -111;
            } else if (var4 == 8217) {
               var2[var3] = -110;
            } else if (var4 == 8220) {
               var2[var3] = -109;
            } else if (var4 == 8221) {
               var2[var3] = -108;
            } else if (var4 == 8226) {
               var2[var3] = -107;
            } else if (var4 == 8211) {
               var2[var3] = -106;
            } else if (var4 == 8212) {
               var2[var3] = -105;
            } else if (var4 == 732) {
               var2[var3] = -104;
            } else if (var4 == 8482) {
               var2[var3] = -103;
            } else if (var4 == 353) {
               var2[var3] = -102;
            } else if (var4 == 8250) {
               var2[var3] = -101;
            } else if (var4 == 339) {
               var2[var3] = -100;
            } else if (var4 == 382) {
               var2[var3] = -98;
            } else if (var4 == 376) {
               var2[var3] = -97;
            } else {
               var2[var3] = 63;
            }
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }

   public static final String e(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = 255 & var0[var1 + var5];
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = tC[var6 - 128];
               if (var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   public static final int a(int var0, byte[] var1, int var2, byte[] var3) {
      int var4 = 0;
      int var5 = 0;
      var0 += var5;

      int var6;
      for(var6 = var2 << 3; var5 < var0; ++var5) {
         int var7 = var3[var5] & 255;
         int var8 = tD[var7];
         byte var9 = tE[var7];
         if (var9 == 0) {
            throw new RuntimeException("" + var7);
         }

         int var10 = var6 >> 3;
         int var11 = var6 & 7;
         var4 &= -var11 >> 31;
         int var12 = var10 + (var9 + var11 - 1 >> 3);
         var6 += var9;
         var11 += 24;
         var1[var10] = (byte)(var4 |= var8 >>> var11);
         if (var10 < var12) {
            ++var10;
            var11 -= 8;
            var1[var10] = (byte)(var4 = var8 >>> var11);
            if (var10 < var12) {
               ++var10;
               var11 -= 8;
               var1[var10] = (byte)(var4 = var8 >>> var11);
               if (var10 < var12) {
                  ++var10;
                  var11 -= 8;
                  var1[var10] = (byte)(var4 = var8 >>> var11);
                  if (var10 < var12) {
                     ++var10;
                     var11 -= 8;
                     var1[var10] = (byte)(var4 = var8 << -var11);
                  }
               }
            }
         }
      }

      return (var6 + 7 >> 3) - var2;
   }

   static final int a(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0) {
         return 0;
      } else {
         int var6 = 0;
         var5 += var2;
         int var7 = var3;

         while(true) {
            byte var8 = var0[var7];
            if (var8 >= 0) {
               ++var6;
            } else {
               var6 = tF[var6];
            }

            int var9;
            if ((var9 = tF[var6]) < 0) {
               var1[var2++] = (byte)(~var9);
               if (var2 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((64 & var8) != 0) {
               var6 = tF[var6];
            } else {
               ++var6;
            }

            if ((var9 = tF[var6]) < 0) {
               var1[var2++] = (byte)(~var9);
               if (var5 <= var2) {
                  break;
               }

               var6 = 0;
            }

            if ((var8 & 32) == 0) {
               ++var6;
            } else {
               var6 = tF[var6];
            }

            if ((var9 = tF[var6]) < 0) {
               var1[var2++] = (byte)(~var9);
               if (var5 <= var2) {
                  break;
               }

               var6 = 0;
            }

            if ((16 & var8) != 0) {
               var6 = tF[var6];
            } else {
               ++var6;
            }

            if ((var9 = tF[var6]) < 0) {
               var1[var2++] = (byte)(~var9);
               if (var2 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((var8 & 8) != 0) {
               var6 = tF[var6];
            } else {
               ++var6;
            }

            if ((var9 = tF[var6]) < 0) {
               var1[var2++] = (byte)(~var9);
               if (var2 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((4 & var8) != 0) {
               var6 = tF[var6];
            } else {
               ++var6;
            }

            if ((var9 = tF[var6]) < 0) {
               var1[var2++] = (byte)(~var9);
               if (var2 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((2 & var8) == 0) {
               ++var6;
            } else {
               var6 = tF[var6];
            }

            if ((var9 = tF[var6]) < 0) {
               var1[var2++] = (byte)(~var9);
               if (var2 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((1 & var8) != 0) {
               var6 = tF[var6];
            } else {
               ++var6;
            }

            if ((var9 = tF[var6]) < 0) {
               var1[var2++] = (byte)(~var9);
               if (var2 >= var5) {
                  break;
               }

               var6 = 0;
            }

            ++var7;
         }

         return 1 - var3 + var7;
      }
   }

   public static byte[] a(int... var0) {
      byte[] var1 = new byte[var0.length];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = (byte)var0[var2];
      }

      return var1;
   }

   static {
      byte[] var0 = a(22, 22, 22, 22, 22, 22, 21, 22, 22, 20, 22, 22, 22, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 3, 8, 22, 16, 22, 16, 17, 7, 13, 13, 13, 16, 7, 10, 6, 16, 10, 11, 12, 12, 12, 12, 13, 13, 14, 14, 11, 14, 19, 15, 17, 8, 11, 9, 10, 10, 10, 10, 11, 10, 9, 7, 12, 11, 10, 10, 9, 10, 10, 12, 10, 9, 8, 12, 12, 9, 14, 8, 12, 17, 16, 17, 22, 13, 21, 4, 7, 6, 5, 3, 6, 6, 5, 4, 10, 7, 5, 6, 4, 4, 6, 10, 5, 4, 4, 5, 7, 6, 10, 6, 10, 22, 19, 22, 14, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 21, 22, 21, 22, 22, 22, 21, 22, 22);
      int var1 = var0.length;
      tD = new int[var1];
      tE = var0;
      tF = new int[8];
      int[] var2 = new int[33];
      int var3 = 0;

      for(int var4 = 0; var1 > var4; ++var4) {
         byte var5 = var0[var4];
         if (var5 != 0) {
            int var6 = 1 << 32 - var5;
            int var7 = var2[var5];
            tD[var4] = var7;
            int var8;
            int var9;
            int var10;
            int var11;
            if ((var6 & var7) != 0) {
               var8 = var2[var5 - 1];
            } else {
               for(var9 = var5 - 1; var9 >= 1; --var9) {
                  var10 = var2[var9];
                  if (var7 != var10) {
                     break;
                  }

                  var11 = 1 << 32 - var9;
                  if ((var10 & var11) != 0) {
                     var2[var9] = var2[var9 - 1];
                     break;
                  }

                  var2[var9] = var11 | var10;
               }

               var8 = var7 | var6;
            }

            var2[var5] = var8;

            for(var9 = var5 + 1; var9 <= 32; ++var9) {
               if (var2[var9] == var7) {
                  var2[var9] = var8;
               }
            }

            var9 = 0;

            for(var10 = 0; var5 > var10; ++var10) {
               var11 = -2147483648 >>> var10;
               if ((var11 & var7) == 0) {
                  ++var9;
               } else {
                  if (tF[var9] == 0) {
                     tF[var9] = var3;
                  }

                  var9 = tF[var9];
               }

               if (tF.length <= var9) {
                  int[] var12 = new int[tF.length * 2];

                  for(int var13 = 0; var13 < tF.length; ++var13) {
                     var12[var13] = tF[var13];
                  }

                  tF = var12;
               }

               var11 >>>= 1;
            }

            if (var9 >= var3) {
               var3 = var9 + 1;
            }

            tF[var9] = ~var4;
         }
      }

   }
}
