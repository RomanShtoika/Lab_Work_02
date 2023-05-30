import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Обчислити добуток двох чисел");
            System.out.println("2. Обчислити суму двох чисел");
            System.out.println("3. Обчислити різницю двох чисел");
            System.out.println("0. Вийти з програми");
            System.out.print("Виберіть опцію: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    multiplyNumbers();
                    break;
                case 2:
                    addNumbers();
                    break;
                case 3:
                    subtractNumbers();
                    break;
                case 0:
                    System.out.println("Програма завершується...");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
                    break;
            }
        } while (choice != 0);
    }

    public static void multiplyNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Добуток двох чисел: " + result);
        System.out.println();
    }

    public static void addNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Сума двох чисел: " + result);
        System.out.println();
    }

    public static void subtractNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Різниця двох чисел: " + result);
        System.out.println();
    }
}
