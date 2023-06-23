public class TooYoungException extends RuntimeException{ //We need to extend to runtime exception because it is a
    //unchecked exception
    public TooYoungException(String message){
        super(message); //super keyword is used in inheritance, if you want to pass something to parent class
        // constructor. It will assign to the parent constructor.

    }
}
