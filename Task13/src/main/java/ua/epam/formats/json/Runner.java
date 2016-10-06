package ua.epam.formats.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.File;

/**
 * Created by Bredok on 07.10.2016.
 */
public class Runner {
    public static void main(String args[]) throws Exception {
        Actor actor = new Actor(47, "Paul", "Weruto", 3);
        JSONObject json = new JSONObject();

        json.put("actorId", actor.getActorId());
        json.put("actorName", actor.getActorName());
        json.put("actorSurname", actor.getActorSurname());
        json.put("actorExperience", actor.getActorExperience());

        String jString = json.toJSONString();
        ObjectMapper mapper = new ObjectMapper();
        Actor actorInfo = mapper.readValue(jString, Actor.class);
        String jsonInString = mapper.writeValueAsString(actor);
        mapper.writeValue(new File("Actors.json"), actor);
    }
}
