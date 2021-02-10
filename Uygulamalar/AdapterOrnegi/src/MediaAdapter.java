public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){
   
      if(audioType.equalsIgnoreCase("VLC") ){
         advancedMusicPlayer = new VlcPlayer();			
         
      }else if (audioType.equalsIgnoreCase("MP4")){
         advancedMusicPlayer = new Mp4Player();
      }	
   }

   @Override
   public void play(String audioType, String dosyaAdi) {
   
      if(audioType.equalsIgnoreCase("VLC")){
         advancedMusicPlayer.playVlc(dosyaAdi);
      }
      else if(audioType.equalsIgnoreCase("MP4")){
         advancedMusicPlayer.playMp4(dosyaAdi);
      }
   }
}