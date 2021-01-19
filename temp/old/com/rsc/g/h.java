package com.rsc.g;

public enum h {
   sT(-1, "Error unable to login.", "Server timed out"),
   sU(0, "Login Succesful!", ""),
   sV(1, "Reconnect succesful!", ""),
   sW(2, "Error unable to login.", "Unrecognised response code"),
   sX(3, "Invalid username or password.", "Try again, or create a new account"),
   sY(4, "That username is already logged in.", "Wait 60 seconds then retry"),
   sZ(5, "The client has been updated.", "Please reload this page"),
   ta(6, "You may only use 1 character at once.", "Your ip-address is already in use"),
   tb(7, "Login attempts exceeded!", "Please try again in 5 minutes"),
   tc(8, "Error unable to login.", "Server rejected session"),
   td(9, "Error unable to login.", "Under 13 accounts cannot access RuneScape Classic"),
   te(10, "That username is already logged in.", "Wait 60 seconds then retry"),
   tf(11, "Account temporarily disabled.", "Check your message inbox for details"),
   tg(12, "Account permanently disabled.", "Check your message inbox for details"),
   th(14, "Sorry! This world is currently full.", "Please try a different world"),
   ti(15, "You need a members account", "to login to this world"),
   tj(16, "Error - no reply from loginserver.", "Please try again"),
   tk(17, "Error - failed to decode profile.", "Contact customer support"),
   tl(18, "Account suspected stolen.", "Press 'recover a locked account' on front page."),
   tm(20, "Error - loginserver mismatch.", "Please try a different world"),
   tn(21, "That is not a veteran RS-Classic account.", "Please try a non-veterans world."),
   to(22, "Login from new location detected!", "Check your e-mail(spam too) to validate login"),
   tp(23, "You need to set your display name.", "Please go to the Account Management page to do this."),
   tq(24, "This world does not accept new players.", "Please see the launch page for help"),
   tr(25, "None of your characters can log in.", "Contact customer support"),
   ts(26, "You can't login in wilderness", "while you have account in wilderness or have recently left wilderness"),
   tt(27, "One of your accounts recently logged out in wilderness", "wait 10 minutes and try again");

   public int bo;
   public String tu;
   public String tv;

   private h(int var3, String var4, String var5) {
      this.bo = var3;
      this.tu = var4;
      this.tv = var5;
   }

   public static h aP(int var0) {
      h[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         h var4 = var1[var3];
         if (var4.bo == var0) {
            return var4;
         }
      }

      return null;
   }
}
