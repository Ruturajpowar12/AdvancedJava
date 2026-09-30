package listRealLife;

import java.util.LinkedList;

//A browser maintains recently visited websites using LinkedList<String>.
//Add websites, remove the most recent website, display history, and search for a website

public class BrowserHistory {

	public static void main(String[] args) {
		LinkedList<String> history = new LinkedList<>();
        history.add("google.com");
        history.add("github.com");
        history.add("wikipedia.org");
        history.removeLast();
        System.out.println("History: " + history);
        System.out.println("Contains github.com? " + history.contains("github.com"));

	}

}
