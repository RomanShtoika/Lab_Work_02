import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x: ");
        double x = input.nextDouble();
        System.out.print("Enter the y: ");
        double y = input.nextDouble();

        int quadrant;

        if (x == 0 || y == 0) {
            quadrant = 0;
        } else if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else {
            quadrant = 4;
        }

        System.out.println("A point with given coordinates " + quadrant);
    }
}