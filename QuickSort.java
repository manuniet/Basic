package logic.searching.sorting;

import java.util.Arrays;

public class QuickSort {

	static void sort(int arr[],int low, int end){
		if(low<end){
			int pi = partition(arr,low,end);
			System.out.println("pi is" +pi);
			sort(arr,low,pi-1);
			sort(arr,pi+1,end);
			
		}
	}
	
	static int  partition(int arr[], int low, int end){
		System.out.println("ss");
		int i=0;
		int pivot= arr[end];
		System.out.println("pivot is" +pivot);
		for(int j=0;j<end;j++){
			if(arr[j]<=pivot){
				int temp = arr[j];
				arr[j]= arr[i];
				arr[i]= temp;
				i++;
			}
		}
		
		int temp = arr[i];
		arr[i]=arr[end];
		arr[end]= temp;
		System.out.println(Arrays.toString(arr));
		return i;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={10,32,22,56,98,54,43,88};
sort(arr,0,arr.length-1);
System.out.println(Arrays.toString(arr));
	}

}
