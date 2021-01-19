package com.rsc.applet;

import com.rsc.c.k;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public class a implements ImageObserver, ImageProducer {
   private final k M;
   private final Component au;
   private int av;
   private int aw;
   private int[] ax;
   protected ColorModel ay;
   protected ImageConsumer az;
   public Image aA;
   private int aB;
   private int aC;

   public a(k var1, Component var2) {
      this.au = var2;
      this.M = var1;
      this.c(var2.getWidth(), var2.getHeight());
      this.ay = new DirectColorModel(32, 16711680, 65280, 255);
      this.av = var1.au();
      this.aw = var1.av();
      this.b(this.av, this.aw);
   }

   public void a(int var1, int var2, Graphics var3) {
      this.B();
      Graphics2D var4 = (Graphics2D)var3;
      var3.drawImage(this.aA, var1, var2, this.aB, this.aC, this);
   }

   public synchronized void addConsumer(ImageConsumer var1) {
      this.az = var1;
      var1.setDimensions(this.av, this.aw);
      var1.setProperties((Hashtable)null);
      var1.setColorModel(this.ay);
      var1.setHints(14);
   }

   public synchronized boolean isConsumer(ImageConsumer var1) {
      return this.az == var1;
   }

   public synchronized void removeConsumer(ImageConsumer var1) {
      if (this.az == var1) {
         var1 = null;
      }

   }

   public void startProduction(ImageConsumer var1) {
      this.addConsumer(var1);
   }

   public void requestTopDownLeftRightResend(ImageConsumer var1) {
      System.out.println("TDLR");
   }

   private synchronized void B() {
      if (this.az != null) {
         if (this.M.jo != this.aw || this.M.iT != this.av || this.M.jp != this.ax) {
            this.av = this.M.iT;
            this.aw = this.M.jo;
            this.ax = this.M.jp;
            this.b(this.av, this.aw);
         }

         this.az.setPixels(0, 0, this.av, this.aw, this.ay, this.ax, 0, this.av);
         this.az.imageComplete(2);
      }

   }

   public void b(int var1, int var2) {
      if (this.az != null) {
         this.az.setDimensions(var1, var2);
      }

      this.aA = this.au.createImage(this);
      this.B();
      this.au.prepareImage(this.aA, this);
      this.B();
      this.au.prepareImage(this.aA, this);
      this.B();
      this.au.prepareImage(this.aA, this);
   }

   public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      return true;
   }

   public void c(int var1, int var2) {
      this.aB = var1;
      this.aC = var2;
   }
}
