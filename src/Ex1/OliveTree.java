package Ex1;

public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
    }

    @Override
    public String toString() {
        return "Olive tree. I give fruit. " +
                "My height is: " + height +
                " and my color is: " + leavesColor +'\n' ;
    }

    @Override
    public void changeSeason(){
        if(season==Season.WINTER) {
            season = Season.SPRING;
            setHeight(height+5);
        }
        else if(season==Season.SPRING) {
            season = Season.SUMMER;
            setHeight(height+10);
        }
        else if(season==Season.SUMMER) {
            season = Season.FALL;
            setHeight(height+10);
        }
        else {
            season = Season.WINTER;
            setHeight(height+5);
        }
    };
}
