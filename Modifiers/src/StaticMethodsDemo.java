public class StaticMethodsDemo {
    //cannot use this or super
    //Static methods are best when not using any instances.
    int nonstaticVariable; // You cannot access nonstatic variable to a static method.
    public static void printMessage(){
        System.out.println("Inside static method" /*+ nonstaticVariable*/);
       // printNormalMessage(); You can not access a nonstatic method.

    }
    public void normalMessage(){
        System.out.println("Inside normal method");
    }
}

class MainClass{
    public static void main(String[] args) {
        //You can call static directly without calling object
        StaticMethodsDemo.printMessage();
        //Below is how a normal method reacts
        StaticMethodsDemo normal = new StaticMethodsDemo();
        normal.normalMessage();
        ExtendsStaticsMethodsDemo.printMessage();
    }
}