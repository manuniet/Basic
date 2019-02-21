package logic.misc;

import java.io.*;  
class Parent11{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class TestExceptionChild5 extends Parent11{  
  void msg(){System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent11 p=new Parent11();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}  