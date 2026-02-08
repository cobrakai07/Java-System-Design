package BehaviouralPattern.Iterator;

public class FavouriteIterator implements Iterator{

	private PlayList playList;
    int index = 0;
    public FavouriteIterator(PlayList playList){
        this.playList = playList;
    }

	@Override
	public boolean hasNext() {
        while(index< playList.getSongs().size()){
            if(playList.getSongs().get(index).contains("Fav"))return true;
            else index++;
        }
		return playList.getSongs().size() >index;
	}
	
	@Override
	public String next() {
		return playList.getSongs().get(index++);
	}
}
