package mix;

public class DoubleRetrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,3,4,6,6};
		int b = value(a);
		System.out.println("Value of B : " + b);

	}
	
	public static int value(int[] a) {
		
		for(int b : a) {
			
			if (b== 10) {
				return b;
			}
			else {
				System.out.println("Not Match");
				break;
			}
		}
		System.out.println("Not Reachable code");
		return 0;
		
	}

}
