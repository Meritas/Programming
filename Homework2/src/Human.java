import java.util.*;


public class Human {
	
	private String name;
	private String gender;

	Human(){
		name = "Empty Seat";
		gender = "Empty Seat";
	}
	
	Human(int wtf){
		int rvalueG = new Random().nextInt(2)+1; //rand za pol 1(muj) 2(jena)
		name = nameGenerator() + " " + nameGenerator() + " " + nameGenerator();
		gender = genderator(rvalueG);
	}
	
	String nameGenerator() {
		StringBuffer sb = new StringBuffer(0);
		int rvalueN = new Random().nextInt(12)+1;
		sb.setLength(0);
		for (int i = 0; i < rvalueN; i++) {
			if (i==0) {
			int rvalueC = new Random().nextInt(26);
			sb.append('A' + rvalueC);
			}else{
			int rvalueC = new Random().nextInt(26);
			sb.append('a' + rvalueC);
			}
		}
		String resName = sb.toString();
		return resName;
	}
	
	String genderator(int rnd) {
		if (rnd == 1) {
			return "Male";
		}else{
			return "Female";
		}
	}
}
