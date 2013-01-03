package main;

import java.util.Random;

public class AirPlane {
	private Human seats[][] = new Human[27][6];
	private int sum = 0;
	private int minRow = 0;
	private int maxRow = 26;
	private int[] sLines = new int[2];
	private int gSize = 3;
	
	AirPlane() {
		sLines[1] = 3;
		sLines[2] = 3;
	}
	
	public void add(int gSize) {
		for ( int minRowT = minRow; minRowT <= maxRow; minRowT++) {
			
			int pointer = 0 - sLines[0];
			for (int i = 0; i <= sLines.length-1; i++) {
				pointer += sLines[i];
				if (gSize > sLines[i]) {
					pointer += sLines[i];
				}
			}
			
			Random addRand = new Random();
			int genderRand = addRand.nextInt(2);
			
		
		
	}
}
