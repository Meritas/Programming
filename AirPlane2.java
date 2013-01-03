import java.util.*;
import java.util.Arrays;

public class AirPlane2 {

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
				int al_c2 = Filler.gSize;
				int rvalue = new Random().nextInt(Filler.gSize) + 1;//gSize -> number of people groups allowed to get in, every value lower than num than is allowed by default)
				if(sum+rvalue > 162) continue;
				if( Filler.gSize == 0 ){
					System.out.println("No more free seats.");
					break;
				}				
				sum = sum + rvalue;
				Filler.iCase(rvalue);
				if ( Filler.gSize != al_c2 ) sum = sum - rvalue;
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
			int MAX = 27;
			int[] paths = new int[2];
				
			
			
			int gSize = 3;
			int[][] seats = new int[27][6];
			
			
			public void iCase(int group){
				for( int cRow_T = cRow; cRow_T <= MAX; cRow_T++ ){
					if ( (group == 1) && ( cRow_T != cRow) ){
						cRow++;
					}
					int pointer = 0;
					for( int i = 0; i <= paths.length-1 ; i++ ){
						pointer += paths[i];
						if ( group > paths[i] ){
							continue;
							}
						int res = freeSeats(pointer, i, cRow_T); // result
						if ( group > paths[i] - res ){
							continue;
						} else {
							for( int i3 = res; i3 <= res + (group - 1); i3++ ){
								seats[cRow_T][i3] = 1;
								}
							return;
							}
						}
					}
				gSize--;
				return;
				}


			public int freeSeats(int ptr, int arg1, int row){
				int counter = 0;	
				for ( int i2 = ptr; i2 <= ptr + paths[arg1]; i2++){
									
					if( seats[row][ptr] == 1 ){
						counter++;
						}
					}
					return counter;// rezultata, koyto vrushta otgovarq na tochnata poziciq ot koqto ni e nujno da zapochnem, ako namerim dostatuchno prazni mesta
				}
			}
