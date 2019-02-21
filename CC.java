package logic.misc;

class AA{
	public static void  print(){
		System.out.println("AA");
	}
}

class BB extends AA{
	public static void print(){
		System.out.println("BB");
	}
	

	
}
public class CC {

	public static void print(AA a){
	
		System.out.println("CA");
	}
	
	public static void print(BB a){
		
		System.out.println("BA");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AA a= new BB();
a.print();

	}

}
