package ua.epam;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Power power = new Power();
        power.on();

        DVDRom dvdRom = new DVDRom();
        dvdRom.load();

        HDD hdd = new HDD();
        hdd.copyFromDVD(dvdRom);
    }
}
class Power{
    void on(){
        System.out.println("On");
    }
    void off(){
        System.out.println("Off");
    }
}

class DVDRom{
    private boolean data = false;
    public boolean hasDat(){
        return data;
    }
    void load(){
        data = true;
    }
    void unload(){
        data = false;
    }
}

class HDD{
    void copyFromDVD(DVDRom dvd){
        if (dvd.hasDat()){
            System.out.println("Copeing data");
        }
        else {
            System.out.println("No CD with Data");
        }
    }
}
