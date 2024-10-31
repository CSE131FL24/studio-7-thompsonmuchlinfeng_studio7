package studio7;

public class Die {
	private int n;
	
	public Die(int initN) {
		n = initN;
	}
	public int roll() {
		int probability = 1/n;
		int roll = (int)Math.round((Math.random() * probability) * n);
		return roll;
	}
	public String toString() {
		return "You rolled: " + roll();
	}
}
