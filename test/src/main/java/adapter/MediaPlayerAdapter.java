package adapter;

public class MediaPlayerAdapter implements MediaPlayer {

    CustomMediaPlayer customMediaPlayer;

    public MediaPlayerAdapter(CustomMediaPlayer customMediaPlayer) {
        this.customMediaPlayer = customMediaPlayer;
    }

    @Override
    public void play(int type, String name) {
        if (type == 0) {
            customMediaPlayer.playMp4(name);
        } else {
            customMediaPlayer.playAVI(name);
        }
    }
}
