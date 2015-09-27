package ch05;

public class Factorial {

	public static void main(String[] args) {
		System.out.println( "X\tX!\n" );
		
		for ( int increment = 1; increment <= 20; increment++ )
		 {
		 long factorial = 1;  //declare a new integer to hold the value
		
		 for ( int min = 1; min <= increment; min++ )
		 factorial *= min;
		
		 System.out.printf( "%d\t%d\n", increment, factorial );
		 } // end for loop		
	}

}

