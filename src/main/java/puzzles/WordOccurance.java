package puzzles;

import java.util.HashMap;
import java.util.Map;

/**
 * The program shows which word is the most often occur in a text.
 * @author tstsvetk
 *
 */
public class WordOccurances {
	private static String text = "Upload an image to  determine how much text is in your ad image. If the proportion of text to image is too high, your ad may not reach its full audience ";

	
	private static void getWord(Map<String, Integer> mapWords) {
		String[] words = text.replaceAll("[\\.$|,|;|']", "").split(" ");
		for (String word : words) {
			Integer count = mapWords.get(word);
			if (count != null) {
				count++;
			} else {
				count = 1;
			}
			mapWords.put(word, count);
		}
	}

	private static int getMaxOccurance(Map<String, Integer> mapWords) {
		int max = 1;
		for (Map.Entry<String, Integer> word : mapWords.entrySet()) {
			if (word.getValue() > max) {
				max = word.getValue();
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		getWord(map);
		int maxOccurance = getMaxOccurance(map);

		for (Map.Entry<String, Integer> mapNew : map.entrySet()) {
			if(mapNew.getValue() == maxOccurance) {
				System.out.println(mapNew);
			}
		}
	}
}
