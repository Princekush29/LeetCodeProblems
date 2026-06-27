	package programs.String;
	
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;
	
	public class LoanComparison {
	
	    static class Installment {
	        LocalDate date;
	        double amount;
	
	        Installment(String date, double amount) {
	            this.date = LocalDate.parse(date);
	            this.amount = amount;
	        }
	    }
	
	    public static void main(String[] args) {
	        double annualRate = 7.5; // Interest Rate
	        double monthlyEMI = 100000;
	        LocalDate possessionDate = LocalDate.parse("2029-10-29");
	
	        // Scenario A: Demand in every 3 months (faster demand)
	        List<Installment> fasterDemand = new ArrayList<>();
	        fasterDemand.add(new Installment("2025-01-14", 1200000));//14th Jan 2025
	        fasterDemand.add(new Installment("2025-04-16", 1200000));//16th April 2025
	        fasterDemand.add(new Installment("2025-05-27", 1200000));//27th May 2025
	        fasterDemand.add(new Installment("2025-10-30", 1800000));//30th Oct 2025
	        fasterDemand.add(new Installment("2026-02-06", 1800000));//6th Feb 2026
	        // (Assuming 6th installment hits shortly after)
	        //fasterDemand.add(new Installment("2026-06-01", 1800000)); 
	
	        // Scenario B: There is 6month gap between each installment
	        List<Installment> standardDemand = new ArrayList<>();
	        standardDemand.add(new Installment("2025-01-14", 1200000));//14th Jan 2025
	        standardDemand.add(new Installment("2025-07-14", 1200000));//14th July 2025
	        standardDemand.add(new Installment("2026-01-14", 1200000));//14th Jan 2026
	        standardDemand.add(new Installment("2026-07-14", 1800000));//14th July 2026
	        standardDemand.add(new Installment("2027-01-14", 1800000));//14th Jan 2027
	
	        double interestA = simulate(fasterDemand, monthlyEMI, annualRate, possessionDate);
	        double interestB = simulate(standardDemand, monthlyEMI, annualRate, possessionDate);
	
	        System.out.println("=== COMPARISON RESULT ===");
	        System.out.printf("Total Interest (Faster Demand):   Rs. %,.2f%n", interestA);
	        System.out.printf("Total Interest (Standard 25%%):   Rs. %,.2f%n", interestB);
	        System.out.println("-----------------------------------------");
	        System.out.printf("EXTRA INTEREST PAID:             Rs. %,.2f%n", (interestA - interestB));
	    }
	
	    public static double simulate(List<Installment> schedule, double emi, double rate, LocalDate end) {
	        double principal = 0;
	        double totalInterest = 0;
	        LocalDate current = schedule.get(0).date;
	        int index = 0;
	
	        while (current.isBefore(end)) {
	            while (index < schedule.size() && !current.isBefore(schedule.get(index).date)) {
	                principal += schedule.get(index).amount;
	                index++;
	            }
	            double monthlyInterest = (principal * (rate / 100)) / 12;
	            totalInterest += monthlyInterest;
	            
	            // Adjust principal based on EMI
	            principal -= (emi - monthlyInterest);
	            if (principal < 0) principal = 0;
	
	            current = current.plusMonths(1);
	        }
	        return totalInterest;
	    }
	}