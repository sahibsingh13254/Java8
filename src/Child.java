import java.lang.FunctionalInterface;

@FunctionalInterface
// this is also a functional interface,
public interface Child extends Parent{

    // public  void sayBie();       you can't declare new method, bcz its already extends parent interface
    default void hello(){       // you can declare default & static methods
        System.out.print("Hello sahib");
    }
}
