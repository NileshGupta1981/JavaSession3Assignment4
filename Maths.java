import java.util.Scanner;


public class Maths {
	
	public static void main (String args[]){
	Scanner scnr = new Scanner(System.in);
	double num;
    double numsqrt;
    double numcbrt;
	
	System.out.println ("Enter the number to find root");
	num= scnr.nextDouble();
	numsqrt = sqrt1(num);
	numcbrt = cbrt1(num);
	System.out.println ("The square root of number is"+numsqrt);
	System.out.println ("The cube root of number is"+numcbrt);
	
	scnr.close();
	}
	
	public static double sqrt1(double number ){
		
		return Math.sqrt(number)	;
		}
	
	public static double cbrt1(double number ){
		
		return Math.cbrt(number)	;
		}
}
