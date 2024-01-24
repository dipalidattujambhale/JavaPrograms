package string;

public class Countvowels {

	public static void main(String[] args) {
		// Counter variable to store the count of vowels and consonant
		int vCount = 0;
		int cCount = 0;
		String str = "I am Dipali";
		// Converting entire string to lower case to reduce 
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			// Checks whether a character is a vowel
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			}
			// Checks whether a character is a consonant
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
	}

}
