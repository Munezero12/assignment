mport java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your grade (A, B, C, D, F): ");

        char grade = scanner.next().charAt(0);


        switch (grade) {

            case 'A':

                System.out.println("Excellent!");

                break;

            case 'B':

                System.out.println("Well done!");

                break;

            case 'C':

                System.out.println("Good job!");

                break;

            case 'D':

                System.out.println("You passed.");

                break;

            case 'F':

                System.out.println("Better luck next time.");

                break;

            default:

                System.out.println("Invalid grade entered.");

                break;

        }


        scanner.close();

    }

}