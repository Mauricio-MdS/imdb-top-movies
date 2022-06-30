package mauriciomds.github.io.imdbtopmovies.models;

public class Movie extends Content {

  public Movie(String title, String urlImage, String year, String info) {
    super(title, urlImage, year, info);
  }

  @Override
  public String getInfo(){
    return "★" + super.getInfo();
  }
  
}
