package ua.epam;

public class Main {

    public static void main(String[] args) {
        EpamEmployee epamEmployee = new EpamEmployee("Vasil", "Bobo", 29, "KPI", false);
        EpamEmployeeRD epamEmployeeRD = new EpamEmployeeRD("Vasil", "Bobo", 29, "KPI", false, Specialization.AT);
        if(epamEmployee.equals(epamEmployeeRD)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
