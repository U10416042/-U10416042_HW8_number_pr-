import java.util.*; 

public class TestNumber{ 
 	public static void main(String[] args){ 
 		Scanner input = new Scanner(System.in); 
		 
 		//Prompt
		System.out.println("Enter two numbers: "); 
		String number1 = input.next(); 
		String number2 = input.next(); 
 		Number test = new Number(number1,number2); 
 		 
 		//Choose the purpose 
 		System.out.println("What do you want to do ? (1)addition (2)subtraction:"); 
 		int calculate = input.nextInt(); 
 		 
 		int scale = Integer.MAX_VALUE; 
 		 
 		//Display result 
 		System.out.println("Result: " + test.getCalculate(calculate,scale)); 
 		 
	} 
} 
