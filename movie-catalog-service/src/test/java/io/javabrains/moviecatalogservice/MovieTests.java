package io.javabrains.moviecatalogservice;

import io.javabrains.moviecatalogservice.models.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MovieTests {

    @Test
    void MovieNameCorrect() {
        Movie movie = new Movie("ID","Name");
        assertThat(movie.getName()).isEqualTo("Name");
    }

    @Test
    void MovieIdCorrect() {
        Movie movie = new Movie("ID","Name");
        assertThat(movie.getMovieId()).isEqualTo("ID");
    }

    @Test
    void MovieNameNotCorrect() {
        Movie movie = new Movie("ID","Name");
        assertThat(movie.getName()).isNotEqualTo("Testing");
    }

    @Test
    void MovieNameChanged() {
        Movie movie = new Movie("ID","Name");
        movie.setName("Testing");
        assertThat(movie.getName()).isEqualTo("Testing");
    }

    @Test
    void EmptyMovieIsEmpty() {
        Movie movie = new Movie();
        assertThat(movie.getName()).isNull();
    }
}
