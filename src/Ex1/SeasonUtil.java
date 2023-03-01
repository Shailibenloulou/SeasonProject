package Ex1;

import static java.util.Arrays.sort;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();

    public static void sortSeasonable(Comparable[] seasonables) {
        sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        String s="";
        for(int i=0; i<seasonables.length; i++){
           s+=seasonables[i].toString();
        }
        return s;
    }
}
