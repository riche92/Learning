import java.awt.*;
import java.lang.reflect.Method;
import java.util.List;

public class MethodOverriding extends ListofClasses {
    //Overriding methods
    public void add(){
        System.out.println("Hi");
    }
@Override
   public void display() {
    System.out.println("Display Override");
}
//I can use Ctrl + O to get a list of methods from ListofClasses(Parent Class)
    public static void main(String[] args) {
        MethodOverriding Pie = new MethodOverriding();
        ListofClasses ListofClasses = new ListofClasses();
        Pie.add();
        Pie.display();

    }
}

/*
class Dad{
    void drive(){
        Safe driving;
    }
}

class Boy extends Dad{
    void drive(){
        Unsafe driving
    }
    The child class is overriding the parent
}*/
