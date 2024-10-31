package studio7;

public class Fraction {
	private int numerator1;
	private int denominator1;
	private int numerator2;
	private int denominator2;
	
	public Fraction(int n1, int d1, int n2, int d2) {
		n1 = numerator1;
		d1 = denominator1;
		n2 = numerator2;
		d2 = denominator2;
	}
	public String addingFractions() {
		int sum;
		int denominator;
		if (denominator1!=denominator2){
			denominator = denominator1*denominator2;
			sum = denominator2*numerator1 +denominator1*numerator2;
		} else {
			sum = numerator1 + numerator2;
			denominator = denominator1;
		}	
		return "sum" + "/" + "denominator";
	}
	public int product() {
		int product;
		int numerator = numerator1 * numerator2;
		int denominator = denominator1 * denominator2;
		product = numerator / denominator;
		return product;
	}
	public String simplify() {
		int numerator = numerator1;
		int denominator =denominator1;
		for (int i=numerator1; i>2; i--) {
			if (numerator1 % i == 0 && numerator2 % i ==0){
				numerator = numerator1/i;
				denominator = denominator1/i;
			}
		}
		return numerator +"/"+ denominator;
	}
}
