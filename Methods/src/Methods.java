public class Methods {
    public static void main(String[] args) {

      /*  modifier return-type method-name (<parameter list>) {
        //statements;
        }*/


        sayHello();
        String name1 = "Ben";
                int count = 5;
        displayName("John", 3);
        displayName(name1, count);
        int a = maxValue(10,20);
        System.out.println("Maximum is: " + a);
        System.out.println("Maximum is: " + maxValue(30,40));

    }
    public static void sayHello(){
        System.out.println("Hello Tom");
    }
    public static void displayName(String name, int counter){
        for (int i=0; i < counter; i++){
            System.out.println(i+ " : " + name);
        }
    }
    public static int maxValue(int number1,int number2){
        int max;
        if (number1 > number2)
            max = number1;  /* i can delete max variable here and change to return to shorten the code so i dont need
        return on the bottom */
        else
            max = number2;
        return max;
        //If i make this void, then this method cannot return any values. so it is int and everything inside must be int

    }
}
