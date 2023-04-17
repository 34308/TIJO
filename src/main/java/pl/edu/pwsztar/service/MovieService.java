package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.DetailsMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.dto.UpdateMovieDto;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAll();

    void creatMovie(CreateMovieDto createMovieDto);

    void deleteMovie(Long movieId);

    DetailsMovieDto findMovie(Long movieId);

    Integer getNumberOfMovie();

    void UpdateMovie(Long id, UpdateMovieDto updateMovieDto);
}
