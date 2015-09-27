package ch05;

public class Smallest {

	public static void main(String[] args) {
		int counter;
		int smallest = Integer.MAX_VALUE;  //initialize to the largest integer possible
		int numValue;
		
		System.out.print("Please enter the count of the input:");
		int num = ScannerUtility.getArithmeticInput();  //Get the value of integer.
		
		for(counter = 1;counter <= num;counter++){
			System.out.printf("Please enter number %d:",counter);
			numValue = ScannerUtility.getArithmeticInput();
			
			if(numValue < smallest){ //Check the smallest running value
				smallest = numValue;  //store the smallest running value				
			}
		}
		System.out.printf("%nThe smallest number is:%d%n",smallest);  //Output smallest value
		

	}

}
