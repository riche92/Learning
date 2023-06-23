public class AbstractClasses {
}
class Ferrari extends AbstractCar{
    int doors;
    int tires;
    String Color;

    void accelerate(){
        System.out.println("Accelerate Ferrari");
    }
    void applyBrakes(){
        System.out.println("Applying Breaks");
    }
}

class Audi extends AbstractCar{
        int doors;
        int tires;
        String Color;
        @Override
        void accelerate(){
            System.out.println("Accelerate Audi");
        }
        @Override
        void applyBrakes(){
            System.out.println("Applying Breaks Audi");
        }
}

