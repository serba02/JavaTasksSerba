package ua.epam;

/**
 * Created by Lev_Serba on 9/22/2016.
 */
public class StudentHasDiploma extends Student  {
    private String diplomaTheme;

    public StudentHasDiploma(int id, String name, int course, String diplomaTheme) {
        super(id, name, course);
        this.diplomaTheme = diplomaTheme;
    }


    @Override
    @InvokeAnnotation
    public String toString() {
        return super.toString()+"\nStudentHasDiploma{" +
                "diplomaTheme='" + diplomaTheme + '\'' +
                '}';
    }

    public String getDiplomaTheme() {
        return diplomaTheme;
    }
}
