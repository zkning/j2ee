package adapter;

public class AudioPlayer implements MediaPlayer {

    MediaPlayerAdapter mediaPlayerAdapter;

    public AudioPlayer(MediaPlayerAdapter mediaPlayerAdapter) {
        this.mediaPlayerAdapter = mediaPlayerAdapter;
    }

    @Override
    public void play(int type, String name) {
        if (type == 3) {
            System.out.println("播放了电影:" + name);
        } else {
            mediaPlayerAdapter.play(type, name);
        }
    }

    public static void main(String[] args) {
        CustomMediaPlayer customMediaPlayer = new CustomMediaPlayerImpl();
        MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(customMediaPlayer);
        AudioPlayer audioPlayer = new AudioPlayer(mediaPlayerAdapter);
        audioPlayer.play(1,"<<上汽>>");
        audioPlayer.play(3,"<<复仇者联盟>>");
    }
}
