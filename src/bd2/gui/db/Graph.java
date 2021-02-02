import java.util.*;
import java.lang.Math;

public class Graph {
    ArrayList< ArrayList< MyPair > > g;
    public void dodaj_przejazd(Przejazd p){
        // sort p.przystanki po czasie
        for(int i=0; i<p.getPrzystanki().size()-1; ++i){
            MyPair pair = new MyPair(p.getPrzystanki().get(i+1).getId(), 1);
            g.get( Math.toIntExact( p.getPrzystanki().get(i).getId() ) ).add( pair );
        }

        for(int i=0; i<p.getPrzystanki().size(); ++i){
            for(int j=0; j<p.getPrzystanki().get(i).getStacja().getPrzystanki().size(); ++j){
                if(p.getPrzystanki().get(i).getGodzinaPrzyjazdu().compareTo( p.getPrzystanki().get(i).getStacja().getPrzystanki().get(j).getGodzinaOdjazdu() ) < 0 ){
                    MyPair pair = new MyPair(p.getPrzystanki().get(i).getStacja().getPrzystanki().get(j).getId(), 1);
                    g.get( Math.toIntExact( p.getPrzystanki().get(i).getId() ) ).add( pair );
                } else if( p.getPrzystanki().get(i).getGodzinaOdjazdu().compareTo( p.getPrzystanki().get(i).getStacja().getPrzystanki().get(j).getGodzinaPrzyjazdu() ) > 0 ){
                    MyPair pair = new MyPair(p.getPrzystanki().get(i).getId(), 1);
                    g.get( Math.toIntExact( p.getPrzystanki().get(i).getStacja().getPrzystanki().get(j).getId() ) ).add( pair );
                }
            }
        }
    }

    public List<Long> znajdzTrase(Stacja pocz, Stacja kon, GregorianCalendar odjazd){
        PriorityQueue<Trasa> pq = new PriorityQueue<Trasa>( new MyComparator() );
        for(int i=0; i<pocz.getPrzystanki().size(); ++i){
            pq.add( new Trasa(pocz.getPrzystanki().get(i).getId()) );
        }
        while( !czyKoniec( pq.peek().getId(), kon) && !pq.isEmpty()){
            for(int i=0; i< g.get( Math.toIntExact(pq.peek().getId()) ).size(); ++i ){
                pq.add( new Trasa(pq.peek(), g.get( Math.toIntExact(pq.peek().getId()) ).get(i).getKey(), g.get( Math.toIntExact(pq.peek().getId()) ).get(i).getValue() ) );
            }
            pq.poll();
        }

        if( czyKoniec( pq.peek().getId(), kon) )
            return pq.peek().getTab();
        else
            return null;
    }

    private boolean czyKoniec(long id, Stacja s){
        for(int i=0; i<s.getPrzystanki().size(); ++i){
            if( id == s.getPrzystanki().get(i).getId() )
                return true;
        }
        return false;
    }
}