import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutRequestExample {
    public static void main(String[] args) {
        given()
                .baseUri("https://reqres.in") // Base URL
                .header("Content-Type", "application/json") // Header
                .header("x-api-key", "reqres-free-v1")
                .body("{ \"name\": \"Shtakshi\", \"job\": \"Senior Engineer\" }") // Request payload
                .log().all() // Log full request
                .when()
                .put("/api/users/2") // PUT endpoint
                .then()
                .statusCode(200) // Status expected: 200 OK
                .body("job", equalTo("Senior Engineer")) // Check if job is updated
                .log().all(); // Log full response
    }
}
