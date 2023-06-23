public class FinalVariables {
 /*   Initialize while declaring
    Instance block
    Inside constructor*/
    final static int staticDemo;
    static int staticNormal;
   static {
        System.out.println("Inside static block");
        staticDemo = 700;
    } //Only loaded after the first time
final int finalDemo;
    {
      // finalDemo = 300;
        System.out.println("Inside instance block");
    }
    //loaded everytime a instance is created
    public FinalVariables() {
        finalDemo = 400;
    }
    public void method1(final int a){
        //a = 100;
        System.out.println("In method : " + a);
    }

    public static void main(String[] args) {

      final int a = 100;
        System.out.println(a);
        //a = 50;
        FinalVariables finalVariables = new FinalVariables();
        FinalVariables finalVariables2 = new FinalVariables();
       // FinalVariables finalVariables3= new FinalVariables();
        //FinalVariables finalVariables4 = new FinalVariables();
        //Inside instance block will run four times because we are creating an object for it everytime. */
        System.out.println(finalVariables.finalDemo);
        finalVariables.method1(400);
        finalVariables.method1(300);
    }
}
