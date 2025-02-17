package Movies;

import java.util.List;
import java.util.Scanner;


public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieService movieService = new MovieService();
        List<Movie> movies = movieService.createMovieSet();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMovie Management System:");
            System.out.println("1. Display Movies");
            System.out.println("2. Sort by Language");
            System.out.println("3. Sort by Director");
            System.out.println("4. Sort by Duration");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    movies.forEach(System.out::println);
                    break;
                case 2:
                    movieService.sortByLanguage(movies);
                    System.out.println("Movies sorted by language:");
                    movies.forEach(System.out::println);
                    break;
                case 3:
                    movieService.sortByDirector(movies);
                    System.out.println("Movies sorted by director:");
                    movies.forEach(System.out::println);
                    break;
                case 4:
                    movieService.sortByDuration(movies);
                    System.out.println("Movies sorted by duration:");
                    movies.forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}

