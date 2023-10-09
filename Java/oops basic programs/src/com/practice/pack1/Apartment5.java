package com.practice.pack1;
/*import java.util.*;
public class Apartment5 {
    static List<String> initializeBlocks() {
        return new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"));
    }

    static List<String> sortBlocksByFloor(List<String> blocks, int numFloors) {
        List<String> sortedBlocks = new ArrayList<>();
        for (int floor = 0; floor < numFloors; floor++) {
            for (String block : blocks) {
          
            	if (block.charAt(0) == 'A' + floor) {
                 
                    sortedBlocks.add(block);
                }
            }
        }
        return sortedBlocks;
    }

    static Map<String, List<String>> generateApartmentList(List<String> blocks, int numFloors, int numHouses) {
        Map<String, List<String>> apartmentList = new HashMap<>();
        int flatNumber = 1;
        for (String block : blocks) {
            List<String> blockHouses = new ArrayList<>();
            for (int floor = 1; floor <= numFloors; floor++) {
                for (int house = 0; house < numHouses; house++) {
                    String flatNumberValue = block + "" + house + String.format("%02d", flatNumber);
                    blockHouses.add(flatNumberValue);
                }
                flatNumber++;
            }
            apartmentList.put(block, blockHouses);
        }

        return apartmentList;
    }


        static void displayHousesInBlock(Map<String, List<String>> apartmentList, String blockInput) {
        if (apartmentList.containsKey(blockInput)) {
            List<String> housesInBlock = apartmentList.get(blockInput);
            System.out.println("Houses in Block " + blockInput + ": " + housesInBlock);
        } else {
            System.out.println("Invalid block input please enter a valid block (A-K)");
        }
    }

    static void displayHousesOnFloor(Map<String, List<String>> apartmentList, int floorInput) {
     
    	for (Map.Entry<String, List<String>> entry : apartmentList.entrySet()) {
            String block = entry.getKey();
            List<String> houses = entry.getValue();

            List<String> housesOnFloor = new ArrayList<>();
            for (String house : houses) {
                int houseFloor = Integer.parseInt(house.substring(1, 2));
                if (houseFloor == floorInput) {
                    housesOnFloor.add(house);
}
            }

            System.out.println("Houses on Floor " + floorInput + " in Block " + block + ": " + housesOnFloor);
       }
    }

    public static void main(String[] args) {
        List<String> blocks = initializeBlocks();
        int numFloors = 5;
        int numHouses = 5;

        List<String> sortedBlocks = sortBlocksByFloor(blocks, numFloors);

        Map<String, List<String>> apartmentList = generateApartmentList(sortedBlocks, numFloors, numHouses);

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the floor (0-4): ");
        int floorInput = scn.nextInt();

        displayHousesOnFloor(apartmentList, floorInput);
    }
}*/

import java.util.*;

public class Apartment5 {
    // (previous code...)
    static List<String> initializeBlocks() {
        return new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"));
    }

    static List<String> sortBlocksByFloor(List<String> blocks, int numFloors) {
        List<String> sortedBlocks = new ArrayList<>();
        for (int floor = 0; floor < numFloors; floor++) {
            for (String block : blocks) {
          
            	
            	if (block.charAt(0) == 'A' + floor) {
                    sortedBlocks.add(block);
                }
            }
        }
        return sortedBlocks;
    }

    static Map<String, List<String>> generateApartmentList(List<String> blocks, int numFloors, int numHouses) {
        Map<String, List<String>> apartmentList = new HashMap<>();
        int flatNumber = 1;
        for (String block : blocks) {
            List<String> blockHouses = new ArrayList<>();
            for (int floor = 1; floor <= numFloors; floor++) {
                for (int house = 0; house < numHouses; house++) {
                    String flatNumberValue = block + "" + house + String.format("%02d", flatNumber);
                    blockHouses.add(flatNumberValue);
                }
                flatNumber++;
            }
            apartmentList.put(block, blockHouses);
        }

        return apartmentList;
    }
    static void displayHousesInBlock(Map<String, List<String>> apartmentList, String blockInput) {
        if (apartmentList.containsKey(blockInput)) {
            List<String> housesInBlock = apartmentList.get(blockInput);
            System.out.println("Houses in Block " + blockInput + ": " + housesInBlock);
        } else {
            System.out.println("Invalid block input please enter a valid block (A-K)");
        }
    }
    
    static void displayHousesInSelectedBlock(Map<String, List<String>> apartmentList) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the block (A-K): ");
        String blockInput = scn.nextLine();
        displayHousesInBlock(apartmentList, blockInput);
    }

    public static void main(String[] args) {
        List<String> blocks = initializeBlocks();
        int numFloors = 5;
        int numHouses = 5;

        List<String> sortedBlocks = sortBlocksByFloor(blocks, numFloors);

        Map<String, List<String>> apartmentList = generateApartmentList(sortedBlocks, numFloors, numHouses);

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the floor (0-4): ");
        int floorInput = scn.nextInt();

        displayHousesOnFloor(apartmentList, floorInput);

        displayHousesInSelectedBlock(apartmentList);
    }

	private static void displayHousesOnFloor(Map<String, List<String>> apartmentList, int floorInput) {
		// TODO Auto-generated method stub
		
	}
}