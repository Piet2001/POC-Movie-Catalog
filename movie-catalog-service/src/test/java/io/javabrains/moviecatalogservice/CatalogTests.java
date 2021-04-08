package io.javabrains.moviecatalogservice;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CatalogTests {

    @Test
    void CatalogNameCorrect() {
        CatalogItem catalogItem = new CatalogItem("Test","Desc", 4);
        assertThat(catalogItem.getName()).isEqualTo("Test");
    }

    @Test
    void CatalogDescCorrect() {
        CatalogItem catalogItem = new CatalogItem("Test","Desc", 4);
        assertThat(catalogItem.getDesc()).isEqualTo("Desc");
    }

    @Test
    void CatalogRatingCorrect() {
        CatalogItem catalogItem = new CatalogItem("Test","Desc", 4);
        assertThat(catalogItem.getRating()).isEqualTo(4);
    }

    @Test
    void CatalogNameNotCorrect() {
        CatalogItem catalogItem = new CatalogItem("Test","Desc", 4);
        assertThat(catalogItem.getName()).isNotEqualTo("Testing");
    }

    @Test
    void CatalogNameChanged() {
        CatalogItem catalogItem = new CatalogItem("Test","Desc", 4);
        catalogItem.setName("Testing");
        assertThat(catalogItem.getName()).isEqualTo("Testing");
    }
}
