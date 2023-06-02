import java.util.Scanner;

public class Dowhileassignment {
    public static void main(String[] args){
    String yes;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers:");
         int option1 = scan.nextInt();
         int option2 = scan.nextInt();
         int sum = option1 + option2;
            System.out.println("Sum of two numbers: " + sum);
            System.out.println("Would you like to go again?");
            yes = scan.next();
        }
        while(yes.equals("Yes"));
        System.out.println("Operation Terminated");
    }
}

/*
    public static void main(String[] args) {
        int input = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int option1 = scan.nextInt();
            int option2 = scan.nextInt();
            int sum = option1 + option2;
            System.out.println("Sum of two numbers: " + sum);
            System.out.println("Would you like to go again?");
            input = scan.nextInt();
        }
        while (input == 1);
        System.out.println("Operation Terminated");
    }
}
*/