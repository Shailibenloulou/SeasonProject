package Ex1;

public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLeavesColor(Color leavesColor) {
        this.leavesColor = leavesColor;
    }

    public void changeSeason(){
        if(season==Season.WINTER)
            season=Season.SPRING;
        else if(season==Season.SPRING)
            season=Season.SUMMER;
        else if(season==Season.SUMMER)
            season=Season.FALL;
        else
            season=Season.WINTER;
    };

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        //if the height of the received Tree is equal to current Tree's height return true(1)
        if(height==((Tree) o).height)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Tree" +
                "My height is: " + height +
                " and my color is: " + leavesColor;
    }
}
