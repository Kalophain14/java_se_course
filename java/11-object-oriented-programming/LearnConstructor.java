public class LearnConstructor {

    // Properties (Encapsulated fields)
    private int radius;
    private int height;

    // Default No-Argument Constructor
    public LearnConstructor() {
        radius = 1;
        height = 1;
    }

    // Parameterized Constructor
    public LearnConstructor(int r, int h){
        this.radius = r;
        this.height = h;
    }

    // Getters
    public int getRadius (){
        return radius;
    }

    public int getHeight (){
        return height;
    }

    // Setters
    public void setRadius(int r) {
        if (r > 0) {
            radius = r;
        } else {
            radius = 0;
        }
    }

    public void setHeight(int h){
        if (h > 0) {
            height = h;
        } else {
            height = 0;
        }
    }

    // Method for cylinder
    public int cylinder(){
        return radius * height;
    }

    public static void main(String[] args) {
        // Instantiate
        LearnConstructor obj = new LearnConstructor();
        LearnConstructor obj2 = new LearnConstructor(10, 5);

        System.out.println("Output for obj: " + obj.cylinder());
        System.out.println("Output for obj2: " + obj2.cylinder());
    }
}