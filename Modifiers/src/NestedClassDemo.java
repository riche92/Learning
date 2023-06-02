public class NestedClassDemo {
    private int x;
    int y;

    private static int z = 100;
    class Nested{
        void method1(){
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            //we can access x because we are nested inside the outer class
        }
    }
    static class StaticNested{
        //Only nested classes can be static
        public void method2(){
            System.out.println("Nested static method");
            System.out.println(z);
        }
    }
    public static void main(String[] args) {
        //Nested nested = new Nested();
        NestedClassDemo Nestedclassdemo = new NestedClassDemo();
        NestedClassDemo.Nested nested = Nestedclassdemo.new Nested();
        nested.method1();

        NestedClassDemo.StaticNested staticNested = new NestedClassDemo.StaticNested();
        staticNested.method2();
        // To create an object inside a nested, the outer class needs to have a object.
    }
}
