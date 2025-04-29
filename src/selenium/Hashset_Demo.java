package selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset_Demo {

	public static void main(String[] args) {
		//Declaration
//		HashSet myset = new HashSet();
		Set myset =new HashSet();
//		HashSet <String>myset = new HashSet<String>();
		
	//Adding elements in to hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//print Hash set
		System.out.println(myset);  //[null, A, 100, 10.5, welcome, true]
		
		//Size of HashSet
		System.out.println("Size of HashSet:"+myset.size()); //Size of HashSet:6
		
		
	//	Removing 
		myset.remove("welcome");  //welcome is String(not an index)
        System.out.println("Afetr removimg:"+myset); //[null, A, 100, 10.5, true]
        myset.add("welcome");
        System.out.println("Afetr adding:"+myset); //[null, A, 100, 10.5, welcome, true]
        myset.remove('A');  //'A' is char(not an index)
        System.out.println("Afetr removimg:"+myset); //[null, 100, 10.5, welcome, true]
        
        //Inserting element    -Not Possible
        //Access Specific element -Not Possible
        
        //Convert HashSet--->ArrayList
        ArrayList al = new ArrayList(myset);
        System.out.println(al);
        System.out.println(al.get(2)); 
        
        //Read all the elements using for ..each
        
     /*   for(Object X:myset)
        {
        	System.out.println(X);
        }
        */
        //Using iterator
        
        Iterator <Object> it = myset.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        //Clearing all the elements in hsah set	
        myset.clear();
        System.out.println(myset);    //[]
       // System.out.println(myset.isEmpty());  //true
        
	}

}
