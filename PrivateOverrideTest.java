package logic.misc;


public class PrivateOverrideTest extends Parent1 {

	 private void test(){
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivateOverrideTest pt = new PrivateOverrideTest();
		pt.test();
	}

}
class Parent1{
	 private void test(){
		System.out.println("Parent");
	}
	
}