package puzzles;

public class ReverseString {
	public static void main(String[] args) {
		String inputString = "My name is Tsetso";

		System.out.println("Reverse String using Java API: " + reverseJava(inputString));
		System.out.println("Reverse String using iteration: " + reverseStringBuilder(inputString));

	}

	// Using Java api of StringBuilder object
	public static String reverseJava(String input) {
		return new StringBuilder(input).reverse().toString();
	}

	// Iterate over the char array of String, using StringBuilder
	public static String reverseStringBuilder(String source) {
		int i, len = source.length();
		StringBuilder dest = new StringBuilder();
		for (i = (len - 1); i >= 0; i--) {
			dest.append(source.charAt(i));
		}
		return dest.toString();
	}

	// Reverse String using char array.
	public String reverseChar(String input) {

		int begin = 0;
		char[] in = input.toCharArray();
		// creating the output char array.
		int len = input.length();
		char[] out = new char[len];

		// looping on the input from the end to the beginning
		for (int end = len - 1; end >= 0; end--) {
			out[begin] = in[end];
			begin++;
		}

		return new String(out);
	}

	// the most efficient - go only on half of the char.
	public String reverseCharEffective(String input) {
		char[] in = input.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin) {
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in);
	}
}
