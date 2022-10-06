package lesson_09;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        ageValidator(age);
        this.name = name;
        this.age = age;
    }

    // Service method
    public void setAge(int age) {
        ageValidator(age);
        this.age = age;
    }

    // Support method
    private void ageValidator(int age) {
        if (age < 0) {
            System.out.println("Age can't be negative number");
        }
    }
}
