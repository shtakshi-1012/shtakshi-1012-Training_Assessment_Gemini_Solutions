import static io.restassured.RestAssured.*;

public class DeleteRequestExample {
    public static void main(String[] args) {
        given()
                .baseUri("https://reqres.in") // Base URL
                .header("x-api-key", "reqres-free-v1") // Custom API key header
                .log().all() // Log full request
                .when()
                .delete("/api/users/2") // DELETE endpoint
                .then()
                .statusCode(204) // Expect 204 No Content
                .log().all(); // Log response
    }
}
