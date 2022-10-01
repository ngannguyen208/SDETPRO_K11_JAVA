package lab_07;

import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {
        FTE fte = new FTE();
        Contractors contractors = new Contractors();
        int numFTE, numContractor;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number employees of FTE: ");
        numFTE = scanner.nextInt();
        System.out.print("Please enter number employees of Contractor: ");
        numContractor = scanner.nextInt();

        int totalSalaryFTE = numFTE * fte.Salary();
        int totalSalaryContructor = numContractor * contractors.Salary();

        int totalEmpoyeeSalary = totalSalaryContructor + totalSalaryFTE;

        System.out.println("Total FTE Salary: " + totalSalaryFTE);
        System.out.println("Total Contructors Salary: " + totalSalaryContructor);
        System.out.println("Total Employee Salary: " + totalEmpoyeeSalary);
    }

}
