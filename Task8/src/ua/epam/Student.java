package ua.epam;

/**
 * Created by Lev_Serba on 9/22/2016.
 */
public class Student {
    private int id;
    private String name;
    private int course;

    public Student(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getCourse() {
        return course;
    }
}
