public sealed class Employee extends Person permits TeamLead{
    private final String name;
    private final int age;
    private final Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", address=" + address + '}';
    }

    public String getAddress() {
        return this.address.toString();
    }
}
