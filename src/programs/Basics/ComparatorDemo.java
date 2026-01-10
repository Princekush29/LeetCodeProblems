package programs.Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie1 {
    String name;
    double rating;
    int year;

    public Movie1(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " (" + rating + ")";
    }
}

class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m2.rating, m1.rating); // Descending by rating
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Interstellar", 8.6, 2014),
            new Movie("Inception", 8.8, 2010),
            new Movie("Tenet", 7.5, 2020)
        );

        Collections.sort(movies, new RatingComparator());
        movies.forEach(System.out::println);
    }
}