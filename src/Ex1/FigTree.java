package Ex1;

public class FigTree extends Tree {


    FigTree(int height, Season season) {
        super(height,season,Color.YELLOW);
    }

    @Override
    public String toString() {
        return "Fig tree. " +
                "My height is: " + height +
                " and my color is: " + leavesColor+'\n' ;
    }

    @Override
    public void changeSeason(){
        if(season==Season.WINTER) {
            season = Season.SPRING;
            setHeight(height+20);
        }
        else if(season==Season.SPRING) {
            season = Season.SUMMER;
            setHeight(height+30);
            setLeavesColor(Color.GREEN);
        }
        else if(season==Season.SUMMER) {
            season = Season.FALL;
            setHeight(height+30);
        }
        else {
            season = Season.WINTER;
            setHeight(height+20);
            setLeavesColor(Color.YELLOW);
        }
    };
}
