package main;

public class MClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BallContainer firstB = new BallContainer(3);
		firstB.add("olalala");
		firstB.add("olololo");
		firstB.contains("olololo");
		firstB.remove("olololo");
		firstB.contains("olololo");
		firstB.remove("orororo");
		firstB.add("123");
		firstB.add("asdf");
		firstB.add("ANONONONONONOooo");
		firstB.capacity();
		firstB.size();
	}

}
