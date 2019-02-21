package logic.misc;


public class ArrayoutOfBoundCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			String arr[]=new String[2];
			arr[0]="";
			arr[1]="";
			String mappingVal="#";
			System.out.println("jnidjndi");
			String arr1[]=mappingVal.split("#");
			System.out.println("jnidjndi");
			arr[0]="aa";
			System.out.println("jnidjndi");
			if(null!=arr1 && arr1.length>1){
				System.out.println("jnidjndi");
			arr[1]=arr1[1];
			}
			System.out.println("jnidjndi");
			System.out.println(arr[0]+arr[1]);
		}catch(Exception e){
			System.out.println("Exception in :" +e);
		}

	}

}
