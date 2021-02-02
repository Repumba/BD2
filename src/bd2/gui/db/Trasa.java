import java.util.*;
public class Trasa{
    int cost;
    long id;
    ArrayList<Long> tab;
    Trasa(long i){
        cost = 0;
        id = i;
    }
    Trasa(Trasa t, long i, int c){
        tab = t.getTab();
        cost = t.getCost();
        tab.add(i);
        cost += c;
        id = i;
    }
    public ArrayList<Long> getTab(){
        return tab;
    }
    public int getCost(){
        return cost;
    }
    public long getId(){
        return id;
    }
}