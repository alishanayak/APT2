import java.util.ArrayList;

public class Starter {
	public int begins(String[] words, String first) {
		ArrayList<String> checked = new ArrayList<String>();
		int count = 0;
		char c = first.charAt(0);
		for (String s : words) {
			if (!alreadychecked(s,checked) && s.charAt(0) == c) {
				count = count + 1;
				checked.add(s);
			}
		}
		return count;
	}

	private boolean alreadychecked(String s, ArrayList<String> checked) {
		for (String str : checked) {
			if (s.equals(str)) {
				return true;
			}
		}
		return false;
	}
}