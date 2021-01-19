package com.rsc;

import com.rsc.c.i;
import com.rsc.e.g;
import com.rsc.e.h;
import com.rsc.e.j;
import com.rsc.e.k;
import com.rsc.e.l;
import com.rsc.e.m;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public final class d extends b {
   private static final ArrayList<String> nj = new ArrayList();
   private static final String[] nk = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcut", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"};
   private static int nl = 0;
   public final int[] nm = new int[35];
   public final int[] nn = new int[35];
   private final j[] no = new j[500];
   private final j[] np = new j[500];
   private final j[] nq = new j[10000];
   private final k[] nr = new k[256];
   private final k[] ns = new k[256];
   private final k[] nt = new k[2000];
   private final com.rsc.e.a[] nu = new com.rsc.e.a[150];
   private final com.rsc.e.b[] nv = new com.rsc.e.b[150];
   private final com.rsc.e.c[] nw = new com.rsc.e.c[150];
   private final l[] nx = new l[50];
   private final int[][] ny = new int[][]{{11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4, 3}};
   private final int[] nz = new int[]{0, 1, 2, 1, 0, 0, 0, 0};
   private final int[] nA = new int[]{0, 0, 0, 0, 0, 1, 2, 1};
   private final int[] nB = new int[]{0, 1, 2, 1};
   private final String[] nC = new String[]{"Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer"};
   public final int[] nD = new int[99];
   private final int[] nE = new int[35];
   private final int nF = 30;
   private int nG = 0;
   private final int nH = 9;
   private final int nI = 2;
   private final int[] mW = new int[8000];
   private final int[] mX = new int[8000];
   private final int[] nJ = new int[]{15523536, 13415270, 11766848, 10056486, 9461792};
   private final int[] nK = new int[]{16711680, 16744448, 16769024, 10543104, 57344, 32768, 41088, 45311, 33023, 12528, 14680288, 3158064, 6307840, 8409088, 16777215};
   private final int[] nL = new int[19];
   private final int[] nM = new int[]{16760880, 16752704, 8409136, 6307872, 3158064, 16736288, 16728064, 16777215, 65280, 65535};
   private final int[] nN = new int[18];
   private final int[] nO = new int[18];
   private final int[] nP = new int[5];
   private final boolean[] nQ = new boolean[50];
   public final String[] nR = new String[100];
   private final int[] nS = new int[100];
   private int nT = 0;
   private String nU = "";
   private int nV = 0;
   private final String[] nW = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"};
   private final boolean nX = true;
   private final com.rsc.a.b.c[] nY = new com.rsc.a.b.c[3];
   private final String[] nZ = new String[500];
   private final String[] oa = new String[100];
   private final int[] ob = new int[500];
   public boolean oc;
   public String od = "";
   public String oe = "";
   public boolean of = false;
   public String og = "";
   public String oh = "";
   public boolean oi = false;
   public boolean oj = false;
   public boolean ok = false;
   public boolean ol = false;
   public boolean om = false;
   public boolean on = false;
   public boolean oo = false;
   public boolean op = false;
   public boolean oq;
   public int aC;
   public int aD;
   public int or = 0;
   public com.rsc.c.b os;
   public int ot = 0;
   public int ou = 0;
   public int ov;
   public int ow;
   public com.rsc.b.e ox;
   public int oy;
   public int oz;
   public boolean oA;
   public boolean oB;
   public int oC;
   public int oD;
   public int oE;
   public int oF;
   k oG;
   private g[] oH;
   private com.rsc.e.e[] oI;
   private m[] oJ;
   private com.rsc.e.f[] oK;
   private com.rsc.d.b.d oL;
   private com.rsc.d.b.b oM;
   private com.rsc.d.b.c oN;
   public boolean oO;
   private com.rsc.a.b.c oP;
   private boolean oQ;
   public int oR;
   public final int[] oS;
   public final int[] oT;
   public int oU;
   public int oV;
   public int oW;
   public int oX;
   private int oY;
   private int oZ;
   private int pa;
   private int pb;
   private int pc;
   private int pd;
   private String pe;
   private int pf;
   private int pg;
   private int mF;
   private int ph;
   private int pi;
   private int pj;
   private int pk;
   private int pl;
   private int pm;
   private int pn;
   private int po;
   private int pp;
   private int pq;
   private int pr;
   private int ps;
   private int pt;
   private f pu;
   private int pv;
   private int pw;
   private int bs;
   private int br;
   private int px;
   private int py;
   private com.rsc.b.b pz;
   private boolean pA;
   private int pB;
   private String[] pC;
   private boolean pD;
   private int pE;
   private boolean pF;
   private int pG;
   private boolean pH;
   private int pI;
   private int pJ;
   private int pK;
   private int pL;
   private boolean pM;
   private int pN;
   private final String[] pO;
   private int pP;
   private int pQ;
   private int pR;
   private int pS;
   private int pT;
   private int pU;
   private int pV;
   private int pW;
   private int bJ;
   private String pX;
   private int pY;
   private int pZ;
   private int qa;
   private int qb;
   private int bG;
   private int qc;
   private int qd;
   private int qe;
   private int qf;
   private int qg;
   private int qh;
   private int qi;
   private int bH;
   private int qj;
   private int qk;
   private int ql;
   private int qm;
   private int qn;
   private int qo;
   private int qp;
   private boolean qq;
   private int qr;
   private int qs;
   private int qt;
   private int qu;
   private com.rsc.b.c qv;
   private int qw;
   private final int[] qx;
   private final int[] qy;
   private int qz;
   private int qA;
   private int qB;
   private int qC;
   private int qD;
   private int qE;
   private com.rsc.c.e qF;
   private com.rsc.c.e qG;
   private com.rsc.c.e qH;
   private com.rsc.c.e qI;
   private int qJ;
   private int qK;
   private int qL;
   private int qM;
   private com.rsc.c.e qN;
   private com.rsc.c.e qO;
   private com.rsc.c.e qP;
   private int qQ;
   private int qR;
   private int qS;
   private int qT;
   private int qU;
   private String qV;
   private boolean qW;
   private boolean qX;
   private int qY;
   private boolean qZ;
   private boolean ra;
   public boolean rb;
   private boolean rc;
   private boolean rd;
   private boolean re;
   public int rf;
   private int rg;
   private String rh;
   private int ri;
   private int rj;
   private int rk;
   private boolean rl;
   private int rm;
   private int rn;
   private int ro;
   private int rp;
   private String rq;
   private String rr;
   private boolean rs;
   private int rt;
   private int ru;
   private int rv;
   private com.rsc.d.b.a rw;
   public com.rsc.d.a.j rx;
   public com.rsc.d.a.e ry;
   public com.rsc.d.a.a rz;
   private final com.rsc.d.a.a.b rA;
   private int rB;
   private boolean rC;
   private int rD;
   private int rE;
   private String na;
   private String rF;
   private boolean rG;
   private boolean rH;
   public boolean rI;
   private int rJ;
   private int rK;
   private int rL;
   private int rM;
   private boolean rN;
   private boolean rO;

   public d(com.rsc.g.e var1) {
      this.ox = com.rsc.b.e.dl;
      this.oA = true;
      this.oB = false;
      this.oC = 0;
      this.oD = 0;
      this.oE = -1;
      this.oF = -1;
      this.oG = new k();
      this.oH = new g[100];
      this.oI = new com.rsc.e.e[1000];
      this.oJ = new m[500];
      this.oK = new com.rsc.e.f[500];
      this.oR = 0;
      this.oS = new int[256];
      this.oT = new int[256];
      this.oU = 48;
      this.oV = 0;
      this.oW = -2;
      this.oX = -1;
      this.oY = 1;
      this.oZ = 0;
      this.pa = 0;
      this.pb = 0;
      this.pc = 0;
      this.pd = 0;
      this.pf = 0;
      this.pg = 0;
      this.mF = 0;
      this.pu = f.rQ;
      this.pv = 0;
      this.pw = 0;
      this.bs = 334;
      this.br = 512;
      this.px = 0;
      this.py = 0;
      this.pz = com.rsc.b.b.cv;
      this.pA = true;
      this.pB = 0;
      this.pC = null;
      this.pD = false;
      this.pE = 0;
      this.pF = false;
      this.pH = false;
      this.pI = 0;
      this.pJ = -1;
      this.pK = -1;
      this.pL = -1;
      this.pM = false;
      this.pN = 0;
      this.pO = new String[20];
      this.pS = 1;
      this.bJ = 0;
      this.pX = "";
      this.pY = 0;
      this.pZ = 0;
      this.bG = 2;
      this.qc = 14;
      this.qe = -1;
      this.qg = 0;
      this.bH = 8;
      this.qj = -1;
      this.ql = 0;
      this.qn = 0;
      this.qo = -1;
      this.qq = false;
      this.qr = 0;
      this.qs = 0;
      this.qt = 0;
      this.qu = 0;
      this.qv = com.rsc.b.c.cH;
      this.qw = 0;
      this.qx = new int[500];
      this.qy = new int[500];
      this.qz = 0;
      this.qA = 0;
      this.qB = 0;
      this.qC = 0;
      this.qD = 0;
      this.qE = 0;
      this.qQ = 0;
      this.qR = 0;
      this.qS = 0;
      this.qT = -1;
      this.qU = -1;
      this.qV = "";
      this.qW = false;
      this.qX = false;
      this.qZ = false;
      this.ra = false;
      this.rb = false;
      this.rc = false;
      this.rd = false;
      this.re = false;
      this.rf = 0;
      this.rg = 0;
      this.rh = null;
      this.ri = 0;
      this.rj = 0;
      this.rk = 0;
      this.rl = false;
      this.rm = 0;
      this.rn = 0;
      this.ro = 0;
      this.rp = 0;
      this.rq = null;
      this.rs = false;
      this.rt = 0;
      this.ru = 0;
      this.rv = 0;
      this.rA = new com.rsc.d.a.a.b();
      this.rB = -1;
      this.rC = false;
      this.rD = 0;
      this.rE = 0;
      this.rG = false;
      this.rH = false;
      this.rI = true;
      this.rJ = 0;
      this.rK = 0;
      this.rL = 0;
      this.rM = 0;
      this.rN = false;
      this.rO = false;
      this.D = var1;
      c.aa = this.D.C();
      this.c(new com.rsc.c.k(this.au(), this.av() + 12));
      this.dC().o(0, this.au(), this.av() + 12, 0);
      this.dC().a = this;
      this.oE = this.br;
      this.oF = this.bs;
      this.O = new a(this);
      this.L = new i(this.dC(), 15000, 30000, 1000);
      this.L.d(this.au() / 2, this.au() / 2, this.au(), this.av() / 2, this.av() / 2, 9);
      this.L.l(-50, -10, -50);
      this.N = new com.rsc.c.m(this, this.L, this.dC());
   }

   public static String[] cE() {
      return nk;
   }

   public com.rsc.b.b cF() {
      return this.pz;
   }

   public a cG() {
      return this.O;
   }

   public final void e(String var1) {
      if (500 <= this.rD) {
         this.a(h.mr, (String)null, (String)null, "Friend list is full", 0);
      } else {
         String var2 = com.rsc.g.l.a(var1);
         if (null != var2) {
            int var3;
            for(var3 = 0; var3 < this.rD; ++var3) {
               if (var2.equals(com.rsc.g.l.a(this.nZ[var3]))) {
                  this.a(h.mr, (String)null, (String)null, var1 + " is already on your friend list.", 0);
                  return;
               }
            }

            for(var3 = 0; var3 < this.rE; ++var3) {
               if (var2.equals(com.rsc.g.l.a(this.oa[var3]))) {
                  this.a(h.mr, (String)null, (String)null, "Please remove " + var1 + " from your ignore list first.", 0);
                  return;
               }

               if (null != this.oa[var3] && var2.equals(com.rsc.g.l.a(this.oa[var3]))) {
                  this.a(h.mr, (String)null, (String)null, "Please remove " + var1 + " from your ignore list first.", 0);
                  return;
               }
            }

            if (!var2.equals(com.rsc.g.l.a(this.oG.na))) {
               this.n().aO(195);
               this.n().q(var1);
               this.n().dX();
            } else {
               this.a(h.mr, (String)null, (String)null, "You can't add yourself to your own friend list.", 0);
            }
         }
      }

   }

   public final void f(String var1) {
      if (this.rE >= 100) {
         this.a(h.mr, (String)null, (String)null, "Ignore list full", 0);
      } else {
         String var2 = com.rsc.g.l.a(var1);
         if (var2 != null) {
            int var3;
            for(var3 = 0; var3 < this.rE; ++var3) {
               if (var2.equals(com.rsc.g.l.a(this.oa[var3]))) {
                  this.a(h.mr, (String)null, (String)null, var1 + " is already on your ignore list", 0);
                  return;
               }

               if (this.oa[var3] != null && var2.equals(com.rsc.g.l.a(this.oa[var3]))) {
                  this.a(h.mr, (String)null, (String)null, var1 + " is already on your ignore list", 0);
                  return;
               }
            }

            for(var3 = 0; var3 < this.rD; ++var3) {
               if (var2.equals(com.rsc.g.l.a(this.nZ[var3]))) {
                  this.a(h.mr, (String)null, (String)null, "Please remove " + var1 + " from your friends list first", 0);
                  return;
               }
            }

            if (!var2.equals(com.rsc.g.l.a(this.oG.na))) {
               this.n().aO(132);
               this.n().q(var1);
               this.n().dX();
            } else {
               this.a(h.mr, (String)null, (String)null, "You can't add yourself to your ignore list", 0);
            }
         }
      }

   }

   public String av(int var1) {
      String var2 = "";
      if (var1 < 0) {
         var2 = "@or1@";
      }

      if (var1 < -3) {
         var2 = "@or2@";
      }

      if (var1 < -6) {
         var2 = "@or3@";
      }

      if (var1 < -9) {
         var2 = "@red@";
      }

      if (var1 > 0) {
         var2 = "@gr1@";
      }

      if (var1 > 3) {
         var2 = "@gr2@";
      }

      if (var1 > 6) {
         var2 = "@gr3@";
      }

      if (var1 > 9) {
         var2 = "@gre@";
      }

      return var2;
   }

   private void aw(int var1) {
      k var2 = this.nr[var1];
      int var3 = 2203 - this.ow - this.oz - this.oD;
      if (this.ov + this.oy + this.oC >= 2640) {
         var3 = -50;
      }

      int var4 = 0;
      if (this.oG.mQ > 0 && var2.mQ > 0) {
         var4 = this.oG.mQ - var2.mQ;
      }

      String var5 = var2.na;
      String var6 = " " + this.av(var4) + "(level-" + var2.mQ + ")";
      if (this.qU >= 0) {
         if (com.rsc.a.a.n(this.qU).aS() == 1 || com.rsc.a.a.n(this.qU).aS() == 2) {
            this.os.a(com.rsc.c.d.dS, "Cast " + com.rsc.a.a.n(this.qU).ad() + " on", "@whi@" + var5 + var6, var2.ce(), this.qU);
         }
      } else if (this.qT >= 0) {
         this.os.a(com.rsc.c.d.dR, "Use " + this.pX + " with", "@whi@" + var5 + var6, var2.ce(), this.qT);
      } else {
         if (var3 > 0 && (var2.ci() - 64) / 128 - (-this.oD - this.ow) < 2203) {
            com.rsc.c.d var7 = com.rsc.c.d.dQ;
            if (var4 >= 0 && var4 < 5) {
               var7 = com.rsc.c.d.dP;
            }

            this.os.a(var7, "Attack", "@whi@" + var5 + var6, var2.ce());
         } else if (this.oA) {
            this.os.a(com.rsc.c.d.dO, "Duel with", "@whi@" + var5 + var6, var2.ce());
         }

         this.os.a(com.rsc.c.d.dN, "Trade with", "@whi@" + var5 + var6, var2.ce());
         this.os.a(com.rsc.c.d.dM, "Follow", "@whi@" + var5 + var6, var2.ce());
         this.os.a(com.rsc.c.d.dL, "@whi@" + var5 + var6, "Report abuse", var2.na);
         if (this.qZ && this.oq || this.qZ && this.oO) {
            this.os.a(com.rsc.c.d.eV, "Summon", var5, var5);
            this.os.a(com.rsc.c.d.eW, "Goto", var5, var5);
            this.os.a(com.rsc.c.d.eX, "Jail", var5, var5);
            if (this.oq) {
               this.os.a(com.rsc.c.d.eZ, "Check", var5, var5);
            }

            this.os.a(com.rsc.c.d.eY, "Kick", var5, var5);
         }
      }

   }

   private void cH() {
      this.pN = 0;
      this.a(h.mr, (String)null, "@cya@", "Sorry, you can't logout at the moment", 0);
   }

   private void cI() {
      this.od = "";
      this.oe = "";
   }

   protected void q() {
      this.a(true);
      this.D.I();
   }

   protected void a(boolean var1) {
      if (var1 && null != this.n()) {
         this.n().aO(31);
         this.n().dX();
         this.s();
      }

      this.dt();
   }

   private void cJ() {
      this.qF = new com.rsc.c.e(this.dC(), 100);
      this.qF.a(256, 10, "Please design Your Character", 4, true);
      short var1 = 140;
      byte var2 = 34;
      int var3 = var1 + 116;
      int var4 = var2 - 10;
      this.qF.a(var3 - 55, var4 + 110, "Front", 3, true);
      this.qF.a(var3, var4 + 110, "Side", 3, true);
      this.qF.a(var3 + 55, 110 + var4, "Back", 3, true);
      var4 += 145;
      byte var5 = 54;
      this.qF.e(var3 - var5, var4, 53, 41);
      this.qF.a(var3 - var5, var4 - 8, "Head", 1, true);
      this.qF.a(var3 - var5, var4 + 8, "Type", 1, true);
      this.qF.a(var3 - var5 - 40, var4, this.dC().b("interfaceutil", 7));
      this.ph = this.qF.c(-40 - var5 + var3, var4, 20, 20);
      this.qF.a(var3 - var5 + 40, var4, this.dC().b("interfaceutil", 6));
      this.pi = this.qF.c(var3 + (40 - var5), var4, 20, 20);
      this.qF.e(var3 + var5, var4, 53, 41);
      this.qF.a(var3 + var5, var4 - 8, "Hair", 1, true);
      this.qF.a(var5 + var3, 8 + var4, "Color", 1, true);
      this.qF.a(var5 + (var3 - 40), var4, this.dC().b("interfaceutil", 7));
      this.qb = this.qF.c(var3 + var5 - 40, var4, 20, 20);
      this.qF.a(40 + var5 + var3, var4, this.dC().b("interfaceutil", 6));
      this.pT = this.qF.c(40 + var5 + var3, var4, 20, 20);
      var4 += 50;
      this.qF.e(var3 - var5, var4, 53, 41);
      this.qF.a(var3 - var5, var4, "Gender", 1, true);
      this.qF.a(var3 - var5 - 40, var4, this.dC().b("interfaceutil", 7));
      this.pW = this.qF.c(var3 - 40 - var5, var4, 20, 20);
      this.qF.a(40 - var5 + var3, var4, this.dC().b("interfaceutil", 6));
      this.qf = this.qF.c(40 + (var3 - var5), var4, 20, 20);
      this.qF.e(var5 + var3, var4, 53, 41);
      this.qF.a(var5 + var3, var4 - 8, "Top", 1, true);
      this.qF.a(var5 + var3, 8 + var4, "Color", 1, true);
      this.qF.a(var3 + (var5 - 40), var4, this.dC().b("interfaceutil", 7));
      this.qk = this.qF.c(var5 + (var3 - 40), var4, 20, 20);
      this.qF.a(40 + var5 + var3, var4, this.dC().b("interfaceutil", 6));
      this.pV = this.qF.c(var3 - (-var5 - 40), var4, 20, 20);
      var4 += 50;
      this.qF.e(var3 - var5, var4, 53, 41);
      this.qF.a(var3 - var5, var4 - 8, "Skin", 1, true);
      this.qF.a(var3 - var5, var4 + 8, "Color", 1, true);
      this.qF.a(var3 - 40 - var5, var4, this.dC().b("interfaceutil", 7));
      this.qp = this.qF.c(var3 - var5 - 40, var4, 20, 20);
      this.qF.a(var3 - var5 + 40, var4, this.dC().b("interfaceutil", 6));
      this.qd = this.qF.c(var3 + (40 - var5), var4, 20, 20);
      this.qF.e(var5 + var3, var4, 53, 41);
      this.qF.a(var5 + var3, var4 - 8, "Bottom", 1, true);
      this.qF.a(var5 + var3, var4 + 8, "Color", 1, true);
      this.qF.a(var5 - 40 + var3, var4, this.dC().b("interfaceutil", 7));
      this.qh = this.qF.c(var3 - (40 - var5), var4, 20, 20);
      this.qF.a(var3 + var5 + 40, var4, this.dC().b("interfaceutil", 6));
      this.pP = this.qF.c(40 + var5 + var3, var4, 20, 20);
      var4 += 82;
      var4 -= 35;
      this.qF.d(var3, var4, 200, 30);
      this.qF.a(var3, var4, "Accept", 4, false);
      this.pU = this.qF.c(var3, var4, 200, 30);
   }

   private void cK() {
      this.qH = new com.rsc.c.e(this.dC(), 50);
      byte var1 = 40;
      if (c.A()) {
         var1 = -125;
      }

      this.qH.a(256, 200 + var1, "Welcome to " + c.Y, 4, true);
      this.qH.a(256, 215 + var1, "You need to create an account on rscvanilla.com to use this server", 4, true);
      this.qH.d(256, var1 + 250, 200, 35);
      this.qH.a(256, var1 + 250, "Click here to login", 5, false);
      this.qa = this.qH.c(256, 250 + var1, 200, 35);
      this.qG = new com.rsc.c.e(this.dC(), 50);
      int var2 = c.A() ? 30 : 230;
      this.pk = this.qG.a(256, var2 - 30, "", 4, true);
      this.pl = this.qG.a(256, var2 - 10, c.A() ? "Press the back button to open keyboard" : "Please enter your username and password", 4, true);
      int var3 = var2 + 28;
      this.qG.d(140, var3, 200, 40);
      this.qG.a(140, var3 - 10, "Username:", 4, false);
      this.pm = this.qG.a(140, 10 + var3, 200, 320, 40, 4, false, false);
      var3 += 47;
      this.qG.d(190, var3, 200, 40);
      this.qG.a(190, var3 - 10, "Password:", 4, false);
      this.pj = this.qG.a(190, 10 + var3, 200, 20, 40, 4, true, false);
      var3 -= 55;
      this.qG.d(410, var3, 120, 25);
      this.qG.a(410, var3, "Ok", 4, false);
      this.pQ = this.qG.c(410, var3, 120, 25);
      var3 += 30;
      this.qG.d(410, var3, 120, 25);
      this.qG.a(410, var3, "Cancel", 4, false);
      this.qm = this.qG.c(410, var3, 120, 25);
      this.qG.O(this.pm);
   }

   private void cL() {
      this.qN = new com.rsc.c.e(this.dC(), 10);
      this.qJ = this.qN.c(5, 269, 502, 56, 20, 1, true);
      this.qK = this.qN.b(7, 324, 498, 14, 1, 80, false, true);
      this.qM = this.qN.c(5, 269, 502, 56, 20, 1, true);
      this.qL = this.qN.c(5, 269, 502, 56, 20, 1, true);
      this.qN.O(this.qK);
   }

   private void k(int var1, int var2, int var3, int var4, int var5) {
      if (this.nq[var5] == null) {
         this.nq[var5] = new j();
         this.nq[var5].ao(var5);
      }

      boolean var6 = false;

      for(int var7 = 0; var7 < this.qz; ++var7) {
         if (this.np[var7].ce() == var5) {
            var6 = true;
            break;
         }
      }

      j var9 = this.nq[var5];
      var9.an(var2);
      var9.ao(var5);
      var9.at(var1);
      if (var6) {
         int var8 = var9.mV;
         if (var3 != var9.mW[var8] || var4 != var9.mX[var8]) {
            var9.mV = var8 = (1 + var8) % 10;
            var9.u(var8, var3, var4);
         }
      } else {
         var9.u(0, var3, var4);
         var9.C(var3, var4);
         var9.ap(var1);
         var9.cx();
      }

      this.no[this.qA++] = var9;
   }

   private k v(int var1, int var2, int var3, int var4) {
      if (null == this.nt[var1]) {
         this.nt[var1] = new k();
         this.nt[var1].ao(var1);
      }

      k var5 = this.nt[var1];
      boolean var6 = false;

      int var7;
      for(var7 = 0; var7 < this.pI; ++var7) {
         if (this.ns[var7].ce() == var1) {
            var6 = true;
            break;
         }
      }

      if (var6) {
         var5.at(var4);
         var7 = var5.mV;
         if (var2 != var5.mW[var7] || var5.mX[var7] != var3) {
            var5.mV = var7 = (1 + var7) % 10;
            var5.u(var7, var2, var3);
         }
      } else {
         var5.ao(var1);
         var5.cx();
         var5.u(0, var2, var3);
         var5.C(var2, var3);
         var5.ap(var4);
         var5.at(var4);
      }

      this.nr[this.qR++] = var5;
      return var5;
   }

   private void cM() {
      if (this.qU >= 0 || this.qT >= 0) {
         this.os.a(com.rsc.c.d.dW, "", "Cancel");
      }

      this.os.bg();
      int var1 = this.os.bf();

      int var2;
      for(var2 = var1; var2 > 20; --var2) {
         this.os.F(var2 - 1);
      }

      int var3;
      int var4;
      String var5;
      if (this.rf == 5) {
         var5 = null;
         if (this.qQ == 0 && this.qj != -1) {
            if (this.qj >= 0) {
               String var6 = "";
               var4 = this.qj;
               if (this.ob[var4] == 0) {
                  var5 = this.nZ[var4];
                  var6 = " is offline";
               } else {
                  var5 = "Click to message " + this.nZ[var4];
               }

               var5 = var5 + var6;
            } else {
               var3 = -(2 + this.qj);
               var5 = "Click to remove " + this.nZ[var3];
            }
         }

         if (this.qQ == 1 && this.qe != -1) {
            if (this.qe >= 0) {
               var3 = this.qe;
               var5 = "Ignoring " + this.oa[var3];
            } else {
               var3 = -(2 + this.qe);
               var5 = "Click to remove " + this.oa[var3];
            }
         }

         if (var5 != null) {
            this.dC().a((String)var5, 6, 14, 16776960, c.A() ? c.as : 1);
         }
      }

      var2 = this.os.bf();
      if (var2 > 0) {
         var3 = -1;

         for(var4 = 0; var4 < var2; ++var4) {
            var5 = this.os.w(var4);
            if (null != var5 && var5.length() > 0) {
               var3 = var4;
               break;
            }
         }

         var5 = null;
         if ((this.qT >= 0 || this.qU >= 0) && var2 == 1) {
            var5 = "Choose a target";
         } else if ((this.qT >= 0 || this.qU >= 0) && var2 > 1) {
            var5 = "@whi@" + this.os.x(0) + " " + this.os.w(0);
         } else if (var3 != -1) {
            var5 = this.os.w(var3) + ": @whi@" + this.os.x(0);
         }

         if (var2 == 2 && null != var5) {
            var5 = var5 + "@whi@ / 1 more option";
         }

         if (var2 > 2 && var5 != null) {
            var5 = var5 + "@whi@ / " + (var2 - 1) + " more options";
         }

         if (null != var5) {
            this.dC().a((String)var5, 6, 14, 16776960, c.A() ? c.as : 1);
         }

         if (!this.rG && this.s == 1 || this.rG && this.s == 1 && var2 == 1) {
            if (this.of && this.op && this.qq) {
               this.n().aO(59);
               this.n().aL(this.qi);
               this.n().aL(this.pR);
               this.n().dX();
            } else {
               this.aF(0);
            }

            this.s = 0;
         } else if (!this.rG && this.s == 2 || this.rG && this.s == 1) {
            int var8 = this.os.au();
            int var7 = this.os.av();
            this.ot = this.u() - var8 / 2;
            this.oB = true;
            this.ou = this.w() - 7;
            this.s = 0;
            if (this.ou + var7 > this.av() - 19) {
               this.ou = this.av() - 19 - var7;
            }

            if (var8 + this.ot > this.au() - 2) {
               this.ot = this.au() - 2 - var8;
            }

            if (this.ot < 0) {
               this.ot = 0;
            }

            if (this.ou < 0) {
               this.ou = 0;
            }
         }
      }

   }

   private com.rsc.c.h l(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1;
      int var7 = var1;
      int var8 = var2;
      int var9 = com.rsc.a.a.q(var3).an();
      int var10 = com.rsc.a.a.q(var3).ao();
      int var11 = com.rsc.a.a.q(var3).am();
      com.rsc.c.h var12 = new com.rsc.c.h(4, 1);
      if (var4 == 1) {
         var8 = 1 + var2;
      }

      if (var4 == 0) {
         var7 = var1 + 1;
      }

      if (var4 == 2) {
         var8 = 1 + var2;
         var6 = 1 + var1;
      }

      var6 *= 128;
      if (var4 == 3) {
         var8 = 1 + var2;
         var7 = var1 + 1;
      }

      int var13 = var2 * 128;
      var7 *= 128;
      var8 *= 128;
      int var14 = var12.c(var6, -this.N.p(var6, var13), var13);
      int var15 = var12.c(var6, -this.N.p(var6, var13) - var11, var13);
      int var16 = var12.c(var7, -var11 - this.N.p(var7, var8), var8);
      int var17 = var12.c(var7, -this.N.p(var7, var8), var8);
      int[] var18 = new int[]{var14, var15, var16, var17};
      var12.a(4, var18, var9, var10);
      var12.b(-50, -10, -50, 60, 24, false);
      if (var1 >= 0 && var2 >= 0 && var1 < 96 && var2 < 96) {
         this.L.b(var12);
      }

      var12.gy = var5 + 10000;
      return var12;
   }

   protected void g() {
      if (this.dj()) {
         this.dk();
      }

      if (this.I) {
         this.M.c(true);
         byte var1 = 35;
         this.M.b(30, var1, "An error has occured and the game has crashed(", 5, 16776960, -1);
         byte var3 = (byte)(var1 + 50);
         this.D.G();
      } else {
         if (this.pa > 0 && this.oQ) {
            this.a("Attempting to re-establish", "Connection lost! Please wait...");
         }

         if (this.K) {
            this.D.F();
            this.d(1);
         } else if (this.J) {
            this.D.E();
            this.d(1);
         } else {
            try {
               if (null == this.dC()) {
                  return;
               }

               if (this.pu == f.rQ) {
                  this.dC().jo = false;
                  this.da();
               }

               if (this.pu == f.rR) {
                  this.dC().jo = true;
                  this.cX();
               }
            } catch (OutOfMemoryError var2) {
               var2.printStackTrace();
               this.K = true;
            }

         }
      }
   }

   private void cN() {
      this.dC().jb = false;
      this.dC().c(true);
      this.qF.bi();
      short var1 = 140;
      int var2 = var1 + 116;
      byte var3 = 50;
      int var4 = var3 - 25;
      com.rsc.c.k var10000 = this.dC();
      int var10001 = var2 - 87;
      int var10002 = this.dF()[this.qc];
      com.rsc.c.k var10003 = this.dC();
      this.getClass();
      var10000.a(var10001, var10002, (com.rsc.a.b.c)var10003.c(com.rsc.a.a.m(2).ad(), 0), var4, 102, 64);
      this.dC().a(this.dC().c(com.rsc.a.a.m(this.pS).ad(), 0), var2 - 32 - 55, var4, 64, 102, this.dF()[this.bH], this.dG()[this.bJ], false, 0, 1);
      this.dC().a(this.dC().c(com.rsc.a.a.m(this.oZ).ad(), 0), var2 - 32 - 55, var4, 64, 102, this.dE()[this.bG], this.dG()[this.bJ], false, 0, 1);
      var10000 = this.dC();
      var10001 = var2 - 32;
      var10002 = this.dF()[this.qc];
      var10003 = this.dC();
      this.getClass();
      var10000.a(var10001, var10002, (com.rsc.a.b.c)var10003.c(com.rsc.a.a.m(2).ad(), 6), var4, 102, 64);
      this.dC().a(this.dC().c(com.rsc.a.a.m(this.pS).ad(), 6), var2 - 32, var4, 64, 102, this.dF()[this.bH], this.dG()[this.bJ], false, 0, 1);
      this.dC().a(this.dC().c(com.rsc.a.a.m(this.oZ).ad(), 6), var2 - 32, var4, 64, 102, this.dE()[this.bG], this.dG()[this.bJ], false, 0, 1);
      var10000 = this.dC();
      var10001 = var2 + 55 - 32;
      var10002 = this.dF()[this.qc];
      var10003 = this.dC();
      this.getClass();
      var10000.a(var10001, var10002, (com.rsc.a.b.c)var10003.c(com.rsc.a.a.m(2).ad(), 12), var4, 102, 64);
      this.dC().a(this.dC().m(this.pS, 12), 55 + (var2 - 32), var4, 64, 102, this.dF()[this.bH], this.dG()[this.bJ], false, 0, 1);
      this.dC().a(this.dC().m(this.oZ, 12), var2 + 55 - 32, var4, 64, 102, this.dE()[this.bG], this.dG()[this.bJ], false, 0, 1);
      this.dC().a((com.rsc.a.b.c)this.dC().b("interfaces", 20), 0, this.av());
   }

   private void cO() {
      int var1;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      for(var1 = 0; this.pc > var1; ++var1) {
         com.rsc.e.b var2 = this.nv[var1];
         var3 = this.dC().ac(c.ab);
         var4 = var2.bW();
         var5 = var2.bX();
         var6 = var2.au();
         var7 = var2.av();
         boolean var8 = true;

         while(var8) {
            var8 = false;

            for(int var9 = 0; var9 < var1; ++var9) {
               com.rsc.e.b var10 = this.nv[var9];
               if (var10.bW() + var10.au() > var4 - var6 && var6 + var4 > var10.bW() - var10.au() && var10.bX() - var3 < var5 + var7 && var5 - var3 < var10.bX() + var10.av() && var10.bX() - var7 - var3 < var5) {
                  var5 = var10.bX() - (var3 + var7);
                  var8 = true;
               }
            }
         }

         var2.al(var5);
         this.dC().a(var2.bZ(), var4, var5, 300, c.ab, 16776960, false);
      }

      for(var1 = 0; this.pb > var1; ++var1) {
         com.rsc.e.a var11 = this.nu[var1];
         var3 = var11.bV();
         var4 = var11.bY() * 39 / 100;
         var5 = var11.bY() * 27 / 100;
         var6 = var11.bY() * 36 / 100;
         var7 = var11.bY() * 24 / 100;
         int var13 = var11.bX() - var5;
         com.rsc.a.a.f var14 = com.rsc.a.a.l(var11.bV());
         this.dC().a((com.rsc.a.b.c)this.dC().b("interfaces", 7), var13, var11.bW() - var4 / 2, var4, var5, 85);
         this.dC().a(this.dC().ad(var3), var11.bW() - var6 / 2, var13 - var7 / 2 + var5 / 2, var6, var7, var14.aB(), 0, 0, 255, false, 0, 1);
      }

      for(var1 = 0; var1 < this.pd; ++var1) {
         com.rsc.e.c var12 = this.nw[var1];
         this.dC().g(var12.bW() - 15, var12.bX() - 3, var12.ca(), 5, 65280, 192);
         this.dC().g(var12.ca() - 15 + var12.bW(), var12.bX() - 3, 30 - var12.ca(), 5, 16711680, 192);
      }

   }

   private void cP() {
      if (!c.A()) {
         this.dC().a(this.dC().ae(20), 0, this.av(), this.au(), 10, 0, 0, false, 0, 1);
      }

      this.dC().a(this.dC().ae(21), this.au() / 2 - 256, this.av() - 4);
      int var1 = com.rsc.g.f.a(200, 200, 255);
      if (this.qv == com.rsc.b.c.cH) {
         var1 = com.rsc.g.f.a(255, 200, 50);
      }

      if (this.qs % 30 > 15) {
         var1 = com.rsc.g.f.a(255, 50, 50);
      }

      this.dC().c(this.au() / 2 - 200, 6 + this.av(), "All messages", var1, 0, -1);
      var1 = com.rsc.g.f.a(200, 200, 255);
      if (this.qv == com.rsc.b.c.cI) {
         var1 = com.rsc.g.f.a(255, 200, 50);
      }

      if (this.qr % 30 > 15) {
         var1 = com.rsc.g.f.a(255, 50, 50);
      }

      this.dC().c(this.au() / 2 - 100, this.av() + 6, "Chat history", var1, 0, -1);
      var1 = com.rsc.g.f.a(200, 200, 255);
      if (this.qv == com.rsc.b.c.cJ) {
         var1 = com.rsc.g.f.a(255, 200, 50);
      }

      if (this.qu % 30 > 15) {
         var1 = com.rsc.g.f.a(255, 50, 50);
      }

      this.dC().c(this.au() / 2, 6 + this.av(), "Quest history", var1, 0, -1);
      var1 = com.rsc.g.f.a(200, 200, 255);
      if (this.qv == com.rsc.b.c.cK) {
         var1 = com.rsc.g.f.a(255, 200, 50);
      }

      if (this.qt % 30 > 15) {
         var1 = com.rsc.g.f.a(255, 50, 50);
      }

      this.dC().c(this.au() / 2 + 100, this.av() + 6, "Private history", var1, 0, -1);
      this.dC().c(this.au() / 2 + 200, this.av() + 6, "Report abuse", 16777215, 0, -1);
   }

   private void cQ() {
      byte var1 = 7;
      byte var2 = 15;
      short var3;
      if (c.A()) {
         var3 = 140;
      } else {
         var3 = 175;
      }

      int var4;
      if (this.s != 0) {
         for(var4 = 1; var4 < 5; ++var4) {
            if (var4 > 0 && var1 < this.u() && this.u() < var3 + var1 && this.w() > var4 * 20 + var2 && var4 * 20 + var2 + 20 > this.w()) {
               this.s = 0;
               this.pg = var4 - 1;
               this.n().aO(29);
               this.n().aK(this.pg);
               this.n().dX();
               break;
            }
         }
      }

      for(var4 = 0; var4 < 5; ++var4) {
         if (1 + this.pg == var4) {
            this.dC().g(var1, var2 + var4 * 20, var3, 20, com.rsc.g.f.a(255, 0, 0), 128);
         } else {
            this.dC().g(var1, var2 + var4 * 20, var3, 20, com.rsc.g.f.a(190, 190, 190), 128);
         }

         this.dC().m(var1, var2 + var4 * 20, var3, 0);
         this.dC().m(var1, 20 + var2 + var4 * 20, var3, 0);
      }

      this.dC().c(var3 / 2 + var1, 16 + var2, (c.A() ? "C" : "Select c") + "ombat style", 16777215, 3, -1);
      this.dC().c(var3 / 2 + var1, var2 + 36, "Controlled (+1 " + (c.A() ? "all" : "of each") + ")", 0, 3, -1);
      this.dC().c(var3 / 2 + var1, 56 + var2, "Aggressive (+3 " + (c.A() ? "str" : "strength") + ")", 0, 3, -1);
      this.dC().c(var3 / 2 + var1, var2 + 76, "Accurate   (+3 " + (c.A() ? "att" : "attack") + ")", 0, 3, -1);
      this.dC().c(var3 / 2 + var1, var2 + 96, "Defensive  (+3 " + (c.A() ? "def" : "defense") + ")", 0, 3, -1);
   }

   private void cR() {
      this.dC().e(126, 137, 260, 60, 0);
      this.dC().f(126, 260, 137, 60, 16777215);
      this.dC().c(256, 173, "Logging out...", 16777215, 5, 0);
   }

   private void cS() {
      if (c.A()) {
         byte var1 = 35;
         byte var2 = 0;
         byte var3 = 20;
         int var4 = 0;
         int var5 = 0;

         int var6;
         int var7;
         for(var6 = 0; var6 < this.nG; ++var6) {
            var7 = this.dC().c(c.as, "(" + (var6 + 1) + ")" + this.pO[var6]) + 15;
            if (var4 < var7) {
               var4 = var7;
            }

            if (var5 < var1 + var6 * var3 + 20) {
               var5 = var1 + var6 * var3 + 20;
            }
         }

         if (this.s != 0) {
            for(var6 = 0; var6 < this.nG; ++var6) {
               if (this.A > var2 && this.A < var2 + var4 && this.B > var1 + var6 * var3 - 15 && this.B < var1 + var6 * var3) {
                  this.n().aO(116);
                  this.n().aK(var6);
                  this.n().dX();
                  break;
               }
            }

            this.s = 0;
            this.re = false;
            return;
         }

         for(var6 = 0; var6 < this.nG; ++var6) {
            var7 = 65535;
            if (this.A > var2 && this.A < var2 + var4 && this.B > var1 + var6 * var3 - 15 && this.B < var1 + var6 * var3) {
               var7 = 16711680;
            }

            this.dC().a("(" + (var6 + 1) + ")" + this.pO[var6], var2 + 10, var1 + var6 * var3, var7, c.as);
         }
      } else {
         int var8;
         if (this.s == 0) {
            for(var8 = 0; this.nG > var8; ++var8) {
               int var9 = 65535;
               if (this.A < this.dC().c(1, this.pO[var8]) && this.B > var8 * 12 && this.B < var8 * 12 + 12) {
                  var9 = 16711680;
               }

               this.dC().a((String)this.pO[var8], 6, var8 * 12 + 12, var9, 1);
            }
         } else {
            for(var8 = 0; var8 < this.nG; ++var8) {
               if (this.dC().c(1, this.pO[var8]) > this.A && var8 * 12 < this.B && 12 + var8 * 12 > this.B) {
                  this.n().aO(116);
                  this.n().aK(var8);
                  this.n().dX();
                  break;
               }
            }

            this.re = false;
            this.s = 0;
         }
      }

   }

   private void cT() {
      short var1 = 400;
      short var2 = 100;
      if (this.qW) {
         var2 = 300;
      }

      this.dC().e(256 - var1 / 2, 167 - var2 / 2, var1, var2, 0);
      this.dC().f(256 - var1 / 2, var1, 167 - var2 / 2, var2, 16777215);
      this.dC().a(this.qV, 256, 167 - (var2 / 2 - 20), var1 - 40, 1, 16777215, true);
      int var3 = 157 + var2 / 2;
      int var4 = 16777215;
      if (var3 - 12 < this.w() && var3 >= this.w() && this.u() > 106 && this.u() < 406) {
         var4 = 16711680;
      }

      this.dC().c(256, var3, "Click here to close window", var4, 1, -1);
      if (this.s == 1) {
         if (var4 == 16711680) {
            this.rd = false;
         }

         if ((this.u() < 256 - var1 / 2 || var1 / 2 + 256 < this.u()) && (this.w() < 167 - var2 / 2 || this.w() > 167 + var2 / 2)) {
            this.rd = false;
         }
      }

      this.s = 0;
   }

   private void cU() {
      int var1 = 65;
      if (this.rt > 0) {
         var1 += 30;
      }

      if (!this.rr.equalsIgnoreCase("0.0.0.0")) {
         var1 += 45;
      }

      int var2 = (this.au() - 400) / 2;
      int var3 = (this.av() - var1) / 2;
      this.dC().e(var2, var3, 400, var1, 0);
      this.dC().f(var2, 400, var3, var1, 16777215);
      int var4 = var3 + 20;
      this.dC().a(var2 + 256 - 56, "Welcome to RuneScape " + this.oG.na, 16776960, -1, 4, var4);
      var4 += 30;
      String var5;
      if (this.rp == 0) {
         var5 = "earlier today";
      } else if (this.rp != 1) {
         var5 = this.rp + " days ago";
      } else {
         var5 = "yesterday";
      }

      if (!this.rr.equalsIgnoreCase("0.0.0.0")) {
         this.dC().a(var2 + 256 - 56, "You last logged in " + var5, 16777215, -1, 1, var4);
         var4 += 15;
         if (this.rq == null) {
            this.rq = this.cV();
         }

         this.dC().a(var2 + 256 - 56, "from: " + this.rq, 16777215, -1, 1, var4);
         var4 += 15;
         var4 += 15;
      }

      if (this.rt > 0) {
         if (this.rt == 1) {
            this.dC().a(var2 + 256 - 56, "You have @yel@0@whi@ unread messages in your message-centre", 16777215, -1, 1, var4);
         } else {
            this.dC().a(var2 + 256 - 56, "You have @gre@" + (this.rt - 1) + " unread messages @whi@in your message-centre", 16777215, -1, 1, var4);
         }

         var4 += 15;
         var4 += 15;
      }

      int var6 = 16777215;
      if (c.A()) {
         this.dC().g(150, var4 - 20, 207, var4 - (var4 - 12) + 20, 3158064, 160);
         this.dC().f(150, 207, var4 - 20, var4 - (var4 - 12) + 20, 4210752);
         if (this.B >= var4 - 20 && this.B <= var4 - 20 + var4 - (var4 - 12) + 20 && this.A >= 150 && this.A < 357) {
            var6 = 16711680;
         }
      } else if (this.B > var4 - 12 && this.B <= var4 && this.A > var2 + 106 - 56 && this.A < var2 + 406 - 56) {
         var6 = 16711680;
      }

      this.dC().a(var2 + 256 - 56, "Click here to close window", var6, -1, 1, var4);
      if (this.s == 1) {
         if (var6 == 16711680) {
            this.rc = false;
         }

         if ((this.A < var2 + 86 - 56 || this.A > var2 + 426 - 56) && (this.B < 167 - var3 || var3 + 167 < this.B)) {
            this.rc = false;
         }
      }

      this.s = 0;
   }

   private String cV() {
      return this.rr;
   }

   private void cW() {
      this.dC().e(86, 77, 340, 180, 0);
      byte var1 = 97;
      this.dC().f(86, 340, 77, 180, 16777215);
      this.dC().c(256, var1, "Warning! Proceed with caution", 16711680, 4, -1);
      int var2 = var1 + 26;
      this.dC().c(256, var2, "If you go much further north you will enter the", 16777215, 1, -1);
      var2 += 13;
      this.dC().c(256, var2, "wilderness. This a very dangerous area where", 16777215, 1, -1);
      var2 += 13;
      this.dC().c(256, var2, "other players can attack you!", 16777215, 1, -1);
      var2 += 22;
      this.dC().c(256, var2, "The further north you go the more dangerous it", 16777215, 1, -1);
      var2 += 13;
      this.dC().c(256, var2, "becomes, but the more treasure you will find.", 16777215, 1, -1);
      var2 += 22;
      this.dC().c(256, var2, "In the wilderness an indicator at the bottom-right", 16777215, 1, -1);
      var2 += 13;
      this.dC().c(256, var2, "of the screen will show the current level of danger", 16777215, 1, -1);
      var2 += 22;
      int var3 = 16777215;
      if (this.w() > var2 - 12 && this.w() <= var2 && this.u() > 181 && this.u() < 331) {
         var3 = 16711680;
      }

      this.dC().c(256, var2, "Click here to close window", var3, 1, -1);
      if (this.s != 0) {
         if (var2 - 12 < this.w() && var2 >= this.w() && this.u() > 181 && this.u() < 331) {
            this.rg = 2;
         }

         this.s = 0;
         if (this.u() < 86 || this.u() > 426 || this.w() < 77 || this.w() > 257) {
            this.rg = 2;
         }
      }

   }

   private void cX() {
      if (this.pv != 0) {
         this.dC().by();
         this.dC().c(this.au() / 2, this.av() / 2, "Oh dear! You are dead...", 16711680, 7, -1);
         this.cP();
      } else if (this.ra) {
         this.cN();
      } else if (this.pH) {
         this.cY();
      } else if (this.N.jL) {
         int var1;
         for(var1 = 0; var1 < 64; ++var1) {
            this.L.c(this.N.jN[this.or][var1]);
            if (this.or == 0) {
               this.L.c(this.N.jM[1][var1]);
               this.L.c(this.N.jN[1][var1]);
               this.L.c(this.N.jM[2][var1]);
               this.L.c(this.N.jN[2][var1]);
            }

            this.O.c = true;
            if (this.or == 0 && (this.N.jH[this.oG.ch() / 128][this.oG.ci() / 128] & 128) == 0 && c.ah) {
               this.L.b(this.N.jN[this.or][var1]);
               if (this.or == 0 && c.ah) {
                  this.L.b(this.N.jM[1][var1]);
                  this.L.b(this.N.jN[1][var1]);
                  this.L.b(this.N.jM[2][var1]);
                  this.L.b(this.N.jN[2][var1]);
               }

               this.O.c = false;
            }
         }

         com.rsc.e.e var2;
         int var3;
         int var4;
         for(var1 = 0; var1 < this.px; ++var1) {
            var2 = this.oI[var1];
            var3 = var2.cf();
            var4 = var2.cg();
            if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var2.at() == 74) {
               var2.ck().b(1, 0, 0);
            }
         }

         if (this.qD != this.pJ) {
            this.pJ = this.qD;

            for(var1 = 0; var1 < this.px; ++var1) {
               var2 = this.oI[var1];
               if (var2.at() == 97) {
                  this.a(var2, "firea" + (this.qD + 1));
               }

               if (var2.at() == 274) {
                  this.a(var2, "fireplacea" + (this.qD + 1));
               }

               if (var2.at() == 1031) {
                  this.a(var2, "lightning" + (1 + this.qD));
               }

               if (var2.at() == 1036) {
                  this.a(var2, "firespell" + (this.qD + 1));
               }

               if (var2.at() == 1147) {
                  this.a(var2, "spellcharge" + (1 + this.qD));
               }
            }
         }

         if (this.pK != this.qE) {
            this.pK = this.qE;

            for(var1 = 0; this.px > var1; ++var1) {
               var2 = this.oI[var1];
               if (var2.at() == 51) {
                  this.a(var2, "torcha" + (1 + this.qE));
               }

               if (var2.at() == 143) {
                  this.a(var2, "skulltorcha" + (1 + this.qE));
               }
            }
         }

         if (this.qC != this.pL) {
            this.pL = this.qC;

            for(var1 = 0; this.px > var1; ++var1) {
               var2 = this.oI[var1];
               if (var2.at() == 1142) {
                  this.a(var2, "clawspell" + (1 + this.qC));
               }
            }
         }

         this.L.Z(this.ri);
         this.ri = 0;

         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         for(var1 = 0; this.qR > var1; ++var1) {
            k var13 = this.nr[var1];
            if (var13.mT > 0 && var13.cy() != null) {
               com.rsc.e.i var14 = var13.cy();
               var4 = var13.ch();
               var5 = var13.ci();
               var6 = -this.N.p(var4, var5) - 110;
               var7 = var14.ch();
               var8 = var14.ci();
               var9 = -this.N.p(var7, var8) - com.rsc.a.a.k(var13.at()).aH() / 2;
               var10 = (var7 * (40 - var13.mT) + var4 * var13.mT) / 40;
               var11 = (var6 * var13.mT + var9 * (40 - var13.mT)) / 40;
               var12 = ((40 - var13.mT) * var8 + var5 * var13.mT) / 40;
               this.L.a(var13.mP, 0, var10, var12, 32, 32, var11);
               ++this.ri;
            }

            if (var13.nc != 255) {
               var3 = -this.N.p(var13.ch(), var13.ci());
               var4 = this.L.a(var1 + 5000, var1 + 10000, var13.ch(), var13.ci(), 145, 220, var3);
               ++this.ri;
               if (this.oG == var13) {
                  this.L.aa(var4);
               }

               if (var13.cl() == 8) {
                  this.L.k(var4, -30);
               }

               if (var13.cl() == 9) {
                  this.L.k(var4, 30);
               }
            }
         }

         for(var1 = 0; var1 < this.qA; ++var1) {
            j var15 = this.no[var1];
            var3 = var15.ch();
            var4 = var15.ci();
            if (var15.mT > 0 && var15.cy() != null) {
               com.rsc.e.i var20 = var15.cy();
               var6 = -this.N.p(var3, var4) - 110;
               var7 = var20.ch();
               var8 = var20.ci();
               var9 = -this.N.p(var7, var8) - com.rsc.a.a.k(var15.at()).aH() / 2;
               var10 = (var7 * (40 - var15.mT) + var3 * var15.mT) / 40;
               var11 = (var6 * var15.mT + var9 * (40 - var15.mT)) / 40;
               var12 = ((40 - var15.mT) * var8 + var4 * var15.mT) / 40;
               this.L.a(var15.mP, 0, var10, var12, 32, 32, var11);
               ++this.ri;
            }

            var5 = -this.N.p(var3, var4);
            com.rsc.a.a.g var25 = com.rsc.a.a.k(var15.at());
            if (var25 != null) {
               var7 = this.L.a(20000 + var1, var1 + 30000, var3, var4, var25.aG(), var25.aH(), var5);
               ++this.ri;
               if (var15.cl() == 8) {
                  this.L.k(var7, -30);
               }

               if (var15.cl() == 9) {
                  this.L.k(var7, 30);
               }
            }
         }

         if (c.an != 1) {
            for(var1 = 0; var1 < this.py; ++var1) {
               com.rsc.e.f var16 = this.oK[var1];
               var3 = var16.cf() * 128 + 64;
               var4 = var16.cg() * 128 + 64;
               if ((c.an != 3 || var16.at() != 20 && var16.at() != 413 && var16.at() != 814 && var16.at() != 604) && (c.an != 2 || var16.at() == 20 || var16.at() == 814 || var16.at() == 413 || var16.at() == 181 || var16.at() == 604)) {
                  this.L.a('鱀' + var16.at(), var1 + 20000, var3, var4, 96, 64, -this.N.p(var3, var4) - var16.co());
                  ++this.ri;
               }
            }
         }

         for(var1 = 0; this.rm > var1; ++var1) {
            l var17 = this.nx[var1];
            var3 = var17.bW() * 128 + 64;
            var4 = var17.bX() * 128 + 64;
            var5 = var17.at();
            if (var5 == 0) {
               this.L.a('썐' + var1, var1 + '썐', var3, var4, 128, 256, -this.N.p(var3, var4));
               ++this.ri;
            }

            if (var5 == 1) {
               this.L.a(var1 + '썐', var1 + '썐', var3, var4, 128, 64, -this.N.p(var3, var4));
               ++this.ri;
            }
         }

         this.dC().jb = false;
         this.dC().c(true);
         this.dC().jb = this.oi;
         int var18;
         if (this.or == 3) {
            var1 = 40 + (int)(3.0D * Math.random());
            var18 = (int)(7.0D * Math.random()) + 40;
            this.L.c(-50, var18, 0, -50, var1, -10);
         }

         this.pb = 0;
         this.pd = 0;
         this.pc = 0;
         this.O.a(this.L);
         this.L.bv();
         this.cO();
         if (this.v > 0) {
            this.dC().a(this.dC().ae(12 + (24 - this.v) / 6), this.w - 8, this.x - 8);
         } else if (this.v < 0) {
            this.dC().a(this.dC().ae(16 + (this.v + 24) / 6), this.w - 8, this.x - 8);
         }

         if (this.rk != 0) {
            var1 = this.rk / 50;
            var18 = var1 / 60;
            var1 %= 60;
            if (var1 < 10) {
               this.dC().c(256, this.av() - 7, "System update in: " + var18 + ":0" + var1, 16776960, 1, -1);
            } else {
               this.dC().c(256, this.av() - 7, "System update in: " + var18 + ":" + var1, 16776960, 1, -1);
            }
         }

         if (c.ak) {
            this.rA.bO();
            var1 = 0;

            for(Iterator var21 = this.rA.kC.iterator(); var21.hasNext(); var1 += 16) {
               com.rsc.d.a.a.a var19 = (com.rsc.d.a.a.a)var21.next();
               byte var23 = 20;
               var5 = this.au() - 5 - this.dC().c(1, var19.kz);
               var6 = this.au() - 5 - this.dC().c(1, var19.kz) - var23 - 5;
               var7 = this.au() - 5 - this.dC().c(1, var19.kz) - var23 - 8 - this.dC().c(1, var19.ky);
               this.dC().a((String)var19.ky, var7, 50 + var1, 16777215, 1);
               switch(var19.kA) {
               case -2:
                  this.dC().a(this.dC().b("projectiles", 2), var6, 36 + var1, var23, 18, 0, 0, false, 0, 1);
                  break;
               case -1:
                  this.dC().a(this.dC().b("projectiles", 1), var6, 36 + var1, var23, 18, 0, 0, false, 0, 1);
                  break;
               default:
                  this.dC().a(this.dC().ad(com.rsc.a.a.l(var19.kA).bp), var6, 36 + var1, var23, 18, com.rsc.a.a.l(var19.kA).aB(), 0, false, 0, 1);
               }

               this.dC().a((String)var19.kz, var5, 50 + var1, 16777215, 1);
            }
         }

         if (!this.pM) {
            var1 = -this.oz - this.oD - (this.ow - 2203);
            if (this.oC + this.oy + this.ov >= 2640) {
               var1 = -50;
            }

            if (var1 > 0) {
               this.rl = true;
               var18 = var1 / 6 + 1;
               this.dC().a(this.dC().ae(11), this.au() - 59, this.av() - 56);
               this.dC().c(this.au() - 47, this.av() - 20, "Wilderness", 16776960, 1, -1);
               this.dC().c(this.au() - 47, this.av() - 7, "Level: " + var18, 16776960, 1, -1);
               if (this.rg == 0) {
                  this.rg = 2;
               }
            } else {
               this.rl = false;
            }

            if (this.rg == 0 && var1 > -10 && var1 <= 0) {
               this.rg = 1;
            }
         }

         if (c.ai) {
            short var28 = 139;
            this.dC().a((String)("@gre@FPS: @gre@(@whi@" + this.S + "@gre@)"), 7, var28, 16777215, 0);
            if (this.oq || this.oO) {
               var1 = var28 + 13;
               if (this.rN) {
                  this.dC().a((String)"@dre@Invisible", 7, var1, 16777215, 0);
                  var1 += 13;
               }

               this.dC().a((String)("@gre@Tile: @gre@(@whi@" + (this.oy + this.ov) + "@gre@,@whi@" + (this.oz + this.ow) + "@gre@)"), 7, var1, 16777215, 0);
               var1 += 13;
               var18 = this.oy + this.ov + this.oC;
               var3 = this.oz + this.ow + this.oD;
               var4 = var18 / 48;
               var5 = var3 / 48;
               this.dC().a((String)("@gre@Sector: @whi@h" + this.or + "@whi@x" + var4 + "@whi@y" + var5), 7, var1, 16777215, 0);
            }
         }

         if (c.A()) {
            if (c.ao) {
               this.qN.b(this.qK, 5, 140, this.au() - 14, 14);
            } else {
               this.qN.b(this.qK, 5, this.av() - 12, this.au() - 14, 14);
            }
         }

         if (this.qv == com.rsc.b.c.cH) {
            for(var1 = 0; var1 < (c.ad ? 5 : 100); ++var1) {
               g var24 = this.oH[var1];
               if (var24 != null && var24.cr() > 0) {
                  String var22 = var24.cw();
                  String var26 = var24.cv() + com.rsc.g.l.a(var24.cu(), var24.cs(), var24.cq());
                  var5 = this.dC().ac(c.ab);
                  double var27 = (double)this.av();
                  if (c.A() && c.ao) {
                     var27 = var27 / 2.5D + 8.0D;
                  }

                  this.dC().b(7, (int)(var27 - (double)(var1 * var5) - 18.0D), var26, c.ab, 16776960, var24.ct(), var22);
               }
            }
         }

         this.qN.K(this.qJ);
         this.qN.K(this.qM);
         this.qN.K(this.qL);
         if (this.qv == com.rsc.b.c.cI) {
            this.qN.Q(this.qJ);
         } else if (this.qv == com.rsc.b.c.cJ) {
            this.qN.Q(this.qM);
         } else if (this.qv == com.rsc.b.c.cK) {
            this.qN.Q(this.qL);
         }

         com.rsc.c.e.fd = 2;
         this.qN.bi();
         com.rsc.c.e.fd = 0;
         this.dC().a(this.dC().ae(0), this.dC().iU - 200, 3, 128);
         this.df();
         this.dC().jo = false;
         this.cP();
      }

   }

   private void cY() {
      this.dC().by();
      if (Math.random() < 0.15D) {
         this.dC().c((int)(Math.random() * 80.0D), (int)(334.0D * Math.random()), "ZZZ", (int)(1.6777215E7D * Math.random()), 5, -1);
      }

      if (0.15D > Math.random()) {
         this.dC().c(this.au() - (int)(80.0D * Math.random()), (int)(334.0D * Math.random()), "ZZZ", (int)(Math.random() * 1.6777215E7D), 5, -1);
      }

      this.dC().e(this.au() / 2 - 100, 160 - (c.A() ? 80 : 0), 200, 40, 0);
      if (c.A()) {
         this.dC().c(this.au() / 2, 31, "You are sleeping - Fatigue: " + this.pw * 100 / 750 + "%", 16776960, 7, 0);
      } else {
         this.dC().c(this.au() / 2, 50, "You are sleeping", 16776960, 7, 0);
         this.dC().c(this.au() / 2, 90, "Fatigue: " + this.pw * 100 / 750 + " % ", 16776960, 7, -1);
      }

      this.dC().c(this.au() / 2, 140 - (c.A() ? 80 : 0), "When you want to wake up just use your", 16777215, 5, -1);
      this.dC().c(this.au() / 2, 160 - (c.A() ? 80 : 0), "keyboard to type the word in the box below", 16777215, 5, -1);
      this.dC().c(this.au() / 2, 180 - (c.A() ? 80 : 0), this.og + "*", 65535, 5, -1);
      if (null != this.rh) {
         this.dC().c(this.au() / 2, 260 - (c.A() ? 110 : 0), this.rh, 16711680, 5, -1);
      } else {
         this.dC().a(this.oP, this.au() / 2 - 127, 230 - (c.A() ? 118 : 0));
      }

      this.dC().f(this.au() / 2 - 128, 257, 229 - (c.A() ? 118 : 0), 42, 16777215);
      this.cP();
      this.dC().c(this.au() / 2, 290 - (c.A() ? 110 : 0), "If you can't read the word", 16777215, 1, -1);
      this.dC().c(this.au() / 2, 305 - (c.A() ? 110 : 0), "@yel@click here@whi@ to get a different one", 16777215, 1, -1);
   }

   private void cZ() {
      int var2;
      int var3;
      if (this.oh.length() <= 0 && !this.pD) {
         if (this.pz.bd()) {
            StringBuilder var11 = new StringBuilder();

            for(var2 = 0; this.og.length() > var2; ++var2) {
               char var15 = this.og.charAt(var2);
               if (Character.isDigit(var15)) {
                  var11.append(var15);
               }
            }

            this.og = var11.toString();
         }

         int var12 = this.au() / 2 - this.pE / 2;
         var2 = this.av() / 2 - this.pB / 2;
         var3 = this.au() / 2;
         this.dC().e(var12, var2, this.pE, this.pB, 0);
         this.dC().f(var12, this.pE, var2, this.pB, 16777215);
         int var13 = this.dC().ac(1);
         int var5 = this.dC().ac(4);
         int var6 = var13 + 2;

         int var7;
         for(var7 = 0; var7 < this.pC.length; ++var7) {
            this.dC().c(var3, var6 * var7 + 5 + var2 + var13, this.pC[var7], 16776960, 1, -1);
         }

         if (this.pA) {
            this.dC().c(var3, var2 + 5 + var6 * this.pC.length + 3 + var5, this.og + "*", 16777215, 4, -1);
         }

         var7 = var13 + 8 + var2 + var5 + 2 + this.pC.length * var6;
         int var8 = 16777215;
         if (this.u() > var3 - 60 && this.u() < var3 && var7 - var13 - 5 < this.w() && this.w() < var7 + 5) {
            var8 = 16776960;
            if (this.s != 0) {
               this.pD = true;
               this.s = 0;
               this.oh = this.og;
            }
         }

         this.dC().a((String)"OK", var3 - 35, var7, var8, 1);
         var8 = 16777215;
         if (this.u() > var3 + 10 && this.u() < var3 + 85 && this.w() > var7 - var13 - 5 && this.w() < var7 + 5) {
            var8 = 16776960;
            if (this.s != 0) {
               this.s = 0;
               this.pz = com.rsc.b.b.cv;
            }
         }

         this.dC().a((String)"Cancel", var3 + 30, var7, var8, 1);
         if (this.s == 1 && (this.u() < var12 || this.pE + var12 < this.u() || this.w() < var2 || this.w() > this.pB + var2)) {
            this.pz = com.rsc.b.b.cv;
            this.s = 0;
         }
      } else {
         String var1 = this.oh.trim();
         this.og = "";
         this.oh = "";
         this.pz.b(var1);
         if (this.pz == com.rsc.b.b.cw) {
            this.oL.A(this.g(var1), this.oL.lM);
         } else if (this.pz == com.rsc.b.b.cx) {
            this.oL.B(this.g(var1), this.oL.lM);
         } else {
            long var4;
            if (this.pz == com.rsc.b.b.cy) {
               try {
                  if (this.oX >= 0) {
                     var2 = this.oS[this.oX];
                  } else {
                     var2 = -1;
                  }

                  if (var1.length() > 10) {
                     var1 = var1.substring(var1.length() - 10, var1.length());
                  }

                  var3 = 2147483647;
                  var4 = Long.parseLong(var1);
                  if (var4 < 2147483647L) {
                     var3 = Integer.parseInt(var1);
                  }

                  this.T.aO(22);
                  this.T.aL(var2);
                  this.T.aN(var3);
                  this.T.aN(305419896);
                  this.T.dX();
               } catch (NumberFormatException var10) {
                  System.out.println("Withdraw X number format exception: " + var10);
               }
            } else if (this.pz == com.rsc.b.b.cz) {
               try {
                  if (this.oX < 0) {
                     var2 = -1;
                  } else {
                     var2 = this.oS[this.oX];
                  }

                  if (var1.length() > 10) {
                     var1 = var1.substring(var1.length() - 10, var1.length());
                  }

                  var3 = 2147483647;
                  var4 = Long.parseLong(var1);
                  if (var4 < 2147483647L) {
                     var3 = Integer.parseInt(var1);
                  }

                  this.T.aO(23);
                  this.T.aL(var2);
                  this.T.aN(var3);
                  this.T.aN(-2023406815);
                  this.T.dX();
               } catch (NumberFormatException var9) {
                  System.out.println("Deposit X number format exception: " + var9);
               }
            } else if (this.pz == com.rsc.b.b.cA) {
               var2 = this.oN.lv[this.oN.lr];
               if (var2 != -1) {
                  var3 = this.g(var1);
                  this.n().aO(236);
                  this.n().aL(var2);
                  this.n().aL(this.oN.lu[this.oN.lr]);
                  this.n().aL(var3);
                  this.n().dX();
               }
            } else if (this.pz == com.rsc.b.b.cB) {
               var2 = this.oN.lv[this.oN.lr];
               if (var2 != -1) {
                  var3 = this.g(var1);
                  this.n().aO(221);
                  this.n().aL(this.oN.lv[this.oN.lr]);
                  this.n().aL(this.oN.lu[this.oN.lr]);
                  this.n().aL(var3);
                  this.n().dX();
               }
            } else {
               long var14;
               if (this.pz == com.rsc.b.b.cC) {
                  if (var1.length() > 10) {
                     var1 = var1.substring(var1.length() - 10, var1.length());
                  }

                  var2 = 2147483647;
                  var14 = this.h(var1);
                  if (var14 < 2147483647L) {
                     var2 = this.g(var1);
                  }

                  this.oM.z(var2, this.oM.kP);
               } else if (this.pz == com.rsc.b.b.cD) {
                  if (var1.length() > 10) {
                     var1 = var1.substring(var1.length() - 10, var1.length());
                  }

                  var2 = 2147483647;
                  var14 = this.h(var1);
                  if (var14 < 2147483647L) {
                     var2 = this.g(var1);
                  }

                  this.oM.y(this.oM.kP, var2);
               } else if (this.pz == com.rsc.b.b.cE) {
                  this.n().aO(84);
                  this.n().dX();
               }
            }
         }

         this.pz = com.rsc.b.b.cv;
      }

   }

   public int g(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   public long h(String var1) {
      try {
         return Long.parseLong(var1);
      } catch (NumberFormatException var3) {
         return 0L;
      }
   }

   public final void m(int var1, int var2, int var3, int var4, int var5) {
      int var6 = com.rsc.a.a.l(var1).aB();
      this.dC().a(this.dC().ad(var1), var2, var3, var4, var5, var6, 0, 0, 255, false, 0, 1);
   }

   private void da() {
      this.dC().jb = false;
      this.rs = false;
      this.dC().c(true);
      if (this.ql == 0 || this.ql == 2 || this.ql == 3) {
         int var1 = this.pf * 2 % 3072;
         if (var1 < 1024) {
            this.dC().a((com.rsc.a.b.c)this.nY[0], 0, 10);
            if (var1 > 768) {
               this.dC().a(this.nY[1], 0, 10, var1 - 768);
            }
         } else if (var1 < 2048) {
            this.dC().a((com.rsc.a.b.c)this.nY[1], 0, 10);
            if (var1 > 1792) {
               this.dC().a(this.nY[2], 0, 10, var1 - 1792);
            }
         } else {
            this.dC().a((com.rsc.a.b.c)this.nY[2], 0, 10);
            if (var1 > 2816) {
               this.dC().a(this.nY[0], 0, 10, var1 - 2816);
            }
         }
      }

      if (this.ql == 0) {
         this.qH.bi();
      }

      if (this.ql == 2) {
         String var2 = this.qG.J(this.pk);
         if (null != var2 && var2.length() > 0) {
            this.dC().g(0, 185, this.au(), 30, 0, 100);
         }

         this.qG.bi();
      }

      this.dC().a((com.rsc.a.b.c)this.dC().ae(20), 0, this.av());
   }

   private void f(boolean var1) {
      this.oQ = var1;
      if (this.qn > 0) {
         this.c("Please wait...", "Connecting to server");

         try {
            com.rsc.g.f.b(2000L);
         } catch (Exception var4) {
         }

         this.c("Sorry! The server is currently full.", "Please try again later");
      } else {
         while(this.pa > 0) {
            try {
               if (this.na.trim().length() == 0) {
                  this.c("You must enter both a username", "and a password - Please try again");
                  return;
               }

               if (!var1) {
                  this.c("Please wait...", "Connecting to server");
               } else {
                  this.a("Attempting to re-establish", "Connection lost! Please wait...");
               }

               this.a(new com.rsc.f.b(this, "158.69.122.62", 43594));
               this.n().aO(0);
               this.n().aK(0);
               this.n().aN(14);
               this.n().q(this.rF);
               this.n().q(this.na);
               this.n().a(this.du());
               this.n().q(this.dv());
               this.n().dX();
               this.s();
               int var2 = this.V.dV();
               com.rsc.g.h var3 = com.rsc.g.h.aP(var2);
               if (var3 == com.rsc.g.h.tb) {
                  this.pa = 0;
                  this.dx();
                  return;
               }

               if (var3 == com.rsc.g.h.tc) {
                  this.pa = 0;
                  this.dx();
                  return;
               }

               if (!var1) {
                  this.c(var3.tB, var3.tC);
               } else {
                  this.dt();
               }

               return;
            } catch (Exception var6) {
               var6.printStackTrace();
               --this.pa;
               if (this.pa <= 0) {
                  if (this.oQ) {
                     this.rF = "";
                     this.na = "";
                     this.dt();
                  } else {
                     this.c("Sorry! Unable to connect.", "Check internet settings or try another world");
                  }
               } else {
                  try {
                     com.rsc.g.f.b(3000L);
                  } catch (Exception var5) {
                  }
               }
            }
         }

      }
   }

   private void a(com.rsc.f.b var1) {
      this.T.dY();
      this.V = var1;
   }

   private void db() {
      int var1;
      if (this.s == 0) {
         var1 = this.os.au();
         int var2 = this.os.av();
         boolean var3 = false;
         if (c.A() && c.aq) {
            var3 = true;
         }

         if (var3) {
            this.os.b(this.ou, this.ot, this.w(), this.u());
         } else if (this.ot - 10 <= this.u() && this.ou - 10 <= this.w() && var1 + this.ot + 10 >= this.u() && this.w() <= 10 + this.ou + var2) {
            this.os.b(this.ou, this.ot, this.w(), this.u());
         } else {
            this.oB = false;
         }
      } else {
         var1 = this.os.a(this.u(), this.w(), this.ot, this.ou);
         if (var1 >= 0) {
            this.aF(var1);
         }

         this.oB = false;
         this.s = 0;
      }

   }

   private boolean i(String var1) {
      var1 = var1.replace("@yel@", "");
      if (null == var1) {
         return false;
      } else if (var1.equals(this.oG.na)) {
         return false;
      } else {
         boolean var2 = false;
         boolean var3 = false;
         if (-this.oz - this.oD - (this.ow - 2203) > 0) {
            return false;
         } else {
            for(int var4 = 0; var4 < this.rD; ++var4) {
               if (var1.equals(this.nZ[var4])) {
                  var2 = true;
                  if ((4 & this.ob[var4]) != 0) {
                     var3 = true;
                  }
                  break;
               }
            }

            if (var2) {
               if (var3) {
                  this.os.a(com.rsc.c.d.dV, "@whi@" + var1, "Message", var1);
               }
            } else {
               boolean var6 = false;

               for(int var5 = 0; var5 < this.rE; ++var5) {
                  if (var1.equals(com.rsc.g.l.a(this.oa[var5]))) {
                     var6 = true;
                     break;
                  }
               }

               if (!var6) {
                  this.os.a(com.rsc.c.d.dT, "@whi@" + var1, "Add friend", var1);
                  this.os.a(com.rsc.c.d.dU, "@whi@" + var1, "Add ignore", var1);
               }
            }

            this.os.a(com.rsc.c.d.dL, "@whi@" + var1, "Report abuse", var1);
            return true;
         }
      }
   }

   private void v(int var1, int var2, int var3) {
      this.dC().n(var2, var3, var1);
      this.dC().n(var2 - 1, var3, var1);
      this.dC().n(1 + var2, var3, var1);
      this.dC().n(var2, var3 - 1, var1);
      this.dC().n(var2, var3 + 1, var1);
   }

   public final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      j var9 = this.no[var1];
      com.rsc.a.a.g var10 = var9.cA();
      int var11 = 7 & var9.cl() + (this.O.e() + 16) / 32;
      boolean var12 = false;
      int var13 = var11;
      if (var11 == 5) {
         var13 = 3;
         var12 = true;
      } else if (var11 == 6) {
         var13 = 2;
         var12 = true;
      } else if (var11 == 7) {
         var13 = 1;
         var12 = true;
      }

      int var14 = this.nB[var9.mU / var10.aI() % 4] + var13 * 3;
      if (var9.cl() == 8) {
         var12 = false;
         var13 = 5;
         var2 -= var8 * var10.aK() / 100;
         var11 = 2;
         var14 = this.nz[this.pf / (var10.aJ() - 1) % 8] + var13 * 3;
      } else if (var9.cl() == 9) {
         var13 = 5;
         var11 = 2;
         var12 = true;
         var2 += var10.aK() * var8 / 100;
         var14 = this.nA[this.pf / var10.aJ() % 8] + var13 * 3;
      }

      int var15;
      int var16;
      int var17;
      for(var15 = 0; var15 < 12; ++var15) {
         var16 = this.dD()[var11][var15];
         var17 = var10.t(var16);
         com.rsc.a.a.a var18 = com.rsc.a.a.m(var17);
         if (var18 != null) {
            byte var19 = 0;
            byte var20 = 0;
            int var21 = var14;
            if (var12 && var13 >= 1 && var13 <= 3 && var18.ah()) {
               var21 = var14 + 15;
            }

            if (var13 != 5 || var18.ag()) {
               com.rsc.a.b.c var22 = this.dC().c(var18.ad(), var21);
               int var23 = var22.cl;
               int var24 = var22.cm;
               int var25 = this.dC().c(var18.ad(), 0).cl;
               if (var23 != 0 || var24 != 0 || var25 != 0) {
                  int var26 = var19 * var4 / var23;
                  int var27 = var20 * var5 / var24;
                  int var28 = var23 * var4 / var25;
                  var26 -= (var28 - var4) / 2;
                  int var29 = var18.ae();
                  int var30 = 0;
                  if (var29 == 1) {
                     var30 = var10.aF();
                     var29 = var10.aC();
                  } else if (var29 == 2) {
                     var29 = var10.aD();
                     var30 = var10.aF();
                  } else if (var29 == 3) {
                     var30 = var10.aF();
                     var29 = var10.aE();
                  }

                  this.dC().a(var22, var26 + var2, var27 + var3, var28, var5, var29, var30, 0, 255, var12, var6, 1);
               }
            }
         }
      }

      if (var9.mR > 0) {
         com.rsc.e.b var31 = new com.rsc.e.b();
         var31.ai(this.dC().c(1, var9.mo) / 2);
         var31.aj(this.dC().c(1, var9.mo) / 300 * this.dC().ac(1));
         var31.ak(var4 / 2 + var2);
         var31.al(var3);
         var31.c(var9.mo);
         this.nv[this.pc++] = var31;
      }

      if (var9.cl() == 8 || var9.cl() == 9 || var9.mF != 0) {
         if (var9.mF > 0) {
            var15 = var2;
            if (var9.cl() == 9) {
               var15 = var2 + var8 * 20 / 100;
            } else if (var9.cl() == 8) {
               var15 = var2 - var8 * 20 / 100;
            }

            var16 = var4 / 2 + var15;
            var17 = var9.mN * 30 / var9.mO;
            this.nw[this.pd++] = new com.rsc.e.c(var16, var3, var17);
         }

         if (var9.mF > 150) {
            var15 = var2;
            if (var9.cl() == 9) {
               var15 = var2 + var8 * 10 / 100;
            } else if (var9.cl() == 8) {
               var15 = var2 - var8 * 10 / 100;
            }

            if (var9.mG > 0) {
               this.dC().a(this.dC().ae(10), var15 - (12 - var4 / 2), var3 + var5 / 2 - 12);
               this.dC().c(var4 / 2 - 1 + var15, 5 + var3 + var5 / 2, "" + var9.mH, 16777215, 3, -1);
            }
         }
      }

   }

   public final void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      k var9 = this.nr[var1];
      if (var9.nc != 255) {
         int var10 = var9.cl() + (this.O.e() + 16) / 32 & 7;
         boolean var11 = false;
         int var12 = var10;
         if (var10 == 5) {
            var11 = true;
            var12 = 3;
         } else if (var10 == 7) {
            var12 = 1;
            var11 = true;
         } else if (var10 == 6) {
            var12 = 2;
            var11 = true;
         }

         int var13 = this.nB[var9.mU / 6 % 4] + var12 * 3;
         if (var9.cl() == 9) {
            var10 = 2;
            var12 = 5;
            var2 += var8 * 5 / 100;
            var11 = true;
            var13 = this.nA[this.pf / 6 % 8] + var12 * 3;
         } else if (var9.cl() == 8) {
            var2 -= var8 * 5 / 100;
            var12 = 5;
            var11 = false;
            var10 = 2;
            var13 = this.nz[this.pf / 5 % 8] + var12 * 3;
         }

         Object var14 = null;

         int var15;
         int var16;
         for(var15 = 0; var15 < 12; ++var15) {
            var16 = this.dD()[var10][var15];
            com.rsc.a.a.a var17 = var9.mM[var16];
            if (var17 != null) {
               byte var18 = 0;
               byte var19 = 0;
               int var20 = var13;
               if (var11 && var12 >= 1 && var12 <= 3) {
                  if (var17.ah()) {
                     var20 = var13 + 15;
                  } else if (var16 == 4 && var12 == 1) {
                     var20 = var12 * 3 + this.nB[(var9.mU / 6 + 2) % 4];
                     var19 = -3;
                     var18 = -22;
                  } else if (var16 == 4 && var12 == 2) {
                     var18 = 0;
                     var19 = -8;
                     var20 = this.nB[(var9.mU / 6 + 2) % 4] + var12 * 3;
                  } else if (var16 == 4 && var12 == 3) {
                     var19 = -5;
                     var20 = var12 * 3 + this.nB[(2 + var9.mU / 6) % 4];
                     var18 = 26;
                  } else if (var16 == 3 && var12 == 1) {
                     var20 = var12 * 3 + this.nB[(2 + var9.mU / 6) % 4];
                     var18 = 22;
                     var19 = 3;
                  } else if (var16 == 3 && var12 == 2) {
                     var19 = 8;
                     var20 = var12 * 3 + this.nB[(var9.mU / 6 + 2) % 4];
                     var18 = 0;
                  } else if (var16 == 3 && var12 == 3) {
                     var18 = -26;
                     var20 = this.nB[(2 + var9.mU / 6) % 4] + var12 * 3;
                     var19 = 5;
                  }
               }

               if (var12 != 5 || var17.ag()) {
                  if (var17 == null) {
                     return;
                  }

                  com.rsc.a.b.c var21 = this.dC().c(var17.ad(), var20);
                  int var22 = var21.cl;
                  int var23 = var21.cm;
                  int var24 = this.dC().c(var17.ad(), 0).cl;
                  if (var22 != 0 && var23 != 0 && var24 != 0) {
                     int var25 = var18 * var4 / var22;
                     int var26 = var19 * var5 / var23;
                     int var27 = var22 * var4 / var24;
                     var25 -= (var27 - var4) / 2;
                     int var28 = var17.ae();
                     int var29 = this.dG()[var9.ne];
                     if (var28 == 1) {
                        var28 = this.dE()[var9.nd];
                     } else if (var28 == 2) {
                        var28 = this.dF()[var9.nf];
                     } else if (var28 == 3) {
                        var28 = this.dF()[var9.nc];
                     }

                     this.dC().a(var21, var25 + var2, var3 + var26, var27, var5, var28, var29, 0, 255, var11, var6, 1);
                  }
               }
            }
         }

         if (var9.mR > 0) {
            com.rsc.e.b var30 = new com.rsc.e.b();
            var30.ai(this.dC().c(1, var9.mo) / 2);
            var30.aj(this.dC().c(1, var9.mo) / 300 * this.dC().ac(1));
            var30.ak(var4 / 2 + var2);
            var30.al(var3);
            var30.c(var9.mo);
            this.nv[this.pc++] = var30;
         }

         if (c.ac && var9.na != null) {
            var15 = var3 + 3;
            if (var9.mR > 0) {
               var15 -= 15;
            }

            if (var9.mF > 0) {
               var15 -= 10;
            }

            var16 = var2;
            if (var9.cl() == 9) {
               var16 = var2 + var8 * 20 / 100;
            } else if (var9.cl() == 8) {
               var16 = var2 - var8 * 20 / 100;
            }

            this.dC().a((String)var9.na, (var4 - this.dC().c(0, var9.na)) / 2 + var16, var15 - 4, 16776960, 0);
         }

         if (var9.mE > 0) {
            this.nu[this.pb++] = new com.rsc.e.a(var9.mD, var2 + var4 / 2, var3, var8);
         }

         int var31;
         if (var9.cl() == 8 || var9.cl() == 9 || var9.mF != 0) {
            if (var9.mF > 0) {
               var15 = var2;
               if (var9.cl() == 9) {
                  var15 = var2 + var8 * 20 / 100;
               } else if (var9.cl() == 8) {
                  var15 = var2 - var8 * 20 / 100;
               }

               var16 = var4 / 2 + var15;
               var31 = var9.mN * 30 / var9.mO;
               this.nw[this.pd++] = new com.rsc.e.c(var16, var3, var31);
            }

            if (var9.mF > 150) {
               var15 = var2;
               if (var9.cl() == 9) {
                  var15 = var2 + var8 * 10 / 100;
               } else if (var9.cl() == 8) {
                  var15 = var2 - var8 * 10 / 100;
               }

               if (var9.mG > 0) {
                  this.dC().a(this.dC().ae(9), var15 - (12 - var4 / 2), var3 + var5 / 2 - 12);
                  this.dC().c(var4 / 2 - 1 + var15, 5 + var3 + var5 / 2, "" + var9.mH, 16777215, 3, -1);
               }
            }
         }

         if (var9.nb == 1 && var9.mE == 0) {
            var15 = var6 + var2 + var4 / 2;
            if (var9.cl() == 8) {
               var15 -= var8 * 20 / 100;
            } else if (var9.cl() == 9) {
               var15 += var8 * 20 / 100;
            }

            var16 = var8 * 16 / 100;
            var31 = var8 * 16 / 100;
            this.dC().b(this.dC().ae(11), var15 - var16 / 2, var3 - var31 / 2 - var8 * 10 / 100, var16, var31);
         }
      }

   }

   private void dc() {
      if (this.oh.length() > 0) {
         this.nU = this.oh.trim();
         this.nT = 0;
         this.nV = 2;
      } else {
         byte var1 = 0;
         if (this.oq || this.oO) {
            if (this.oq) {
               var1 = 2;
            } else if (this.oO) {
               var1 = 1;
            }
         }

         int var2 = this.dC().ac(1);
         int var3 = this.dC().ac(4);
         short var4 = 400;
         int var5 = (var1 > 0 ? 5 + var2 : 0) + 70;
         int var6 = 256 - var4 / 2;
         int var7 = 180 - var5 / 2;
         this.dC().e(var6, var7, var4, var5, 0);
         this.dC().f(var6, var4, var7, var5, 16777215);
         this.dC().a(256, "Enter the name of the player you wish to report:", 16776960, 0, 1, 5 + var7 + var2);
         int var8 = var2 + 2;
         this.dC().a(256, this.og + "*", 16777215, 0, 4, var3 + var7 + 5 + var8 + 3);
         int var9 = var2 + var3 + 8 + var7 + var8 + 2;
         int var10 = 16777215;
         if (var1 > 0) {
            String var11 = this.rO ? "[X]" : "[ ]";
            if (var1 > 1) {
               var11 = var11 + " Mute player";
            } else {
               var11 = var11 + " Suggest mute";
            }

            int var12 = this.dC().c(1, var11);
            if (this.A > 256 - var12 / 2 && this.A < var12 / 2 + 256 && var9 - var2 < this.B && var9 > this.B) {
               if (this.t() != 0) {
                  this.rO = !this.rO;
                  this.e(0);
               }

               var10 = 16776960;
            }

            this.dC().a(256, var11, var10, 0, 1, var9);
            var9 += 10 + var2;
         }

         var10 = 16777215;
         if (this.A > 210 && this.A < 228 && var9 - var2 < this.B && var9 > this.B) {
            if (this.t() != 0) {
               this.oh = this.og;
               this.e(0);
            }

            var10 = 16776960;
         }

         this.dC().a((String)"OK", 210, var9, var10, 1);
         var10 = 16777215;
         if (this.A > 264 && this.A < 304 && this.B > var9 - var2 && var9 > this.B) {
            var10 = 16776960;
            if (this.t() != 0) {
               this.e(0);
               this.nV = 0;
            }
         }

         this.dC().a((String)"Cancel", 264, var9, var10, 1);
         if (this.t() == 1 && (this.A < var6 || this.A > var6 + var4 || var7 > this.B || var7 + var5 < this.B)) {
            this.nV = 0;
            this.e(0);
         }
      }

   }

   private void dd() {
      this.nT = 0;
      boolean var1 = true;
      if (this.A >= 36 && this.A < 176) {
         this.nT = 1;
      } else if (this.A >= 186 && this.A < 326) {
         this.nT = 7;
      } else if (this.A >= 336 && this.A < 476) {
         this.nT = 12;
      } else {
         var1 = false;
      }

      int var2 = 156;
      int var3;
      if (var1) {
         var1 = false;

         for(var3 = 0; var3 < 6; ++var3) {
            int var4 = var3 == 0 ? 30 : 18;
            if (this.B > var2 - 12 && this.B < var4 + var2 - 12) {
               if (this.nT == 1) {
                  var1 = true;
                  this.nT += var3;
                  break;
               }

               if (this.nT == 7) {
                  if (var3 < 5) {
                     var1 = true;
                     this.nT += var3;
                  }
                  break;
               }

               if (this.nT == 12) {
                  if (var3 < 3) {
                     var1 = true;
                     this.nT += var3;
                  }
                  break;
               }
            }

            var2 += 2 + var4;
         }
      }

      if (!var1) {
         this.nT = 0;
      }

      if (this.t() != 0 && this.nT != 0) {
         this.n().aO(206);
         this.n().q(this.nU);
         this.n().aK(this.nT);
         this.n().aK(this.rO ? 1 : 0);
         this.n().dX();
         this.nV = 0;
         this.oh = "";
         this.og = "";
         this.e(0);
      } else {
         var2 += 15;
         if (this.t() != 0) {
            this.e(0);
            if (this.A < 31 || this.B < 35 || this.A > 481 || this.B > 310) {
               this.nV = 0;
               return;
            }

            if (this.A > 66 && this.A < 446 && this.B >= var2 - 15 && this.B < var2 + 5) {
               this.nV = 0;
               return;
            }
         }

         this.dC().e(31, 35, 450, 275, 0);
         this.dC().f(31, 450, 35, 275, 16777215);
         byte var5 = 50;
         this.dC().a(256, "This form is for reporting players who are breaking our rules", 16777215, 0, 1, var5);
         var2 = var5 + 15;
         this.dC().a(256, "Using it sends a snapshot of the last 60 seconds of activity to us", 16777215, 0, 1, var2);
         var2 += 15;
         this.dC().a(256, "If you misuse this form, you will be banned.", 16744448, 0, 1, var2);
         var2 += 15;
         var2 += 10;
         this.dC().a(256, "Click on the most suitable option from the Rules of RuneScape.", 16776960, 0, 1, var2);
         var2 += 15;
         this.dC().a(256, "This will send a report to our Player Support team for investigation.", 16776960, 0, 1, var2);
         var2 += 18;
         this.dC().a(106, "Honour", 16711680, 0, 4, var2);
         this.dC().a(256, "Respect", 16711680, 0, 4, var2);
         this.dC().a(406, "Security", 16711680, 0, 4, var2);
         var2 += 18;
         if (this.nT == 1) {
            this.dC().e(36, var2 - 12, 140, 30, 3158064);
         }

         this.dC().f(36, 140, var2 - 12, 30, 4210752);
         if (this.nT == 7) {
            this.dC().e(186, var2 - 12, 140, 30, 3158064);
         }

         this.dC().f(186, 140, var2 - 12, 30, 4210752);
         if (this.nT == 12) {
            this.dC().e(336, var2 - 12, 140, 30, 3158064);
         }

         this.dC().f(336, 140, var2 - 12, 30, 4210752);
         if (this.nT == 1) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dC().a(106, "Buying or", var3, 0, 0, var2);
         if (this.nT == 7) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dC().a(256, "Seriously offensive", var3, 0, 0, var2);
         if (this.nT != 12) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dC().a(406, "Asking for or providing", var3, 0, 0, var2);
         var2 += 12;
         if (this.nT != 1) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dC().a(106, "selling an account", var3, 0, 0, var2);
         if (this.nT != 7) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dC().a(256, "language", var3, 0, 0, var2);
         if (this.nT != 12) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dC().a(406, "contact information", var3, 0, 0, var2);
         var2 += 20;
         if (this.nT == 2) {
            this.dC().e(36, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(36, 140, var2 - 12, 18, 4210752);
         if (this.nT == 8) {
            this.dC().e(186, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(186, 140, var2 - 12, 18, 4210752);
         if (this.nT == 13) {
            this.dC().e(336, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(336, 140, var2 - 12, 18, 4210752);
         if (this.nT == 2) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dC().a(106, "Encouraging rule-breaking", var3, 0, 0, var2);
         if (this.nT == 8) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dC().a(256, "Solicitation", var3, 0, 0, var2);
         if (this.nT != 13) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dC().a(406, "Breaking real-world laws", var3, 0, 0, var2);
         var2 += 20;
         if (this.nT == 3) {
            this.dC().e(36, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(36, 140, var2 - 12, 18, 4210752);
         if (this.nT == 9) {
            this.dC().e(186, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(186, 140, var2 - 12, 18, 4210752);
         if (this.nT == 14) {
            this.dC().e(336, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(336, 140, var2 - 12, 18, 4210752);
         if (this.nT == 3) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dC().a(106, "Staff impersonation", var3, 0, 0, var2);
         if (this.nT != 9) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dC().a(256, "Disruptive behaviour", var3, 0, 0, var2);
         if (this.nT != 14) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dC().a(406, "Advertising websites", var3, 0, 0, var2);
         var2 += 20;
         if (this.nT == 4) {
            this.dC().e(36, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(36, 140, var2 - 12, 18, 4210752);
         if (this.nT == 10) {
            this.dC().e(186, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(186, 140, var2 - 12, 18, 4210752);
         if (this.nT != 4) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dC().a(106, "Macroing or use of bots", var3, 0, 0, var2);
         if (this.nT == 10) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dC().a(256, "Offensive account name", var3, 0, 0, var2);
         var2 += 20;
         if (this.nT == 5) {
            this.dC().e(36, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(36, 140, var2 - 12, 18, 4210752);
         if (this.nT == 11) {
            this.dC().e(186, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(186, 140, var2 - 12, 18, 4210752);
         if (this.nT == 5) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dC().a(106, "Scamming", var3, 0, 0, var2);
         if (this.nT != 11) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dC().a(256, "Real-life threats", var3, 0, 0, var2);
         var2 += 20;
         if (this.nT == 6) {
            this.dC().e(36, var2 - 12, 140, 18, 3158064);
         }

         this.dC().f(36, 140, var2 - 12, 18, 4210752);
         if (this.nT != 6) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dC().a(106, "Exploiting a bug", var3, 0, 0, var2);
         var2 += 18;
         var2 += 15;
         var3 = 16777215;
         if (this.A > 196 && this.A < 316 && this.B > var2 - 15 && this.B < 5 + var2) {
            var3 = 16776960;
         }

         this.dC().a(256, "Click here to cancel", var3, 0, 1, var2);
      }

   }

   private void de() {
      byte var1 = 106;
      int var2 = 145;
      if (c.A()) {
         var2 = 75;
      }

      if (this.s != 0) {
         this.s = 0;
         if (this.ox == com.rsc.b.e.dm && (this.u() < var1 || this.w() < var2 || this.u() > var1 + 300 || this.w() > var2 + 70)) {
            this.ox = com.rsc.b.e.dl;
            return;
         }

         if (this.ox == com.rsc.b.e.dn && (this.u() < 6 || this.w() < var2 || this.u() > 506 || this.w() > 70)) {
            this.ox = com.rsc.b.e.dl;
            return;
         }

         if (this.ox == com.rsc.b.e.do && (this.u() < var1 || this.w() < var2 || this.u() > 406 || this.w() > 70)) {
            this.ox = com.rsc.b.e.dl;
            return;
         }

         if (this.u() > var1 + 130 && this.u() < var1 + 270 && this.w() > var2 + 48 && this.w() < var2 + 68) {
            this.ox = com.rsc.b.e.dl;
            return;
         }
      }

      String var3;
      String var4;
      if (this.ox == com.rsc.b.e.dm) {
         this.dC().e(106, var2, 300, 70, 0);
         this.dC().f(106, 300, var2, 70, 16777215);
         var2 += 20;
         this.dC().c(256, var2, "Enter name to add to friends list", 16777215, 4, -1);
         var2 += 20;
         this.dC().c(256, var2, this.og + "*", 16777215, 4, -1);
         var3 = com.rsc.g.l.a(this.oG.na);
         if (null != var3 && this.oh.length() > 0) {
            var4 = this.oh.trim();
            this.ox = com.rsc.b.e.dl;
            this.og = "";
            this.oh = "";
            if (var4.length() > 0 && !var3.equals(com.rsc.g.l.a(var4))) {
               this.e(var4);
            }
         }
      }

      if (this.ox == com.rsc.b.e.dn) {
         this.dC().e(6, var2, 500, 70, 0);
         this.dC().f(6, 500, var2, 70, 16777215);
         var2 += 20;
         this.dC().c(256, var2, "Enter message to send to " + this.pe, 16777215, 4, -1);
         var2 += 20;
         this.dC().c(256, var2, this.od + "*", 16777215, 4, -1);
         if (this.oe.length() > 0) {
            var3 = this.oe;
            this.od = "";
            this.ox = com.rsc.b.e.dl;
            this.oe = "";
            this.b(this.pe, var3);
         }
      }

      if (this.ox == com.rsc.b.e.do) {
         this.dC().e(106, var2, 300, 70, 0);
         this.dC().f(106, 300, var2, 70, 16777215);
         var2 += 20;
         this.dC().c(256, var2, "Enter name to add to ignore list", 16777215, 4, -1);
         var2 += 20;
         this.dC().c(256, var2, this.og + "*", 16777215, 4, -1);
         var3 = com.rsc.g.l.a(this.oG.na);
         if (var3 != null && this.oh.length() > 0) {
            var4 = this.oh.trim();
            this.og = "";
            this.ox = com.rsc.b.e.dl;
            this.oh = "";
            if (var4.length() > 0 && !var3.equals(com.rsc.g.l.a(var4))) {
               this.f(var4);
            }
         }
      }

      int var5 = 16777215;
      if (this.u() > var1 + 130 && this.u() < var1 + 170 && this.w() > var2 + 10 && this.w() < var2 + 28) {
         var5 = 16776960;
      }

      this.dC().c(256, var2 + 23, "Cancel", var5, 1, -1);
   }

   public final void n(int var1, int var2, int var3, int var4, int var5) {
      l var6 = this.nx[var1];
      int var8 = 255 - var6.cB() * 5;
      int var7;
      if (var6.at() == 0) {
         var7 = 255 + var6.cB() * 1280;
         this.dC().g(var2 + var4 / 2, var5 / 2 + var3, 20 + var6.cB() * 2, var7, var8);
      }

      if (var6.at() == 1) {
         var7 = 16711680 + var6.cB() * 1280;
         this.dC().g(var2 + var4 / 2, var3 + var5 / 2, var6.cB() + 10, var7, var8);
      }

   }

   private void a(String var1, String var2) {
      this.D.a(var1, var2);
   }

   private void df() {
      boolean var1 = false;
      if (this.pN != 0) {
         this.cR();
      } else if (this.rc) {
         this.cU();
      } else if (this.rd) {
         this.cT();
      } else if (this.rg == 1) {
         this.cW();
      } else if (this.rx.bF()) {
         this.rx.b(this.dC());
      } else if (this.rz.bF()) {
         this.rz.a(this.dC());
      } else if (this.ry.bF()) {
         this.ry.b(this.dC());
      } else if (this.dI() && this.mF == 0) {
         if (this.pz != com.rsc.b.b.cv) {
            this.cZ();
         }

         this.dg();
      } else if (this.oN.lm && this.mF == 0) {
         this.oN.bS();
      } else if (this.oL.lU) {
         this.oL.bv();
      } else if (this.oL.lT) {
         this.oL.bv();
      } else if (this.oM.kZ) {
         this.oM.bv();
      } else if (this.oM.kY) {
         this.oM.bv();
      } else if (this.nV != 1) {
         if (this.nV == 2) {
            this.dd();
         } else if (this.ox == com.rsc.b.e.dl) {
            var1 = true;
         } else {
            this.de();
         }
      } else {
         this.dc();
      }

      if (this.pz != com.rsc.b.b.cv) {
         this.cZ();
      }

      if (var1) {
         if (this.re) {
            this.cS();
         }

         if (c.al != 0 && (this.oG.cl() == 8 || this.oG.cl() == 9) || c.al == 2) {
            this.cQ();
         }

         boolean var2 = !this.re && !this.oB;
         if (var2) {
            this.os.E(0);
         }

         this.ds();
         if (this.rf == 0 && var2) {
            this.dh();
         }

         if (this.rf == 1) {
            this.g(var2);
         }

         if (this.rf == 2) {
            this.j(var2);
         }

         if (this.rf == 3) {
            this.l(var2);
         }

         if (this.rf == 4) {
            this.i(var2);
         }

         if (this.rf == 5) {
            this.h(var2);
         }

         if (this.rf == 6) {
            this.k(var2);
         }

         if (!this.oB && !this.re) {
            this.cM();
         }

         if (this.oB && !this.re) {
            this.db();
         }
      }

      this.s = 0;
   }

   private void dg() {
      this.rw.bP();
   }

   private void dh() {
      int var1;
      int var2;
      if (this.qv == com.rsc.b.c.cI && this.qN.L(this.qJ) || this.qv == com.rsc.b.c.cJ && this.qN.L(this.qM) || this.qv == com.rsc.b.c.cK && this.qN.L(this.qL)) {
         var1 = this.qv == com.rsc.b.c.cI ? this.qJ : (this.qv == com.rsc.b.c.cJ ? this.qM : this.qL);
         var2 = this.qN.H(var1);
         if (var2 >> 16 == 2 || this.rG && var2 >> 16 == 1) {
            int var3 = '\uffff' & var2;
            String var4 = this.qN.e(var1, var3);
            if (this.i(var4)) {
               return;
            }
         }
      }

      if (this.qv == com.rsc.b.c.cH) {
         for(var1 = 0; var1 < 100; ++var1) {
            g var10 = this.oH[var1];
            if (var10 != null && var10.cr() > 0 && (var10.cq() == h.mv || var10.cq() == h.ms || var10.cq() == h.mw || var10.cq() == h.mx)) {
               String var11 = var10.cv() + com.rsc.g.l.a(var10.cu(), var10.cs(), var10.cq());
               if (this.u() > 7 && this.u() < this.dC().c(1, var11) + 7 && this.w() > -(var1 * 12) - 30 + this.av() && this.av() - var1 * 12 - 18 > this.w() && (this.s == 2 || this.rG && this.s == 1) && this.i(var10.cs())) {
                  return;
               }
            }
         }
      }

      this.qq = false;

      for(var1 = 0; this.px > var1; ++var1) {
         this.oI[var1].cj();
      }

      for(var1 = 0; this.ro > var1; ++var1) {
         this.oJ[var1].cj();
      }

      var1 = -1;
      var2 = this.L.bu();
      com.rsc.c.h[] var12 = this.L.bt();
      int[] var13 = this.L.bs();

      for(int var5 = 0; var5 < var2 && this.os.bf() <= 200; ++var5) {
         int var6 = var13[var5];
         com.rsc.c.h var7 = var12[var5];
         if (var7.gA[var6] <= 65535 || var7.gA[var6] >= 200000 && var7.gA[var6] <= 300000) {
            if (this.L.iA == var7) {
               int var8 = var7.gA[var6] % 10000;
               int var9 = var7.gA[var6] / 10000;
               if (var9 == 1) {
                  this.aw(var8);
               } else if (var9 == 2) {
                  this.aA(var8);
               } else if (var9 == 3) {
                  this.az(var8);
               }
            } else if (var7 != null && var7.gy >= 10000) {
               this.ax(var7.gy - 10000);
            } else if (var7 != null && var7.gy >= 0) {
               this.ay(var7.gy);
            } else {
               if (var6 >= 0) {
                  var6 = var7.gA[var6] - 200000;
               }

               if (var6 >= 0) {
                  var1 = var6;
               }
            }
         }
      }

      if (this.qU >= 0 && com.rsc.a.a.n(this.qU).aS() <= 1) {
         this.os.a(com.rsc.c.d.ex, "Cast " + com.rsc.a.a.n(this.qU).ad() + " on self", "", this.qU);
      }

      if (~var1 != 0) {
         this.qq = true;
         this.qi = this.ov + this.N.jI[var1];
         this.pR = this.ow + this.N.jJ[var1];
         if (this.qZ && this.oq || this.qZ && this.oO) {
            this.os.a(com.rsc.c.d.fa, "Teleport here", "", this.N.jI[var1], this.N.jJ[var1]);
         }

         if (this.qX && this.oq) {
            String var14 = this.qY < com.rsc.a.a.Q() ? com.rsc.a.a.s(this.qY).ad() : "Object";
            String var15 = this.qY < com.rsc.a.a.P() ? com.rsc.a.a.q(this.qY).ad() : "Wall";
            String var16 = this.qY < com.rsc.a.a.aN.size() ? com.rsc.a.a.k(this.qY).ad() : "NPC";
            this.os.a(com.rsc.c.d.eM, "", "", this.N.jI[var1], this.N.jJ[var1]);
            this.os.a(com.rsc.c.d.eN, "[Spawn]", "@yel@" + var16 + "@whi@(@or1@" + this.qY + "@whi@)", this.N.jI[var1], this.N.jJ[var1]);
            this.os.a(com.rsc.c.d.eO, "[Spawn]", "@cya@" + var14 + "@whi@(@or1@" + this.qY + "@whi@)", this.N.jI[var1], this.N.jJ[var1]);
            this.os.a(com.rsc.c.d.eP, "[Spawn]", "@cya@" + var15 + "@whi@(@or1@" + this.qY + "@whi@)", this.N.jI[var1], this.N.jJ[var1]);
         }

         if (this.qU >= 0) {
            if (com.rsc.a.a.n(this.qU).aS() == 6) {
               this.os.a(com.rsc.c.d.ey, "Cast " + com.rsc.a.a.n(this.qU).ad() + " on ground", "", this.N.jI[var1], this.N.jJ[var1], this.qU);
            }
         } else if (this.qT < 0) {
            this.os.a(com.rsc.c.d.ez, "Walk here", "", this.N.jI[var1], this.N.jJ[var1]);
         }
      }

   }

   private void ax(int var1) {
      m var2 = this.oJ[var1];
      if (!var2.cb()) {
         if (this.qU >= 0) {
            if (com.rsc.a.a.n(this.qU).aS() == 4) {
               this.os.a(com.rsc.c.d.dX, "Cast " + com.rsc.a.a.n(this.qU).ad() + " on", "@cya@" + var2.cD().ad(), var2.cf(), var2.cg(), var2.cl(), this.qU);
            }
         } else if (this.qT >= 0) {
            this.os.a(com.rsc.c.d.dY, "Use " + this.pX + " with", "@cya@" + var2.cD().ad(), var2.cf(), var2.cg(), var2.cl(), this.qT);
         } else {
            if (!var2.cD().ai().equalsIgnoreCase("WalkTo")) {
               this.os.a(com.rsc.c.d.dZ, var2.cD().ai(), "@cya@" + var2.cD().ad(), var2.cf(), var2.cg(), var2.cl());
            }

            if (!var2.cD().aj().equalsIgnoreCase("Examine")) {
               this.os.a(com.rsc.c.d.ea, var2.cD().aj(), "@cya@" + var2.cD().ad(), var2.cf(), var2.cg(), var2.cl());
            }

            if (this.qX && this.oq) {
               this.os.a(com.rsc.c.d.eT, "[Rotate]", "@cya@" + var2.cD().ad() + "@whi@(@or1@" + this.qY + "@whi@)", var2.cf(), var2.cg(), var2.cl(), var2.at());
               this.os.a(com.rsc.c.d.eU, "[Remove]", "@cya@" + var2.cD().ad() + "@whi@(@or1@" + this.qY + "@whi@)", var2.cf(), var2.cg(), var2.cl(), var2.at());
            }

            this.os.a(com.rsc.c.d.eb, "Examine", "@cya@" + var2.cD().ad() + (!this.oq && !this.oO ? "" : " @or1@(" + var2.at() + ":" + (var2.cf() + this.ov) + "," + (var2.cg() + this.ow) + ")"), var2.at());
         }

         var2.cc();
      }

   }

   private void ay(int var1) {
      com.rsc.e.e var2 = this.oI[var1];
      if (!var2.cb()) {
         if (this.qU >= 0) {
            if (com.rsc.a.a.n(this.qU).aS() == 5) {
               this.os.a(com.rsc.c.d.eg, "Cast " + com.rsc.a.a.n(this.qU).ad() + " on", "@cya@" + var2.cm().ad(), var2.cg(), this.qU, var2.at(), var2.cl(), var2.cf());
            }
         } else if (this.qT >= 0) {
            this.os.a(com.rsc.c.d.ec, "Use " + this.pX + " with", "@cya@" + var2.cm().ad(), var2.cg(), this.qT, var2.at(), var2.cl(), var2.cf());
         } else {
            if (!var2.cm().ai().equalsIgnoreCase("WalkTo")) {
               this.os.a(com.rsc.c.d.ed, var2.cm().ai(), "@cya@" + var2.cm().ad(), var2.cf(), var2.cg(), var2.cl(), var2.at());
            }

            if (!var2.cm().aj().equalsIgnoreCase("Examine")) {
               this.os.a(com.rsc.c.d.ee, var2.cm().aj(), "@cya@" + var2.cm().ad(), var2.cf(), var2.cg(), var2.cl(), var2.at());
            }

            if (this.qX && this.oq) {
               this.os.a(com.rsc.c.d.eR, "[Rotate]", "@cya@" + var2.cm().ad() + "@whi@(@or1@" + this.qY + "@whi@)", var2.cf(), var2.cg(), var2.cl(), var2.at());
               this.os.a(com.rsc.c.d.eS, "[Remove]", "@cya@" + var2.cm().ad() + "@whi@(@or1@" + this.qY + "@whi@)", var2.cf(), var2.cg(), var2.cl(), var2.at());
            }

            this.os.a(com.rsc.c.d.ef, "Examine", "@cya@" + var2.cm().ad() + (!this.oq && !this.oO ? "" : " @or1@(" + var2.at() + ":" + (var2.cf() + this.ov) + "," + (var2.cg() + this.ow) + ")"), var2.at());
         }

         var2.cc();
      }

   }

   private void az(int var1) {
      j var2 = this.no[var1];
      String var3 = "";
      int var4 = -1;
      if (var2.cA().aP()) {
         int var5 = (var2.cA().aO() + var2.cA().aM() + var2.cA().aN() + var2.cA().aL()) / 4;
         int var6 = (this.nN[3] + this.nN[2] + this.nN[1] + this.nN[0] + 27) / 4;
         var3 = this.av(var6 - var5);
         var3 = " " + var3 + "(level-" + var5 + ")";
         var4 = var6 - var5;
      }

      if (this.qU >= 0) {
         if (com.rsc.a.a.n(this.qU).aS() == 2) {
            this.os.a(com.rsc.c.d.ep, "Cast " + com.rsc.a.a.n(this.qU).ad() + " on", "@yel@" + var2.cA().ad(), var2.ce(), this.qU);
         }
      } else if (this.qT >= 0) {
         this.os.a(com.rsc.c.d.ew, "Use " + this.pX + " with", "@yel@" + var2.cA().ad(), var2.ce(), this.qT);
      } else {
         if (var2.cA().aP()) {
            this.os.a(var4 >= 0 ? com.rsc.c.d.eq : com.rsc.c.d.er, "Attack", "@yel@" + var2.cA().ad() + var3, var2.ce());
         }

         this.os.a(com.rsc.c.d.es, "Talk-to", "@yel@" + var2.cA().ad(), var2.ce());
         if (!var2.cA().ai().equals("")) {
            this.os.a(com.rsc.c.d.et, var2.cA().ai(), "@yel@" + var2.cA().ad(), var2.ce());
         }

         this.os.a(com.rsc.c.d.ev, "Examine", "@yel@" + var2.cA().ad() + (!this.oq && !this.oO ? "" : " @or1@(" + this.no[var1].at() + ")"), this.no[var1].at());
         if (this.qX && this.oq) {
            this.os.a(com.rsc.c.d.eQ, "[Remove]", "@yel@" + var2.cA().ad() + " @or1@(" + this.no[var1].at() + ")", var2.ce());
         }
      }

   }

   private void aA(int var1) {
      com.rsc.e.f var2 = this.oK[var1];
      if (this.qU >= 0) {
         if (com.rsc.a.a.n(this.qU).aS() == 3) {
            this.os.a(com.rsc.c.d.eh, "Cast " + com.rsc.a.a.n(this.qU).ad() + " on", "@lre@" + var2.cn().ad(), var2.cf(), var2.cg(), var2.at(), this.qU);
         }
      } else if (this.qT >= 0) {
         this.os.a(com.rsc.c.d.eo, "Use " + this.pX + " with", "@lre@" + var2.cn().ad(), var2.cf(), var2.cg(), var2.at(), this.qT);
      } else {
         com.rsc.c.d var3 = com.rsc.c.d.el;
         this.os.a(var3, "Take", "@lre@" + var2.cn().ad(), var2.cf(), var2.cg(), var2.at());
         this.os.a(com.rsc.c.d.en, "Examine", "@lre@" + var2.cn().ad() + (!this.oq && !this.oO ? "" : " @or1@(" + var2.at() + ":" + (var2.cf() + this.ov) + "," + (var2.cg() + this.ow) + ")"), var2.at());
      }

   }

   private void g(boolean var1) {
      int var2 = this.dC().iU - 248;
      this.dC().a((com.rsc.a.b.c)this.dC().ae(1), var2, 3);
      int var3 = 0;

      while(true) {
         this.getClass();
         int var4;
         int var5;
         if (30 <= var3) {
            for(var3 = 1; var3 <= 4; ++var3) {
               com.rsc.c.k var10000 = this.dC();
               int var10001 = var2 + var3 * 49;
               this.getClass();
               var10000.n(var10001, 36, 0, 30 / 5 * 34);
            }

            var3 = 1;

            while(true) {
               this.getClass();
               if (30 / 5 - 1 < var3) {
                  if (var1) {
                     var2 = 248 + (this.A - this.dC().iU);
                     var3 = this.B - 36;
                     if (var2 >= 0 && var3 >= 0 && var2 < 248) {
                        this.getClass();
                        if (30 / 5 * 34 > var3) {
                           var4 = var3 / 34 * 5 + var2 / 49;
                           if (this.pG > var4) {
                              var5 = this.nm[var4];
                              if (this.qU >= 0) {
                                 if (com.rsc.a.a.n(this.qU).aS() == 3) {
                                    this.os.a(com.rsc.c.d.eA, "@lre@" + com.rsc.a.a.l(var5).ad(), "Cast " + com.rsc.a.a.n(this.qU).ad() + " on", var4, this.qU);
                                 }
                              } else if (this.qT < 0) {
                                 if (this.nE[var4] == 1) {
                                    this.os.a(com.rsc.c.d.eB, "Remove", "@lre@" + com.rsc.a.a.l(var5).ad(), var4);
                                 } else if (com.rsc.a.a.l(var5).bB != 0) {
                                    String var6;
                                    if ((24 & com.rsc.a.a.l(var5).bB) == 0) {
                                       var6 = "Wear";
                                    } else {
                                       var6 = "Wield";
                                    }

                                    this.os.a(com.rsc.c.d.eC, var6, "@lre@" + com.rsc.a.a.l(var5).ad(), var4);
                                 }

                                 if (!com.rsc.a.a.l(var5).ax().equals("")) {
                                    this.os.a(com.rsc.c.d.eD, com.rsc.a.a.l(var5).ax(), "@lre@" + com.rsc.a.a.l(var5).ad(), var4);
                                 }

                                 this.os.a(com.rsc.c.d.eE, "Use", "@lre@" + com.rsc.a.a.l(var5).ad(), var4);
                                 this.os.a(com.rsc.c.d.eF, "Drop", "@lre@" + com.rsc.a.a.l(var5).ad(), var4);
                                 this.os.a(com.rsc.c.d.eG, "Examine", "@lre@" + com.rsc.a.a.l(var5).ad() + (this.oq ? " @or1@(" + var5 + ")" : ""), var5);
                              } else {
                                 this.os.a(com.rsc.c.d.eH, "Use " + this.pX + " with", "@lre@" + com.rsc.a.a.l(var5).ad(), var4, this.qT);
                              }
                           }
                        }
                     }
                  }

                  return;
               }

               this.dC().m(var2, 36 + var3 * 34, 245, 0);
               ++var3;
            }
         }

         var4 = var2 + var3 % 5 * 49;
         var5 = var3 / 5 * 34 + 36;
         if (this.pG > var3 && this.nE[var3] == 1) {
            this.dC().g(var4, var5, 49, 34, 16711680, 128);
         } else {
            this.dC().g(var4, var5, 49, 34, com.rsc.g.f.a(181, 181, 181), 128);
         }

         if (var3 < this.pG) {
            this.dC().a(this.dC().ad(this.nm[var3]), var4, var5, 48, 32, com.rsc.a.a.l(this.nm[var3]).aB(), 0, false, 0, 1);
            if (com.rsc.a.a.l(this.nm[var3]).aA()) {
               this.dC().a((String)("" + this.nn[var3]), 1 + var4, var5 + 10, 16776960, 1);
            }
         }

         ++var3;
      }
   }

   private void h(boolean var1) {
      int var2 = this.dC().iU - 199;
      byte var3 = 36;
      this.dC().a((com.rsc.a.b.c)this.dC().ae(5), var2 - 49, 3);
      short var4 = 196;
      short var5 = 182;
      int var6 = this.au() - 23;
      int var7 = this.au() - 83;
      int var8;
      int var9 = var8 = com.rsc.g.f.a(160, 160, 160);
      if (this.qQ != 0) {
         var8 = com.rsc.g.f.a(220, 220, 220);
      } else {
         var9 = com.rsc.g.f.a(220, 220, 220);
      }

      this.dC().g(var2, var3, var4 / 2, 24, var9, 128);
      this.dC().g(var2 + var4 / 2, var3, var4 / 2, 24, var8, 128);
      this.dC().g(var2, 24 + var3, var4, var5 - 24, com.rsc.g.f.a(220, 220, 220), 128);
      this.dC().m(var2, var3 + 24, var4, 0);
      this.dC().n(var4 / 2 + var2, 0 + var3, 0, 24);
      this.dC().m(var2, var3 + var5 - 16, var4, 0);
      this.dC().a(var2 + var4 / 4, "Friends", 0, 0, 4, 16 + var3);
      this.dC().a(var4 / 4 + var2 + var4 / 2, "Ignore", 0, 0, 4, var3 + 16);
      this.qP.G(this.pp);
      int var10;
      String var11;
      int var12;
      int var14;
      if (this.qQ == 0) {
         for(var10 = 0; var10 < this.rD; ++var10) {
            if ((this.ob[var10] & 2) == 0) {
               if ((this.ob[var10] & 4) == 0) {
                  var11 = "@red@";
               } else {
                  var11 = "@yel@";
               }
            } else {
               var11 = "@gre@";
            }

            String var13 = this.nZ[var10];
            var12 = 0;

            for(var14 = this.nZ[var10].length(); this.dC().c(1, var13) > 120; var13 = this.nZ[var10].substring(0, var14 - var12) + "...") {
               ++var12;
            }

            this.qP.a(this.pp, var10, var11 + var13 + "~" + (this.au() - 73) + "~@whi@Remove         WWWWWWWWWW", -1, (String)null, (String)null);
         }
      }

      int var15;
      if (this.qQ == 1) {
         for(var10 = 0; var10 < this.rE; ++var10) {
            var11 = this.oa[var10];
            var15 = 0;

            for(var12 = this.oa[var10].length(); this.dC().c(1, var11) > 120; var11 = this.oa[var10].substring(0, var12 - var15) + "...") {
               ++var15;
            }

            this.qP.a(this.pp, var10, "@yel@" + var11 + "~" + (this.au() - 73) + "~@whi@Remove         WWWWWWWWWW", -1, (String)null, (String)null);
         }
      }

      this.qP.bi();
      this.qe = -1;
      this.qj = -1;
      if (this.qQ == 0) {
         var10 = this.qP.I(this.pp);
         if (var10 >= 0 && this.A < var6) {
            if (this.A > var7) {
               this.qj = -(var10 + 2);
            } else {
               this.qj = var10;
            }
         }

         this.dC().a(var4 / 2 + var2, "Click a name to send a message", 16777215, -1, 1, 35 + var3);
         if (var2 < this.A && this.A < var2 + var4 && this.B > var5 + (var3 - 16) && this.B < var5 + var3) {
            var15 = 16776960;
         } else {
            var15 = 16777215;
         }

         this.dC().a(var4 / 2 + var2, "Click here to add a friend", var15, -1, 1, var5 + var3 - 3);
      }

      if (this.qQ == 1) {
         var10 = this.qP.I(this.pp);
         if (var10 >= 0 && this.A < var6) {
            if (this.A <= var7) {
               this.qe = var10;
            } else {
               this.qe = -(var10 + 2);
            }
         }

         this.dC().a(var2 + var4 / 2, "Blocking messages from:", 16777215, -1, 1, 35 + var3);
         if (this.A > var2 && var2 + var4 > this.A && var5 + var3 - 16 < this.B && var5 + var3 > this.B) {
            var15 = 16776960;
         } else {
            var15 = 16777215;
         }

         this.dC().a(var4 / 2 + var2, "Click here to add a name", var15, -1, 1, var3 + (var5 - 3));
      }

      if (var1) {
         var14 = this.B - 36;
         var2 = 199 + this.A - this.dC().au();
         if (var2 >= 0 && var14 >= 0 && var2 < 196 && var14 < 182) {
            this.qP.f(var2 - 199 + this.dC().au(), var14 + 36, this.m, this.z);
            if (var14 <= 24 && this.s == 1) {
               if (var2 < 98 && this.qQ == 1) {
                  this.qQ = 0;
                  this.qP.N(this.pp);
               } else if (var2 > 98 && this.qQ == 0) {
                  this.qQ = 1;
                  this.qP.N(this.pp);
               }
            }

            if (this.s == 1 && this.qQ == 0) {
               var10 = this.qP.I(this.pp);
               if (var10 >= 0 && this.A < var6) {
                  if (this.A <= var7) {
                     if ((this.ob[var10] & 4) != 0) {
                        this.ox = com.rsc.b.e.dn;
                        this.pe = this.nZ[var10];
                        this.oe = "";
                        this.od = "";
                     }
                  } else {
                     this.l(this.nZ[var10]);
                  }
               }
            }

            if (this.s == 1 && this.qQ == 1) {
               var10 = this.qP.I(this.pp);
               if (var10 >= 0 && this.A < var6 && this.A > var7) {
                  this.m(this.oa[var10]);
               }
            }

            if (var14 > 166 && this.s == 1 && this.qQ == 0) {
               this.oh = "";
               this.og = "";
               this.ox = com.rsc.b.e.dm;
            }

            if (var14 > 166 && this.s == 1 && this.qQ == 1) {
               this.ox = com.rsc.b.e.do;
               this.og = "";
               this.oh = "";
            }

            this.e(0);
         }
      }

   }

   private void i(boolean var1) {
      int var2 = this.dC().iU - 199;
      byte var3 = 36;
      this.dC().a((com.rsc.a.b.c)this.dC().ae(4), var2 - 49, 3);
      short var4 = 196;
      short var5 = 182;
      int var6;
      int var7 = var6 = com.rsc.g.f.a(160, 160, 160);
      if (this.pZ != 0) {
         var6 = com.rsc.g.f.a(220, 220, 220);
      } else {
         var7 = com.rsc.g.f.a(220, 220, 220);
      }

      this.dC().g(var2, var3, var4 / 2, 24, var7, 128);
      this.dC().g(var4 / 2 + var2, var3, var4 / 2, 24, var6, 128);
      this.dC().g(var2, var3 + 24, var4, 90, com.rsc.g.f.a(220, 220, 220), 128);
      this.dC().g(var2, 114 + var3, var4, var5 - 24 - 90, com.rsc.g.f.a(160, 160, 160), 128);
      this.dC().m(var2, 24 + var3, var4, 0);
      this.dC().n(var2 + var4 / 2, var3, 0, 24);
      this.dC().m(var2, var3 + 113, var4, 0);
      this.dC().c(var4 / 4 + var2, 16 + var3, "Magic", 0, 4, -1);
      this.dC().c(var2 + var4 / 4 + var4 / 2, 16 + var3, "Prayers", 0, 4, -1);
      int var8;
      int var9;
      String var10;
      int var13;
      if (this.pZ == 0) {
         this.qI.G(this.pn);
         var8 = 0;

         int var11;
         Iterator var14;
         Entry var15;
         for(var9 = 0; var9 < com.rsc.a.a.N(); ++var9) {
            var10 = "@yel@";
            var14 = com.rsc.a.a.n(var9).aU().iterator();

            while(var14.hasNext()) {
               var15 = (Entry)var14.next();
               var13 = (Integer)var15.getKey();
               if (!this.F(var13, (Integer)var15.getValue())) {
                  var10 = "@whi@";
                  break;
               }
            }

            var11 = this.nO[6];
            if (com.rsc.a.a.n(var9).aQ() > var11) {
               var10 = "@bla@";
            }

            this.qI.a(this.pn, var8++, var10 + "Level " + com.rsc.a.a.n(var9).aQ() + ": " + com.rsc.a.a.n(var9).ad(), -1, (String)null, (String)null);
         }

         this.qI.bi();
         var9 = this.qI.I(this.pn);
         if (var9 != -1) {
            this.dC().a((String)("Level " + com.rsc.a.a.n(var9).aQ() + ": " + com.rsc.a.a.n(var9).ad()), 2 + var2, var3 + 124, 16776960, 1);
            this.dC().a((String)com.rsc.a.a.n(var9).ar(), 2 + var2, 136 + var3, 16777215, 0);
            int var12 = 0;

            for(var14 = com.rsc.a.a.n(var9).aU().iterator(); var14.hasNext(); ++var12) {
               var15 = (Entry)var14.next();
               var11 = (Integer)var15.getKey();
               this.dC().a(this.dC().ad(var11), 2 + var2 + var12 * 44, var3 + 150);
               var13 = this.aB(var11);
               int var16 = (Integer)var15.getValue();
               String var17 = "@red@";
               if (this.F(var11, var16)) {
                  var17 = "@gre@";
               }

               this.dC().a((String)(var17 + var13 + "/" + var16), 2 + var2 + var12 * 44, var3 + 150, 16777215, 1);
            }
         } else {
            this.dC().a((String)"Point at a spell for a description", var2 + 2, var3 + 124, 0, 1);
         }
      }

      if (this.pZ == 1) {
         this.qI.G(this.pn);
         var8 = 0;

         for(var9 = 0; var9 < com.rsc.a.a.O(); ++var9) {
            var10 = "@whi@";
            if (com.rsc.a.a.o(var9).aQ() > this.nN[5]) {
               var10 = "@bla@";
            }

            if (this.nQ[var9]) {
               var10 = "@gre@";
            }

            this.qI.a(this.pn, var8++, var10 + "Level " + com.rsc.a.a.o(var9).aQ() + ": " + com.rsc.a.a.o(var9).ad(), -1, (String)null, (String)null);
         }

         this.qI.bi();
         var9 = this.qI.I(this.pn);
         if (var9 == -1) {
            this.dC().a((String)"Point at a prayer for a description", var2 + 2, var3 + 124, 0, 1);
         } else {
            this.dC().c(var2 + var4 / 2, var3 + 130, "Level " + com.rsc.a.a.o(var9).aQ() + ": " + com.rsc.a.a.o(var9).ad(), 16776960, 1, -1);
            this.dC().c(var2 + var4 / 2, 145 + var3, com.rsc.a.a.o(var9).ar(), 16777215, 0, -1);
            this.dC().c(var2 + var4 / 2, 160 + var3, "Drain rate: " + com.rsc.a.a.o(var9).aR(), 0, 1, -1);
         }
      }

      if (var1) {
         var2 = 199 - this.dC().iU + this.u();
         var13 = this.w() - 36;
         if (var2 >= 0 && var13 >= 0 && var2 < 196 && var13 < 182) {
            this.qI.f(var2 + (this.dC().iU - 199), var13 + 36, this.m, this.z);
            if (var13 <= 24 && this.s == 1) {
               if (var2 < 98 && this.pZ == 1) {
                  this.pZ = 0;
                  this.ru = this.qI.R(this.pn);
                  this.qI.f(this.pn, this.rv);
               } else if (var2 > 98 && this.pZ == 0) {
                  this.pZ = 1;
                  this.rv = this.qI.R(this.pn);
                  this.qI.f(this.pn, this.ru);
               }
            }

            if (this.s == 1 && this.pZ == 0) {
               var8 = this.qI.I(this.pn);
               if (var8 != -1) {
                  var9 = this.nO[6];
                  if (var9 < com.rsc.a.a.n(var8).aQ()) {
                     this.a(h.mr, (String)null, (String)null, "Your magic ability is not high enough for this spell", 0);
                  } else {
                     int var18 = 0;

                     for(Iterator var19 = com.rsc.a.a.n(var8).aU().iterator(); var19.hasNext(); ++var18) {
                        Entry var20 = (Entry)var19.next();
                        if (!this.F((Integer)var20.getKey(), (Integer)var20.getValue())) {
                           this.a(h.mr, (String)null, (String)null, "You don't have all the reagents you need for this spell", 0);
                           var18 = -1;
                           break;
                        }
                     }

                     if (var18 == com.rsc.a.a.n(var8).aT()) {
                        this.qU = var8;
                        this.rB = var8;
                        this.qT = -1;
                        if (com.rsc.a.a.n(var8).aS() == 3 && var8 != 16 && c.A()) {
                           this.rf = 1;
                        }
                     }
                  }
               }
            }

            if (this.s == 1 && this.pZ == 1) {
               var8 = this.qI.I(this.pn);
               if (var8 != -1) {
                  var9 = this.nN[5];
                  if (var9 < com.rsc.a.a.o(var8).aQ()) {
                     this.a(h.mr, (String)null, (String)null, "Your prayer ability is not high enough for this prayer", 0);
                  } else if (this.nO[5] == 0) {
                     this.a(h.mr, (String)null, (String)null, "You have run out of prayer points. Return to a church to recharge", 0);
                  } else if (!this.nQ[var8]) {
                     this.n().aO(60);
                     this.n().aK(var8);
                     this.n().dX();
                     this.nQ[var8] = true;
                     this.k("prayeron");
                  } else {
                     this.n().aO(254);
                     this.n().aK(var8);
                     this.n().dX();
                     this.nQ[var8] = false;
                     this.k("prayeroff");
                  }
               }
            }

            this.s = 0;
         }
      }

   }

   private void j(boolean var1) {
      int var2 = this.dC().iU - 199;
      byte var3 = 36;
      short var4 = 156;
      short var5 = 152;
      this.dC().a((com.rsc.a.b.c)this.dC().ae(2), var2 - 49, 3);
      var2 += 40;
      this.dC().e(var2, var3, var4, var5, 0);
      this.dC().o(var2, var4 + var2, var3 + var5, 36);
      short var6 = 192;
      int var7 = 255 & this.O.e();
      int var8 = var6 * (this.oG.ch() - 6040) * 3 / 2048;
      int var9 = var6 * (this.oG.ci() - 6040) * 3 / 2048;
      int var10 = 1023 & 1024 - var7 * 4;
      int var11 = i.hR[var10];
      int var12 = i.hS[var10];
      int var13 = var8 * var12 + var11 * var9 >> 18;
      int var14 = var9 * var12 - var8 * var11 >> 18;
      this.dC().a((com.rsc.a.b.c)this.N.jO, var3 - (-(var5 / 2) - var14), var4 / 2 + var2 - var13, var6, 255 & 64 + var7);

      int var15;
      int var17;
      int var18;
      int var19;
      int var20;
      for(var15 = 0; var15 < this.px; ++var15) {
         com.rsc.e.e var16 = this.oI[var15];
         var17 = var6 * (64 + (128 * var16.cg() - this.oG.ci())) * 3 / 2048;
         var18 = (128 * var16.cf() - (this.oG.ch() - 64)) * var6 * 3 / 2048;
         var19 = var12 * var18 + var17 * var11 >> 18;
         var20 = var12 * var17 - var11 * var18 >> 18;
         this.v(65535, var19 + var2 + var4 / 2, var3 - var20 + var5 / 2);
      }

      for(var15 = 0; var15 < this.py; ++var15) {
         com.rsc.e.f var24 = this.oK[var15];
         var17 = var6 * (64 + var24.cf() * 128 - this.oG.ch()) * 3 / 2048;
         var18 = var6 * 3 * (64 + 128 * var24.cg() - this.oG.ci()) / 2048;
         var19 = var12 * var17 + var11 * var18 >> 18;
         var20 = var12 * var18 - var17 * var11 >> 18;
         this.v(16711680, var2 - (-(var4 / 2) - var19), var5 / 2 + var3 - var20);
      }

      for(var15 = 0; this.qA > var15; ++var15) {
         j var25 = this.no[var15];
         var17 = var6 * 3 * (var25.ci() - this.oG.ci()) / 2048;
         var18 = var6 * 3 * (var25.ch() - this.oG.ch()) / 2048;
         var19 = var17 * var11 + var18 * var12 >> 18;
         var20 = var12 * var17 - var18 * var11 >> 18;
         this.v(16776960, var4 / 2 + var2 + var19, var5 / 2 - var20 + var3);
      }

      for(var15 = 0; this.qR > var15; ++var15) {
         k var26 = this.nr[var15];
         var17 = var6 * 3 * (var26.ch() - this.oG.ch()) / 2048;
         var18 = var6 * 3 * (var26.ci() - this.oG.ci()) / 2048;
         var19 = var17 * var12 + var11 * var18 >> 18;
         var20 = var12 * var18 - var17 * var11 >> 18;
         int var21 = 16777215;
         String var22 = com.rsc.g.l.a(var26.na);
         if (null != var22) {
            for(int var23 = 0; var23 < this.rD; ++var23) {
               if (var22.equals(com.rsc.g.l.a(this.nZ[var23])) && this.ob[var23] != 0) {
                  var21 = 65280;
                  break;
               }
            }
         }

         this.v(var21, var19 + var2 + var4 / 2, var3 - var20 + var5 / 2);
      }

      this.dC().g(var2 + var4 / 2, var5 / 2 + var3, 2, 16777215, 255);
      this.dC().a((com.rsc.a.b.c)this.dC().ae(22), 55, var2 + 19, 128, 255 & this.O.e() + 128);
      this.dC().o(0, this.au(), this.av() + 12, 0);
      if (var1) {
         var2 = 199 - this.dC().iU + this.u();
         var15 = this.w() - var3;
         if (var2 >= 40 && var15 >= 0 && var2 < 196 && var15 < 152) {
            var2 = this.dC().iU - 199;
            var2 += 40;
            var9 = (this.w() - var5 / 2 - var3) * 16384 / (var6 * 3);
            var8 = (this.u() + (-(var4 / 2) - var2)) * 16384 / (var6 * 3);
            var11 = i.hR[var10];
            var12 = i.hS[var10];
            int var27 = var9 * var11 + var12 * var8 >> 15;
            var9 = var12 * var9 - var11 * var8 >> 15;
            var8 = var27 + this.oG.ch();
            var9 = this.oG.ci() - var9;
            if (this.s == 1) {
               this.b(this.oy, this.oz, var8 / 128, var9 / 128, false);
            }

            this.s = 0;
         }
      }

   }

   private void k(boolean var1) {
      int var2 = this.dC().iU - 199;
      this.dC().a((com.rsc.a.b.c)this.dC().ae(6), var2 - 49, 3);
      byte var3 = 57;
      byte var4 = 21;
      short var5 = 196;
      short var6 = 255;
      if (var2 < this.A && this.A < var2 + var5 && 36 < this.B && this.B < 56) {
         var6 = 198;
         if (this.s == 1) {
            this.rx.bE();
         }
      }

      this.dC().g(var2 - 1, 36, var5 + 1, 20, com.rsc.g.f.a(13, 0, 130), var6);
      this.dC().a("Settings - " + (c.A() ? "tap " : "click ") + "here", var5 / 2 + var2, var3 - 7, var5 + 1, 1, 16777215, false);
      this.dC().m(var2 - 1, 56, var5 + 1, com.rsc.g.f.a(0, 1, 1));
      this.dC().g(var2, 36 + var4, var5, 65, com.rsc.g.f.a(181, 181, 181), 160);
      this.dC().g(var2, 101 + var4, var5, 65, com.rsc.g.f.a(201, 201, 201), 160);
      this.dC().g(var2, 166 + var4, var5, 95, com.rsc.g.f.a(181, 181, 181), 160);
      this.dC().g(var2, 261 + var4, var5, this.pF ? 55 : 40, com.rsc.g.f.a(201, 201, 201), 160);
      int var7 = 3 + var2;
      int var8 = var3 + 15;
      this.dC().a((String)"Game options - click to toggle", var7, var8, 0, 1);
      var8 += 15;
      if (this.rI) {
         this.dC().a((String)"Camera angle mode - @gre@Auto", var7, var8, 16777215, 1);
      } else {
         this.dC().a((String)"Camera angle mode - @red@Manual", var7, var8, 16777215, 1);
      }

      var8 += 15;
      if (this.rG) {
         this.dC().a((String)"Mouse buttons - @red@One", var7, var8, 16777215, 1);
      } else {
         this.dC().a((String)"Mouse buttons - @gre@Two", var7, var8, 16777215, 1);
      }

      var8 += 15;
      if (this.oA) {
         if (this.rH) {
            this.dC().a((String)"Sound effects - @red@off", var7, var8, 16777215, 1);
         } else {
            this.dC().a((String)"Sound effects - @gre@on", var7, var8, 16777215, 1);
         }
      }

      var8 += 15;
      this.dC().a((String)"To change your contact details,", var7, var8, 16777215, 0);
      var8 += 15;
      this.dC().a((String)"password, recovery questions, etc..", var7, var8, 16777215, 0);
      var8 += 15;
      this.dC().a((String)"please select 'account management'", var7, var8, 16777215, 0);
      var8 += 15;
      this.dC().a((String)"from runescapeclassic.org front page", var7, var8, 16777215, 0);
      var8 += 15;
      var8 += 5;
      this.dC().a((String)"Privacy settings. Will be applied to", 3 + var2, var8, 0, 1);
      var8 += 15;
      this.dC().a((String)"all people not on your friends list", var2 + 3, var8, 0, 1);
      var8 += 15;
      if (this.rJ != 0) {
         this.dC().a((String)"Block chat messages: @gre@<on>", 3 + var2, var8, 16777215, 1);
      } else {
         this.dC().a((String)"Block chat messages: @red@<off>", 3 + var2, var8, 16777215, 1);
      }

      var8 += 15;
      if (this.rL == 0) {
         this.dC().a((String)"Block private messages: @red@<off>", 3 + var2, var8, 16777215, 1);
      } else {
         this.dC().a((String)"Block private messages: @gre@<on>", var2 + 3, var8, 16777215, 1);
      }

      var8 += 15;
      if (this.rM != 0) {
         this.dC().a((String)"Block trade requests: @gre@<on>", var2 + 3, var8, 16777215, 1);
      } else {
         this.dC().a((String)"Block trade requests: @red@<off>", 3 + var2, var8, 16777215, 1);
      }

      var8 += 15;
      if (this.oA) {
         if (this.rK != 0) {
            this.dC().a((String)"Block duel requests: @gre@<on>", var2 + 3, var8, 16777215, 1);
         } else {
            this.dC().a((String)"Block duel requests: @red@<off>", 3 + var2, var8, 16777215, 1);
         }
      }

      var8 += 15;
      int var9;
      if (this.pF) {
         var9 = 16777215;
         var8 += 5;
         if (var7 < this.A && this.A < var7 + var5 && var8 - 12 < this.B && this.B < 4 + var8) {
            var9 = 16776960;
         }

         this.dC().a((String)"Skip the tutorial", var7, var8, var9, 1);
         var8 += 15;
      }

      var8 += 5;
      this.dC().a((String)"Always logout when you finish", var7, var8, 0, 1);
      var9 = 16777215;
      var8 += 15;
      if (var7 < this.A && var7 + var5 > this.A && var8 - 12 < this.B && this.B < 4 + var8) {
         var9 = 16776960;
      }

      this.dC().a((String)"Click here to logout", var2 + 3, var8, var9, 1);
      if (var1) {
         var2 = 199 - this.dC().iU + this.u();
         int var10 = this.B - 56;
         if (var2 >= 0 && var10 >= 0 && var2 < 196 && var10 < 265) {
            int var11 = this.dC().au() - 199;
            var7 = var11 + 3;
            byte var12 = 57;
            var5 = 196;
            var8 = 30 + var12;
            if (this.A > var7 && var7 + var5 > this.A && this.B > var8 - 12 && var8 + 4 > this.B && this.s == 1) {
               this.rI = !this.rI;
               this.T.aO(111);
               this.T.aK(4);
               this.T.aK(this.rI ? 1 : 0);
               this.T.dX();
            }

            var8 += 15;
            if (this.A > var7 && var7 + var5 > this.A && var8 - 12 < this.B && 4 + var8 > this.B && this.s == 1) {
               this.rG = !this.rG;
               this.T.aO(111);
               this.T.aK(5);
               this.T.aK(this.rG ? 1 : 0);
               this.T.dX();
            }

            var8 += 15;
            if (this.oA && this.A > var7 && var7 + var5 > this.A && var8 - 12 < this.B && var8 + 4 > this.B && this.s == 1) {
               this.rH = !this.rH;
               this.T.aO(111);
               this.T.aK(6);
               this.T.aK(this.rH ? 1 : 0);
               this.T.dX();
            }

            var8 += 15;
            var8 += 15;
            var8 += 15;
            var8 += 15;
            var8 += 15;
            var8 += 35;
            boolean var13 = false;
            if (this.A > var7 && this.A < var5 + var7 && this.B > var8 - 12 && 4 + var8 > this.B && this.s == 1) {
               this.rJ = 1 - this.rJ;
               this.T.aO(111);
               this.T.aK(0);
               this.T.aK(this.rJ);
               this.T.dX();
            }

            var8 += 15;
            if (this.A > var7 && var5 + var7 > this.A && this.B > var8 - 12 && var8 + 4 > this.B && this.s == 1) {
               this.rL = 1 - this.rL;
               this.T.aO(111);
               this.T.aK(1);
               this.T.aK(this.rL);
               this.T.dX();
            }

            var8 += 15;
            if (this.A > var7 && this.A < var7 + var5 && var8 - 12 < this.B && this.B < 4 + var8 && this.s == 1) {
               this.rM = 1 - this.rM;
               this.T.aO(111);
               this.T.aK(2);
               this.T.aK(this.rM);
               this.T.dX();
            }

            var8 += 15;
            if (this.oA && this.A > var7 && this.A < var7 + var5 && var8 - 12 < this.B && this.B < var8 + 4 && this.s == 1) {
               this.rK = 1 - this.rK;
               this.T.aO(111);
               this.T.aK(3);
               this.T.aK(this.rK);
               this.T.dX();
            }

            var8 += 15;
            if (this.pF) {
               var8 += 5;
               if (this.A > var7 && var5 + var7 > this.A && var8 - 12 < this.B && this.B < var8 + 4 && this.s == 1) {
                  this.a(new String[]{"Are you sure you wish to skip the tutorial", "and teleport to Lumbridge?"}, com.rsc.b.b.cE, false);
                  this.rf = 0;
               }

               var8 += 15;
            }

            var8 += 20;
            if (this.A > var7 && var5 + var7 > this.A && this.B > var8 - 12 && this.B < var8 + 4 && this.s == 1) {
               this.dz();
            }

            this.s = 0;
         }
      }

   }

   private void l(boolean var1) {
      int var2 = this.dC().iU - 199;
      byte var3 = 36;
      this.dC().a((com.rsc.a.b.c)this.dC().ae(3), var2 - 49, 3);
      short var4 = 196;
      short var5 = 275;
      int var6;
      int var7 = var6 = com.rsc.g.f.a(160, 160, 160);
      if (this.rn != 0) {
         var6 = com.rsc.g.f.a(220, 220, 220);
      } else {
         var7 = com.rsc.g.f.a(220, 220, 220);
      }

      this.dC().g(var2, var3, var4 / 2, 24, var7, 128);
      this.dC().g(var2 + var4 / 2, var3, var4 / 2, 24, var6, 128);
      this.dC().g(var2, 24 + var3, var4, var5 - 24, com.rsc.g.f.a(220, 220, 220), 128);
      this.dC().m(var2, var3 + 24, var4, 0);
      this.dC().n(var2 + var4 / 2, var3, 0, 24);
      this.dC().a(var4 / 4 + var2, "Stats", 0, -1, 4, var3 + 16);
      this.dC().a(var2 + var4 / 4 + var4 / 2, "Quests", 0, -1, 4, var3 + 16);
      int var8;
      byte var9;
      if (this.rn == 0) {
         var9 = 72;
         this.dC().a((String)"Skills", var2 + 5, var9, 16776960, 3);
         int var10 = -1;
         var8 = var9 + 13;

         int var11;
         int var12;
         for(var11 = 0; var11 < 9; ++var11) {
            var12 = 16777215;
            if (this.A > 3 + var2 && var8 - 11 <= this.B && 2 + var8 > this.B && 90 + var2 > this.A) {
               var12 = 16711680;
               var10 = var11;
            }

            this.dC().a((String)(cE()[var11] + ":@yel@" + this.nO[var11] + "/" + this.nN[var11]), var2 + 5, var8, var12, 1);
            var12 = 16777215;
            if (this.A >= var2 + 90 && this.B >= var8 - 11 - 13 && var8 - 13 + 2 > this.B && this.A < var2 + 196) {
               var12 = 16711680;
               var10 = 9 + var11;
            }

            this.dC().a((String)(cE()[9 + var11] + ":@yel@" + this.nO[9 + var11] + "/" + this.nN[9 + var11]), var4 / 2 - 5 + var2, var8 - 13, var12, 1);
            var8 += 13;
         }

         this.dC().a((String)("Quest Points:@yel@" + this.pY), var2 - 5 + var4 / 2, var8 - 13, 16777215, 1);
         var8 += 12;
         this.dC().a((String)("Fatigue: @yel@" + this.rj * 100 / 750 + "%"), 5 + var2, var8 - 13, 16777215, 1);
         var8 += 8;
         this.dC().a((String)"Equipment Status", 5 + var2, var8, 16776960, 3);
         var8 += 12;

         for(var11 = 0; var11 < 3; ++var11) {
            this.dC().a((String)(this.nC[var11] + ":@yel@" + this.nP[var11]), 5 + var2, var8, 16777215, 1);
            if (2 > var11) {
               this.dC().a((String)(this.nC[var11 + 3] + ":@yel@" + this.nP[3 + var11]), var4 / 2 + var2 + 25, var8, 16777215, 1);
            }

            var8 += 13;
         }

         var8 += 6;
         this.dC().m(var2, var8 - 15, var4, 0);
         if (var10 == -1) {
            this.dC().a((String)"Overall levels", var2 + 5, var8, 16776960, 1);
            var8 += 12;
            var11 = 0;

            for(var12 = 0; var12 < 18; ++var12) {
               var11 += this.nN[var12];
            }

            this.dC().a((String)("Skill total: " + var11), 5 + var2, var8, 16777215, 1);
            var8 += 12;
            this.dC().a((String)("Combat level: " + this.oG.mQ), 5 + var2, var8, 16777215, 1);
         } else {
            this.dC().a((String)(this.nW[var10] + " skill"), 5 + var2, var8, 16776960, 1);
            var8 += 12;
            var11 = this.nD[0];

            for(var12 = 0; var12 < 98; ++var12) {
               if (this.nD[var12] <= this.nL[var10]) {
                  var11 = this.nD[var12 + 1];
               }
            }

            this.dC().a((String)("Total xp: " + this.nL[var10]), 5 + var2, var8, 16777215, 1);
            var8 += 12;
            this.dC().a((String)("Next level at: " + var11), 5 + var2, var8, 16777215, 1);
         }
      }

      int var13;
      if (this.rn == 1) {
         this.qO.G(this.po);
         var9 = 0;
         var13 = var9 + 1;
         this.qO.a(this.po, var9, "@whi@Quest-list (green=completed)", -1, (String)null, (String)null);

         for(var8 = 0; var8 < this.nR.length - 1; ++var8) {
            if (this.nR[var8] != null) {
               this.qO.a(this.po, var13++, (this.nS[var8] == 0 ? "@red@" : (this.nS[var8] > 0 ? "@yel@" : "@gre@")) + this.nR[var8], 0, (String)null, (String)null);
            }
         }

         this.qO.bi();
      }

      if (var1) {
         var13 = this.B - 36;
         var2 = -this.dC().au() - (-199 - this.A);
         if (var2 >= 0 && var13 >= 0 && var2 < var4 && var13 < var5) {
            if (this.rn == 1) {
               this.qO.f(var2 + this.dC().au() - 199, 36 + var13, this.m, this.z);
            }

            if (var13 <= 24 && this.s == 1) {
               if (var2 >= 98) {
                  this.rn = 1;
               } else {
                  this.rn = 0;
               }
            }
         }
      }

   }

   private void a(int var1, String var2, String var3, String var4, int var5) {
      if (this.qN.fh[var1] - 4 != this.qN.fi[var1]) {
         this.qN.a(var2, false, var5, var4, var3, var1);
      } else {
         this.qN.a(var2, true, var5, var4, var3, var1);
      }

   }

   public void m(boolean var1) {
      this.rC = var1;
      this.o = -1;
      this.p = -1;
      if (this.rC) {
         this.o = this.A;
         this.p = this.B;
      }

   }

   public void di() {
      this.r = this.A;
      this.q = this.B;
      int var1 = this.o - this.r;
      int var10000 = this.p - this.q;
      this.o = this.r;
      this.p = this.q;
      this.O.c(this.O.e() - var1 & 255);
   }

   public boolean E(int var1, int var2) {
      this.aC = var1;
      this.aD = var2;
      this.oE = this.aC;
      this.oF = this.aD;
      return false;
   }

   public boolean dj() {
      return this.oE > -1 && this.oF > -1;
   }

   public void dk() {
      this.br = this.oE;
      this.bs = this.oF - 12;
      this.dC().l(this.br, this.bs + 12);
      this.dC().o(0, this.au(), this.av() + 12, 0);
      i var10000 = this.L;
      int var10001 = this.au() / 2;
      int var10002 = this.au() / 2;
      int var10003 = this.au();
      int var10004 = this.av() / 2;
      int var10005 = this.av() / 2;
      this.getClass();
      var10000.d(var10001, var10002, var10003, var10004, var10005, 9);
      int var1 = this.dC().iU - 199;
      byte var2 = 36;
      this.qI.b(this.pn, var1, 24 + var2, 196, 90);
      this.qP.b(this.pp, var1, var2 + 40, 196, 126);
      this.qO.b(this.po, var1, 24 + var2, 196, 251);
      this.qN.b(this.qJ, 5, this.av() - 65, this.au() - 10, 56);
      this.qN.b(this.qK, 7, this.av() - 10, this.au() - 14, 14);
      this.qN.b(this.qM, 5, this.av() - 65, this.au() - 10, 56);
      this.qN.b(this.qL, 5, this.av() - 65, this.au() - 10, 56);
      this.oE = this.oF = -1;
   }

   public final int aB(int var1) {
      int var2 = 0;

      for(int var3 = 0; this.pG > var3; ++var3) {
         if (this.nm[var3] == var1) {
            if (com.rsc.a.a.l(this.nm[var3]).aA()) {
               var2 += this.nn[var3];
            } else {
               ++var2;
            }
         }
      }

      return var2;
   }

   private j aC(int var1) {
      for(int var2 = 0; var2 < this.qA; ++var2) {
         if (var1 == this.no[var2].ce()) {
            return this.no[var2];
         }
      }

      return null;
   }

   private k aD(int var1) {
      for(int var2 = 0; this.qR > var2; ++var2) {
         if (var1 == this.nr[var2].ce()) {
            return this.nr[var2];
         }
      }

      return null;
   }

   private void dl() {
      this.qF.f(this.u(), this.B, this.m, this.z);
      if (this.qF.L(this.ph)) {
         do {
            this.oZ = (com.rsc.a.a.M() + (this.oZ - 1)) % com.rsc.a.a.M();
         } while((3 & com.rsc.a.a.m(this.oZ).af()) != 1);
      }

      if (this.qF.L(this.pi)) {
         do {
            this.oZ = (1 + this.oZ) % com.rsc.a.a.M();
         } while(1 != (3 & com.rsc.a.a.m(this.oZ).af()));
      }

      if (this.qF.L(this.qb)) {
         this.bG = (this.dE().length + (this.bG - 1)) % this.dE().length;
      }

      if (this.qF.L(this.pT)) {
         this.bG = (1 + this.bG) % this.dE().length;
      }

      if (this.qF.L(this.pW) || this.qF.L(this.qf)) {
         for(this.oY = 3 - this.oY; (3 & com.rsc.a.a.m(this.oZ).af()) != 1; this.oZ = (1 + this.oZ) % com.rsc.a.a.M()) {
         }

         while((3 & com.rsc.a.a.m(this.pS).af()) != 2 || (this.oY * 4 & com.rsc.a.a.m(this.pS).af()) == 0) {
            this.pS = (this.pS + 1) % com.rsc.a.a.M();
         }
      }

      if (this.qF.L(this.qk)) {
         this.bH = (this.bH - 1 + this.dF().length) % this.dF().length;
      }

      if (this.qF.L(this.pV)) {
         this.bH = (this.bH + 1) % this.dF().length;
      }

      if (this.qF.L(this.qp)) {
         this.bJ = (this.dG().length + (this.bJ - 1)) % this.dG().length;
      }

      if (this.qF.L(this.qd)) {
         this.bJ = (1 + this.bJ) % this.dG().length;
      }

      if (this.qF.L(this.qh)) {
         this.qc = (this.dF().length + this.qc - 1) % this.dF().length;
      }

      if (this.qF.L(this.pP)) {
         this.qc = (1 + this.qc) % this.dF().length;
      }

      if (this.qF.L(this.pU)) {
         this.n().aO(235);
         this.n().aK(this.oY);
         this.n().aK(this.oZ);
         this.n().aK(this.pS);
         com.rsc.f.e var10000 = this.n();
         this.getClass();
         var10000.aK(2);
         this.n().aK(this.bG);
         this.n().aK(this.bH);
         this.n().aK(this.qc);
         this.n().aK(this.bJ);
         this.n().dX();
         this.dC().c(true);
         this.ra = false;
      }

   }

   private void dm() {
      if (this.rk > 1) {
         --this.rk;
      }

      int var1;
      for(var1 = 0; var1 < 100; ++var1) {
         g var2 = this.oH[var1];
         if (var2 != null && var2.cr() > 0) {
            var2.cp();
         }
      }

      if (this.pN > 0) {
         --this.pN;
      }

      if (this.oG.cl() == 8 || this.oG.cl() == 9) {
         this.mF = 500;
      }

      if (this.mF > 0) {
         --this.mF;
      }

      if (this.ra) {
         this.dl();
      } else {
         if (this.pv > 0) {
            --this.pv;
            if (this.pv == 0) {
               this.a(h.mr, (String)null, (String)null, "You have been granted another life. Be more careful this time!", 0);
            }

            if (this.pv == 0) {
               this.a(h.mr, (String)null, (String)null, "You retain your skills. Your objects land where you died", 0);
            }
         }

         for(var1 = 0; var1 < this.qR; ++var1) {
            this.nr[var1].cz();
         }

         for(var1 = 0; var1 < this.qA; ++var1) {
            this.no[var1].cz();
         }

         this.O.a();
         this.dp();
         this.dq();
         this.qN.f(this.u(), this.B, this.m, this.z);
         if (this.qv != com.rsc.b.c.cH && this.u() >= this.au() - 18 && this.B >= this.av() - 66) {
            this.z = 0;
         }

         this.dn();
         if (this.pv != 0) {
            this.z = 0;
         }

         this.do();
         if (this.z == 1) {
            this.s = 1;
         } else if (this.z == 2) {
            this.s = 2;
         }

         this.L.m(0, this.u(), this.B);
         this.z = 0;
         if (this.on) {
            ++nl;
            if (nl >= nj.size()) {
               nl = nj.size() - 1;
               this.on = false;
               return;
            }

            this.qN.a(this.qK, (String)nj.get(nl));
            this.on = false;
         } else if (this.oo) {
            --nl;
            if (nl < 0) {
               nl = 0;
               this.oo = false;
               return;
            }

            this.qN.a(this.qK, (String)nj.get(nl));
            this.oo = false;
         }

         if (this.v > 0) {
            --this.v;
         } else if (this.v < 0) {
            ++this.v;
         }

         this.L.Y(17);
         ++this.qB;
         if (this.qB > 5) {
            this.qB = 0;
            this.qE = (1 + this.qE) % 4;
            this.qD = (1 + this.qD) % 3;
            this.qC = (1 + this.qC) % 5;
         }

         for(var1 = 0; var1 < this.rm; ++var1) {
            l var4 = this.nx[var1];
            var4.au(var4.cB() + 1);
            if (var4.cB() > 50) {
               --this.rm;

               for(int var3 = var1; var3 < this.rm; ++var3) {
                  this.nx[var3] = this.nx[var3 + 1];
               }
            }
         }

      }
   }

   private void dn() {
      if (this.qN.L(this.qK)) {
         String var1 = this.qN.J(this.qK);
         this.qN.a(this.qK, "");
         if (nj.size() != 0 && ((String)nj.get(nj.size() - 1)).equalsIgnoreCase(var1)) {
            if (((String)nj.get(nj.size() - 1)).equalsIgnoreCase(var1)) {
               nl = nj.size();
            }
         } else {
            nj.add(var1);
            nl = nj.size();
         }

         if (var1.startsWith("::")) {
            this.j(var1.substring(2));
         } else {
            this.n(var1);
         }
      }

   }

   private void j(String var1) {
      String[] var2 = var1.split(" ");
      if (this.oq) {
         if (var1.equals("cnoclip")) {
            com.rsc.c.m.jX = !com.rsc.c.m.jX;
            this.a(h.mr, (String)null, (String)null, "No clip " + (com.rsc.c.m.jX ? "enabled" : "disabled") + ".", "", 0);
            return;
         }

         if (var1.equalsIgnoreCase("dev")) {
            this.qX = !this.qX;
            return;
         }

         if (var1.startsWith("n ") && this.oq) {
            this.qY = this.g(var2[1]);
            return;
         }
      }

      if ((this.oO || this.oq) && var1.equalsIgnoreCase("mod")) {
         this.qZ = !this.qZ;
      }

      this.o(var1);
   }

   private void do() {
      if (!this.oL.lT && !this.oM.kY && !this.dI()) {
         this.t = 0;
         this.n = 0;
      } else {
         if (-1 == ~this.m) {
            this.t = 0;
         } else {
            ++this.t;
         }

         if (!c.A()) {
            if (this.t <= 600) {
               if (this.t > 450) {
                  this.n += 500;
               } else if (this.t > 300) {
                  this.n += 50;
               } else if (this.t <= 150) {
                  if (this.t <= 50) {
                     if (this.t > 20 && (this.t & 5) == 0) {
                        ++this.n;
                     }
                  } else {
                     ++this.n;
                  }
               } else {
                  this.n += 5;
               }
            } else {
               this.n += 5000;
            }
         }
      }

   }

   private void dp() {
      if (this.pH) {
         if (this.oh.length() > 0) {
            this.n().aO(45);
            this.n().aK(0);
            this.n().p(this.oh);
            this.n().dX();
            this.og = "";
            this.oh = "";
            this.rh = "Please wait...";
         } else if (this.z == 1 && this.B > 275 - (c.A() ? 110 : 0) && this.B < 310 - (c.A() ? 110 : 0) && this.u() > 56 && this.u() < 456) {
            this.n().aO(45);
            this.n().aK(0);
            this.n().p("-null-");
            this.n().dX();
            this.rh = "Please wait...";
            this.oh = "";
            this.og = "";
         }

         this.z = 0;
      }

   }

   private void dq() {
      if (this.B > this.av() - 4) {
         if (this.A > 15 + (this.au() / 2 - 256) && this.A < 96 + (this.au() / 2 - 256) && this.z == 1) {
            this.qv = com.rsc.b.c.cH;
         }

         if (this.A > 110 + (this.au() / 2 - 256) && this.A < 194 + (this.au() / 2 - 256) && this.z == 1) {
            this.qv = com.rsc.b.c.cI;
            this.qN.fi[this.qJ] = 999999;
         }

         if (this.A > 215 + (this.au() / 2 - 256) && this.A < 295 + (this.au() / 2 - 256) && this.z == 1) {
            this.qv = com.rsc.b.c.cJ;
            this.qN.fi[this.qM] = 999999;
         }

         if (this.A > 315 + (this.au() / 2 - 256) && this.A < 395 + (this.au() / 2 - 256) && this.z == 1) {
            this.qv = com.rsc.b.c.cK;
            this.qN.fi[this.qL] = 999999;
         }

         if (this.A > 417 + (this.au() / 2 - 256) && this.A < 497 + (this.au() / 2 - 256) && this.z == 1) {
            this.oh = "";
            this.nV = 1;
            this.og = "";
         }

         this.m = 0;
         this.z = 0;
      }

   }

   public final void aE(int var1) {
      if (this.pu == f.rQ) {
         if (this.ql == 0 && this.qH != null) {
            this.qH.M(var1);
         }

         if (this.ql == 2 && null != this.qG) {
            this.qG.M(var1);
         }
      }

      if (this.pu == f.rR) {
         if (this.ra) {
            this.qF.M(var1);
            return;
         }

         if (this.ry.ki.P(this.ry.kl)) {
            this.ry.af(var1);
            return;
         }

         if (this.re && c.A()) {
            try {
               int var2 = Integer.parseInt("" + (char)var1) - 1;
               if (var2 >= 0 && var2 < this.nG) {
                  this.T.aO(116);
                  this.T.aK(var2);
                  this.T.dX();
                  this.e(0);
                  this.re = false;
                  return;
               }
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }

         if (this.ox == com.rsc.b.e.dl && this.nV == 0 && !this.pH && this.pz == com.rsc.b.b.cv) {
            this.qN.M(var1);
         }
      }

   }

   private void dr() {
      if (this.qn > 0) {
         --this.qn;
      }

      switch(this.ql) {
      case 0:
         this.qH.f(this.u(), this.B, this.m, this.z);
         if (this.qH.L(this.qa)) {
            this.ql = 2;
            this.qG.a(this.pk, "");
            this.qG.a(this.pl, c.A() ? "To open keyboard press the back button" : "Please enter your username and password");
            this.qG.L(this.pj);
            this.qG.L(this.pQ);
            this.qG.L(this.pm);
            this.qG.O(this.pm);
            return;
         }
         break;
      case 2:
         this.qG.f(this.u(), this.B, this.m, this.z);
         if (this.qG.L(this.qm)) {
            this.ql = 0;
         }

         if (this.qG.L(this.pm)) {
            this.qG.O(this.pj);
         }

         boolean var1 = this.qG.L(this.pj);
         boolean var2 = this.qG.L(this.pQ);
         if (var1 || var2) {
            this.pa = 2;
            this.na = this.qG.J(this.pm);
            this.rF = this.qG.J(this.pj);
            this.f(false);
         }
      }

   }

   private void aF(int var1) {
      // $FF: Couldn't be decompiled
   }

   protected void a(com.rsc.f.a var1, int var2, int var3) {
      if (var2 == 134) {
         byte var14 = var1.dN();
         switch(var14) {
         case 0:
            byte var15 = var1.dN();
            if (var15 == 0) {
               this.rz.bE();
            } else if (var15 == 1) {
               this.rz.bG();
            }
         default:
         }
      } else {
         int var6;
         String var11;
         String var13;
         if (var2 == 135) {
            var11 = var1.dM();
            var13 = var1.dM();
            var6 = var1.dS();
            this.rA.a(new com.rsc.d.a.a.a(var13, var11, var6));
         } else {
            int var4;
            if (var2 == 131) {
               var4 = var1.dO();
               h var5 = h.ar(var1.dO());
               var6 = var1.dO();
               String var7 = var1.dM();
               String var8 = null;
               String var9 = null;
               String var10 = null;
               if (var6 > 1) {
                  var8 = var1.dM();
                  var9 = var1.dM();
                  var10 = var1.dM();
               } else if ((var6 & 1) != 0) {
                  var8 = var1.dM();
               }

               this.a(var5, var8, var10, var7, var9, var4);
            } else if (var2 == 4) {
               this.a(true);
            } else if (var2 == 183) {
               this.cH();
            } else if (var2 == 165) {
               this.a(false);
            } else {
               int var12;
               if (var2 == 149) {
                  var11 = com.rsc.g.l.c(var1.dT());
                  var12 = var1.dO();

                  for(var6 = 0; var6 < this.rD; ++var6) {
                     if (this.nZ[var6].equals(var11)) {
                        if (this.ob[var6] == 0 && var12 != 0) {
                           this.a(h.mw, (String)null, (String)null, var11 + " has logged in", 0);
                        }

                        if (this.ob[var6] != 0 && var12 == 0) {
                           this.a(h.mw, (String)null, (String)null, var11 + " has logged out", 0);
                        }

                        this.ob[var6] = var12;
                        this.dA();
                        return;
                     }
                  }

                  if (var11.length() > 0) {
                     this.nZ[this.rD] = var11;
                     this.ob[this.rD] = var12;
                     ++this.rD;
                     this.dA();
                  }
               } else if (var2 == 109) {
                  this.rE = var1.dO();

                  for(var4 = 0; var4 < this.rE; ++var4) {
                     this.oa[var4] = com.rsc.g.l.c(var1.dT());
                  }
               } else if (var2 == 120) {
                  var11 = var1.dM();
                  var12 = var1.dO();
                  String var16 = com.rsc.g.k.a(var1);
                  this.a(h.ms, var11, (String)null, var16, var12);
               } else if (var2 == 87) {
                  var11 = var1.dM();
                  var13 = com.rsc.g.k.a(var1);
                  this.a(h.mt, var11, (String)null, var13, 0);
               } else {
                  this.b(var1, var2, var3);
               }
            }

         }
      }
   }

   private void b(com.rsc.f.a var1, int var2, int var3) {
      try {
         int var6;
         int var7;
         int var9;
         int var11;
         int var12;
         int var18;
         int var21;
         boolean var29;
         int var31;
         if (var2 == 191) {
            this.pI = this.qR;
            if (this.pI >= 0) {
               System.arraycopy(this.nr, 0, this.ns, 0, this.pI);
            }

            var1.dK();
            this.oy = var1.aJ(11);
            this.oz = var1.aJ(13);
            var18 = var1.aJ(4);
            var29 = this.G(this.oy, this.oz);
            this.oy -= this.ov;
            this.oz -= this.ow;
            var6 = 64 + this.oy * 128;
            var7 = 64 + this.oz * 128;
            if (var29) {
               this.oG.cx();
               this.oG.C(var6, var7);
               this.oG.u(0, var6, var7);
            }

            this.qR = 0;
            this.oG = this.v(this.qo, var6, var7, var18);
            var21 = var1.aJ(8);

            int var13;
            int var14;
            for(var9 = 0; var21 > var9; ++var9) {
               k var41 = this.ns[var9 + 1];
               var11 = var1.aJ(1);
               if (var11 == 1) {
                  var12 = var1.aJ(1);
                  if (var12 == 0) {
                     var13 = var1.aJ(3);
                     var14 = var41.mV;
                     int var15 = var41.mW[var14];
                     int var16 = var41.mX[var14];
                     if (var13 == 2 || var13 == 1 || var13 == 3) {
                        var15 += 128;
                     }

                     if (var13 == 6 || var13 == 5 || var13 == 7) {
                        var15 -= 128;
                     }

                     if (var13 == 4 || var13 == 3 || var13 == 5) {
                        var16 += 128;
                     }

                     if (var13 == 0 || var13 == 1 || var13 == 7) {
                        var16 -= 128;
                     }

                     var41.u((1 + var14) % 10, var15, var16);
                     var41.at(var13);
                  } else if (var12 == 1) {
                     var13 = var1.aJ(2);
                     if (var13 == 3) {
                        continue;
                     }

                     var41.at(var1.aJ(2) + (var13 << 2));
                  }
               }

               this.nr[this.qR++] = var41;
            }

            while(var3 * 8 > var1.dJ() - -24) {
               var9 = var1.aJ(11);
               var31 = var1.aJ(5);
               if (var31 > 15) {
                  var31 -= 32;
               }

               var11 = var1.aJ(5);
               if (var11 > 15) {
                  var11 -= 32;
               }

               var12 = var1.aJ(4);
               var13 = (this.oy + var31) * 128 + 64;
               var14 = (this.oz + var11) * 128 + 64;
               this.v(var9, var13, var14, var12);
            }

            var1.dL();
            return;
         }

         int var5;
         if (var2 == 79) {
            this.qz = this.qA;
            this.qA = 0;
            if (this.qz >= 0) {
               System.arraycopy(this.no, 0, this.np, 0, this.qz);
            }

            var1.dK();
            var18 = var1.aJ(8);

            for(var5 = 0; var18 > var5; ++var5) {
               j var36 = this.np[var5];
               var7 = var1.aJ(1);
               if (var7 != 0) {
                  var21 = var1.aJ(1);
                  if (var21 != 0) {
                     var9 = var1.aJ(2);
                     if (var9 == 3) {
                        continue;
                     }

                     var36.at(var1.aJ(2) + (var9 << 2));
                  } else {
                     var9 = var1.aJ(3);
                     var31 = var36.mV;
                     var11 = var36.mW[var31];
                     var12 = var36.mX[var31];
                     if (var9 == 2 || var9 == 1 || var9 == 3) {
                        var11 += 128;
                     }

                     if (var9 == 6 || var9 == 5 || var9 == 7) {
                        var11 -= 128;
                     }

                     if (var9 == 4 || var9 == 3 || var9 == 5) {
                        var12 += 128;
                     }

                     if (var9 == 0 || var9 == 1 || var9 == 7) {
                        var12 -= 128;
                     }

                     var36.u((1 + var31) % 10, var11, var12);
                     var36.at(var9);
                  }
               }

               this.no[this.qA++] = var36;
            }

            while(var1.dJ() + 34 < var3 * 8) {
               var5 = var1.aJ(14);
               var6 = var1.aJ(5);
               if (var6 > 15) {
                  var6 -= 32;
               }

               var7 = var1.aJ(5);
               if (var7 > 15) {
                  var7 -= 32;
               }

               var21 = var1.aJ(4);
               var9 = var1.aJ(10);
               var31 = (this.oy + var6) * 128 + 64;
               var11 = (this.oz + var7) * 128 + 64;
               this.k(var21, var9, var31, var11, var5);
            }

            var1.dL();
            return;
         }

         com.rsc.e.e var23;
         byte var33;
         if (var2 == 48) {
            while(true) {
               while(var3 > var1.rV) {
                  if (var1.dO() != 255) {
                     --var1.rV;
                     var18 = var1.dR();
                     var5 = this.oy + var1.dQ();
                     var6 = this.oz + var1.dQ();
                     var33 = var1.dN();
                     var21 = 0;

                     for(var9 = 0; var9 < this.px; ++var9) {
                        com.rsc.e.e var38 = this.oI[var9];
                        if (var38.cf() == var5 && var38.cg() == var6) {
                           this.L.c(var38.ck());
                           this.N.b(var38);
                        } else {
                           if (var21 != var9) {
                              this.oI[var21].c(this.oI[var9]);
                              this.oI[var21].am(var21);
                              this.oI[var21].ck().gy = var21;
                           }

                           ++var21;
                        }
                     }

                     this.px = var21;
                     if (var18 != 60000) {
                        var23 = new com.rsc.e.e();
                        var23.an(var18);
                        var23.D(var5, var6);
                        var23.ap(var33);
                        com.rsc.c.h var40 = this.R[var23.cm().bv].bl();
                        this.L.b(var40);
                        var23.d(var40);
                        var23.am(this.px);
                        var40.gy = this.px;
                        var11 = (var5 * 2 + var23.au()) * 128 / 2;
                        var12 = (var6 * 2 + var23.av()) * 128 / 2;
                        var40.i(var11, -this.N.p(var11, var12), var12);
                        var40.b(-50, -10, -50, 48, 48, true);
                        var40.b(0, var23.cl() * 32, 0);
                        if (var18 == 74) {
                           var40.j(0, -480, 0);
                        }

                        this.N.a(var23);
                        this.oI[this.px] = var23;
                        ++this.px;
                     }
                  } else {
                     var18 = this.oy + var1.dQ() >> 3;
                     var5 = this.oz + var1.dQ() >> 3;
                     var6 = 0;

                     for(var7 = 0; var7 < this.px; ++var7) {
                        com.rsc.e.e var34 = this.oI[var7];
                        var9 = (var34.cf() >> 3) - var18;
                        var31 = (var34.cg() >> 3) - var5;
                        if (var9 == 0 && var31 == 0) {
                           this.L.c(var34.ck());
                           this.N.b(var34);
                        } else {
                           if (var6 != var7) {
                              this.oI[var6].c(this.oI[var7]);
                              this.oI[var6].am(var6);
                              this.oI[var6].ck().gy = var6;
                           }

                           ++var6;
                        }
                     }

                     this.px = var6;
                  }
               }

               return;
            }
         }

         if (var2 == 53) {
            this.pG = var1.dO();

            for(var18 = 0; var18 < this.pG; ++var18) {
               var5 = var1.dR();
               this.nm[var18] = var5;
               this.nE[var18] = var1.dN();
               if (com.rsc.a.a.l(var5).aA()) {
                  this.nn[var18] = var1.dS();
               } else {
                  this.nn[var18] = 1;
               }
            }

            return;
         }

         if (var2 == 91) {
            while(true) {
               while(var3 > var1.rV) {
                  if (var1.dO() != 255) {
                     --var1.rV;
                     var18 = var1.dR();
                     var5 = this.oy + var1.dQ();
                     var6 = this.oz + var1.dQ();
                     var33 = var1.dN();
                     var21 = 0;

                     for(var9 = 0; var9 < this.ro; ++var9) {
                        m var37 = this.oJ[var9];
                        if (var37.cf() == var5 && var37.cg() == var6) {
                           this.L.c(var37.cC());
                           this.N.b(var37);
                        } else {
                           if (var21 != var9) {
                              this.oJ[var21].c(this.oJ[var9]);
                              this.oJ[var21].am(var21);
                              this.oJ[var21].cC().gy = 10000 + var21;
                           }

                           ++var21;
                        }
                     }

                     this.ro = var21;
                     if (var18 != 60000) {
                        m var39 = new m();
                        var39.an(var18);
                        var39.ap(var33);
                        var39.D(var5, var6);
                        var39.e(this.l(var5, var6, var18, var33, this.ro));
                        var39.cC().gy = 10000 + this.ro;
                        this.N.a(var39);
                        this.oJ[this.ro] = var39;
                        ++this.ro;
                     }
                  } else {
                     var18 = 0;
                     var5 = this.oy + var1.dQ() >> 3;
                     var6 = this.oz + var1.dQ() >> 3;

                     for(var7 = 0; this.ro > var7; ++var7) {
                        m var32 = this.oJ[var7];
                        var9 = (var32.cf() >> 3) - var5;
                        var31 = (var32.cg() >> 3) - var6;
                        if (var9 == 0 && var31 == 0) {
                           this.L.c(var32.cC());
                           this.N.b(var32);
                        } else {
                           if (var7 != var18) {
                              this.oJ[var18].c(this.oJ[var7]);
                              this.oJ[var18].am(var18);
                              this.oJ[var18].cC().gy = 10000 + var18;
                           }

                           ++var18;
                        }
                     }

                     this.ro = var18;
                  }
               }

               return;
            }
         }

         if (var2 == 104) {
            var18 = var1.dR();

            for(var5 = 0; var18 > var5; ++var5) {
               var6 = var1.dR();
               j var28 = this.nq[var6];
               var21 = var1.dO();
               if (var21 == 1) {
                  var9 = var1.dR();
                  if (var28 != null) {
                     var28.d(var1.dM());
                     if (this.oG.ce() == var9) {
                        this.a(h.mu, (String)null, "@yel@", var28.cA().ad() + ": " + var28.mo, 0);
                     }
                  }
               } else if (var21 == 2) {
                  var9 = var1.dO();
                  var31 = var1.dO();
                  var11 = var1.dO();
                  if (null != var28) {
                     var28.mN = var31;
                     var28.mO = var11;
                     var28.mH = var9;
                     var28.mG = 200;
                     var28.mF = 200;
                  }
               }
            }

            return;
         }

         if (var2 == 25) {
            this.pM = true;
            this.qo = var1.dR();
            this.oC = var1.dR();
            this.oD = var1.dR();
            this.qS = var1.dR();
            this.qg = var1.dR();
            this.oD -= this.qS * this.qg;
            return;
         }

         if (var2 == 156) {
            for(var18 = 0; var18 < 18; ++var18) {
               this.nO[var18] = var1.dO();
            }

            for(var18 = 0; var18 < 18; ++var18) {
               this.nN[var18] = var1.dO();
            }

            for(var18 = 0; var18 < 18; ++var18) {
               this.nL[var18] = var1.dS();
            }

            this.pY = var1.dO();
            return;
         }

         if (var2 == 83) {
            this.pv = 250;
            return;
         }

         if (var2 == 59) {
            this.ra = true;
            return;
         }

         if (var2 == 92) {
            var18 = var1.dR();
            if (this.nt[var18] != null) {
               this.oL.lS = this.nt[var18].na;
            }

            this.oL.lT = true;
            this.oL.lR = 0;
            this.oL.lN = 0;
            this.oL.lJ = false;
            this.oL.lO = false;
            return;
         }

         if (var2 == 128) {
            this.oL.lU = false;
            this.oL.lT = false;
            return;
         }

         byte var4;
         if (var2 == 15) {
            var4 = var1.dN();
            this.oL.lJ = var4 == 1;
            return;
         }

         if (var2 == 162) {
            var18 = var1.dO();
            this.oL.lO = var18 == 1;
            return;
         }

         if (var2 == 137) {
            this.oN.lm = false;
            return;
         }

         if (var2 == 240) {
            this.oq = var1.dO() == 1;
            this.oO = var1.dO() == 1;
            this.rN = var1.dO() == 1;
            this.rJ = var1.dO();
            this.rL = var1.dO();
            this.rM = var1.dO();
            this.rK = var1.dO();
            this.rI = var1.dO() == 1;
            this.rG = var1.dO() == 1;
            this.rH = var1.dO() == 1;
            this.pg = var1.dN();
            c.ac = var1.dO() == 1;
            c.ag = var1.dO() == 1;
            c.ah = var1.dO() == 1;
            c.ai = var1.dO() == 1;
            c.ak = var1.dO() == 1;
            c.al = var1.dO();
            c.am = var1.dO();
            c.an = var1.dO();
            c.aq = var1.dO() == 1;
            c.at = var1.dO() == 1;
            c.au = var1.dO() == 1;
            c.ar = var1.dR();
            c.as = var1.dO();
            c.ad = var1.dO() == 1;
            c.ae = var1.dO() == 1;
            c.af = var1.dO() == 1;
            return;
         }

         if (var2 == 241) {
            var18 = var1.dO();
            if (var18 == 18) {
               c.ar = var1.dR();
            } else {
               switch(var18) {
               case 0:
                  this.rJ = var1.dO();
                  break;
               case 1:
                  this.rL = var1.dO();
                  break;
               case 2:
                  this.rM = var1.dO();
                  break;
               case 3:
                  this.rK = var1.dO();
                  break;
               case 4:
                  this.rI = var1.dO() == 1;
                  break;
               case 5:
                  this.rG = var1.dO() == 1;
                  break;
               case 6:
                  this.rH = var1.dO() == 1;
                  break;
               case 7:
                  this.pg = var1.dO();
                  break;
               case 8:
                  c.ac = var1.dO() == 1;
                  break;
               case 9:
                  c.ag = var1.dO() == 1;
                  break;
               case 10:
                  c.ah = var1.dO() == 1;
                  break;
               case 11:
                  c.ai = var1.dO() == 1;
                  break;
               case 12:
                  c.ak = var1.dO() == 1;
                  break;
               case 13:
                  c.al = var1.dO();
                  break;
               case 14:
                  c.am = var1.dO();
                  break;
               case 15:
                  c.an = var1.dO();
                  break;
               case 16:
                  c.aq = var1.dO() == 1;
                  break;
               case 17:
                  c.at = var1.dO() == 1;
                  break;
               case 18:
                  c.au = var1.dO() == 1;
                  break;
               case 19:
                  c.as = var1.dO();
                  break;
               case 20:
                  c.ad = var1.dO() == 1;
                  break;
               case 21:
                  c.ae = var1.dO() == 1;
                  break;
               case 22:
                  c.af = var1.dO() == 1;
               }
            }

            return;
         }

         if (var2 == 206) {
            for(var18 = 0; var3 - 1 > var18; ++var18) {
               var29 = var1.dN() == 1;
               if (!this.nQ[var18] && var29) {
                  this.k("prayeron");
               }

               if (this.nQ[var18] && !var29) {
                  this.k("prayeroff");
               }

               this.nQ[var18] = var29;
            }

            return;
         }

         if (var2 == 5) {
            var4 = var1.dN();
            if (var4 == 0) {
               byte var26 = var1.dN();

               for(var6 = 0; var6 < var26; ++var6) {
                  var7 = var1.dS();
                  var21 = var1.dS();
                  String var35 = var1.dM();
                  this.nR[var7] = var35;
                  this.nS[var7] = var21;
               }
            } else if (var4 == 1) {
               var5 = var1.dS();
               var6 = var1.dS();
               this.nS[var5] = var6;
            }

            return;
         }

         if (var2 == 42) {
            this.rb = true;
            this.qw = var1.dO();
            this.oU = var1.dO();

            for(var18 = 0; var18 < this.qw; ++var18) {
               this.qx[var18] = var1.dR();
               this.qy[var18] = var1.dS();
            }

            this.aH(108);
            return;
         }

         if (var2 == 33) {
            var18 = var1.dO();
            this.nL[var18] = var1.dS();
            return;
         }

         if (var2 == 225) {
            this.oM.kY = false;
            this.oM.kZ = false;
            return;
         }

         if (var2 == 20) {
            this.oL.lT = false;
            this.oL.lU = true;
            this.oL.lK = false;
            this.oL.lQ = var1.dM();
            this.oL.lP = var1.dO();

            for(var18 = 0; this.oL.lP > var18; ++var18) {
               this.oL.lE[var18] = var1.dR();
               this.oL.lD[var18] = var1.dS();
            }

            this.oL.lL = var1.dO();

            for(var18 = 0; var18 < this.oL.lL; ++var18) {
               this.oL.lz[var18] = var1.dR();
               this.oL.lA[var18] = var1.dS();
            }

            return;
         }

         if (var2 == 6) {
            this.oM.ld = var1.dO();

            for(var18 = 0; this.oM.ld > var18; ++var18) {
               this.oM.lg[var18] = var1.dR();
               this.oM.lh[var18] = var1.dS();
            }

            this.oM.kK = false;
            this.oM.kL = false;
            return;
         }

         if (var2 == 30) {
            if (var1.dO() == 1) {
               this.oM.kW = true;
            } else {
               this.oM.kW = false;
            }

            if (var1.dO() != 1) {
               this.oM.kU = false;
            } else {
               this.oM.kU = true;
            }

            if (var1.dO() != 1) {
               this.oM.kV = false;
            } else {
               this.oM.kV = true;
            }

            if (var1.dO() != 1) {
               this.oM.kX = false;
            } else {
               this.oM.kX = true;
            }

            this.oM.kK = false;
            this.oM.kL = false;
            return;
         }

         if (var2 == 249) {
            var18 = var1.dO();
            var5 = var1.dR();
            var6 = var1.dS();
            if (var6 == 0) {
               --this.qw;

               for(var7 = var18; this.qw > var7; ++var7) {
                  this.qx[var7] = this.qx[1 + var7];
                  this.qy[var7] = this.qy[var7 + 1];
               }
            } else {
               this.qx[var18] = var5;
               this.qy[var18] = var6;
               if (this.qw <= var18) {
                  this.qw = var18 + 1;
               }
            }

            this.aH(-103);
            return;
         }

         if (var2 == 90) {
            var18 = var1.dO();
            var5 = var1.dR();
            var6 = 1;
            if (com.rsc.a.a.l(var5 & 32767).aA()) {
               var6 = var1.dS();
            }

            this.nm[var18] = var5 & 32767;
            this.nE[var18] = var5 / '耀';
            this.nn[var18] = var6;
            if (var18 >= this.pG) {
               this.pG = 1 + var18;
            }

            return;
         }

         if (var2 == 159) {
            var18 = var1.dO();
            this.nO[var18] = var1.dO();
            this.nN[var18] = var1.dO();
            this.nL[var18] = var1.dS();
            return;
         }

         if (var2 == 210) {
            var4 = var1.dN();
            if (var4 != 1) {
               this.oM.kK = false;
            } else {
               this.oM.kK = true;
            }

            return;
         }

         if (var2 == 253) {
            var4 = var1.dN();
            if (var4 != 1) {
               this.oM.kL = false;
            } else {
               this.oM.kL = true;
            }

            return;
         }

         if (var2 == 172) {
            this.oM.la = false;
            this.oM.kZ = true;
            this.oM.kY = false;
            this.oM.lc = var1.dM();
            this.oM.lf = var1.dO();

            for(var18 = 0; var18 < this.oM.lf; ++var18) {
               this.oM.lk[var18] = var1.dR();
               this.oM.ll[var18] = var1.dS();
            }

            this.oM.le = var1.dO();

            for(var18 = 0; this.oM.le > var18; ++var18) {
               this.oM.li[var18] = var1.dR();
               this.oM.lj[var18] = var1.dS();
            }

            this.oM.kS = var1.dO();
            this.oM.kQ = var1.dO();
            this.oM.kR = var1.dO();
            this.oM.kT = var1.dO();
            return;
         }

         if (var2 == 176) {
            var18 = var1.dR();
            if (null != this.nt[var18]) {
               this.oM.lb = this.nt[var18].na;
            }

            this.oM.kK = false;
            this.oM.kV = false;
            this.oM.kL = false;
            this.oM.kX = false;
            this.oM.kW = false;
            this.oM.kY = true;
            this.oM.kU = false;
            this.oM.ld = 0;
            this.oM.kJ = 0;
            return;
         }

         if (var2 == 204) {
            String var30 = var1.dM();
            this.k(var30);
            return;
         }

         if (var2 == 182) {
            if (!this.rs) {
               this.rr = var1.dM();
               this.rp = var1.dR();
               this.rt = var1.dR();
               this.rc = true;
               this.rq = null;
               this.rs = true;
            }

            return;
         }

         if (var2 == 222) {
            this.qV = var1.dM();
            this.rd = true;
            this.qW = true;
            return;
         }

         if (var2 == 117) {
            if (!this.pH) {
               this.pw = this.rj;
            }

            this.og = "";
            this.pH = true;
            this.oh = "";
            this.oP = this.D.a(new ByteArrayInputStream(var1.rU, 1, var3));
            this.rh = null;
            return;
         }

         if (var2 == 84) {
            this.pH = false;
            return;
         }

         if (var2 == 194) {
            this.rh = "Incorrect - Please wait...";
            return;
         }

         if (var2 == 52) {
            this.rk = var1.dR() * 32;
            return;
         }

         if (var2 == 244) {
            this.pw = var1.dR();
            return;
         }

         if (var2 == 114) {
            this.rj = var1.dR();
            return;
         }

         if (var2 == 89) {
            this.qV = var1.dM();
            this.rd = true;
            this.qW = false;
            return;
         }

         if (var2 == 36) {
            if (this.rm < 50) {
               var18 = var1.dO();
               var5 = var1.dN() + this.oy;
               var6 = var1.dN() + this.oz;
               this.nx[this.rm++] = new l(var5, var6, var18);
            }

            return;
         }

         if (var2 == 123) {
            var18 = var1.dO();
            --this.pG;

            for(var5 = var18; this.pG > var5; ++var5) {
               this.nm[var5] = this.nm[var5 + 1];
               this.nn[var5] = this.nn[var5 + 1];
               this.nE[var5] = this.nE[var5 + 1];
            }

            return;
         }

         if (var2 == 203) {
            this.n(false);
            return;
         }

         if (var2 == 101) {
            this.oN.lm = true;
            this.oN.lo = var1.dO();
            this.oN.ln = var1.dN();
            this.oN.lt = var1.dO();
            this.oN.lp = var1.dO();
            this.oN.lq = var1.dO();

            for(var18 = 0; var18 < 40; ++var18) {
               this.oN.lv[var18] = -1;
            }

            for(var18 = 0; this.oN.lo > var18; ++var18) {
               this.oN.lv[var18] = var1.dR();
               this.oN.lu[var18] = var1.dR();
               this.oN.lw[var18] = var1.dR();
            }

            if (this.oN.ln == 1) {
               var18 = 39;

               for(var5 = 0; var5 < this.pG && this.oN.lo <= var18; ++var5) {
                  boolean var19 = false;

                  for(var7 = 0; var7 < 40; ++var7) {
                     if (this.nm[var5] == this.oN.lv[var7]) {
                        var19 = true;
                        break;
                     }
                  }

                  if (this.nm[var5] == 10) {
                     var19 = true;
                  }

                  if (!var19) {
                     this.oN.lv[var18] = this.nm[var5] & 32767;
                     this.oN.lu[var18] = 0;
                     this.oN.lw[var18] = 0;
                     --var18;
                  }
               }
            }

            if (this.oN.lr >= 0 && 40 > this.oN.lr && this.oN.ls != this.oN.lv[this.oN.lr]) {
               this.oN.lr = -1;
               this.oN.ls = -2;
            }

            return;
         }

         if (var2 == 97) {
            this.oL.lR = var1.dO();

            for(var18 = 0; var18 < this.oL.lR; ++var18) {
               this.oL.lF[var18] = var1.dR();
               this.oL.lG[var18] = var1.dS();
            }

            this.oL.lO = false;
            this.oL.lJ = false;
            return;
         }

         if (var2 == 153) {
            for(var18 = 0; var18 < 5; ++var18) {
               this.nP[var18] = var1.dO();
            }

            return;
         }

         if (var2 == 245) {
            this.re = true;
            var18 = var1.dO();
            this.nG = var18;

            for(var5 = 0; var18 > var5; ++var5) {
               this.pO[var5] = var1.dM();
            }

            return;
         }

         if (var2 == 252) {
            this.re = false;
            return;
         }

         if (var2 == 234) {
            var18 = var1.dR();

            for(var5 = 0; var18 > var5; ++var5) {
               var6 = var1.dR();
               k var22 = this.nt[var6];
               byte var24 = var1.dN();
               if (var24 == 0) {
                  var9 = var1.dR();
                  if (var22 != null) {
                     var22.as(var9);
                  }
               } else if (var24 == 1) {
                  if (var22 != null) {
                     var9 = var1.dO();
                     String var27 = var1.dM();
                     var22.mR = 150;
                     var22.mo = var27;
                     this.a(h.mv, var22.na + "@yel@", "@yel@", var27, var9);
                  }
               } else if (var24 == 2) {
                  var9 = var1.dO();
                  var31 = var1.dO();
                  var11 = var1.dO();
                  if (var22 != null) {
                     var22.mO = var11;
                     var22.mN = var31;
                     var22.mH = var9;
                     var22.mG = 200;
                     if (this.oG == var22) {
                        this.nO[3] = var31;
                        this.nN[3] = var11;
                        this.rd = false;
                        this.rc = false;
                     }

                     var22.mF = 200;
                  }
               } else if (var24 == 3) {
                  var9 = var1.dR();
                  var31 = var1.dR();
                  if (var22 != null) {
                     var22.mT = 40;
                     var22.mJ = this.aC(var31);
                     var22.mP = var9;
                  }
               } else if (var24 == 4) {
                  var9 = var1.dR();
                  var31 = var1.dR();
                  if (var22 != null) {
                     var22.mJ = this.aD(var31);
                     var22.mT = 40;
                     var22.mP = var9;
                  }
               }

               if (var24 == 6 && var22 != null) {
                  var22.mo = var1.dM();
                  var22.mR = 150;
                  if (this.oG == var22) {
                     this.a(h.mu, var22.na, (String)null, var22.mo, 0);
                  }
               } else if (var24 == 5 && var22 != null) {
                  var22.na = var1.dM();
                  var9 = var1.dO();

                  for(var31 = 0; var31 < var9; ++var31) {
                     var11 = var1.dR() - 1;
                     var22.mM[var31] = com.rsc.a.a.m(var11);
                  }

                  for(var31 = var9; var31 < 12; ++var31) {
                     var22.mM[var31] = null;
                  }

                  var22.nd = var1.dO();
                  var22.nf = var1.dO();
                  var22.nc = var1.dO();
                  var22.ne = var1.dO();
                  var22.mQ = var1.dO();
                  var22.nb = var1.dO();
               }
            }

            return;
         }

         if (var2 == 111) {
            this.pF = var1.dO() != 0;
            return;
         }

         if (var2 == 99) {
            while(true) {
               while(true) {
                  while(var3 > var1.rV) {
                     if (var1.dO() != 255) {
                        --var1.rV;
                        var18 = var1.dR();
                        var5 = this.oy + var1.dQ();
                        var6 = this.oz + var1.dQ();
                        if ((var18 & '耀') != 0) {
                           var18 &= 32767;
                           var7 = 0;

                           for(var21 = 0; var21 < this.py; ++var21) {
                              com.rsc.e.f var25 = this.oK[var21];
                              if (var25.cf() == var5 && var25.cg() == var6 && var25.at() == var18) {
                                 var18 = -123;
                              } else {
                                 if (var7 != var21) {
                                    this.oK[var7].a(var25);
                                 }

                                 ++var7;
                              }
                           }

                           this.py = var7;
                        } else {
                           com.rsc.e.f var20 = new com.rsc.e.f();
                           var20.D(var5, var6);
                           var20.an(var18);
                           var20.aq(0);
                           this.oK[this.py++] = var20;

                           for(var21 = 0; this.px > var21; ++var21) {
                              var23 = this.oI[var21];
                              if (var23.cf() == var5 && var23.cg() == var6) {
                                 var20.aq(var23.cm().aw());
                                 break;
                              }
                           }
                        }
                     } else {
                        var18 = 0;
                        var5 = var1.dQ();
                        var6 = var1.dQ();
                        var7 = this.oy + var5 >> 3;
                        var21 = this.oz + var6 >> 3;

                        for(var9 = 0; this.py > var9; ++var9) {
                           com.rsc.e.f var10 = this.oK[var9];
                           var11 = (var10.cf() >> 3) - var7;
                           var12 = (var10.cg() >> 3) - var21;
                           if (var11 != 0 || var12 != 0) {
                              if (var18 != var9) {
                                 this.oK[var18].a(var10);
                              }

                              ++var18;
                           }
                        }

                        this.py = var18;
                     }
                  }

                  return;
               }
            }
         }

         if (var2 == 112) {
            this.ry.e(var1.dN() == 1);
            this.ry.ag(var1.dN() & 255);
            this.ry.bL();
            var4 = var1.dN();
            if (var4 > 0) {
               for(var5 = 0; var5 < var4; ++var5) {
                  var6 = var1.dQ();
                  var7 = var1.dS();
                  String var8 = var1.dM();
                  if (var6 != -1 && var7 != -1) {
                     this.ry.a(var6, var7, var8);
                  }
               }
            }

            return;
         }
      } catch (Exception var17) {
         var17.printStackTrace();
         this.a(true);
      }

   }

   private void ds() {
      if (this.u() >= this.dC().iU - 35 && this.B >= 3 && this.u() < this.dC().iU - 3 && this.B < 35 && this.rf == 0) {
         this.rf = 1;
      }

      if (this.rf == 0 && this.u() >= this.dC().iU - 35 - 33 && this.B >= 3 && this.dC().iU - 3 - 33 > this.u() && this.B < 35) {
         this.rf = 2;
      }

      if (this.rf == 0 && this.dC().iU - 101 <= this.u() && this.B >= 3 && this.u() < this.dC().iU - 3 - 66 && this.B < 35) {
         this.rf = 3;
      }

      if (this.rf == 0 && this.u() >= this.dC().iU - 99 - 35 && this.B >= 3 && this.dC().iU - 3 - 99 > this.u() && this.B < 35) {
         this.rf = 4;
      }

      if (this.rf == 0 && this.u() >= this.dC().iU - 35 - 132 && this.B >= 3 && this.u() < this.dC().iU - 135 && this.B < 35) {
         this.rf = 5;
      }

      if (this.rf == 0 && this.dC().iU - 35 - 165 <= this.u() && this.B >= 3 && this.u() < this.dC().iU - 165 - 3 && this.B < 35) {
         this.rf = 6;
      }

      if (this.rf != 0 && this.dC().iU - 35 <= this.u() && this.B >= 3 && this.dC().iU - 3 > this.u() && this.B < 26) {
         this.rf = 1;
      }

      if (this.rf != 0 && this.rf != 2 && this.dC().iU - 68 <= this.u() && this.B >= 3 && this.dC().iU - 33 - 3 > this.u() && this.B < 26) {
         this.rf = 2;
      }

      if (this.rf != 0 && this.u() >= this.dC().iU - 66 - 35 && this.B >= 3 && this.dC().iU - 3 - 66 > this.u() && this.B < 26) {
         this.rf = 3;
      }

      if (this.rf != 0 && this.dC().iU - 35 - 99 <= this.u() && this.B >= 3 && this.dC().iU - 102 > this.u() && this.B < 26) {
         this.rf = 4;
      }

      if (this.rf != 0 && this.dC().iU - 167 <= this.u() && this.B >= 3 && this.dC().iU - 132 - 3 > this.u() && this.B < 26) {
         this.rf = 5;
      }

      if (this.rf != 0 && this.dC().iU - 35 - 165 <= this.u() && this.B >= 3 && this.u() < this.dC().iU - 168 && this.B < 26) {
         this.rf = 6;
      }

      if (this.rf == 1) {
         label176: {
            if (this.u() >= this.dC().iU - 248) {
               this.getClass();
               if (36 + 30 / 4 * 34 >= this.B) {
                  break label176;
               }
            }

            this.rf = 0;
         }
      }

      if (this.rf == 3 && (this.dC().iU - 199 > this.u() || this.B > 316)) {
         this.rf = 0;
      }

      if ((this.rf == 2 || this.rf == 4 || this.rf == 5) && (this.dC().iU - 199 > this.u() || this.B > 240)) {
         this.rf = 0;
      }

      if (this.rf == 6 && (this.dC().iU - 199 > this.u() || this.B > 325)) {
         this.rf = 0;
      }

   }

   private boolean F(int var1, int var2) {
      if (var1 == 31) {
         if (this.aG(197) || this.aG(615) || this.aG(682)) {
            return true;
         }
      } else if (var1 == 32) {
         if (this.aG(102) || this.aG(616) || this.aG(683)) {
            return true;
         }
      } else if (var1 == 33) {
         if (this.aG(101) || this.aG(617) || this.aG(684)) {
            return true;
         }
      } else if (var1 == 34 && (this.aG(103) || this.aG(618) || this.aG(685))) {
         return true;
      }

      return this.aB(var1) >= var2;
   }

   private boolean aG(int var1) {
      for(int var2 = 0; this.pG > var2; ++var2) {
         if (var1 == this.nm[var2] && this.nE[var2] == 1) {
            return true;
         }
      }

      return false;
   }

   private void dt() {
      this.pN = 0;
      this.ql = 0;
      this.pu = f.rQ;
      this.rk = 0;
      this.oQ = false;
   }

   private boolean G(int var1, int var2) {
      if (this.pv != 0) {
         this.N.jL = false;
         return false;
      } else {
         this.pM = false;
         var2 += this.oD;
         var1 += this.oC;
         if (this.or == this.qS && this.ps < var1 && this.pq > var1 && this.pt < var2 && var2 < this.pr) {
            this.N.jL = true;
            return false;
         } else {
            this.dC().c(256, 192, "Loading... Please wait", 16777215, 1, -1);
            this.cP();
            int var3 = this.ov;
            int var4 = this.ow;
            int var5 = (var1 + 24) / 48;
            int var6 = (var2 + 24) / 48;
            this.ov = var5 * 48 - 48;
            this.ow = var6 * 48 - 48;
            this.or = this.qS;
            this.pq = var5 * 48 + 32;
            this.ps = var5 * 48 - 32;
            this.pt = var6 * 48 - 32;
            this.pr = var6 * 48 + 32;
            this.N.r(var1, var2, this.or);
            this.ov -= this.oC;
            this.ow -= this.oD;
            int var7 = this.ov - var3;
            int var8 = this.ow - var4;

            int var9;
            int var13;
            for(var9 = 0; this.px > var9; ++var9) {
               com.rsc.e.e var10 = this.oI[var9];
               var10.D(var10.cf() - var7, var10.cg() - var8);
               com.rsc.c.h var11 = var10.ck();

               try {
                  int var12 = var10.cf();
                  var13 = var10.cg();
                  int var14 = (var10.cf() * 2 + var10.au()) * 128 / 2;
                  int var15 = (var10.cg() * 2 + var10.av()) * 128 / 2;
                  if (var12 >= 0 && var13 >= 0 && var12 < 96 && var13 < 96) {
                     var11.i(var14, -this.N.p(var14, var15), var15);
                     if (var10.at() == 74) {
                        var11.j(0, -480, 0);
                     }

                     this.N.a(var10);
                     this.L.b(var11);
                  }
               } catch (RuntimeException var17) {
                  System.out.println("Loc Error: " + var17.getMessage());
                  System.out.println("i:" + var9 + " obj:" + var11);
                  var17.printStackTrace();
               }
            }

            for(var9 = 0; this.ro > var9; ++var9) {
               m var18 = this.oJ[var9];
               var18.D(var18.cf() - var7, var18.cg() - var8);

               try {
                  this.N.a(var18);
                  var18.e(this.l(var18.cf(), var18.cg(), var18.at(), var18.cl(), var9));
               } catch (RuntimeException var16) {
                  System.out.println("Bound Error: " + var16.getMessage());
                  var16.printStackTrace();
               }
            }

            for(var9 = 0; this.py > var9; ++var9) {
               com.rsc.e.f var19 = this.oK[var9];
               var19.D(var19.cf() - var7, var19.cg() - var8);
            }

            var9 = var7 * 128;
            int var20 = var8 * 128;

            int[] var10000;
            int var21;
            for(var21 = 0; var21 < this.qR; ++var21) {
               k var22 = this.nr[var21];
               var22.C(var22.ch() - var9, var22.ci() - var20);

               for(var13 = 0; var13 <= var22.mV; ++var13) {
                  var10000 = var22.mW;
                  var10000[var13] -= var9;
                  var10000 = var22.mX;
                  var10000[var13] -= var20;
               }
            }

            for(var21 = 0; var21 < this.qA; ++var21) {
               j var23 = this.no[var21];
               var23.C(var23.ch() - var9, var23.ci() - var20);

               for(var13 = 0; var23.mV >= var13; ++var13) {
                  var10000 = var23.mW;
                  var10000[var13] -= var9;
                  var10000 = var23.mX;
                  var10000[var13] -= var20;
               }
            }

            this.N.jL = true;
            return true;
         }
      }
   }

   private long du() {
      File var1 = new File(c.aa + File.separator + ".uid");

      try {
         long var3;
         if (!var1.exists()) {
            PrintWriter var6 = new PrintWriter(new FileOutputStream(var1));
            var3 = (new SecureRandom()).nextLong();
            var6.println(var3);
            var6.flush();
            var1.setReadOnly();
            return var3;
         } else {
            BufferedReader var2 = new BufferedReader(new FileReader(var1));
            var3 = Long.parseLong(var2.readLine());
            var2.close();
            return var3;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         return -1L;
      }
   }

   private String dv() {
      if (c.A()) {
         return "failed";
      } else {
         try {
            InetAddress var1 = InetAddress.getLocalHost();
            NetworkInterface var2 = NetworkInterface.getByInetAddress(var1);
            if (var2 != null) {
               byte[] var3 = var2.getHardwareAddress();
               StringBuilder var4 = new StringBuilder();

               for(int var5 = 0; var5 < var3.length; ++var5) {
                  var4.append(String.format("%02X%s", var3[var5], var5 < var3.length - 1 ? "-" : ""));
               }

               return var4.toString();
            } else {
               return "failed";
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            return "failed";
         }
      }
   }

   protected void r() {
      this.W = 0;
      if (this.pN != 0) {
         this.dt();
      } else {
         System.out.println("Lost connection");
         this.pa = 10;
         this.f(true);
      }

   }

   private void k(String var1) {
      if (!this.rH) {
         int var2 = com.rsc.g.d.b(var1 + ".pcm", this.Q);
         int var3 = com.rsc.g.d.a(var1 + ".pcm", this.Q);
         this.D.a(this.Q, var3, var2);
      }

   }

   private void b(String var1, String var2) {
      this.n().aO(218);
      this.n().q(var1);
      com.rsc.g.k.a(this.n(), var2);
      this.n().dX();
   }

   private void l(String var1) {
      String var2 = com.rsc.g.l.a(var1);
      if (var2 != null) {
         for(int var3 = 0; var3 < this.rD; ++var3) {
            if (var2.equals(com.rsc.g.l.a(this.nZ[var3]))) {
               --this.rD;

               for(int var4 = var3; var4 < this.rD; ++var4) {
                  this.nZ[var4] = this.nZ[1 + var4];
                  this.ob[var4] = this.ob[var4 + 1];
               }

               this.n().aO(167);
               this.n().p(var1);
               this.n().dX();
               break;
            }
         }
      }

   }

   private void m(String var1) {
      String var2 = com.rsc.g.l.a(var1);
      if (var2 != null) {
         for(int var3 = 0; var3 < this.rE; ++var3) {
            if (var2.equals(com.rsc.g.l.a(this.oa[var3]))) {
               --this.rE;
               if (this.rE - var3 >= 0) {
                  System.arraycopy(this.oa, 1 + var3, this.oa, var3, this.rE - var3);
               }

               this.n().aO(241);
               this.n().p(var1);
               this.n().dX();
               break;
            }
         }
      }

   }

   private void dw() {
      byte var1 = 0;
      byte var2 = 50;
      byte var3 = 50;
      this.N.r(var2 * 48 + 23, var3 * 48 + 23, var1);
      this.N.a(this.R);
      this.o(0, 9728, 6400, 888, 1100);
      this.o(1, 9216, 9216, 888, 1100);

      for(int var4 = 0; var4 < 64; ++var4) {
         this.L.c(this.N.jN[0][var4]);
         this.L.c(this.N.jM[1][var4]);
         this.L.c(this.N.jN[1][var4]);
         this.L.c(this.N.jM[2][var4]);
         this.L.c(this.N.jN[2][var4]);
      }

      this.L.bv();
      this.o(2, 11136, 10368, 376, 500);
   }

   public void o(int var1, int var2, int var3, int var4, int var5) {
      this.L.io = 4100;
      this.L.iz = 1;
      this.L.iy = 4000;
      this.L.b(var2, -this.N.p(var2, var3), var3, 912, var4, 0, var5 * 2);
      this.L.bv();
      this.dC().by();
      this.dC().by();
      this.dC().e(0, 0, this.au(), 6, 0);

      int var6;
      for(var6 = 6; var6 >= 1; --var6) {
         this.dC().e(8, var6, var6, 0, this.au(), 0);
      }

      this.dC().e(0, 194, this.au(), 20, 0);

      for(var6 = 6; var6 >= 1; --var6) {
         this.dC().e(8, var6, 194 - var6, 0, this.au(), 0);
      }

      this.dC().a((com.rsc.a.b.c)this.dC().ae(8), 15, 15);
      this.nY[var1] = this.dC().l(0, 0, this.au(), 200);
   }

   private void dx() {
      this.T.rV = 0;
      this.rk = 0;
      this.ql = 0;
      this.pN = 0;
      this.cI();
      this.ry.d(false);
      this.rx.d(false);
      this.rz.bG();
      this.dC().c(true);

      int var1;
      for(var1 = 0; var1 < this.px; ++var1) {
         com.rsc.e.e var2 = this.oI[var1];
         this.L.c(var2.ck());
         this.N.b(var2);
      }

      for(var1 = 0; var1 < this.ro; ++var1) {
         m var3 = this.oJ[var1];
         this.L.c(var3.cC());
         this.N.b(var3);
      }

      this.py = 0;
      this.px = 0;
      this.ro = 0;
      this.qR = 0;
      this.qA = 0;

      for(var1 = 0; var1 < this.nr.length; ++var1) {
         this.nr[var1] = null;
      }

      for(var1 = 0; var1 < this.no.length; ++var1) {
         this.no[var1] = null;
      }

      for(var1 = 0; var1 < 50; ++var1) {
         this.nQ[var1] = false;
      }

      this.oN.lm = false;
      this.m = 0;
      this.z = 0;
      this.s = 0;
      this.pH = false;
      this.n(false);
      this.rD = 0;
      this.nV = 0;

      for(var1 = 0; var1 < 100; ++var1) {
         this.oH[var1] = null;
      }

      this.pu = f.rR;
   }

   private void dy() {
      this.qA = 0;
      this.qR = 0;
      this.ql = 0;
      this.pu = f.rQ;
   }

   private void n(String var1) {
      this.n().aO(216);
      com.rsc.g.k.a(this.n(), var1);
      this.n().dX();
   }

   public final void o(String var1) {
      this.n().aO(38);
      this.n().q(var1);
      this.n().dX();
   }

   private void dz() {
      if (this.pu != f.rQ) {
         if (this.mF <= 450) {
            if (0 < this.mF) {
               this.a(h.mr, (String)null, "@cya@", "You can't logout for 10 seconds after combat", 0);
            } else {
               this.n().aO(102);
               this.n().dX();
               this.pN = 1000;
            }
         } else {
            this.a(h.mr, (String)null, "@cya@", "You can't logout during combat!", 0);
         }
      }

   }

   private boolean d(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = this.N.a(this.mW, this.mX, var1, var2, var3, var4, var5, var6, false);
      if (var8 == -1) {
         return false;
      } else {
         --var8;
         var1 = this.mW[var8];
         var2 = this.mX[var8];
         if (!var7) {
            this.n().aO(187);
         } else {
            this.n().aO(16);
         }

         --var8;
         this.n().aL(this.ov + var1);
         this.n().aL(this.ow + var2);
         if (var7 && var8 == -1 && (this.ov + var1) % 5 == 0) {
            var8 = 0;
         }

         for(int var9 = var8; var9 >= 0 && var8 - 25 < var9; --var9) {
            this.n().aK(this.mW[var9] - var1);
            this.n().aK(this.mX[var9] - var2);
         }

         this.n().dX();
         this.w = this.A;
         this.x = this.B;
         this.v = -24;
         return true;
      }
   }

   private void a(com.rsc.b.b var1, String[] var2, boolean var3, String var4) {
      this.pC = var2;
      this.pE = 400;

      for(int var5 = 0; var2.length > var5; ++var5) {
         int var6 = this.dC().c(1, var2[var5]) + 10;
         if (this.pE < var6) {
            this.pE = var6;
         }
      }

      this.pB = 20 + (this.dC().ac(1) + 2) * (1 + var2.length) + this.dC().ac(4);
      this.pz = var1;
      this.pD = false;
      this.pA = var3;
      this.og = var4;
      this.oh = "";
   }

   public final void a(String[] var1, com.rsc.b.b var2, boolean var3) {
      this.a(var2, var1, var3, "");
   }

   private void c(String var1, String var2) {
      if (this.ql == 2) {
         if (var2 != null && var2.length() >= 1) {
            this.qG.a(this.pk, var1);
            this.qG.a(this.pl, var2);
         } else {
            this.qG.a(this.pl, var1);
         }
      }

      this.da();
      this.l();
      this.D.G();
   }

   public final void a(h var1, String var2, String var3, String var4, int var5) {
      this.a(var1, var2, var3, var4, (String)null, var5);
   }

   public final void a(h var1, String var2, String var3, String var4, String var5, int var6) {
      String var7 = var1.mp;
      if (this.qv != com.rsc.b.c.cH) {
         if (var1 == h.mv && this.qv != com.rsc.b.c.cI) {
            this.qr = 200;
         }

         if (var1 == h.mu && this.qv != com.rsc.b.c.cJ || var1 == h.mz && this.qv != com.rsc.b.c.cJ) {
            this.qu = 200;
         }

         if (var1 == h.mr || var1 == h.my) {
            this.qs = 200;
         }

         if (c.ae) {
            if (var1 == h.mr && this.qv != com.rsc.b.c.cH) {
               this.qv = com.rsc.b.c.cH;
            }

            if ((var1 == h.mw || var1 == h.ms || var1 == h.mt) && this.qv != com.rsc.b.c.cK && this.qv != com.rsc.b.c.cH) {
               this.qv = com.rsc.b.c.cH;
            }
         }
      }

      if (null != var3) {
         var7 = var3;
      }

      for(int var8 = 99; var8 > 0; --var8) {
         this.oH[var8] = this.oH[var8 - 1];
      }

      this.oH[0] = new g(var1, 300, var2, var6, "", var4, var7, var5);
      String var9 = var7 + com.rsc.g.l.a(var4, var2, var1);
      if (var1 == h.mv) {
         this.a(this.qJ, var9, var2, var5, var6);
      }

      if (var1 == h.mu || var1 == h.mz) {
         this.a(this.qM, var9, var2, var5, var6);
      }

      if (var1 == h.ms || var1 == h.mt) {
         this.a(this.qL, var9, var2, var5, var6);
      }

   }

   private void dA() {
      boolean var1 = true;

      while(var1) {
         var1 = false;

         for(int var2 = 0; var2 < this.rD - 1; ++var2) {
            if (this.ob[var2] < this.ob[var2 + 1]) {
               int var3 = this.ob[var2];
               this.ob[var2] = this.ob[var2 + 1];
               this.ob[var2 + 1] = var3;
               String var4 = this.nZ[var2];
               this.nZ[var2] = this.nZ[1 + var2];
               this.nZ[var2 + 1] = var4;
               var1 = true;
            }
         }
      }

   }

   protected void f() {
      int var1 = 0;

      for(int var2 = 0; var2 < 99; ++var2) {
         int var3 = 1 + var2;
         int var4 = (int)(300.0D * Math.pow(2.0D, (double)var3 / 7.0D) + (double)var3);
         var1 += var4;
         this.nD[var2] = (var1 & 268435452) / 4;
      }

      this.d(50);

      try {
         this.k();
         com.rsc.a.a.b(true);
         com.rsc.g.i.ea();
         this.j();
         this.h();
         if (this.oA) {
            this.i();
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         this.J = true;
      }

      if (!this.J) {
         this.dB();
         this.dC().b(100, "Starting game...");
         this.cL();
         this.cK();
         this.cJ();
         this.dy();
         this.dw();
      }

   }

   private void dB() {
      this.os = new com.rsc.c.b(this.dC(), c.A() ? c.as : 1, "Choose option");
      this.oL = new com.rsc.d.b.d(this);
      this.oM = new com.rsc.d.b.b(this);
      this.oN = new com.rsc.d.b.c(this);
      this.rx = new com.rsc.d.a.j(this);
      this.ry = new com.rsc.d.a.e(this);
      this.rz = new com.rsc.d.a.a(this);
      com.rsc.c.e.fe = false;
      this.qI = new com.rsc.c.e(this.dC(), 5);
      int var1 = this.dC().iU - 199;
      byte var2 = 36;
      this.pn = this.qI.a(var1, 24 + var2, 196, 90, 500, 1, true);
      this.qP = new com.rsc.c.e(this.dC(), 5);
      this.pp = this.qP.a(var1, var2 + 40, 196, 126, 500, 1, true);
      this.qO = new com.rsc.c.e(this.dC(), 5);
      this.po = this.qO.a(var1, 24 + var2, 196, 251, 500, 1, true);
      this.a(new com.rsc.d.b.a(this));
   }

   protected void a() {
      if (!this.I && !this.K && !this.J) {
         try {
            ++this.pf;
            if (this.pu == f.rQ) {
               this.y = 0;
               this.dr();
            }

            if (this.pu == f.rR) {
               this.o();
               ++this.y;
               this.dm();
               this.s();
            }

            this.z = 0;
            if (this.qt > 0) {
               --this.qt;
            }

            if (this.qu > 0) {
               --this.qu;
            }

            if (this.qs > 0) {
               --this.qs;
            }

            if (this.qr > 0) {
               --this.qr;
            }
         } catch (Exception var2) {
            var2.printStackTrace();
            this.K = true;
         }

      }
   }

   private void a(com.rsc.e.e var1, String var2) {
      int var3 = var1.cf() - this.oG.ch() / 128;
      int var4 = var1.cg() - this.oG.ci() / 128;
      byte var5 = 7;
      if (var1.cf() >= 0 && var1.cg() >= 0 && var1.cf() < 96 && var1.cg() < 96 && var3 > -var5 && var3 < var5 && var4 > -var5 && var4 < var5) {
         this.L.c(var1.ck());
         int var6 = com.rsc.a.a.a(var2);
         if (this.R[var6] == null) {
            return;
         }

         com.rsc.c.h var7 = this.R[var6].bl();
         var7.b(-50, -10, -50, 48, 48, true);
         var7.a(var1.ck());
         var7.gy = var1.cd();
         var1.d(var7);
         this.L.b(var7);
      }

   }

   private final void aH(int var1) {
      this.oR = this.qw;

      int var2;
      for(var2 = 0; var2 < this.qw; ++var2) {
         this.oS[var2] = this.qx[var2];
         this.oT[var2] = this.qy[var2];
      }

      int var3;
      for(var2 = 0; var2 < this.pG && this.oU > this.oR; ++var2) {
         var3 = this.nm[var2];
         boolean var4 = false;

         for(int var5 = 0; var5 < this.oR; ++var5) {
            if (this.oS[var5] == var3) {
               var4 = true;
               break;
            }
         }

         if (!var4) {
            this.oS[this.oR] = var3;
            this.oT[this.oR] = 0;
            ++this.oR;
         }
      }

      var3 = -89 / ((var1 - 2) / 60);
   }

   private void b(int var1, int var2, int var3, int var4, boolean var5) {
      this.c(var1, var2, var3, var4, var3, var4, false, var5);
   }

   private void c(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      int var9 = this.N.a(this.mW, this.mX, var1, var2, var3, var5, var4, var6, var7);
      if (var9 == -1) {
         if (!var8) {
            return;
         }

         var9 = 1;
         this.mW[0] = var3;
         this.mX[0] = var4;
      }

      --var9;
      var2 = this.mX[var9];
      var1 = this.mW[var9];
      --var9;
      if (!var8) {
         this.n().aO(187);
      } else {
         this.n().aO(16);
      }

      this.n().aL(this.ov + var1);
      this.n().aL(this.ow + var2);
      if (var8 && var9 == -1 && (var1 + this.ov) % 5 == 0) {
         var9 = 0;
      }

      for(int var10 = var9; var10 >= 0 && var10 > var9 - 25; --var10) {
         this.n().aK(this.mW[var10] - var1);
         this.n().aK(this.mX[var10] - var2);
      }

      this.n().dX();
      this.x = this.B;
      this.w = this.A;
      this.v = -24;
   }

   private void w(int var1, int var2, int var3, int var4) {
      if (!this.d(var1, var2, var3, var3, var4, var4, true)) {
         this.c(var1, var2, var3, var4, var3, var4, true, true);
      }

   }

   private void x(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      if (var3 != 0 && var3 != 4) {
         var5 = com.rsc.a.a.s(var4).av();
         var6 = com.rsc.a.a.s(var4).au();
      } else {
         var6 = com.rsc.a.a.s(var4).av();
         var5 = com.rsc.a.a.s(var4).au();
      }

      if (com.rsc.a.a.s(var4).at() != 2 && com.rsc.a.a.s(var4).at() != 3) {
         this.c(this.oy, this.oz, var1, var2, var5 - 1 + var1, var2 + var6 - 1, true, true);
      } else {
         if (var3 == 0) {
            ++var5;
            --var1;
         }

         if (var3 == 2) {
            ++var6;
         }

         if (var3 == 6) {
            --var2;
            ++var6;
         }

         if (var3 == 4) {
            ++var5;
         }

         this.c(this.oy, this.oz, var1, var2, var5 + (var1 - 1), var6 + var2 - 1, false, true);
      }

   }

   private void w(int var1, int var2, int var3) {
      if (var3 == 0) {
         this.c(this.oy, this.oz, var1, var2 - 1, var1, var2, false, true);
      } else if (var3 != 1) {
         this.c(this.oy, this.oz, var1, var2, var1, var2, true, true);
      } else {
         this.c(this.oy, this.oz, var1 - 1, var2, var1, var2, false, true);
      }

   }

   public com.rsc.c.k dC() {
      return this.M;
   }

   private void c(com.rsc.c.k var1) {
      this.M = var1;
   }

   public int au() {
      return this.br;
   }

   public int av() {
      return this.bs;
   }

   public int[][] dD() {
      return this.ny;
   }

   public int[] dE() {
      return this.nM;
   }

   public int[] dF() {
      return this.nK;
   }

   public int[] dG() {
      return this.nJ;
   }

   public int dH() {
      return this.pG;
   }

   public boolean aI(int var1) {
      if (var1 > 1) {
         var1 += var1;
      } else if (var1 < -1) {
         var1 -= -var1;
      }

      if (this.ry.bF()) {
         this.ry.ki.g(this.ry.kj, var1);
         return true;
      } else if (this.rf == 3 && this.qO.S(this.po)) {
         this.qO.g(this.po, var1);
         return true;
      } else if (this.rf == 4 && this.qI.S(this.pn)) {
         this.qI.g(this.pn, var1);
         return true;
      } else if (this.rf == 5 && this.qP.S(this.pp)) {
         if (this.qQ == 1 || this.qQ == 0) {
            this.qP.g(this.pp, var1);
         }

         return true;
      } else if (this.qN.S(this.qM)) {
         this.qN.g(this.qM, var1);
         return true;
      } else if (this.qN.S(this.qJ)) {
         this.qN.g(this.qJ, var1);
         return true;
      } else if (this.qN.S(this.qL)) {
         this.qN.g(this.qL, var1);
         return true;
      } else {
         if (!c.A() && c.aj) {
            a var10000 = this.O;
            var10000.d += var1 * 20;
            if (this.O.d < 550) {
               this.O.d = 550;
            }

            if (this.O.d > 1200) {
               this.O.d = 1200;
            }
         }

         return false;
      }
   }

   public boolean dI() {
      return this.rb;
   }

   private void n(boolean var1) {
      this.rb = var1;
   }

   public String d(String var1, int var2) {
      return var1 != null && var1.length() > var2 ? var1.substring(0, var2) + "..." : var1;
   }

   private void a(com.rsc.d.b.a var1) {
      this.rw = var1;
   }
}
