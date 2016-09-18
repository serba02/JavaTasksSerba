package ua.epam.model;


public class GameModel {
    private int randomValue = 0;
    private int minRangeValue = 1;
    private int maxRangeValue = 99;

    public GameModel(){
        this.randomValue = random(this.minRangeValue, this.maxRangeValue);
    }

    public int getRandomValue(){
        return randomValue;
    }

    public int getMinRangeValue() {
        return minRangeValue;
    }

    public void setMinRangeValue(int minRangeValue) {
        this.minRangeValue = minRangeValue;
    }

    public int getMaxRangeValue() {
        return maxRangeValue;
    }

    public void setMaxRangeValue(int maxRangeValue) {
        this.maxRangeValue = maxRangeValue;
    }

    private int random(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
