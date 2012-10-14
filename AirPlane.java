import java.util.*;

public class AirPlane {
	
	public class flyingVehicle{
		int sum = 0;
		int[][] seats = new int[27][6];
		fillingComputer Filler = new fillingComputer();
		public void add_seats(){
			for(int i=0; sum<162; i++){
				int rvalue = new Random().nextInt(Filler.al_c) + 1;//al_c -> highest case allowed, every lower case than the current highest case is allowed by default)
				seat_case(rvalue);
			}
		}
	}


	public class fillingRobot{
			int cRow = 0;
			int al_c;
			int num = 3;//num == rvalue/num of case
			boolean iftrue = false;
			
			case_system(int num){
				switch(num){
					case 1: case1(0);
					break;
					case 2: case2(0);
					break;
					case 3: case3(0);
					break;
					case 999: System.out.println("No more free seats.");
					break;
				}
			}

			case1(){
				for( int i=0; i<=5; i=i+3 ){
					if (seats[cRow][i]+seats[cRow][i+2]=0){
						seats[cRow][i] = 1;
						seats[cRow][i+1] = 1;
						seats[cRow][i+2] = 1;
						iftrue = true;
						break;
						} else {
						continue;
						}
					}
					if ( iftrue == false ){
						if ( cRow == 27  ){
						al_c = 2;
						} else {
						cRow = cRow + 1;
						seats[cRow][0] = 1;		
						seats[cRow][1] = 1;
						seats[cRow][2] = 1;
						}
				}

			case2(){
				for ( int i=0; i<=5; i=i+1 ){
					if(i==2) continue;
					if(seats[cRow][i]+seats[cRow][i+1] == 0){
						seats[cRow][i] = 1;
						seats[cRow][i+1] = 1;
						iftrue = true;
						}
					if ( iftrue == false ){
						if ( cRow == 27  ){
						al_c = 1;
						} else {
						cRow = cRow + 1;
						seats[cRow][0] = 1;
						seats[cRow][1] = 1;
						}
			}

			case3(){
				for( int i=0; i<=5; i=i+1 ){
					if ((seats[cRow][i]) == 0){
						seats[cRow][i] = 1)
						iftrue = true;
						}
					}
					if ( iftrue==false ){
						if ( cRow == 27  ){
						al_c = 999;
						} else {
						cRow = cRow+1;
						seats[cRow][0] = 1;
						}

			}
		}
		
				

	
public static void main(String[] args) {
		AirPlane plane = new AirPlane();
		}




}


// BEWARE THRASH/UNUSED CODE BELOW!

	/*public void seat_case(num){//num == rvalue/num of case
			switch(num){
				case 1:	seats[cRow][apc.c1_c] = 1;
					seats[cRow][apc.c1_c+1] = 1;	
					seats[cRow][apc.c1_c+2] = 1;
					if( apc.c_r
					break;

				case 2: seats[apc.c2_r][apc.c2_c] = 1;
					seats[apc.c2_r][apc.c2_c+1] = 1;
					break;

				case 3: seats[apc.c3_r][apc.c3_c] = 1;
					break
				}
			}	


*/ 
