public class MathFunctions {
    
	public static final void main (String[] args) {

	int a, b, c, d;

	a = add (4,5);
	b = subtract(11, 6);
	c = multiply (23,3);
	d = divide (25 , 5);

	System.out.println ("A: " + a);
	System.out.println ("B: " + b);
	System.out.println ("C: " + c);
	System.out.println ("D: " + d);
	
	}
	
	public static int add (int num1, int num2){
		
		return num1+num2;
			
	}
	
	public static int subtract (int num1, int num2){
		
		return num1-num2;
		
	}
	
	public static int multiply (int num1, int num2){
	
		return num1*num2;
	
	}
	
	public static int divide (int num1, int num2){
	
		return num1/num2;
	
	}
}