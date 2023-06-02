import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

       /* if (condition){
            code to be executed
        }*/
        //if...else..if(laddered if else)
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        if (age > 13) {
            System.out.println("Welcome to my Website");
            if (age >= 27 && age <= 35) {
                System.out.println("You have received a discount based on your age");
            }
        }
            else if (age == 13) {
                System.out.println("Please provide us your email id");
            } else {
                System.out.println("You are too young for this site");
            }
            System.out.println("Please leave me feedback");
// Example 1
       /* int x = 10;
        if (x == 20) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello Java");

        }
        // Example 2 if else works below because it is a boolean value
        boolean y = true;
        if (y == false){
            System.out.println("Boolean works!");
        }
        else {
            System.out.println("boolean doesnt work :(");
        }*/
        }
    }
