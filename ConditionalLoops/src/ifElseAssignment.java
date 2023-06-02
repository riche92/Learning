import java.util.Scanner;

public class ifElseAssignment {
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age for signup:");
        age = scan.nextInt();
        if (age >= 21){
            System.out.println("Eligible");
        }
        else if(age < 21){
        System.out.println("Ineligible");
        }
    }
}