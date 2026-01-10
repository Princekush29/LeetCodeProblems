package programs.Basics;

import java.util.*;

// 1. COMPARABLE: Defines the "Default" sort logic (by ID)
class Product implements Comparable<Product> {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Product other) {
		// Natural Order: Smallest ID to Largest ID
		// return Integer.compare(this.id, other.id); //ascending order
		// return Integer.compare(other.id, this.id); //descending order
		// return this.name.compareTo(other.name);//ascending order for name
		return other.name.compareTo(this.name);// descending order for name
	}

	@Override
	public String toString() {
		return String.format("ID: %d | Name: %-8s | Price: $%.2f", id, name, price);
	}
}

public class COMPARABLEMain1 {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		// Data with duplicate names to test the Comparator tie-breaker
		list.add(new Product(500, "Chair", 150.0));
		list.add(new Product(100, "Desk", 200.0));
		list.add(new Product(300, "Chair", 45.0)); // Same name as ID 500
		list.add(new Product(200, "Lamp", 30.0));
		list.add(new Product(400, "Desk", 500.0)); // Same name as ID 100

		// --- USING COMPARABLE ---
		// Java looks inside the Product class for the compareTo() method
		Collections.sort(list); // this is internally using comparable
		System.out.println("--- 1. Sorted by ID (Default Comparable) ---");
		list.forEach(System.out::println);

		// --- USING COMPARATOR (Multi-level) ---
		// We ignore the ID and force a sort by Name, then Price
		Comparator<Product> multiSort = Comparator.comparing((Product p) -> p.name).thenComparingDouble(p -> p.price);

		Collections.sort(list, multiSort);
		System.out.println("\n--- 2. Sorted by Name, then Price (Comparator) ---");
		list.forEach(System.out::println);
		// Sorting Logic:
		// 1. Name Descending (Z to A)
		// 2. Then Price Ascending (Low to High)
		Comparator<Product> customSort = Comparator.comparing((Product p) -> p.name, Comparator.reverseOrder())
				.thenComparingDouble(p -> p.price);

	}
}