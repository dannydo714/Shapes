
public class Methodss {

	public static void main(String []args) {
		int a = 11;
		int b = 87;
		Methodss a1 =  new Methodss();
		a1.getMin(a, b);
		
		
		
		System.out.println("The min number is " + a1.getMin(a, b));
	}
	
	public int getMin(int a, int b) {
		int min;
		if(a>b) {
			min = b;
		}
		else {
			min=a;
		}
		return min;
	}
}
