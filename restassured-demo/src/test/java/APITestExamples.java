import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITestExamples {
    public static void main(String[] args) {
        given()
                .baseUri("https://reqres.in")
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200)
                .body("data.first_name", equalTo("Janet"))
                .log().body(); // optional: prints the response body
    }
}
