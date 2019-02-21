package logic.misc;


public class Bluesolv {

	public static String isDeliverable(int n, int m, int X[], int Y[]){
         boolean  arr[][]= new boolean  [n+1][n+1];
         
         for(int i =0;i<m;i++)
         {
              int a = X[i];
              int b = Y[i];
              arr[a][b]=true;
              arr[b][a]=true;
         }
         boolean visited[]= new boolean [n+1];
         visited[1]=true;
         boolean check= dfs(arr,1,visited,1);
         if(check){
         System.out.println("Yes");
         return "Yes";
         }
         else{
         System.out.println("No");
         return "No";
         }
         
     }
     
 
	public static boolean  dfs(boolean arr[][], int i, boolean visited[], int count1){
        
        int count=0;
        int n = visited.length-1;
        for(int j=2;j<=n;j++)
        {
           if(!visited[j]&&arr[i][j])
           {
               count++;
               visited[j]=true;
            if(dfs(arr,j,visited,count1+j))
              return true;;
               visited[j]=false;
           }
        }
        if(count==0)
        {
            if(count1!=(n*(n+1))/2)
             return false;
            else
            return true;
        }
        else
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
