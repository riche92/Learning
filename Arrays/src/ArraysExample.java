public class ArraysExample {
    public static void main(String[] args) {

        int a[];
        int[] b;

        a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 50;
        a[3] = 40;
        a[4] = 30;

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        //Combining declaration and allocation
        int c[] = new int[5];
        // declaration,allocation and initialization
        int d[] = new int[]{1,2,3,4,5};
        for (int o = 0; o < d.length; o++){
            System.out.println("Value of d: " + o + " is " + d[o] );
        }

    }
}
