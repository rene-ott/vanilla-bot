package com.rsc.applet;

import com.rsc.d;
import com.rsc.c.k;
import com.rsc.g.e;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;

public class b extends Applet implements e, ComponentListener, FocusListener, KeyListener, MouseListener, MouseMotionListener, MouseWheelListener {
   d aE;
   private c aF;
   private a aG;
   private Graphics aH;
   private float aI = 1.0F;
   private float aJ = 1.0F;

   public b() {
   }

   public boolean isDisplayable() {
      return super.isDisplayable();
   }

   final void a(Font var1, String var2, int var3, boolean var4, int var5, Graphics var6) {
      FontMetrics var7 = this.getFontMetrics(var1);
      var6.setFont(var1);
      var6.drawString(var2, var5 - var7.stringWidth(var2) / 2, var3 + var7.getHeight() / 4);
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      this.a((InputEvent)var1);
      char var2 = var1.getKeyChar();
      int var3 = var1.getKeyCode();
      this.aE.aE(var2);
      if (var3 == 112) {
         this.aE.oi = !this.aE.oi;
      }

      if (var3 == 113) {
         com.rsc.c.ai = !com.rsc.c.ai;
         this.aE.n().aO(111);
         this.aE.n().aK(11);
         this.aE.n().aK(com.rsc.c.ai ? 1 : 0);
         this.aE.n().dX();
      }

      this.aE.h(0);
      if (var3 == 39) {
         this.aE.ok = true;
      }

      if (var3 == 37) {
         this.aE.oj = true;
      }

      if (var3 == 38) {
         this.aE.ol = true;
      }

      if (var3 == 40) {
         this.aE.om = true;
      }

      if (var3 == 34) {
         this.aE.on = true;
      }

      if (var3 == 33) {
         this.aE.oo = true;
      }

      boolean var4 = false;

      for(int var5 = 0; var5 < com.rsc.c.a.ds.length(); ++var5) {
         if (com.rsc.c.a.ds.charAt(var5) == var2) {
            var4 = true;
            break;
         }
      }

      if (var4 && this.aE.og.length() < 20) {
         this.aE.og = this.aE.og + var2;
      }

      if (var4 && this.aE.od.length() < 100) {
         this.aE.od = this.aE.od + var2;
      }

      if (var2 == '\b' && this.aE.og.length() > 0) {
         this.aE.og = this.aE.og.substring(0, this.aE.og.length() - 1);
      }

      if (var2 == '\b' && this.aE.od.length() > 0) {
         this.aE.od = this.aE.od.substring(0, this.aE.od.length() - 1);
      }

      if (var2 == '\n' || var2 == '\r') {
         this.aE.oh = this.aE.og;
         this.aE.oe = this.aE.od;
      }

   }

   public final synchronized void keyReleased(KeyEvent var1) {
      this.a((InputEvent)var1);
      int var2 = var1.getKeyCode();
      if (var2 == 39) {
         this.aE.ok = false;
      }

      if (var2 == 37) {
         this.aE.oj = false;
      }

      if (var2 == 38) {
         this.aE.ol = false;
      }

      if (var2 == 40) {
         this.aE.om = false;
      }

      if (var2 == 34) {
         this.aE.on = false;
      }

      if (var2 == 33) {
         this.aE.oo = false;
      }

   }

   public final void keyTyped(KeyEvent var1) {
      this.a((InputEvent)var1);
   }

   public final void mouseClicked(MouseEvent var1) {
      this.a((InputEvent)var1);
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.D();
      this.a((InputEvent)var1);
      this.aE.a((int)((float)var1.getX() / this.aI), (int)((float)var1.getY() / this.aJ));
      if ((var1.getModifiersEx() & 1024) != 0) {
         this.aE.g(1);
      } else if ((var1.getModifiersEx() & 2048) != 0) {
         this.aE.g(3);
         this.aE.di();
      } else if ((var1.getModifiersEx() & 4096) != 0) {
         this.aE.g(2);
      }

   }

   public final void mouseEntered(MouseEvent var1) {
      this.a((InputEvent)var1);
   }

   public final void mouseExited(MouseEvent var1) {
      this.a((InputEvent)var1);
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      this.D();
      this.a((InputEvent)var1);
      this.aE.a((int)((float)var1.getX() / this.aI), (int)((float)var1.getY() / this.aJ));
      this.aE.h(0);
      this.aE.g(0);
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      this.D();
      this.a((InputEvent)var1);
      this.aE.a((int)((float)var1.getX() / this.aI), (int)((float)var1.getY() / this.aJ));
      if ((var1.getModifiersEx() & 1024) != 0) {
         this.aE.g(1);
      } else if ((var1.getModifiersEx() & 2048) != 0) {
         this.aE.g(3);
         this.aE.m(true);
      } else if ((var1.getModifiersEx() & 4096) != 0) {
         this.aE.g(2);
      }

      this.aE.i(this.aE.x());
      this.aE.h(0);
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      this.D();
      this.a((InputEvent)var1);
      this.aE.a((int)((float)var1.getX() / this.aI), (int)((float)var1.getY() / this.aJ));
      this.aE.g(0);
      this.aE.m(false);
   }

   public final void mouseWheelMoved(MouseWheelEvent var1) {
      this.D();
      this.a((InputEvent)var1);
      if (this.aE != null) {
         this.aE.aI(var1.getWheelRotation());
      }

   }

   public final void init() {
      this.aE = new d(this);
      this.aG = new a(this.aE.dC(), this);
      this.aH = this.getGraphics();
      this.aE.E(this.getWidth(), this.getHeight());
      this.setFocusTraversalKeysEnabled(false);
      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.addKeyListener(this);
      this.addComponentListener(this);
      this.addMouseWheelListener(this);
      this.addFocusListener(this);

      try {
         this.aF = new c();
      } catch (Exception var2) {
      }

   }

   public final void stop() {
      try {
         this.aE.E.join();
      } catch (InterruptedException var5) {
         var5.printStackTrace();
      } finally {
         System.exit(0);
      }

   }

   public final void paint(Graphics var1) {
      if (this.aG != null) {
         this.aG.a(0, 0, this.aH);
      }

   }

   public final void update(Graphics var1) {
      if (this.aG != null) {
         this.aG.a(0, 0, this.aH);
      }

   }

   private final void a(InputEvent var1) {
      int var2 = var1.getModifiers();
      if (this.aE != null) {
         this.aE.of = (var2 & 2) != 0;
         this.aE.op = (var2 & 1) != 0;
      }
   }

   public final void start() {
      this.aE.start();
   }

   public void componentShown(ComponentEvent var1) {
      System.out.println("Component shown");
   }

   public void componentResized(ComponentEvent var1) {
      this.aH = var1.getComponent().getGraphics();
      this.aG.c(var1.getComponent().getWidth(), var1.getComponent().getHeight());
      this.aE.E(var1.getComponent().getWidth(), var1.getComponent().getHeight());
      this.D();
   }

   private void D() {
      this.aI = (float)this.getWidth() / (float)this.aE.dC().iU;
      this.aJ = (float)this.getHeight() / (float)this.aE.dC().jp;
   }

   public void componentMoved(ComponentEvent var1) {
   }

   public void componentHidden(ComponentEvent var1) {
      System.out.println("Component hidden");
   }

   public void E() {
      Graphics var1 = this.getGraphics();
      if (var1 != null) {
         var1.setColor(Color.black);
         var1.fillRect(0, 0, 512, 356);
         var1.setFont(new Font("Helvetica", 1, 16));
         var1.setColor(Color.yellow);
         byte var2 = 35;
         var1.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var2);
         var1.setColor(Color.white);
         int var3 = var2 + 50;
         var1.drawString("To fix this try the following (in order):", 30, var3);
         var1.setColor(Color.white);
         var3 += 50;
         var1.setFont(new Font("Helvetica", 1, 12));
         var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var3);
         var3 += 30;
         var1.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var3);
         var3 += 30;
         var1.drawString("3: Try using a different game-world", 30, var3);
         var3 += 30;
         var1.drawString("4: Try rebooting your computer", 30, var3);
         var3 += 30;
         var1.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var3);
      }

   }

   public void F() {
      if (this.aH == null) {
         this.aH = this.getGraphics();
      }

      if (null != this.aH) {
         this.aH.setColor(Color.black);
         this.aH.fillRect(0, 0, 512, 356);
         this.aH.setFont(new Font("Helvetica", 1, 20));
         this.aH.setColor(Color.white);
         this.aH.drawString("Error - out of memory!", 50, 50);
         this.aH.drawString("Close ALL unnecessary programs", 50, 100);
         this.aH.drawString("and windows before loading the game", 50, 150);
         this.aH.drawString("RuneScape needs about 48meg of spare RAM", 50, 200);
      }

   }

   public void a(String var1, String var2) {
      if (this.aH == null) {
         this.aH = this.getGraphics();
      }

      if (null != this.aH) {
         Font var3 = new Font("Helvetica", 1, 15);
         short var4 = 512;
         this.aH.setColor(Color.black);
         short var5 = 344;
         this.aH.fillRect(var4 / 2 - 140, var5 / 2 - 25, 280, 50);
         this.aH.setColor(Color.white);
         this.aH.drawRect(var4 / 2 - 140, var5 / 2 - 25, 280, 50);
         this.a(var3, var2, var5 / 2 - 10, true, var4 / 2, this.aH);
         this.a(var3, var1, 10 + var5 / 2, true, var4 / 2, this.aH);
      }

   }

   public void G() {
      this.aG.a(0, 0, this.aH);
   }

   public void H() {
      this.stop();
   }

   public String C() {
      return "../" + com.rsc.c.Y + "/";
   }

   public com.rsc.a.b.c a(ByteArrayInputStream var1) {
      try {
         BufferedImage var2 = ImageIO.read(var1);
         int var3 = var2.getWidth();
         int var4 = var2.getHeight();
         int[] var5 = new int[var2.getWidth() * var2.getHeight()];

         for(int var6 = 0; var6 < var2.getHeight(); ++var6) {
            for(int var7 = 0; var7 < var2.getWidth(); ++var7) {
               int var8 = var2.getRGB(var7, var6);
               var5[var7 + var6 * var2.getWidth()] = var8;
            }
         }

         com.rsc.a.b.c var10 = new com.rsc.a.b.c();
         var10.cl = var3;
         var10.cm = var4;
         this.aE.dC();
         var10.cn = k.a(var5, var3, var4);
         return var10;
      } catch (Exception var9) {
         var9.printStackTrace();
         return null;
      }
   }

   public void I() {
      this.aF.J();
   }

   public void a(byte[] var1, int var2, int var3) {
      try {
         this.aF.b(var1, var2, var3);
      } catch (Throwable var5) {
      }

   }

   public void focusGained(FocusEvent var1) {
      this.aE.oc = true;
   }

   public void focusLost(FocusEvent var1) {
      this.aE.oc = false;
   }
}
