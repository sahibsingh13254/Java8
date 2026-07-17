package defaultMethods;

interface  parent{
    default void sayHello(){   // we can implement the body because this is default method
        System.out.println("helloo");
    }
}
class child implements parent{

    @Override
    public void sayHello() {
        System.out.println("child says hello");
    }
}
public class MyClass {
    public static void main(String[] args) {

        child c = new child();
        //  c.sayHello(); // This also runs, because of default methods

        parent p = new child();
        p.sayHello(); // child will run

       // parent p1 = new parent(); we can't run this because it is interface , An interface cannot be instantiated.

    }
}

