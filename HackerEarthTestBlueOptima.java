package logic.misc;

import java.util.HashMap;
import java.util.Map;


public class HackerEarthTestBlueOptima {
public static String isDeliverable(int n, int m, int X[], int Y[]){
	
	Map<Integer,Integer> map = new HashMap<>();
	String isSuccess = "Yes";
	boolean isDel = true;
	if(m<=0){
		return "No";
	}
	for(int i=0;i<m;i++){
		
		if(map.containsKey(X[i])){
			map.put(X[i], map.get(X[i])+1);
		}else{
			map.put(X[i], 1);
		}
		if(map.containsKey(Y[i])){
			map.put(Y[i], map.get(Y[i])+1);
		}else{
			map.put(Y[i], 1);
		}
	}
	
	System.out.println(map);
	for(Map.Entry<Integer, Integer> it:map.entrySet()){
		if(it.getValue()%2!=0){
			isDel = false;
			break;
			
		}
	}
	if(!isDel)
	isSuccess = "No";
	return isSuccess;
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int houseNo = 3;
		
		int pairOfV = 3;
		
		int arr1[] ={3,1,2};//{1,2,1};
		int arr2[] ={2,2,1}; //{2,3,3};
		System.out.println(isDeliverable(houseNo,pairOfV,arr1,arr2));
		
		
		
		
	}

}
