package BehaviouralPattern.Iterator;

public class Main {
    public static void main(String[] args) {
        PlayList playList = new PlayList();
        playList.addSong("Heaven");
        playList.addSong("Home land");
        playList.addSong("Yorking-Fav");
        playList.addSong("nice-Fav");

        SimpleIterator simpleIterator = new SimpleIterator(playList);
        
        System.out.println("Playing songs:");
        while (simpleIterator.hasNext()) {
            System.out.println(simpleIterator.next());
        }

         System.out.println("Playing fav songs:");
        FavouriteIterator favouriteIterator = new FavouriteIterator(playList);
        while (favouriteIterator.hasNext()) {
            System.out.println(favouriteIterator.next());
        }
    }
}
