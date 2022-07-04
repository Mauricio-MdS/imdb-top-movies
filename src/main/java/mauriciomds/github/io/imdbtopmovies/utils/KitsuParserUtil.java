package mauriciomds.github.io.imdbtopmovies.utils;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import mauriciomds.github.io.imdbtopmovies.models.Content;
import mauriciomds.github.io.imdbtopmovies.models.Movie;

public interface KitsuParserUtil extends JsonParserUtil{

  public static List<Content> stringToListOfContent(String string) {
    JsonArray arrayOfContent = JsonParser.parseString(string).getAsJsonObject().getAsJsonArray("data");

    List<Content> content = new ArrayList<>();

      	for (int i = 0; i < arrayOfContent.size(); i++) {
      		JsonObject unparsedContent = arrayOfContent.get(i).getAsJsonObject().get("attributes").getAsJsonObject();
      		content.add(new Movie(
      			unparsedContent.get("canonicalTitle").getAsString(),
      			unparsedContent.get("posterImage").getAsJsonObject().get("tiny").getAsString(),
      			unparsedContent.get("startDate").getAsString().substring(0, 4),
						parseRating(unparsedContent.get("averageRating").getAsString())
      		));
      	}
        return content;
  }

	private static String parseRating(String rating) {
		double ratingInDouble = Double.parseDouble(rating) / 10;
		String parsedRating = Double.toString(ratingInDouble);
		if (parsedRating.length() > 3) {
			parsedRating = parsedRating.substring(0, 3);
		}
		return parsedRating;
	}
  
}


