/*
Write a Java program that takes an array of integers representing points and an integer numOfPoints. The program should find the maximum average among all subarrays of length numOfPoints in the given array.
 */
public class MaxAverageProblem {
    public static void main(String[] args) {
        // Test
        int[] points = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int numOfPoints = 2;
        double maxAverage = findMaxAverage(points, numOfPoints);
        System.out.println("The maximum average is: " + maxAverage);
    }
    public static int findMaxAverage(int[] points, int numOfPoints) {
        // Calculate the initial sum of the first subarray
        int sum = 0;
        for (int i = 0; i < numOfPoints; i++) {
            sum += points[i];
        }
        // Initialize maxAverage with the initial sum
        int maxAverage = sum;

        // Iterate through the remaining array to find the maximum average
        for (int i = numOfPoints; i < points.length; i++) {
            // Update the sum by subtracting the first element of the previous subarray and adding the next element
            sum += points[i] - points[i - numOfPoints];

            // Calculate the average of the current subarray
            int currentAverage = sum / numOfPoints;

            // Update maxAverage if the current average is greater
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
            }
        }
        // Return the maximum average
        return maxAverage;
    } // end of method

}
