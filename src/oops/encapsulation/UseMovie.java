package oops.encapsulation;

import oops.encapsulation.Movie;

public class UseMovie {

    public static void main(String[] args) {

        Movie movie = new Movie();

        movie.setTitle("Lord of rings");
        System.out.println(movie.getTitle());

        movie.setDuration(120);
        System.out.println(movie.getDuration());
    }
}
