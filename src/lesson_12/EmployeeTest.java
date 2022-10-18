package lesson_12;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee teo = new Employee();
        Employee ty = new Employee();
        Employee tun = new Employee();
        teo.setSalary(20);
        ty.setSalary(30);
        tun.setSalary(15);

        List<Employee> employeeList = Arrays.asList(teo, ty, tun);

        System.out.println(employeeList);


    }
}
