import java.util.List;

public class SwitchRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, null);
        Address address = new Address(1, "some_str");
        doSwitch(employee);
        doSwitch(new Employee("Jackie", 45, address));
        doSwitch("Hello");
        doSwitch(123);
        doSwitch(null);
        doSwitch(new Object());
        doSwitch(address);
        doSwitch(new Address(-1, "some_str"));
        doSwitch(address.doorNum());
        doSwitch(List.of("a", "b", "c"));
        doSwitch(List.of(1, 2, 3));
        doSwitch(List.of(null));

        var x = 1.0d;
        doSwitch(x);
    }

    private static void doSwitch(Object object) {
        switch (object) {
            // guarded pattern - type matching with condition
            case Employee employee when employee.getAge() > 30 ->
                    System.out.println("Employee: " + employee.getName() +"'s age is greater than 30");
            case Employee employee -> System.out.println("Employee: " + employee);
            case String string -> System.out.println("String: " + string);
            case Number number when number.intValue() < 0 -> System.out.println("Number: " + number);
            case Integer integer -> System.out.println("Integer: " + integer);
            case Address (Integer doorNum, String street) when doorNum < 1 ->
                    System.out.println("Address: " + street + " and Door number " + doorNum + " is invalid");
            case Address address -> System.out.println("Address: " + address);
            case List<?> list when list.stream().allMatch( item -> item instanceof String) ->
                    System.out.println("List<String>: " + list);
            case List<?> list -> System.out.println("List: " + list);
            case null -> System.out.println("Null");
            default -> System.out.println("Unknown object");
        }
    }
}
