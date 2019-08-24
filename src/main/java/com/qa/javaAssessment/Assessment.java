package com.qa.javaAssessment;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	
	//NOT FINISHED
	public String getBert(String input) {
		String newString = "";
		String reverseString = "";
		
		for (int i = 0; i<input.length()-1;i++) {
			if(i == input.length()-4) {
				break;
			}
			
			if(!(input.substring(i, i+4).equals("bert"))){
				newString += input.substring(i);
			}
		}
		for(int j = newString.length(); j>0;j--) {
			reverseString += newString.substring(j, j+1);
		}
		
		return reverseString;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	
	//UNFINISHED
	public boolean evenlySpaced(int a, int b, int c) {
		
		
		int large = 0;
		int medium = 0;
		int small = 0;
		
		//a large b medium c small
		if((a>b && a>c)&&(b>c)) {
			large = a;
			medium = b;
			small = c;
		}
		//b large, a medium, c small
		else if ((a>b && a>c)&& (c>b)) {
			large = a;
			medium = c;
			small = b;
		}
		else if((b>a && b>c)&&(a>c)) {
			large = b;
			medium = a;
			small = c;
		}
		else if((b>a && b>c)&&(c>a)) {
			large = b;
			medium = c;
			small = a;
		}
		else if((c>a && c>b)&&(a>b)) {
			large = c;
			medium = a;
			small = b;
		}
		else if((c>a && c>b)&&(b>a)) {
			large = c;
			medium = b;
			small = a;
		}
		
		if ((large - medium) == (medium - small)){
			return true;
		}
		else {
			return false;
		}
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	//UNFINISHED
	public String nMid(String input, int a) {
		
		String returnString = "";
		
		for(int i = 0; i<input.length();i++) {
			if(i == input.length()/2) {
			returnString = input.substring(i,i+a);
		}
		}
		
		return "";
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	//NOT DONE!!
	public int superBlock(String input) {
		
		int count = 1;
		int prevCount = 0;
		
		for(int i = 0; i<input.length()-1;i++) {
			
			if(input.substring(i, i+1) == input.substring(i+1,i+2)){
				if(prevCount<=count)
				count +=1;
				prevCount = count;
			}
			
		}
		return count;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		
		int count = 0;
		
		for(int i = 0; i<arg1.length()-1; i++) {
			if(i == arg1.length()-3) {
				break;
			}
			if((arg1.substring(i, i+2).equals("Am")) || (arg1.substring(i, i+2).equals("am"))|| (arg1.substring(i, i+3).equals("Am "))|| (arg1.substring(i, i+3).equals(" am"))) {
				count += 1;
			}
		}
		return count;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		
		if((arg1%3 == 0)&&(arg1%5 ==0)) {
			return "fizzbuzz";
		}
		else if ((arg1%3 == 0) && (!(arg1%5 ==0))) {
			return "fizz";
		}
		else if((arg1%5 == 0) && (!(arg1%3 == 0))) {
			return "buzz";
		}
		
		
		return null;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		int i = 0;
		int num;
		int sum = 0;
		int prevSum1 = 0;
		int prevSum2 = 0;
		
		while (i<arg1.length()-1) {	
		i++;
		
		switch(arg1.charAt(i)) {
		case ' ':
		{ 
			if (i>4) {
			prevSum2 = prevSum1;	
			}
			else {
			prevSum1 = sum;
			}
			sum = 0;
			break;
		}
		
		case '1':
		{
			num = 1;
			sum += num;
			break;
		}
		case '2':
		{
			num = 2;
			sum += num; 
			break;
		}
		case '3':
		{
			num = 3;
			sum += num;
			break;
		}
		case '4':
		{
			num = 4;
			sum += num; 
			break;
		}
		case '5':
		{
			num = 5;
			sum += num; 
			break;
		}
		case '6':
		{
			num = 6;
			sum += num; 
			break;
		}
			
		case '7':
		{
			num = 7;
			sum += num; 
			break;
		}
		case '8':
		{
			num = 8;
			sum += num; 
			break;
		}
		case '9':
		{
			num = 9;
			sum += num; 
			break;
		}
		}
		
	}
		System.out.println(sum);
		System.out.println(prevSum1);
		System.out.println(prevSum2);
		if(sum>prevSum1 && sum>prevSum2) {
			return sum;
		}
		else if(prevSum1>sum && prevSum1>prevSum2) {
			return prevSum1;
		}
		else {
			return prevSum2;
		}
	
}
}
