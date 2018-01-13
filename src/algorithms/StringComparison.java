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

import algorithms.Sorting.MergeSort;

/**
 * String Rotation:Assumeyou have a method isSubstringwhich checks if one word 
 * is a substring of another. Given two strings, sl and s2, write code to check 
 * if s2 is a rotation of sl using only one call to isSubstring 
 * (e.g.,"waterbottle" is a rotation of"erbottlewat").
 * 
 * @author Emir Emre SARBAY <emre at sarbay.com>
 */
public class StringComparison {
	//merge or quick sort could be a good option here.
	public StringComparison(String a, String b) {
		MergeSort ma = new MergeSort(a.toCharArray());
		MergeSort mb = new MergeSort(b.toCharArray());
		
		System.out.println(String.valueOf(ma.array).equals(String.valueOf(mb.array)));
		
	}
}