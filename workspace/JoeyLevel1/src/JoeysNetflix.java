import javax.swing.JOptionPane;

public class JoeysNetflix {
	public static void main(String[] args) {
		String[] movieNames = { "First Movie Ever Made", "Ant-Man", "Mission Impossible", "Movie with no name", "Avengers" };
		int[] ratings = { 1, 5, 4, 2, 5 };
		Movie[] movies = new Movie[movieNames.length];
		for (int i = 0; i < movies.length; i++) {
			movies[i] = new Movie(movieNames[i], ratings[i]);

			JOptionPane.showMessageDialog(null, movieNames[i] + " price is : "
					+ movies[i].getTicketPrice());
		}
		 NetflixQueue queue = new NetflixQueue();
		 for (int i = 0; i < movies.length; i++) {
			 queue.addMovie(movies[i]);
		}
		
		 queue.printMovies();
		 queue.sortMoviesByRating();
		 Movie bestMovie = queue.getBestMovie();
		 JOptionPane.showMessageDialog(null, "The best movie is " + bestMovie);
		 Movie secondBestMovie = queue.getMovie(1);
		 JOptionPane.showMessageDialog(null, "The second best movie is " + secondBestMovie);
	}
}
