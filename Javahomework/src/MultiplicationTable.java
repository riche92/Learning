import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a positive integer for multiplication table: ");
        int num = scan.nextInt();
        for (int i = 1; i <= 10; i++){
            int multi = num * i;
            System.out.println("Multiplication table of " + num + " is " + multi);
        }
    }
}
