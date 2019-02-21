package logic.misc;

final class User{
	private int id;
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAdress() throws CloneNotSupportedException {
//		Address ad = new User
		return new Address(adress.getCity(),adress.getBlockNo());//(Address) adress.clone();
	}

	private String name;
	private Address adress;
	public User(int id, String name, Address adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = new Address(adress.getCity(),adress.getBlockNo());
	}
	
}

class Address implements Cloneable{
	String city;
	public Address(String city, int blockNo) {
		super();
		this.city = city;
		this.blockNo = blockNo;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", blockNo=" + blockNo + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getBlockNo() {
		return blockNo;
	}
	public void setBlockNo(int blockNo) {
		this.blockNo = blockNo;
	}
	int blockNo;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class ImmutableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
    Address ad1 = new Address("gonda",220);
    User u1 = new User(1,"manoj", ad1);
    System.out.println(u1.getId()+" "+u1.getName()+" "+u1.getAdress());
    Address a1 = u1.getAdress();
    a1.setBlockNo(3);
    System.out.println(u1.getId()+" "+u1.getName()+" "+u1.getAdress());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

}
