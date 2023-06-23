//This is to test the try catch flow, Change any of the prints to 10/0 and follow the flow of the nested trycatch
public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);

            try {
                System.out.println(5 / 0);
            } catch (ArithmeticException e) {
                System.out.println(10/0);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Finally is called");
        }

    }
}

