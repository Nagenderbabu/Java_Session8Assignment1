package course.collections.lists;

import java.util.*;



public class CollectionMain {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // Initializing student variables through constructor
	Student s1=new Student("anil",26091991 ,"male",25,9030);

	// creating array list object
	ArrayList ai=new ArrayList();
	// passing values to array list add method
	ai.add(s1.getName());
	ai.add(s1.getDob());
	ai.add(s1.getSex());
	ai.add(s1.getAge());
	ai.add(s1.getContact());
	
	// calling iterator method using array list object
	Iterator iter=ai.iterator();
// iters every value present in array list and prints them in list order
	while(iter.hasNext())
{
	System.out.println( iter.next());
}

	}	
	
	}

	