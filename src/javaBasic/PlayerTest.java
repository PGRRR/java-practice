package javaBasic;

abstract class Player {
    abstract void play(int pos);

    abstract void stop();
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println("Play from " + pos);
    }

    void stop() {
        System.out.println("Stop");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
//        Player p = new Player();
//        AudioPlayer ap = new AudioPlayer();
        Player ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
    }
}
