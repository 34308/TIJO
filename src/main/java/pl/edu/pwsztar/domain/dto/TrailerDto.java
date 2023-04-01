package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class TrailerDto implements Serializable {
    String title;
    String videoId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
