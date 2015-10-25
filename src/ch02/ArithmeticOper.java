package ch02;

import java.util.Scanner;

public class ArithmeticOper {
	
	public void printArithmetics(){
		
		int oneArith = 0;
		int twoArith = 0;
		int sum = 0;
		int prod = 0;
		int diff = 0;
		int quot = 0;
		
		Scanner arithInput = new Scanner(System.in);
		
		System.out.print("Enter first integer:");
		oneArith = arithInput.nextInt();
		
		System.out.print("Enter second integer:");
		twoArith = arithInput.nextInt();
		
		sum = calculateSum(oneArith,twoArith);
		System.out.printf("Sum is:%d%n",sum);
		
		prod = calculateProduct(oneArith,twoArith);
		System.out.printf("Product is:%d%n",prod);
		
		diff = calculateDifference(oneArith,twoArith);
		System.out.printf("Difference is:%d%n",diff);

		try{
			quot = calculateQuotient(oneArith,twoArith);
			System.out.printf("Quotient is:%d",quot);
		}catch(ArithmeticException e){
			System.out.println("Unable to find the quotient of the two numbers");
		}
		catch(Exception x){
			System.out.println("An error has occurred with the current operation.");
		}
		
		arithInput.close();
		
	}
	
	private int calculateSum(int fArith,int sArith){		
		return fArith + sArith;
	}
	
	private int calculateProduct(int fArith,int sArith){
		return fArith * sArith;
	}
	
	private int calculateDifference(int fArith,int sArith){
		return fArith - sArith;
	}
	
	private int calculateQuotient(int fArith,int sArith) throws Exception{
		return fArith / sArith;
	}

	
}
