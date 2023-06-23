import java.util.Scanner;

public class Ifelseladderassignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scan.nextInt();
        /*if (age > 21 && age < 55){
            System.out.println("Savings account");
        }
        else if (age > 55){
            System.out.println("Seniors Citizens account");
        }  //This also works, but it is not a laddered if*/
        if (age > 21){
            if(age > 55){
                System.out.println("Seniors citizen account");
                if (age < 55){
                    System.out.println("Savings account");
                }
            }
        }
        else {
            System.out.println("ineligible");
        }
    }
}
