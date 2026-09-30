package listRealLife;

import java.util.ArrayList;
import java.util.Collections;

//A music application stores song names in ArrayList<String>. 
//Add, remove, search, sort alphabetically, reverse, and display the playlist.

public class PlaylistManagement {

	public static void main(String[] args) {
		ArrayList<String> playlist = new ArrayList<>();
        playlist.add("Song C");
        playlist.add("Song A"); 
        playlist.add("Song B");
        playlist.remove("Song B");
        System.out.println("Search Song A: " + playlist.contains("Song A"));
        Collections.sort(playlist);
        System.out.println("Sorted: " + playlist);
        Collections.reverse(playlist);
        System.out.println("Reversed: " + playlist);

	}

}
