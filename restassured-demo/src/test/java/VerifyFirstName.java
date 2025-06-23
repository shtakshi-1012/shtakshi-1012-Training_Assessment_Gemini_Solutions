import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class VerifyFirstName {
    public static void main(String[] args) {
        given()
                .baseUri("https://reqres.in")
                .header("x-api-key", "reqres-free-v1")
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200)
                .body("data.first_name", equalTo("Janet")); // Assert first_name
    }
}
