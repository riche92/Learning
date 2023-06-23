package FirstModifierPackage;
public class B {
    int defaultvariableinB;
    private int privatevariableB;

    public int publicvariableB;

    protected int protectedvariableB;

    public void setPrivatevariableB(int i) {
        this.privatevariableB = 100;
    }

    public int getPrivatevariableB() {
        return privatevariableB;
    }

    void printmessagefromB(){
        A a = new A();
        a.defaultvariableinA = 100;
        a.printMessageFromA();
        a.publicvariableA = 500;
        //a.privatevariableA = 100;
        a.protectedvariableA = 50;

    }
}
