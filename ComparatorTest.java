package logic.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


class Employee11{
	int empId;
	String name;
	public Employee11(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee11 [empId=" + empId + ", name=" + name + "]";
	}
	
	public static Comparator<Employee11> eidSor= new Comparator<Employee11>(){
		public int compare(Employee11 e1,Employee11 e2){
			return e1.empId-e2.empId;
		}
		
	};
	
	public static Comparator<Employee11> nameSor= new Comparator<Employee11>(){
		public int compare(Employee11 e1,Employee11 e2){
			return e1.name.compareTo(e2.name);
		}
		
	};
	
}


public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee11> ls= new ArrayList<>();
ls.add(new Employee11(1,"fee"));
ls.add(new Employee11(5,"Zee"));
ls.add(new Employee11(3,"Aee"));
ls.add(new Employee11(4,"Cee"));
ls.add(new Employee11(111,"Pee"));

Map<String,Integer> mp= new HashMap<>();
mp.put(null, null);
mp.put(null, null);
System.out.println(mp);




//System.out.println(ls);
Collections.sort(ls, Employee11.eidSor);

Consumer<Employee11> action =System.out::println;
ls.forEach(action);
Collections.sort(ls, Employee11.nameSor);

ls.forEach(action);
Iterator<Employee11> it= ls.iterator();
while(it.hasNext())
	System.out.println("mmm"+it.next());
	}
	
	
}
