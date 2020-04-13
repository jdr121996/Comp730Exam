package question4;

public class StringReverse {

	public String reverseString(String str) {		
		String reverseStr = null;	
		if (str == null) {		
			return null;
		}		
		else {			
			StringBuilder reversedStr = new StringBuilder();		
			for (int i = str.length() - 1; i >= 0; i--) {				
				reversedStr.append(str.charAt(i));
				reverseStr = reversedStr.toString();			
			}			
			return reverseStr;		
		}
	}
}
