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
package algorithms.Sorting;

/**
 *
 * @author Emir Emre SARBAY <emre at sarbay.com>
 */
public class MergeSort {
	
	public char[] array;
	
	public MergeSort(char[] array) {
		this.array = array;
		sort(0, this.array.length-1);
	}
	
	private void sort(int left, int right) {
		if (left < right) {
			int middle = (left+right) / 2; //when it casts to integer, ceils
			
			sort(left, middle);
			sort(middle+1, right);
			
			merge(left, middle, right);
		}
	}
	
	private void merge(int left, int middle, int right) {
		
		int n1 = middle-left+1;
		int n2 = right-middle;
		
		char[] a = new char[n1];
		char[] b = new char[n2];
		
		for (int i=0; i<n1; i++) {
			a[i] = array[i + left];
		}
		
		for (int i=0; i<n2; i++) {
			b[i] = array[middle+i+1];
		}
			
		int i=0, j=0, k=left;
		
		while (i < n1 && j < n2) {
			if (a[i] <= b[j]) {
				array[k] = a[i];
				i++;
			} else {
				array[k] = b[j];
				j++;
			}
			k++;
		}
		
		while (i<n1) {
			array[k] = a[i];
			i++;
			k++;
		}
		
		while (j<n2) {
			array[k] = b[j];
			j++;
			k++;
		}
		
	}
}
