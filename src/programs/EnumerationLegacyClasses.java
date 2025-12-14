package programs;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationLegacyClasses {

	public static void main(String[] args) {
		Vector<String> team = new Vector<>();
		team.add("Prince");
		team.add("Ravi");
		team.add("Sumit");

		Enumeration<String> members = team.elements();
		while (members.hasMoreElements()) {
			System.out.println(members.nextElement());
		}

		Vector<String> team1 = new Vector<>();
		team.add("Hello");
		team.add("Bye");
		team.add("Hi");

		Enumeration<String> members1 = team.elements();
		while (members.hasMoreElements()) {
			System.out.println(members.nextElement());
		}
	}
}
