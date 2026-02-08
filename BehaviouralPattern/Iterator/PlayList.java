package BehaviouralPattern.Iterator;

import java.util.ArrayList;
import java.util.List;


public class PlayList {
    List<String> songs;

    public PlayList(){
        songs = new ArrayList<>();
    
    }

    public String getSong(int index){
        return songs.get(index);
    }

    public  List<String> getSongs(){
        return songs;
    }

    public void addSong(String song){
        songs.add(song);
    }
}
