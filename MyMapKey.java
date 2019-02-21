package logic.misc;

import java.util.HashMap;
import java.util.Map;


class MyKey {
	
	public int hashCode(){
		System.out.println(key);
		return key;
	}
	
	public boolean equals(Object obj){
		MyKey k= (MyKey)obj;
		if(this==obj)
			return true;
		else if(this.getClass()==k.getClass()){
			
			return this.key==k.key && this.getName()==k.getName();
		}
		return false;
	}
	
	public MyKey(int key, String name) {
		super();
		this.key = key;
		this.name = name;
	}
	int key;
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "MyKey [key=" + key + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	String name;

}

class MyMapKey{
	public static void main(String ...q){
		Map<MyKey,String> mp = new HashMap<>();
		MyKey k=new MyKey(1,"abc");
		
		mp.put(k, "afff");
		k.setKey(2);
		k.setName("abc");
		
		mp.put(new MyKey(2,"abc"), "b");
		System.out.println(mp);
		System.out.println(mp.size());
		
	}
}
