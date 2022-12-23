

class Phone {
    public void sms() {
        System.out.println("Sms sent");
    }

    public void call() {
        System.out.println("Calling....");
    }
}

interface ICamera {
    void snap();

    void record();
}

interface MusicPlayer {
    void play();

    void pause();

    void nextMusic();

    void previousMusic();
}

class MyPhone extends Phone implements ICamera, MusicPlayer {
    public void snap() {
        System.out.println("Snap recorded.");
    }

    public void record() {
        System.out.println("Recording started.");
    }

    public void play() {
        System.out.println("Play Music");
    }

    public void pause() {
        System.out.println("Pause music");
    }

    public void nextMusic() {
        System.out.println("Next Music");
    }

    public void previousMusic() {
        System.out.println("Previous music played.");
    }


}

public class InterfaceExample {
    public static void main(String[] args) {
        MyPhone samu = new MyPhone();
        samu.nextMusic();
        samu.pause();
        samu.play();
        samu.record();
        samu.sms();
        samu.call();

        Phone p = new MyPhone();
        p.sms();
        p.call();

        ICamera i = new MyPhone();
        i.record();
        i.snap();

    }
}
