package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<PremiumCustomer> pList = new ArrayList<PremiumCustomer>();		
		ArrayList<BaseCustomer> bList = new ArrayList<BaseCustomer>();
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("add");
			String character = in.nextLine();		
			if (character.equals("p")){
				pList.add(new PremiumCustomer(character, in.nextLine(), in.nextLine(), in.nextInt()));				
			} else {
				if (character.equals("b")) {
					bList.add( new BaseCustomer(character, in.nextLine(), in.nextLine(), in.nextInt()) );
				}
			}
		}
			
			for(int i = 0; i < pList.size(); i++) {
				pList.get(i).discount();
				System.out.println(pList.get(i).getAnnual_billing());
			}
						
		
	}

}
