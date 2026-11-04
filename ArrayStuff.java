import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {
    static void main() {
        int[] dataPoints = new int[100];
        int total = 0;
        double avg;
        int count = 0;

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int userInput = SafeInput.getRangedInt(in, "Input a number between 1 and 100", 1,100);

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
            total =  total + dataPoints[i];
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                count++;
            }
        }
        System.out.println();
        avg = total / dataPoints.length;
        System.out.println();
        System.out.println("The total is: " + total + " and the average is: " + avg);
        if (count == 0) {
            System.out.println("Your number, " + userInput + ", did not appear in the array.");
        }
        else {
            System.out.println("Your number, " + userInput + ", appeared " + count + " times.");
        }

        int count2 = 0;
        int userInput2 = SafeInput.getRangedInt(in, "Input a number between 1 and 100", 1,100);
        for (int i = 0; i < dataPoints.length; i++) {

            count2 = count2 + 1;
            if (dataPoints[i] == userInput2) {
                break;
            }
        }
        count2 = count2 - 1;
        System.out.println("Your number was found at index position: " + count2);

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("The max value is: " + max);
        System.out.println("The min value is: " + min);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[]){
        double total = 0;
        double avg = 0;

        for (int i = 0; i < values.length; i++) {
            total = total + values[i];
            avg = total / i;
        }
        return avg;
    }
}
