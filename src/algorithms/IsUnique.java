package algorithms;

/**
 * Is Unique: 
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * 
 * @author Emir Emre SARBAY <emre at sarbay.com>
 */
public class IsUnique {
	
	public IsUnique(String k) {
		int totalChars = k.length();
		char[] keys = new char[totalChars];
		
		for (int i=0; i<totalChars; i++) {
			for (int j=0; j<keys.length; j++) {
				if (k.charAt(i) == keys[j]) {
					System.out.println("duplicate " + keys[j]);
					return;
				}
			}
			keys[i] = k.charAt(i);
		}
		
		System.out.println("Unique!!");
	}
}