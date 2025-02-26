import java.util.Scanner;

public class Calc {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number to add:");
        int a = sc.nextInt();

        System.out.println("Second number to add:");
        int b = sc.nextInt();

        System.out.println(add(a, b));
    }
}