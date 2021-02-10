public class VlcPlayer implements AdvancedMediaPlayer{
   @Override
   public void playVlc(String dosyaAdi) {
      System.out.println("VLC dosyasý oynatýlýyor. Dosya Adý : "+ dosyaAdi);		
   }

   @Override
   public void playMp4(String dosyaAdi) {
      //do nothing
   }
}