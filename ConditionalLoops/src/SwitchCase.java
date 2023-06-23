public class SwitchCase {
    public static void main(String[] args) {
        /*
        switch (variable / expression) // this can be variable or expression {
        case value:
        //statement;
        break;
        case value:
        //statement;
        break;
        }

        *Case label cannot have a variable, it has to be constant
        *Variable can only be int,byte,short,char,string,enum.
        * Case label has to be of the same data type of the variable or expression result in switch parenthesis
        *If there are 100's of conditions, you would use switch over if else statement
         */

//        int month = 2;
//        switch (3-1){  //expression, i can change this to "month" to be a variable.
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            default:
//                System.out.println("Default");
//        }
//        System.out.println("Outside of switch case");

        //Fallthrough Switch; The switch cases will continue down until a break is hit
        int i = 1;
        switch(i){
            case 1:
            case 2:
                System.out.println("Hi im 2");
            case 3:
                System.out.println("Hi im 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Hi im 6");
                break;
        }
        System.out.println("Outside switch");
    }
}


