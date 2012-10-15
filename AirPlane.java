import java.util.*;
import java.util.Arrays;

public class AirPlane {

	public static void main(String[] args) {
		flyingVehicle plane = new flyingVehicle();
		plane.add_seats();
		
	}
}






	
		class flyingVehicle{
		int sum = 0;
		fillingComputer Filler = new fillingComputer();
		public void add_seats(){
			while(sum<162){
				int al_c2 = Filler.al_c;
				int rvalue = new Random().nextInt(Filler.al_c) + 1;//al_c -> highest case allowed, every lower case than the current highest case is allowed by default)
				if(sum+rvalue > 162) continue;
				if( Filler.al_c == 999 ){
					System.out.println("No more free seats.");
					break;
				}				
				sum = sum + rvalue;
				Filler.case_system(rvalue);
				if ( Filler.al_c != al_c2 ) sum = sum - rvalue;
				System.out.println(" ");
				System.out.println( rvalue + " passenger(s) enters the airplane." );
				print_seats();
			}

		}


		public void print_seats(){	
			System.out.println(" ");	
			for(int c=0;c<=26;c++) {
				for (int r=0;r<=5;r++) {
					System.out.print(Filler.seats[c][r]+ " ");
					if (r==2) System.out.print(" ");
					}
				System.out.println(" ");
				}
			}



	}


		class fillingComputer{
			int cRow = 0;
			int al_c = 3;
			int[][] seats = new int[27][6];
			
			public void case_system(int num){
				
				switch(num){
					case 3: case1();
					break;
					case 2: case2();
					break;
					case 1: case3();
					break;
				}
			return;
			}

			public void case1(){
				for( int i=0;;){
					if (seats[cRow][i]+seats[cRow][i+2]==0){
						seats[cRow][i] = 1;
						seats[cRow][i+1] = 1;
						seats[cRow][i+2] = 1;
						return;
						}
						if( i==3 ) break;
						else{
						i = 3;
						continue;
						}
					}
					


					for(int i2=cRow+1; i2<=27; i2++){

						if(i2==27){
							al_c=2;
							return;
						}

						for( int k2=0;;){

						if(seats[i2][k2]+seats[i2][k2+2]==0){
							seats[i2][k2] = 1;
							seats[i2][k2+1] = 1;
							seats[i2][k2+2] = 1;
							return;
						}

							if( k2==3 ) break;
							else{
							k2 = 3;
							continue;
							}
						}
					}
					
		
					
				}
	

			public void case2(){



				for ( int i=0; i<5; i++ ){
					if(i==2) continue;
					if(seats[cRow][i]+seats[cRow][i+1] == 0){
						seats[cRow][i] = 1;
						seats[cRow][i+1] = 1;
						return;
						}
				}
						
						for(int i2=cRow+1; i2<=27; i2++){
							if (i2==27){
							al_c=1;
							return;
							}
						for ( int k2=0; k2<5;k2++ ){
							if(k2==2) continue;
							if(seats[i2][k2]+seats[i2][k2+1] == 0){
								seats[i2][k2] = 1;
								seats[i2][k2+1] = 1;
								return;
								}
							}
						if ( cRow == 26  ){
						al_c = 1;
						return;
						}
					}
			}

			public void case3(){
				for( int i=0; i<=5; i=i+1 ){
					if ((seats[cRow][i]) == 0){
						seats[cRow][i] = 1;
						return;
						}
					}


					for(;;){
						cRow++;
						for( int i=0; i<=5; i++ ){
							if ((seats[cRow][i]) == 0){
							seats[cRow][i] = 1;
							return;
							}
						}						
						if ( cRow == 26  ) {al_c = 999; return;}
					}
			}
		}	
