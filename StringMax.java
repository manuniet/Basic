package logic.misc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class StringMax {

	
	public static int maxFInder(String copy){
		String regex="[^\\d]";
		String str1[]=copy.split(regex);
		System.out.println(Arrays.toString(str1));
		Integer lastElement=null;
		SortedSet<Integer> set=new TreeSet<>();
      for(int i=0;i<str1.length;i++){
    	  if(!str1[i].isEmpty()){
    	   
    	  set.add(Integer.valueOf(str1[i]));
    	 
		}}
    	  System.out.println(set.tailSet(set.size()+111));
//    	  final Iterator<Integer> itr = set.iterator();
//    	 // lastElement = itr.next();
//          while(itr.hasNext()) {
//        	 // System.out.println(itr.next());
//              lastElement=itr.next();
//          }
       //   System.out.println(set.last());
      
      
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hkjdhui12jkh992tr56hhhhh3333bjhgh99999jhh0";
		System.out.println(maxFInder(str));
		
	}

}
