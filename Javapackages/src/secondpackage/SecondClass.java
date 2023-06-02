package secondpackage;
//Importing the package allows us to use the statement without refering back to the package everytime.
//Using a star will include all classes in the package this is implicit, this will not import subpackages
import firstpackage.*;
//Explicit import gives more details on what classes are being imported
import firstpackage.Thirdclass;
import firstpackage.firstSubpackage.FirstSubClass;
import thirdPackage.*;
//Most companies use com.google (example) for package name

import java.util.Scanner;

public class SecondClass {
    //FirstClass firstclass;
    //You can use the below if not importing the package
    firstpackage.FirstClass firstClass = new firstpackage.FirstClass();

    Thirdclass thirdClass;

    Scanner scan = new Scanner(System.in);
FirstSubClass firstsubclass = new FirstSubClass();

}


