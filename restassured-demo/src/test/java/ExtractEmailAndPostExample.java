import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ExtractEmailAndPostExample {
    public static void main(String[] args) {

        // ✅ Step 1: GET request to extract email
        Response response = given()
                .baseUri("https://reqres.in")
                .header("x-api-key", "reqres-free-v1")
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200)
                .extract().response();

        String email = response.path("data.email");
        System.out.println("Extracted Email: " + email);

        // ✅ Step 2: Use the extracted email in POST request
        String payload = "{ \"name\": \"Shtakshi\", \"email\": \"" + email + "\" }";

        given()
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body(payload)
                .log().all()
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .body("email", equalTo(email)) // verify email used correctly
                .log().all();
    }
}
