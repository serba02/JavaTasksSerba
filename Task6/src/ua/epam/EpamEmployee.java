package ua.epam;

/**
 * Created by Lev_Serba on 9/19/2016.
 */
public class EpamEmployee {
    protected String name;
    protected String lastName;
    private int age;
    private String education;
    private boolean civilStatus;

    public EpamEmployee(String name, String lastName, int age, String education, boolean civilStatus) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.education = education;
        this.civilStatus = civilStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EpamEmployee)) return false;

        EpamEmployee that = (EpamEmployee) o;

        if (age != that.age) return false;
        if (civilStatus != that.civilStatus) return false;
        if (!name.equals(that.name)) return false;
        if (!lastName.equals(that.lastName)) return false;
        return education.equals(that.education);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        result = 31 * result + education.hashCode();
        result = 31 * result + (civilStatus ? 1 : 0);
        return result;
    }
}
