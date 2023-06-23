public class Trycatch {
    // You cannot call a child exception after a parent exception and you cannot have 2 of the same exception catches

    public static void main(String[] args) {
        System.out.println("Hi");
        try{
            System.out.println("Statement 1");
            System.out.println(10/0);
            System.out.println("Statement 3");
        }
        catch (ArithmeticException g){
            System.out.println("Arithmetic Exception" + (10/2));
        }
        catch(Exception e){
           e.printStackTrace();
           //System.out.println(e.toString());
            //System.out.println(e.getMessage()); Description only
        }
        //finally {} is used to clean up code for try catch

        //finalize() is a method used for objects, it releases all resources and then deleted.


        System.out.println("Hello");
    }
}
