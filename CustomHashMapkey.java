package logic.misc;

import java.util.HashMap;
import java.util.Map;

class EmployeeA{
	int id;
	@Override
	public int hashCode() {
		
		return 1;
	}
	//@Override
//	public boolean equals(Object obj) {
//		return (this.id == ((EmployeeA)obj).id);
//			
//	}
	String name;
	public EmployeeA(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class CustomHashMapkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<EmployeeA, Integer> mp= new HashMap<>();
EmployeeA e1=new EmployeeA(1,"Manoj");
EmployeeA e2=new EmployeeA(1,"shyam");
mp.put(e1, 10000);
mp.put(e2, 2000);
System.out.println(mp.size());
System.out.println(mp.get(e1));


	}

}
