package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class NumberOfMoviesDto implements Serializable {
    int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
