public class AbstractExampleMain {
    public static void main(String[] args) {
AbstractCar car1 = new Ferrari();
repair carRepair = new repair();
carRepair.repairCar(car1);

car1 = new Audi();
carRepair.repairCar(car1);
    }
}
