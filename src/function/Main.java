package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> function1 = x -> x.length();
        Function<String, String>  function2 = s -> s.substring(0,3);
        Function<List<Student>, List<Student>> stdsVIP = li ->{
            List<Student> result = new ArrayList<>();
            for(Student s : li) {
                if (function2.apply(s.getName()).equalsIgnoreCase("sah"))
                {
                    result.add(s);
                }
            }
            return result;
        };
       Student s1 =  new Student( 1 , "Sahib");
       Student s2 =  new Student( 2 , "Daksh");
       Student s3 =  new Student( 3 , "Anushk");
       List<Student> students = Arrays.asList(s1,s2,s3);
      List<Student> filteredStds =   stdsVIP.apply(students);
        System.out.println(filteredStds);

    }
    public static class Student{
        int id;
        String name;

        public Student(int id, String name) {

            this.id = id;
            this.name = name;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }
}
