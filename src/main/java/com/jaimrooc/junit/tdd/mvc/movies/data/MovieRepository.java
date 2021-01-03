package com.jaimrooc.junit.tdd.mvc.movies.data;

import com.jaimrooc.junit.tdd.mvc.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findById(long id);

    Collection<Movie> findAll();

    void saveOrUpdate(Movie movie);
}
