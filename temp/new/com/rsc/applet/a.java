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
   private final Component av;
   private int aw;
   private int ax;
   private int[] ay;
   protected ColorModel az;
   protected ImageConsumer aA;
   public Image aB;
   private int aC;
   private int aD;

   public a(k var1, Component var2) {
      this.av = var2;
      this.M = var1;
      this.c(var2.getWidth(), var2.getHeight());
      this.az = new DirectColorModel(32, 16711680, 65280, 255);
      this.aw = var1.au();
      this.ax = var1.av();
      this.b(this.aw, this.ax);
   }

   public void a(int var1, int var2, Graphics var3) {
      this.B();
      Graphics2D var4 = (Graphics2D)var3;
      var3.drawImage(this.aB, var1, var2, this.aC, this.aD, this);
   }

   public synchronized void addConsumer(ImageConsumer var1) {
      this.aA = var1;
      var1.setDimensions(this.aw, this.ax);
      var1.setProperties((Hashtable)null);
      var1.setColorModel(this.az);
      var1.setHints(14);
   }

   public synchronized boolean isConsumer(ImageConsumer var1) {
      return this.aA == var1;
   }

   public synchronized void removeConsumer(ImageConsumer var1) {
      if (this.aA == var1) {
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
      if (this.aA != null) {
         if (this.M.jp != this.ax || this.M.iU != this.aw || this.M.jq != this.ay) {
            this.aw = this.M.iU;
            this.ax = this.M.jp;
            this.ay = this.M.jq;
            this.b(this.aw, this.ax);
         }

         this.aA.setPixels(0, 0, this.aw, this.ax, this.az, this.ay, 0, this.aw);
         this.aA.imageComplete(2);
      }

   }

   public void b(int var1, int var2) {
      if (this.aA != null) {
         this.aA.setDimensions(var1, var2);
      }

      this.aB = this.av.createImage(this);
      this.B();
      this.av.prepareImage(this.aB, this);
      this.B();
      this.av.prepareImage(this.aB, this);
      this.B();
      this.av.prepareImage(this.aB, this);
   }

   public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      return true;
   }

   public void c(int var1, int var2) {
      this.aC = var1;
      this.aD = var2;
   }
}
