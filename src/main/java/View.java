import java.net.URI;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Game;

public class View {

    public static void main(String[] args) throws Exception {
        String id = args[0];
        URI uri = new URI("http", "store.steampowered.com", "/api/appdetails",
                "appids=" + id, null);
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> obj = objectMapper.readValue(uri.toURL(),
                new TypeReference<Map<String, Object>>(){});
        Game game = objectMapper.convertValue(obj.get(id), Game.class);
        System.out.println(game.getData().getName());
    }
}
