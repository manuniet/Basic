package logic.misc;

interface A1111{
	void d1();
	void d2();
}
abstract class AD implements A1111{
	public void d2(){
		
	}
}
class AB extends AD implements A1111{
	public void d1(){
		
	}
}
class AC extends AB{
public void d1(){
		
	}
}
public class InterfaceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
