package logic.searching.sorting;

import java.util.Arrays;

public class MergeSort {
	
	static void sort(int arr[],int l, int r){
		if(l<r){
			int d=(l+r)/2;
			System.out.println("l,m,="+l+"  "+d);
			sort(arr,l,d);
			System.out.println("l2,m,="+l+"  "+r);
			sort(arr,d+1,r);
			merge(arr,l,d,r);
			
			
		}
	}
		static void merge(int arr[],int l,int m,int r){
			
			System.out.println("l,m,r="+l+"  "+m+"  "+r);
			int a1Size= m-l+1;
			int a2Size= r-l;
			int[] a1=new int[a1Size];
			int[] a2=new int[a2Size];
			int k=l;
			for(int i=0;i<a1Size;i++)
				a1[i]=arr[l+i];
			System.out.println(Arrays.toString(a1));
			for(int i=0;i<a2Size;i++)
				a2[i]=arr[m+1+i];
			System.out.println(Arrays.toString(a2));
			int i=0,j=0;
			while(i<a1Size && j<a2Size){
				
				if(a1[i]>=a2[j]){
					arr[k]=a2[j];
					j++;
				}else{
					arr[k]=a1[i];
					i++;
				}
				k++;
			}
			while(i<a1Size){
				arr[k]=a1[i];
				i++;k++;
				
			}
			
			while(j<a2Size){
				arr[k]=a2[j];
				j++;
				k++;				
			}
			
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch=97;
		if(ch==97){
			System.out.println(ch);
		}
		
		String str ="123ManojChauhan445";
		//str=str.toLowerCase();
		char arr[]=str.toCharArray();
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<arr.length;i++){
			
			for(char a=97,j=65;a<=122;a++,j++){
				
				if(arr[i]==a||arr[i]==j){
					sb.append(str.charAt(i));
				}
				
			}
			
		}
		str=sb.toString();
		System.out.println(str);
		
		
		
//      int []arr={22,1,54,2,66,91,7,32,3};
//sort(arr,0,arr.length-1);
//System.out.println(Arrays.toString(arr));
	}

}
