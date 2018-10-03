public class IsomorphicWords {
	
	public int countPairs(String[] words) {
		int pairs = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (isPair(words[i], words[j])) {
					pairs = pairs + 1;
				}
			}
		}
		
		return pairs;
	}

	public boolean isPair(String str1, String str2) {
		
		if (str1.length() != str2.length()) {
			System.out.println("different lengths");
			return false;
		}
		
		char newLetter = 'a';
		char[] s1 = str1.toCharArray();
		char[] newLetters1 = new char[26];
		
		for (int i = 0; i < s1.length; i++) {
			if (newLetters1[s1[i] - 97] == '\u0000') {
				newLetters1[s1[i] - 97] = newLetter;
				s1[i] = newLetters1[s1[i] - 97];
				newLetter++;
			} else {
				s1[i] = newLetters1[s1[i] - 97];
			}
		}
		
		newLetter = 'a';
		char[] s2 = str2.toCharArray();
		char[] newLetters2 = new char[26];
		
		for (int i = 0; i < s2.length; i++) {
			if (newLetters2[s2[i] - 97] == '\u0000') {
				newLetters2[s2[i] - 97] = newLetter;
				s2[i] = newLetters2[s2[i] - 97];
				newLetter++;
			} else {
				s2[i] = newLetters2[s2[i] - 97];
			}
		}

		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != s2[i]) {
				return false;
			}
		}
		return true;
	}
}