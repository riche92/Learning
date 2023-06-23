public class FinalMain extends World {

/*    void demoMethod(){
        System.out.println("Hello World");
    }*/

    public static void main(String[] args) {
        final int a;

        a = 20; /* We can only assign final variables once, if we try to change this in another part of the code
        we will get a error.*/
        System.out.println("a: " + a);
      World demo = new World();
      demo.demoMethod();
    }
}
