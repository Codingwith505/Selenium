package com.example.api.posts;

import com.example.api.BaseTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetPostsTest extends BaseTest {

    @Test
    void getAllPosts_shouldReturn200AndList() {
        given().
        when().
            get("/posts").
        then().
            statusCode(200).
            header("Content-Type", containsString("application/json")).
            body("$", not(empty())).
            body("size()", greaterThan(0));
    }

    @Test
    void getSinglePost_shouldReturnValidPost() {
        given().
        when().
            get("/posts/1").
        then().
            statusCode(200).
            body("id", equalTo(1)).
            body("userId", notNullValue()).
            body("title", notNullValue());
    }
}

