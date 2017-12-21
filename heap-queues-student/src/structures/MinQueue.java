package structures;

import comparators.IntegerComparator;
import comparators.ReverseIntegerComparator;

import java.util.Comparator;
import java.util.Iterator;

public class MinQueue<V> implements PriorityQueue<Integer, V> {
	int size = 0;
	
	Comparator<Integer> iter2 = new ReverseIntegerComparator();
	StudentArrayHeap<Integer,V> heap = new StudentArrayHeap<Integer, V>(iter2);

	
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
		// TODO Auto-generated method stub
		return heap.peek();
	}

	@Override
	public Iterator<Entry<Integer, V>> iterator() {
		// TODO Auto-generated method stub
		return heap.iterator();
	}

	@Override
	public Comparator<Integer> getComparator() {
		return iter2;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return heap.isEmpty();
	}


	public int CompareTo(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
	
}

