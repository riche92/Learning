public class Forloop {
    public static void main(String[] args) {
        /*
        for (initialization ; condition ; increment){
        statements
        }

   }*/
        /*for (int i = 1, j = 1; i <= 15 && j <=10; i++, j++){
            System.out.println(i + " I love java");
        }*/
       // for (int a = 0; a < 10; a++);
//        for (int b = 0; b < 10; b++)
//            System.out.println("Hello");
//        for (int b = 0; b < 10; System.out.println("Hi")){ //Conditions must be boolean, initialization,increment/decrement can be any statement
//            System.out.println("Hello");
//        }
      /*  int a = 10, b = 20;
        for (int i = 0; a < b; i++){
            System.out.println("Hello");
        }
        System.out.println("Goodbye");*/

        int[] x = {10,20,30,40};
        for (int i = x.length-1; i>=0; i--){
            System.out.println(x[i]);
        }
    }
}
