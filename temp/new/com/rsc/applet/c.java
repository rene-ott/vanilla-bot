package com.rsc.applet;

import java.io.ByteArrayInputStream;
import java.nio.ByteOrder;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.DataLine.Info;

public class c {
   private static final AudioFormat aK;
   private static final AudioFormat aL;
   private Clip aM = AudioSystem.getClip();

   public c() {
   }

   public void J() {
      this.aM.stop();
      this.aM.flush();
   }

   public void b(byte[] var1, int var2, int var3) {
      ByteArrayInputStream var4 = new ByteArrayInputStream(var1, var2, var3);
      AudioInputStream var5 = new AudioInputStream(var4, aK, -1L);
      var5 = AudioSystem.getAudioInputStream(aL, var5);
      Info var6 = new Info(Clip.class, aL);
      this.aM = (Clip)AudioSystem.getLine(var6);
      this.aM.open(var5);
      this.aM.start();
   }

   static {
      aK = new AudioFormat(Encoding.ULAW, 8000.0F, 8, 1, 1, 8000.0F, true);
      aL = new AudioFormat(Encoding.PCM_SIGNED, 8000.0F, 16, 1, 2, 8000.0F, ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
   }
}
