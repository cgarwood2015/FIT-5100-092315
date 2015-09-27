package ch05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pie   

 {  
     public static void main( String[] args )   
     {
            
    	 double pi = 0.0; 
    	 boolean add = true; 
    	 final int MAX = 200009; 
    	 
    	 System.out.println("n\tpi\n");
    	 try {
			PrintWriter out = new PrintWriter(new FileWriter("output1.txt"));
			out.println("n\tpi\n");

			for (int i=1; i<=MAX; i+=2) { 
	    		 if (add) { 
	    			 pi += 4.0/i; 
	    		 } else { 
	    			 pi -= 4.0/i; 
	    		 } 
	    		 System.out.printf("%d\t%f%n",i,pi); 
	    		 out.println(i+"\t"+pi);
	    		 add = !add;
	    	 }//end loop
	    	 
	    	 out.close();
    	 
    	 
    	 
    	 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
     } 
 }
