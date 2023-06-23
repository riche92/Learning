public class OverloadingMain {
    /*
    Method overloading
    Constructor overloading
    Operator overloading

    --Method Overloading-- Compile time polymorphism
    public void m1(){
    }
    public void m1(int a){
    }
    public void m1(String a1,String a2){
    }
    public void m1(String a1, int a2){
    }
    The method is decided by the parameters that the user inputs, that is polymorphism/method overloading
     */
    public void add(){
        System.out.println("Output: " + 2);
    }
    public void add(int a){
        System.out.println("Output: " + (a+a));
    }

    public void add(int a,int b){
        System.out.println("Output: " + (a+b));
    }
    public void add(int a,String b){
        System.out.println("Output: " + a + b);
    }


    public void add(int a,int b,int c){
        System.out.println("Output: " + (a+b+c));
    }

    public static void main(String[] args) {
        OverloadingMain OverloadingMain = new OverloadingMain();
        OverloadingMain.add();
        OverloadingMain.add(1);
        OverloadingMain.add(1,2);
        OverloadingMain.add(1,2,3);
        OverloadingMain.add(1,"Test");

    }
}