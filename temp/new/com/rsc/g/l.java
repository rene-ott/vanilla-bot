package com.rsc.g;

public class l {
   public static char[] tN = new char[]{'[', ']', '#'};
   public static char[] tO = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   public static char[] tJ = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   static char[] tP = new char[256];

   public static String c(long var0) {
      if (var0 < 0L) {
         return "invalid_name";
      } else {
         String var2 = "";

         while(var0 != 0L) {
            int var3 = (int)(var0 % 37L);
            var0 /= 37L;
            if (var3 == 0) {
               var2 = " " + var2;
            } else if (var3 < 27) {
               if (var0 % 37L == 0L) {
                  var2 = (char)(var3 + 65 - 1) + var2;
               } else {
                  var2 = (char)(var3 + 97 - 1) + var2;
               }
            } else {
               var2 = (char)(var3 + 48 - 27) + var2;
            }
         }

         return var2;
      }
   }

   static final char a(char var0) {
      if (var0 != ' ' && var0 != 160 && var0 != '_' && var0 != '-') {
         if (var0 != '[' && var0 != ']' && var0 != '#') {
            if (var0 != 224 && var0 != 225 && var0 != 226 && var0 != 228 && var0 != 227 && var0 != 192 && var0 != 193 && var0 != 194 && var0 != 196 && var0 != 195) {
               if (var0 != 232 && var0 != 233 && var0 != 234 && var0 != 235 && var0 != 200 && var0 != 201 && var0 != 202 && var0 != 203) {
                  if (var0 != 237 && var0 != 238 && var0 != 239 && var0 != 205 && var0 != 206 && var0 != 207) {
                     if (var0 != 242 && var0 != 243 && var0 != 244 && var0 != 246 && var0 != 245 && var0 != 210 && var0 != 211 && var0 != 212 && var0 != 214 && var0 != 213) {
                        if (var0 != 249 && var0 != 250 && var0 != 251 && var0 != 252 && var0 != 217 && var0 != 218 && var0 != 219 && var0 != 220) {
                           if (var0 != 231 && var0 != 199) {
                              if (var0 != 255 && var0 != 376) {
                                 if (var0 != 241 && var0 != 209) {
                                    return var0 == 223 ? 'b' : Character.toLowerCase(var0);
                                 } else {
                                    return 'n';
                                 }
                              } else {
                                 return 'y';
                              }
                           } else {
                              return 'c';
                           }
                        } else {
                           return 'u';
                        }
                     } else {
                        return 'o';
                     }
                  } else {
                     return 'i';
                  }
               } else {
                  return 'e';
               }
            } else {
               return 'a';
            }
         } else {
            return var0;
         }
      } else {
         return '_';
      }
   }

   static final boolean b(char var0) {
      return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
   }

   public static final String aR(int var0) {
      String var1 = "" + var0;

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 8) {
         var1 = "@gre@" + var1.substring(0, var1.length() - 8) + " million @whi@(" + var1 + ")";
      } else if (var1.length() > 4) {
         var1 = "@cya@" + var1.substring(0, var1.length() - 4) + "K @whi@(" + var1 + ")";
      }

      return var1;
   }

   public static final String a(String var0, String var1, com.rsc.e.h var2) {
      // $FF: Couldn't be decompiled
   }

   static final boolean c(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static final String a(CharSequence var0) {
      if (var0 == null) {
         return null;
      } else {
         byte var1 = 0;
         int var2 = var0.length();

         while(var2 > var1 && b(var0.charAt(var1))) {
         }

         while(var2 > var1 && b(var0.charAt(var2 - 1))) {
            --var2;
         }

         int var3 = var2 - var1;
         if (var3 >= 1 && var3 <= 12) {
            StringBuilder var4 = new StringBuilder(var3);

            for(int var5 = var1; var5 < var2; ++var5) {
               char var6 = var0.charAt(var5);
               if (d(var6)) {
                  char var7 = a(var6);
                  if (var7 != 0) {
                     var4.append(var7);
                  }
               }
            }

            if (var4.length() != 0) {
               return var4.toString();
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   public static final boolean d(char var0) {
      if (!Character.isISOControl(var0)) {
         if (!c(var0)) {
            char[] var1 = tO;
            int var2 = var1.length;

            int var3;
            char var4;
            for(var3 = 0; var3 < var2; ++var3) {
               var4 = var1[var3];
               if (var4 == var0) {
                  return true;
               }
            }

            var1 = tN;
            var2 = var1.length;

            for(var3 = 0; var3 < var2; ++var3) {
               var4 = var1[var3];
               if (var4 == var0) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         tP[var0] = (char)var0;
      }

   }
}
