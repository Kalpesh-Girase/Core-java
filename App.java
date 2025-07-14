package com.sk;


public class App 
{
    public static void main( String[] args )
    {
    	
        //System.out.println( "Hello World!" );
   
        
     Student s = new Student();
    s.StudentData();
    System.out.println("/-----------------------------/");
    s.StudentName();
     
    
   System.out.println( s.getClass() );
   System.out.println(s);
   
      
    }
}
