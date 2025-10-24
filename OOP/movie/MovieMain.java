package movie;

public class MovieMain {
       public static void main(String[] args) {
        Movie m = new Movie("Inception", "Christopher Nolan");
        m.addActor("Leonardo DiCaprio");
        m.addReview("Amazing movie!");
        System.out.println("Movie: " + m.title + " by " + m.director);
    }
}

