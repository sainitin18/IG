package Movies;

import java.time.LocalDate;

public class Movie implements Comparable<Movie>{
	private String name;
    private String language;
    private LocalDate releaseDate;
    private String director;
    private String producer;
    private double duration;
    
    public Movie(String name, String language, LocalDate releaseDate, String director, String producer, double duration){
    	this.name = name;
        this.language = language;
        this.releaseDate = releaseDate;
        this.director = director;
        this.producer = producer;
        this.duration = duration;
    }
	public String getName() {
		return name;
	}
	public String getLanguage() {
		return language;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public String getDirector() {
		return director;
	}
	public String getProducer() {
		return producer;
	}
	public double getDuration() {
		return duration;
	}
	
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.language.compareToIgnoreCase(o.language);
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", language=" + language + ", releaseDate=" + releaseDate + ", director="
				+ director + ", producer=" + producer + ", duration=" + duration + "]";
	}    
}
