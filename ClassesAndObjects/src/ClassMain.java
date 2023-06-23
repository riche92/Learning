public class ClassMain {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari F430", "Red", 4); // Class Objectname = newmemory Classname();
 /*       ferrari.seats = 4;
        ferrari.model = "Ferrari F430";
        ferrari.color = "Red";

       ferrari.display();

       Car tesla = new Car();
        tesla.seats = 4;
        tesla.model = "Model S";
        tesla.color = "Silver";

        tesla.display();

        Car audi = new Car();
        audi.seats = 2;
        audi.model = "Audi SQ5";
        audi.color = "Black";

        audi.display();*/

        ferrari.display();

        // object declaration and memory allocation

        //--------Methods vs Constructors--------
       /* Constructors have no return type where as methods do have
          Constructors name should be same as class names, however this is not true in case of methods
          Java has a default constructor, but there is no such thing called default methods*/

        //Rules for Constructors
        /*Constructors dont have a return type
          Declaring constructors is not mandatory
          There wont be any default constructor created by java if you have declared a constructor
          Constructors cant be inherited*/
    }
}
