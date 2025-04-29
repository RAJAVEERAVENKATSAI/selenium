package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList mylist = new ArrayList();
	//	List mylist = new ArrayList(); 
	//	ArrayList <String>mylist = new Arraylist<String>();
		
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
	     //size of arraylist
     	System.out.println("Size of an arraylist:"+mylist.size());
		System.out.println("Printing data from arraylist:"+mylist);
		
         //	Remove element from arraylist
		mylist.remove(1);                     //remove index 1 line
		System.out.println("After removing:"+mylist);
         // Insert element in the arraylist
		mylist.add(3, "sai");                  //add index 3    
		System.out.println("After inserting:"+mylist);
		
		// Modify element in the arraylist
		mylist.set(1, "RRR");                  //set -index name changed
		System.out.println("After replacing:"+mylist); 
		
		//Access specific element from arraylist
		System.out.println(mylist.get(3)); //here 3 is index//A
		
		
		
	//	mylist.clear();                     //cleardata
	//	System.out.println("mylist:"+mylist);
		
		//clone to duplicate files
	//	mylist.clone();                        // clone used to duplicate
	//	System.out.println("mylist:"+mylist);
		
		// Reading all the elements from array list
		
		//using normal for loop
		for (int i = 0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}
		
		//usin for.each loop
		for(Object X:mylist)
		{
			System.out.println(X);
		}  
		//using iterator
		Iterator it = mylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Checking arraylist empty or not
		System.out.println("Is arraylist empty?"+ mylist.isEmpty());
		
		//remove all the elements from array list
		ArrayList mylist2 =new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements:"+mylist); //[RRR, A, sai, true, null, null]
		
		//remove all the elements /clear
		mylist.clear();
		System.out.println("Is arraylist empty?"+ mylist.isEmpty()); //true
	}

}
