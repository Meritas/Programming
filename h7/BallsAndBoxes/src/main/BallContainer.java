package main;

import java.util.ArrayList;
import java.util.List;

public class BallContainer {

	private List<Ball> container;
	private int capacity;
	
	BallContainer(int inCapacity) {
		this.container = new ArrayList<Ball>(inCapacity);
		this.capacity = inCapacity;
	}
	
	public void add(String input) {
		if (capacity - container.size() <= 0 ) {
			System.out.println("Ball not added.");
			return;
		} else{
			container.add(new Ball(input));
			System.out.println("Ball added.");
		}
		
	}
	
	public void remove(String ball) {
		Ball dummyBall = new Ball(ball);
		if (contains(ball) == false) {
			System.out.println("Inexistent ball");
		} else {
			container.remove(dummyBall);
			System.out.println("Removal was succssful");
		}
	}
	
	public void size() {
		System.out.println("Size: " + container.size());
	}
	
	public void capacity() {
		System.out.println("Capacity: " + capacity);
	}
	
	public boolean contains(String ball) {
		Ball dummyBall = new Ball(ball);
		if (container.contains(dummyBall)) {
			System.out.println("Ball is contained.");
			return true;
		} else {
			System.out.println("Ball is not contained.");
			return false;
		}
	}
}
