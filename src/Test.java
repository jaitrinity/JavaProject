package src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,200));
        empList.add(new Employee(2,100));
        empList.add(new Employee(3,50));
        empList.add(new Employee(4,250));
        empList.add(new Employee(5,300));
        empList.add(new Employee(6,350));
        empList.add(new Employee(7,1000));
        empList.add(new Employee(8,900));
        empList.add(new Employee(9,800));
        empList.add(new Employee(10,700));

        List<Employee> collect = empList
                .stream()
                .sorted((a, b) -> (int) (b.getSalary() - a.getSalary()))
//                .skip(3)
                .collect(Collectors.toList());

        System.out.println(collect);

        int sum = empList
                .stream()
                .sorted((a, b) -> (int) (b.getSalary() - a.getSalary()))
                .mapToInt(e -> (int) e.getSalary())
                .sum();
        System.out.println("--");
        System.out.println(sum);
        System.out.println("--");
        empList.forEach((e)-> System.out.println(e.getId()));
        System.out.println("--");
        empList
                .stream()
                .filter((e)-> e.getSalary() > 100)
                .forEach(e -> System.out.println(e.getSalary()));
    }
}
