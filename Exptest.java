package logic.misc;

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

public class Exptest {


    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
    	int count=0;
 
        if(n<6){
        	 Pattern p = Pattern.compile("[!@#$%^&*()-+]");
             Matcher m = p.matcher(password);
             boolean isS = m.find();
             System.out.println(isS);
             Pattern p1 = Pattern.compile("[A-Z]");
             Matcher m1 = p1.matcher(password);           
             boolean isU = m1.find();
             System.out.println(isU);
             Pattern p2 = Pattern.compile("[a-z]");
             Matcher m2 = p2.matcher(password);           
             boolean isL = m2.find();
             System.out.println(isL);
             Pattern p3 = Pattern.compile("[0-9]");
             Matcher m3 = p3.matcher(password);           
             boolean isD = m3.find();
             System.out.println(isD);
           Boolean c[]=new Boolean[4];
           c[0]=isS;
           c[1]=isU;
           c[2]=isL;
           c[3]=isD;
           for(int i=0;i<c.length;i++){
        	   if(c[i]==false)
        		   ++count;
           }
          int temp=n+count;
           if(temp>=6)
           return count;
           else
        	   return count+(6-count-n);

       }
        else if(n>=6){
        	 Pattern p = Pattern.compile("[!@#$%^&*()+-]");
             Matcher m = p.matcher(password);
             boolean isS = m.find();
             System.out.println(isS);
             Pattern p1 = Pattern.compile("[A-Z]");
             Matcher m1 = p1.matcher(password);           
             boolean isU = m1.find();
             Pattern p2 = Pattern.compile("[a-z]");
             Matcher m2 = p2.matcher(password);           
             boolean isL = m2.find();
             Pattern p3 = Pattern.compile("[0-9]");
             Matcher m3 = p3.matcher(password);           
             boolean isD = m3.find();
           Boolean c[]=new Boolean[4];
           c[0]=isS;
           c[1]=isU;
           c[2]=isL;
           c[3]=isD;
           for(int i=0;i<c.length;i++){
        	   if(c[i]==false)
        		   ++count;
           }
        }
            
        return count;
    }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = "AUzs-nV";
	        int n=s.length();
	        int result = minimumNumber(n,s);
	        System.out.println(result);
	    }
	}
