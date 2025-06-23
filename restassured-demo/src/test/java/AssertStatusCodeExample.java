import static io.restassured.RestAssured.*;

public class AssertStatusCodeExample {
    public static void main(String[] args) {

        // ✅ Assert 200 OK for GET request
        given()
                .baseUri("https://reqres.in")
                .header("x-api-key", "reqres-free-v1")
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200); // Assertion for 200

        // ✅ Assert 201 Created for POST request
        given()
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body("{ \"name\": \"Shtakshi\", \"job\": \"Engineer\" }")
                .when()
                .post("/api/users")
                .then()
                .statusCode(201); // Assertion for 201
    }
}
