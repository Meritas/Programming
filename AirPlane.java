import java.util.*;

public class AirPlane {


	/*public void printSeats() {
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

	} Neshto me drazni ta she go ocvetq v sinio da go ignore-vam po-lesno*/
	

	public void flyingVehicle(){
		int[][] seats = new int[27][6];
		pointer apc; //AirPlanePointer
		
		public void add_seats(){
			for(int i=0; sum<162; i++){
				 int rvalue = new Random().nextInt(al_c) + 1;//al_c -> highest case allowed, every lower case than the current highest case is allowed by default)
				 seat_case(rvalue);
				 }


	public void seat_case(num){//num == rvalue/num of case
			switch(num){
				case 1:	seats[apc.c1_r][apc.c1_c] = 1;
					seats[apc.c1_r][apc.c1_c+1] = 1;	
					seats[apc.c1_r][apc.c1_c+2] = 1;
					break;

					case 2: seats[apc.c2_r][apc.c2_c] = 1;
						seats[apc.c2_r][apc.c2_c+1] = 1;
					break;

					case 3: seats[apc.c3_r][apc.c3_c] = 1;
					break
					}
			}	


public class pointer(){
		int c1_r = 0; //row 1 row
		int c1_c = 0; //row 1 column
		int c2_r = 0;
		int c2_c = 0;
		int c3_r = 0;
		int c3_c = 0;
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
