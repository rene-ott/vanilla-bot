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
   private static final ArrayList<String> nd = new ArrayList();
   private static final String[] ne = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcut", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"};
   private static int nf = 0;
   public final int[] ng = new int[35];
   public final int[] nh = new int[35];
   private final j[] ni = new j[500];
   private final j[] nj = new j[500];
   private final j[] nk = new j[10000];
   private final k[] nl = new k[256];
   private final k[] nm = new k[256];
   private final k[] nn = new k[2000];
   private final com.rsc.e.a[] no = new com.rsc.e.a[150];
   private final com.rsc.e.b[] np = new com.rsc.e.b[150];
   private final com.rsc.e.c[] nq = new com.rsc.e.c[150];
   private final l[] nr = new l[50];
   private final int[][] ns = new int[][]{{11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4, 3}};
   private final int[] nt = new int[]{0, 1, 2, 1, 0, 0, 0, 0};
   private final int[] nu = new int[]{0, 0, 0, 0, 0, 1, 2, 1};
   private final int[] nv = new int[]{0, 1, 2, 1};
   private final String[] nw = new String[]{"Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer"};
   public final int[] nx = new int[99];
   private final int[] ny = new int[35];
   private final int nz = 30;
   private int nA = 0;
   private final int nB = 9;
   private final int nC = 2;
   private final int[] mQ = new int[8000];
   private final int[] mR = new int[8000];
   private final int[] nD = new int[]{15523536, 13415270, 11766848, 10056486, 9461792};
   private final int[] nE = new int[]{16711680, 16744448, 16769024, 10543104, 57344, 32768, 41088, 45311, 33023, 12528, 14680288, 3158064, 6307840, 8409088, 16777215};
   private final int[] nF = new int[19];
   private final int[] nG = new int[]{16760880, 16752704, 8409136, 6307872, 3158064, 16736288, 16728064, 16777215, 65280, 65535};
   private final int[] nH = new int[18];
   private final int[] nI = new int[18];
   private final int[] nJ = new int[5];
   private final boolean[] nK = new boolean[50];
   public final String[] nL = new String[100];
   private final int[] nM = new int[100];
   private int nN = 0;
   private String nO = "";
   private int nP = 0;
   private final String[] nQ = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"};
   private final boolean nR = true;
   private final com.rsc.a.b.c[] nS = new com.rsc.a.b.c[3];
   private final String[] nT = new String[500];
   private final String[] nU = new String[100];
   private final int[] nV = new int[500];
   public boolean nW;
   public String nX = "";
   public String nY = "";
   public boolean nZ = false;
   public String oa = "";
   public String ob = "";
   public boolean oc = false;
   public boolean od = false;
   public boolean oe = false;
   public boolean of = false;
   public boolean og = false;
   public boolean oh = false;
   public boolean oi = false;
   public boolean oj = false;
   public boolean ok;
   public int aB;
   public int aC;
   public int ol = 0;
   public com.rsc.c.b om;
   public int on = 0;
   public int oo = 0;
   public int op;
   public int oq;
   public com.rsc.b.e or;
   public int os;
   public int ot;
   public boolean ou;
   public boolean ov;
   public int ow;
   public int ox;
   public int oy;
   public int oz;
   k oA;
   private g[] oB;
   private com.rsc.e.e[] oC;
   private m[] oD;
   private com.rsc.e.f[] oE;
   private com.rsc.d.b.d oF;
   private com.rsc.d.b.b oG;
   private com.rsc.d.b.c oH;
   public boolean oI;
   private com.rsc.a.b.c oJ;
   private boolean oK;
   public int oL;
   public final int[] oM;
   public final int[] oN;
   public int oO;
   public int oP;
   public int oQ;
   public int oR;
   private int oS;
   private int oT;
   private int oU;
   private int oV;
   private int oW;
   private int oX;
   private String oY;
   private int oZ;
   private int pa;
   private int mz;
   private int pb;
   private int pc;
   private int pd;
   private int pe;
   private int pf;
   private int pg;
   private int ph;
   private int pi;
   private int pj;
   private int pk;
   private int pl;
   private int pm;
   private int pn;
   private f po;
   private int pp;
   private int pq;
   private int br;
   private int bq;
   private int pr;
   private int ps;
   private com.rsc.b.b pt;
   private boolean pu;
   private int pv;
   private String[] pw;
   private boolean px;
   private int py;
   private boolean pz;
   private int pA;
   private boolean pB;
   private int pC;
   private int pD;
   private int pE;
   private int pF;
   private boolean pG;
   private int pH;
   private final String[] pI;
   private int pJ;
   private int pK;
   private int pL;
   private int pM;
   private int pN;
   private int pO;
   private int pP;
   private int pQ;
   private int bI;
   private String pR;
   private int pS;
   private int pT;
   private int pU;
   private int pV;
   private int bF;
   private int pW;
   private int pX;
   private int pY;
   private int pZ;
   private int qa;
   private int qb;
   private int qc;
   private int bG;
   private int qd;
   private int qe;
   private int qf;
   private int qg;
   private int qh;
   private int qi;
   private int qj;
   private boolean qk;
   private int ql;
   private int qm;
   private int qn;
   private int qo;
   private com.rsc.b.c qp;
   private int qq;
   private final int[] qr;
   private final int[] qs;
   private int qt;
   private int qu;
   private int qv;
   private int qw;
   private int qx;
   private int qy;
   private com.rsc.c.e qz;
   private com.rsc.c.e qA;
   private com.rsc.c.e qB;
   private com.rsc.c.e qC;
   private int qD;
   private int qE;
   private int qF;
   private int qG;
   private com.rsc.c.e qH;
   private com.rsc.c.e qI;
   private com.rsc.c.e qJ;
   private int qK;
   private int qL;
   private int qM;
   private int qN;
   private int qO;
   private String qP;
   private boolean qQ;
   private boolean qR;
   private int qS;
   private boolean qT;
   private boolean qU;
   public boolean qV;
   private boolean qW;
   private boolean qX;
   private boolean qY;
   public int qZ;
   private int ra;
   private String rb;
   private int rc;
   private int rd;
   private int re;
   private boolean rf;
   private int rg;
   private int rh;
   private int ri;
   private int rj;
   private String rk;
   private String rl;
   private boolean rm;
   private int rn;
   private int ro;
   private int rp;
   private com.rsc.d.b.a rq;
   public com.rsc.d.a.j rr;
   public com.rsc.d.a.e rs;
   public com.rsc.d.a.a rt;
   private int ru;
   private boolean rv;
   private int rw;
   private int rx;
   private String mU;
   private String ry;
   private boolean rz;
   private boolean rA;
   public boolean rB;
   private int rC;
   private int rD;
   private int rE;
   private int rF;
   private boolean rG;
   private boolean rH;

   public d(com.rsc.g.e var1) {
      this.or = com.rsc.b.e.dk;
      this.ou = true;
      this.ov = false;
      this.ow = 0;
      this.ox = 0;
      this.oy = -1;
      this.oz = -1;
      this.oA = new k();
      this.oB = new g[100];
      this.oC = new com.rsc.e.e[1000];
      this.oD = new m[500];
      this.oE = new com.rsc.e.f[500];
      this.oL = 0;
      this.oM = new int[256];
      this.oN = new int[256];
      this.oO = 48;
      this.oP = 0;
      this.oQ = -2;
      this.oR = -1;
      this.oS = 1;
      this.oT = 0;
      this.oU = 0;
      this.oV = 0;
      this.oW = 0;
      this.oX = 0;
      this.oZ = 0;
      this.pa = 0;
      this.mz = 0;
      this.po = f.rJ;
      this.pp = 0;
      this.pq = 0;
      this.br = 334;
      this.bq = 512;
      this.pr = 0;
      this.ps = 0;
      this.pt = com.rsc.b.b.cu;
      this.pu = true;
      this.pv = 0;
      this.pw = null;
      this.px = false;
      this.py = 0;
      this.pz = false;
      this.pB = false;
      this.pC = 0;
      this.pD = -1;
      this.pE = -1;
      this.pF = -1;
      this.pG = false;
      this.pH = 0;
      this.pI = new String[20];
      this.pM = 1;
      this.bI = 0;
      this.pR = "";
      this.pS = 0;
      this.pT = 0;
      this.bF = 2;
      this.pW = 14;
      this.pY = -1;
      this.qa = 0;
      this.bG = 8;
      this.qd = -1;
      this.qf = 0;
      this.qh = 0;
      this.qi = -1;
      this.qk = false;
      this.ql = 0;
      this.qm = 0;
      this.qn = 0;
      this.qo = 0;
      this.qp = com.rsc.b.c.cG;
      this.qq = 0;
      this.qr = new int[500];
      this.qs = new int[500];
      this.qt = 0;
      this.qu = 0;
      this.qv = 0;
      this.qw = 0;
      this.qx = 0;
      this.qy = 0;
      this.qK = 0;
      this.qL = 0;
      this.qM = 0;
      this.qN = -1;
      this.qO = -1;
      this.qP = "";
      this.qQ = false;
      this.qR = false;
      this.qT = false;
      this.qU = false;
      this.qV = false;
      this.qW = false;
      this.qX = false;
      this.qY = false;
      this.qZ = 0;
      this.ra = 0;
      this.rb = null;
      this.rc = 0;
      this.rd = 0;
      this.re = 0;
      this.rf = false;
      this.rg = 0;
      this.rh = 0;
      this.ri = 0;
      this.rj = 0;
      this.rk = null;
      this.rm = false;
      this.rn = 0;
      this.ro = 0;
      this.rp = 0;
      this.ru = -1;
      this.rv = false;
      this.rw = 0;
      this.rx = 0;
      this.rz = false;
      this.rA = false;
      this.rB = true;
      this.rC = 0;
      this.rD = 0;
      this.rE = 0;
      this.rF = 0;
      this.rG = false;
      this.rH = false;
      this.D = var1;
      c.aa = this.D.C();
      this.c(new com.rsc.c.k(this.au(), this.av() + 12));
      this.dB().o(0, this.au(), this.av() + 12, 0);
      this.dB().a = this;
      this.oy = this.bq;
      this.oz = this.br;
      this.O = new a(this);
      this.L = new i(this.dB(), 15000, 30000, 1000);
      this.L.d(this.au() / 2, this.au() / 2, this.au(), this.av() / 2, this.av() / 2, 9);
      this.L.l(-50, -10, -50);
      this.N = new com.rsc.c.m(this, this.L, this.dB());
   }

   public static String[] cD() {
      return ne;
   }

   public com.rsc.b.b cE() {
      return this.pt;
   }

   public a cF() {
      return this.O;
   }

   public final void e(String var1) {
      if (500 <= this.rw) {
         this.a(h.ml, (String)null, (String)null, "Friend list is full", 0);
      } else {
         String var2 = com.rsc.g.l.a(var1);
         if (null != var2) {
            int var3;
            for(var3 = 0; var3 < this.rw; ++var3) {
               if (var2.equals(com.rsc.g.l.a(this.nT[var3]))) {
                  this.a(h.ml, (String)null, (String)null, var1 + " is already on your friend list.", 0);
                  return;
               }
            }

            for(var3 = 0; var3 < this.rx; ++var3) {
               if (var2.equals(com.rsc.g.l.a(this.nU[var3]))) {
                  this.a(h.ml, (String)null, (String)null, "Please remove " + var1 + " from your ignore list first.", 0);
                  return;
               }

               if (null != this.nU[var3] && var2.equals(com.rsc.g.l.a(this.nU[var3]))) {
                  this.a(h.ml, (String)null, (String)null, "Please remove " + var1 + " from your ignore list first.", 0);
                  return;
               }
            }

            if (!var2.equals(com.rsc.g.l.a(this.oA.mU))) {
               this.n().aO(195);
               this.n().q(var1);
               this.n().dW();
            } else {
               this.a(h.ml, (String)null, (String)null, "You can't add yourself to your own friend list.", 0);
            }
         }
      }

   }

   public final void f(String var1) {
      if (this.rx >= 100) {
         this.a(h.ml, (String)null, (String)null, "Ignore list full", 0);
      } else {
         String var2 = com.rsc.g.l.a(var1);
         if (var2 != null) {
            int var3;
            for(var3 = 0; var3 < this.rx; ++var3) {
               if (var2.equals(com.rsc.g.l.a(this.nU[var3]))) {
                  this.a(h.ml, (String)null, (String)null, var1 + " is already on your ignore list", 0);
                  return;
               }

               if (this.nU[var3] != null && var2.equals(com.rsc.g.l.a(this.nU[var3]))) {
                  this.a(h.ml, (String)null, (String)null, var1 + " is already on your ignore list", 0);
                  return;
               }
            }

            for(var3 = 0; var3 < this.rw; ++var3) {
               if (var2.equals(com.rsc.g.l.a(this.nT[var3]))) {
                  this.a(h.ml, (String)null, (String)null, "Please remove " + var1 + " from your friends list first", 0);
                  return;
               }
            }

            if (!var2.equals(com.rsc.g.l.a(this.oA.mU))) {
               this.n().aO(132);
               this.n().q(var1);
               this.n().dW();
            } else {
               this.a(h.ml, (String)null, (String)null, "You can't add yourself to your ignore list", 0);
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
      k var2 = this.nl[var1];
      int var3 = 2203 - this.oq - this.ot - this.ox;
      if (this.op + this.os + this.ow >= 2640) {
         var3 = -50;
      }

      int var4 = 0;
      if (this.oA.mK > 0 && var2.mK > 0) {
         var4 = this.oA.mK - var2.mK;
      }

      String var5 = var2.mU;
      String var6 = " " + this.av(var4) + "(level-" + var2.mK + ")";
      if (this.qO >= 0) {
         if (com.rsc.a.a.n(this.qO).aS() == 1 || com.rsc.a.a.n(this.qO).aS() == 2) {
            this.om.a(com.rsc.c.d.dR, "Cast " + com.rsc.a.a.n(this.qO).ad() + " on", "@whi@" + var5 + var6, var2.cd(), this.qO);
         }
      } else if (this.qN >= 0) {
         this.om.a(com.rsc.c.d.dQ, "Use " + this.pR + " with", "@whi@" + var5 + var6, var2.cd(), this.qN);
      } else {
         if (var3 > 0 && (var2.ch() - 64) / 128 - (-this.ox - this.oq) < 2203) {
            com.rsc.c.d var7 = com.rsc.c.d.dP;
            if (var4 >= 0 && var4 < 5) {
               var7 = com.rsc.c.d.dO;
            }

            this.om.a(var7, "Attack", "@whi@" + var5 + var6, var2.cd());
         } else if (this.ou) {
            this.om.a(com.rsc.c.d.dN, "Duel with", "@whi@" + var5 + var6, var2.cd());
         }

         this.om.a(com.rsc.c.d.dM, "Trade with", "@whi@" + var5 + var6, var2.cd());
         this.om.a(com.rsc.c.d.dL, "Follow", "@whi@" + var5 + var6, var2.cd());
         this.om.a(com.rsc.c.d.dK, "@whi@" + var5 + var6, "Report abuse", var2.mU);
         if (this.qT && this.ok || this.qT && this.oI) {
            this.om.a(com.rsc.c.d.eU, "Summon", var5, var5);
            this.om.a(com.rsc.c.d.eV, "Goto", var5, var5);
            this.om.a(com.rsc.c.d.eW, "Jail", var5, var5);
            if (this.ok) {
               this.om.a(com.rsc.c.d.eY, "Check", var5, var5);
            }

            this.om.a(com.rsc.c.d.eX, "Kick", var5, var5);
         }
      }

   }

   private void cG() {
      this.pH = 0;
      this.a(h.ml, (String)null, "@cya@", "Sorry, you can't logout at the moment", 0);
   }

   private void cH() {
      this.nX = "";
      this.nY = "";
   }

   protected void q() {
      this.a(true);
      this.D.I();
   }

   protected void a(boolean var1) {
      if (var1 && null != this.n()) {
         this.n().aO(31);
         this.n().dW();
         this.s();
      }

      this.ds();
   }

   private void cI() {
      this.qz = new com.rsc.c.e(this.dB(), 100);
      this.qz.a(256, 10, "Please design Your Character", 4, true);
      short var1 = 140;
      byte var2 = 34;
      int var3 = var1 + 116;
      int var4 = var2 - 10;
      this.qz.a(var3 - 55, var4 + 110, "Front", 3, true);
      this.qz.a(var3, var4 + 110, "Side", 3, true);
      this.qz.a(var3 + 55, 110 + var4, "Back", 3, true);
      var4 += 145;
      byte var5 = 54;
      this.qz.e(var3 - var5, var4, 53, 41);
      this.qz.a(var3 - var5, var4 - 8, "Head", 1, true);
      this.qz.a(var3 - var5, var4 + 8, "Type", 1, true);
      this.qz.a(var3 - var5 - 40, var4, this.dB().b("interfaceutil", 7));
      this.pb = this.qz.c(-40 - var5 + var3, var4, 20, 20);
      this.qz.a(var3 - var5 + 40, var4, this.dB().b("interfaceutil", 6));
      this.pc = this.qz.c(var3 + (40 - var5), var4, 20, 20);
      this.qz.e(var3 + var5, var4, 53, 41);
      this.qz.a(var3 + var5, var4 - 8, "Hair", 1, true);
      this.qz.a(var5 + var3, 8 + var4, "Color", 1, true);
      this.qz.a(var5 + (var3 - 40), var4, this.dB().b("interfaceutil", 7));
      this.pV = this.qz.c(var3 + var5 - 40, var4, 20, 20);
      this.qz.a(40 + var5 + var3, var4, this.dB().b("interfaceutil", 6));
      this.pN = this.qz.c(40 + var5 + var3, var4, 20, 20);
      var4 += 50;
      this.qz.e(var3 - var5, var4, 53, 41);
      this.qz.a(var3 - var5, var4, "Gender", 1, true);
      this.qz.a(var3 - var5 - 40, var4, this.dB().b("interfaceutil", 7));
      this.pQ = this.qz.c(var3 - 40 - var5, var4, 20, 20);
      this.qz.a(40 - var5 + var3, var4, this.dB().b("interfaceutil", 6));
      this.pZ = this.qz.c(40 + (var3 - var5), var4, 20, 20);
      this.qz.e(var5 + var3, var4, 53, 41);
      this.qz.a(var5 + var3, var4 - 8, "Top", 1, true);
      this.qz.a(var5 + var3, 8 + var4, "Color", 1, true);
      this.qz.a(var3 + (var5 - 40), var4, this.dB().b("interfaceutil", 7));
      this.qe = this.qz.c(var5 + (var3 - 40), var4, 20, 20);
      this.qz.a(40 + var5 + var3, var4, this.dB().b("interfaceutil", 6));
      this.pP = this.qz.c(var3 - (-var5 - 40), var4, 20, 20);
      var4 += 50;
      this.qz.e(var3 - var5, var4, 53, 41);
      this.qz.a(var3 - var5, var4 - 8, "Skin", 1, true);
      this.qz.a(var3 - var5, var4 + 8, "Color", 1, true);
      this.qz.a(var3 - 40 - var5, var4, this.dB().b("interfaceutil", 7));
      this.qj = this.qz.c(var3 - var5 - 40, var4, 20, 20);
      this.qz.a(var3 - var5 + 40, var4, this.dB().b("interfaceutil", 6));
      this.pX = this.qz.c(var3 + (40 - var5), var4, 20, 20);
      this.qz.e(var5 + var3, var4, 53, 41);
      this.qz.a(var5 + var3, var4 - 8, "Bottom", 1, true);
      this.qz.a(var5 + var3, var4 + 8, "Color", 1, true);
      this.qz.a(var5 - 40 + var3, var4, this.dB().b("interfaceutil", 7));
      this.qb = this.qz.c(var3 - (40 - var5), var4, 20, 20);
      this.qz.a(var3 + var5 + 40, var4, this.dB().b("interfaceutil", 6));
      this.pJ = this.qz.c(40 + var5 + var3, var4, 20, 20);
      var4 += 82;
      var4 -= 35;
      this.qz.d(var3, var4, 200, 30);
      this.qz.a(var3, var4, "Accept", 4, false);
      this.pO = this.qz.c(var3, var4, 200, 30);
   }

   private void cJ() {
      this.qB = new com.rsc.c.e(this.dB(), 50);
      byte var1 = 40;
      if (c.A()) {
         var1 = -125;
      }

      this.qB.a(256, 200 + var1, "Welcome to " + c.Y, 4, true);
      this.qB.a(256, 215 + var1, "You need to create an account on rscvanilla.com to use this server", 4, true);
      this.qB.d(256, var1 + 250, 200, 35);
      this.qB.a(256, var1 + 250, "Click here to login", 5, false);
      this.pU = this.qB.c(256, 250 + var1, 200, 35);
      this.qA = new com.rsc.c.e(this.dB(), 50);
      int var2 = c.A() ? 30 : 230;
      this.pe = this.qA.a(256, var2 - 30, "", 4, true);
      this.pf = this.qA.a(256, var2 - 10, c.A() ? "Press the back button to open keyboard" : "Please enter your username and password", 4, true);
      int var3 = var2 + 28;
      this.qA.d(140, var3, 200, 40);
      this.qA.a(140, var3 - 10, "Username:", 4, false);
      this.pg = this.qA.a(140, 10 + var3, 200, 320, 40, 4, false, false);
      var3 += 47;
      this.qA.d(190, var3, 200, 40);
      this.qA.a(190, var3 - 10, "Password:", 4, false);
      this.pd = this.qA.a(190, 10 + var3, 200, 20, 40, 4, true, false);
      var3 -= 55;
      this.qA.d(410, var3, 120, 25);
      this.qA.a(410, var3, "Ok", 4, false);
      this.pK = this.qA.c(410, var3, 120, 25);
      var3 += 30;
      this.qA.d(410, var3, 120, 25);
      this.qA.a(410, var3, "Cancel", 4, false);
      this.qg = this.qA.c(410, var3, 120, 25);
      this.qA.O(this.pg);
   }

   private void cK() {
      this.qH = new com.rsc.c.e(this.dB(), 10);
      this.qD = this.qH.c(5, 269, 502, 56, 20, 1, true);
      this.qE = this.qH.b(7, 324, 498, 14, 1, 80, false, true);
      this.qG = this.qH.c(5, 269, 502, 56, 20, 1, true);
      this.qF = this.qH.c(5, 269, 502, 56, 20, 1, true);
      this.qH.O(this.qE);
   }

   private void k(int var1, int var2, int var3, int var4, int var5) {
      if (this.nk[var5] == null) {
         this.nk[var5] = new j();
         this.nk[var5].ao(var5);
      }

      boolean var6 = false;

      for(int var7 = 0; var7 < this.qt; ++var7) {
         if (this.nj[var7].cd() == var5) {
            var6 = true;
            break;
         }
      }

      j var9 = this.nk[var5];
      var9.an(var2);
      var9.ao(var5);
      var9.at(var1);
      if (var6) {
         int var8 = var9.mP;
         if (var3 != var9.mQ[var8] || var4 != var9.mR[var8]) {
            var9.mP = var8 = (1 + var8) % 10;
            var9.u(var8, var3, var4);
         }
      } else {
         var9.u(0, var3, var4);
         var9.C(var3, var4);
         var9.ap(var1);
         var9.cw();
      }

      this.ni[this.qu++] = var9;
   }

   private k v(int var1, int var2, int var3, int var4) {
      if (null == this.nn[var1]) {
         this.nn[var1] = new k();
         this.nn[var1].ao(var1);
      }

      k var5 = this.nn[var1];
      boolean var6 = false;

      int var7;
      for(var7 = 0; var7 < this.pC; ++var7) {
         if (this.nm[var7].cd() == var1) {
            var6 = true;
            break;
         }
      }

      if (var6) {
         var5.at(var4);
         var7 = var5.mP;
         if (var2 != var5.mQ[var7] || var5.mR[var7] != var3) {
            var5.mP = var7 = (1 + var7) % 10;
            var5.u(var7, var2, var3);
         }
      } else {
         var5.ao(var1);
         var5.cw();
         var5.u(0, var2, var3);
         var5.C(var2, var3);
         var5.ap(var4);
         var5.at(var4);
      }

      this.nl[this.qL++] = var5;
      return var5;
   }

   private void cL() {
      if (this.qO >= 0 || this.qN >= 0) {
         this.om.a(com.rsc.c.d.dV, "", "Cancel");
      }

      this.om.bg();
      int var1 = this.om.bf();

      int var2;
      for(var2 = var1; var2 > 20; --var2) {
         this.om.F(var2 - 1);
      }

      int var3;
      int var4;
      String var5;
      if (this.qZ == 5) {
         var5 = null;
         if (this.qK == 0 && this.qd != -1) {
            if (this.qd >= 0) {
               String var6 = "";
               var4 = this.qd;
               if (this.nV[var4] == 0) {
                  var5 = this.nT[var4];
                  var6 = " is offline";
               } else {
                  var5 = "Click to message " + this.nT[var4];
               }

               var5 = var5 + var6;
            } else {
               var3 = -(2 + this.qd);
               var5 = "Click to remove " + this.nT[var3];
            }
         }

         if (this.qK == 1 && this.pY != -1) {
            if (this.pY >= 0) {
               var3 = this.pY;
               var5 = "Ignoring " + this.nU[var3];
            } else {
               var3 = -(2 + this.pY);
               var5 = "Click to remove " + this.nU[var3];
            }
         }

         if (var5 != null) {
            this.dB().a((String)var5, 6, 14, 16776960, c.A() ? c.ar : 1);
         }
      }

      var2 = this.om.bf();
      if (var2 > 0) {
         var3 = -1;

         for(var4 = 0; var4 < var2; ++var4) {
            var5 = this.om.w(var4);
            if (null != var5 && var5.length() > 0) {
               var3 = var4;
               break;
            }
         }

         var5 = null;
         if ((this.qN >= 0 || this.qO >= 0) && var2 == 1) {
            var5 = "Choose a target";
         } else if ((this.qN >= 0 || this.qO >= 0) && var2 > 1) {
            var5 = "@whi@" + this.om.x(0) + " " + this.om.w(0);
         } else if (var3 != -1) {
            var5 = this.om.w(var3) + ": @whi@" + this.om.x(0);
         }

         if (var2 == 2 && null != var5) {
            var5 = var5 + "@whi@ / 1 more option";
         }

         if (var2 > 2 && var5 != null) {
            var5 = var5 + "@whi@ / " + (var2 - 1) + " more options";
         }

         if (null != var5) {
            this.dB().a((String)var5, 6, 14, 16776960, c.A() ? c.ar : 1);
         }

         if (!this.rz && this.s == 1 || this.rz && this.s == 1 && var2 == 1) {
            if (this.nZ && this.oj && this.qk) {
               this.n().aO(59);
               this.n().aL(this.qc);
               this.n().aL(this.pL);
               this.n().dW();
            } else {
               this.aF(0);
            }

            this.s = 0;
         } else if (!this.rz && this.s == 2 || this.rz && this.s == 1) {
            int var8 = this.om.au();
            int var7 = this.om.av();
            this.on = this.u() - var8 / 2;
            this.ov = true;
            this.oo = this.w() - 7;
            this.s = 0;
            if (this.oo + var7 > this.av() - 19) {
               this.oo = this.av() - 19 - var7;
            }

            if (var8 + this.on > this.au() - 2) {
               this.on = this.au() - 2 - var8;
            }

            if (this.on < 0) {
               this.on = 0;
            }

            if (this.oo < 0) {
               this.oo = 0;
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

      var12.gx = var5 + 10000;
      return var12;
   }

   protected void g() {
      if (this.di()) {
         this.dj();
      }

      if (this.I) {
         this.M.c(true);
         byte var1 = 35;
         this.M.b(30, var1, "An error has occured and the game has crashed(", 5, 16776960, -1);
         byte var3 = (byte)(var1 + 50);
         this.D.G();
      } else {
         if (this.oU > 0 && this.oK) {
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
               if (null == this.dB()) {
                  return;
               }

               if (this.po == f.rJ) {
                  this.dB().jn = false;
                  this.cZ();
               }

               if (this.po == f.rK) {
                  this.dB().jn = true;
                  this.cW();
               }
            } catch (OutOfMemoryError var2) {
               var2.printStackTrace();
               this.K = true;
            }

         }
      }
   }

   private void cM() {
      this.dB().ja = false;
      this.dB().c(true);
      this.qz.bi();
      short var1 = 140;
      int var2 = var1 + 116;
      byte var3 = 50;
      int var4 = var3 - 25;
      com.rsc.c.k var10000 = this.dB();
      int var10001 = var2 - 87;
      int var10002 = this.dE()[this.pW];
      com.rsc.c.k var10003 = this.dB();
      this.getClass();
      var10000.a(var10001, var10002, (com.rsc.a.b.c)var10003.c(com.rsc.a.a.m(2).ad(), 0), var4, 102, 64);
      this.dB().a(this.dB().c(com.rsc.a.a.m(this.pM).ad(), 0), var2 - 32 - 55, var4, 64, 102, this.dE()[this.bG], this.dF()[this.bI], false, 0, 1);
      this.dB().a(this.dB().c(com.rsc.a.a.m(this.oT).ad(), 0), var2 - 32 - 55, var4, 64, 102, this.dD()[this.bF], this.dF()[this.bI], false, 0, 1);
      var10000 = this.dB();
      var10001 = var2 - 32;
      var10002 = this.dE()[this.pW];
      var10003 = this.dB();
      this.getClass();
      var10000.a(var10001, var10002, (com.rsc.a.b.c)var10003.c(com.rsc.a.a.m(2).ad(), 6), var4, 102, 64);
      this.dB().a(this.dB().c(com.rsc.a.a.m(this.pM).ad(), 6), var2 - 32, var4, 64, 102, this.dE()[this.bG], this.dF()[this.bI], false, 0, 1);
      this.dB().a(this.dB().c(com.rsc.a.a.m(this.oT).ad(), 6), var2 - 32, var4, 64, 102, this.dD()[this.bF], this.dF()[this.bI], false, 0, 1);
      var10000 = this.dB();
      var10001 = var2 + 55 - 32;
      var10002 = this.dE()[this.pW];
      var10003 = this.dB();
      this.getClass();
      var10000.a(var10001, var10002, (com.rsc.a.b.c)var10003.c(com.rsc.a.a.m(2).ad(), 12), var4, 102, 64);
      this.dB().a(this.dB().m(this.pM, 12), 55 + (var2 - 32), var4, 64, 102, this.dE()[this.bG], this.dF()[this.bI], false, 0, 1);
      this.dB().a(this.dB().m(this.oT, 12), var2 + 55 - 32, var4, 64, 102, this.dD()[this.bF], this.dF()[this.bI], false, 0, 1);
      this.dB().a((com.rsc.a.b.c)this.dB().b("interfaces", 20), 0, this.av());
   }

   private void cN() {
      int var1;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      for(var1 = 0; this.oW > var1; ++var1) {
         com.rsc.e.b var2 = this.np[var1];
         var3 = this.dB().ac(c.ab);
         var4 = var2.bV();
         var5 = var2.bW();
         var6 = var2.au();
         var7 = var2.av();
         boolean var8 = true;

         while(var8) {
            var8 = false;

            for(int var9 = 0; var9 < var1; ++var9) {
               com.rsc.e.b var10 = this.np[var9];
               if (var10.bV() + var10.au() > var4 - var6 && var6 + var4 > var10.bV() - var10.au() && var10.bW() - var3 < var5 + var7 && var5 - var3 < var10.bW() + var10.av() && var10.bW() - var7 - var3 < var5) {
                  var5 = var10.bW() - (var3 + var7);
                  var8 = true;
               }
            }
         }

         var2.al(var5);
         this.dB().a(var2.bY(), var4, var5, 300, c.ab, 16776960, false);
      }

      for(var1 = 0; this.oV > var1; ++var1) {
         com.rsc.e.a var11 = this.no[var1];
         var3 = var11.bU();
         var4 = var11.bX() * 39 / 100;
         var5 = var11.bX() * 27 / 100;
         var6 = var11.bX() * 36 / 100;
         var7 = var11.bX() * 24 / 100;
         int var13 = var11.bW() - var5;
         com.rsc.a.a.f var14 = com.rsc.a.a.l(var11.bU());
         this.dB().a((com.rsc.a.b.c)this.dB().b("interfaces", 7), var13, var11.bV() - var4 / 2, var4, var5, 85);
         this.dB().a(this.dB().ad(var3), var11.bV() - var6 / 2, var13 - var7 / 2 + var5 / 2, var6, var7, var14.aB(), 0, 0, 255, false, 0, 1);
      }

      for(var1 = 0; var1 < this.oX; ++var1) {
         com.rsc.e.c var12 = this.nq[var1];
         this.dB().g(var12.bV() - 15, var12.bW() - 3, var12.bZ(), 5, 65280, 192);
         this.dB().g(var12.bZ() - 15 + var12.bV(), var12.bW() - 3, 30 - var12.bZ(), 5, 16711680, 192);
      }

   }

   private void cO() {
      if (!c.A()) {
         this.dB().a(this.dB().ae(20), 0, this.av(), this.au(), 10, 0, 0, false, 0, 1);
      }

      this.dB().a(this.dB().ae(21), this.au() / 2 - 256, this.av() - 4);
      int var1 = com.rsc.g.f.a(200, 200, 255);
      if (this.qp == com.rsc.b.c.cG) {
         var1 = com.rsc.g.f.a(255, 200, 50);
      }

      if (this.qm % 30 > 15) {
         var1 = com.rsc.g.f.a(255, 50, 50);
      }

      this.dB().c(this.au() / 2 - 200, 6 + this.av(), "All messages", var1, 0, -1);
      var1 = com.rsc.g.f.a(200, 200, 255);
      if (this.qp == com.rsc.b.c.cH) {
         var1 = com.rsc.g.f.a(255, 200, 50);
      }

      if (this.ql % 30 > 15) {
         var1 = com.rsc.g.f.a(255, 50, 50);
      }

      this.dB().c(this.au() / 2 - 100, this.av() + 6, "Chat history", var1, 0, -1);
      var1 = com.rsc.g.f.a(200, 200, 255);
      if (this.qp == com.rsc.b.c.cI) {
         var1 = com.rsc.g.f.a(255, 200, 50);
      }

      if (this.qo % 30 > 15) {
         var1 = com.rsc.g.f.a(255, 50, 50);
      }

      this.dB().c(this.au() / 2, 6 + this.av(), "Quest history", var1, 0, -1);
      var1 = com.rsc.g.f.a(200, 200, 255);
      if (this.qp == com.rsc.b.c.cJ) {
         var1 = com.rsc.g.f.a(255, 200, 50);
      }

      if (this.qn % 30 > 15) {
         var1 = com.rsc.g.f.a(255, 50, 50);
      }

      this.dB().c(this.au() / 2 + 100, this.av() + 6, "Private history", var1, 0, -1);
      this.dB().c(this.au() / 2 + 200, this.av() + 6, "Report abuse", 16777215, 0, -1);
   }

   private void cP() {
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
               this.pa = var4 - 1;
               this.n().aO(29);
               this.n().aK(this.pa);
               this.n().dW();
               break;
            }
         }
      }

      for(var4 = 0; var4 < 5; ++var4) {
         if (1 + this.pa == var4) {
            this.dB().g(var1, var2 + var4 * 20, var3, 20, com.rsc.g.f.a(255, 0, 0), 128);
         } else {
            this.dB().g(var1, var2 + var4 * 20, var3, 20, com.rsc.g.f.a(190, 190, 190), 128);
         }

         this.dB().m(var1, var2 + var4 * 20, var3, 0);
         this.dB().m(var1, 20 + var2 + var4 * 20, var3, 0);
      }

      this.dB().c(var3 / 2 + var1, 16 + var2, (c.A() ? "C" : "Select c") + "ombat style", 16777215, 3, -1);
      this.dB().c(var3 / 2 + var1, var2 + 36, "Controlled (+1 " + (c.A() ? "all" : "of each") + ")", 0, 3, -1);
      this.dB().c(var3 / 2 + var1, 56 + var2, "Aggressive (+3 " + (c.A() ? "str" : "strength") + ")", 0, 3, -1);
      this.dB().c(var3 / 2 + var1, var2 + 76, "Accurate   (+3 " + (c.A() ? "att" : "attack") + ")", 0, 3, -1);
      this.dB().c(var3 / 2 + var1, var2 + 96, "Defensive  (+3 " + (c.A() ? "def" : "defense") + ")", 0, 3, -1);
   }

   private void cQ() {
      this.dB().e(126, 137, 260, 60, 0);
      this.dB().f(126, 260, 137, 60, 16777215);
      this.dB().c(256, 173, "Logging out...", 16777215, 5, 0);
   }

   private void cR() {
      if (c.A()) {
         byte var1 = 35;
         byte var2 = 0;
         byte var3 = 20;
         int var4 = 0;
         int var5 = 0;

         int var6;
         int var7;
         for(var6 = 0; var6 < this.nA; ++var6) {
            var7 = this.dB().c(c.ar, "(" + (var6 + 1) + ")" + this.pI[var6]) + 15;
            if (var4 < var7) {
               var4 = var7;
            }

            if (var5 < var1 + var6 * var3 + 20) {
               var5 = var1 + var6 * var3 + 20;
            }
         }

         if (this.s != 0) {
            for(var6 = 0; var6 < this.nA; ++var6) {
               if (this.A > var2 && this.A < var2 + var4 && this.B > var1 + var6 * var3 - 15 && this.B < var1 + var6 * var3) {
                  this.n().aO(116);
                  this.n().aK(var6);
                  this.n().dW();
                  break;
               }
            }

            this.s = 0;
            this.qY = false;
            return;
         }

         for(var6 = 0; var6 < this.nA; ++var6) {
            var7 = 65535;
            if (this.A > var2 && this.A < var2 + var4 && this.B > var1 + var6 * var3 - 15 && this.B < var1 + var6 * var3) {
               var7 = 16711680;
            }

            this.dB().a("(" + (var6 + 1) + ")" + this.pI[var6], var2 + 10, var1 + var6 * var3, var7, c.ar);
         }
      } else {
         int var8;
         if (this.s == 0) {
            for(var8 = 0; this.nA > var8; ++var8) {
               int var9 = 65535;
               if (this.A < this.dB().c(1, this.pI[var8]) && this.B > var8 * 12 && this.B < var8 * 12 + 12) {
                  var9 = 16711680;
               }

               this.dB().a((String)this.pI[var8], 6, var8 * 12 + 12, var9, 1);
            }
         } else {
            for(var8 = 0; var8 < this.nA; ++var8) {
               if (this.dB().c(1, this.pI[var8]) > this.A && var8 * 12 < this.B && 12 + var8 * 12 > this.B) {
                  this.n().aO(116);
                  this.n().aK(var8);
                  this.n().dW();
                  break;
               }
            }

            this.qY = false;
            this.s = 0;
         }
      }

   }

   private void cS() {
      short var1 = 400;
      short var2 = 100;
      if (this.qQ) {
         var2 = 300;
      }

      this.dB().e(256 - var1 / 2, 167 - var2 / 2, var1, var2, 0);
      this.dB().f(256 - var1 / 2, var1, 167 - var2 / 2, var2, 16777215);
      this.dB().a(this.qP, 256, 167 - (var2 / 2 - 20), var1 - 40, 1, 16777215, true);
      int var3 = 157 + var2 / 2;
      int var4 = 16777215;
      if (var3 - 12 < this.w() && var3 >= this.w() && this.u() > 106 && this.u() < 406) {
         var4 = 16711680;
      }

      this.dB().c(256, var3, "Click here to close window", var4, 1, -1);
      if (this.s == 1) {
         if (var4 == 16711680) {
            this.qX = false;
         }

         if ((this.u() < 256 - var1 / 2 || var1 / 2 + 256 < this.u()) && (this.w() < 167 - var2 / 2 || this.w() > 167 + var2 / 2)) {
            this.qX = false;
         }
      }

      this.s = 0;
   }

   private void cT() {
      int var1 = 65;
      if (this.rn > 0) {
         var1 += 30;
      }

      if (!this.rl.equalsIgnoreCase("0.0.0.0")) {
         var1 += 45;
      }

      int var2 = (this.au() - 400) / 2;
      int var3 = (this.av() - var1) / 2;
      this.dB().e(var2, var3, 400, var1, 0);
      this.dB().f(var2, 400, var3, var1, 16777215);
      int var4 = var3 + 20;
      this.dB().a(var2 + 256 - 56, "Welcome to RuneScape " + this.oA.mU, 16776960, -1, 4, var4);
      var4 += 30;
      String var5;
      if (this.rj == 0) {
         var5 = "earlier today";
      } else if (this.rj != 1) {
         var5 = this.rj + " days ago";
      } else {
         var5 = "yesterday";
      }

      if (!this.rl.equalsIgnoreCase("0.0.0.0")) {
         this.dB().a(var2 + 256 - 56, "You last logged in " + var5, 16777215, -1, 1, var4);
         var4 += 15;
         if (this.rk == null) {
            this.rk = this.cU();
         }

         this.dB().a(var2 + 256 - 56, "from: " + this.rk, 16777215, -1, 1, var4);
         var4 += 15;
         var4 += 15;
      }

      if (this.rn > 0) {
         if (this.rn == 1) {
            this.dB().a(var2 + 256 - 56, "You have @yel@0@whi@ unread messages in your message-centre", 16777215, -1, 1, var4);
         } else {
            this.dB().a(var2 + 256 - 56, "You have @gre@" + (this.rn - 1) + " unread messages @whi@in your message-centre", 16777215, -1, 1, var4);
         }

         var4 += 15;
         var4 += 15;
      }

      int var6 = 16777215;
      if (c.A()) {
         this.dB().g(150, var4 - 20, 207, var4 - (var4 - 12) + 20, 3158064, 160);
         this.dB().f(150, 207, var4 - 20, var4 - (var4 - 12) + 20, 4210752);
         if (this.B >= var4 - 20 && this.B <= var4 - 20 + var4 - (var4 - 12) + 20 && this.A >= 150 && this.A < 357) {
            var6 = 16711680;
         }
      } else if (this.B > var4 - 12 && this.B <= var4 && this.A > var2 + 106 - 56 && this.A < var2 + 406 - 56) {
         var6 = 16711680;
      }

      this.dB().a(var2 + 256 - 56, "Click here to close window", var6, -1, 1, var4);
      if (this.s == 1) {
         if (var6 == 16711680) {
            this.qW = false;
         }

         if ((this.A < var2 + 86 - 56 || this.A > var2 + 426 - 56) && (this.B < 167 - var3 || var3 + 167 < this.B)) {
            this.qW = false;
         }
      }

      this.s = 0;
   }

   private String cU() {
      return this.rl;
   }

   private void cV() {
      this.dB().e(86, 77, 340, 180, 0);
      byte var1 = 97;
      this.dB().f(86, 340, 77, 180, 16777215);
      this.dB().c(256, var1, "Warning! Proceed with caution", 16711680, 4, -1);
      int var2 = var1 + 26;
      this.dB().c(256, var2, "If you go much further north you will enter the", 16777215, 1, -1);
      var2 += 13;
      this.dB().c(256, var2, "wilderness. This a very dangerous area where", 16777215, 1, -1);
      var2 += 13;
      this.dB().c(256, var2, "other players can attack you!", 16777215, 1, -1);
      var2 += 22;
      this.dB().c(256, var2, "The further north you go the more dangerous it", 16777215, 1, -1);
      var2 += 13;
      this.dB().c(256, var2, "becomes, but the more treasure you will find.", 16777215, 1, -1);
      var2 += 22;
      this.dB().c(256, var2, "In the wilderness an indicator at the bottom-right", 16777215, 1, -1);
      var2 += 13;
      this.dB().c(256, var2, "of the screen will show the current level of danger", 16777215, 1, -1);
      var2 += 22;
      int var3 = 16777215;
      if (this.w() > var2 - 12 && this.w() <= var2 && this.u() > 181 && this.u() < 331) {
         var3 = 16711680;
      }

      this.dB().c(256, var2, "Click here to close window", var3, 1, -1);
      if (this.s != 0) {
         if (var2 - 12 < this.w() && var2 >= this.w() && this.u() > 181 && this.u() < 331) {
            this.ra = 2;
         }

         this.s = 0;
         if (this.u() < 86 || this.u() > 426 || this.w() < 77 || this.w() > 257) {
            this.ra = 2;
         }
      }

   }

   private void cW() {
      if (this.pp != 0) {
         this.dB().by();
         this.dB().c(this.au() / 2, this.av() / 2, "Oh dear! You are dead...", 16711680, 7, -1);
         this.cO();
      } else if (this.qU) {
         this.cM();
      } else if (this.pB) {
         this.cX();
      } else if (this.N.jK) {
         int var1;
         for(var1 = 0; var1 < 64; ++var1) {
            this.L.c(this.N.jM[this.ol][var1]);
            if (this.ol == 0) {
               this.L.c(this.N.jL[1][var1]);
               this.L.c(this.N.jM[1][var1]);
               this.L.c(this.N.jL[2][var1]);
               this.L.c(this.N.jM[2][var1]);
            }

            this.O.c = true;
            if (this.ol == 0 && (this.N.jG[this.oA.cg() / 128][this.oA.ch() / 128] & 128) == 0 && c.ah) {
               this.L.b(this.N.jM[this.ol][var1]);
               if (this.ol == 0 && c.ah) {
                  this.L.b(this.N.jL[1][var1]);
                  this.L.b(this.N.jM[1][var1]);
                  this.L.b(this.N.jL[2][var1]);
                  this.L.b(this.N.jM[2][var1]);
               }

               this.O.c = false;
            }
         }

         com.rsc.e.e var2;
         int var3;
         int var4;
         for(var1 = 0; var1 < this.pr; ++var1) {
            var2 = this.oC[var1];
            var3 = var2.ce();
            var4 = var2.cf();
            if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var2.at() == 74) {
               var2.cj().b(1, 0, 0);
            }
         }

         if (this.qx != this.pD) {
            this.pD = this.qx;

            for(var1 = 0; var1 < this.pr; ++var1) {
               var2 = this.oC[var1];
               if (var2.at() == 97) {
                  this.a(var2, "firea" + (this.qx + 1));
               }

               if (var2.at() == 274) {
                  this.a(var2, "fireplacea" + (this.qx + 1));
               }

               if (var2.at() == 1031) {
                  this.a(var2, "lightning" + (1 + this.qx));
               }

               if (var2.at() == 1036) {
                  this.a(var2, "firespell" + (this.qx + 1));
               }

               if (var2.at() == 1147) {
                  this.a(var2, "spellcharge" + (1 + this.qx));
               }
            }
         }

         if (this.pE != this.qy) {
            this.pE = this.qy;

            for(var1 = 0; this.pr > var1; ++var1) {
               var2 = this.oC[var1];
               if (var2.at() == 51) {
                  this.a(var2, "torcha" + (1 + this.qy));
               }

               if (var2.at() == 143) {
                  this.a(var2, "skulltorcha" + (1 + this.qy));
               }
            }
         }

         if (this.qw != this.pF) {
            this.pF = this.qw;

            for(var1 = 0; this.pr > var1; ++var1) {
               var2 = this.oC[var1];
               if (var2.at() == 1142) {
                  this.a(var2, "clawspell" + (1 + this.qw));
               }
            }
         }

         this.L.Z(this.rc);
         this.rc = 0;

         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         for(var1 = 0; this.qL > var1; ++var1) {
            k var13 = this.nl[var1];
            if (var13.mN > 0 && var13.cx() != null) {
               com.rsc.e.i var14 = var13.cx();
               var4 = var13.cg();
               var5 = var13.ch();
               var6 = -this.N.p(var4, var5) - 110;
               var7 = var14.cg();
               var8 = var14.ch();
               var9 = -this.N.p(var7, var8) - com.rsc.a.a.k(var13.at()).aH() / 2;
               var10 = (var7 * (40 - var13.mN) + var4 * var13.mN) / 40;
               var11 = (var6 * var13.mN + var9 * (40 - var13.mN)) / 40;
               var12 = ((40 - var13.mN) * var8 + var5 * var13.mN) / 40;
               this.L.a(var13.mJ, 0, var10, var12, 32, 32, var11);
               ++this.rc;
            }

            if (var13.mW != 255) {
               var3 = -this.N.p(var13.cg(), var13.ch());
               var4 = this.L.a(var1 + 5000, var1 + 10000, var13.cg(), var13.ch(), 145, 220, var3);
               ++this.rc;
               if (this.oA == var13) {
                  this.L.aa(var4);
               }

               if (var13.ck() == 8) {
                  this.L.k(var4, -30);
               }

               if (var13.ck() == 9) {
                  this.L.k(var4, 30);
               }
            }
         }

         for(var1 = 0; var1 < this.qu; ++var1) {
            j var15 = this.ni[var1];
            var3 = var15.cg();
            var4 = var15.ch();
            if (var15.mN > 0 && var15.cx() != null) {
               com.rsc.e.i var19 = var15.cx();
               var6 = -this.N.p(var3, var4) - 110;
               var7 = var19.cg();
               var8 = var19.ch();
               var9 = -this.N.p(var7, var8) - com.rsc.a.a.k(var15.at()).aH() / 2;
               var10 = (var7 * (40 - var15.mN) + var3 * var15.mN) / 40;
               var11 = (var6 * var15.mN + var9 * (40 - var15.mN)) / 40;
               var12 = ((40 - var15.mN) * var8 + var4 * var15.mN) / 40;
               this.L.a(var15.mJ, 0, var10, var12, 32, 32, var11);
               ++this.rc;
            }

            var5 = -this.N.p(var3, var4);
            com.rsc.a.a.g var23 = com.rsc.a.a.k(var15.at());
            if (var23 != null) {
               var7 = this.L.a(20000 + var1, var1 + 30000, var3, var4, var23.aG(), var23.aH(), var5);
               ++this.rc;
               if (var15.ck() == 8) {
                  this.L.k(var7, -30);
               }

               if (var15.ck() == 9) {
                  this.L.k(var7, 30);
               }
            }
         }

         if (c.am != 1) {
            for(var1 = 0; var1 < this.ps; ++var1) {
               com.rsc.e.f var16 = this.oE[var1];
               var3 = var16.ce() * 128 + 64;
               var4 = var16.cf() * 128 + 64;
               if ((c.am != 3 || var16.at() != 20 && var16.at() != 413 && var16.at() != 814 && var16.at() != 604) && (c.am != 2 || var16.at() == 20 || var16.at() == 814 || var16.at() == 413 || var16.at() == 181 || var16.at() == 604)) {
                  this.L.a('鱀' + var16.at(), var1 + 20000, var3, var4, 96, 64, -this.N.p(var3, var4) - var16.cn());
                  ++this.rc;
               }
            }
         }

         for(var1 = 0; this.rg > var1; ++var1) {
            l var17 = this.nr[var1];
            var3 = var17.bV() * 128 + 64;
            var4 = var17.bW() * 128 + 64;
            var5 = var17.at();
            if (var5 == 0) {
               this.L.a('썐' + var1, var1 + '썐', var3, var4, 128, 256, -this.N.p(var3, var4));
               ++this.rc;
            }

            if (var5 == 1) {
               this.L.a(var1 + '썐', var1 + '썐', var3, var4, 128, 64, -this.N.p(var3, var4));
               ++this.rc;
            }
         }

         this.dB().ja = false;
         this.dB().c(true);
         this.dB().ja = this.oc;
         int var18;
         if (this.ol == 3) {
            var1 = 40 + (int)(3.0D * Math.random());
            var18 = (int)(7.0D * Math.random()) + 40;
            this.L.c(-50, var18, 0, -50, var1, -10);
         }

         this.oV = 0;
         this.oX = 0;
         this.oW = 0;
         this.O.a(this.L);
         this.L.bv();
         this.cN();
         if (this.v > 0) {
            this.dB().a(this.dB().ae(12 + (24 - this.v) / 6), this.w - 8, this.x - 8);
         } else if (this.v < 0) {
            this.dB().a(this.dB().ae(16 + (this.v + 24) / 6), this.w - 8, this.x - 8);
         }

         if (this.re != 0) {
            var1 = this.re / 50;
            var18 = var1 / 60;
            var1 %= 60;
            if (var1 < 10) {
               this.dB().c(256, this.av() - 7, "System update in: " + var18 + ":0" + var1, 16776960, 1, -1);
            } else {
               this.dB().c(256, this.av() - 7, "System update in: " + var18 + ":" + var1, 16776960, 1, -1);
            }
         }

         if (!this.pG) {
            var1 = -this.ot - this.ox - (this.oq - 2203);
            if (this.ow + this.os + this.op >= 2640) {
               var1 = -50;
            }

            if (var1 > 0) {
               this.rf = true;
               var18 = var1 / 6 + 1;
               this.dB().a(this.dB().ae(11), this.au() - 59, this.av() - 56);
               this.dB().c(this.au() - 47, this.av() - 20, "Wilderness", 16776960, 1, -1);
               this.dB().c(this.au() - 47, this.av() - 7, "Level: " + var18, 16776960, 1, -1);
               if (this.ra == 0) {
                  this.ra = 2;
               }
            } else {
               this.rf = false;
            }

            if (this.ra == 0 && var1 > -10 && var1 <= 0) {
               this.ra = 1;
            }
         }

         if (c.ai) {
            short var25 = 139;
            this.dB().a((String)("@gre@FPS: @gre@(@whi@" + this.S + "@gre@)"), 7, var25, 16777215, 0);
            if (this.ok || this.oI) {
               var1 = var25 + 13;
               if (this.rG) {
                  this.dB().a((String)"@dre@Invisible", 7, var1, 16777215, 0);
                  var1 += 13;
               }

               this.dB().a((String)("@gre@Tile: @gre@(@whi@" + (this.os + this.op) + "@gre@,@whi@" + (this.ot + this.oq) + "@gre@)"), 7, var1, 16777215, 0);
               var1 += 13;
               var18 = this.os + this.op + this.ow;
               var3 = this.ot + this.oq + this.ox;
               var4 = var18 / 48;
               var5 = var3 / 48;
               this.dB().a((String)("@gre@Sector: @whi@h" + this.ol + "@whi@x" + var4 + "@whi@y" + var5), 7, var1, 16777215, 0);
            }
         }

         if (c.A()) {
            if (c.an) {
               this.qH.b(this.qE, 5, 140, this.au() - 14, 14);
            } else {
               this.qH.b(this.qE, 5, this.av() - 12, this.au() - 14, 14);
            }
         }

         if (this.qp == com.rsc.b.c.cG) {
            for(var1 = 0; var1 < (c.ad ? 5 : 100); ++var1) {
               g var21 = this.oB[var1];
               if (var21 != null && var21.cq() > 0) {
                  String var20 = var21.cv();
                  String var22 = var21.cu() + com.rsc.g.l.a(var21.ct(), var21.cr(), var21.cp());
                  var5 = this.dB().ac(c.ab);
                  double var24 = (double)this.av();
                  if (c.A() && c.an) {
                     var24 = var24 / 2.5D + 8.0D;
                  }

                  this.dB().b(7, (int)(var24 - (double)(var1 * var5) - 18.0D), var22, c.ab, 16776960, var21.cs(), var20);
               }
            }
         }

         this.qH.K(this.qD);
         this.qH.K(this.qG);
         this.qH.K(this.qF);
         if (this.qp == com.rsc.b.c.cH) {
            this.qH.Q(this.qD);
         } else if (this.qp == com.rsc.b.c.cI) {
            this.qH.Q(this.qG);
         } else if (this.qp == com.rsc.b.c.cJ) {
            this.qH.Q(this.qF);
         }

         com.rsc.c.e.fc = 2;
         this.qH.bi();
         com.rsc.c.e.fc = 0;
         this.dB().a(this.dB().ae(0), this.dB().iT - 200, 3, 128);
         this.de();
         this.dB().jn = false;
         this.cO();
      }

   }

   private void cX() {
      this.dB().by();
      if (Math.random() < 0.15D) {
         this.dB().c((int)(Math.random() * 80.0D), (int)(334.0D * Math.random()), "ZZZ", (int)(1.6777215E7D * Math.random()), 5, -1);
      }

      if (0.15D > Math.random()) {
         this.dB().c(this.au() - (int)(80.0D * Math.random()), (int)(334.0D * Math.random()), "ZZZ", (int)(Math.random() * 1.6777215E7D), 5, -1);
      }

      this.dB().e(this.au() / 2 - 100, 160 - (c.A() ? 80 : 0), 200, 40, 0);
      if (c.A()) {
         this.dB().c(this.au() / 2, 31, "You are sleeping - Fatigue: " + this.pq * 100 / 750 + "%", 16776960, 7, 0);
      } else {
         this.dB().c(this.au() / 2, 50, "You are sleeping", 16776960, 7, 0);
         this.dB().c(this.au() / 2, 90, "Fatigue: " + this.pq * 100 / 750 + " % ", 16776960, 7, -1);
      }

      this.dB().c(this.au() / 2, 140 - (c.A() ? 80 : 0), "When you want to wake up just use your", 16777215, 5, -1);
      this.dB().c(this.au() / 2, 160 - (c.A() ? 80 : 0), "keyboard to type the word in the box below", 16777215, 5, -1);
      this.dB().c(this.au() / 2, 180 - (c.A() ? 80 : 0), this.oa + "*", 65535, 5, -1);
      if (null != this.rb) {
         this.dB().c(this.au() / 2, 260 - (c.A() ? 110 : 0), this.rb, 16711680, 5, -1);
      } else {
         this.dB().a(this.oJ, this.au() / 2 - 127, 230 - (c.A() ? 118 : 0));
      }

      this.dB().f(this.au() / 2 - 128, 257, 229 - (c.A() ? 118 : 0), 42, 16777215);
      this.cO();
      this.dB().c(this.au() / 2, 290 - (c.A() ? 110 : 0), "If you can't read the word", 16777215, 1, -1);
      this.dB().c(this.au() / 2, 305 - (c.A() ? 110 : 0), "@yel@click here@whi@ to get a different one", 16777215, 1, -1);
   }

   private void cY() {
      int var2;
      int var3;
      if (this.ob.length() <= 0 && !this.px) {
         if (this.pt.bd()) {
            StringBuilder var11 = new StringBuilder();

            for(var2 = 0; this.oa.length() > var2; ++var2) {
               char var15 = this.oa.charAt(var2);
               if (Character.isDigit(var15)) {
                  var11.append(var15);
               }
            }

            this.oa = var11.toString();
         }

         int var12 = this.au() / 2 - this.py / 2;
         var2 = this.av() / 2 - this.pv / 2;
         var3 = this.au() / 2;
         this.dB().e(var12, var2, this.py, this.pv, 0);
         this.dB().f(var12, this.py, var2, this.pv, 16777215);
         int var13 = this.dB().ac(1);
         int var5 = this.dB().ac(4);
         int var6 = var13 + 2;

         int var7;
         for(var7 = 0; var7 < this.pw.length; ++var7) {
            this.dB().c(var3, var6 * var7 + 5 + var2 + var13, this.pw[var7], 16776960, 1, -1);
         }

         if (this.pu) {
            this.dB().c(var3, var2 + 5 + var6 * this.pw.length + 3 + var5, this.oa + "*", 16777215, 4, -1);
         }

         var7 = var13 + 8 + var2 + var5 + 2 + this.pw.length * var6;
         int var8 = 16777215;
         if (this.u() > var3 - 60 && this.u() < var3 && var7 - var13 - 5 < this.w() && this.w() < var7 + 5) {
            var8 = 16776960;
            if (this.s != 0) {
               this.px = true;
               this.s = 0;
               this.ob = this.oa;
            }
         }

         this.dB().a((String)"OK", var3 - 35, var7, var8, 1);
         var8 = 16777215;
         if (this.u() > var3 + 10 && this.u() < var3 + 85 && this.w() > var7 - var13 - 5 && this.w() < var7 + 5) {
            var8 = 16776960;
            if (this.s != 0) {
               this.s = 0;
               this.pt = com.rsc.b.b.cu;
            }
         }

         this.dB().a((String)"Cancel", var3 + 30, var7, var8, 1);
         if (this.s == 1 && (this.u() < var12 || this.py + var12 < this.u() || this.w() < var2 || this.w() > this.pv + var2)) {
            this.pt = com.rsc.b.b.cu;
            this.s = 0;
         }
      } else {
         String var1 = this.ob.trim();
         this.oa = "";
         this.ob = "";
         this.pt.b(var1);
         if (this.pt == com.rsc.b.b.cv) {
            this.oF.A(this.g(var1), this.oF.lG);
         } else if (this.pt == com.rsc.b.b.cw) {
            this.oF.B(this.g(var1), this.oF.lG);
         } else {
            long var4;
            if (this.pt == com.rsc.b.b.cx) {
               try {
                  if (this.oR >= 0) {
                     var2 = this.oM[this.oR];
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
                  this.T.dW();
               } catch (NumberFormatException var10) {
                  System.out.println("Withdraw X number format exception: " + var10);
               }
            } else if (this.pt == com.rsc.b.b.cy) {
               try {
                  if (this.oR < 0) {
                     var2 = -1;
                  } else {
                     var2 = this.oM[this.oR];
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
                  this.T.dW();
               } catch (NumberFormatException var9) {
                  System.out.println("Deposit X number format exception: " + var9);
               }
            } else if (this.pt == com.rsc.b.b.cz) {
               var2 = this.oH.lp[this.oH.ll];
               if (var2 != -1) {
                  var3 = this.g(var1);
                  this.n().aO(236);
                  this.n().aL(var2);
                  this.n().aL(this.oH.lo[this.oH.ll]);
                  this.n().aL(var3);
                  this.n().dW();
               }
            } else if (this.pt == com.rsc.b.b.cA) {
               var2 = this.oH.lp[this.oH.ll];
               if (var2 != -1) {
                  var3 = this.g(var1);
                  this.n().aO(221);
                  this.n().aL(this.oH.lp[this.oH.ll]);
                  this.n().aL(this.oH.lo[this.oH.ll]);
                  this.n().aL(var3);
                  this.n().dW();
               }
            } else {
               long var14;
               if (this.pt == com.rsc.b.b.cB) {
                  if (var1.length() > 10) {
                     var1 = var1.substring(var1.length() - 10, var1.length());
                  }

                  var2 = 2147483647;
                  var14 = this.h(var1);
                  if (var14 < 2147483647L) {
                     var2 = this.g(var1);
                  }

                  this.oG.z(var2, this.oG.kJ);
               } else if (this.pt == com.rsc.b.b.cC) {
                  if (var1.length() > 10) {
                     var1 = var1.substring(var1.length() - 10, var1.length());
                  }

                  var2 = 2147483647;
                  var14 = this.h(var1);
                  if (var14 < 2147483647L) {
                     var2 = this.g(var1);
                  }

                  this.oG.y(this.oG.kJ, var2);
               } else if (this.pt == com.rsc.b.b.cD) {
                  this.n().aO(84);
                  this.n().dW();
               }
            }
         }

         this.pt = com.rsc.b.b.cu;
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
      this.dB().a(this.dB().ad(var1), var2, var3, var4, var5, var6, 0, 0, 255, false, 0, 1);
   }

   private void cZ() {
      this.dB().ja = false;
      this.rm = false;
      this.dB().c(true);
      if (this.qf == 0 || this.qf == 2 || this.qf == 3) {
         int var1 = this.oZ * 2 % 3072;
         if (var1 < 1024) {
            this.dB().a((com.rsc.a.b.c)this.nS[0], 0, 10);
            if (var1 > 768) {
               this.dB().a(this.nS[1], 0, 10, var1 - 768);
            }
         } else if (var1 < 2048) {
            this.dB().a((com.rsc.a.b.c)this.nS[1], 0, 10);
            if (var1 > 1792) {
               this.dB().a(this.nS[2], 0, 10, var1 - 1792);
            }
         } else {
            this.dB().a((com.rsc.a.b.c)this.nS[2], 0, 10);
            if (var1 > 2816) {
               this.dB().a(this.nS[0], 0, 10, var1 - 2816);
            }
         }
      }

      if (this.qf == 0) {
         this.qB.bi();
      }

      if (this.qf == 2) {
         String var2 = this.qA.J(this.pe);
         if (null != var2 && var2.length() > 0) {
            this.dB().g(0, 185, this.au(), 30, 0, 100);
         }

         this.qA.bi();
      }

      this.dB().a((com.rsc.a.b.c)this.dB().ae(20), 0, this.av());
   }

   private void f(boolean var1) {
      this.oK = var1;
      if (this.qh > 0) {
         this.c("Please wait...", "Connecting to server");

         try {
            com.rsc.g.f.b(2000L);
         } catch (Exception var4) {
         }

         this.c("Sorry! The server is currently full.", "Please try again later");
      } else {
         while(this.oU > 0) {
            try {
               if (this.mU.trim().length() == 0) {
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
               this.n().aN(13);
               this.n().q(this.ry);
               this.n().q(this.mU);
               this.n().a(this.dt());
               this.n().q(this.du());
               this.n().dW();
               this.s();
               int var2 = this.V.dU();
               com.rsc.g.h var3 = com.rsc.g.h.aP(var2);
               if (var3 == com.rsc.g.h.sU) {
                  this.oU = 0;
                  this.dw();
                  return;
               }

               if (var3 == com.rsc.g.h.sV) {
                  this.oU = 0;
                  this.dw();
                  return;
               }

               if (!var1) {
                  this.c(var3.tu, var3.tv);
               } else {
                  this.ds();
               }

               return;
            } catch (Exception var6) {
               var6.printStackTrace();
               --this.oU;
               if (this.oU <= 0) {
                  if (this.oK) {
                     this.ry = "";
                     this.mU = "";
                     this.ds();
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
      this.T.dX();
      this.V = var1;
   }

   private void da() {
      int var1;
      if (this.s == 0) {
         var1 = this.om.au();
         int var2 = this.om.av();
         boolean var3 = false;
         if (c.A() && c.ap) {
            var3 = true;
         }

         if (var3) {
            this.om.b(this.oo, this.on, this.w(), this.u());
         } else if (this.on - 10 <= this.u() && this.oo - 10 <= this.w() && var1 + this.on + 10 >= this.u() && this.w() <= 10 + this.oo + var2) {
            this.om.b(this.oo, this.on, this.w(), this.u());
         } else {
            this.ov = false;
         }
      } else {
         var1 = this.om.a(this.u(), this.w(), this.on, this.oo);
         if (var1 >= 0) {
            this.aF(var1);
         }

         this.ov = false;
         this.s = 0;
      }

   }

   private boolean i(String var1) {
      var1 = var1.replace("@yel@", "");
      if (null == var1) {
         return false;
      } else if (var1.equals(this.oA.mU)) {
         return false;
      } else {
         boolean var2 = false;
         boolean var3 = false;
         if (-this.ot - this.ox - (this.oq - 2203) > 0) {
            return false;
         } else {
            for(int var4 = 0; var4 < this.rw; ++var4) {
               if (var1.equals(this.nT[var4])) {
                  var2 = true;
                  if ((4 & this.nV[var4]) != 0) {
                     var3 = true;
                  }
                  break;
               }
            }

            if (var2) {
               if (var3) {
                  this.om.a(com.rsc.c.d.dU, "@whi@" + var1, "Message", var1);
               }
            } else {
               boolean var6 = false;

               for(int var5 = 0; var5 < this.rx; ++var5) {
                  if (var1.equals(com.rsc.g.l.a(this.nU[var5]))) {
                     var6 = true;
                     break;
                  }
               }

               if (!var6) {
                  this.om.a(com.rsc.c.d.dS, "@whi@" + var1, "Add friend", var1);
                  this.om.a(com.rsc.c.d.dT, "@whi@" + var1, "Add ignore", var1);
               }
            }

            this.om.a(com.rsc.c.d.dK, "@whi@" + var1, "Report abuse", var1);
            return true;
         }
      }
   }

   private void v(int var1, int var2, int var3) {
      this.dB().n(var2, var3, var1);
      this.dB().n(var2 - 1, var3, var1);
      this.dB().n(1 + var2, var3, var1);
      this.dB().n(var2, var3 - 1, var1);
      this.dB().n(var2, var3 + 1, var1);
   }

   public final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      j var9 = this.ni[var1];
      com.rsc.a.a.g var10 = var9.cz();
      int var11 = 7 & var9.ck() + (this.O.e() + 16) / 32;
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

      int var14 = this.nv[var9.mO / var10.aI() % 4] + var13 * 3;
      if (var9.ck() == 8) {
         var12 = false;
         var13 = 5;
         var2 -= var8 * var10.aK() / 100;
         var11 = 2;
         var14 = this.nt[this.oZ / (var10.aJ() - 1) % 8] + var13 * 3;
      } else if (var9.ck() == 9) {
         var13 = 5;
         var11 = 2;
         var12 = true;
         var2 += var10.aK() * var8 / 100;
         var14 = this.nu[this.oZ / var10.aJ() % 8] + var13 * 3;
      }

      int var15;
      int var16;
      int var17;
      for(var15 = 0; var15 < 12; ++var15) {
         var16 = this.dC()[var11][var15];
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
               com.rsc.a.b.c var22 = this.dB().c(var18.ad(), var21);
               int var23 = var22.ck;
               int var24 = var22.cl;
               int var25 = this.dB().c(var18.ad(), 0).ck;
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

                  this.dB().a(var22, var26 + var2, var27 + var3, var28, var5, var29, var30, 0, 255, var12, var6, 1);
               }
            }
         }
      }

      if (var9.mL > 0) {
         com.rsc.e.b var31 = new com.rsc.e.b();
         var31.ai(this.dB().c(1, var9.mi) / 2);
         var31.aj(this.dB().c(1, var9.mi) / 300 * this.dB().ac(1));
         var31.ak(var4 / 2 + var2);
         var31.al(var3);
         var31.c(var9.mi);
         this.np[this.oW++] = var31;
      }

      if (var9.ck() == 8 || var9.ck() == 9 || var9.mz != 0) {
         if (var9.mz > 0) {
            var15 = var2;
            if (var9.ck() == 9) {
               var15 = var2 + var8 * 20 / 100;
            } else if (var9.ck() == 8) {
               var15 = var2 - var8 * 20 / 100;
            }

            var16 = var4 / 2 + var15;
            var17 = var9.mH * 30 / var9.mI;
            this.nq[this.oX++] = new com.rsc.e.c(var16, var3, var17);
         }

         if (var9.mz > 150) {
            var15 = var2;
            if (var9.ck() == 9) {
               var15 = var2 + var8 * 10 / 100;
            } else if (var9.ck() == 8) {
               var15 = var2 - var8 * 10 / 100;
            }

            if (var9.mA > 0) {
               this.dB().a(this.dB().ae(10), var15 - (12 - var4 / 2), var3 + var5 / 2 - 12);
               this.dB().c(var4 / 2 - 1 + var15, 5 + var3 + var5 / 2, "" + var9.mB, 16777215, 3, -1);
            }
         }
      }

   }

   public final void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      k var9 = this.nl[var1];
      if (var9.mW != 255) {
         int var10 = var9.ck() + (this.O.e() + 16) / 32 & 7;
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

         int var13 = this.nv[var9.mO / 6 % 4] + var12 * 3;
         if (var9.ck() == 9) {
            var10 = 2;
            var12 = 5;
            var2 += var8 * 5 / 100;
            var11 = true;
            var13 = this.nu[this.oZ / 6 % 8] + var12 * 3;
         } else if (var9.ck() == 8) {
            var2 -= var8 * 5 / 100;
            var12 = 5;
            var11 = false;
            var10 = 2;
            var13 = this.nt[this.oZ / 5 % 8] + var12 * 3;
         }

         Object var14 = null;

         int var15;
         int var16;
         for(var15 = 0; var15 < 12; ++var15) {
            var16 = this.dC()[var10][var15];
            com.rsc.a.a.a var17 = var9.mG[var16];
            if (var17 != null) {
               byte var18 = 0;
               byte var19 = 0;
               int var20 = var13;
               if (var11 && var12 >= 1 && var12 <= 3) {
                  if (var17.ah()) {
                     var20 = var13 + 15;
                  } else if (var16 == 4 && var12 == 1) {
                     var20 = var12 * 3 + this.nv[(var9.mO / 6 + 2) % 4];
                     var19 = -3;
                     var18 = -22;
                  } else if (var16 == 4 && var12 == 2) {
                     var18 = 0;
                     var19 = -8;
                     var20 = this.nv[(var9.mO / 6 + 2) % 4] + var12 * 3;
                  } else if (var16 == 4 && var12 == 3) {
                     var19 = -5;
                     var20 = var12 * 3 + this.nv[(2 + var9.mO / 6) % 4];
                     var18 = 26;
                  } else if (var16 == 3 && var12 == 1) {
                     var20 = var12 * 3 + this.nv[(2 + var9.mO / 6) % 4];
                     var18 = 22;
                     var19 = 3;
                  } else if (var16 == 3 && var12 == 2) {
                     var19 = 8;
                     var20 = var12 * 3 + this.nv[(var9.mO / 6 + 2) % 4];
                     var18 = 0;
                  } else if (var16 == 3 && var12 == 3) {
                     var18 = -26;
                     var20 = this.nv[(2 + var9.mO / 6) % 4] + var12 * 3;
                     var19 = 5;
                  }
               }

               if (var12 != 5 || var17.ag()) {
                  if (var17 == null) {
                     return;
                  }

                  com.rsc.a.b.c var21 = this.dB().c(var17.ad(), var20);
                  int var22 = var21.ck;
                  int var23 = var21.cl;
                  int var24 = this.dB().c(var17.ad(), 0).ck;
                  if (var22 != 0 && var23 != 0 && var24 != 0) {
                     int var25 = var18 * var4 / var22;
                     int var26 = var19 * var5 / var23;
                     int var27 = var22 * var4 / var24;
                     var25 -= (var27 - var4) / 2;
                     int var28 = var17.ae();
                     int var29 = this.dF()[var9.mY];
                     if (var28 == 1) {
                        var28 = this.dD()[var9.mX];
                     } else if (var28 == 2) {
                        var28 = this.dE()[var9.mZ];
                     } else if (var28 == 3) {
                        var28 = this.dE()[var9.mW];
                     }

                     this.dB().a(var21, var25 + var2, var3 + var26, var27, var5, var28, var29, 0, 255, var11, var6, 1);
                  }
               }
            }
         }

         if (var9.mL > 0) {
            com.rsc.e.b var30 = new com.rsc.e.b();
            var30.ai(this.dB().c(1, var9.mi) / 2);
            var30.aj(this.dB().c(1, var9.mi) / 300 * this.dB().ac(1));
            var30.ak(var4 / 2 + var2);
            var30.al(var3);
            var30.c(var9.mi);
            this.np[this.oW++] = var30;
         }

         if (c.ac && var9.mU != null) {
            var15 = var3 + 3;
            if (var9.mL > 0) {
               var15 -= 15;
            }

            if (var9.mz > 0) {
               var15 -= 10;
            }

            var16 = var2;
            if (var9.ck() == 9) {
               var16 = var2 + var8 * 20 / 100;
            } else if (var9.ck() == 8) {
               var16 = var2 - var8 * 20 / 100;
            }

            this.dB().a((String)var9.mU, (var4 - this.dB().c(0, var9.mU)) / 2 + var16, var15 - 4, 16776960, 0);
         }

         if (var9.my > 0) {
            this.no[this.oV++] = new com.rsc.e.a(var9.mx, var2 + var4 / 2, var3, var8);
         }

         int var31;
         if (var9.ck() == 8 || var9.ck() == 9 || var9.mz != 0) {
            if (var9.mz > 0) {
               var15 = var2;
               if (var9.ck() == 9) {
                  var15 = var2 + var8 * 20 / 100;
               } else if (var9.ck() == 8) {
                  var15 = var2 - var8 * 20 / 100;
               }

               var16 = var4 / 2 + var15;
               var31 = var9.mH * 30 / var9.mI;
               this.nq[this.oX++] = new com.rsc.e.c(var16, var3, var31);
            }

            if (var9.mz > 150) {
               var15 = var2;
               if (var9.ck() == 9) {
                  var15 = var2 + var8 * 10 / 100;
               } else if (var9.ck() == 8) {
                  var15 = var2 - var8 * 10 / 100;
               }

               if (var9.mA > 0) {
                  this.dB().a(this.dB().ae(9), var15 - (12 - var4 / 2), var3 + var5 / 2 - 12);
                  this.dB().c(var4 / 2 - 1 + var15, 5 + var3 + var5 / 2, "" + var9.mB, 16777215, 3, -1);
               }
            }
         }

         if (var9.mV == 1 && var9.my == 0) {
            var15 = var6 + var2 + var4 / 2;
            if (var9.ck() == 8) {
               var15 -= var8 * 20 / 100;
            } else if (var9.ck() == 9) {
               var15 += var8 * 20 / 100;
            }

            var16 = var8 * 16 / 100;
            var31 = var8 * 16 / 100;
            this.dB().b(this.dB().ae(11), var15 - var16 / 2, var3 - var31 / 2 - var8 * 10 / 100, var16, var31);
         }
      }

   }

   private void db() {
      if (this.ob.length() > 0) {
         this.nO = this.ob.trim();
         this.nN = 0;
         this.nP = 2;
      } else {
         byte var1 = 0;
         if (this.ok || this.oI) {
            if (this.ok) {
               var1 = 2;
            } else if (this.oI) {
               var1 = 1;
            }
         }

         int var2 = this.dB().ac(1);
         int var3 = this.dB().ac(4);
         short var4 = 400;
         int var5 = (var1 > 0 ? 5 + var2 : 0) + 70;
         int var6 = 256 - var4 / 2;
         int var7 = 180 - var5 / 2;
         this.dB().e(var6, var7, var4, var5, 0);
         this.dB().f(var6, var4, var7, var5, 16777215);
         this.dB().a(256, "Enter the name of the player you wish to report:", 16776960, 0, 1, 5 + var7 + var2);
         int var8 = var2 + 2;
         this.dB().a(256, this.oa + "*", 16777215, 0, 4, var3 + var7 + 5 + var8 + 3);
         int var9 = var2 + var3 + 8 + var7 + var8 + 2;
         int var10 = 16777215;
         if (var1 > 0) {
            String var11 = this.rH ? "[X]" : "[ ]";
            if (var1 > 1) {
               var11 = var11 + " Mute player";
            } else {
               var11 = var11 + " Suggest mute";
            }

            int var12 = this.dB().c(1, var11);
            if (this.A > 256 - var12 / 2 && this.A < var12 / 2 + 256 && var9 - var2 < this.B && var9 > this.B) {
               if (this.t() != 0) {
                  this.rH = !this.rH;
                  this.e(0);
               }

               var10 = 16776960;
            }

            this.dB().a(256, var11, var10, 0, 1, var9);
            var9 += 10 + var2;
         }

         var10 = 16777215;
         if (this.A > 210 && this.A < 228 && var9 - var2 < this.B && var9 > this.B) {
            if (this.t() != 0) {
               this.ob = this.oa;
               this.e(0);
            }

            var10 = 16776960;
         }

         this.dB().a((String)"OK", 210, var9, var10, 1);
         var10 = 16777215;
         if (this.A > 264 && this.A < 304 && this.B > var9 - var2 && var9 > this.B) {
            var10 = 16776960;
            if (this.t() != 0) {
               this.e(0);
               this.nP = 0;
            }
         }

         this.dB().a((String)"Cancel", 264, var9, var10, 1);
         if (this.t() == 1 && (this.A < var6 || this.A > var6 + var4 || var7 > this.B || var7 + var5 < this.B)) {
            this.nP = 0;
            this.e(0);
         }
      }

   }

   private void dc() {
      this.nN = 0;
      boolean var1 = true;
      if (this.A >= 36 && this.A < 176) {
         this.nN = 1;
      } else if (this.A >= 186 && this.A < 326) {
         this.nN = 7;
      } else if (this.A >= 336 && this.A < 476) {
         this.nN = 12;
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
               if (this.nN == 1) {
                  var1 = true;
                  this.nN += var3;
                  break;
               }

               if (this.nN == 7) {
                  if (var3 < 5) {
                     var1 = true;
                     this.nN += var3;
                  }
                  break;
               }

               if (this.nN == 12) {
                  if (var3 < 3) {
                     var1 = true;
                     this.nN += var3;
                  }
                  break;
               }
            }

            var2 += 2 + var4;
         }
      }

      if (!var1) {
         this.nN = 0;
      }

      if (this.t() != 0 && this.nN != 0) {
         this.n().aO(206);
         this.n().q(this.nO);
         this.n().aK(this.nN);
         this.n().aK(this.rH ? 1 : 0);
         this.n().dW();
         this.nP = 0;
         this.ob = "";
         this.oa = "";
         this.e(0);
      } else {
         var2 += 15;
         if (this.t() != 0) {
            this.e(0);
            if (this.A < 31 || this.B < 35 || this.A > 481 || this.B > 310) {
               this.nP = 0;
               return;
            }

            if (this.A > 66 && this.A < 446 && this.B >= var2 - 15 && this.B < var2 + 5) {
               this.nP = 0;
               return;
            }
         }

         this.dB().e(31, 35, 450, 275, 0);
         this.dB().f(31, 450, 35, 275, 16777215);
         byte var5 = 50;
         this.dB().a(256, "This form is for reporting players who are breaking our rules", 16777215, 0, 1, var5);
         var2 = var5 + 15;
         this.dB().a(256, "Using it sends a snapshot of the last 60 seconds of activity to us", 16777215, 0, 1, var2);
         var2 += 15;
         this.dB().a(256, "If you misuse this form, you will be banned.", 16744448, 0, 1, var2);
         var2 += 15;
         var2 += 10;
         this.dB().a(256, "Click on the most suitable option from the Rules of RuneScape.", 16776960, 0, 1, var2);
         var2 += 15;
         this.dB().a(256, "This will send a report to our Player Support team for investigation.", 16776960, 0, 1, var2);
         var2 += 18;
         this.dB().a(106, "Honour", 16711680, 0, 4, var2);
         this.dB().a(256, "Respect", 16711680, 0, 4, var2);
         this.dB().a(406, "Security", 16711680, 0, 4, var2);
         var2 += 18;
         if (this.nN == 1) {
            this.dB().e(36, var2 - 12, 140, 30, 3158064);
         }

         this.dB().f(36, 140, var2 - 12, 30, 4210752);
         if (this.nN == 7) {
            this.dB().e(186, var2 - 12, 140, 30, 3158064);
         }

         this.dB().f(186, 140, var2 - 12, 30, 4210752);
         if (this.nN == 12) {
            this.dB().e(336, var2 - 12, 140, 30, 3158064);
         }

         this.dB().f(336, 140, var2 - 12, 30, 4210752);
         if (this.nN == 1) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dB().a(106, "Buying or", var3, 0, 0, var2);
         if (this.nN == 7) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dB().a(256, "Seriously offensive", var3, 0, 0, var2);
         if (this.nN != 12) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dB().a(406, "Asking for or providing", var3, 0, 0, var2);
         var2 += 12;
         if (this.nN != 1) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dB().a(106, "selling an account", var3, 0, 0, var2);
         if (this.nN != 7) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dB().a(256, "language", var3, 0, 0, var2);
         if (this.nN != 12) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dB().a(406, "contact information", var3, 0, 0, var2);
         var2 += 20;
         if (this.nN == 2) {
            this.dB().e(36, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(36, 140, var2 - 12, 18, 4210752);
         if (this.nN == 8) {
            this.dB().e(186, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(186, 140, var2 - 12, 18, 4210752);
         if (this.nN == 13) {
            this.dB().e(336, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(336, 140, var2 - 12, 18, 4210752);
         if (this.nN == 2) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dB().a(106, "Encouraging rule-breaking", var3, 0, 0, var2);
         if (this.nN == 8) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dB().a(256, "Solicitation", var3, 0, 0, var2);
         if (this.nN != 13) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dB().a(406, "Breaking real-world laws", var3, 0, 0, var2);
         var2 += 20;
         if (this.nN == 3) {
            this.dB().e(36, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(36, 140, var2 - 12, 18, 4210752);
         if (this.nN == 9) {
            this.dB().e(186, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(186, 140, var2 - 12, 18, 4210752);
         if (this.nN == 14) {
            this.dB().e(336, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(336, 140, var2 - 12, 18, 4210752);
         if (this.nN == 3) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dB().a(106, "Staff impersonation", var3, 0, 0, var2);
         if (this.nN != 9) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dB().a(256, "Disruptive behaviour", var3, 0, 0, var2);
         if (this.nN != 14) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dB().a(406, "Advertising websites", var3, 0, 0, var2);
         var2 += 20;
         if (this.nN == 4) {
            this.dB().e(36, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(36, 140, var2 - 12, 18, 4210752);
         if (this.nN == 10) {
            this.dB().e(186, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(186, 140, var2 - 12, 18, 4210752);
         if (this.nN != 4) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dB().a(106, "Macroing or use of bots", var3, 0, 0, var2);
         if (this.nN == 10) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dB().a(256, "Offensive account name", var3, 0, 0, var2);
         var2 += 20;
         if (this.nN == 5) {
            this.dB().e(36, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(36, 140, var2 - 12, 18, 4210752);
         if (this.nN == 11) {
            this.dB().e(186, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(186, 140, var2 - 12, 18, 4210752);
         if (this.nN == 5) {
            var3 = 16744448;
         } else {
            var3 = 16777215;
         }

         this.dB().a(106, "Scamming", var3, 0, 0, var2);
         if (this.nN != 11) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dB().a(256, "Real-life threats", var3, 0, 0, var2);
         var2 += 20;
         if (this.nN == 6) {
            this.dB().e(36, var2 - 12, 140, 18, 3158064);
         }

         this.dB().f(36, 140, var2 - 12, 18, 4210752);
         if (this.nN != 6) {
            var3 = 16777215;
         } else {
            var3 = 16744448;
         }

         this.dB().a(106, "Exploiting a bug", var3, 0, 0, var2);
         var2 += 18;
         var2 += 15;
         var3 = 16777215;
         if (this.A > 196 && this.A < 316 && this.B > var2 - 15 && this.B < 5 + var2) {
            var3 = 16776960;
         }

         this.dB().a(256, "Click here to cancel", var3, 0, 1, var2);
      }

   }

   private void dd() {
      byte var1 = 106;
      int var2 = 145;
      if (c.A()) {
         var2 = 75;
      }

      if (this.s != 0) {
         this.s = 0;
         if (this.or == com.rsc.b.e.dl && (this.u() < var1 || this.w() < var2 || this.u() > var1 + 300 || this.w() > var2 + 70)) {
            this.or = com.rsc.b.e.dk;
            return;
         }

         if (this.or == com.rsc.b.e.dm && (this.u() < 6 || this.w() < var2 || this.u() > 506 || this.w() > 70)) {
            this.or = com.rsc.b.e.dk;
            return;
         }

         if (this.or == com.rsc.b.e.dn && (this.u() < var1 || this.w() < var2 || this.u() > 406 || this.w() > 70)) {
            this.or = com.rsc.b.e.dk;
            return;
         }

         if (this.u() > var1 + 130 && this.u() < var1 + 270 && this.w() > var2 + 48 && this.w() < var2 + 68) {
            this.or = com.rsc.b.e.dk;
            return;
         }
      }

      String var3;
      String var4;
      if (this.or == com.rsc.b.e.dl) {
         this.dB().e(106, var2, 300, 70, 0);
         this.dB().f(106, 300, var2, 70, 16777215);
         var2 += 20;
         this.dB().c(256, var2, "Enter name to add to friends list", 16777215, 4, -1);
         var2 += 20;
         this.dB().c(256, var2, this.oa + "*", 16777215, 4, -1);
         var3 = com.rsc.g.l.a(this.oA.mU);
         if (null != var3 && this.ob.length() > 0) {
            var4 = this.ob.trim();
            this.or = com.rsc.b.e.dk;
            this.oa = "";
            this.ob = "";
            if (var4.length() > 0 && !var3.equals(com.rsc.g.l.a(var4))) {
               this.e(var4);
            }
         }
      }

      if (this.or == com.rsc.b.e.dm) {
         this.dB().e(6, var2, 500, 70, 0);
         this.dB().f(6, 500, var2, 70, 16777215);
         var2 += 20;
         this.dB().c(256, var2, "Enter message to send to " + this.oY, 16777215, 4, -1);
         var2 += 20;
         this.dB().c(256, var2, this.nX + "*", 16777215, 4, -1);
         if (this.nY.length() > 0) {
            var3 = this.nY;
            this.nX = "";
            this.or = com.rsc.b.e.dk;
            this.nY = "";
            this.b(this.oY, var3);
         }
      }

      if (this.or == com.rsc.b.e.dn) {
         this.dB().e(106, var2, 300, 70, 0);
         this.dB().f(106, 300, var2, 70, 16777215);
         var2 += 20;
         this.dB().c(256, var2, "Enter name to add to ignore list", 16777215, 4, -1);
         var2 += 20;
         this.dB().c(256, var2, this.oa + "*", 16777215, 4, -1);
         var3 = com.rsc.g.l.a(this.oA.mU);
         if (var3 != null && this.ob.length() > 0) {
            var4 = this.ob.trim();
            this.oa = "";
            this.or = com.rsc.b.e.dk;
            this.ob = "";
            if (var4.length() > 0 && !var3.equals(com.rsc.g.l.a(var4))) {
               this.f(var4);
            }
         }
      }

      int var5 = 16777215;
      if (this.u() > var1 + 130 && this.u() < var1 + 170 && this.w() > var2 + 10 && this.w() < var2 + 28) {
         var5 = 16776960;
      }

      this.dB().c(256, var2 + 23, "Cancel", var5, 1, -1);
   }

   public final void n(int var1, int var2, int var3, int var4, int var5) {
      l var6 = this.nr[var1];
      int var8 = 255 - var6.cA() * 5;
      int var7;
      if (var6.at() == 0) {
         var7 = 255 + var6.cA() * 1280;
         this.dB().g(var2 + var4 / 2, var5 / 2 + var3, 20 + var6.cA() * 2, var7, var8);
      }

      if (var6.at() == 1) {
         var7 = 16711680 + var6.cA() * 1280;
         this.dB().g(var2 + var4 / 2, var3 + var5 / 2, var6.cA() + 10, var7, var8);
      }

   }

   private void a(String var1, String var2) {
      this.D.a(var1, var2);
   }

   private void de() {
      boolean var1 = false;
      if (this.pH != 0) {
         this.cQ();
      } else if (this.qW) {
         this.cT();
      } else if (this.qX) {
         this.cS();
      } else if (this.ra == 1) {
         this.cV();
      } else if (this.rr.bF()) {
         this.rr.b(this.dB());
      } else if (this.rt.bF()) {
         this.rt.a(this.dB());
      } else if (this.rs.bF()) {
         this.rs.b(this.dB());
      } else if (this.dH() && this.mz == 0) {
         if (this.pt != com.rsc.b.b.cu) {
            this.cY();
         }

         this.df();
      } else if (this.oH.lg && this.mz == 0) {
         this.oH.bR();
      } else if (this.oF.lO) {
         this.oF.bv();
      } else if (this.oF.lN) {
         this.oF.bv();
      } else if (this.oG.kT) {
         this.oG.bv();
      } else if (this.oG.kS) {
         this.oG.bv();
      } else if (this.nP != 1) {
         if (this.nP == 2) {
            this.dc();
         } else if (this.or == com.rsc.b.e.dk) {
            var1 = true;
         } else {
            this.dd();
         }
      } else {
         this.db();
      }

      if (this.pt != com.rsc.b.b.cu) {
         this.cY();
      }

      if (var1) {
         if (this.qY) {
            this.cR();
         }

         if (c.ak != 0 && (this.oA.ck() == 8 || this.oA.ck() == 9) || c.ak == 2) {
            this.cP();
         }

         boolean var2 = !this.qY && !this.ov;
         if (var2) {
            this.om.E(0);
         }

         this.dr();
         if (this.qZ == 0 && var2) {
            this.dg();
         }

         if (this.qZ == 1) {
            this.g(var2);
         }

         if (this.qZ == 2) {
            this.j(var2);
         }

         if (this.qZ == 3) {
            this.l(var2);
         }

         if (this.qZ == 4) {
            this.i(var2);
         }

         if (this.qZ == 5) {
            this.h(var2);
         }

         if (this.qZ == 6) {
            this.k(var2);
         }

         if (!this.ov && !this.qY) {
            this.cL();
         }

         if (this.ov && !this.qY) {
            this.da();
         }
      }

      this.s = 0;
   }

   private void df() {
      this.rq.bO();
   }

   private void dg() {
      int var1;
      int var2;
      if (this.qp == com.rsc.b.c.cH && this.qH.L(this.qD) || this.qp == com.rsc.b.c.cI && this.qH.L(this.qG) || this.qp == com.rsc.b.c.cJ && this.qH.L(this.qF)) {
         var1 = this.qp == com.rsc.b.c.cH ? this.qD : (this.qp == com.rsc.b.c.cI ? this.qG : this.qF);
         var2 = this.qH.H(var1);
         if (var2 >> 16 == 2 || this.rz && var2 >> 16 == 1) {
            int var3 = '\uffff' & var2;
            String var4 = this.qH.e(var1, var3);
            if (this.i(var4)) {
               return;
            }
         }
      }

      if (this.qp == com.rsc.b.c.cG) {
         for(var1 = 0; var1 < 100; ++var1) {
            g var10 = this.oB[var1];
            if (var10 != null && var10.cq() > 0 && (var10.cp() == h.mp || var10.cp() == h.mm || var10.cp() == h.mq || var10.cp() == h.mr)) {
               String var11 = var10.cu() + com.rsc.g.l.a(var10.ct(), var10.cr(), var10.cp());
               if (this.u() > 7 && this.u() < this.dB().c(1, var11) + 7 && this.w() > -(var1 * 12) - 30 + this.av() && this.av() - var1 * 12 - 18 > this.w() && (this.s == 2 || this.rz && this.s == 1) && this.i(var10.cr())) {
                  return;
               }
            }
         }
      }

      this.qk = false;

      for(var1 = 0; this.pr > var1; ++var1) {
         this.oC[var1].ci();
      }

      for(var1 = 0; this.ri > var1; ++var1) {
         this.oD[var1].ci();
      }

      var1 = -1;
      var2 = this.L.bu();
      com.rsc.c.h[] var12 = this.L.bt();
      int[] var13 = this.L.bs();

      for(int var5 = 0; var5 < var2 && this.om.bf() <= 200; ++var5) {
         int var6 = var13[var5];
         com.rsc.c.h var7 = var12[var5];
         if (var7.gz[var6] <= 65535 || var7.gz[var6] >= 200000 && var7.gz[var6] <= 300000) {
            if (this.L.iz == var7) {
               int var8 = var7.gz[var6] % 10000;
               int var9 = var7.gz[var6] / 10000;
               if (var9 == 1) {
                  this.aw(var8);
               } else if (var9 == 2) {
                  this.aA(var8);
               } else if (var9 == 3) {
                  this.az(var8);
               }
            } else if (var7 != null && var7.gx >= 10000) {
               this.ax(var7.gx - 10000);
            } else if (var7 != null && var7.gx >= 0) {
               this.ay(var7.gx);
            } else {
               if (var6 >= 0) {
                  var6 = var7.gz[var6] - 200000;
               }

               if (var6 >= 0) {
                  var1 = var6;
               }
            }
         }
      }

      if (this.qO >= 0 && com.rsc.a.a.n(this.qO).aS() <= 1) {
         this.om.a(com.rsc.c.d.ew, "Cast " + com.rsc.a.a.n(this.qO).ad() + " on self", "", this.qO);
      }

      if (~var1 != 0) {
         this.qk = true;
         this.qc = this.op + this.N.jH[var1];
         this.pL = this.oq + this.N.jI[var1];
         if (this.qT && this.ok || this.qT && this.oI) {
            this.om.a(com.rsc.c.d.eZ, "Teleport here", "", this.N.jH[var1], this.N.jI[var1]);
         }

         if (this.qR && this.ok) {
            String var14 = this.qS < com.rsc.a.a.Q() ? com.rsc.a.a.s(this.qS).ad() : "Object";
            String var15 = this.qS < com.rsc.a.a.P() ? com.rsc.a.a.q(this.qS).ad() : "Wall";
            String var16 = this.qS < com.rsc.a.a.aM.size() ? com.rsc.a.a.k(this.qS).ad() : "NPC";
            this.om.a(com.rsc.c.d.eL, "", "", this.N.jH[var1], this.N.jI[var1]);
            this.om.a(com.rsc.c.d.eM, "[Spawn]", "@yel@" + var16 + "@whi@(@or1@" + this.qS + "@whi@)", this.N.jH[var1], this.N.jI[var1]);
            this.om.a(com.rsc.c.d.eN, "[Spawn]", "@cya@" + var14 + "@whi@(@or1@" + this.qS + "@whi@)", this.N.jH[var1], this.N.jI[var1]);
            this.om.a(com.rsc.c.d.eO, "[Spawn]", "@cya@" + var15 + "@whi@(@or1@" + this.qS + "@whi@)", this.N.jH[var1], this.N.jI[var1]);
         }

         if (this.qO >= 0) {
            if (com.rsc.a.a.n(this.qO).aS() == 6) {
               this.om.a(com.rsc.c.d.ex, "Cast " + com.rsc.a.a.n(this.qO).ad() + " on ground", "", this.N.jH[var1], this.N.jI[var1], this.qO);
            }
         } else if (this.qN < 0) {
            this.om.a(com.rsc.c.d.ey, "Walk here", "", this.N.jH[var1], this.N.jI[var1]);
         }
      }

   }

   private void ax(int var1) {
      m var2 = this.oD[var1];
      if (!var2.ca()) {
         if (this.qO >= 0) {
            if (com.rsc.a.a.n(this.qO).aS() == 4) {
               this.om.a(com.rsc.c.d.dW, "Cast " + com.rsc.a.a.n(this.qO).ad() + " on", "@cya@" + var2.cC().ad(), var2.ce(), var2.cf(), var2.ck(), this.qO);
            }
         } else if (this.qN >= 0) {
            this.om.a(com.rsc.c.d.dX, "Use " + this.pR + " with", "@cya@" + var2.cC().ad(), var2.ce(), var2.cf(), var2.ck(), this.qN);
         } else {
            if (!var2.cC().ai().equalsIgnoreCase("WalkTo")) {
               this.om.a(com.rsc.c.d.dY, var2.cC().ai(), "@cya@" + var2.cC().ad(), var2.ce(), var2.cf(), var2.ck());
            }

            if (!var2.cC().aj().equalsIgnoreCase("Examine")) {
               this.om.a(com.rsc.c.d.dZ, var2.cC().aj(), "@cya@" + var2.cC().ad(), var2.ce(), var2.cf(), var2.ck());
            }

            if (this.qR && this.ok) {
               this.om.a(com.rsc.c.d.eS, "[Rotate]", "@cya@" + var2.cC().ad() + "@whi@(@or1@" + this.qS + "@whi@)", var2.ce(), var2.cf(), var2.ck(), var2.at());
               this.om.a(com.rsc.c.d.eT, "[Remove]", "@cya@" + var2.cC().ad() + "@whi@(@or1@" + this.qS + "@whi@)", var2.ce(), var2.cf(), var2.ck(), var2.at());
            }

            this.om.a(com.rsc.c.d.ea, "Examine", "@cya@" + var2.cC().ad() + (!this.ok && !this.oI ? "" : " @or1@(" + var2.at() + ":" + (var2.ce() + this.op) + "," + (var2.cf() + this.oq) + ")"), var2.at());
         }

         var2.cb();
      }

   }

   private void ay(int var1) {
      com.rsc.e.e var2 = this.oC[var1];
      if (!var2.ca()) {
         if (this.qO >= 0) {
            if (com.rsc.a.a.n(this.qO).aS() == 5) {
               this.om.a(com.rsc.c.d.ef, "Cast " + com.rsc.a.a.n(this.qO).ad() + " on", "@cya@" + var2.cl().ad(), var2.cf(), this.qO, var2.at(), var2.ck(), var2.ce());
            }
         } else if (this.qN >= 0) {
            this.om.a(com.rsc.c.d.eb, "Use " + this.pR + " with", "@cya@" + var2.cl().ad(), var2.cf(), this.qN, var2.at(), var2.ck(), var2.ce());
         } else {
            if (!var2.cl().ai().equalsIgnoreCase("WalkTo")) {
               this.om.a(com.rsc.c.d.ec, var2.cl().ai(), "@cya@" + var2.cl().ad(), var2.ce(), var2.cf(), var2.ck(), var2.at());
            }

            if (!var2.cl().aj().equalsIgnoreCase("Examine")) {
               this.om.a(com.rsc.c.d.ed, var2.cl().aj(), "@cya@" + var2.cl().ad(), var2.ce(), var2.cf(), var2.ck(), var2.at());
            }

            if (this.qR && this.ok) {
               this.om.a(com.rsc.c.d.eQ, "[Rotate]", "@cya@" + var2.cl().ad() + "@whi@(@or1@" + this.qS + "@whi@)", var2.ce(), var2.cf(), var2.ck(), var2.at());
               this.om.a(com.rsc.c.d.eR, "[Remove]", "@cya@" + var2.cl().ad() + "@whi@(@or1@" + this.qS + "@whi@)", var2.ce(), var2.cf(), var2.ck(), var2.at());
            }

            this.om.a(com.rsc.c.d.ee, "Examine", "@cya@" + var2.cl().ad() + (!this.ok && !this.oI ? "" : " @or1@(" + var2.at() + ":" + (var2.ce() + this.op) + "," + (var2.cf() + this.oq) + ")"), var2.at());
         }

         var2.cb();
      }

   }

   private void az(int var1) {
      j var2 = this.ni[var1];
      String var3 = "";
      int var4 = -1;
      if (var2.cz().aP()) {
         int var5 = (var2.cz().aO() + var2.cz().aM() + var2.cz().aN() + var2.cz().aL()) / 4;
         int var6 = (this.nH[3] + this.nH[2] + this.nH[1] + this.nH[0] + 27) / 4;
         var3 = this.av(var6 - var5);
         var3 = " " + var3 + "(level-" + var5 + ")";
         var4 = var6 - var5;
      }

      if (this.qO >= 0) {
         if (com.rsc.a.a.n(this.qO).aS() == 2) {
            this.om.a(com.rsc.c.d.eo, "Cast " + com.rsc.a.a.n(this.qO).ad() + " on", "@yel@" + var2.cz().ad(), var2.cd(), this.qO);
         }
      } else if (this.qN >= 0) {
         this.om.a(com.rsc.c.d.ev, "Use " + this.pR + " with", "@yel@" + var2.cz().ad(), var2.cd(), this.qN);
      } else {
         if (var2.cz().aP()) {
            this.om.a(var4 >= 0 ? com.rsc.c.d.ep : com.rsc.c.d.eq, "Attack", "@yel@" + var2.cz().ad() + var3, var2.cd());
         }

         this.om.a(com.rsc.c.d.er, "Talk-to", "@yel@" + var2.cz().ad(), var2.cd());
         if (!var2.cz().ai().equals("")) {
            this.om.a(com.rsc.c.d.es, var2.cz().ai(), "@yel@" + var2.cz().ad(), var2.cd());
         }

         this.om.a(com.rsc.c.d.eu, "Examine", "@yel@" + var2.cz().ad() + (!this.ok && !this.oI ? "" : " @or1@(" + this.ni[var1].at() + ")"), this.ni[var1].at());
         if (this.qR && this.ok) {
            this.om.a(com.rsc.c.d.eP, "[Remove]", "@yel@" + var2.cz().ad() + " @or1@(" + this.ni[var1].at() + ")", var2.cd());
         }
      }

   }

   private void aA(int var1) {
      com.rsc.e.f var2 = this.oE[var1];
      if (this.qO >= 0) {
         if (com.rsc.a.a.n(this.qO).aS() == 3) {
            this.om.a(com.rsc.c.d.eg, "Cast " + com.rsc.a.a.n(this.qO).ad() + " on", "@lre@" + var2.cm().ad(), var2.ce(), var2.cf(), var2.at(), this.qO);
         }
      } else if (this.qN >= 0) {
         this.om.a(com.rsc.c.d.en, "Use " + this.pR + " with", "@lre@" + var2.cm().ad(), var2.ce(), var2.cf(), var2.at(), this.qN);
      } else {
         com.rsc.c.d var3 = com.rsc.c.d.ek;
         this.om.a(var3, "Take", "@lre@" + var2.cm().ad(), var2.ce(), var2.cf(), var2.at());
         this.om.a(com.rsc.c.d.em, "Examine", "@lre@" + var2.cm().ad() + (!this.ok && !this.oI ? "" : " @or1@(" + var2.at() + ":" + (var2.ce() + this.op) + "," + (var2.cf() + this.oq) + ")"), var2.at());
      }

   }

   private void g(boolean var1) {
      int var2 = this.dB().iT - 248;
      this.dB().a((com.rsc.a.b.c)this.dB().ae(1), var2, 3);
      int var3 = 0;

      while(true) {
         this.getClass();
         int var4;
         int var5;
         if (30 <= var3) {
            for(var3 = 1; var3 <= 4; ++var3) {
               com.rsc.c.k var10000 = this.dB();
               int var10001 = var2 + var3 * 49;
               this.getClass();
               var10000.n(var10001, 36, 0, 30 / 5 * 34);
            }

            var3 = 1;

            while(true) {
               this.getClass();
               if (30 / 5 - 1 < var3) {
                  if (var1) {
                     var2 = 248 + (this.A - this.dB().iT);
                     var3 = this.B - 36;
                     if (var2 >= 0 && var3 >= 0 && var2 < 248) {
                        this.getClass();
                        if (30 / 5 * 34 > var3) {
                           var4 = var3 / 34 * 5 + var2 / 49;
                           if (this.pA > var4) {
                              var5 = this.ng[var4];
                              if (this.qO >= 0) {
                                 if (com.rsc.a.a.n(this.qO).aS() == 3) {
                                    this.om.a(com.rsc.c.d.ez, "@lre@" + com.rsc.a.a.l(var5).ad(), "Cast " + com.rsc.a.a.n(this.qO).ad() + " on", var4, this.qO);
                                 }
                              } else if (this.qN < 0) {
                                 if (this.ny[var4] == 1) {
                                    this.om.a(com.rsc.c.d.eA, "Remove", "@lre@" + com.rsc.a.a.l(var5).ad(), var4);
                                 } else if (com.rsc.a.a.l(var5).bA != 0) {
                                    String var6;
                                    if ((24 & com.rsc.a.a.l(var5).bA) == 0) {
                                       var6 = "Wear";
                                    } else {
                                       var6 = "Wield";
                                    }

                                    this.om.a(com.rsc.c.d.eB, var6, "@lre@" + com.rsc.a.a.l(var5).ad(), var4);
                                 }

                                 if (!com.rsc.a.a.l(var5).ax().equals("")) {
                                    this.om.a(com.rsc.c.d.eC, com.rsc.a.a.l(var5).ax(), "@lre@" + com.rsc.a.a.l(var5).ad(), var4);
                                 }

                                 this.om.a(com.rsc.c.d.eD, "Use", "@lre@" + com.rsc.a.a.l(var5).ad(), var4);
                                 this.om.a(com.rsc.c.d.eE, "Drop", "@lre@" + com.rsc.a.a.l(var5).ad(), var4);
                                 this.om.a(com.rsc.c.d.eF, "Examine", "@lre@" + com.rsc.a.a.l(var5).ad() + (this.ok ? " @or1@(" + var5 + ")" : ""), var5);
                              } else {
                                 this.om.a(com.rsc.c.d.eG, "Use " + this.pR + " with", "@lre@" + com.rsc.a.a.l(var5).ad(), var4, this.qN);
                              }
                           }
                        }
                     }
                  }

                  return;
               }

               this.dB().m(var2, 36 + var3 * 34, 245, 0);
               ++var3;
            }
         }

         var4 = var2 + var3 % 5 * 49;
         var5 = var3 / 5 * 34 + 36;
         if (this.pA > var3 && this.ny[var3] == 1) {
            this.dB().g(var4, var5, 49, 34, 16711680, 128);
         } else {
            this.dB().g(var4, var5, 49, 34, com.rsc.g.f.a(181, 181, 181), 128);
         }

         if (var3 < this.pA) {
            this.dB().a(this.dB().ad(this.ng[var3]), var4, var5, 48, 32, com.rsc.a.a.l(this.ng[var3]).aB(), 0, false, 0, 1);
            if (com.rsc.a.a.l(this.ng[var3]).aA()) {
               this.dB().a((String)("" + this.nh[var3]), 1 + var4, var5 + 10, 16776960, 1);
            }
         }

         ++var3;
      }
   }

   private void h(boolean var1) {
      int var2 = this.dB().iT - 199;
      byte var3 = 36;
      this.dB().a((com.rsc.a.b.c)this.dB().ae(5), var2 - 49, 3);
      short var4 = 196;
      short var5 = 182;
      int var6 = this.au() - 23;
      int var7 = this.au() - 83;
      int var8;
      int var9 = var8 = com.rsc.g.f.a(160, 160, 160);
      if (this.qK != 0) {
         var8 = com.rsc.g.f.a(220, 220, 220);
      } else {
         var9 = com.rsc.g.f.a(220, 220, 220);
      }

      this.dB().g(var2, var3, var4 / 2, 24, var9, 128);
      this.dB().g(var2 + var4 / 2, var3, var4 / 2, 24, var8, 128);
      this.dB().g(var2, 24 + var3, var4, var5 - 24, com.rsc.g.f.a(220, 220, 220), 128);
      this.dB().m(var2, var3 + 24, var4, 0);
      this.dB().n(var4 / 2 + var2, 0 + var3, 0, 24);
      this.dB().m(var2, var3 + var5 - 16, var4, 0);
      this.dB().a(var2 + var4 / 4, "Friends", 0, 0, 4, 16 + var3);
      this.dB().a(var4 / 4 + var2 + var4 / 2, "Ignore", 0, 0, 4, var3 + 16);
      this.qJ.G(this.pj);
      int var10;
      String var11;
      int var12;
      int var14;
      if (this.qK == 0) {
         for(var10 = 0; var10 < this.rw; ++var10) {
            if ((this.nV[var10] & 2) == 0) {
               if ((this.nV[var10] & 4) == 0) {
                  var11 = "@red@";
               } else {
                  var11 = "@yel@";
               }
            } else {
               var11 = "@gre@";
            }

            String var13 = this.nT[var10];
            var12 = 0;

            for(var14 = this.nT[var10].length(); this.dB().c(1, var13) > 120; var13 = this.nT[var10].substring(0, var14 - var12) + "...") {
               ++var12;
            }

            this.qJ.a(this.pj, var10, var11 + var13 + "~" + (this.au() - 73) + "~@whi@Remove         WWWWWWWWWW", -1, (String)null, (String)null);
         }
      }

      int var15;
      if (this.qK == 1) {
         for(var10 = 0; var10 < this.rx; ++var10) {
            var11 = this.nU[var10];
            var15 = 0;

            for(var12 = this.nU[var10].length(); this.dB().c(1, var11) > 120; var11 = this.nU[var10].substring(0, var12 - var15) + "...") {
               ++var15;
            }

            this.qJ.a(this.pj, var10, "@yel@" + var11 + "~" + (this.au() - 73) + "~@whi@Remove         WWWWWWWWWW", -1, (String)null, (String)null);
         }
      }

      this.qJ.bi();
      this.pY = -1;
      this.qd = -1;
      if (this.qK == 0) {
         var10 = this.qJ.I(this.pj);
         if (var10 >= 0 && this.A < var6) {
            if (this.A > var7) {
               this.qd = -(var10 + 2);
            } else {
               this.qd = var10;
            }
         }

         this.dB().a(var4 / 2 + var2, "Click a name to send a message", 16777215, -1, 1, 35 + var3);
         if (var2 < this.A && this.A < var2 + var4 && this.B > var5 + (var3 - 16) && this.B < var5 + var3) {
            var15 = 16776960;
         } else {
            var15 = 16777215;
         }

         this.dB().a(var4 / 2 + var2, "Click here to add a friend", var15, -1, 1, var5 + var3 - 3);
      }

      if (this.qK == 1) {
         var10 = this.qJ.I(this.pj);
         if (var10 >= 0 && this.A < var6) {
            if (this.A <= var7) {
               this.pY = var10;
            } else {
               this.pY = -(var10 + 2);
            }
         }

         this.dB().a(var2 + var4 / 2, "Blocking messages from:", 16777215, -1, 1, 35 + var3);
         if (this.A > var2 && var2 + var4 > this.A && var5 + var3 - 16 < this.B && var5 + var3 > this.B) {
            var15 = 16776960;
         } else {
            var15 = 16777215;
         }

         this.dB().a(var4 / 2 + var2, "Click here to add a name", var15, -1, 1, var3 + (var5 - 3));
      }

      if (var1) {
         var14 = this.B - 36;
         var2 = 199 + this.A - this.dB().au();
         if (var2 >= 0 && var14 >= 0 && var2 < 196 && var14 < 182) {
            this.qJ.f(var2 - 199 + this.dB().au(), var14 + 36, this.m, this.z);
            if (var14 <= 24 && this.s == 1) {
               if (var2 < 98 && this.qK == 1) {
                  this.qK = 0;
                  this.qJ.N(this.pj);
               } else if (var2 > 98 && this.qK == 0) {
                  this.qK = 1;
                  this.qJ.N(this.pj);
               }
            }

            if (this.s == 1 && this.qK == 0) {
               var10 = this.qJ.I(this.pj);
               if (var10 >= 0 && this.A < var6) {
                  if (this.A <= var7) {
                     if ((this.nV[var10] & 4) != 0) {
                        this.or = com.rsc.b.e.dm;
                        this.oY = this.nT[var10];
                        this.nY = "";
                        this.nX = "";
                     }
                  } else {
                     this.l(this.nT[var10]);
                  }
               }
            }

            if (this.s == 1 && this.qK == 1) {
               var10 = this.qJ.I(this.pj);
               if (var10 >= 0 && this.A < var6 && this.A > var7) {
                  this.m(this.nU[var10]);
               }
            }

            if (var14 > 166 && this.s == 1 && this.qK == 0) {
               this.ob = "";
               this.oa = "";
               this.or = com.rsc.b.e.dl;
            }

            if (var14 > 166 && this.s == 1 && this.qK == 1) {
               this.or = com.rsc.b.e.dn;
               this.oa = "";
               this.ob = "";
            }

            this.e(0);
         }
      }

   }

   private void i(boolean var1) {
      int var2 = this.dB().iT - 199;
      byte var3 = 36;
      this.dB().a((com.rsc.a.b.c)this.dB().ae(4), var2 - 49, 3);
      short var4 = 196;
      short var5 = 182;
      int var6;
      int var7 = var6 = com.rsc.g.f.a(160, 160, 160);
      if (this.pT != 0) {
         var6 = com.rsc.g.f.a(220, 220, 220);
      } else {
         var7 = com.rsc.g.f.a(220, 220, 220);
      }

      this.dB().g(var2, var3, var4 / 2, 24, var7, 128);
      this.dB().g(var4 / 2 + var2, var3, var4 / 2, 24, var6, 128);
      this.dB().g(var2, var3 + 24, var4, 90, com.rsc.g.f.a(220, 220, 220), 128);
      this.dB().g(var2, 114 + var3, var4, var5 - 24 - 90, com.rsc.g.f.a(160, 160, 160), 128);
      this.dB().m(var2, 24 + var3, var4, 0);
      this.dB().n(var2 + var4 / 2, var3, 0, 24);
      this.dB().m(var2, var3 + 113, var4, 0);
      this.dB().c(var4 / 4 + var2, 16 + var3, "Magic", 0, 4, -1);
      this.dB().c(var2 + var4 / 4 + var4 / 2, 16 + var3, "Prayers", 0, 4, -1);
      int var8;
      int var9;
      String var10;
      int var13;
      if (this.pT == 0) {
         this.qC.G(this.ph);
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

            var11 = this.nI[6];
            if (com.rsc.a.a.n(var9).aQ() > var11) {
               var10 = "@bla@";
            }

            this.qC.a(this.ph, var8++, var10 + "Level " + com.rsc.a.a.n(var9).aQ() + ": " + com.rsc.a.a.n(var9).ad(), -1, (String)null, (String)null);
         }

         this.qC.bi();
         var9 = this.qC.I(this.ph);
         if (var9 != -1) {
            this.dB().a((String)("Level " + com.rsc.a.a.n(var9).aQ() + ": " + com.rsc.a.a.n(var9).ad()), 2 + var2, var3 + 124, 16776960, 1);
            this.dB().a((String)com.rsc.a.a.n(var9).ar(), 2 + var2, 136 + var3, 16777215, 0);
            int var12 = 0;

            for(var14 = com.rsc.a.a.n(var9).aU().iterator(); var14.hasNext(); ++var12) {
               var15 = (Entry)var14.next();
               var11 = (Integer)var15.getKey();
               this.dB().a(this.dB().ad(var11), 2 + var2 + var12 * 44, var3 + 150);
               var13 = this.aB(var11);
               int var16 = (Integer)var15.getValue();
               String var17 = "@red@";
               if (this.F(var11, var16)) {
                  var17 = "@gre@";
               }

               this.dB().a((String)(var17 + var13 + "/" + var16), 2 + var2 + var12 * 44, var3 + 150, 16777215, 1);
            }
         } else {
            this.dB().a((String)"Point at a spell for a description", var2 + 2, var3 + 124, 0, 1);
         }
      }

      if (this.pT == 1) {
         this.qC.G(this.ph);
         var8 = 0;

         for(var9 = 0; var9 < com.rsc.a.a.O(); ++var9) {
            var10 = "@whi@";
            if (com.rsc.a.a.o(var9).aQ() > this.nH[5]) {
               var10 = "@bla@";
            }

            if (this.nK[var9]) {
               var10 = "@gre@";
            }

            this.qC.a(this.ph, var8++, var10 + "Level " + com.rsc.a.a.o(var9).aQ() + ": " + com.rsc.a.a.o(var9).ad(), -1, (String)null, (String)null);
         }

         this.qC.bi();
         var9 = this.qC.I(this.ph);
         if (var9 == -1) {
            this.dB().a((String)"Point at a prayer for a description", var2 + 2, var3 + 124, 0, 1);
         } else {
            this.dB().c(var2 + var4 / 2, var3 + 130, "Level " + com.rsc.a.a.o(var9).aQ() + ": " + com.rsc.a.a.o(var9).ad(), 16776960, 1, -1);
            this.dB().c(var2 + var4 / 2, 145 + var3, com.rsc.a.a.o(var9).ar(), 16777215, 0, -1);
            this.dB().c(var2 + var4 / 2, 160 + var3, "Drain rate: " + com.rsc.a.a.o(var9).aR(), 0, 1, -1);
         }
      }

      if (var1) {
         var2 = 199 - this.dB().iT + this.u();
         var13 = this.w() - 36;
         if (var2 >= 0 && var13 >= 0 && var2 < 196 && var13 < 182) {
            this.qC.f(var2 + (this.dB().iT - 199), var13 + 36, this.m, this.z);
            if (var13 <= 24 && this.s == 1) {
               if (var2 < 98 && this.pT == 1) {
                  this.pT = 0;
                  this.ro = this.qC.R(this.ph);
                  this.qC.f(this.ph, this.rp);
               } else if (var2 > 98 && this.pT == 0) {
                  this.pT = 1;
                  this.rp = this.qC.R(this.ph);
                  this.qC.f(this.ph, this.ro);
               }
            }

            if (this.s == 1 && this.pT == 0) {
               var8 = this.qC.I(this.ph);
               if (var8 != -1) {
                  var9 = this.nI[6];
                  if (var9 < com.rsc.a.a.n(var8).aQ()) {
                     this.a(h.ml, (String)null, (String)null, "Your magic ability is not high enough for this spell", 0);
                  } else {
                     int var18 = 0;

                     for(Iterator var19 = com.rsc.a.a.n(var8).aU().iterator(); var19.hasNext(); ++var18) {
                        Entry var20 = (Entry)var19.next();
                        if (!this.F((Integer)var20.getKey(), (Integer)var20.getValue())) {
                           this.a(h.ml, (String)null, (String)null, "You don't have all the reagents you need for this spell", 0);
                           var18 = -1;
                           break;
                        }
                     }

                     if (var18 == com.rsc.a.a.n(var8).aT()) {
                        this.qO = var8;
                        this.ru = var8;
                        this.qN = -1;
                        if (com.rsc.a.a.n(var8).aS() == 3 && var8 != 16 && c.A()) {
                           this.qZ = 1;
                        }
                     }
                  }
               }
            }

            if (this.s == 1 && this.pT == 1) {
               var8 = this.qC.I(this.ph);
               if (var8 != -1) {
                  var9 = this.nH[5];
                  if (var9 < com.rsc.a.a.o(var8).aQ()) {
                     this.a(h.ml, (String)null, (String)null, "Your prayer ability is not high enough for this prayer", 0);
                  } else if (this.nI[5] == 0) {
                     this.a(h.ml, (String)null, (String)null, "You have run out of prayer points. Return to a church to recharge", 0);
                  } else if (!this.nK[var8]) {
                     this.n().aO(60);
                     this.n().aK(var8);
                     this.n().dW();
                     this.nK[var8] = true;
                     this.k("prayeron");
                  } else {
                     this.n().aO(254);
                     this.n().aK(var8);
                     this.n().dW();
                     this.nK[var8] = false;
                     this.k("prayeroff");
                  }
               }
            }

            this.s = 0;
         }
      }

   }

   private void j(boolean var1) {
      int var2 = this.dB().iT - 199;
      byte var3 = 36;
      short var4 = 156;
      short var5 = 152;
      this.dB().a((com.rsc.a.b.c)this.dB().ae(2), var2 - 49, 3);
      var2 += 40;
      this.dB().e(var2, var3, var4, var5, 0);
      this.dB().o(var2, var4 + var2, var3 + var5, 36);
      short var6 = 192;
      int var7 = 255 & this.O.e();
      int var8 = var6 * (this.oA.cg() - 6040) * 3 / 2048;
      int var9 = var6 * (this.oA.ch() - 6040) * 3 / 2048;
      int var10 = 1023 & 1024 - var7 * 4;
      int var11 = i.hQ[var10];
      int var12 = i.hR[var10];
      int var13 = var8 * var12 + var11 * var9 >> 18;
      int var14 = var9 * var12 - var8 * var11 >> 18;
      this.dB().a((com.rsc.a.b.c)this.N.jN, var3 - (-(var5 / 2) - var14), var4 / 2 + var2 - var13, var6, 255 & 64 + var7);

      int var15;
      int var17;
      int var18;
      int var19;
      int var20;
      for(var15 = 0; var15 < this.pr; ++var15) {
         com.rsc.e.e var16 = this.oC[var15];
         var17 = var6 * (64 + (128 * var16.cf() - this.oA.ch())) * 3 / 2048;
         var18 = (128 * var16.ce() - (this.oA.cg() - 64)) * var6 * 3 / 2048;
         var19 = var12 * var18 + var17 * var11 >> 18;
         var20 = var12 * var17 - var11 * var18 >> 18;
         this.v(65535, var19 + var2 + var4 / 2, var3 - var20 + var5 / 2);
      }

      for(var15 = 0; var15 < this.ps; ++var15) {
         com.rsc.e.f var24 = this.oE[var15];
         var17 = var6 * (64 + var24.ce() * 128 - this.oA.cg()) * 3 / 2048;
         var18 = var6 * 3 * (64 + 128 * var24.cf() - this.oA.ch()) / 2048;
         var19 = var12 * var17 + var11 * var18 >> 18;
         var20 = var12 * var18 - var17 * var11 >> 18;
         this.v(16711680, var2 - (-(var4 / 2) - var19), var5 / 2 + var3 - var20);
      }

      for(var15 = 0; this.qu > var15; ++var15) {
         j var25 = this.ni[var15];
         var17 = var6 * 3 * (var25.ch() - this.oA.ch()) / 2048;
         var18 = var6 * 3 * (var25.cg() - this.oA.cg()) / 2048;
         var19 = var17 * var11 + var18 * var12 >> 18;
         var20 = var12 * var17 - var18 * var11 >> 18;
         this.v(16776960, var4 / 2 + var2 + var19, var5 / 2 - var20 + var3);
      }

      for(var15 = 0; this.qL > var15; ++var15) {
         k var26 = this.nl[var15];
         var17 = var6 * 3 * (var26.cg() - this.oA.cg()) / 2048;
         var18 = var6 * 3 * (var26.ch() - this.oA.ch()) / 2048;
         var19 = var17 * var12 + var11 * var18 >> 18;
         var20 = var12 * var18 - var17 * var11 >> 18;
         int var21 = 16777215;
         String var22 = com.rsc.g.l.a(var26.mU);
         if (null != var22) {
            for(int var23 = 0; var23 < this.rw; ++var23) {
               if (var22.equals(com.rsc.g.l.a(this.nT[var23])) && this.nV[var23] != 0) {
                  var21 = 65280;
                  break;
               }
            }
         }

         this.v(var21, var19 + var2 + var4 / 2, var3 - var20 + var5 / 2);
      }

      this.dB().g(var2 + var4 / 2, var5 / 2 + var3, 2, 16777215, 255);
      this.dB().a((com.rsc.a.b.c)this.dB().ae(22), 55, var2 + 19, 128, 255 & this.O.e() + 128);
      this.dB().o(0, this.au(), this.av() + 12, 0);
      if (var1) {
         var2 = 199 - this.dB().iT + this.u();
         var15 = this.w() - var3;
         if (var2 >= 40 && var15 >= 0 && var2 < 196 && var15 < 152) {
            var2 = this.dB().iT - 199;
            var2 += 40;
            var9 = (this.w() - var5 / 2 - var3) * 16384 / (var6 * 3);
            var8 = (this.u() + (-(var4 / 2) - var2)) * 16384 / (var6 * 3);
            var11 = i.hQ[var10];
            var12 = i.hR[var10];
            int var27 = var9 * var11 + var12 * var8 >> 15;
            var9 = var12 * var9 - var11 * var8 >> 15;
            var8 = var27 + this.oA.cg();
            var9 = this.oA.ch() - var9;
            if (this.s == 1) {
               this.b(this.os, this.ot, var8 / 128, var9 / 128, false);
            }

            this.s = 0;
         }
      }

   }

   private void k(boolean var1) {
      int var2 = this.dB().iT - 199;
      this.dB().a((com.rsc.a.b.c)this.dB().ae(6), var2 - 49, 3);
      byte var3 = 57;
      byte var4 = 21;
      short var5 = 196;
      short var6 = 255;
      if (var2 < this.A && this.A < var2 + var5 && 36 < this.B && this.B < 56) {
         var6 = 198;
         if (this.s == 1) {
            this.rr.bE();
         }
      }

      this.dB().g(var2 - 1, 36, var5 + 1, 20, com.rsc.g.f.a(13, 0, 130), var6);
      this.dB().a("Settings - " + (c.A() ? "tap " : "click ") + "here", var5 / 2 + var2, var3 - 7, var5 + 1, 1, 16777215, false);
      this.dB().m(var2 - 1, 56, var5 + 1, com.rsc.g.f.a(0, 1, 1));
      this.dB().g(var2, 36 + var4, var5, 65, com.rsc.g.f.a(181, 181, 181), 160);
      this.dB().g(var2, 101 + var4, var5, 65, com.rsc.g.f.a(201, 201, 201), 160);
      this.dB().g(var2, 166 + var4, var5, 95, com.rsc.g.f.a(181, 181, 181), 160);
      this.dB().g(var2, 261 + var4, var5, this.pz ? 55 : 40, com.rsc.g.f.a(201, 201, 201), 160);
      int var7 = 3 + var2;
      int var8 = var3 + 15;
      this.dB().a((String)"Game options - click to toggle", var7, var8, 0, 1);
      var8 += 15;
      if (this.rB) {
         this.dB().a((String)"Camera angle mode - @gre@Auto", var7, var8, 16777215, 1);
      } else {
         this.dB().a((String)"Camera angle mode - @red@Manual", var7, var8, 16777215, 1);
      }

      var8 += 15;
      if (this.rz) {
         this.dB().a((String)"Mouse buttons - @red@One", var7, var8, 16777215, 1);
      } else {
         this.dB().a((String)"Mouse buttons - @gre@Two", var7, var8, 16777215, 1);
      }

      var8 += 15;
      if (this.ou) {
         if (this.rA) {
            this.dB().a((String)"Sound effects - @red@off", var7, var8, 16777215, 1);
         } else {
            this.dB().a((String)"Sound effects - @gre@on", var7, var8, 16777215, 1);
         }
      }

      var8 += 15;
      this.dB().a((String)"To change your contact details,", var7, var8, 16777215, 0);
      var8 += 15;
      this.dB().a((String)"password, recovery questions, etc..", var7, var8, 16777215, 0);
      var8 += 15;
      this.dB().a((String)"please select 'account management'", var7, var8, 16777215, 0);
      var8 += 15;
      this.dB().a((String)"from runescapeclassic.org front page", var7, var8, 16777215, 0);
      var8 += 15;
      var8 += 5;
      this.dB().a((String)"Privacy settings. Will be applied to", 3 + var2, var8, 0, 1);
      var8 += 15;
      this.dB().a((String)"all people not on your friends list", var2 + 3, var8, 0, 1);
      var8 += 15;
      if (this.rC != 0) {
         this.dB().a((String)"Block chat messages: @gre@<on>", 3 + var2, var8, 16777215, 1);
      } else {
         this.dB().a((String)"Block chat messages: @red@<off>", 3 + var2, var8, 16777215, 1);
      }

      var8 += 15;
      if (this.rE == 0) {
         this.dB().a((String)"Block private messages: @red@<off>", 3 + var2, var8, 16777215, 1);
      } else {
         this.dB().a((String)"Block private messages: @gre@<on>", var2 + 3, var8, 16777215, 1);
      }

      var8 += 15;
      if (this.rF != 0) {
         this.dB().a((String)"Block trade requests: @gre@<on>", var2 + 3, var8, 16777215, 1);
      } else {
         this.dB().a((String)"Block trade requests: @red@<off>", 3 + var2, var8, 16777215, 1);
      }

      var8 += 15;
      if (this.ou) {
         if (this.rD != 0) {
            this.dB().a((String)"Block duel requests: @gre@<on>", var2 + 3, var8, 16777215, 1);
         } else {
            this.dB().a((String)"Block duel requests: @red@<off>", 3 + var2, var8, 16777215, 1);
         }
      }

      var8 += 15;
      int var9;
      if (this.pz) {
         var9 = 16777215;
         var8 += 5;
         if (var7 < this.A && this.A < var7 + var5 && var8 - 12 < this.B && this.B < 4 + var8) {
            var9 = 16776960;
         }

         this.dB().a((String)"Skip the tutorial", var7, var8, var9, 1);
         var8 += 15;
      }

      var8 += 5;
      this.dB().a((String)"Always logout when you finish", var7, var8, 0, 1);
      var9 = 16777215;
      var8 += 15;
      if (var7 < this.A && var7 + var5 > this.A && var8 - 12 < this.B && this.B < 4 + var8) {
         var9 = 16776960;
      }

      this.dB().a((String)"Click here to logout", var2 + 3, var8, var9, 1);
      if (var1) {
         var2 = 199 - this.dB().iT + this.u();
         int var10 = this.B - 56;
         if (var2 >= 0 && var10 >= 0 && var2 < 196 && var10 < 265) {
            int var11 = this.dB().au() - 199;
            var7 = var11 + 3;
            byte var12 = 57;
            var5 = 196;
            var8 = 30 + var12;
            if (this.A > var7 && var7 + var5 > this.A && this.B > var8 - 12 && var8 + 4 > this.B && this.s == 1) {
               this.rB = !this.rB;
               this.T.aO(111);
               this.T.aK(4);
               this.T.aK(this.rB ? 1 : 0);
               this.T.dW();
            }

            var8 += 15;
            if (this.A > var7 && var7 + var5 > this.A && var8 - 12 < this.B && 4 + var8 > this.B && this.s == 1) {
               this.rz = !this.rz;
               this.T.aO(111);
               this.T.aK(5);
               this.T.aK(this.rz ? 1 : 0);
               this.T.dW();
            }

            var8 += 15;
            if (this.ou && this.A > var7 && var7 + var5 > this.A && var8 - 12 < this.B && var8 + 4 > this.B && this.s == 1) {
               this.rA = !this.rA;
               this.T.aO(111);
               this.T.aK(6);
               this.T.aK(this.rA ? 1 : 0);
               this.T.dW();
            }

            var8 += 15;
            var8 += 15;
            var8 += 15;
            var8 += 15;
            var8 += 15;
            var8 += 35;
            boolean var13 = false;
            if (this.A > var7 && this.A < var5 + var7 && this.B > var8 - 12 && 4 + var8 > this.B && this.s == 1) {
               this.rC = 1 - this.rC;
               this.T.aO(111);
               this.T.aK(0);
               this.T.aK(this.rC);
               this.T.dW();
            }

            var8 += 15;
            if (this.A > var7 && var5 + var7 > this.A && this.B > var8 - 12 && var8 + 4 > this.B && this.s == 1) {
               this.rE = 1 - this.rE;
               this.T.aO(111);
               this.T.aK(1);
               this.T.aK(this.rE);
               this.T.dW();
            }

            var8 += 15;
            if (this.A > var7 && this.A < var7 + var5 && var8 - 12 < this.B && this.B < 4 + var8 && this.s == 1) {
               this.rF = 1 - this.rF;
               this.T.aO(111);
               this.T.aK(2);
               this.T.aK(this.rF);
               this.T.dW();
            }

            var8 += 15;
            if (this.ou && this.A > var7 && this.A < var7 + var5 && var8 - 12 < this.B && this.B < var8 + 4 && this.s == 1) {
               this.rD = 1 - this.rD;
               this.T.aO(111);
               this.T.aK(3);
               this.T.aK(this.rD);
               this.T.dW();
            }

            var8 += 15;
            if (this.pz) {
               var8 += 5;
               if (this.A > var7 && var5 + var7 > this.A && var8 - 12 < this.B && this.B < var8 + 4 && this.s == 1) {
                  this.a(new String[]{"Are you sure you wish to skip the tutorial", "and teleport to Lumbridge?"}, com.rsc.b.b.cD, false);
                  this.qZ = 0;
               }

               var8 += 15;
            }

            var8 += 20;
            if (this.A > var7 && var5 + var7 > this.A && this.B > var8 - 12 && this.B < var8 + 4 && this.s == 1) {
               this.dy();
            }

            this.s = 0;
         }
      }

   }

   private void l(boolean var1) {
      int var2 = this.dB().iT - 199;
      byte var3 = 36;
      this.dB().a((com.rsc.a.b.c)this.dB().ae(3), var2 - 49, 3);
      short var4 = 196;
      short var5 = 275;
      int var6;
      int var7 = var6 = com.rsc.g.f.a(160, 160, 160);
      if (this.rh != 0) {
         var6 = com.rsc.g.f.a(220, 220, 220);
      } else {
         var7 = com.rsc.g.f.a(220, 220, 220);
      }

      this.dB().g(var2, var3, var4 / 2, 24, var7, 128);
      this.dB().g(var2 + var4 / 2, var3, var4 / 2, 24, var6, 128);
      this.dB().g(var2, 24 + var3, var4, var5 - 24, com.rsc.g.f.a(220, 220, 220), 128);
      this.dB().m(var2, var3 + 24, var4, 0);
      this.dB().n(var2 + var4 / 2, var3, 0, 24);
      this.dB().a(var4 / 4 + var2, "Stats", 0, -1, 4, var3 + 16);
      this.dB().a(var2 + var4 / 4 + var4 / 2, "Quests", 0, -1, 4, var3 + 16);
      int var8;
      byte var9;
      if (this.rh == 0) {
         var9 = 72;
         this.dB().a((String)"Skills", var2 + 5, var9, 16776960, 3);
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

            this.dB().a((String)(cD()[var11] + ":@yel@" + this.nI[var11] + "/" + this.nH[var11]), var2 + 5, var8, var12, 1);
            var12 = 16777215;
            if (this.A >= var2 + 90 && this.B >= var8 - 11 - 13 && var8 - 13 + 2 > this.B && this.A < var2 + 196) {
               var12 = 16711680;
               var10 = 9 + var11;
            }

            this.dB().a((String)(cD()[9 + var11] + ":@yel@" + this.nI[9 + var11] + "/" + this.nH[9 + var11]), var4 / 2 - 5 + var2, var8 - 13, var12, 1);
            var8 += 13;
         }

         this.dB().a((String)("Quest Points:@yel@" + this.pS), var2 - 5 + var4 / 2, var8 - 13, 16777215, 1);
         var8 += 12;
         this.dB().a((String)("Fatigue: @yel@" + this.rd * 100 / 750 + "%"), 5 + var2, var8 - 13, 16777215, 1);
         var8 += 8;
         this.dB().a((String)"Equipment Status", 5 + var2, var8, 16776960, 3);
         var8 += 12;

         for(var11 = 0; var11 < 3; ++var11) {
            this.dB().a((String)(this.nw[var11] + ":@yel@" + this.nJ[var11]), 5 + var2, var8, 16777215, 1);
            if (2 > var11) {
               this.dB().a((String)(this.nw[var11 + 3] + ":@yel@" + this.nJ[3 + var11]), var4 / 2 + var2 + 25, var8, 16777215, 1);
            }

            var8 += 13;
         }

         var8 += 6;
         this.dB().m(var2, var8 - 15, var4, 0);
         if (var10 == -1) {
            this.dB().a((String)"Overall levels", var2 + 5, var8, 16776960, 1);
            var8 += 12;
            var11 = 0;

            for(var12 = 0; var12 < 18; ++var12) {
               var11 += this.nH[var12];
            }

            this.dB().a((String)("Skill total: " + var11), 5 + var2, var8, 16777215, 1);
            var8 += 12;
            this.dB().a((String)("Combat level: " + this.oA.mK), 5 + var2, var8, 16777215, 1);
         } else {
            this.dB().a((String)(this.nQ[var10] + " skill"), 5 + var2, var8, 16776960, 1);
            var8 += 12;
            var11 = this.nx[0];

            for(var12 = 0; var12 < 98; ++var12) {
               if (this.nx[var12] <= this.nF[var10]) {
                  var11 = this.nx[var12 + 1];
               }
            }

            this.dB().a((String)("Total xp: " + this.nF[var10]), 5 + var2, var8, 16777215, 1);
            var8 += 12;
            this.dB().a((String)("Next level at: " + var11), 5 + var2, var8, 16777215, 1);
         }
      }

      int var13;
      if (this.rh == 1) {
         this.qI.G(this.pi);
         var9 = 0;
         var13 = var9 + 1;
         this.qI.a(this.pi, var9, "@whi@Quest-list (green=completed)", -1, (String)null, (String)null);

         for(var8 = 0; var8 < this.nL.length - 1; ++var8) {
            if (this.nL[var8] != null) {
               this.qI.a(this.pi, var13++, (this.nM[var8] == 0 ? "@red@" : (this.nM[var8] > 0 ? "@yel@" : "@gre@")) + this.nL[var8], 0, (String)null, (String)null);
            }
         }

         this.qI.bi();
      }

      if (var1) {
         var13 = this.B - 36;
         var2 = -this.dB().au() - (-199 - this.A);
         if (var2 >= 0 && var13 >= 0 && var2 < var4 && var13 < var5) {
            if (this.rh == 1) {
               this.qI.f(var2 + this.dB().au() - 199, 36 + var13, this.m, this.z);
            }

            if (var13 <= 24 && this.s == 1) {
               if (var2 >= 98) {
                  this.rh = 1;
               } else {
                  this.rh = 0;
               }
            }
         }
      }

   }

   private void a(int var1, String var2, String var3, String var4, int var5) {
      if (this.qH.fg[var1] - 4 != this.qH.fh[var1]) {
         this.qH.a(var2, false, var5, var4, var3, var1);
      } else {
         this.qH.a(var2, true, var5, var4, var3, var1);
      }

   }

   public void m(boolean var1) {
      this.rv = var1;
      this.o = -1;
      this.p = -1;
      if (this.rv) {
         this.o = this.A;
         this.p = this.B;
      }

   }

   public void dh() {
      this.r = this.A;
      this.q = this.B;
      int var1 = this.o - this.r;
      int var10000 = this.p - this.q;
      this.o = this.r;
      this.p = this.q;
      this.O.c(this.O.e() - var1 & 255);
   }

   public boolean E(int var1, int var2) {
      this.aB = var1;
      this.aC = var2;
      this.oy = this.aB;
      this.oz = this.aC;
      return false;
   }

   public boolean di() {
      return this.oy > -1 && this.oz > -1;
   }

   public void dj() {
      this.bq = this.oy;
      this.br = this.oz - 12;
      this.dB().l(this.bq, this.br + 12);
      this.dB().o(0, this.au(), this.av() + 12, 0);
      i var10000 = this.L;
      int var10001 = this.au() / 2;
      int var10002 = this.au() / 2;
      int var10003 = this.au();
      int var10004 = this.av() / 2;
      int var10005 = this.av() / 2;
      this.getClass();
      var10000.d(var10001, var10002, var10003, var10004, var10005, 9);
      int var1 = this.dB().iT - 199;
      byte var2 = 36;
      this.qC.b(this.ph, var1, 24 + var2, 196, 90);
      this.qJ.b(this.pj, var1, var2 + 40, 196, 126);
      this.qI.b(this.pi, var1, 24 + var2, 196, 251);
      this.qH.b(this.qD, 5, this.av() - 65, this.au() - 10, 56);
      this.qH.b(this.qE, 7, this.av() - 10, this.au() - 14, 14);
      this.qH.b(this.qG, 5, this.av() - 65, this.au() - 10, 56);
      this.qH.b(this.qF, 5, this.av() - 65, this.au() - 10, 56);
      this.oy = this.oz = -1;
   }

   public final int aB(int var1) {
      int var2 = 0;

      for(int var3 = 0; this.pA > var3; ++var3) {
         if (this.ng[var3] == var1) {
            if (com.rsc.a.a.l(this.ng[var3]).aA()) {
               var2 += this.nh[var3];
            } else {
               ++var2;
            }
         }
      }

      return var2;
   }

   private j aC(int var1) {
      for(int var2 = 0; var2 < this.qu; ++var2) {
         if (var1 == this.ni[var2].cd()) {
            return this.ni[var2];
         }
      }

      return null;
   }

   private k aD(int var1) {
      for(int var2 = 0; this.qL > var2; ++var2) {
         if (var1 == this.nl[var2].cd()) {
            return this.nl[var2];
         }
      }

      return null;
   }

   private void dk() {
      this.qz.f(this.u(), this.B, this.m, this.z);
      if (this.qz.L(this.pb)) {
         do {
            this.oT = (com.rsc.a.a.M() + (this.oT - 1)) % com.rsc.a.a.M();
         } while((3 & com.rsc.a.a.m(this.oT).af()) != 1);
      }

      if (this.qz.L(this.pc)) {
         do {
            this.oT = (1 + this.oT) % com.rsc.a.a.M();
         } while(1 != (3 & com.rsc.a.a.m(this.oT).af()));
      }

      if (this.qz.L(this.pV)) {
         this.bF = (this.dD().length + (this.bF - 1)) % this.dD().length;
      }

      if (this.qz.L(this.pN)) {
         this.bF = (1 + this.bF) % this.dD().length;
      }

      if (this.qz.L(this.pQ) || this.qz.L(this.pZ)) {
         for(this.oS = 3 - this.oS; (3 & com.rsc.a.a.m(this.oT).af()) != 1; this.oT = (1 + this.oT) % com.rsc.a.a.M()) {
         }

         while((3 & com.rsc.a.a.m(this.pM).af()) != 2 || (this.oS * 4 & com.rsc.a.a.m(this.pM).af()) == 0) {
            this.pM = (this.pM + 1) % com.rsc.a.a.M();
         }
      }

      if (this.qz.L(this.qe)) {
         this.bG = (this.bG - 1 + this.dE().length) % this.dE().length;
      }

      if (this.qz.L(this.pP)) {
         this.bG = (this.bG + 1) % this.dE().length;
      }

      if (this.qz.L(this.qj)) {
         this.bI = (this.dF().length + (this.bI - 1)) % this.dF().length;
      }

      if (this.qz.L(this.pX)) {
         this.bI = (1 + this.bI) % this.dF().length;
      }

      if (this.qz.L(this.qb)) {
         this.pW = (this.dE().length + this.pW - 1) % this.dE().length;
      }

      if (this.qz.L(this.pJ)) {
         this.pW = (1 + this.pW) % this.dE().length;
      }

      if (this.qz.L(this.pO)) {
         this.n().aO(235);
         this.n().aK(this.oS);
         this.n().aK(this.oT);
         this.n().aK(this.pM);
         com.rsc.f.e var10000 = this.n();
         this.getClass();
         var10000.aK(2);
         this.n().aK(this.bF);
         this.n().aK(this.bG);
         this.n().aK(this.pW);
         this.n().aK(this.bI);
         this.n().dW();
         this.dB().c(true);
         this.qU = false;
      }

   }

   private void dl() {
      if (this.re > 1) {
         --this.re;
      }

      int var1;
      for(var1 = 0; var1 < 100; ++var1) {
         g var2 = this.oB[var1];
         if (var2 != null && var2.cq() > 0) {
            var2.co();
         }
      }

      if (this.pH > 0) {
         --this.pH;
      }

      if (this.oA.ck() == 8 || this.oA.ck() == 9) {
         this.mz = 500;
      }

      if (this.mz > 0) {
         --this.mz;
      }

      if (this.qU) {
         this.dk();
      } else {
         if (this.pp > 0) {
            --this.pp;
            if (this.pp == 0) {
               this.a(h.ml, (String)null, (String)null, "You have been granted another life. Be more careful this time!", 0);
            }

            if (this.pp == 0) {
               this.a(h.ml, (String)null, (String)null, "You retain your skills. Your objects land where you died", 0);
            }
         }

         for(var1 = 0; var1 < this.qL; ++var1) {
            this.nl[var1].cy();
         }

         for(var1 = 0; var1 < this.qu; ++var1) {
            this.ni[var1].cy();
         }

         this.O.a();
         this.do();
         this.dp();
         this.qH.f(this.u(), this.B, this.m, this.z);
         if (this.qp != com.rsc.b.c.cG && this.u() >= this.au() - 18 && this.B >= this.av() - 66) {
            this.z = 0;
         }

         this.dm();
         if (this.pp != 0) {
            this.z = 0;
         }

         this.dn();
         if (this.z == 1) {
            this.s = 1;
         } else if (this.z == 2) {
            this.s = 2;
         }

         this.L.m(0, this.u(), this.B);
         this.z = 0;
         if (this.oh) {
            ++nf;
            if (nf >= nd.size()) {
               nf = nd.size() - 1;
               this.oh = false;
               return;
            }

            this.qH.a(this.qE, (String)nd.get(nf));
            this.oh = false;
         } else if (this.oi) {
            --nf;
            if (nf < 0) {
               nf = 0;
               this.oi = false;
               return;
            }

            this.qH.a(this.qE, (String)nd.get(nf));
            this.oi = false;
         }

         if (this.v > 0) {
            --this.v;
         } else if (this.v < 0) {
            ++this.v;
         }

         this.L.Y(17);
         ++this.qv;
         if (this.qv > 5) {
            this.qv = 0;
            this.qy = (1 + this.qy) % 4;
            this.qx = (1 + this.qx) % 3;
            this.qw = (1 + this.qw) % 5;
         }

         for(var1 = 0; var1 < this.rg; ++var1) {
            l var4 = this.nr[var1];
            var4.au(var4.cA() + 1);
            if (var4.cA() > 50) {
               --this.rg;

               for(int var3 = var1; var3 < this.rg; ++var3) {
                  this.nr[var3] = this.nr[var3 + 1];
               }
            }
         }

      }
   }

   private void dm() {
      if (this.qH.L(this.qE)) {
         String var1 = this.qH.J(this.qE);
         this.qH.a(this.qE, "");
         if (nd.size() != 0 && ((String)nd.get(nd.size() - 1)).equalsIgnoreCase(var1)) {
            if (((String)nd.get(nd.size() - 1)).equalsIgnoreCase(var1)) {
               nf = nd.size();
            }
         } else {
            nd.add(var1);
            nf = nd.size();
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
      if (this.ok) {
         if (var1.equals("cnoclip")) {
            com.rsc.c.m.jW = !com.rsc.c.m.jW;
            this.a(h.ml, (String)null, (String)null, "No clip " + (com.rsc.c.m.jW ? "enabled" : "disabled") + ".", "", 0);
            return;
         }

         if (var1.equalsIgnoreCase("dev")) {
            this.qR = !this.qR;
            return;
         }

         if (var1.startsWith("n ") && this.ok) {
            this.qS = this.g(var2[1]);
            return;
         }
      }

      if ((this.oI || this.ok) && var1.equalsIgnoreCase("mod")) {
         this.qT = !this.qT;
      }

      this.o(var1);
   }

   private void dn() {
      if (!this.oF.lN && !this.oG.kS && !this.dH()) {
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

   private void do() {
      if (this.pB) {
         if (this.ob.length() > 0) {
            this.n().aO(45);
            this.n().aK(0);
            this.n().p(this.ob);
            this.n().dW();
            this.oa = "";
            this.ob = "";
            this.rb = "Please wait...";
         } else if (this.z == 1 && this.B > 275 - (c.A() ? 110 : 0) && this.B < 310 - (c.A() ? 110 : 0) && this.u() > 56 && this.u() < 456) {
            this.n().aO(45);
            this.n().aK(0);
            this.n().p("-null-");
            this.n().dW();
            this.rb = "Please wait...";
            this.ob = "";
            this.oa = "";
         }

         this.z = 0;
      }

   }

   private void dp() {
      if (this.B > this.av() - 4) {
         if (this.A > 15 + (this.au() / 2 - 256) && this.A < 96 + (this.au() / 2 - 256) && this.z == 1) {
            this.qp = com.rsc.b.c.cG;
         }

         if (this.A > 110 + (this.au() / 2 - 256) && this.A < 194 + (this.au() / 2 - 256) && this.z == 1) {
            this.qp = com.rsc.b.c.cH;
            this.qH.fh[this.qD] = 999999;
         }

         if (this.A > 215 + (this.au() / 2 - 256) && this.A < 295 + (this.au() / 2 - 256) && this.z == 1) {
            this.qp = com.rsc.b.c.cI;
            this.qH.fh[this.qG] = 999999;
         }

         if (this.A > 315 + (this.au() / 2 - 256) && this.A < 395 + (this.au() / 2 - 256) && this.z == 1) {
            this.qp = com.rsc.b.c.cJ;
            this.qH.fh[this.qF] = 999999;
         }

         if (this.A > 417 + (this.au() / 2 - 256) && this.A < 497 + (this.au() / 2 - 256) && this.z == 1) {
            this.ob = "";
            this.nP = 1;
            this.oa = "";
         }

         this.m = 0;
         this.z = 0;
      }

   }

   public final void aE(int var1) {
      if (this.po == f.rJ) {
         if (this.qf == 0 && this.qB != null) {
            this.qB.M(var1);
         }

         if (this.qf == 2 && null != this.qA) {
            this.qA.M(var1);
         }
      }

      if (this.po == f.rK) {
         if (this.qU) {
            this.qz.M(var1);
            return;
         }

         if (this.rs.kh.P(this.rs.kk)) {
            this.rs.af(var1);
            return;
         }

         if (this.qY && c.A()) {
            try {
               int var2 = Integer.parseInt("" + (char)var1) - 1;
               if (var2 >= 0 && var2 < this.nA) {
                  this.T.aO(116);
                  this.T.aK(var2);
                  this.T.dW();
                  this.e(0);
                  this.qY = false;
                  return;
               }
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }

         if (this.or == com.rsc.b.e.dk && this.nP == 0 && !this.pB && this.pt == com.rsc.b.b.cu) {
            this.qH.M(var1);
         }
      }

   }

   private void dq() {
      if (this.qh > 0) {
         --this.qh;
      }

      switch(this.qf) {
      case 0:
         this.qB.f(this.u(), this.B, this.m, this.z);
         if (this.qB.L(this.pU)) {
            this.qf = 2;
            this.qA.a(this.pe, "");
            this.qA.a(this.pf, c.A() ? "To open keyboard press the back button" : "Please enter your username and password");
            this.qA.L(this.pd);
            this.qA.L(this.pK);
            this.qA.L(this.pg);
            this.qA.O(this.pg);
            return;
         }
         break;
      case 2:
         this.qA.f(this.u(), this.B, this.m, this.z);
         if (this.qA.L(this.qg)) {
            this.qf = 0;
         }

         if (this.qA.L(this.pg)) {
            this.qA.O(this.pd);
         }

         boolean var1 = this.qA.L(this.pd);
         boolean var2 = this.qA.L(this.pK);
         if (var1 || var2) {
            this.oU = 2;
            this.mU = this.qA.J(this.pg);
            this.ry = this.qA.J(this.pd);
            this.f(false);
         }
      }

   }

   private void aF(int var1) {
      // $FF: Couldn't be decompiled
   }

   protected void a(com.rsc.f.a var1, int var2, int var3) {
      if (var2 == 134) {
         byte var13 = var1.dM();
         switch(var13) {
         case 0:
            byte var15 = var1.dM();
            if (var15 == 0) {
               this.rt.bE();
            } else if (var15 == 1) {
               this.rt.bG();
            }
         default:
         }
      } else {
         int var4;
         int var6;
         if (var2 == 131) {
            var4 = var1.dN();
            h var5 = h.ar(var1.dN());
            var6 = var1.dN();
            String var7 = var1.dL();
            String var8 = null;
            String var9 = null;
            String var10 = null;
            if (var6 > 1) {
               var8 = var1.dL();
               var9 = var1.dL();
               var10 = var1.dL();
            } else if ((var6 & 1) != 0) {
               var8 = var1.dL();
            }

            this.a(var5, var8, var10, var7, var9, var4);
         } else if (var2 == 4) {
            this.a(true);
         } else if (var2 == 183) {
            this.cG();
         } else if (var2 == 165) {
            this.a(false);
         } else {
            String var11;
            int var12;
            if (var2 == 149) {
               var11 = com.rsc.g.l.c(var1.dS());
               var12 = var1.dN();

               for(var6 = 0; var6 < this.rw; ++var6) {
                  if (this.nT[var6].equals(var11)) {
                     if (this.nV[var6] == 0 && var12 != 0) {
                        this.a(h.mq, (String)null, (String)null, var11 + " has logged in", 0);
                     }

                     if (this.nV[var6] != 0 && var12 == 0) {
                        this.a(h.mq, (String)null, (String)null, var11 + " has logged out", 0);
                     }

                     this.nV[var6] = var12;
                     this.dz();
                     return;
                  }
               }

               if (var11.length() > 0) {
                  this.nT[this.rw] = var11;
                  this.nV[this.rw] = var12;
                  ++this.rw;
                  this.dz();
               }
            } else if (var2 == 109) {
               this.rx = var1.dN();

               for(var4 = 0; var4 < this.rx; ++var4) {
                  this.nU[var4] = com.rsc.g.l.c(var1.dS());
               }
            } else if (var2 == 120) {
               var11 = var1.dL();
               var12 = var1.dN();
               String var16 = com.rsc.g.k.a(var1);
               this.a(h.mm, var11, (String)null, var16, var12);
            } else if (var2 == 87) {
               var11 = var1.dL();
               String var14 = com.rsc.g.k.a(var1);
               this.a(h.mn, var11, (String)null, var14, 0);
            } else {
               this.b(var1, var2, var3);
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
         int var28;
         boolean var30;
         if (var2 == 191) {
            this.pC = this.qL;
            if (this.pC >= 0) {
               System.arraycopy(this.nl, 0, this.nm, 0, this.pC);
            }

            var1.dJ();
            this.os = var1.aJ(11);
            this.ot = var1.aJ(13);
            var18 = var1.aJ(4);
            var30 = this.G(this.os, this.ot);
            this.os -= this.op;
            this.ot -= this.oq;
            var6 = 64 + this.os * 128;
            var7 = 64 + this.ot * 128;
            if (var30) {
               this.oA.cw();
               this.oA.C(var6, var7);
               this.oA.u(0, var6, var7);
            }

            this.qL = 0;
            this.oA = this.v(this.qi, var6, var7, var18);
            var21 = var1.aJ(8);

            int var13;
            int var14;
            for(var9 = 0; var21 > var9; ++var9) {
               k var41 = this.nm[var9 + 1];
               var11 = var1.aJ(1);
               if (var11 == 1) {
                  var12 = var1.aJ(1);
                  if (var12 == 0) {
                     var13 = var1.aJ(3);
                     var14 = var41.mP;
                     int var15 = var41.mQ[var14];
                     int var16 = var41.mR[var14];
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

               this.nl[this.qL++] = var41;
            }

            while(var3 * 8 > var1.dI() - -24) {
               var9 = var1.aJ(11);
               var28 = var1.aJ(5);
               if (var28 > 15) {
                  var28 -= 32;
               }

               var11 = var1.aJ(5);
               if (var11 > 15) {
                  var11 -= 32;
               }

               var12 = var1.aJ(4);
               var13 = (this.os + var28) * 128 + 64;
               var14 = (this.ot + var11) * 128 + 64;
               this.v(var9, var13, var14, var12);
            }

            var1.dK();
            return;
         }

         int var5;
         if (var2 == 79) {
            this.qt = this.qu;
            this.qu = 0;
            if (this.qt >= 0) {
               System.arraycopy(this.ni, 0, this.nj, 0, this.qt);
            }

            var1.dJ();
            var18 = var1.aJ(8);

            for(var5 = 0; var18 > var5; ++var5) {
               j var36 = this.nj[var5];
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
                     var28 = var36.mP;
                     var11 = var36.mQ[var28];
                     var12 = var36.mR[var28];
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

                     var36.u((1 + var28) % 10, var11, var12);
                     var36.at(var9);
                  }
               }

               this.ni[this.qu++] = var36;
            }

            while(var1.dI() + 34 < var3 * 8) {
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
               var28 = (this.os + var6) * 128 + 64;
               var11 = (this.ot + var7) * 128 + 64;
               this.k(var21, var9, var28, var11, var5);
            }

            var1.dK();
            return;
         }

         com.rsc.e.e var23;
         byte var33;
         if (var2 == 48) {
            while(true) {
               while(var3 > var1.rO) {
                  if (var1.dN() != 255) {
                     --var1.rO;
                     var18 = var1.dQ();
                     var5 = this.os + var1.dP();
                     var6 = this.ot + var1.dP();
                     var33 = var1.dM();
                     var21 = 0;

                     for(var9 = 0; var9 < this.pr; ++var9) {
                        com.rsc.e.e var38 = this.oC[var9];
                        if (var38.ce() == var5 && var38.cf() == var6) {
                           this.L.c(var38.cj());
                           this.N.b(var38);
                        } else {
                           if (var21 != var9) {
                              this.oC[var21].c(this.oC[var9]);
                              this.oC[var21].am(var21);
                              this.oC[var21].cj().gx = var21;
                           }

                           ++var21;
                        }
                     }

                     this.pr = var21;
                     if (var18 != 60000) {
                        var23 = new com.rsc.e.e();
                        var23.an(var18);
                        var23.D(var5, var6);
                        var23.ap(var33);
                        com.rsc.c.h var40 = this.R[var23.cl().bu].bl();
                        this.L.b(var40);
                        var23.d(var40);
                        var23.am(this.pr);
                        var40.gx = this.pr;
                        var11 = (var5 * 2 + var23.au()) * 128 / 2;
                        var12 = (var6 * 2 + var23.av()) * 128 / 2;
                        var40.i(var11, -this.N.p(var11, var12), var12);
                        var40.b(-50, -10, -50, 48, 48, true);
                        var40.b(0, var23.ck() * 32, 0);
                        if (var18 == 74) {
                           var40.j(0, -480, 0);
                        }

                        this.N.a(var23);
                        this.oC[this.pr] = var23;
                        ++this.pr;
                     }
                  } else {
                     var18 = this.os + var1.dP() >> 3;
                     var5 = this.ot + var1.dP() >> 3;
                     var6 = 0;

                     for(var7 = 0; var7 < this.pr; ++var7) {
                        com.rsc.e.e var34 = this.oC[var7];
                        var9 = (var34.ce() >> 3) - var18;
                        var28 = (var34.cf() >> 3) - var5;
                        if (var9 == 0 && var28 == 0) {
                           this.L.c(var34.cj());
                           this.N.b(var34);
                        } else {
                           if (var6 != var7) {
                              this.oC[var6].c(this.oC[var7]);
                              this.oC[var6].am(var6);
                              this.oC[var6].cj().gx = var6;
                           }

                           ++var6;
                        }
                     }

                     this.pr = var6;
                  }
               }

               return;
            }
         }

         if (var2 == 53) {
            this.pA = var1.dN();

            for(var18 = 0; var18 < this.pA; ++var18) {
               var5 = var1.dQ();
               this.ng[var18] = var5;
               this.ny[var18] = var1.dM();
               if (com.rsc.a.a.l(var5).aA()) {
                  this.nh[var18] = var1.dR();
               } else {
                  this.nh[var18] = 1;
               }
            }

            return;
         }

         if (var2 == 91) {
            while(true) {
               while(var3 > var1.rO) {
                  if (var1.dN() != 255) {
                     --var1.rO;
                     var18 = var1.dQ();
                     var5 = this.os + var1.dP();
                     var6 = this.ot + var1.dP();
                     var33 = var1.dM();
                     var21 = 0;

                     for(var9 = 0; var9 < this.ri; ++var9) {
                        m var37 = this.oD[var9];
                        if (var37.ce() == var5 && var37.cf() == var6) {
                           this.L.c(var37.cB());
                           this.N.b(var37);
                        } else {
                           if (var21 != var9) {
                              this.oD[var21].c(this.oD[var9]);
                              this.oD[var21].am(var21);
                              this.oD[var21].cB().gx = 10000 + var21;
                           }

                           ++var21;
                        }
                     }

                     this.ri = var21;
                     if (var18 != 60000) {
                        m var39 = new m();
                        var39.an(var18);
                        var39.ap(var33);
                        var39.D(var5, var6);
                        var39.e(this.l(var5, var6, var18, var33, this.ri));
                        var39.cB().gx = 10000 + this.ri;
                        this.N.a(var39);
                        this.oD[this.ri] = var39;
                        ++this.ri;
                     }
                  } else {
                     var18 = 0;
                     var5 = this.os + var1.dP() >> 3;
                     var6 = this.ot + var1.dP() >> 3;

                     for(var7 = 0; this.ri > var7; ++var7) {
                        m var32 = this.oD[var7];
                        var9 = (var32.ce() >> 3) - var5;
                        var28 = (var32.cf() >> 3) - var6;
                        if (var9 == 0 && var28 == 0) {
                           this.L.c(var32.cB());
                           this.N.b(var32);
                        } else {
                           if (var7 != var18) {
                              this.oD[var18].c(this.oD[var7]);
                              this.oD[var18].am(var18);
                              this.oD[var18].cB().gx = 10000 + var18;
                           }

                           ++var18;
                        }
                     }

                     this.ri = var18;
                  }
               }

               return;
            }
         }

         if (var2 == 104) {
            var18 = var1.dQ();

            for(var5 = 0; var18 > var5; ++var5) {
               var6 = var1.dQ();
               j var29 = this.nk[var6];
               var21 = var1.dN();
               if (var21 == 1) {
                  var9 = var1.dQ();
                  if (var29 != null) {
                     var29.d(var1.dL());
                     if (this.oA.cd() == var9) {
                        this.a(h.mo, (String)null, "@yel@", var29.cz().ad() + ": " + var29.mi, 0);
                     }
                  }
               } else if (var21 == 2) {
                  var9 = var1.dN();
                  var28 = var1.dN();
                  var11 = var1.dN();
                  if (null != var29) {
                     var29.mH = var28;
                     var29.mI = var11;
                     var29.mB = var9;
                     var29.mA = 200;
                     var29.mz = 200;
                  }
               }
            }

            return;
         }

         if (var2 == 25) {
            this.pG = true;
            this.qi = var1.dQ();
            this.ow = var1.dQ();
            this.ox = var1.dQ();
            this.qM = var1.dQ();
            this.qa = var1.dQ();
            this.ox -= this.qM * this.qa;
            return;
         }

         if (var2 == 156) {
            for(var18 = 0; var18 < 18; ++var18) {
               this.nI[var18] = var1.dN();
            }

            for(var18 = 0; var18 < 18; ++var18) {
               this.nH[var18] = var1.dN();
            }

            for(var18 = 0; var18 < 18; ++var18) {
               this.nF[var18] = var1.dR();
            }

            this.pS = var1.dN();
            return;
         }

         if (var2 == 83) {
            this.pp = 250;
            return;
         }

         if (var2 == 59) {
            this.qU = true;
            return;
         }

         if (var2 == 92) {
            var18 = var1.dQ();
            if (this.nn[var18] != null) {
               this.oF.lM = this.nn[var18].mU;
            }

            this.oF.lN = true;
            this.oF.lL = 0;
            this.oF.lH = 0;
            this.oF.lD = false;
            this.oF.lI = false;
            return;
         }

         if (var2 == 128) {
            this.oF.lO = false;
            this.oF.lN = false;
            return;
         }

         byte var4;
         if (var2 == 15) {
            var4 = var1.dM();
            this.oF.lD = var4 == 1;
            return;
         }

         if (var2 == 162) {
            var18 = var1.dN();
            this.oF.lI = var18 == 1;
            return;
         }

         if (var2 == 137) {
            this.oH.lg = false;
            return;
         }

         if (var2 == 240) {
            this.ok = var1.dN() == 1;
            this.oI = var1.dN() == 1;
            this.rG = var1.dN() == 1;
            this.rC = var1.dN();
            this.rE = var1.dN();
            this.rF = var1.dN();
            this.rD = var1.dN();
            this.rB = var1.dN() == 1;
            this.rz = var1.dN() == 1;
            this.rA = var1.dN() == 1;
            this.pa = var1.dM();
            c.ac = var1.dN() == 1;
            c.ag = var1.dN() == 1;
            c.ah = var1.dN() == 1;
            c.ai = var1.dN() == 1;
            c.ak = var1.dN();
            c.al = var1.dN();
            c.am = var1.dN();
            c.ap = var1.dN() == 1;
            c.as = var1.dN() == 1;
            c.at = var1.dN() == 1;
            c.aq = var1.dQ();
            c.ar = var1.dN();
            c.ad = var1.dN() == 1;
            c.ae = var1.dN() == 1;
            c.af = var1.dN() == 1;
            return;
         }

         if (var2 == 241) {
            var18 = var1.dN();
            if (var18 == 18) {
               c.aq = var1.dQ();
            } else {
               switch(var18) {
               case 0:
                  this.rC = var1.dN();
                  break;
               case 1:
                  this.rE = var1.dN();
                  break;
               case 2:
                  this.rF = var1.dN();
                  break;
               case 3:
                  this.rD = var1.dN();
                  break;
               case 4:
                  this.rB = var1.dN() == 1;
                  break;
               case 5:
                  this.rz = var1.dN() == 1;
                  break;
               case 6:
                  this.rA = var1.dN() == 1;
                  break;
               case 7:
                  this.pa = var1.dN();
                  break;
               case 8:
                  c.ac = var1.dN() == 1;
                  break;
               case 9:
                  c.ag = var1.dN() == 1;
                  break;
               case 10:
                  c.ah = var1.dN() == 1;
                  break;
               case 11:
                  c.ai = var1.dN() == 1;
                  break;
               case 12:
                  c.ak = var1.dN();
                  break;
               case 13:
                  c.al = var1.dN();
                  break;
               case 14:
                  c.am = var1.dN();
                  break;
               case 15:
                  c.ap = var1.dN() == 1;
                  break;
               case 16:
                  c.as = var1.dN() == 1;
                  break;
               case 17:
                  c.at = var1.dN() == 1;
               case 18:
               default:
                  break;
               case 19:
                  c.ar = var1.dN();
                  break;
               case 20:
                  c.ad = var1.dN() == 1;
                  break;
               case 21:
                  c.ae = var1.dN() == 1;
                  break;
               case 22:
                  c.af = var1.dN() == 1;
               }
            }

            return;
         }

         if (var2 == 206) {
            for(var18 = 0; var3 - 1 > var18; ++var18) {
               var30 = var1.dM() == 1;
               if (!this.nK[var18] && var30) {
                  this.k("prayeron");
               }

               if (this.nK[var18] && !var30) {
                  this.k("prayeroff");
               }

               this.nK[var18] = var30;
            }

            return;
         }

         if (var2 == 5) {
            var4 = var1.dM();
            if (var4 == 0) {
               byte var26 = var1.dM();

               for(var6 = 0; var6 < var26; ++var6) {
                  var7 = var1.dR();
                  var21 = var1.dR();
                  String var35 = var1.dL();
                  this.nL[var7] = var35;
                  this.nM[var7] = var21;
               }
            } else if (var4 == 1) {
               var5 = var1.dR();
               var6 = var1.dR();
               this.nM[var5] = var6;
            }

            return;
         }

         if (var2 == 42) {
            this.qV = true;
            this.qq = var1.dN();
            this.oO = var1.dN();

            for(var18 = 0; var18 < this.qq; ++var18) {
               this.qr[var18] = var1.dQ();
               this.qs[var18] = var1.dR();
            }

            this.aH(108);
            return;
         }

         if (var2 == 33) {
            var18 = var1.dN();
            this.nF[var18] = var1.dR();
            return;
         }

         if (var2 == 225) {
            this.oG.kS = false;
            this.oG.kT = false;
            return;
         }

         if (var2 == 20) {
            this.oF.lN = false;
            this.oF.lO = true;
            this.oF.lE = false;
            this.oF.lK = var1.dL();
            this.oF.lJ = var1.dN();

            for(var18 = 0; this.oF.lJ > var18; ++var18) {
               this.oF.ly[var18] = var1.dQ();
               this.oF.lx[var18] = var1.dR();
            }

            this.oF.lF = var1.dN();

            for(var18 = 0; var18 < this.oF.lF; ++var18) {
               this.oF.lt[var18] = var1.dQ();
               this.oF.lu[var18] = var1.dR();
            }

            return;
         }

         if (var2 == 6) {
            this.oG.kX = var1.dN();

            for(var18 = 0; this.oG.kX > var18; ++var18) {
               this.oG.la[var18] = var1.dQ();
               this.oG.lb[var18] = var1.dR();
            }

            this.oG.kE = false;
            this.oG.kF = false;
            return;
         }

         if (var2 == 30) {
            if (var1.dN() == 1) {
               this.oG.kQ = true;
            } else {
               this.oG.kQ = false;
            }

            if (var1.dN() != 1) {
               this.oG.kO = false;
            } else {
               this.oG.kO = true;
            }

            if (var1.dN() != 1) {
               this.oG.kP = false;
            } else {
               this.oG.kP = true;
            }

            if (var1.dN() != 1) {
               this.oG.kR = false;
            } else {
               this.oG.kR = true;
            }

            this.oG.kE = false;
            this.oG.kF = false;
            return;
         }

         if (var2 == 249) {
            var18 = var1.dN();
            var5 = var1.dQ();
            var6 = var1.dR();
            if (var6 == 0) {
               --this.qq;

               for(var7 = var18; this.qq > var7; ++var7) {
                  this.qr[var7] = this.qr[1 + var7];
                  this.qs[var7] = this.qs[var7 + 1];
               }
            } else {
               this.qr[var18] = var5;
               this.qs[var18] = var6;
               if (this.qq <= var18) {
                  this.qq = var18 + 1;
               }
            }

            this.aH(-103);
            return;
         }

         if (var2 == 90) {
            var18 = var1.dN();
            var5 = var1.dQ();
            var6 = 1;
            if (com.rsc.a.a.l(var5 & 32767).aA()) {
               var6 = var1.dR();
            }

            this.ng[var18] = var5 & 32767;
            this.ny[var18] = var5 / '耀';
            this.nh[var18] = var6;
            if (var18 >= this.pA) {
               this.pA = 1 + var18;
            }

            return;
         }

         if (var2 == 159) {
            var18 = var1.dN();
            this.nI[var18] = var1.dN();
            this.nH[var18] = var1.dN();
            this.nF[var18] = var1.dR();
            return;
         }

         if (var2 == 210) {
            var4 = var1.dM();
            if (var4 != 1) {
               this.oG.kE = false;
            } else {
               this.oG.kE = true;
            }

            return;
         }

         if (var2 == 253) {
            var4 = var1.dM();
            if (var4 != 1) {
               this.oG.kF = false;
            } else {
               this.oG.kF = true;
            }

            return;
         }

         if (var2 == 172) {
            this.oG.kU = false;
            this.oG.kT = true;
            this.oG.kS = false;
            this.oG.kW = var1.dL();
            this.oG.kZ = var1.dN();

            for(var18 = 0; var18 < this.oG.kZ; ++var18) {
               this.oG.le[var18] = var1.dQ();
               this.oG.lf[var18] = var1.dR();
            }

            this.oG.kY = var1.dN();

            for(var18 = 0; this.oG.kY > var18; ++var18) {
               this.oG.lc[var18] = var1.dQ();
               this.oG.ld[var18] = var1.dR();
            }

            this.oG.kM = var1.dN();
            this.oG.kK = var1.dN();
            this.oG.kL = var1.dN();
            this.oG.kN = var1.dN();
            return;
         }

         if (var2 == 176) {
            var18 = var1.dQ();
            if (null != this.nn[var18]) {
               this.oG.kV = this.nn[var18].mU;
            }

            this.oG.kE = false;
            this.oG.kP = false;
            this.oG.kF = false;
            this.oG.kR = false;
            this.oG.kQ = false;
            this.oG.kS = true;
            this.oG.kO = false;
            this.oG.kX = 0;
            this.oG.kD = 0;
            return;
         }

         if (var2 == 204) {
            String var31 = var1.dL();
            this.k(var31);
            return;
         }

         if (var2 == 182) {
            if (!this.rm) {
               this.rl = var1.dL();
               this.rj = var1.dQ();
               this.rn = var1.dQ();
               this.qW = true;
               this.rk = null;
               this.rm = true;
            }

            return;
         }

         if (var2 == 222) {
            this.qP = var1.dL();
            this.qX = true;
            this.qQ = true;
            return;
         }

         if (var2 == 117) {
            if (!this.pB) {
               this.pq = this.rd;
            }

            this.oa = "";
            this.pB = true;
            this.ob = "";
            this.oJ = this.D.a(new ByteArrayInputStream(var1.rN, 1, var3));
            this.rb = null;
            return;
         }

         if (var2 == 84) {
            this.pB = false;
            return;
         }

         if (var2 == 194) {
            this.rb = "Incorrect - Please wait...";
            return;
         }

         if (var2 == 52) {
            this.re = var1.dQ() * 32;
            return;
         }

         if (var2 == 244) {
            this.pq = var1.dQ();
            return;
         }

         if (var2 == 114) {
            this.rd = var1.dQ();
            return;
         }

         if (var2 == 89) {
            this.qP = var1.dL();
            this.qX = true;
            this.qQ = false;
            return;
         }

         if (var2 == 36) {
            if (this.rg < 50) {
               var18 = var1.dN();
               var5 = var1.dM() + this.os;
               var6 = var1.dM() + this.ot;
               this.nr[this.rg++] = new l(var5, var6, var18);
            }

            return;
         }

         if (var2 == 123) {
            var18 = var1.dN();
            --this.pA;

            for(var5 = var18; this.pA > var5; ++var5) {
               this.ng[var5] = this.ng[var5 + 1];
               this.nh[var5] = this.nh[var5 + 1];
               this.ny[var5] = this.ny[var5 + 1];
            }

            return;
         }

         if (var2 == 203) {
            this.n(false);
            return;
         }

         if (var2 == 101) {
            this.oH.lg = true;
            this.oH.li = var1.dN();
            this.oH.lh = var1.dM();
            this.oH.ln = var1.dN();
            this.oH.lj = var1.dN();
            this.oH.lk = var1.dN();

            for(var18 = 0; var18 < 40; ++var18) {
               this.oH.lp[var18] = -1;
            }

            for(var18 = 0; this.oH.li > var18; ++var18) {
               this.oH.lp[var18] = var1.dQ();
               this.oH.lo[var18] = var1.dQ();
               this.oH.lq[var18] = var1.dQ();
            }

            if (this.oH.lh == 1) {
               var18 = 39;

               for(var5 = 0; var5 < this.pA && this.oH.li <= var18; ++var5) {
                  boolean var19 = false;

                  for(var7 = 0; var7 < 40; ++var7) {
                     if (this.ng[var5] == this.oH.lp[var7]) {
                        var19 = true;
                        break;
                     }
                  }

                  if (this.ng[var5] == 10) {
                     var19 = true;
                  }

                  if (!var19) {
                     this.oH.lp[var18] = this.ng[var5] & 32767;
                     this.oH.lo[var18] = 0;
                     this.oH.lq[var18] = 0;
                     --var18;
                  }
               }
            }

            if (this.oH.ll >= 0 && 40 > this.oH.ll && this.oH.lm != this.oH.lp[this.oH.ll]) {
               this.oH.ll = -1;
               this.oH.lm = -2;
            }

            return;
         }

         if (var2 == 97) {
            this.oF.lL = var1.dN();

            for(var18 = 0; var18 < this.oF.lL; ++var18) {
               this.oF.lz[var18] = var1.dQ();
               this.oF.lA[var18] = var1.dR();
            }

            this.oF.lI = false;
            this.oF.lD = false;
            return;
         }

         if (var2 == 153) {
            for(var18 = 0; var18 < 5; ++var18) {
               this.nJ[var18] = var1.dN();
            }

            return;
         }

         if (var2 == 245) {
            this.qY = true;
            var18 = var1.dN();
            this.nA = var18;

            for(var5 = 0; var18 > var5; ++var5) {
               this.pI[var5] = var1.dL();
            }

            return;
         }

         if (var2 == 252) {
            this.qY = false;
            return;
         }

         if (var2 == 234) {
            var18 = var1.dQ();

            for(var5 = 0; var18 > var5; ++var5) {
               var6 = var1.dQ();
               k var22 = this.nn[var6];
               byte var24 = var1.dM();
               if (var24 == 0) {
                  var9 = var1.dQ();
                  if (var22 != null) {
                     var22.as(var9);
                  }
               } else if (var24 == 1) {
                  if (var22 != null) {
                     var9 = var1.dN();
                     String var27 = var1.dL();
                     var22.mL = 150;
                     var22.mi = var27;
                     this.a(h.mp, var22.mU + "@yel@", "@yel@", var27, var9);
                  }
               } else if (var24 == 2) {
                  var9 = var1.dN();
                  var28 = var1.dN();
                  var11 = var1.dN();
                  if (var22 != null) {
                     var22.mI = var11;
                     var22.mH = var28;
                     var22.mB = var9;
                     var22.mA = 200;
                     if (this.oA == var22) {
                        this.nI[3] = var28;
                        this.nH[3] = var11;
                        this.qX = false;
                        this.qW = false;
                     }

                     var22.mz = 200;
                  }
               } else if (var24 == 3) {
                  var9 = var1.dQ();
                  var28 = var1.dQ();
                  if (var22 != null) {
                     var22.mN = 40;
                     var22.mD = this.aC(var28);
                     var22.mJ = var9;
                  }
               } else if (var24 == 4) {
                  var9 = var1.dQ();
                  var28 = var1.dQ();
                  if (var22 != null) {
                     var22.mD = this.aD(var28);
                     var22.mN = 40;
                     var22.mJ = var9;
                  }
               }

               if (var24 == 6 && var22 != null) {
                  var22.mi = var1.dL();
                  var22.mL = 150;
                  if (this.oA == var22) {
                     this.a(h.mo, var22.mU, (String)null, var22.mi, 0);
                  }
               } else if (var24 == 5 && var22 != null) {
                  var22.mU = var1.dL();
                  var9 = var1.dN();

                  for(var28 = 0; var28 < var9; ++var28) {
                     var11 = var1.dQ() - 1;
                     var22.mG[var28] = com.rsc.a.a.m(var11);
                  }

                  for(var28 = var9; var28 < 12; ++var28) {
                     var22.mG[var28] = null;
                  }

                  var22.mX = var1.dN();
                  var22.mZ = var1.dN();
                  var22.mW = var1.dN();
                  var22.mY = var1.dN();
                  var22.mK = var1.dN();
                  var22.mV = var1.dN();
               }
            }

            return;
         }

         if (var2 == 111) {
            this.pz = var1.dN() != 0;
            return;
         }

         if (var2 == 99) {
            while(true) {
               while(true) {
                  while(var3 > var1.rO) {
                     if (var1.dN() != 255) {
                        --var1.rO;
                        var18 = var1.dQ();
                        var5 = this.os + var1.dP();
                        var6 = this.ot + var1.dP();
                        if ((var18 & '耀') != 0) {
                           var18 &= 32767;
                           var7 = 0;

                           for(var21 = 0; var21 < this.ps; ++var21) {
                              com.rsc.e.f var25 = this.oE[var21];
                              if (var25.ce() == var5 && var25.cf() == var6 && var25.at() == var18) {
                                 var18 = -123;
                              } else {
                                 if (var7 != var21) {
                                    this.oE[var7].a(var25);
                                 }

                                 ++var7;
                              }
                           }

                           this.ps = var7;
                        } else {
                           com.rsc.e.f var20 = new com.rsc.e.f();
                           var20.D(var5, var6);
                           var20.an(var18);
                           var20.aq(0);
                           this.oE[this.ps++] = var20;

                           for(var21 = 0; this.pr > var21; ++var21) {
                              var23 = this.oC[var21];
                              if (var23.ce() == var5 && var23.cf() == var6) {
                                 var20.aq(var23.cl().aw());
                                 break;
                              }
                           }
                        }
                     } else {
                        var18 = 0;
                        var5 = var1.dP();
                        var6 = var1.dP();
                        var7 = this.os + var5 >> 3;
                        var21 = this.ot + var6 >> 3;

                        for(var9 = 0; this.ps > var9; ++var9) {
                           com.rsc.e.f var10 = this.oE[var9];
                           var11 = (var10.ce() >> 3) - var7;
                           var12 = (var10.cf() >> 3) - var21;
                           if (var11 != 0 || var12 != 0) {
                              if (var18 != var9) {
                                 this.oE[var18].a(var10);
                              }

                              ++var18;
                           }
                        }

                        this.ps = var18;
                     }
                  }

                  return;
               }
            }
         }

         if (var2 == 112) {
            this.rs.e(var1.dM() == 1);
            this.rs.ag(var1.dM() & 255);
            this.rs.bL();
            var4 = var1.dM();
            if (var4 > 0) {
               for(var5 = 0; var5 < var4; ++var5) {
                  var6 = var1.dP();
                  var7 = var1.dR();
                  String var8 = var1.dL();
                  if (var6 != -1 && var7 != -1) {
                     this.rs.a(var6, var7, var8);
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

   private void dr() {
      if (this.u() >= this.dB().iT - 35 && this.B >= 3 && this.u() < this.dB().iT - 3 && this.B < 35 && this.qZ == 0) {
         this.qZ = 1;
      }

      if (this.qZ == 0 && this.u() >= this.dB().iT - 35 - 33 && this.B >= 3 && this.dB().iT - 3 - 33 > this.u() && this.B < 35) {
         this.qZ = 2;
      }

      if (this.qZ == 0 && this.dB().iT - 101 <= this.u() && this.B >= 3 && this.u() < this.dB().iT - 3 - 66 && this.B < 35) {
         this.qZ = 3;
      }

      if (this.qZ == 0 && this.u() >= this.dB().iT - 99 - 35 && this.B >= 3 && this.dB().iT - 3 - 99 > this.u() && this.B < 35) {
         this.qZ = 4;
      }

      if (this.qZ == 0 && this.u() >= this.dB().iT - 35 - 132 && this.B >= 3 && this.u() < this.dB().iT - 135 && this.B < 35) {
         this.qZ = 5;
      }

      if (this.qZ == 0 && this.dB().iT - 35 - 165 <= this.u() && this.B >= 3 && this.u() < this.dB().iT - 165 - 3 && this.B < 35) {
         this.qZ = 6;
      }

      if (this.qZ != 0 && this.dB().iT - 35 <= this.u() && this.B >= 3 && this.dB().iT - 3 > this.u() && this.B < 26) {
         this.qZ = 1;
      }

      if (this.qZ != 0 && this.qZ != 2 && this.dB().iT - 68 <= this.u() && this.B >= 3 && this.dB().iT - 33 - 3 > this.u() && this.B < 26) {
         this.qZ = 2;
      }

      if (this.qZ != 0 && this.u() >= this.dB().iT - 66 - 35 && this.B >= 3 && this.dB().iT - 3 - 66 > this.u() && this.B < 26) {
         this.qZ = 3;
      }

      if (this.qZ != 0 && this.dB().iT - 35 - 99 <= this.u() && this.B >= 3 && this.dB().iT - 102 > this.u() && this.B < 26) {
         this.qZ = 4;
      }

      if (this.qZ != 0 && this.dB().iT - 167 <= this.u() && this.B >= 3 && this.dB().iT - 132 - 3 > this.u() && this.B < 26) {
         this.qZ = 5;
      }

      if (this.qZ != 0 && this.dB().iT - 35 - 165 <= this.u() && this.B >= 3 && this.u() < this.dB().iT - 168 && this.B < 26) {
         this.qZ = 6;
      }

      if (this.qZ == 1) {
         label176: {
            if (this.u() >= this.dB().iT - 248) {
               this.getClass();
               if (36 + 30 / 4 * 34 >= this.B) {
                  break label176;
               }
            }

            this.qZ = 0;
         }
      }

      if (this.qZ == 3 && (this.dB().iT - 199 > this.u() || this.B > 316)) {
         this.qZ = 0;
      }

      if ((this.qZ == 2 || this.qZ == 4 || this.qZ == 5) && (this.dB().iT - 199 > this.u() || this.B > 240)) {
         this.qZ = 0;
      }

      if (this.qZ == 6 && (this.dB().iT - 199 > this.u() || this.B > 325)) {
         this.qZ = 0;
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
      for(int var2 = 0; this.pA > var2; ++var2) {
         if (var1 == this.ng[var2] && this.ny[var2] == 1) {
            return true;
         }
      }

      return false;
   }

   private void ds() {
      this.pH = 0;
      this.qf = 0;
      this.po = f.rJ;
      this.re = 0;
      this.oK = false;
   }

   private boolean G(int var1, int var2) {
      if (this.pp != 0) {
         this.N.jK = false;
         return false;
      } else {
         this.pG = false;
         var2 += this.ox;
         var1 += this.ow;
         if (this.ol == this.qM && this.pm < var1 && this.pk > var1 && this.pn < var2 && var2 < this.pl) {
            this.N.jK = true;
            return false;
         } else {
            this.dB().c(256, 192, "Loading... Please wait", 16777215, 1, -1);
            this.cO();
            int var3 = this.op;
            int var4 = this.oq;
            int var5 = (var1 + 24) / 48;
            int var6 = (var2 + 24) / 48;
            this.op = var5 * 48 - 48;
            this.oq = var6 * 48 - 48;
            this.ol = this.qM;
            this.pk = var5 * 48 + 32;
            this.pm = var5 * 48 - 32;
            this.pn = var6 * 48 - 32;
            this.pl = var6 * 48 + 32;
            this.N.r(var1, var2, this.ol);
            this.op -= this.ow;
            this.oq -= this.ox;
            int var7 = this.op - var3;
            int var8 = this.oq - var4;

            int var9;
            int var13;
            for(var9 = 0; this.pr > var9; ++var9) {
               com.rsc.e.e var10 = this.oC[var9];
               var10.D(var10.ce() - var7, var10.cf() - var8);
               com.rsc.c.h var11 = var10.cj();

               try {
                  int var12 = var10.ce();
                  var13 = var10.cf();
                  int var14 = (var10.ce() * 2 + var10.au()) * 128 / 2;
                  int var15 = (var10.cf() * 2 + var10.av()) * 128 / 2;
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

            for(var9 = 0; this.ri > var9; ++var9) {
               m var18 = this.oD[var9];
               var18.D(var18.ce() - var7, var18.cf() - var8);

               try {
                  this.N.a(var18);
                  var18.e(this.l(var18.ce(), var18.cf(), var18.at(), var18.ck(), var9));
               } catch (RuntimeException var16) {
                  System.out.println("Bound Error: " + var16.getMessage());
                  var16.printStackTrace();
               }
            }

            for(var9 = 0; this.ps > var9; ++var9) {
               com.rsc.e.f var19 = this.oE[var9];
               var19.D(var19.ce() - var7, var19.cf() - var8);
            }

            var9 = var7 * 128;
            int var20 = var8 * 128;

            int[] var10000;
            int var21;
            for(var21 = 0; var21 < this.qL; ++var21) {
               k var22 = this.nl[var21];
               var22.C(var22.cg() - var9, var22.ch() - var20);

               for(var13 = 0; var13 <= var22.mP; ++var13) {
                  var10000 = var22.mQ;
                  var10000[var13] -= var9;
                  var10000 = var22.mR;
                  var10000[var13] -= var20;
               }
            }

            for(var21 = 0; var21 < this.qu; ++var21) {
               j var23 = this.ni[var21];
               var23.C(var23.cg() - var9, var23.ch() - var20);

               for(var13 = 0; var23.mP >= var13; ++var13) {
                  var10000 = var23.mQ;
                  var10000[var13] -= var9;
                  var10000 = var23.mR;
                  var10000[var13] -= var20;
               }
            }

            this.N.jK = true;
            return true;
         }
      }
   }

   private long dt() {
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

   private String du() {
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
      if (this.pH != 0) {
         this.ds();
      } else {
         System.out.println("Lost connection");
         this.oU = 10;
         this.f(true);
      }

   }

   private void k(String var1) {
      if (!this.rA) {
         int var2 = com.rsc.g.d.b(var1 + ".pcm", this.Q);
         int var3 = com.rsc.g.d.a(var1 + ".pcm", this.Q);
         this.D.a(this.Q, var3, var2);
      }

   }

   private void b(String var1, String var2) {
      this.n().aO(218);
      this.n().q(var1);
      com.rsc.g.k.a(this.n(), var2);
      this.n().dW();
   }

   private void l(String var1) {
      String var2 = com.rsc.g.l.a(var1);
      if (var2 != null) {
         for(int var3 = 0; var3 < this.rw; ++var3) {
            if (var2.equals(com.rsc.g.l.a(this.nT[var3]))) {
               --this.rw;

               for(int var4 = var3; var4 < this.rw; ++var4) {
                  this.nT[var4] = this.nT[1 + var4];
                  this.nV[var4] = this.nV[var4 + 1];
               }

               this.n().aO(167);
               this.n().p(var1);
               this.n().dW();
               break;
            }
         }
      }

   }

   private void m(String var1) {
      String var2 = com.rsc.g.l.a(var1);
      if (var2 != null) {
         for(int var3 = 0; var3 < this.rx; ++var3) {
            if (var2.equals(com.rsc.g.l.a(this.nU[var3]))) {
               --this.rx;
               if (this.rx - var3 >= 0) {
                  System.arraycopy(this.nU, 1 + var3, this.nU, var3, this.rx - var3);
               }

               this.n().aO(241);
               this.n().p(var1);
               this.n().dW();
               break;
            }
         }
      }

   }

   private void dv() {
      byte var1 = 0;
      byte var2 = 50;
      byte var3 = 50;
      this.N.r(var2 * 48 + 23, var3 * 48 + 23, var1);
      this.N.a(this.R);
      this.o(0, 9728, 6400, 888, 1100);
      this.o(1, 9216, 9216, 888, 1100);

      for(int var4 = 0; var4 < 64; ++var4) {
         this.L.c(this.N.jM[0][var4]);
         this.L.c(this.N.jL[1][var4]);
         this.L.c(this.N.jM[1][var4]);
         this.L.c(this.N.jL[2][var4]);
         this.L.c(this.N.jM[2][var4]);
      }

      this.L.bv();
      this.o(2, 11136, 10368, 376, 500);
   }

   public void o(int var1, int var2, int var3, int var4, int var5) {
      this.L.in = 4100;
      this.L.iy = 1;
      this.L.ix = 4000;
      this.L.b(var2, -this.N.p(var2, var3), var3, 912, var4, 0, var5 * 2);
      this.L.bv();
      this.dB().by();
      this.dB().by();
      this.dB().e(0, 0, this.au(), 6, 0);

      int var6;
      for(var6 = 6; var6 >= 1; --var6) {
         this.dB().e(8, var6, var6, 0, this.au(), 0);
      }

      this.dB().e(0, 194, this.au(), 20, 0);

      for(var6 = 6; var6 >= 1; --var6) {
         this.dB().e(8, var6, 194 - var6, 0, this.au(), 0);
      }

      this.dB().a((com.rsc.a.b.c)this.dB().ae(8), 15, 15);
      this.nS[var1] = this.dB().l(0, 0, this.au(), 200);
   }

   private void dw() {
      this.T.rO = 0;
      this.re = 0;
      this.qf = 0;
      this.pH = 0;
      this.cH();
      this.rs.d(false);
      this.rr.d(false);
      this.rt.bG();
      this.dB().c(true);

      int var1;
      for(var1 = 0; var1 < this.pr; ++var1) {
         com.rsc.e.e var2 = this.oC[var1];
         this.L.c(var2.cj());
         this.N.b(var2);
      }

      for(var1 = 0; var1 < this.ri; ++var1) {
         m var3 = this.oD[var1];
         this.L.c(var3.cB());
         this.N.b(var3);
      }

      this.ps = 0;
      this.pr = 0;
      this.ri = 0;
      this.qL = 0;
      this.qu = 0;

      for(var1 = 0; var1 < this.nl.length; ++var1) {
         this.nl[var1] = null;
      }

      for(var1 = 0; var1 < this.ni.length; ++var1) {
         this.ni[var1] = null;
      }

      for(var1 = 0; var1 < 50; ++var1) {
         this.nK[var1] = false;
      }

      this.oH.lg = false;
      this.m = 0;
      this.z = 0;
      this.s = 0;
      this.pB = false;
      this.n(false);
      this.rw = 0;
      this.nP = 0;

      for(var1 = 0; var1 < 100; ++var1) {
         this.oB[var1] = null;
      }

      this.po = f.rK;
   }

   private void dx() {
      this.qu = 0;
      this.qL = 0;
      this.qf = 0;
      this.po = f.rJ;
   }

   private void n(String var1) {
      this.n().aO(216);
      com.rsc.g.k.a(this.n(), var1);
      this.n().dW();
   }

   public final void o(String var1) {
      this.n().aO(38);
      this.n().q(var1);
      this.n().dW();
   }

   private void dy() {
      if (this.po != f.rJ) {
         if (this.mz <= 450) {
            if (0 < this.mz) {
               this.a(h.ml, (String)null, "@cya@", "You can't logout for 10 seconds after combat", 0);
            } else {
               this.n().aO(102);
               this.n().dW();
               this.pH = 1000;
            }
         } else {
            this.a(h.ml, (String)null, "@cya@", "You can't logout during combat!", 0);
         }
      }

   }

   private boolean d(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = this.N.a(this.mQ, this.mR, var1, var2, var3, var4, var5, var6, false);
      if (var8 == -1) {
         return false;
      } else {
         --var8;
         var1 = this.mQ[var8];
         var2 = this.mR[var8];
         if (!var7) {
            this.n().aO(187);
         } else {
            this.n().aO(16);
         }

         --var8;
         this.n().aL(this.op + var1);
         this.n().aL(this.oq + var2);
         if (var7 && var8 == -1 && (this.op + var1) % 5 == 0) {
            var8 = 0;
         }

         for(int var9 = var8; var9 >= 0 && var8 - 25 < var9; --var9) {
            this.n().aK(this.mQ[var9] - var1);
            this.n().aK(this.mR[var9] - var2);
         }

         this.n().dW();
         this.w = this.A;
         this.x = this.B;
         this.v = -24;
         return true;
      }
   }

   private void a(com.rsc.b.b var1, String[] var2, boolean var3, String var4) {
      this.pw = var2;
      this.py = 400;

      for(int var5 = 0; var2.length > var5; ++var5) {
         int var6 = this.dB().c(1, var2[var5]) + 10;
         if (this.py < var6) {
            this.py = var6;
         }
      }

      this.pv = 20 + (this.dB().ac(1) + 2) * (1 + var2.length) + this.dB().ac(4);
      this.pt = var1;
      this.px = false;
      this.pu = var3;
      this.oa = var4;
      this.ob = "";
   }

   public final void a(String[] var1, com.rsc.b.b var2, boolean var3) {
      this.a(var2, var1, var3, "");
   }

   private void c(String var1, String var2) {
      if (this.qf == 2) {
         if (var2 != null && var2.length() >= 1) {
            this.qA.a(this.pe, var1);
            this.qA.a(this.pf, var2);
         } else {
            this.qA.a(this.pf, var1);
         }
      }

      this.cZ();
      this.l();
      this.D.G();
   }

   public final void a(h var1, String var2, String var3, String var4, int var5) {
      this.a(var1, var2, var3, var4, (String)null, var5);
   }

   public final void a(h var1, String var2, String var3, String var4, String var5, int var6) {
      String var7 = var1.mj;
      if (this.qp != com.rsc.b.c.cG) {
         if (var1 == h.mp && this.qp != com.rsc.b.c.cH) {
            this.ql = 200;
         }

         if (var1 == h.mo && this.qp != com.rsc.b.c.cI || var1 == h.mt && this.qp != com.rsc.b.c.cI) {
            this.qo = 200;
         }

         if (var1 == h.ml || var1 == h.ms) {
            this.qm = 200;
         }

         if (c.ae) {
            if (var1 == h.ml && this.qp != com.rsc.b.c.cG) {
               this.qp = com.rsc.b.c.cG;
            }

            if ((var1 == h.mq || var1 == h.mm || var1 == h.mn) && this.qp != com.rsc.b.c.cJ && this.qp != com.rsc.b.c.cG) {
               this.qp = com.rsc.b.c.cG;
            }
         }
      }

      if (null != var3) {
         var7 = var3;
      }

      for(int var8 = 99; var8 > 0; --var8) {
         this.oB[var8] = this.oB[var8 - 1];
      }

      this.oB[0] = new g(var1, 300, var2, var6, "", var4, var7, var5);
      String var9 = var7 + com.rsc.g.l.a(var4, var2, var1);
      if (var1 == h.mp) {
         this.a(this.qD, var9, var2, var5, var6);
      }

      if (var1 == h.mo || var1 == h.mt) {
         this.a(this.qG, var9, var2, var5, var6);
      }

      if (var1 == h.mm || var1 == h.mn) {
         this.a(this.qF, var9, var2, var5, var6);
      }

   }

   private void dz() {
      boolean var1 = true;

      while(var1) {
         var1 = false;

         for(int var2 = 0; var2 < this.rw - 1; ++var2) {
            if (this.nV[var2] < this.nV[var2 + 1]) {
               int var3 = this.nV[var2];
               this.nV[var2] = this.nV[var2 + 1];
               this.nV[var2 + 1] = var3;
               String var4 = this.nT[var2];
               this.nT[var2] = this.nT[1 + var2];
               this.nT[var2 + 1] = var4;
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
         this.nx[var2] = (var1 & 268435452) / 4;
      }

      this.d(50);

      try {
         this.k();
         com.rsc.a.a.b(true);
         com.rsc.g.i.dZ();
         this.j();
         this.h();
         if (this.ou) {
            this.i();
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         this.J = true;
      }

      if (!this.J) {
         this.dA();
         this.dB().b(100, "Starting game...");
         this.cK();
         this.cJ();
         this.cI();
         this.dx();
         this.dv();
      }

   }

   private void dA() {
      this.om = new com.rsc.c.b(this.dB(), c.A() ? c.ar : 1, "Choose option");
      this.oF = new com.rsc.d.b.d(this);
      this.oG = new com.rsc.d.b.b(this);
      this.oH = new com.rsc.d.b.c(this);
      this.rr = new com.rsc.d.a.j(this);
      this.rs = new com.rsc.d.a.e(this);
      this.rt = new com.rsc.d.a.a(this);
      com.rsc.c.e.fd = false;
      this.qC = new com.rsc.c.e(this.dB(), 5);
      int var1 = this.dB().iT - 199;
      byte var2 = 36;
      this.ph = this.qC.a(var1, 24 + var2, 196, 90, 500, 1, true);
      this.qJ = new com.rsc.c.e(this.dB(), 5);
      this.pj = this.qJ.a(var1, var2 + 40, 196, 126, 500, 1, true);
      this.qI = new com.rsc.c.e(this.dB(), 5);
      this.pi = this.qI.a(var1, 24 + var2, 196, 251, 500, 1, true);
      this.a(new com.rsc.d.b.a(this));
   }

   protected void a() {
      if (!this.I && !this.K && !this.J) {
         try {
            ++this.oZ;
            if (this.po == f.rJ) {
               this.y = 0;
               this.dq();
            }

            if (this.po == f.rK) {
               this.o();
               ++this.y;
               this.dl();
               this.s();
            }

            this.z = 0;
            if (this.qn > 0) {
               --this.qn;
            }

            if (this.qo > 0) {
               --this.qo;
            }

            if (this.qm > 0) {
               --this.qm;
            }

            if (this.ql > 0) {
               --this.ql;
            }
         } catch (Exception var2) {
            var2.printStackTrace();
            this.K = true;
         }

      }
   }

   private void a(com.rsc.e.e var1, String var2) {
      int var3 = var1.ce() - this.oA.cg() / 128;
      int var4 = var1.cf() - this.oA.ch() / 128;
      byte var5 = 7;
      if (var1.ce() >= 0 && var1.cf() >= 0 && var1.ce() < 96 && var1.cf() < 96 && var3 > -var5 && var3 < var5 && var4 > -var5 && var4 < var5) {
         this.L.c(var1.cj());
         int var6 = com.rsc.a.a.a(var2);
         if (this.R[var6] == null) {
            return;
         }

         com.rsc.c.h var7 = this.R[var6].bl();
         var7.b(-50, -10, -50, 48, 48, true);
         var7.a(var1.cj());
         var7.gx = var1.cc();
         var1.d(var7);
         this.L.b(var7);
      }

   }

   private final void aH(int var1) {
      this.oL = this.qq;

      int var2;
      for(var2 = 0; var2 < this.qq; ++var2) {
         this.oM[var2] = this.qr[var2];
         this.oN[var2] = this.qs[var2];
      }

      int var3;
      for(var2 = 0; var2 < this.pA && this.oO > this.oL; ++var2) {
         var3 = this.ng[var2];
         boolean var4 = false;

         for(int var5 = 0; var5 < this.oL; ++var5) {
            if (this.oM[var5] == var3) {
               var4 = true;
               break;
            }
         }

         if (!var4) {
            this.oM[this.oL] = var3;
            this.oN[this.oL] = 0;
            ++this.oL;
         }
      }

      var3 = -89 / ((var1 - 2) / 60);
   }

   private void b(int var1, int var2, int var3, int var4, boolean var5) {
      this.c(var1, var2, var3, var4, var3, var4, false, var5);
   }

   private void c(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      int var9 = this.N.a(this.mQ, this.mR, var1, var2, var3, var5, var4, var6, var7);
      if (var9 == -1) {
         if (!var8) {
            return;
         }

         var9 = 1;
         this.mQ[0] = var3;
         this.mR[0] = var4;
      }

      --var9;
      var2 = this.mR[var9];
      var1 = this.mQ[var9];
      --var9;
      if (!var8) {
         this.n().aO(187);
      } else {
         this.n().aO(16);
      }

      this.n().aL(this.op + var1);
      this.n().aL(this.oq + var2);
      if (var8 && var9 == -1 && (var1 + this.op) % 5 == 0) {
         var9 = 0;
      }

      for(int var10 = var9; var10 >= 0 && var10 > var9 - 25; --var10) {
         this.n().aK(this.mQ[var10] - var1);
         this.n().aK(this.mR[var10] - var2);
      }

      this.n().dW();
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
         this.c(this.os, this.ot, var1, var2, var5 - 1 + var1, var2 + var6 - 1, true, true);
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

         this.c(this.os, this.ot, var1, var2, var5 + (var1 - 1), var6 + var2 - 1, false, true);
      }

   }

   private void w(int var1, int var2, int var3) {
      if (var3 == 0) {
         this.c(this.os, this.ot, var1, var2 - 1, var1, var2, false, true);
      } else if (var3 != 1) {
         this.c(this.os, this.ot, var1, var2, var1, var2, true, true);
      } else {
         this.c(this.os, this.ot, var1 - 1, var2, var1, var2, false, true);
      }

   }

   public com.rsc.c.k dB() {
      return this.M;
   }

   private void c(com.rsc.c.k var1) {
      this.M = var1;
   }

   public int au() {
      return this.bq;
   }

   public int av() {
      return this.br;
   }

   public int[][] dC() {
      return this.ns;
   }

   public int[] dD() {
      return this.nG;
   }

   public int[] dE() {
      return this.nE;
   }

   public int[] dF() {
      return this.nD;
   }

   public int dG() {
      return this.pA;
   }

   public boolean aI(int var1) {
      if (var1 > 1) {
         var1 += var1;
      } else if (var1 < -1) {
         var1 -= -var1;
      }

      if (this.rs.bF()) {
         this.rs.kh.g(this.rs.ki, var1);
         return true;
      } else if (this.qZ == 3 && this.qI.S(this.pi)) {
         this.qI.g(this.pi, var1);
         return true;
      } else if (this.qZ == 4 && this.qC.S(this.ph)) {
         this.qC.g(this.ph, var1);
         return true;
      } else if (this.qZ == 5 && this.qJ.S(this.pj)) {
         if (this.qK == 1 || this.qK == 0) {
            this.qJ.g(this.pj, var1);
         }

         return true;
      } else if (this.qH.S(this.qG)) {
         this.qH.g(this.qG, var1);
         return true;
      } else if (this.qH.S(this.qD)) {
         this.qH.g(this.qD, var1);
         return true;
      } else if (this.qH.S(this.qF)) {
         this.qH.g(this.qF, var1);
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

   public boolean dH() {
      return this.qV;
   }

   private void n(boolean var1) {
      this.qV = var1;
   }

   public String d(String var1, int var2) {
      return var1 != null && var1.length() > var2 ? var1.substring(0, var2) + "..." : var1;
   }

   private void a(com.rsc.d.b.a var1) {
      this.rq = var1;
   }
}
