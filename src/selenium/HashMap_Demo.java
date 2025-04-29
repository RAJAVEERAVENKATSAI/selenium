package selenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap_Demo {

	public static void main(String[] args) {
		
	//Declaration
//		HashMap hm = new HashMap();
//		Map hm = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		//Adding Pairs

		hm.put(101," Venkat"); 
		hm.put(102," Sai"); 
		hm.put(103," Bhanu"); 
		hm.put(104," Abhinav"); 
		hm.put(105," Ganesh"); 
		hm.put(106," Vishwa"); 
		hm.put(107,"Venkat");
		hm.put(107,"Veera"); // Restore the data //[101= Venkat, 102= Sai, 103= Bhanu, 104= Abhinav, 106= Vishwa, 107=Veera]
		System.out.println(hm); //{101= Venkat, 102= Sai, 103= Bhanu, 104= Abhinav, 105= Ganesh, 106= Vishwa, 107=Venkat}
		System.out.println("Size of hashmap:"+hm.size()); //Size of hashmap:7
		
		//RemovePair
		hm.remove(105);
		System.out.println("After removing pair:"+hm); //{101= Venkat, 102= Sai, 103= Bhanu, 104= Abhinav, 106= Vishwa, 107=Venkat}
		
		//access value of the key
		System.out.println(hm.get(104));   //104 is key     // Abhinav
		
		//Get all the keys from  HashMap
		System.out.println(hm.keySet()); //[101, 102, 103, 104, 106, 107]
		System.out.println(hm.values()); //[ Venkat,  Sai,  Bhanu,  Abhinav,  Vishwa, Venkat]
		System.out.println(hm.entrySet()); //[101= Venkat, 102= Sai, 103= Bhanu, 104= Abhinav, 106= Vishwa, 107=Venkat]
		
		//Reading data from HashMap
		
		// Using for..each
		
	/*	for(int K:hm.keySet()) 
		{
			System.out.println(K+"    "+hm.get(K));
		}*/
		
		//Using Iterator
		
		Iterator <Entry<Integer,String>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next(); 
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}

		hm.clear();
		System.out.println(hm.isEmpty());  //true
	}

}
