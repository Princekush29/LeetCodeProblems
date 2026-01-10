package programs.Collections;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationLegacyClasses {

	public static void main(String[] args) {
		Vector<String> team = new Vector<String>();
		team.add("Prince");
		team.add("Ravi");
		team.add("Sumit");

		Enumeration<String> members = team.elements();
		while (members.hasMoreElements()) {
			System.out.println(members.nextElement());
		}

	}
}
