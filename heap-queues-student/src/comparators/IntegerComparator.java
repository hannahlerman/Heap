package comparators;

import java.util.Comparator;

/**
* An {@link IntegerComparator} compares integers in the natural way.
*
*/
public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer arg0, Integer arg1) {
            int myint = 0;
    		if(arg0 > arg1) myint = 1;
            else if(arg1 > arg0) myint = -1;
            else if(arg1 == arg0) myint = 0;
    		return myint;

    
    } 
}
