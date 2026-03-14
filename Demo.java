import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {

    private String name;
    private double salary;
    private int age;
    private String department;

    public Employee(String name, double salary, int age, String department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return name + " " + salary + " " + age + " " + department;
    }
}
public class Demo {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
        new Employee("Amit", 60000, 28, "IT"),
        new Employee("Rahul", 80000, 35, "Finance"),
        new Employee("Sneha", 75000, 30, "IT"),
        new Employee("Priya", 50000, 25, "HR"),
        new Employee("Rohit", 90000, 40, "Finance"),
        new Employee("Ankit", 45000, 24, "HR")
);

Map<String, Long> map =
        employees.stream()
        .map(Employee::getDepartment)
        .collect(Collectors.groupingBy(
                dept -> dept,
                Collectors.counting()
        ));

    String s = "asakasajjadi";


    List<Character> lst = s.chars().mapToObj(c -> (char)c)
    .filter(e -> s.indexOf(e) != s.lastIndexOf(e))
    .distinct()
    .peek(e -> System.out.println(e))
    .collect(Collectors.toList());
    // s.chars()
    // .mapToObj(c -> (char)c)
    // .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
    // .entrySet().stream()
    // .filter(e -> e.getValue()>1)
    // .map(e -> e.getKey())
    // .peek(e ->System.out.println(e))
    // .collect(Collectors.toList());



    // String lst = s.chars().mapToObj(e -> (char)e)
    // .filter(e-> e != 'a')
    // .map(String:: valueOf)
    // .sorted(Comparator.reverseOrder())
    // .reduce(" ",(a,b) -> (b+a));

    //     System.out.println(lst);
    }
}
