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
package algorithms.DataStructures;

/**
 *
 * @author Emir Emre SARBAY <emre at sarbay.com>
 * @param <T>
 */
public class LL<T> {
	private static class Node<T> {
		private final T data;
		private Node next;
		
		public Node(T object) {
			this.data = object;
		}
	}
	
	private Node<T> root;
	private Node<T> iterator;
	private int total = 0;
	
	public void add(T object) {
		this.addWithIndex(object, total);
	}
	
	public void add(T object, int index) throws Exception {
		if (index > total) {
			throw new Exception("come on");
		}
		this.addWithIndex(object, index);
	}
	
	private void addWithIndex(T object, int index) {
		Node newObject = new Node(object);
		
		if (index == 0) {
			newObject.next = root;
			root = newObject;
			total++;
		} else {
			Node _root = root;
			for (int i=0; i<index-1; i++) {
				_root = _root.next;
			}
			if (index < total)
				newObject.next = _root.next;
			_root.next = newObject;
			total++;
		}
	}
	
	public void remove(int index) {
		if (index == 0) {
			root = root.next;
		} else {
			Node _root = root;
			for (int i=0; i<index-1; i++) {
				_root = _root.next;
			}
			_root.next = _root.next.next;
		}
		total--;
	}
	
	public int getTotal() {
		return total;
	}
	
	public boolean hasNext() {
		if (iterator == null && root != null) return true;
		if (iterator != null && iterator.next != null) return true;
		return false;
	}
	
	public T next() {
		if (iterator == null) {
			iterator = root;
			return iterator.data;
		}
		iterator = iterator.next;
		return iterator.data;
	}
}
