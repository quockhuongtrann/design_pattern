package creation.builder.fluent;

public class Demo {
    public static void main(String[] args) {
        EmployeeBuilder personBuilder = new EmployeeBuilder();
        Person khuong = personBuilder
                .withName("Khuong")
                .worksAt("Developer")
                .build();
        System.out.println(khuong);
    }
}
