package lesson_11_polymorphism;

public class EchTest {

    public static void main(String[] args) {

        // Polymorphism
        Ech trungEch = new TrungEch();
        trungEch = new NongNoc();
        trungEch = new EchCon();
    }
}
