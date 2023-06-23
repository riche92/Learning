public class BreakContinueStatements {
    public static void main(String[] args) {
        /*
        Break statements stop the loop at the condition.
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.println(i);
        }*/
        // Continue statement skips the current and goes to the next.
        for (int i = 1; i <= 10; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }

    }
}
