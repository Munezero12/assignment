public class AverageCalculator {

    public static void main(String[] args) {

   

        int[] numbers = {10, 12, 34, 23, 56, 78};

       

       

        int sum = 0;

        for (int number : numbers) {

            sum += number;

        }


       

        double average = (double) sum / numbers.length;


     

        System.out.println("The average of the array elements is: " + average);

    }

}