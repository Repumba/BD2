package bd2.gui.db;

public class MyPair{
    long key;
    int val;
    MyPair(long l, int v){
        key = l;
        val = v;
    }
    public long getKey(){
        return key;
    }
    public int getValue(){
        return val;
    }
}