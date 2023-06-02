import java.util.Arrays;
import java.util.Scanner;

public class ArraysInitialize {
    public static void main(String[] args) {

        /*Initializing Arrays*/

        //Using method to fill array
        int a[] = new int[5];
//        a[0] = 10;
//        int b[] = new int[]{1,2,3,4,5};
        Arrays.fill(a, 5);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //Initializing and using for loop
        int b[] = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("value of b[" + i + "] : " + b[i]);
        }
        //Taking user input and inputting it into Array
        int c[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");

        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("value of c[" + i + "] : " + c[i]);
        }
    }
}
