public class Throw {
    public static void main(String[] args) {
        // throw new ArithmeticException("You tried to divide by 0");
        ArithmeticException Arithex = new ArithmeticException("You tried to divide by 0 noob");
        //ArithmeticException Arithexnull = null; you cannot do this because null does not work.
        /*ABC t1 = new ABC();
        throw t1; You cannot do this because t1 is not a part of throwable java object*/
        throw Arithex;
    }
}
