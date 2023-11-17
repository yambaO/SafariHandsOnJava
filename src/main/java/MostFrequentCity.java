import java.util.HashMap;
import java.util.Map;

/*
Write a Java program that takes an array of strings, where each string represents a city name. The program should find the most frequent city in the array. If two or more cities have the same highest frequency, the program should return the city that comes first in alphabetical order.
*
 */
public class MostFrequentCity {
    public static void main(String[] args) { String[] cities = {"New York", "Boston", "New York", "Chicago", "Boston", "Chicago", "Boston", "Chicago"};
        String mostFrequentCity = findMostFrequentCity(cities);
        System.out.println("The most frequent city is: " + mostFrequentCity);

    }
    public static String findMostFrequentCity(String[] cities) {
        // Create a HashMap to store the frequency of each city
        Map<String, Integer> frequencyMap = new HashMap<>();
        // Loop through the array and count the occurrences of each city
        for (String city : cities) {
            frequencyMap.put(city, frequencyMap.getOrDefault(city, 0) + 1);
        }
        // Find the most frequent city and the one that comes first in alphabet
        String mostFrequentCity = "";
        int maxFrequency = 0;
        for (String city : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(city);

            // Check if the current city has a higher frequency
            // or if it has the same frequency but comes first in alphabet
            if (frequency > maxFrequency || (frequency == maxFrequency && city.compareTo(mostFrequentCity) < 0)) {
                maxFrequency = frequency;
                mostFrequentCity = city;
            }
        }

        return mostFrequentCity;
    }
}
