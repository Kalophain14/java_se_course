/*
Data Hiding
= Data is hidden eg vehicle engine, TV circuit board
= Operators uses the data hidden to be able to run the method
= Operators comes as TV button, gears, and steering wheel
*/


class DataHiding {

    //Data Hidden Properties
    private int length;
    private int width;

    /*
    Accessing Private Data using
    = get(READ)
    = set(WRITE)
     */

    //Length
    int getLength(){
        return length;
    }
    void setLength(int l){
        if(l > 0)
            length = l;
        else
            length = 0;
    }

    //Width
    int getWidth(){
        return width;
    }
    void setWidth(int w){
        if(w > 0)
            width = w;
        else
            width = 0;
    }

    //Methods Using The Data
    public int area(){
        return length * width;
    }
    public int perimeter(){
        return 2*(length + width);
    }

    public static void main(String[] args) {
        DataHiding obj = new DataHiding();

        //Setting Properties
        obj.setLength(10);
        obj.setWidth(5);

        System.out.println(obj.area());
        System.out.println(obj.perimeter());
    }
}
