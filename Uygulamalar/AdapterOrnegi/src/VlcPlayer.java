public class VlcPlayer implements AdvancedMediaPlayer{
   @Override
   public void playVlc(String dosyaAdi) {
      System.out.println("VLC dosyas� oynat�l�yor. Dosya Ad� : "+ dosyaAdi);		
   }

   @Override
   public void playMp4(String dosyaAdi) {
      //do nothing
   }
}