import java.lang.FunctionalInterface;

@FunctionalInterface  // also you can remove the anotations and it will not be functional interface
// this is also a functional interface,
public interface Child extends Parent{
    @Override
    public void sayHi(); // This is valid bcz it is the same method

    // public  void sayBie();       you can't declare new method, bcz its already extends parent interface
    default void hello(){       // you can declare default & static methods
        System.out.print("Hello sahib");
    }
     // public void carBenz();   // remove the anotaion and this is valid
}
