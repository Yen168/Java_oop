import java.util.Scanner;

public class Factorial {
	
	public static final void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("n!= ");
	
	int n = scanner.nextInt();
	int result = factorial(n);
	
	System.out.print( n +"!= "+result);
	
	}
	
	private static int factorial(int n){
	
	if (n <= 1) //stop condiction
		return 1;
	else 
	
		return n*factorial(n-1);
	
	} 







}