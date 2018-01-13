/*
 * Copyright 2018 Emir Emre SARBAY <emre at sarbay.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package algorithms;

/**
 * There are three types of edits that can be performed on strings: insert a 
 * character, remove a character, or replace a character. Given two strings, 
 * write a function to check if they are one edit (or zero edits) away.
 * 
 * @author Emir Emre SARBAY <emre at sarbay.com>
 */
public class OneAway {
	public OneAway(String original, String comparison) { 
		if (original.equals(comparison)) {
			return;
		}
		
		char[] orig = original.toCharArray();
		char[] comp = comparison.toCharArray();
		
		//possibility of a remove or insert edit
		if (orig.length != comp.length) {
			// create a char array with the length of the bigger string and
			// copy chars from smaller string
			
			// start comparing the longer string to new array
			// if any chars at the given index does not match, 
			// cycle the elements to the right. 
			// if it happens again, return false
			// if it does not : 
			//	if original string is larger then smaller, it's a remove op
			//	otherwise it's an insert op.
			return;
		}
			
		//possibility of a replacement
		Boolean changed = false;
		
		for (int i=0; i<orig.length; i++) {
			if (orig[i] != comp[i]) {
				if (!changed) {
					changed = true;
				} else {
					System.out.println("More than one edits");
					return;
				}
			}
		}
		
		// if changed it's an edit op
		if (changed)
			System.out.println("edit op");
	}
}
