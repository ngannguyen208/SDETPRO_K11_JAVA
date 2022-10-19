package lesson_12;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee teo = new Employee();
        Employee ty = new Employee();
        Employee tun = new Employee();
        teo.setSalary(20);
        ty.setSalary(30);
        tun.setSalary(15);

        teo.setAge(20);
        ty.setAge(18);
        tun.setAge(30);

        teo.setName("Teo");
        ty.setName("Ty");
        tun.setName("Tun");

        List<Employee> employeeList = Arrays.asList(teo, ty, tun);

        // SORT BY SALARY
        System.out.println("BEFORE SORTING");
        System.out.println(employeeList);

        System.out.println("AFTER SORTING");
        Collections.sort(employeeList);

        System.out.println("SORT BY SALARY");
        System.out.println(employeeList);

        System.out.println("SORT BY AGE");
        employeeList.sort(new EmployeeAgeComparator());
        System.out.println(employeeList);

        System.out.println("SORT BY NAME");
        employeeList.sort(new EmployeeNameComperator());
        System.out.println(employeeList);

    }
}
