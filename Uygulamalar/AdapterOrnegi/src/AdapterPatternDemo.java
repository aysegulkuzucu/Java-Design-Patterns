public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();

      audioPlayer.play("MP3", "kanatlarim-var-ruhumda.mp3");
      audioPlayer.play("MP4", "metallica-unforgiven.mp4");
      audioPlayer.play("VLC", "adaletin-bu-mu-dunya.vlc");
      audioPlayer.play("Avi", "mind me.avi");
   }
}