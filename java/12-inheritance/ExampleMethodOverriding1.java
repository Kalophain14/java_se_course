package ExampleMethodOverriding1;

class TV {

    // Class methods
    public void switchOn() {
        System.out.println("TV Switching on");
    }
    public void switchOff() {
        System.out.println("TV Switching off");
    }
}

// Smart TV Extension

class SmartTV extends TV {
    @Override
    public void switchOn() {
        System.out.println("Smart TV switches using Remote");
    }
    @Override
    public void switchOff() {
        System.out.println("Smart TV switches off using Remote");
    }
    public void changeChannel() {
        System.out.println("Changing channel using Remote");
    }
    public void browseChannel() {
        System.out.println("Browsing channel using Remote");
    }
}

public class ExampleMethodOverriding1 {
    public static void main(String[] args) {
        TV oldTv = new TV();
        oldTv.switchOn();
        oldTv.switchOff();

        /* SmartTV featureTv = new SmartTV();
        featureTv.switchOn();
        featureTv.switchOff();
        featureTv.browseChannel();
         */
    }
}
