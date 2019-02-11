/*
Author: Adam Carling
Date: 02/06/19
Program takes a string from the user and finds the longest sorted portion.

The Big O notation for this program is: O(n) 



*/
import java.util.*;

class EffecientString {
	public static void main(String[] args) {
		System.out.print("Enter a random set of characters please: ");
		
		Scanner input = new Scanner(System.in);
		String fullString = input.nextLine().trim().toLowerCase();
		String maxString = " ";
		String tempString = " ";
		int goFrom = 0;
		int stopAt = 0;
		String char1 = " ";
		String char2 = " ";
		int length = fullString.length();
		
		for(int x =0; x < length-1; x++){
			char1 = fullString.substring(x,x+1);
			char2 = fullString.substring(x+1,x+2);
			
			if(char1.compareTo(char2)  < 0){
				stopAt = x+2;
				tempString = fullString.substring(goFrom, stopAt);
				if(tempString.length() > maxString.length())
					maxString = tempString;
			}else{
				stopAt = x+1;
				tempString = fullString.substring(goFrom, stopAt);
				if(tempString.length() > maxString.length()){
					maxString = tempString;
					System.out.print(maxString);
				}
				goFrom = stopAt;
			}//end ifelse statement
		}//end for loop
		System.out.print(" this is the finale product: " + maxString);
	}//end main
}//end class