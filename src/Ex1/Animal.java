package Ex1;

public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        //if the weight of the received animal is equal to current animal return true(1)
        if(weight==((Animal) o).weight)
            return 1;
        return 0;
    }

    public void changeSeason(){
        if(season==Season.WINTER)
            setSeason(Season.SPRING);
        else if(season==Season.SPRING)
            setSeason(Season.SUMMER);
        else if(season==Season.SUMMER)
            setSeason(Season.FALL);
        else
            setSeason(Season.WINTER);
    };

    @Override
    public String toString() {
        return "Animal" +
                "My weight is: " + weight +
                " and my color is: " + color ;
    }
}
