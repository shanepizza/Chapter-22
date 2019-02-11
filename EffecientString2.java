/*
Author: Adam Carling
Date: Feb 8, 2019. 7:31 AM





*/
import java.util.*;


class EffecientString2 {
	public static void main(String[] args) {
		
	//Declaring variables and asking the user for input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a random word: ");
		String string1 = input.nextLine().trim().toLowerCase();
		System.out.print("Enter a sub word that is shorter than the first word: ");
		String string2 = input.nextLine().trim().toLowerCase();
		String tempString = " ";
		int length2 = string2.length();
		int length1 = string1.length();
		
	//single for loop to sort through string once. 	
		if(length2 < length1){
			for(int x =0; x < length1 - (length2-1); x++){
				tempString = string1.substring(x, length2 + x);
				if(string2.equals(tempString)){
					System.out.println("Yes! The substring was found in the main string!");
					length2 = length1+1;
				}//end if statement
				
				if(x == length1 - (length1-(length2 -1))){
					System.out.println("End of string reached. No substring was found.");
				}//end if
			}//end for loop
		}else{
			System.out.println("Why do you do this to me?");
		}//end if else
		
		
		
	}//end main method
}//end class EffecientString2