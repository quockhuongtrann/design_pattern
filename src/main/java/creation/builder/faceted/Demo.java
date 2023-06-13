package creation.builder.faceted;


public class Demo {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                .at("Mac Thien Tich")
                .in("Ho Chi Minh")
                .withPostcode("HCM_PC")
                .works()
                .at("Company F")
                .asA("Software Engineer")
                .earning(6500000)
                .build();
        System.out.println(person);
    }
}
