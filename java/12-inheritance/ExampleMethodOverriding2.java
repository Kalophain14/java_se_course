package ExampleMethodOverriding2;


//SuperClass
class Vehicle {
    public void start() { System.out.println("Vehicle starting"); }
    public void stop() { System.out.println("Vehicle stopping"); }
    public void changeGear() { System.out.println("Vehicle uses manual gear"); }
}

//Sub Class Extends and Override
class Vehicle2 extends Vehicle {
    @Override
    public void start() { System.out.println("Vehicle2 starting");}
    public void stop() { System.out.println("Vehicle2 stopping");}
    public void changeGear() { System.out.println("Vehicle2 uses an automatic gear");}
    // new Method from SubClass Vehicle2
    public void openRoof() { System.out.println("Vehicle2 has a open roof"); }
    }

    public class ExampleMethodOverriding2 {
        public static void main(String[] args) {
            System.out.println("== SuperClass ==");
            Vehicle BmwM3 = new Vehicle();
            BmwM3.start();
            BmwM3.stop();
            BmwM3.changeGear();

            System.out.println("== Sub Class ==");
            Vehicle2 BmwM4 = new Vehicle2();
            BmwM4.start();
            BmwM4.stop();
            BmwM4.changeGear();
            BmwM4.openRoof();

        }
    }