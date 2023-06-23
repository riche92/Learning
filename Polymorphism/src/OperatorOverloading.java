import org.w3c.dom.ls.LSOutput;

public class OperatorOverloading {
    public static void main(String[] args) {
        System.out.println(10 + 20);
        System.out.println("Hello" + "Java" + 10);
        System.out.println("Hello" + "Java" + 10 + 30);
   // The plus operator is dependant on the first parameter, So because Hello is a string, everything in the parameters
        // is a string
        System.out.println("Hello" + "Java" + (10 + 30));
        //The parenthesis is evaluating the numbers as int, so it adds in this line.
    }
}
