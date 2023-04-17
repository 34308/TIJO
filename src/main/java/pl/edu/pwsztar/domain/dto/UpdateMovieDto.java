package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class UpdateMovieDto implements Serializable {
    private String title;
    private String image;
    private Integer year;
    private String videoId;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public UpdateMovieDto( String title,String image,String year,String videoId) {

    }
    public UpdateMovieDto( ) {

    }
    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getYear() {
        return year;
    }

    public String getVideoId() {
        return videoId;
    }

    @Override
    public String toString() {
        return "CreateMovieDto{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", year=" + year +
                ", videoId='" + videoId + '\'' +
                '}';
    }
}
