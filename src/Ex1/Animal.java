package Ex1;

public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;
    // TODO: Add auxiliary fields and functions.

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    public int getWeight() {
        return weight;
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
        
    };

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", season=" + season +
                ", color=" + color +
                '}';
    }
}
