public class StaticBlockA {
    public StaticBlockA() {
        System.out.println("Inside constructor of A");
    }
    static int x ;
    static{
        x = 10;
        System.out.println("Inside static block");
        // Static block runs before constructor
    }


}
