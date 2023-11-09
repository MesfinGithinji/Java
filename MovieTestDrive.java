class Movie {
	//imstance variables
	String title;
	String genre;
	double rating;

	//methods(behaviour)
	void playMovie(){
		System.out.println("The movie is playing");
	}
}

public class MovieTestDrive {
	public static void main (String[] args){
		//instantiate our object of class movie
		Movie firstMovie = new Movie();
		//use dot notation to initalize the variables
		firstMovie.title = "Iron Man";
		firstMovie.genre = "Sc-Fi Action";
		firstMovie.rating = 8.5;
		//lets call the class method using our object
		firstMovie.playMovie();
		System.out.println("Movie Name: "+ firstMovie.title);
		System.out.println("Movie genre: "+ firstMovie.genre);
		System.out.println("IMDB rating: "+ firstMovie.rating);
	}
}
