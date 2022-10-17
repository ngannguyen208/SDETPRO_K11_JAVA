package lesson_11_interface;

// Provide ability for Irrelevant objects/classes
public interface MoveAble {

    void move();

    default void abc() {

    }

    static void doSth() {

    }
}
