//LISKOV SUBSTITUTION PRINCIPLE: A class B which is a sub class of class A should be able to be substituted
//instead of class A without giving any exceptions

//In this program, WinampPlayer cannot play video which causes an exception. Thus it violates LSP.
package Violating;

class MediaPlayer{
    public void playAudio(){
        System.out.println("Playing Audio...");
    }

    public void playVideo(){
        System.out.println("Playing Video...");
    }
}


class VlcPlayer extends MediaPlayer{
    @Override
    public void playAudio() {
        super.playAudio();
    }

    @Override
    public void playVideo() {
        super.playVideo();
    }
}


class WinampPlayer extends MediaPlayer{
    @Override
    public void playAudio() {
        super.playAudio();
    }

//    Cannot play video in Winamp Media Player
    @Override
    public void playVideo() {
        System.out.println("Exception: Can't play video");
    }
}


public class LSP {
    public static void main(String[] args) {
        MediaPlayer vlcPlayer = new VlcPlayer();
        vlcPlayer.playAudio();
        vlcPlayer.playVideo();

        MediaPlayer winampPlayer = new WinampPlayer();
        winampPlayer.playAudio();
        winampPlayer.playVideo();
    }
}
