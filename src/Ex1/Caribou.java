package Ex1;

import Ex1.Animal;

public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);
    }

    @Override
    public String toString() {
        return "Caribou: " +
                "My weight is: " + weight +
                " and my color is: " + color + '\n' ;
    }

    @Override
    public void changeSeason() {
        if(getSeason()==Season.WINTER) {
            setSeason(Season.SPRING);
            setColor(Color.WHITE);
        }
        else if(getSeason()==Season.SPRING) {
            setSeason(Season.SUMMER);
            setColor(Color.BROWN);
        }
        else if(getSeason()==Season.SUMMER)
            setSeason(Season.FALL);
        else
            setSeason(Season.WINTER);
    }
}
