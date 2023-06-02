public class Whileloop {
    public static void main(String[] args) {
        //While loop is majorly used in scenarios where we dont know the no. of iterations upfront.
        /* while (condition) Conditions must always be boolean
        {statements}
         */
       /* int count = 0;
        while (count < 15 ){
            System.out.println("I love java");
            count++;
        }
        System.out.println("Out of while loop");*/
        /* while(true) {
        int x = 100;
        Variables inside while loop can only be used inside the while loop
    }  */
        int a = 10, b = 20; // Using final will make Hi unreachable because you cannot loop out of the while with ++
        while (a < b) {  // if there is no curly brace, the while loop is ONLY using the first line.
            System.out.println("Hello");
            a+=2;
        }
        System.out.println("Hi");
        /*
        while(rs.next) -> working with rulesets in databases
        while(e.hasMoreElements()) - to get more elements
        while(itr.hasNext()) - to get next elements from iterators
         */
    }
}
