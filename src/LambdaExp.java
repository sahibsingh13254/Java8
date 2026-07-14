
public class LambdaExp {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello java 8");


        r.run();
    }
}
