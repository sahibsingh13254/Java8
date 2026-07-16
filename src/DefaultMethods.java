public class DefaultMethods {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animals a = new Dog(); // runtime polymorphism (
        a.sayHello();
        d.sayHello();
    }
}
interface Animals {
     default  void sayHello(){   // you want to use default for implementing the body
        System.out.print("Animal Kingdom");
    }
}

class Dog implements Animals{
    @Override
    public  void sayHello(){
        System.out.print("Dog Bark!");
    }


    }