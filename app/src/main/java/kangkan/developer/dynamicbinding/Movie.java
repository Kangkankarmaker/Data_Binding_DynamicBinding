package kangkan.developer.dynamicbinding;

public class Movie {

    private String title;
    private int releaseYear;
    private String director;
    private String moviePoster;

    public Movie(String title, int releaseYear, String director, String moviePoster) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
        this.moviePoster = moviePoster;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }
}
