package StreamTask;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Candidate{
	String name ;
	String course;
	String city;
	int experience;
	public Candidate(String name, String course, String city, int experience) {
		this.name = name;
		this.course = course;
		this.city = city;
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", course=" + course + ", city=" + city + ", experience=" + experience + "]";
	}
	
}

public class CandidateStreamingOperations {

	public static void main(String[] args) {
		List<Candidate> candidates = InterviewRepository.getCandidateList();
		//list candidate names from Pune city
		System.out.println("List of Pune Candidates:");
	    candidates.stream().filter(c -> c.getCity().equals("Pune")).forEach(c -> System.out.println(c.getName()));

		//list city and count of candidates per city
		System.out.println("Candidate count per city");
		Map<String, Long> cityCount = candidates.stream()
                .collect(Collectors.groupingBy(Candidate::getCity, Collectors.counting()));
        cityCount.forEach((city, count) -> System.out.println(city + ": " + count));

		//list technical expertise and count of candidates
		System.out.println("Candidate count by Technical Expertise");
		Map<String, Long> expertiseCount = candidates.stream()
                .collect(Collectors.groupingBy(Candidate::getCourse, Collectors.counting()));
        expertiseCount.forEach((course, count) -> System.out.println(course + ": " + count));

		
		//list fresher candidates
		System.out.println("Fresher Candidate list");
		candidates.stream().filter(x->x.getExperience()==0).forEach(x->System.out.println(x.getName()));
        System.out.println("Sorted List of Candidates by Experience");

		//listing candidates with highest experience
//        Comparator<Candidate> comp = (n1,n2) -> n1.getExperience()>n2.getExperience()));
//        
		//sort the candidates by city name
        Comparator<Candidate> comp = (n1,n2) -> n1.getCity().compareTo(n2.getCity());
        candidates.stream().sorted(comp).forEach(System.out::println);
        
		printLine();
		System.out.println("Sorted List of Candidates by City Name");
	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}
}
