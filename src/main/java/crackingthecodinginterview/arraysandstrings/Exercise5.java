package crackingthecodinginterview.arraysandstrings;

import java.util.Scanner;

/*
 * Write a method to replace all spaces in a string with ‘%20’.
 * */
public class Exercise5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter some string: ");
		String input = sc.nextLine();
		System.out.println(ReplaceSpaces(input));
	}

	public static String ReplaceSpaces(String str) {
		char[] charString = str.toCharArray();
		int spaceNumber = 0, newLenght;
		for (char character : charString) {
			if (character == ' ') {
				spaceNumber++;
			}
		}

		newLenght = charString.length + spaceNumber * 2;
		char[] newCharString = new char[newLenght];
		for (int i = charString.length - 1; i >= 0; i--) {
			if (charString[i] == ' ') {
				newCharString[newLenght - 1] = '0';
				newCharString[newLenght - 2] = '2';
				newCharString[newLenght - 3] = '%';
				newLenght = newLenght - 3;
			} else {
				newCharString[newLenght - 1] = charString[i];
				newLenght = newLenght - 1;
			}
		}

		return String.valueOf(newCharString);
	}
}
