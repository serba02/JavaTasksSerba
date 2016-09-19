package ua.epam;

/**
 * Created by Lev_Serba on 9/19/2016.
 */
public class EpamEmployeeRD extends EpamEmployee  {
    private Specialization specialization;

    public EpamEmployeeRD(String name, String lastName, int age, String education, boolean civilStatus, Specialization specialization) {
        super(name, lastName, age, education, civilStatus);
        this.specialization = specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EpamEmployeeRD)) return false;
        if (!super.equals(o)) return false;

        EpamEmployeeRD that = (EpamEmployeeRD) o;

        return specialization == that.specialization;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + specialization.hashCode();
        return result;
    }
}
