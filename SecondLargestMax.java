package logic.searching.sorting;

public class SecondLargestMax {

	public static int secondNumber(int []arr) {
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			if(secMax<arr[i]&&arr[i]!=max)
				secMax=arr[i];
			
			
		}
		return secMax;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {23,11,1,34,99,100,21,4,32,121};
         
         System.out.println("he second largest number is: "+secondNumber(arr));
	}

}
