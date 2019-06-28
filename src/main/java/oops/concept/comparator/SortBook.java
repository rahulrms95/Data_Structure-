package oops.concept.comparator;

import java.util.Comparator;

public class SortBook implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name)==0?o1.count-o2.count:o1.name.compareTo(o2.name);
	}

}
