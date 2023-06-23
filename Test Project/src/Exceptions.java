public class Exceptions {
    public static void main(String[] args) {
        a();

    }
    static void a(){
        b();
    }
    static void b(){
        System.out.println(10/0);
    }
}
