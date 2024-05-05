package leetCode;

public class DefangingAnIPAddress1108 {

	public static void main(String[] args) {

		String address = "1.1.1.1";
		defangIPaddr(address);
	}

	public static String defangIPaddr(String address) {
		
		address = address.replace(".", "[.]");
		System.out.println(address);
		return address;
	}
}