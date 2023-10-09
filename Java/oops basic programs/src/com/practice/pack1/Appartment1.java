package com.practice.pack1;

	import java.util.HashMap;
	import java.util.Map;

	public class Appartment1 {
		public static void main(String[] args) {
			// Define block names
			char[] blocks = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
			// Create a map to store the block details
			Map<Character, String[]> blockDetails = new HashMap<>();
			int flatno = 1;
			for (char block : blocks) {
				String[] floors = new String[5];
				for (int i = 0; i < 5; i++) {//floors
	    	                String[] houses = new String[5];
	    	                
	    	                for (int j = 0; j < 5; j++) { //houses
	    	                	String flatNumber= block+""+j+String.format("%02d", flatno);
	    	                    houses[j] = flatNumber;//String.format("%c%03d", block, i * 100 + flatno + 1);
	    	                }
	    	                flatno++;

	    	                floors[i] = String.join(", ", houses);
	    	            }

	    	            blockDetails.put(block, floors);
	    	        }

	    	        // Print the details
	    	        for (char block : blocks) {
	    	            System.out.println("Block " + block + " details:");
	    	            String[] floors = blockDetails.get(block);

	    	            for (int i = 0; i < 5; i++) {
	    	                System.out.println("Floor " + (i + 1) + ": " + floors[i]);
	    	            }

	    	            System.out.println();
	    	        }
	    	    }
	    	}
