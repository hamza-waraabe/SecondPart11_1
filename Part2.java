import java.util.Scanner;


public class Part2 { 
 	public static void main(String[] args) { 
 		System.out.println(h(input())); 
 		System.out.println(f(input(), input())); 
 		System.out.println(g(input(),input(),input())); 
 		 
 			 
 	} 
 	public static double h(double x){ 
 		return Math.pow(x, 10); 
 	} 
 	public static double f(double x, double y) 
 	{ 
 		return x+y; 
 	} 
 	public static double g(double x, double y, double z) 
 	{ 
 	return Math.sqrt(x)+Math.abs(y)+Math.pow(z,y); 
 	} 
 	public static double input() 
 	{ 
 		System.out.println("Enter a number"); 
 		Scanner keyboard = new Scanner(System.in); 
 		return keyboard.nextDouble(); 
 	} 
 } 

