import java.util.Scanner;

public class Whileassignment {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter factorial number: ");
        int num = sc.nextInt();
        int factorial = 1, i = 1;
        while (num >= i){
          factorial = factorial * i;
          i++;
        }
        System.out.println("Factorial for " + num + " is " + factorial);*/
    Scanner scan = new Scanner(System.in);
        System.out.println("Add factorial number: ");
    int a = scan.nextInt();
    int factorial2 = 1, b = 1;
    while (b <= a){
        factorial2 = factorial2 * b;
        b++;
    }
        System.out.println(factorial2);
    }
}
// Get the factorial
// factorial * factorial - 1
// answer * factorial -2