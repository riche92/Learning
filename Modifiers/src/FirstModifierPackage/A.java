package FirstModifierPackage;

// public > protected > default > private
// Public can be accessed anywhere
// Protected can be accassed by any of the same package or subpackages
//Default classes can only be accessed in the same packages. The access modifier is set to default if none
// are called.
//Private can only be called in the same class
//Classes can only be public or default
public class A {
    int defaultvariableinA;
    private int privatevariableA;
    public int publicvariableA;
    protected int protectedvariableA;
    public void printMessageFromA(){

    };

    public static void main(String[] args) {
        B b = new B();
        b.setPrivatevariableB(100);
        System.out.println(b.getPrivatevariableB());
        C c = new C();


    }
}
