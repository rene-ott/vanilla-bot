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
   private static final AudioFormat aJ;
   private static final AudioFormat aK;
   private Clip aL = AudioSystem.getClip();

   public c() {
   }

   public void J() {
      this.aL.stop();
      this.aL.flush();
   }

   public void b(byte[] var1, int var2, int var3) {
      ByteArrayInputStream var4 = new ByteArrayInputStream(var1, var2, var3);
      AudioInputStream var5 = new AudioInputStream(var4, aJ, -1L);
      var5 = AudioSystem.getAudioInputStream(aK, var5);
      Info var6 = new Info(Clip.class, aK);
      this.aL = (Clip)AudioSystem.getLine(var6);
      this.aL.open(var5);
      this.aL.start();
   }

   static {
      aJ = new AudioFormat(Encoding.ULAW, 8000.0F, 8, 1, 1, 8000.0F, true);
      aK = new AudioFormat(Encoding.PCM_SIGNED, 8000.0F, 16, 1, 2, 8000.0F, ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
   }
}
