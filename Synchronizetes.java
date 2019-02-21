package logic.misc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class Synchronizetes {

	
	public static synchronized final void m(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Integer> map=new HashMap<>();
		map.put(1,2);
		map.put(2, 3);
		Map map1=Collections.unmodifiableMap(map);
		
		System.out.println(map);
		map1.put(2,3);
		map.put(3, 4);
		System.out.println(map1);
		
		
		
	}

}
