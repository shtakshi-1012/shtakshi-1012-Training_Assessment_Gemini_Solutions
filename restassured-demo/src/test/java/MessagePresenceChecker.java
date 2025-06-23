import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class MessagePresenceChecker {

    public static void main(String[] args) {

        // Example: Dummy POST that may return a message field
        Response response = given()
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body("{ \"name\": \"Shtakshi\", \"job\": \"Engineer\" }")
                .when()
                .post("/api/users");

        // Call the checkMessage function
        boolean hasMessage = checkMessage(response);
        System.out.println("Is 'message' key present in response? " + hasMessage);
    }

    // Function to verify presence of 'message' key
    public static boolean checkMessage(Response response) {
        return response.jsonPath().get("message") != null;
    }
}
