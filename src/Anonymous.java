public class Anonymous {
	public int howMany(String[] headlines, String[] messages) {
		
		int[] hCount = new int[26];
		
		for (int i = 0; i < headlines.length; i++) {
			headlines[i] = headlines[i].toLowerCase();
			char[] letters = headlines[i].toCharArray();
			for (char c : letters) {
				if (c != ' ') {
					hCount[c - 97] = hCount[c - 97] + 1;
				}
			}
		}
		
		int totalCount = 0;
		
		for (int i = 0; i < messages.length; i++) {
			messages[i] = messages[i].toLowerCase();
			char[] letters = messages[i].toCharArray();
			int[] mCount = new int[26];
			for (char c : letters) {
				if (c != ' ') {
					mCount[c - 97] = mCount[c - 97] + 1;
				}
			}

			
			boolean canBeDone = true;
			for (int j = 0; j < 26; j++) {
				if (mCount[j] > hCount[j]) {
					canBeDone = false;
					break;
				}
			}
			if (canBeDone) {
				totalCount = totalCount + 1;
			}

		}
		
		return totalCount;
	}
}