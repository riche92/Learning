import java.util.Scanner;

public class SwapVariable
{
    public static void main(String[] args) {
        int a,b,temp;
        System.out.println("Enter 2 values to swap: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of First variable: " + a);
        System.out.println("Value of Second variable: " + b);

    }
}
