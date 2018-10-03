
public class Tester {
	
	public static void main(String[] args) {
		MemberCheck m = new MemberCheck();
		String[] club1 = {"Bob", "Joe", "Sam"};
		String[] club2 = {"Bob", "Jill"};
		String[] club3 = {"Bob", "Jill"};
		for (String s : m.whosDishonest(club1, club2, club3)) {
			System.out.println(s);
		}
	}
}
