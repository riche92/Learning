package FirstModifierPackage;

import jdk.jshell.execution.Util;

public class SingletonPrivateDemo {
    static SingletonPrivateDemo instance = null;
    public int x = 10;

    private SingletonPrivateDemo() {
    }

    static public SingletonPrivateDemo getInstance() {
        // we are calling this before an object exists thats why it is static
        if (instance == null)
            instance = new SingletonPrivateDemo(); // Creating the object
        return instance;
    }
}
    class Main {
        public static void main(String[] args) {
            SingletonPrivateDemo Singletondemo = SingletonPrivateDemo.getInstance();
            //Singletondemo is the object in this case
           /* because we called the constructor as private, we cannot create a new object*/
            SingletonPrivateDemo Singletondemo2 = SingletonPrivateDemo.getInstance();
            /*Only one object is created because it is private, so no matter how many times we call getInstance
            we will get the same value*/
            Singletondemo.x = Singletondemo.x + 10;
            System.out.println("Value of x in singleDemo1 : " + Singletondemo.x);
            System.out.println("Value of x in singleDemo1 : " + Singletondemo2.x);
            
        }
    }


