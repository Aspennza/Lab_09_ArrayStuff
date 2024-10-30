import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        final int ARRAY_LENGTH = 100;
        Random rnd = new Random();
        int sum = 0;
        double avg = 0;

        //Task 1
        int[] dataPoints = new int[ARRAY_LENGTH];

        //Task 2
        for(int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }

        //Task 3
        for(int x = 0; x < dataPoints.length; x++)
        {
            System.out.print("" + dataPoints[x] + " | ");
        }

        //Task 4
        for(int i = 0; i < dataPoints.length; i++)
        {
            sum = sum + dataPoints[i];
            avg = (double) sum / dataPoints.length;
        }
        System.out.println("\n\nThe sum of the data in the random array dataPoints is: " + sum + ".");
        System.out.println("The average of the data in the random array dataPoints is: " + avg + ".");

        //Task 5

    }
}