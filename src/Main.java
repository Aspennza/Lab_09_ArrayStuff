import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final int ARRAY_LENGTH = 100;
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int userValue = 0;
        boolean foundUserValue1 = false;
        boolean foundUserValue2 = false;
        int userValueCounter = 0;
        int minimum = 0;
        int maximum = 0;

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
        userValue = SafeInput.getRangedInt(in, "Please input a number to search for in the dataPoints array", 1, 100);

        //Task 6
        for(int y = 0; y < dataPoints.length; y++)
        {
            if(dataPoints[y] == userValue)
            {
                foundUserValue1 = true;
                userValueCounter++;
                System.out.println("\nYour value of " + userValue + " was found at index " + y + ".");
            }
        }
        if(!foundUserValue1)
        {
            System.out.println("\nYour value of " + userValue + " was not found in the data set.");
        }
        System.out.println("\nYour value of " + userValue + " was found " + userValueCounter + " times.");

        //Task 7
        userValue = SafeInput.getRangedInt(in, "Please input another number to search for in the dataPoints array", 1, 100);

        for(int z = 0; z < dataPoints.length; z++)
        {
            if(dataPoints[z] == userValue)
            {
                foundUserValue2 = true;
                System.out.println("\nYour value of " + userValue + " was found at index " + z + ".");
                break;
            }
        }
        if(!foundUserValue2)
        {
            System.out.println("\nYour value of " + userValue + " was not found in the data set.");
        }

        //Task 8
        minimum = dataPoints[0];
        maximum = dataPoints[0];

        for(int a = 0; a < dataPoints.length; a++)
        {
            if(minimum > dataPoints[a])
            {
                minimum = dataPoints[a];
            }

            if(maximum < dataPoints[a])
            {
                maximum = dataPoints[a];
            }
        }
        System.out.println("\nThe minimum value in the random array dataPoints is " + minimum + ".");
        System.out.println("\nThe maximum value in the random array dataPoints is " + maximum + ".");
    }



}