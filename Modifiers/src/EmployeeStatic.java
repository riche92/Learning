public class EmployeeStatic {
    int employeeID;
    int salary;

    static int countOfEmployees;
    //Static ints default to 0
   static int companyName;
   //company name will be the same across all objects. This can be changed unlike final this is due to static.

    public EmployeeStatic(int employeeID, int salary) {
        this.employeeID = employeeID;
        this.salary = salary;
        countOfEmployees++;
    }

    public static void main(String[] args) {
        EmployeeStatic emp1 = new EmployeeStatic(1,500);
        EmployeeStatic emp2 = new EmployeeStatic(2,1000);
        EmployeeStatic emp3 = new EmployeeStatic(3,2000);
        EmployeeStatic emp4 = new EmployeeStatic(4,5000);

        System.out.println("Count of employees: " + EmployeeStatic.countOfEmployees);
        //emp1.employeeID(This would be the normal way)
        //To access a static you need to call it from the class.


    }
    //1000 employees

}

