import java.util.*;
import java.util.Arrays;

public class AirPlane2 {

	public static void main(String[] args) {
		flyingVehicle plane = new flyingVehicle();
		plane.add_seats();
		plane.print_seats();		
	}
}






	
		class flyingVehicle{
		int sum = 0;
		fillingComputer Filler = new fillingComputer();
		public void add_seats(){
			for(int i=0; sum<162; i++){
				int rvalue = new Random().nextInt(Filler.al_c) + 1;//al_c -> highest case allowed, every lower case than the current highest case is allowed by default)
				if(sum+rvalue > 162) continue;
				sum = sum + rvalue;
				Filler.case_system(rvalue);
			}

		}
public void print_seats(){		
for (int r=0;r<=26;r++) {
for(int c=0;c<=5;c++) {
System.out.print(Filler.seats[c][r]+ " ");
if (c==2)
System.out.print(" ");
}
System.out.println(" ");
}
}



	}


		class fillingComputer{
			int cRow = 0;
			int al_c = 2;
			int num = 3;//num == rvalue/num of case
			boolean iftrue = false;
			int[][] seats = new int[6][27];
			
			public void case_system(int num){
				switch(num){
					case 1: case1();
					break;
					case 2: case2();
					break;
					case 3: case3();
					break;
					case 999: System.out.println("No more free seats.");
					break;
				}
			return;
			}

			public void case1(){
				for( int i=0;;){
					System.out.println("lelele");
					if (seats[cRow][i]+seats[cRow][i+2]==0){
						seats[cRow][i] = 1;
						seats[cRow][i+1] = 1;
						seats[cRow][i+2] = 1;
						iftrue = true;
						break;
						}
						if( i==3 ) break;
						else{
						i = 3;
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
						return;
				}

			public void case2(){
				for ( int i=0; i<=5; i=i+1 ){
					if(i==2) continue;
					if(seats[cRow][i]+seats[cRow][i+1] == 0){
						seats[cRow][i] = 1;
						seats[cRow][i+1] = 1;
						iftrue = true;
						}
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
				return;
			}

			public void case3(){
				for( int i=0; i<=5; i=i+1 ){
					if ((seats[cRow][i]) == 0){
						seats[cRow][i] = 1;
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
				return;

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



/* Advanced mode

int [] paths = new int[num]; //puteki, na vsqka puteka ima n-broy mesta




for( int row = current_row; boolean found_spots == true; row = row + 1; ){

for (i=0; i<=paths; i = i + 1){
	found_spots = false;
	tkn_seats = 0;	//kolko mesta sa zaeti na reda, koito preglejdame
	point = 0;      //pokazalec do koq sedalka sme stignali
	if ( paths[i] < ppl ){
		point = point + paths[i];		
		continue;
		}

	for ( k=0; k <= paths[i]; k = k + 1){
		if( seats[row][point] == 1 ) tkn_seats = tkn_seats + 1;
		point = point + 1;
		}

	if ( paths[i] - tkn_seats < ppl ){
		point = point + (paths[i] - tkn_seats);
		continue;
		}

	for ( k2 = 0; k <= ppl; k = k + 1 ){
		seats[row][point] = 1;
		point = point + 1;
		found_spots = true;
		}

}*/
