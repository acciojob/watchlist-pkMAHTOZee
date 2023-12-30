package com.driver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {

    MovieService service = new MovieService();

    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie data ){
        service.addMovie(data);
        return new ResponseEntity<>("Movie Added", HttpStatus.ACCEPTED);
    }
    @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequestBody Director data ){
        service.addDirector(data);
        return new ResponseEntity<>("Director Added", HttpStatus.ACCEPTED);
    }

    @PutMapping("/add-movie-director-pair")
    public ResponseEntity<String> addMovieDirectorPair(@RequestParam("Movie") String movieName, @RequestParam("Director") String directorName){
        service.addMovieDirectorPair(movieName,directorName);
        return new ResponseEntity<>("MovieDirector pair Added", HttpStatus.CREATED);
    }
    @GetMapping("get-movie-by-name/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable String name){
        System.out.println(name);
        Movie res= service.getMovieByName(name);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
    @GetMapping("get-director-by-name/{name}")
    public ResponseEntity<Director> getDirectorByName(@PathVariable String name){
        Director res= service.getDirectorByName(name);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
    @GetMapping("get-movies-by-director-name/{director}")
    public ResponseEntity<List<String>> getMoviesByDirectorName(@PathVariable String director){
        List<String> res = service.getMoviesByDirectorName(director);
        return new ResponseEntity<>(res,HttpStatus.CREATED);
    }
    @GetMapping("get-all-movies")
    public ResponseEntity<List<String>> findAllMovies(){
        List<String> res = service.findAllMovies();
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }
    @DeleteMapping("delete-director-by-name")
    public ResponseEntity<String> deleteDirectorByName( @RequestParam("Director") String name){
        service.deleteDirectorByName(name);
        return new ResponseEntity<>("Deleted" , HttpStatus.CREATED);
    }

    @DeleteMapping("delete-all-directors")
    public ResponseEntity<String> deleteAllDirectors(){
        service.deleteAllDirectors();
        return new ResponseEntity<>("Deleted All Director", HttpStatus.ACCEPTED);
    }

}