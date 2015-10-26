package ch18;

public class RecursivePower {

	public static void main(String[] args){
		int base=0, exponent=0,result=0;
		
		System.out.print("Please enter base value:");
		
		
		while((base = ScannerUtility.getArithmeticInput()) != -1){  //Get the base value.
		
			System.out.print("Please enter exponent value:");
			if((exponent = ScannerUtility.getArithmeticInput())== -1){  //Get the exponent value
				break;
			}
			
			if(exponent < 0){
				System.out.println("Invalid value entered.");
			}
			
			result = IntegerPower(base,exponent);
			System.out.printf("%d raised to the power %d is %d",base,exponent,result);
			
			System.out.print("\nPlease enter base value:");
		}
	
	}
	
	public static int IntegerPower(int base,int exponent){
		if(exponent == 1){
			return base;
		}else{
			return base * IntegerPower(base,exponent - 1); 
		}
	}	
}
