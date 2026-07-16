public class Main {
    public static void main(String[] args) {

        anonymousInnerClass i = new anonymousInnerClass() {
            @Override
            public String getName() {
                return "Sahib Singh";
            }

            @Override
            public String getSalary() {
                return "100000 $";
            }
        };
        System.out.println(i.getName());
        System.out.println(i.getSalary());

    }
}
