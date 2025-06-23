import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PatchRequestExample {
    public static void main(String[] args) {
        given()
                .baseUri("https://reqres.in") // Base URL
                .header("Content-Type", "application/json") // Content type
                .header("x-api-key", "reqres-free-v1") // Custom API key
                .body("{ \"job\": \"Tech Lead\" }") // Partial update payload
                .log().all() // Log the request
                .when()
                .patch("/api/users/2") // PATCH endpoint
                .then()
                .statusCode(200) // Expect 200 OK
                .body("job", equalTo("Tech Lead")) // Validate updated field
                .log().all(); // Log response
    }
}
