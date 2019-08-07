package adapter;

public class CustomMediaPlayerImpl implements CustomMediaPlayer{
    @Override
    public void playMp4(String name) {
        System.out.println("mp4:" +  name);
    }

    @Override
    public void playAVI(String name) {
        System.out.println("AVI:" +  name);
    }
}
