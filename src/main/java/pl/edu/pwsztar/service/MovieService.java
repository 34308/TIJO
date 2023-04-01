package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.dto.TrailerDto;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAll();

    void creatMovie(CreateMovieDto createMovieDto);

    void deleteMovie(Long movieId);

    TrailerDto getTrailer(Long movieId);
}
