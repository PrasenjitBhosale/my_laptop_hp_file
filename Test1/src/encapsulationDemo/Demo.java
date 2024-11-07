package encapsulationDemo;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Employee> sets = new HashSet<>();


        Employee emp1 = new Employee("John", 101, 50000, 30, 5);
        Employee emp2 = new Employee("Alice", 102, 60000, 35, 8);
        Employee emp3 = new Employee("Bob", 103, 55000, 32, 6);

        // Add employees to the set
        sets.add(emp1);
        sets.add(emp2);
        sets.add(emp3);


        System.out.println("No. of employees: " + sets.size());


        System.out.println("Employee Info:");
        for (Employee emp : sets) {
            System.out.println("Name: " + emp.getName());
            System.out.println("Employee ID: " + emp.getEid());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Age: " + emp.getAge());
            System.out.println("Experience: " + emp.getExperience());
            System.out.println();
        }

    }
}
