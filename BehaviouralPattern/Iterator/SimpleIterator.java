package BehaviouralPattern.Iterator;

public class SimpleIterator implements Iterator {
    private PlayList playList;
    private int index;

    public SimpleIterator(PlayList playList){
        this.playList = playList;
    }
    @Override
    public String next(){
        return playList.getSong(index++);
    }
     @Override
    public boolean hasNext(){
        return index<playList.getSongs().size();
        
    }
}
