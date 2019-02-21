package logic.misc;



class Foo{
	int i=0;
	void d(String s){
		i=1;
	}
}
public class BlueOpt extends Foo {

	private BlueOpt	(int s){
		System.out.println(s);
	}
	int a =5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlueOpt f =new BlueOpt(10);
		int a =10;
		System.out.println(a);
boolean b1 = true;
boolean b2= false;
boolean  b3 = true;

if(b1&b2  | b2&b3 |b2){
	System.out.println("ok");
}

if(b1&b2  | b2&b3 |b2 |b1){
	System.out.println("yes");
}

long a1[]= {3,4,5};
long a2[]= fix(a1);
System.out.println(a1[0]+""+a1[1]+""+a1[2]);
System.out.println(a2[0]+""+a2[1]+""+a2[2]);
	}
	static long [] fix(long []a3){
		 a3[1]=7;
		 return a3;
	}
}
