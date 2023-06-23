import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a grade: ");
        char grade = scan.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Amazing");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You Can Do Better Next Time");
                break;
            default:
                System.out.println("Invalid Grade Entered");
                break;
        }
    }
}
