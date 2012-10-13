import java.util.*;

public class AirPlane {


	public void printSeats() {
		int[][] seats = new int[6][27];
		for (int r=0;r<=26;r++) {
			for(int c=0;c<=5;c++) {
				System.out.print(seats[c][r]+ " ");
				if (c==2){
					System.out.print(" ");
					}
				}
		System.out.println(" ");
		}

	}


	public static void main(String[] args) {
		AirPlane plane = new AirPlane();
		plane.printSeats();
		int sum=0;
		for (int i=0;sum<162;i++) {
			int rvalue = new Random().nextInt(3) +1;
			if (sum+rvalue<=162) {
				sum+=rvalue;
				}
			}
		System.out.println(sum);

		}
	}
