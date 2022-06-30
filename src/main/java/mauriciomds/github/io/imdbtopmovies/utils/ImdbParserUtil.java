package mauriciomds.github.io.imdbtopmovies.utils;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import mauriciomds.github.io.imdbtopmovies.models.Content;
import mauriciomds.github.io.imdbtopmovies.models.Movie;

public interface ImdbParserUtil extends JsonParserUtil{

  public static List<Content> stringToListOfContent(String string) {
    JsonArray arrayOfContent = JsonParser.parseString(string).getAsJsonObject().getAsJsonArray("items");

    List<Content> content = new ArrayList<>();

      	for (int i = 0; i < arrayOfContent.size(); i++) {
      		JsonObject unparsedContent = arrayOfContent.get(i).getAsJsonObject();
      		content.add(new Movie(
      			unparsedContent.get("title").getAsString(),
      			unparsedContent.get("image").getAsString(),
      			unparsedContent.get("year").getAsString(),
						unparsedContent.get("imDbRating").getAsString()
      		));
      	}
        return content;
  }
  
}
