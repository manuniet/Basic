package logic.misc;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;


public class MapSortOnvalue {

	public static Map<String,Integer> sortMap(HashMap<String,Integer> tp){
		
		List<Map.Entry<String,Integer> > ls= new LinkedList<Map.Entry<String,Integer> >(tp.entrySet());
		
		Collections.sort(ls, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                    Map.Entry<String, Integer> o2) 
 { 
     return (o1.getValue()).compareTo(o2.getValue());
 }
	});
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : ls) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
		
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> mp= new HashMap<>();
mp.put("anam",11);
mp.put("qanam",111);
mp.put("sanam",1);
mp.put("danam",21);
mp.put("ranam",9);
System.out.println("Before sorting"+mp);

System.out.println("After sorting:"+sortMap(mp));
		
		
	}

}
