import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String firstString = sc.next();
        System.out.println("You entered: " + firstString);

        int a = sc.nextInt();
        System.out.println("You entered for number: " + a);*/

        System.out.println("Hello, What's your name?");
        String name = sc.nextLine();
        System.out.println("Welcome " + name);

        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old");

    }
}
