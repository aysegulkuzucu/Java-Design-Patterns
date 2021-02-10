public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter; 

   @Override
   public void play(String audioType, String dosyaAdi) {		

      //inbuilt support to play mp3 music files
      if(audioType.equalsIgnoreCase("MP3")){
         System.out.println("MP3 dosyasý çalýyor. Dosya Adý : " + dosyaAdi);			
      } 
      
      //mediaAdapter is providing support to play other file formats
      else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, dosyaAdi);
      }
      
      else{
         System.out.println("Geçersiz medya dosyasý. " + audioType + " formatý desteklenmemektedir.");
      }
   }   
}