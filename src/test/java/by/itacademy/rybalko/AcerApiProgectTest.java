package by.itacademy.rybalko;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AcerApiProgectTest {

    @Test
    public void testWithMailAndPassword() {
        String body = "{\n" +
                "    \"email\": \"mail\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        given()
                .header("content-type", "application/json; charset=utf-8")
                .body(body)
                .when()
                .post("https://beltexno.by/account-services/auth_account")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void testWithoutMail() {
        String body = "{\n" +
                "    \"email\":      ,\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        given()
                .header("content-type", "application/json; charset=utf-8")
                .body(body)
                .when()
                .post("https://beltexno.by/account-services/auth_account")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void testWithoutMailAndPassword() {
        String body = "{\n" +
                "    \"email\":      ,\n" +
                "    \"password\": \n" +
                "}";
        given()
                .header("content-type", "application/json; charset=utf-8")
                .body(body)
                .when()
                .post("https://beltexno.by/account-services/auth_account")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void testWithoutContentType() {
        String body = "{\n" +
                "    \"email\":mail,\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        given()
                .header("content-type", "application/json; charset=utf-8")
                .body(body)
                .when()
                .post("https://beltexno.by/account-services/auth_account")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test
    public void testStatusCode() {
        String body = "{\\n\" +\n" +
                "                \"    \\\"email\\\":mail,\\n\" +\n" +
                "                \"    \\\"password\\\": \\\"123456\\\"\\n\" +\n" +
                "                \"}";
        given()
                .body(body)
                .header("content-type", "application/json; charset=utf-8")
                .when()
                .post("https://beltexno.by/account-services/auth_account")
                .then().                                                                                     //log().all().assertThat().
                statusCode(200);                                                                          //.body("key", equalTo("Неверный логин или пароль."));
    }

}
