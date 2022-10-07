package lesson_10_01;

public class FTE extends Employee {
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public int getSupportSalary() {
        return 5000;
    }
}
