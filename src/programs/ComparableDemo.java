package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {
	String name;
	double rating;
	int year;

	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	@Override
	public int compareTo(Movie other) {
		return this.year - other.year; // Ascending by year
	}

	@Override
	public String toString() {
		return name + " (" + year + ")";
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("Interstellar", 8.6, 2014), 
				new Movie("Inception", 8.8, 2010),
				new Movie("Tenet", 7.5, 2020));

		Collections.sort(movies); // Uses compareTo()
		movies.forEach(System.out::println);
	}
}