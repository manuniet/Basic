package logic.misc;


public class Rectangle {

	int x,y;
	Rectangle(int x, int y){
	x=this.x;
	y=this.y;
	}
	static boolean doOverlap(Rectangle l1, Rectangle r1, Rectangle l2, Rectangle r2)
	{
	    // If one rectangle is on left side of other
	    if (l1.x > r2.x || l2.x > r1.x)
	        return false;
	 
	    // If one rectangle is above other
	    if (l1.y < r2.y || l2.y < r1.y)
	        return false;
	 
	    return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle l1= new Rectangle(0,10);
		Rectangle r1= new Rectangle(10,0);
		Rectangle l2= new Rectangle(5,5);
		Rectangle r2= new Rectangle(15,0);
		if (doOverlap(l1, r1, l2, r2))
	     System.out.println("Rectangles Overlap");
	    else
	    	 System.out.println("Rectangles Don't Overlap");

	}

}
