package structures;

import java.util.Comparator;
import java.util.Iterator;

import comparators.IntegerComparator;


public class StudentArrayHeap<P, V> extends AbstractArrayHeap<P, V> {


	protected StudentArrayHeap(Comparator<P> comparator) {
		super(comparator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int getLeftChildOf(int index) {
		if(index < 0) throw new IndexOutOfBoundsException();
		
		return index*2+1;
		
		
	}

	@Override
	protected int getRightChildOf(int index) {
		if(index < 0) throw new IndexOutOfBoundsException();
		return index*2 + 2;
	}

	@Override
	protected int getParentOf(int index) {
		if(index < 1) throw new IndexOutOfBoundsException();
		return (index -1)/2;
	}

	@Override
	protected void bubbleUp(int index) {       
    while (index > 0
            && (comparator.compare((heap.get(index).getPriority()) , heap.get(getParentOf(index)).getPriority()) > 0)) {
       
        swap(index, getParentOf(index));
        index = getParentOf(index);
    }        
}
	

	@Override
	protected void bubbleDown(int index) {
		int largerChild, hole=0, left=1, right=2;
		 while (left <= heap.size() -1) { // at least 1 child
		 if (right <= heap.size() -1 && // right child exists
		 comparator.compare(heap.get(left).getPriority(), heap.get(right).getPriority()) < 0)
		 largerChild = right;
		 else
		 largerChild = left;
		 if(comparator.compare(heap.get(index).getPriority(), heap.get(largerChild).getPriority()) >= 0)
		 break;
		 swap(hole, largerChild);
		 index = getLeftChildOf(index);
		 hole = largerChild;
		 left = (hole*2)+1; right = (hole*2)+2;
		 }
		 
		 hole = index;		
		
	}

	public Iterator<Entry<P, V>> iterator() {
		return heap.iterator();
		
	}
	

	  
	
	
	
}

