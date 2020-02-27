package pl.codeleak.samples;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

@QuarkusTest
public class OwnerResourceTest {

    @Test
    void findAllReturnsOneRecord() {
        given()
                .when().get("/owners")
                .then()
                .statusCode(200)
                .body("$.size()", is(1),
                        "firstName", containsInAnyOrder("John"),
                        "lastName", containsInAnyOrder("Doe"));
    }
}