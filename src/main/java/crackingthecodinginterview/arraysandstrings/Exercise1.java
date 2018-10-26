package crackingthecodinginterview.arraysandstrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 * @author tsvetoslav
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter input String: ");
		String input = sc.nextLine();
		System.out.println("The input string is unique: " + isUniqueCharst(input));
	}

	public static boolean isUniqueCharst(String str) { 
		boolean[] char_set = new boolean[256];
		for(int i=0; i<str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
}
