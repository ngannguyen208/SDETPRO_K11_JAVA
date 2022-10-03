package lab_08.lab_08_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        EmployeeController employeeController = new EmployeeController();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number of employees FTE: ");
        int numberFte = scanner.nextInt();
        System.out.print("Please input number of employee Contractor: ");
        int numberContractor = scanner.nextInt();

        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < numberFte; i++) {
            employeeList.add(fte);
        }
        for (int i = 0; i < numberContractor; i++) {
            employeeList.add(contractor);
        }
        int totalMonthlySalary = employeeController.totalSalary(employeeList);


        System.out.println("Total monthly Employee Salary is: " + totalMonthlySalary);

    }
}
