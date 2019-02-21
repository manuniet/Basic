package logic.misc;

import java.util.HashMap;
import java.util.Map;


public class CustomHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee,String> map = new HashMap();
		Employee e1=new Employee(1,"manoj");
		map.put(e1, "CS");
		Employee e2=new Employee(1,"manoj");
	     e2=e1;
		map.put(e2, "CS");
		System.out.println(map);
		System.out.println(map.size());
		

	}

}
class Employee{
	int eId;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	String Name;
	Employee(int eId, String Name){
		this.eId=eId;
		this.Name=Name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + eId;
		return 1;
	}
	//@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (Name == null) {
//			if (other.Name != null)
//				return false;
//		} else if (!Name.equals(other.Name))
//			return false;
//		if (eId != other.eId)
//			return false;
//		return true;
//	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", Name=" + Name + "]";
	}
	
}