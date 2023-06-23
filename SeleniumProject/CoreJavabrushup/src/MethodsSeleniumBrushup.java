import java.lang.reflect.Method;

public class MethodsSeleniumBrushup {
    public void getData(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        MethodsSeleniumBrushup a = new MethodsSeleniumBrushup();
        a.getData();
        MethodsSeleniumBrushup2 a2 = new MethodsSeleniumBrushup2();
        String name = a2.getUserData();
        System.out.println(name);
    }
}
