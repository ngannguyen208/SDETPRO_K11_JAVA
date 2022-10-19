package lesson_12;

import java.util.Comparator;

public class EmployeeNameComperator implements Comparator<Employee> {

    @Override
    public int compare(Employee thisEmp, Employee thatEmp) {
        return thisEmp.getName().compareToIgnoreCase(thatEmp.getName());
    }
}
