package com.jaimrooc.junit.tdd.mvc.movies.service;


import com.jaimrooc.junit.tdd.mvc.movies.data.MovieRepository;
import com.jaimrooc.junit.tdd.mvc.movies.model.Genre;
import com.jaimrooc.junit.tdd.mvc.movies.model.Movie;

import java.util.Collection;
import java.util.Locale;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByDuration(int length) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= length).collect(Collectors.toList());
    }

    public Collection<Movie> findMovieByName(String name) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase())).collect(Collectors.toList());
    }
}