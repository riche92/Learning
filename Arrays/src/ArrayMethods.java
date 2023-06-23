import java.util.Scanner;

public class ArrayMethods {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5};

        displayArray(a);
        int z[] = getValues();
        displayArray(z);

        // We did not create a copy of B of the same array, b is just pointing to the a[] memory.

    }

    public static void displayArray(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println("Value of b[" + i + "] = " + b[i]);
        }
    }

   public static int[] getValues() {
        System.out.println("Please enter values for array: ");
        int temp[] = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < temp.length; i++)
            temp[i] = scan.nextInt();

        return temp;
    }
}


