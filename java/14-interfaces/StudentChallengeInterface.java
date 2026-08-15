package StudentChallengeInterface;

class Phone{
    public void call(){
        System.out.println("Phone makes a call");
    }
    public void sms(){
        System.out.println("Phone sending SMS");
    }
}

interface ICamera{
    // Methods are abstract cannot be called Unless override
    void click();
    void record();
}

interface IMusicPlayer{
   void play();
   void pause();
   void stop();
   default void start(){
       System.out.println("Phone starts playing");
   }
}

// Extending as well as implementing the
class SmartPhone extends Phone implements ICamera, IMusicPlayer{
    public void record(){ System.out.println("SmartPhone recording"); }
    public void click(){ System.out.println("SmartPhone clicks Taking Photo"); }
    public void call(){ System.out.println("SmartPhone calling"); }
    public void sms(){ System.out.println("SmartPhone sending sms"); }
    public void play(){ System.out.println("SmartPhone playing"); }
    public void pause() { System.out.println("SmartPhone paused"); }
    public void stop() { System.out.println("SmartPhone stopped"); }
    public void start(){ System.out.println("SmartPhone starting default"); }
}

public class StudentChallengeInterface {
    public static void main(String[] args) {
        System.out.println("==Classic Old Phone==");
        Phone Nokia = new Phone();
        Nokia.call();
        Nokia.sms();

        System.out.println();

        System.out.println("===SmartPhone==");
        SmartPhone iPhone = new SmartPhone();
        iPhone.call();
        iPhone.sms();
        iPhone.play();
        iPhone.pause();
        iPhone.stop();
        iPhone.click();
        iPhone.record();
        iPhone.start();
        System.out.println();
        System.out.println("==Interface Callout==");

        // Referencing the Method of an Interface
        // Only have access to the ImusicPlayer Methods
        IMusicPlayer iMusic = new SmartPhone();
        iMusic.pause();
        iMusic.stop();
        iMusic.play();
        iMusic.start();
    }
}
