package lesson_08;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public int totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee fte = new FTE();
        Employee contractor = new Contractor();

        System.out.println(new EmployeeController().totalSalary(Arrays.asList(fte, contractor)));
    }
}
