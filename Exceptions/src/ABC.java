import java.io.PrintWriter;

public class ABC {


    public static void main(String[] args) {
        //PrintWriter pw = new PrintWriter("ABC.txt");
        ABC a = new ABC();
        a.A();
    }
    void A(){
        B();
    }
    void B(){
        System.out.println(10/0);
    }
}