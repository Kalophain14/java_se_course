public class LearnConstructor {

    private int length;
    private int width;

//    //getters
//    public int getLength (){
//        return length;
//    }
//    public int getWidth (){
//        return width;
//    }
//
//    //setters
//    public void setLength(int l) {
//        if (l > 0)
//            length = l;
//        else
//            return = 0;
//    }
//    public void setWidth(int w){
//        if (w > 0)
//            width = w;
//        else
//            return = 0;
//    }

    //No input taken
    public LearnConstructor() {
        length = 1;
        width = 1;
    }

    //TakeInput Constructor
    public LearnConstructor(int l, int w){
        this.length = l;
        this.width = w;
    }

    //Method
    public int area(){
        return length * width;
    }

    public static void main(String[] args) {

        LearnConstructor obj = new LearnConstructor();
        LearnConstructor obj2 = new LearnConstructor(10,5);
        System.out.println(obj.area());
        System.out.println(obj2.area());
    }
}