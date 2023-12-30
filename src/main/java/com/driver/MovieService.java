package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    MovieRepository repo = new MovieRepository();

    public Boolean addMovie(Movie data){
        boolean res = repo.addMovie(data);
        return res;
    }
    public boolean addDirector(Director data){
        return repo.addDirector(data);
    }
    public boolean addMovieDirectorPair(String movie , String director){
        return repo.addMovieDirectorPair(movie,director);
    }

    public Movie getMovieByName(String name){
        return repo.getMovieByName(name);
    }
    public Director getDirectorByName(String name){
        return repo.getDirectorByName(name);
    }

    public List<String> getMoviesByDirectorName(String director){
        return repo.getMoviesByDirectorName(director);
    }
    public List<String> findAllMovies(){
        return repo.findAllMovies();
    }
    public boolean deleteDirectorByName( String name){
        return repo.deleteDirectorByName(name);
    }
    public boolean deleteAllDirectors(){
        return repo.deleteAllDirectors();
    }

}