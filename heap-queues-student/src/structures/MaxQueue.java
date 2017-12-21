
package structures;

import comparators.IntegerComparator;

import java.util.Comparator;
import java.util.Iterator;

public class MaxQueue<V> implements PriorityQueue<Integer, V> {
	
	int size = 0;
	Comparator<Integer> iter = new IntegerComparator();
	StudentArrayHeap<Integer,V> heap = new StudentArrayHeap<Integer, V>(iter);
	
	@Override
	public PriorityQueue<Integer, V> enqueue(Integer priority, V value) {
		if(priority == null || this == null){
			throw new NullPointerException();
		}
		size++;
		heap.add(priority, value);
		return this;
	}

	@Override
	public V dequeue() {
	if(this.isEmpty()){
		throw new IllegalStateException();
	}

	size--;
	return heap.remove();

	}

	@Override
	public V peek() {
		return heap.peek();
	}

	@Override
	public Iterator<Entry<Integer, V>> iterator() {
		return heap.iterator();
	}


	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return heap.isEmpty();
	}


	@Override
	public Comparator<Integer> getComparator() {
		return iter;	
	}

	public int CompareTo(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return 0;
	}
}



