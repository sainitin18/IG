package Movies;

import java.util.*;
import java.time.LocalDate;

public class MovieService{
	public List<Movie> createMovieSet() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Inception", "English", LocalDate.of(2010, 7, 16), "Christopher Nolan", "Emma Thomas", 2.8));
        movieList.add(new Movie("Parasite", "Korean", LocalDate.of(2019, 5, 30), "Bong Joon-ho", "Kwak Sin-ae", 2.1));
        movieList.add(new Movie("Dangal", "Hindi", LocalDate.of(2016, 12, 23), "Nitesh Tiwari", "Aamir Khan", 2.5));
        movieList.add(new Movie("Interstellar", "English", LocalDate.of(2014, 11, 7), "Christopher Nolan", "Emma Thomas", 2.9));
        movieList.add(new Movie("3 Idiots", "Hindi", LocalDate.of(2009, 12, 25), "Rajkumar Hirani", "Vidhu Vinod Chopra", 2.4));
        return movieList;
    }
	
	public void sortByLanguage(List<Movie> movieList) {
		Collections.sort(movieList);
    }
	
	public void sortByDirector(List<Movie> movieList) {
		Comparator<Movie> nameComparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getDirector().compareTo(m2.getDirector());
        }
    };
}
	public void sortByDuration(List<Movie> movieList) {
		Comparator<Movie> durationComparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return Double.compare(m1.getDuration(),m2.getDuration());
        }
    };
  }
	
}
