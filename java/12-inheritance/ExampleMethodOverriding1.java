package ExampleMethodOverriding1;

class TV {
    // Class methods
    public void switchOn() {
        System.out.println("Old TV Switched on");
    }
    public void switchOff() {
        System.out.println("Old TV Switched off");
    }
}


// Smart TV Extension
class SmartTV extends TV {
    @Override
    public void switchOn() {
        System.out.println("Smart TV uses Remote");
    }
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

        System.out.println("=== Overiding Method Extended ===");
        SmartTV newTv = new SmartTV();
        newTv.switchOn();
        newTv.switchOff();
        newTv.changeChannel();
        newTv.browseChannel();
    }
}
