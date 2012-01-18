package collector;

public class DiscCollector {
	public static void main(String[] args) {
		
	}
}

class Disc {
	private String discType;
	private int id;
	
	public Disc(int id,String type){
		setId(id);
		setDiscType(type);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getDiscType() {
		return discType;
	}


	public void setDiscType(String discType) {
		this.discType = discType;
	}		
}

class Movie extends Disc{
	private String movieName;
	private String genre;
	private int releaseYear;
	private String imdb;
	
	public Movie(int id,String disc,String name,String genre,int year,String imdb){
		super(id,disc);
		setMovieName(name);
		setGenre(genre);
		setReleaseYear(year);
		setImdb(imdb);		
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}

class Software extends Disc{
	private String softwareName;
	private String softwareType;
	private String publisher;
	private String version;
	
	public Software(int id,String disc,String name,String version,String type,String publisher){
		super(id,disc);
		setSoftwareName(name);
		setVersion(version);
		setSoftwareType(type);
		setPublisher(publisher);
	}
	
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getSoftwareType() {
		return softwareType;
	}
	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}

class Game extends Disc{
	private String game;
	private int releaseYear;
	private String publisher;
	
	public Game(int id,String disc,String name,int year,String publisher){
		super(id,disc);
		setGame(name);
		setReleaseYear(year);
		setPublisher(publisher);
	}
	
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
}


