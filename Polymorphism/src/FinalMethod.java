public class FinalMethod {
}
    class World {
        final void demoMethod() {
            System.out.println("Hello World");
        }
    }
    final class FinalDemo{ // You cannot inherit FinalDemo
    int a = 10;
    void display(){
        a = 20;
        System.out.println("Animals");
        //Because we cannot inherit the class, the method is inheritantly final because the class is final.
    }

        public static void main(String[] args) {
        FinalDemo Cow = new FinalDemo();
            Cow.display();
        }
}