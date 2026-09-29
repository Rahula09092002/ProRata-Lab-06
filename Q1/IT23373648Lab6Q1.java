import java.util.Scanner;

public class IT23373648Lab6Q1 {
 
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);

    System .out.print("Enter a number : ");
	double number = input. nextDouble();
	
	double squar = number * number ;
	double squarRoot = Math.sqrt(number);
	
	System.out.println("Squre = " + squar);
	System.out.println("Squre Root = " +squarRoot);
 }
}

