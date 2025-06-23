import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class PostRequestExample {
    public static void main(String[] args) {
        given()
                .relaxedHTTPSValidation()
                .baseUri("https://reqres.in") // Step 1: Base URL of the API
                .header("Content-Type", "application/json") // Step 2: Tell server we're sending JSON
                .header("x-api-key", "reqres-free-v1")
                .body("{ \"name\": \"Shtakshi\", \"job\": \"Engineer\" }") // Step 3: Request payload
                .log().all()
                .when()
                .post("/api/users") // Step 4: Actual POST call
                .then()
                .statusCode(201) // Step 5: Assert that status code is 201 (Created)
                .body("name", equalTo("Shtakshi")) // Step 6: Validate 'name' in response
                .log().all(); // Step 7: Print full response to console
    }
}
