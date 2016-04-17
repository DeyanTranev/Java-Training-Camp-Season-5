package letters;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemoLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.replaceAll("\\s","");
		word = word.replaceAll("[^a-zA-Z]", "");
		word = word.toUpperCase();
		
		Map<Character, Integer> charCount = new TreeMap<Character, Integer>();
		for (int charIndex = 0; charIndex < word.length(); charIndex++) {
			if (!charCount.containsKey(word.charAt(charIndex))) {
				charCount.put(word.charAt(charIndex), 1);
			}
			else {
				charCount.put(word.charAt(charIndex), charCount.get(word.charAt(charIndex))+1);
			}
		}
		
		List<Character> sortedByOccurrence = new ArrayList<Character>();
		sortedByOccurrence.addAll(charCount.keySet());
		Collections.sort(sortedByOccurrence, (letter1, letter2) -> charCount.get(letter2)-charCount.get(letter1));
		
		for (Character letter: sortedByOccurrence ) {
			System.out.print(letter+" - ");
			System.out.format("%2d ",charCount.get(letter));
			double poundSigns = (double)charCount.get(letter) / charCount.get(sortedByOccurrence.get(0))*20;
			for (int i = 0; i < Math.round(poundSigns); i++) {
				System.out.print("#");
			}
			//System.out.print(poundSigns);
			System.out.println();
		}
		sc.close();
	}
}
