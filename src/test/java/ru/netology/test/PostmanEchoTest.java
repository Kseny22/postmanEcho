package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {

    @Test
    void shouldPostData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("ksyusha")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("ksyusha"));
    }
}

