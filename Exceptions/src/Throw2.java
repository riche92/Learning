import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Throw2 {
    public static void main(String[] args) throws FileNotFoundException {
       /* try {
            PrintWriter pw = new PrintWriter("Udemy_login.txt");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }*/
        PrintWriter pw = new PrintWriter("Hi.txt");
        FileNotFoundException filenf = new FileNotFoundException("File was not found");
        throw filenf;
    }
}
