package com.patterns.pack;

public class Numpatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		for(int i=1;i<=size;i++) {
				if(i%2!=0) {
					for(int j=1;j<=size;j++) {
						System.out.print(j);
					
				}
				}
					else {
						for(int j=size;j>=1;j--) {
							System.out.print(j);
						}
					}
					System.out.println();
			}
		}

	}

