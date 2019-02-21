package logic.misc;




 class Super{
	 static{
		 System.out.println("in super static");
	 }
	 Super(int i){
		 this();
		 System.out.println("in super");
	 }
	 Super(){
		 System.out.println("in super args");
		}
	  void m1(){
		 System.out.println("in super m1 static");
	 }
}
public class Const extends Super {
	 static{
		 System.out.println("in sub static");
		 
	 }
	 {
		 this.m1();
	 }
	Const(){
		super(10);
		System.out.println("in Const");
	}
	  void m1(){
		 
		 System.out.println("in sub m1 static");
		 super.m1();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super ncs=new Const();
		Super sup=new Super();
		int a=0;
		while(a<9);{
System.out.println("6566");
		}
			
		
		//Const ncs1=(Const)sup;
		//ncs.m1();
		

		
	}

}
