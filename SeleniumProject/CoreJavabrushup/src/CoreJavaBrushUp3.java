public class CoreJavaBrushUp3 {
    public static void main(String[] args) {
        String s = "Rahul Shetty Academy";
        String s2 = "Rahul Shetty Academy";
        //String is an object and if the value inside the string is the same its using the same object
        String s5 = "Hello";

        String s3 = new String("Welcome");
        //By using new it will create a new object if the value is the same
        String s4 = new String ("Welcome");
        String[] splittedstring = s.split(" ");
        System.out.println(splittedstring[0]);
        System.out.println(splittedstring[1]);
        System.out.println(splittedstring[2]);

        for (int i = s.length()-1; i>=0;i--){
            System.out.println(s.charAt(i));
        }

    }
}
