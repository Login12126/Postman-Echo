import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class PostmanEchoTest {
    @Test
    void shouldEchoPostData() {
         given()
                .baseUri("https://postman-echo.com")
                .body("TRUST ME")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                 .body("data", equalTo("TRUST ME"));
    }
}
