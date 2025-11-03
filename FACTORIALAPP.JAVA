import java.util.Scanner;

public class FactorialApp {

    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num < 0)
            System.out.println("Factorial is not defined for negative numbers.");
        else
            System.out.println("Factorial of " + num + " = " + factorial(num));

        input.close();
    }
}


