package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.pwsztar.domain.entity.Movie;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>, CrudRepository<Movie, Long> {

    List<Movie> findByOrderByYearDesc();

    @Modifying
    @Query("DELETE FROM Movie m WHERE m.movieId = :movieId")
    void deleteById(@Param("movieId") Long movieId);
    Movie findOneByMovieId(Long movieId);

    @Modifying
    @Transactional
    @Query("update Movie m set m.title = ?1 , m.image = ?2, m.year=?3, m.videoId=?4 where m.movieId = ?5")
    void updateMovieInfoById(String title, String image, Integer year, String videoId , Long movieId);

}
