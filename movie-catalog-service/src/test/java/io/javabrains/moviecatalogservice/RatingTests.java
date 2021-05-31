package io.javabrains.moviecatalogservice;

import io.javabrains.moviecatalogservice.models.Rating;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RatingTests {

    @Test
    void RatingMovieIdCorrect() {
        Rating rating = new Rating("ID",4);
        assertThat(rating.getMovieId()).isEqualTo("ID");
    }

    @Test
    void RatingMovieIdNotCorrect() {
        Rating rating = new Rating("ID",4);
        assertThat(rating.getMovieId()).isNotEqualTo("IDs");
    }

    @Test
    void RatingNotCorrect() {
        Rating rating = new Rating("ID",4);
        assertThat(rating.getRating()).isNotEqualTo(5);
    }

    @Test
    void RatingChanged() {
        Rating rating = new Rating("ID",4);
        rating.setRating(5);
        assertThat(rating.getRating()).isEqualTo(5);
    }

    @Test
    void RatingChangedSecond() {
        Rating rating = new Rating("ID",4);
        rating.setRating(5);
        assertThat(rating.getRating()).isNotEqualTo(4);
    }
}
