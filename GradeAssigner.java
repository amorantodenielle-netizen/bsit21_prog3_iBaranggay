import java.util.Scanner;

public class GradeAssigner {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your numerical score (0-100): ");
        int score = input.nextInt();
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 90) {
            grade = 'B';
        } else if (score >= 70 && score <= 80) {
            grade = 'C';
        } else if (score >= 60 && score <= 70) {
            grade = 'D';
        } else if (score >= 0 && score <= 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
            input.close();
            return;
        }

        System.out.println("Your grade is: " + grade);
        input.close();
    }
}