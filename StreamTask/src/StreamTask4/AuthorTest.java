package StreamTask4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AuthorTest implements AuthorService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Author> authors = Arrays.asList(
                new Author(123456789012L, "Sharma", "Amit", "Kumar", LocalDate.of(1985, 5, 10), "Male", "Delhi", 9876543210L),
                new Author(234567890123L, "Verma", "Sneha", "Gupta", LocalDate.of(1992, 3, 25), "Female", "Mumbai", 8765432109L),
                new Author(345678901234L, "Patel", "Raj", "Singh", LocalDate.of(1978, 11, 15), "Male", "Pune", 7654321098L),
                new Author(456789012345L, "Sharma", "Priya", "Devi", LocalDate.of(1995, 7, 30), "Female", "Delhi", 6543210987L)
        );
		AuthorTest a = new AuthorTest();
		System.out.println("Unique Surnames: "+a.getUniqueSurnames(authors));
		System.out.println("AuthorsByCity : "+a.getAuthorsByCity(authors,"Delhi"));
		System.out.println("Female Avg Age : "+a.femaleAverageAge(authors));
		System.out.println("Get Moblie By Adhar : "+a.getMobileByAdhar(authors,123456789012L));
	}

	@Override
	public Set<String> getUniqueSurnames(List<Author> authorList) {
		// TODO Auto-generated method stub
		Set<String> s = authorList.stream().map(x->x.getSurname()).collect(Collectors.toSet());
		return s;
	}

	@Override
	public List<Author> getAuthorsByCity(List<Author> authorList, String city) {
		// TODO Auto-generated method stub
		List<Author> l = authorList.stream().filter(x->x.getCity().equals(city)).collect(Collectors.toList());
		return l;
	}

	@Override
	public double femaleAverageAge(List<Author> authorList) {
		// TODO Auto-generated method stub
		Double a = authorList.stream().filter(x->x.getGender().equals("Female")).collect(Collectors.averagingInt(x -> LocalDate.now().getYear() - x.getBirthdate().getYear()));
		return a;
	}

	@Override
	public Long getMobileByAdhar(List<Author> authorList, Long adharCard) {
		// TODO Auto-generated method stub
		Long m = authorList.stream().filter(x->x.getAdharCard().equals(adharCard)).map(x->x.getMobile()).findFirst().orElse(null);
		return m;
	}

}
