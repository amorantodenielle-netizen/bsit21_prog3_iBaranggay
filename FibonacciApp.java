import java.util.Scanner;

public class FibonacciApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter range (how many numbers to display): ");
        int range = input.nextInt();

        int second = first;
        System.out.print("Fibonacci Sequence: " + first + " " + second + " ");

        for (int i = 2; i < range; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        input.close();
    }
}
