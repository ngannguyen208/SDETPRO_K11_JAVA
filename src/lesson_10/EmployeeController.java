package lesson_10;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public int totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            /*
            * if employee is FTE -> casting employee -> FTE -> getSupportSalary

            if (employee instanceof FTE) {
                // Casting | NOT recommend to use
                FTE fte = (FTE) employee;
                int supportMoney = fte.getSupportSalary();
                totalSalary = totalSalary + employee.getSalary() + supportMoney;
            } else {
                totalSalary += employee.getSalary();
            } */

            totalSalary += employee.getSalary() + employee.getSupportSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee fte = new FTE();
        Employee contractor = new Contractor();

        System.out.println(new EmployeeController().totalSalary(Arrays.asList(fte, contractor)));
    }
}
