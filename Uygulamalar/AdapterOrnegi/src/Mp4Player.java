public class Mp4Player implements AdvancedMediaPlayer{

   @Override
   public void playVlc(String dosyaAdi) {
      //do nothing
   }

   @Override
   public void playMp4(String dosyaAdi) {
      System.out.println("MP4 dosyas� oynat�l�yor. Dosya Ad� : "+ dosyaAdi);		
   }
}