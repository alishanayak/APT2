public class CounterAttack {
	public int[] analyze(String str, String[] words) {
		String[] parts = str.split(" ");
		int[] counts = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			counts[i] = count(words[i], parts);
		}
		return counts;
	}

	private int count(String s, String[] words) {
		int count = 0;
		for (String str : words) {
			if (s.equals(str)) {
				count = count + 1;
			}
		}
		return count;
	}
}