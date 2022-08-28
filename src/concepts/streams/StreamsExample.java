package concepts.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {
        Employee[] arrEmps = {
                new Employee(1, "Tom", 100),
                new Employee(2, "Dick", 200),
                new Employee(3, "Harry", 300)
        };

        //List of Employees
        List<Employee> emps = Arrays.asList(arrEmps);
        emps.stream().forEach(emp -> emp.incrementSalary(10));
    }
}
