package Ex1;

import Ex1.Animal;

public class Bear extends Animal {

    Bear(int weight, Season season) {
        super(weight,season,Color.BROWN);
    }

    @Override
    public String toString() {
        return "Bear. " +
                "My weight is: " + weight +
                " and my color is: " + color + '\n' ;
    }

    @Override
    public void changeSeason() {
        if(getSeason()==Season.WINTER) {
            setSeason(Season.SPRING);
            setWeight((int) (weight*0.8));
        }
        else if(getSeason()==Season.SPRING) {
            setSeason(Season.SUMMER);
            setWeight((int) (weight*0.75));
        }
        else if(getSeason()==Season.SUMMER) {
            setSeason(Season.FALL);
            setWeight((int) (weight*(1+1/3)));
        }
        else {
            setSeason(Season.WINTER);
            setWeight((int) (weight*1.25));
        }
    }
}
