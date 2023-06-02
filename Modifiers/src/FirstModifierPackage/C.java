package FirstModifierPackage;

public class C extends B{
    void printMessageFromC(){
        B b = new B();
        b.printmessagefromB();
       // b.getPrivatevariableB();
        b.protectedvariableB = 50;
    }
}
