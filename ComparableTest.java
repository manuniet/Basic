package logic.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Shop implements Comparable<Shop>{
	int shopNo;
	public Shop(int shopNo, String name) {
		super();
		this.shopNo = shopNo;
		this.name = name;
	}
	String name;
	@Override
	public String toString() {
		return "Shop [shopNo=" + shopNo + ", name=" + name + "]";
	}
	public int compareTo(Shop s){
		return this.name.compareTo(s.name);
	}
	
}
public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Shop> ls = new ArrayList<>();
  ls.add(new Shop(1,"manoj"));
  ls.add(new Shop(4,"Aanoj"));
  ls.add(new Shop(3,"Zanoj"));
  ls.add(new Shop(2,"Eanoj"));
  Collections.sort(ls);
  System.out.println(ls);
	}

}
