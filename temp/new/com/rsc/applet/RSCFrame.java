package com.rsc.applet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class RSCFrame extends b {
   public RSCFrame() {
   }

   public String C() {
      return com.rsc.c.aa + File.separator;
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame(com.rsc.c.Y);
      RSCFrame var2 = new RSCFrame();
      var2.setPreferredSize(new Dimension(512, 346));
      var1.getContentPane().setLayout(new BorderLayout());
      var1.setDefaultCloseOperation(3);
      var1.getContentPane().add(var2);
      var1.setResizable(true);
      var1.setVisible(true);
      var1.setBackground(Color.black);
      var1.setMinimumSize(new Dimension(512, 346));
      var1.pack();
      var1.setLocationRelativeTo((Component)null);
      var1.setIconImage(ImageIO.read(RSCFrame.class.getClassLoader().getResourceAsStream("vanilla_32.png")));
      var2.init();
      var2.start();
   }
}
