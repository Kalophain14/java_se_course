public class PractisingConstructors {

    //Product properties
    private String itemNo;
    private String name;
    private double price;
    private double qty;

    //Getters
    public String getItemNo() {
        return itemNo;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public double getQty() {
        return qty;
    }

    /*
    Setters
    Since the itemNo & name of the products
    dont change no need to set them
    */
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid price");
        } else  {
            this.price = price;
        }
    }
    public void setQty(double qty) {
       if (qty < 0) {
           System.out.println("Invalid quantity");
       } else   {
           this.qty = qty;
       }
    }

    //Constructor
    public PractisingConstructors(String itemNo, String name, double price, double qty) {
        this.itemNo = itemNo;
        this.name = name;
        setPrice(price);
        setQty(qty);
    }

    public static void main(String[] args) {

        PractisingConstructors obj = new PractisingConstructors("A124", "TV", 1200.92, 2.0);
        System.out.println("Name : " + obj.getName());
        System.out.println("Price : " + obj.getPrice());
        System.out.println("Quantity : " + obj.getQty());

    }
}
