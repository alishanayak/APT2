import java.util.ArrayList;

public class SimpleWordGame {
	public int points(String[] player, String[] dictionary) {
		ArrayList<String> guessed = new ArrayList<String>();
		int count = 0;
		for (String s : player) {
			if (!alreadyGuessed(s, guessed)) {
				if (isIn(s,dictionary)) {
					count = count + (int)Math.pow(s.length(),2);
				}
				guessed.add(s);
			}
		}
		return count;
	}


	private boolean isIn(String s, String[] dictionary) {
		for (String str : dictionary) {
			if (s.equals(str)) {
				return true;
			}
		}
		return false;
	}


	private boolean alreadyGuessed(String s, ArrayList<String> guessed) {
		for (String str : guessed) {
			if (s.equals(str)) {
				return true;
			}
		}
		return false;
	}
}