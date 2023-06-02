import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        System.out.println("What is your age?");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if (age < 18) {
        throw new TooYoungException("User is too Young to join");
    }
    else if (age > 60){
            throw new TooOldException("You are too Old");}
    else {
        System.out.println("We will process your details");
    }
    }
}
