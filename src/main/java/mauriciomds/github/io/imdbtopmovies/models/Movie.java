package mauriciomds.github.io.imdbtopmovies.models;

public class Movie {

  private String title;
  private String urlImage;
  private String rating;
  private String year;

  public Movie(String title, String urlImage, String rating, String year) {
    this.title = title;
    this.urlImage = urlImage;
    this.rating = rating;
    this.year = year;
  }

  @Override
  public String toString() {
    return "[title=" + title + ", year=" + year + ", urlImage=" + urlImage + ", rating=" + rating + "]";
  }

  

  
}
