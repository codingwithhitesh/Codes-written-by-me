class Phone {
    void call() {
        System.out.println("The Phone is ready to call");
    }

    void Sms() {
        System.out.println("The Phone is ready to make SMS");
    }
}
interface Camera {
    void click ();
    void record();
}

interface MusicPlayer {
    void playMusic();
    void pauseMusic();
}
class Smartphone extends Phone implements Camera,MusicPlayer{

    public void click(){
        System.out.println("Photo clicked and saved");

    }
    public void record(){
        System.out.println("Video recorded and saved");
    }
    public void playMusic (){
        System.out.println("Music is playing");

    }
    public void pauseMusic(){
        System.out.println("Music paused");
    }
}

class iphone extends Smartphone {
    public static void main(String[] args) {
        Smartphone iphone17pro = new Smartphone();
        iphone17pro.call();
        iphone17pro.Sms();
        iphone17pro.click();
        iphone17pro.record();
        iphone17pro.playMusic();
        iphone17pro.pauseMusic();

    }

}
