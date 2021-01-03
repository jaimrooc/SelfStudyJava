package com.jaimrooc.junit.tdd.mvc.movies;

import com.jaimrooc.junit.tdd.mvc.movies.data.MovieRepository;
import com.jaimrooc.junit.tdd.mvc.movies.model.Genre;
import com.jaimrooc.junit.tdd.mvc.movies.model.Movie;
import com.jaimrooc.junit.tdd.mvc.movies.service.MovieService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieServiceShould {
    private MovieRepository repository;
    private MovieService kindMovie;

    @Before
    public void setup() {
        repository = Mockito.mock(MovieRepository.class);
        Mockito.when(repository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "Kill Bill", 100, Genre.ACTION),
                        new Movie(4, "Scream", 111, Genre.HORROR),
                        new Movie(5, "Home Alone", 103, Genre.COMEDY),
                        new Movie(6, "Evil Dead", 120, Genre.HORROR),
                        new Movie(7, "Resident Evil", 120, Genre.ACTION)
                )
        );
        kindMovie = new MovieService(repository);
    }


    @Test
    public void return_movies_by_genre() {
        Collection<Movie> movies = kindMovie.findMoviesByGenre(Genre.HORROR);

        assertThat(getMovieIds(movies), is(Arrays.asList(4, 6)));
    }


    @Test
    public void return_movies_by_duration() {
        Collection<Movie> movies = kindMovie.findMoviesByDuration(100);
        List<String> moviesDuration = movies.stream().map(Movie::getName).collect(Collectors.toList());

        // return movie name
        assertThat(moviesDuration, is(Arrays.asList("Kill Bill")));

        // return movie id
        assertThat(getMovieIds(movies), is(Arrays.asList(3)));
    }


    @Test
    public void return_movie_by_name_or_keyword() {
        Collection<Movie> movies = kindMovie.findMovieByName("Evil");
        List<String> movieName = movies.stream().map(Movie::getName).collect(Collectors.toList());

        assertThat(movieName, is(Arrays.asList("Evil Dead", "Resident Evil")));
    }


    private List<Integer> getMovieIds(Collection<Movie> movies) {
        List<Integer> getId = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());

        return getId;
    }
}
