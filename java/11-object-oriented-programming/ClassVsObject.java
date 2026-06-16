public class ClassVsObject {

    /*
    An object is defined by its property and behavior

    Properties = data types, overloading eg car color, wheels etc
    Behavior = functions, operations you can change them eg can start the car

    //Example
    - A class will be the engine, the design
    - An object will be the vehicle
    - Therefore you can create many objects from a single class
     */

    class Television {
       //Properties
        private int channel;
        private int volume;

        //behaviours
        public void changeChannel(int channel) {
            this.channel = channel;
        }
        public void changeVolume(int volume) {
            this.volume = volume;
        }
    }

    class Test {
        public static void main(String[] args) {
           Television Tv = new Television(); //creating an object

           Tv.changeChannel(3);
        }
    }
}
