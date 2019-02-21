package logic.misc;

import java.util.Arrays;

public class MinBribe {
	 static void minimumBribes(int[] q) {
		   
		   int arr[]= new int[q.length];
		   for(int i=0;i<q.length;i++){
		       arr[i]=i+1;
		   }
		   System.out.println(Arrays.toString(arr));
		   boolean isPos= true;
		     int sum=0;
		   for(int i=0;i<q.length;i++){
		     int dif= q[i]-arr[i];
		     System.out.println(dif);
		     if(dif>2){
		         isPos=false;
		         //break;
		     }
		     if(dif>0)
		     sum= sum+dif;

		   }
		   if(isPos)
		   System.out.println(sum);
		   else
		   System.out.println("Too chaotic");

		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int []q= {2,1,5,3,4};
int []q= {1,2,5,3,7,8,6,4};


minimumBribes(q);
	}

}
