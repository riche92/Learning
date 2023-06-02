package SecondModifierPackage;

import FirstModifierPackage.A;
import FirstModifierPackage.B;

public class D extends B {
    void printMessagefromD(){
        A a = new A();
      //  a.defaultvariableinA;
        a.printMessageFromA();
        a.publicvariableA = 200;
       // a.protectedvariableA = 100;
    }
    void printMessagefromD2(){
        B b = new B();
       // b.defaultvariableinB = 1000;
        publicvariableB = 100;
        protectedvariableB = 50;
    }


}
