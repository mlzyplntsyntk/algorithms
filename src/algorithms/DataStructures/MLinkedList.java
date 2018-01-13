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

import java.util.Iterator;

/**
 *
 * @author Emir Emre SARBAY <emre at sarbay.com>
 */
public class MLinkedList<T> {
	MLinkedList next = null;
	int length = 0;
	T data = null;
	
	public void add(T object) {
		this.addToIndex(object, this.length);
	}
	
	public void add(T object, int index) throws Exception {
		if (index > this.length) {
			throw new Exception("No such index");
		}
		this.addToIndex(object, index);
	}
	
	private void addToIndex(T object, int index) {
		MLinkedList _this = this;
		int i = 0;
		while (i<index-1 && _this.next != null) {
			_this = _this.next;
			i++;
		}
		if (index == 0) {
			MLinkedList _cycler = _this;
			_this.data = object;
			_this.next = _cycler;
		} else {
			MLinkedList<T> newObject = new MLinkedList<>();
			newObject.data = object;

			MLinkedList _cycler = _this.next;
			_this.next = newObject;
			newObject.next = _cycler;
		}
		this.length++;
	}
	
	private void removeIndex(int index) {
		MLinkedList _this = this;
		int i=0;
		while (i<index && _this.next != null) {
			_this = _this.next;
		}
		MLinkedList _cycler = _this;
		_this = null;
		
	}
	
	public Iterator<T> getIterator() {
		return new MLinkedListIterator(this);
	}
	
	private class MLinkedListIterator implements
                    Iterator<T> {
		
		private MLinkedList<T> cursor;
		
		public MLinkedListIterator(MLinkedList<T> t) {
			this.cursor = t;
		}
		
		@Override
		public boolean hasNext() {
			return cursor != null;
		}

		@Override
		public T next() {
			if (this.hasNext()) {
				T temp = cursor.data;
				cursor = cursor.next;
				return temp;
			}
			return null;
		}
		
	}
}
