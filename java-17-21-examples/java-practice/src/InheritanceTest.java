public class InheritanceTest {
    public static void main(String[] args) {
        Person p = new Employee("John", 30, null);
        System.out.println(p);
        Employee e = new TeamLead("Lead1", 30, new Address(1, "some_str"));
        System.out.println(e);
        System.out.println(e instanceof Person);
        Person p2 = new TeamLead("Lead2", 30, new Address(1, "some_str"));
        System.out.println(p2);
        Person p3 = new Person();
        System.out.println(p3 instanceof Employee);
    }
}
