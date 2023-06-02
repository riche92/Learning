import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {
    public static void main(String[] args) {


        int arr3[] = {1, 2, 3, 4, 6, 78, 8, 5};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 0){
                System.out.println("These integers have remainder of 0 when divided by 2: " + arr3[i]);
                break;
            }
            else {
                System.out.println(arr3[i] + " is not divisible by 2");
            }
        }

        ArrayList<String> a = new ArrayList<String>(); /*( new Arraylist()) is the implementation while the
         beginning is the blueprint*/
        //the above is creating a Arraylist Object
        a.add("rahul");
        a.add("Shetty");
        a.add("Academy");
        a.add("Selenium");
        System.out.println(a.get(3));
        for (int i = 0; i<a.size();i++){
            a.get(i);
        }
        System.out.println("************");
        for (String val : a){
            System.out.println(val);
        }
        System.out.println(a.contains("rahul"));
        String[] name = {"Rich","Cookies","Cake"};
        List<String> nameArrayList = Arrays.asList(name); //Converting Array into arraylist
        nameArrayList.contains("Rich");
    }

}
