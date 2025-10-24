package movie;

import java.util.ArrayList;

public class Movie {
    String title;
    String director;
    ArrayList<String> actors = new ArrayList<>();
    ArrayList<String> reviews = new ArrayList<>();

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void addActor(String actor) { actors.add(actor); }
    public void addReview(String review) { reviews.add(review); }
}
