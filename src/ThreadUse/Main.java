package ThreadUse;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread chilThread = new Thread(myClass);
         // chilThread.run();   // this is acheived using My class


        // we can do the same using lambda


        Runnable runnable = () -> {
            for (int i =1; i<=10; i++)
            {
                System.out.println("Byeee " + i);
            }
        };
        Thread lambdaThread = new Thread(runnable);
         lambdaThread.run();
    }
}