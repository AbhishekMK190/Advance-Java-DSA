package greedy;

import java.util.*;

class Activity{
    int start,end;
    Activity(int start,int end){
        this.start = start;
        this.end = end;
    }
}

public class ActivitySelection {

    static class ActivityComparator implements Comparator<Activity>{
        public int compare(Activity a1, Activity a2){

            //sort in ascending order
            return a1.end - a2.end;
        }
    }

}
