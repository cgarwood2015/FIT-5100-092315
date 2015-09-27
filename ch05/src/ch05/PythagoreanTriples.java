package ch05;

public class PythagoreanTriples {

	 public static void main( String args[] )
	 {
		 int x1,x2,x3;
		 
		 for ( x1 = 1; x1 <= 500; x1++ ){
			 for ( x2 = 1; x2 <= 500; x2++ ){
				 for ( x3 = 1; x3 <= 500; x3++ ){					  
					  if ((x1 * x1) + (x2 * x2) == (x3 * x3)){
						  System.out.printf( "s1-> %d, s2-> %d, h-> %d\n",x1, x2, x3 );
					  }  //end if
				 }  //end for
			 } //end for
		 } //end for	 

		  
	 }
}
