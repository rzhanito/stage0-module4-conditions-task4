package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        first > second ? System.out.println(first) : first < second ? System.out.println(second) : System.out.println(first);
    }
}
