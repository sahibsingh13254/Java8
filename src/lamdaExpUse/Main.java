package lamdaExpUse;

public class Main {
    public static void main(String[] args) {
        Employee employee = () ->  "Software engineer" ;
        System.out.println(employee.getName());
        Employee editor =  () -> "Hello I am editor";
        System.out.println(editor.getName());
    }
}
