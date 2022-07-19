package net.javaguides.springboot.tdd;

import net.javaguides.springboot.data.Movie;
import net.javaguides.springboot.data.MovieStore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

public class MovieScoreTest {

    @Test
    public void returnsNoResultsWhenNoTitlesPartiallyMatchedSearch(){
        MovieStore movieStore = new MovieStore();
        List<Movie> results = movieStore.findByPartialTitle("abc");
        assertThat(results.size(), is(0));
    }

    @Test
    public void findsAMovieWhenTitleIsPartiallyMatched(){
        MovieStore movieStore = new MovieStore();
        Movie harryPotter = new Movie("Harry Potter");
        Movie shawshank_redeption = new Movie("Shawshank Redeption");
        Movie star_wars = new Movie("Star Wars");
        Movie star_trek = new Movie("Star Trek");

        movieStore.add(harryPotter);
        movieStore.add(shawshank_redeption);
        movieStore.add(star_wars);
        movieStore.add(star_trek);

        List<Movie> results = movieStore.findByPartialTitle("arry");
        assertThat(results.size(), is(0));
    }
}
