package logic.misc;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class Key{
	@Override
	public int hashCode(){
		System.out.println("in has");
		return 1;
	}
	public boolean equals(Object k){
		System.out.println("in eq");
		Key t = (Key)k;
		if(this==t)
			{System.out.println("in eq1");
			return true;
			}else if(this.getClass()==t.getClass()){
				System.out.println("in eq2");
				return true;
			}else{
				System.out.println("in eq3");
			return false;
			}
	}
}
public class TestClass {

	
	public static Date convertStringToDate(String dateString) throws ParseException
	{
		
	    SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
	    SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
	    Date date = format1.parse(dateString);
	    Date dt =format2.parse(format2.format(date));
	    System.out.println(format2.format(date));
	    System.out.println(date);
	    System.out.println(dt);
	            System.out.println(new java.sql.Timestamp(dt.getTime()));
	            System.out.println(new java.sql.Timestamp(date.getTime()));
	         
	  
	    return date;
	}
	
	static void str(Number s){
		System.out.println("number");
	}
    static void str(Integer s){
    	System.out.println("integer");
	}
	public static void main(String ...hh){	
		String dt ="09/26/2018";
		
		String strCo ="68768,877,8787,122,23,11,98";
		
		String ar[] = strCo.split(",");
		Integer n= Integer.valueOf(1);
		
		str(n);
		
//		System.out.println(ar[0]);
//		System.out.println(ar.length);
//		System.out.println(Arrays.toString(ar));
//
		Key y=new Key();
		Key z=new Key();
		
		//System.out.println(y.equals(y));
		Map<Key,String> mp = new HashMap<>();
	mp.put(y,"value1");
	mp.put(y,"value2");
		mp.put(y,"value3");
		mp.put(y,"value4");
		mp.put(z,"value5");
		
		//System.out.println(mp.get(new Key()));
	
		class A{}
		class B extends A{
			
		}
		ArrayList<? super B> ls = new ArrayList<A>();
		//ls.add(new A());
		try {
			//System.out.println(convertStringToDate(dt));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
