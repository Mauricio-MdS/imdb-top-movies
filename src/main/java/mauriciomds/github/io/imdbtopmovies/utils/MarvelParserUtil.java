package mauriciomds.github.io.imdbtopmovies.utils;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import mauriciomds.github.io.imdbtopmovies.models.Content;
import mauriciomds.github.io.imdbtopmovies.models.MarvelSeries;

public interface MarvelParserUtil extends JsonParserUtil{

  public static List<Content> stringToListOfContent(String string) {
    JsonArray arrayOfContent = JsonParser.parseString(string).getAsJsonObject().get("data").getAsJsonObject().get("results").getAsJsonArray();

    List<Content> content = new ArrayList<>();

      	for (int i = 0; i < arrayOfContent.size(); i++) {
      		JsonObject unparsedContent = arrayOfContent.get(i).getAsJsonObject();
					unparsedContent.get("thumbnail").getAsJsonObject();

					JsonObject unparsedImage = unparsedContent.get("thumbnail").getAsJsonObject();
					String urlImage = unparsedImage.get("path").getAsString() + "." + unparsedImage.get("extension").getAsString();

      		content.add(new MarvelSeries(
      			unparsedContent.get("title").getAsString(),
      			urlImage,
      			unparsedContent.get("startYear").getAsString(),
						unparsedContent.get("rating").getAsString()
      		));
      	}
        return content;
  }
  
}
