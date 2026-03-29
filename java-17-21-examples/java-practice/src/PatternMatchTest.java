import java.util.List;

public class PatternMatchTest {

    public static void main(String[] args) {
        matchPattern(new Object());
        matchPattern("Hello");
        matchPattern(new Employee("John", 30,
                new Address(1, "some_str")));
    }

    // pattern matching
    // no need to cast obj to type
    private static void matchPattern(Object obj) {
        if (obj instanceof String s) {
            System.out.println("String:" + s + " length: " + s.length());
        } else if(obj instanceof Employee employee) {
            System.out.println("Employee: " + employee.getName()
                    + " has address: " + employee.getAddress()
                    + " and age: " + employee.getAge());
        } else {
            System.out.println("Unknown object");
        }
    }
}
