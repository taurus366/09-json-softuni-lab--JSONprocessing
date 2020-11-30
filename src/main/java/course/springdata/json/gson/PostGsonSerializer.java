package course.springdata.json.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import course.springdata.json.entity.Post;

import java.lang.reflect.Type;

public class PostGsonSerializer implements JsonSerializer<Post> {


    @Override
    public JsonElement serialize(Post post, Type type, JsonSerializationContext jsonSerializationContext) {
      //  JsonObject

        return null;
    }
}
