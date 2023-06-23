public class JavaOperators {
    public static void main(String[] args){
        int a = 25, b = 20, c = 15, d = 10;
        System.out.println ("a + b = " + ( a + b ));
        System.out.println ("b - c = " + ( b - c ));
        System.out.println ("c % d = " + ( c % d ));
        a++;
        System.out.println ("Display increment: " + a);
        a--;
        System.out.println ("Display decrement: " + a);

        /*int x = 100;
        System.out.println("Value of x: " + x);
        int y = x++; // post increment: value is assigned then incremented
        int z = ++x; // pre increment: value is incremented first and then assigned
        System.out.println("Value of end x: " + x);
        System.out.println("Value of end y: " + y);
        System.out.println("Value of z: " + z);
    */
        //Decrement operators work the same as above
        int x = 10 ;
        System.out.println("Value of x: " + x);
        int y = x--; // post increment: value is assigned then incremented
        int z = --x; // pre increment: value is incremented first and then assigned
        System.out.println("Value of end x: " + x);
        System.out.println("Value of end y: " + y);
        System.out.println("Value of z: " + z);

        //int wrap = (x--)--;
        // You can not wrap increments or decrements

        final int finaltemp = 10; // By adding final, it makes the variable finaltemp unchangable

        System.out.println("a == b is " + (a == b));
        System.out.println("a != b is " + (a != b));

        //To find if both are true or false together
        System.out.println("&& :" + ((a == b) && ( a != b )));
        //If one of the operations is true, this will return true. In this case a<b is false but a != b is true.
        System.out.println("|| :" + ((a < b) || ( a != b )));
        a *= b ; // a = a + b
        System.out.println ("a *= b: " + a);

        //Ternary Operators
        int low = 10, high = 20;
        int max = (low < high ) ? low : high;
        // if a<b is true it will return a, if its false it will return b
        System.out.println("Max: " + max);
        //Ternary operators can also be nested
        max = (10 > 20) ? 40 : ((50 > 70) ? 70:80);
        System.out.println("new max: " + max);
        /* 10 is less than 20 so its returning false. So when we go to the second part of the operator 50 is less
        70 so this is also false so we would return 80.
         */

    }

}
