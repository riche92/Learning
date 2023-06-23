public class ConstructorOverloading {

    public ConstructorOverloading(){
        System.out.println("Constructor with no parameters called");
    }
    public ConstructorOverloading(int a){
        System.out.println("Constructor with 1 parameter called");
    }
    public ConstructorOverloading(int a,int b){
        System.out.println("Constructor with 2 parameters called");
    }
    public ConstructorOverloading(String a,int b){
        System.out.println("Constructor with 2 parameters called, 1 String and 1 Integer");
    }

    public static void main(String[] args) {
        ConstructorOverloading Construct = new ConstructorOverloading();
        new ConstructorOverloading(3);
        new ConstructorOverloading(1,3);
        new ConstructorOverloading("Name",2);

    }
}
