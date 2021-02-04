package bd2.gui.db;

import java.util.*;

public class MyComparator implements Comparator<Trasa> {
    public int compare(Trasa t1, Trasa t2){
        if( t1.getCost() > t2.getCost() )
            return 1;
        else if ( t1.getCost() < t2.getCost() )
            return -1;
        else
            return 0;
    }
}