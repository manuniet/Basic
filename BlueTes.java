package logic.misc;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class BlueTes {
public static String isDeliverable(int n, int m, int X[], int Y[]){
	boolean[][] edges = new boolean[n][n];
	for(int i=0; i<m; i++){
        
        edges[X[i]-1][Y[i]-1] = true;
        edges[Y[i]-1][X[i]-1] = true;
    }
	System.out.println(Arrays.toString(edges));
	String isSuccess =check(new boolean[n], edges, 0, n, n)?"Yes":"No"; 
	return isSuccess;
	
}
static boolean check(boolean[] visited, boolean[][] edges, int vertex, int numberToVisit, int size){
    if(visited[vertex]){
        return false;
    }
    
    //Visiting conditions
    visited[vertex] = true;
    numberToVisit--;
    
    if(numberToVisit==0){
        return true;
    }
    
    int n;
    for(n=0; n<size; n++){
        if(edges[vertex][n] && check(visited, edges, n, numberToVisit, size)){
            return true;
        }
    }
    
    //Leaving conditions
    visited[vertex] = true;
    numberToVisit++;
    
    return false;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int houseNo = 3;
		
		int pairOfV = 3;
		
//		int arr1[] ={3,1,2};//{1,2,1};
//		int arr2[] ={2,2,1}; //{2,3,3};
		int arr1[] ={1,2,1};
		int arr2[] ={2,3,3};
		System.out.println(isDeliverable(houseNo,pairOfV,arr1,arr2));
		
		
		
		
	}

}
