import java.sql.SQLOutput;

public class CoreJavaBrushUp1 {
    public static void main(String[] args) {

    int myNum = 5;
    String Words = "Grow there";
    char letter = 'r';
    double dec = 4.55;
    boolean Here = true;

        System.out.println(myNum + " Apples " + Words);

        int arr[] = {1,2,4,5};
        int arr2[] = new int[3];
        arr2[0] = 1;
        arr2[1] = 5;
        arr2[2] = 8;

        String[] Names = {"Fred","James", "Rodney"};
       // System.out.println(arr2[2]);
        //System.out.println(arr[2]);

        for (int i = 0;i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
        for (int k = 0; k < Names.length; k++){
            System.out.println(Names[k]);
        }
        for (String s: Names){
            System.out.println(s);
        }
    }
}
