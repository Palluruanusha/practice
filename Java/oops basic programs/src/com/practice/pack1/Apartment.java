//print apartment houses blocks including floors
package com.practice.pack1;
import java.util.*;
public class Apartment {

    public static void main(String[] args) {
        // Define the blocks
    	List<String> blocks = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"));
       //or this--> //String[] blocks = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};

        // Define the floors and houses
        int numFloors = 5;
        int numHouses = 5;

        // Create a list to store house numbers
        Map<String, List<String>> apartmentList = new HashMap<>();
        int flatNumber = 1;
        // Populate the list
        for (String block : blocks) {
        	List<String> blockHouses =new ArrayList<>();
            for (int floor = 1; floor < numFloors; floor++) {
                for (int house = 0; house < numHouses; house++) {
                	String flatNumberValue= block+""+house+String.format("%02d", flatNumber);
                    blockHouses.add(flatNumberValue);
                }
                flatNumber++;
                apartmentList.put(block, blockHouses);
            }

        }

        System.out.println(apartmentList);
        
    }
    }

