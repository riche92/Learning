import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int prime = scan.nextInt();
        boolean flag = true;
        for (int i = 2; i < prime; i++) { // 1 < 5
            if (0 == prime % i) {
                flag = false;
                break;
            }
        }
            if(flag && prime > 1)
            {
                System.out.println("Number is prime");
            }
            else
            {
                System.out.println("Number is not prime");
            }
            }
        }
