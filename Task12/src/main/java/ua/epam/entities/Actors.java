package ua.epam.entities;

/**
 * Created by Lev_Serba on 10/3/2016.
 */
public class Actors {
    private int actorId;
    private String actorName;
    private String actorSurname;
    private int actorExperience;

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

    @Override
    public String toString() {
        return "Actors{" +
                "actorId=" + actorId +
                ", actorName='" + actorName + '\'' +
                ", actorSurname='" + actorSurname + '\'' +
                ", actorExperience=" + actorExperience +
                '}';
    }
}
