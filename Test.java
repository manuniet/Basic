package logic.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Company{
	
}

class A implements Company{
	String name;

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	public A(String name) {		
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	A(){
		
	}
	
	
}
class B extends A{

	String name;

	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public B(String name) {		
		this.name = name;
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Company> lis = new ArrayList<>();
lis.add(new A("manoj"));
lis.add(new B("faru"));
lis.add(new A());
//for(Company c:lis) {
//	System.out.println(c);
//}
List<Integer> list = Arrays.asList(10,11,33,1,22,3);
System.out.println(sumStream(list));


List<String> l1=new ArrayList<>();
List<String> l2=new java.util.LinkedList<>();
System.out.println(l1.hashCode()+"*****"+l2.hashCode());
System.out.println(l1.equals(l2));
l1.add("a");
l1.add("b");
l1.add("c");
l2.add("a");
l2.add("b");
l2.add("c");

System.out.println(l1.hashCode()+"*******"+l2.hashCode());
System.out.println(l1.equals(l2));

	}

private static int sumStream(List<Integer> list) {
	return list.parallelStream().filter(i -> i > 10).mapToInt(i -> i).sum();
}

	

}
