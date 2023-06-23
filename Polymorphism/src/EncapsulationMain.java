public class EncapsulationMain {
    public static void main(String[] args) {

        EncapsulationA A = new EncapsulationA();
       // A.var = 100; Because we privated var, it can only be called inside the class
        System.out.println("Value in var: " + A.getVar());
        A.setVar(1001);
        System.out.println("Value in var: " + A.getVar());
        A.setVar(100);
        System.out.println("Value in var: " + A.getVar());
    }
}
