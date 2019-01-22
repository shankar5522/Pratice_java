package mix;

import java.util.HashMap;
import java.util.Map;

public class OccuracnesOFString {

	char c1='\u0000';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OccuracnesOFString obj = new OccuracnesOFString();
		System.out.println("Default Value : " + obj.c1);
		
		String str = "SASA";
		
		char[] ch = str.toCharArray();
		
		
		
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char c : ch) {
			if(hm.containsKey(c)) {
				//System.out.println(c + " is not here" + hm.get(c));
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> c : hm.entrySet()) {
			System.out.println(c.getKey() + "   " + c.getValue());
		}
		
		
		
		
		
		
/*		int counter = 0;
		for(int i=0; i<(str.length()); i++) {
			counter = 0;
			for(int j = 0; j<str.length(); j++) {
				
				if(ch[i] == ch[j]) {
					System.out.println(ch[i] + " is repeating " + counter++);
				}
				
			}
		}*/

	}

}
