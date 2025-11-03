//new adapter class to make AdvancedMediaPlayer compatible with MediaPlayer

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);  
        }
    }

}
