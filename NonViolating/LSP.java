//A new class VideoPlayer is created by extending MediaPlayer. Now, WinampPlayer can inherit
//MediaPlayer class without any exception
package NonViolating;

class MediaPlayer{
    public void playAudio(){
        System.out.println("Playing Audio...");
    }
}

class VideoPlayer extends MediaPlayer{
    public void playVideo(){
        System.out.println("Playing Video...");
    }
}


class VlcPlayer extends VideoPlayer {
    @Override
    public void playAudio() {
        super.playAudio();
    }

    @Override
    public void playVideo() {
        super.playVideo();
    }
}


class WinampPlayer extends MediaPlayer {
    @Override
    public void playAudio() {
        super.playAudio();
    }

}


public class LSP {
    public static void main(String[] args) {
        VideoPlayer vlcPlayer = new VlcPlayer();
        vlcPlayer.playAudio();
        vlcPlayer.playVideo();

        MediaPlayer winampPlayer = new WinampPlayer();
        winampPlayer.playAudio();
    }
}
