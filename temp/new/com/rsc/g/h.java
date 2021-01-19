package com.rsc.g;

public enum h {
   ta(-1, "Error unable to login.", "Server timed out"),
   tb(0, "Login Succesful!", ""),
   tc(1, "Reconnect succesful!", ""),
   td(2, "Error unable to login.", "Unrecognised response code"),
   te(3, "Invalid username or password.", "Try again, or create a new account"),
   tf(4, "That username is already logged in.", "Wait 60 seconds then retry"),
   tg(5, "The client has been updated.", "Please reload this page"),
   th(6, "You may only use 1 character at once.", "Your ip-address is already in use"),
   ti(7, "Login attempts exceeded!", "Please try again in 5 minutes"),
   tj(8, "Error unable to login.", "Server rejected session"),
   tk(9, "Error unable to login.", "Under 13 accounts cannot access RuneScape Classic"),
   tl(10, "That username is already logged in.", "Wait 60 seconds then retry"),
   tm(11, "Account temporarily disabled.", "Check your message inbox for details"),
   tn(12, "Account permanently disabled.", "Check your message inbox for details"),
   to(14, "Sorry! This world is currently full.", "Please try a different world"),
   tp(15, "You need a members account", "to login to this world"),
   tq(16, "Error - no reply from loginserver.", "Please try again"),
   tr(17, "Error - failed to decode profile.", "Contact customer support"),
   ts(18, "Account suspected stolen.", "Press 'recover a locked account' on front page."),
   tt(20, "Error - loginserver mismatch.", "Please try a different world"),
   tu(21, "That is not a veteran RS-Classic account.", "Please try a non-veterans world."),
   tv(22, "Login from new location detected!", "Check your e-mail(spam too) to validate login"),
   tw(23, "You need to set your display name.", "Please go to the Account Management page to do this."),
   tx(24, "This world does not accept new players.", "Please see the launch page for help"),
   ty(25, "None of your characters can log in.", "Contact customer support"),
   tz(26, "You can't login in wilderness", "while you have account in wilderness or have recently left wilderness"),
   tA(27, "One of your accounts recently logged out in wilderness", "wait 10 minutes and try again");

   public int bp;
   public String tB;
   public String tC;

   private h(int var3, String var4, String var5) {
      this.bp = var3;
      this.tB = var4;
      this.tC = var5;
   }

   public static h aP(int var0) {
      h[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         h var4 = var1[var3];
         if (var4.bp == var0) {
            return var4;
         }
      }

      return null;
   }
}
