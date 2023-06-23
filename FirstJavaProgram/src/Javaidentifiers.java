public class Javaidentifiers {
    public static void main(String args[])
    {
    int x = 10;
    int firstvariable;
    firstvariable = 10;
    int secondvariable = 20;
    firstvariable = 5; // This overrides the firstvariable identifier
    int total = (firstvariable + secondvariable);
    System.out.println("Total is " + total);

    //32 bit float supports up to 7 positions.
    float myFloat = 10.25f / 3f;
        System.out.println("My double: " + myFloat);
    //63 bit double supports up to 16 positions.
        double myDouble = 10.25d / 3f;
        System.out.println("My double: " + myDouble);
// Booleans can be true / false
        boolean myBoolean = true;
        System.out.println("My boolean: " + myBoolean);

        //32 bit this can also hold unicode values
        char myChar = 'a';
        System.out.println("My Char: " + myChar);
        char unicodeChar = '\u0043'; //You can google for unicode codes
        System.out.println("My Unicode Char: " + unicodeChar);
    }
};
