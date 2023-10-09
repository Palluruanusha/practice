package com.practice.pack1;

/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BusTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define fare and number of stops
        int costPerStop = 5;
        int numStops = 5;

        // Create a HashMap to store the counts of passengers by category
        Map<String, Integer> passengerCounts = new HashMap<>();
        passengerCounts.put("women", 0);
        passengerCounts.put("kids", 0);
        passengerCounts.put("men", 0);

        // Get user input for number of women, kids, and men
        System.out.print("Enter the number of women on the bus: ");
        passengerCounts.put("women", scanner.nextInt());
        System.out.print("Enter the number of kids (under 5 years old) on the bus: ");
        passengerCounts.put("kids", scanner.nextInt());
        System.out.print("Enter the number of men on the bus: ");
        passengerCounts.put("men", scanner.nextInt());

        // Calculate fare for women (assuming free for women)
        int womenCost = passengerCounts.get("women") * costPerStop * numStops;

        // Calculate fare for kids (assuming free for kids under 5 years old)
        int kidsCost = passengerCounts.get("kids") * costPerStop * numStops;

        // Calculate fare for men
        int menCost = passengerCounts.get("men") * costPerStop * numStops;
        // Calculate total fare
        int totalCost = womenCost + kidsCost + menCost;

        // Print total fare
        System.out.println("Total cost for the journey: " + totalCost + " rupees");

        // Close the scanner
        scanner.close();
    }
}
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BusTicket{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define fare and number of stops
        int farePerStop = 5;
        int numStops = 5;

        // Create a HashMap to store the counts of passengers by category
        Map<String, Integer> passengerCounts = new HashMap<>();
        passengerCounts.put("women", 0);
        passengerCounts.put("kidsUnder5", 0);
        passengerCounts.put("kids5to10", 0);
        passengerCounts.put("kidsAbove10", 0);
        passengerCounts.put("men", 0);

        // Create an ArrayList to store ages of children
        ArrayList<Integer> childAges = new ArrayList<>();

        // Get user input for number of women, kids, and men
        System.out.print("Enter the number of women on the bus: ");
        passengerCounts.put("women", scanner.nextInt());

        System.out.print("Enter the number of kids (under 5 years old) on the bus: ");
        passengerCounts.put("kidsUnder5", scanner.nextInt());

        System.out.print("Enter the number of kids (5 to 10 years old) on the bus: ");
        passengerCounts.put("kids5to10", scanner.nextInt());

        System.out.print("Enter the number of kids (above 10 years old) on the bus: ");
        passengerCounts.put("kidsAbove10", scanner.nextInt());

        System.out.print("Enter the number of men on the bus: ");
        passengerCounts.put("men", scanner.nextInt());

        // Get ages of children
        for (int i = 0; i < passengerCounts.get("kids5to10") + passengerCounts.get("kidsAbove10"); i++) {
            System.out.print("Enter the age of child " + (i+1) + ": ");
            int age = scanner.nextInt();
            childAges.add(age);
        }

        // Calculate fare for women (assuming free for women)
        int womenFare = passengerCounts.get("women");//* farePerStop * numStops;

        // Calculate fare for kids under 5 (assuming free for kids under 5 years old)
        int kidsUnder5Fare = passengerCounts.get("kidsUnder5")* farePerStop * numStops;

        // Calculate fare for kids 5 to 10 (half ticket)
        int kids5to10Fare = 0;
        for (int age : childAges) {
            if (age >= 5 && age <= 10) {
                kids5to10Fare += farePerStop * numStops / 2;
            }
        }

        // Calculate fare for kids above 10 (full ticket)
        int kidsAbove10Fare = passengerCounts.get("kidsAbove10") * farePerStop * numStops;

        // Calculate fare for men
        int menFare = passengerCounts.get("men") * farePerStop * numStops;

        // Calculate total fare a
        int totalFare = womenFare + kidsUnder5Fare + kids5to10Fare + kidsAbove10Fare + menFare;

        // Print total fare
        System.out.println("Total fare for the journey: " + totalFare + " rupees");

        // Close the scanner
        scanner.close();
    }
}
