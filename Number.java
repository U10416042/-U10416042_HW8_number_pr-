import java.math.*; 

public class Number{  
 	BigDecimal number1,number2; 

 	Number(String newNumber1, String newNumber2){ 
 		number1 = new BigDecimal(newNumber1); 
 		number2 = new BigDecimal(newNumber2); 
 	} 
 	 
	String getCalculate(int check,int scale){ 
 		String result = ""; 
		if(check == 1) 
			result = String.valueOf(number1.add(number2));				 
		else if(check==2) 
			result = String.valueOf(number1.subtract(number2)); 
		return result;  	} 
} 
