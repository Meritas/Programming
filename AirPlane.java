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
				int gSize2 = Filler.gSize;
				int rvalue = new Random().nextInt(Filler.gSize) + 1;//gSize -> number of people groups allowed to get in, every value lower than num than is allowed by default)
				if(sum+rvalue > 162) continue;//so we can't add more people than max number of seats				
				sum = sum + rvalue;
				Filler.iCase(rvalue); //Equals group as the argument for iCase()
				if ( Filler.gSize != gSize2 ) sum = sum - rvalue; //Checks-in if group of people happened to be kicked out of the plane. Point is that if we don't substract the number of the people in that group, we'd get inaccurate result for |sum|.
				System.out.println(" ");
				System.out.println( rvalue + " passenger(s) enters the airplane." );
				print_seats();
				System.out.println(sum); //prints number of seats that are already taken
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
			int mRow = 0; //The minimum row at which our checks are gonna start. Only groups of size 1 are allowed to iterrate this variable, so we don't end up dealing with holes in the final seats-layout; or in more detail |1| is the only number that is hole-free guaranteed, because it will definitely check every single seat on it's search for free seat and if 1's check results in none free seats on this row we can safely increase the minimum starting row - |mRow|. ! REMEMBER, THIS ROW-INCREASE ISN'T A-MUST FOR SUCH A PROGRAM TO RUN PROPERLY BUT IT SAVES A LOT OF TIME, ESPECIALLY ON SLOWER SYSTEMS OR/AND LARGER ARRAYS GIVEN !
			int MAX_ROW = 26; //Number of rows we are allowed to check/fill
			int[] sLines = new int[2]; //This array contains the size of each seat-line; in other words sLines[n-1] == 3 means that line (n-1) has 3 seats
			int gSize = 3; //Max size of groups allowed to enter the plane
			int[][] seats = new int[27][6];
			
			
			public void iCase(int group){
				sLines[0]=3;//Number of seats at n-line
				sLines[1]=3;//--||--				
				for( int mRow_T = mRow; mRow_T <= MAX_ROW; mRow_T++ ){
					if ( (group == 1) && ( mRow_T != mRow) ){
						mRow++;
					}
					int pointer = 0-sLines[0];
					for( int i = 0; i <= sLines.length-1 ; i++ ){
						pointer += sLines[i];
						if ( group > sLines[i] ){
							pointer += sLines[i];	
							continue;
							}
						int res = seatsTaken(pointer, i, mRow_T); //result for how many seats are taken
						if ( group > sLines[i] - res ){
							continue;
						} else {
							int pRes = pointer+res; //pointer+result --> Position Result! The first seat we add someone at; everything from here on is a piece of cake.
							for( int i3 = pRes; i3 <= pRes + (group - 1); i3++ ){
								seats[mRow_T][i3] = 1;
								}
							return;
							}
						}
					}
				gSize=group-1; //Ako izobshto se stigne do tozi red, znachi grupata hora s tazi golemina posmurtno nqmat shans da vlqzat i im zabranqvame izobshto da si pomislqt dori da probvat(kakto i na po-golemi grupi estestveno/pestim vreme ot nenujni izchisleniq
				return;
				}


			public int seatsTaken(int ptr, int arg1, int row){
				int counter = 0;//Counts how many seats are taken
				for ( int i2 = ptr; i2 <= ptr + sLines[arg1]-1; i2++){
									
					if( seats[row][i2] == 1 ){//If seat is taken...
						counter++;//Do I really need to explain this part?
						}
					}
					return counter;// rezultata, koyto vrushta otgovarq na tochnata poziciq ot koqto ni e nujno da zapochnem, ako namerim dostatuchno prazni mesta
				}
			}
