package lesson_10_01;

public abstract class Employee {

    private String name;

    public Employee() {
    }

    public abstract int getSalary(); // abstract -> method truu tuong

    public abstract int getSupportSalary();
}
