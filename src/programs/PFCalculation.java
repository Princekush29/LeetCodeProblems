package programs;

public class PFCalculation {

	public static void main(String[] args) {
		/*
		 * 1️⃣ Starting salary: ₹30,000/month 2️⃣ 10% of salary goes to PF every month.
		 * 3️⃣ Salary increases by 10% every year. 4️⃣ PF earns 8% annual interest,
		 * compounded monthly.
		 */
		System.out.println("Hello");
		double monthlyPF = 3000;
		double totalPF = 0;
		for (int i = 1, j = 1; i <= 20 ;j++) {
			totalPF = (totalPF + monthlyPF) * 1.08;

			if (j == 12) {
				monthlyPF = monthlyPF * 1.1;
				i++;
				j = 1;
			}
		}
		System.out.println("Monthly PF is " + monthlyPF);
		System.out.println("Total PF is " + totalPF);
	}
}