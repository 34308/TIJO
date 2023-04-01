package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.TrailerDto;
import pl.edu.pwsztar.domain.entity.Movie;

@Component
public class TrailerMapper {
    public TrailerDto MovieToTrailer(Movie movie){
        TrailerDto trailerDto =new TrailerDto();
        trailerDto.setTitle(movie.getTitle());
        trailerDto.setVideoId(movie.getVideo_Id());
        return trailerDto;
    }
}
