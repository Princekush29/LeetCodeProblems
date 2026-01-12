package programs.Basics;

public class Company extends Employee {

	@Override
	public void employeeID() {
		// TODO Auto-generated method stub
		System.out.println("Id is ");
	}

	private void clientId() {
		System.out.println("Client id is");
	}

	public static void main(String[] args) {

		Company b = new Company();
		b.employeeID();
		b.clientId();
		b.employeeName();

		Employee c = new Company();
		c.employeeID();
		//c.clientId();
		c.employeeName();
	}

}
