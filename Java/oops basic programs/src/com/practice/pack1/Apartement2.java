//using scanner input print particular block with floors and houseNo
package com.practice.pack1;
import java.util.*;
public class Apartement2 {

    public static void main(String[] args) {
        // Define the blocks
        List<String> blocks = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"));

        // Define the floors and houses
        int numFloors = 5;
        int numHouses = 5;

        // Create a list to store house numbers
        Map<String, List<String>> apartmentList = new HashMap<>();
        int flatNumber = 1;
        // Populate the list
        for (String block : blocks) {
            List<String> blockHouses = new ArrayList<>();
            for (int floor = 1; floor <= numFloors; floor++) { // Changed condition to include the top floor
                for (int house = 0; house < numHouses; house++) {
                    String flatNumberValue = block + "" + house + String.format("%02d", flatNumber);
                    blockHouses.add(flatNumberValue);
                }
                flatNumber++;
            }
            apartmentList.put(block, blockHouses);
        }

        // Display all houses in a specific block
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the block (A-K): ");
        String blockInput = scn.next();

        if (blocks.contains(blockInput)) {
            List<String> housesInBlock = apartmentList.get(blockInput);
            System.out.println("Houses in Block " + blockInput + ": " + housesInBlock);
        } else {
            System.out.println("Invalid block input please enter a valid block (A-K)");
        }
    }
}
