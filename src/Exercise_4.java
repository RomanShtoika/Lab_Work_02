import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();
        double result;

        if (x <= -2.5) {
            result = Math.exp(-x);
        } else if (-2.5 < x && x <= 0) {
            result = Math.cbrt(2 + x / (3 - Math.pow(x, 2)));
        } else {
            result = Math.exp(Math.sin(x)) - Math.cos(Math.pow(x, 3));
        }

        System.out.println("f(x) = " + result);
    }
}
