package mix;

public class NumberFormateForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "4.0";
		System.out.println("Original Value : " + str);
		
		//int index = str.indexOf(".");
		//System.out.println("index of Dot : " + index);
		
		String subString = str.substring(0, str.indexOf("."));
		System.out.println("New String : " + subString);
		
	}

}
