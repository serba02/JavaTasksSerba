package ua.epam.formats.json;

/**
 * Created by Bredok on 07.10.2016.
 */
public class Actor {
    private int actorId;
    private String actorName;
    private String actorSurname;
    private int actorExperience;


    public Actor() {

    }

    public Actor(int actorId, String actorName, String actorSurname, int actorExperience) {
        this.actorId = actorId;
        this.actorName = actorName;
        this.actorSurname = actorSurname;
        this.actorExperience = actorExperience;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorSurname() {
        return actorSurname;
    }

    public void setActorSurname(String actorSurname) {
        this.actorSurname = actorSurname;
    }

    public int getActorExperience() {
        return actorExperience;
    }

    public void setActorExperience(int actorExperience) {
        this.actorExperience = actorExperience;
    }
}
