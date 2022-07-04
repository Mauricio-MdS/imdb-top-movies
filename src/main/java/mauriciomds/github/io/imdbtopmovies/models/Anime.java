package mauriciomds.github.io.imdbtopmovies.models;

public class Anime extends Content {

  public Anime(String title, String urlImage, String year, String info) {
    super(title, urlImage, year, info);
  }

  @Override
  public String getInfo(){
    return "★" + super.getInfo();
  }
  
}
