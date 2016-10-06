package ua.epam.formats.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bredok on 06.10.2016.
 */
public class Runner {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
        CSVParser parser = new CSVParser(new FileReader("src\\main\\resources\\Actors.csv"), format);
        List<Actor> actorsList = new ArrayList<Actor>();
        for(CSVRecord record : parser){
            Actor actor = new Actor();
            actor.setActorId(Integer.parseInt(record.get("actorId")));
            actor.setActorName(record.get("actorName"));
            actor.setActorSurname(record.get("actorSurname"));
            actor.setActorExperience(Integer.parseInt(record.get("actorExpirience")));
            actorsList.add(actor);
        }
        parser.close();
        for(Actor act : actorsList){
            System.out.print(act.getActorId()+" ");
            System.out.print(act.getActorName()+" ");
            System.out.print(act.getActorSurname()+" ");
            System.out.print(act.getActorExperience()+" ");
            System.out.println();
        }
    }
}
