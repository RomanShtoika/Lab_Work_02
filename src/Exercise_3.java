import java.util.Scanner;
public class Exercise_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int number = input.nextInt();

        boolean isTwoDigit = (number >= 10 && number <= 99);
        boolean isEven = (number % 2 == 0);

        if (isTwoDigit) {
            if (isEven) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } else {
            System.out.println("The number is not two-digit.");
        }
    }
}
