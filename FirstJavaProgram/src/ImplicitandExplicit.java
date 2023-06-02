public class ImplicitandExplicit {
    public static void main(String[] args) {
        //This is implicit type casting when value of smaller data type is assigned to a larger one
        byte b = 100;
        int i = b;
        System.out.println("Value of i: " + i);
        /* byte -> short -> int -> long -> float -> double
           char -> int
         */
        int i1 = 200;
        double d = i1;
        System.out.println("Value of d: " + i1);

        char c = 'A';
        int c1 = c;
        System.out.println("Value of c1: " + c1);
        // It uses the ASCII value of A, If you google ascii values it will bring up 65

        //This is explicit type casting, This is from larger to small data type
         int j = 100;
         byte k = (byte) j;
        System.out.println("Value of k: " + k);

    }
}
