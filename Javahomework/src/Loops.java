import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Question 4
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Enter number that you want a factorial of: ");
        int num = scan.nextInt();
        int i = 1;
        int factorial = 1;
        while (i <= num) {
            factorial = factorial * i;
            i++;
            System.out.println(factorial);
        }*/

        //Question 5
      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = scan.nextInt();
        int num2 = num;
        int i = 1;
        while(i < exponent) {
            num = num * num2;
                    i++;
        }
        System.out.println("The final value is: " + num);*/

        //Question 6
       /* {
            Scanner console = new Scanner(System.in);

            int number;
            int reverse = 0;

            System.out.print("Enter the number ");
            number = console.nextInt();

            int temp = number;
            int remainder = 0;

            while(temp>0)
            {
                remainder = temp % 10;
                reverse = reverse * 10 + remainder;
                temp /= 10;
                System.out.println("Remainder is: " + remainder);
                System.out.println("Reverse is: " + reverse);
                System.out.println("temp is: " + temp);
            }

            //System.out.println("Reverse of " + number + " is " + reverse);
        }*/

        //Question 7
      /*  Scanner scan = new Scanner(System.in);
        String yes;
        int remainder = 0;
        int oddSum = 0;
        int evenSum = 0;
        do {

            System.out.println("Enter a number to add: ");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                evenSum = num + evenSum;
            } else
                oddSum = num + oddSum;
            System.out.println("Would you like to continue?");
            yes = scan.next();
        }
        while (yes.equals("Yes"));
        System.out.println("Even sum is: " + evenSum);
        System.out.println("Odd sum is: " + oddSum);
*/
        //Question 8
        {
            {
                Scanner console = new Scanner(System.in);

                int number;

                System.out.print("Enter the positive integer ");
                number = console.nextInt();

                boolean flag = true;

                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag && number > 1) {
                    System.out.println("Number is prime");
                } else {
                    System.out.println("Number is not prime");
                }

            }
        }
    }
}

/*
Loop the prime input divided starting by 1
Prime input equals i when mod never reaches 0, display This is a prime number
otherwise display this is not a prime number
 */




