package week1day5.P1StreamAPI;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P1StreamAPITest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 50000);
        Employee employee2 = new Employee("Bob", 60000);
        Employee employee3 = new Employee("Cathy", 70000);
        Employee employee4 = new Employee("David", 80000);
        Employee employee5 = new Employee("Emily", 90000);
        Employee employee6 = new Employee("Frank", 100000);
        List<Employee> employees = new LinkedList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        double avgSalary = employees.parallelStream()
                .mapToDouble(employee -> employee.getSalary())
                .average()
                .orElse(0.0);
        System.out.println("1. Average salary is: " + avgSalary);
        System.out.println();
        System.out.println("2. Employees Whose Salary Exceeds 80000: ");
        employees.parallelStream()
                .filter(employee -> employee.getSalary() > 80000)
                .map(employee -> employee.getName())
                .forEach(name -> System.out.println(name));
        System.out.println();
        Map<String, Employee> employeeMap = employees.parallelStream()
                .collect(Collectors.toMap(employee -> employee.getName(), Function.identity()));
        System.out.println("3. A Map of employees. Key: name. Value: Employee object");
        System.out.println(employeeMap);
        System.out.println();
        System.out.println("4. Find any Employee whose name starts with the character X, or print “no such employee exists”");
        employees.stream()
                .filter(employee -> employee.getName().startsWith("X"))
                .findAny()
                .map(employee -> {
                    System.out.println(employee.getName());
                    return employee.getName();
                })
                .orElseGet(() -> {
                    System.out.println("No such employee exists.");
                    return null;
                });
        System.out.println();
        System.out.println("5. String that contains the name of every single employee in the list concatenated together");
        String concatenatedNames = employees.parallelStream()
                .map(employee -> employee.getName())
                .collect(Collectors.joining());
        System.out.println(concatenatedNames);
    }
}
