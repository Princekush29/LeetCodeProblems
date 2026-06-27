package programs.String;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoanComparison1 {

	static class Installment {
		LocalDate date;
		double amount;

		Installment(String date, double amount) {
			this.date = LocalDate.parse(date);
			this.amount = amount;
		}
	}

	public static void main(String[] args) {
		// --- Core Variables ---
		double annualRate = 7.5;
		double monthlyEMI = 100000;
		int emiDay = 2; // EMI deducted on the 2nd
		LocalDate possessionDate = LocalDate.parse("2029-10-29");

		// --- Amount Variables ---
		double amount12L = 1200000;
		double amount18L = 1800000;

		// --- Scenario A: Faster Demand Dates ---
		List<Installment> fasterDemand = new ArrayList<>();
		fasterDemand.add(new Installment("2025-01-14", amount12L));
		fasterDemand.add(new Installment("2025-04-16", amount12L));
		fasterDemand.add(new Installment("2025-05-27", amount12L));
		fasterDemand.add(new Installment("2025-10-30", amount18L));
		fasterDemand.add(new Installment("2026-02-06", amount18L));
		fasterDemand.add(new Installment("2026-05-06", amount18L));
		fasterDemand.add(new Installment("2026-11-06", amount18L));

		// --- Scenario B: Standard Demand (6-Month Gaps) ---
		List<Installment> standardDemand = new ArrayList<>();
		standardDemand.add(new Installment("2025-01-14", amount12L));
		standardDemand.add(new Installment("2025-07-14", amount12L));
		standardDemand.add(new Installment("2026-01-14", amount12L));
		standardDemand.add(new Installment("2026-07-14", amount18L));
		standardDemand.add(new Installment("2027-01-14", amount18L));
		standardDemand.add(new Installment("2027-07-14", amount18L));
		standardDemand.add(new Installment("2028-01-14", amount18L));

		// --- Execution ---
		double interestA = simulateDaily(fasterDemand, monthlyEMI, annualRate, possessionDate, emiDay);
		double interestB = simulateDaily(standardDemand, monthlyEMI, annualRate, possessionDate, emiDay);

		// --- Output ---
		System.out.println("=== DAILY REDUCING BALANCE CALCULATION ===");
		System.out.println("EMI Date: " + emiDay + "nd of every month");
		System.out.println("-------------------------------------------");
		System.out.printf("Total Interest (Faster Demand):   Rs. %,.2f%n", interestA);
		System.out.printf("Total Interest (Standard Demand): Rs. %,.2f%n", interestB);
		System.out.println("-------------------------------------------");
		System.out.printf("EXTRA INTEREST COST:             Rs. %,.2f%n", (interestA - interestB));
	}

	/**
	 * Simulates loan interest on a daily reducing balance.
	 */
	public static double simulateDaily(List<Installment> schedule, double emi, double annualRate, LocalDate end,
			int emiDay) {
		double principal = 0;
		double totalInterestPaid = 0;
		double accruedInterestThisMonth = 0;

		// Start simulation from the first installment date
		LocalDate current = schedule.get(0).date;
		int index = 0;

		while (current.isBefore(end)) {
			// 1. Add Installment to Principal if today is the disbursement date
			while (index < schedule.size() && current.equals(schedule.get(index).date)) {
				principal += schedule.get(index).amount;
				index++;
			}

			// 2. Calculate Daily Interest: (P * R * 1) / (100 * 365)
			// Note: Using 365.0 to ensure double precision
			double dailyInterest = (principal * (annualRate / 100.0)) / 365.0;
			accruedInterestThisMonth += dailyInterest;
			totalInterestPaid += dailyInterest;

			// 3. Apply EMI on the 2nd of the month
			if (current.getDayOfMonth() == emiDay) {
				// The bank takes the accrued interest first, then the rest hits the principal
				double reductionAmount = emi - accruedInterestThisMonth;
				principal -= reductionAmount;

				if (principal < 0)
					principal = 0;

				// Reset the monthly interest counter as it has been 'paid' via EMI
				accruedInterestThisMonth = 0;
			}

			current = current.plusDays(1);
		}
		return totalInterestPaid;
	}
}