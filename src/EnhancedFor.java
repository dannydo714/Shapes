
public class EnhancedFor {
	
	public static void main(String []args) {
		int[] array1 = {3,4,5,6,7};
		int total = 0;
		
		for(int x: array1) {
			total+= x;
		}
		
		System.out.println(total);
	}

}
