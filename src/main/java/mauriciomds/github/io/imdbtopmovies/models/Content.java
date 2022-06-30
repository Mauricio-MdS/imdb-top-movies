package mauriciomds.github.io.imdbtopmovies.models;

public abstract class Content {

  private String title;
  private String urlImage;
  private String year;
  private String info;

  protected Content(String title, String urlImage, String year, String info) {
    this.title = title;
    this.urlImage = urlImage;
    this.year = year;
    this.info = info;
  }

  public String getTitle() {
    return this.title;
  }

  public String getUrlImage() {
    return this.urlImage;
  }

  public String getYear() {
    return this.year;
  }

  public String getInfo() {
    return this.info;
  }
}
