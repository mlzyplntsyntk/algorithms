package algorithms;

/**
 * Write a method to replace all spaces in a string with '%20  You may assume 
 * that the string has suf cient space at the end to hold the additional 
 * characters,and that you are given the "true" length of the string. 
 * (Note: If implementing in Java,please use a character array so that you can 
 * perform this operation in place.)
 * @author Emir Emre SARBAY <emre at sarbay.com>
 */
public class URLify {
	public URLify(char[] url, String replaceMent) {
		int actualSize = url.length;
		char[] replacer = replaceMent.toCharArray();
		
		for (int i=0; i<url.length; i++) {
			if (" ".equals(String.valueOf(url[i]))) {
				//shift elements to the right
				for (int j=i, k=0; j<actualSize; j++, k++) {
					url[actualSize-1-k] = url[actualSize-replacer.length-k];
				}
				//insert replacement
				for (int r=0; r<replacer.length; r++, i++) {
					url[i] = replacer[r];
				}
			}
		}
		
		System.out.println(url);
	}
}
