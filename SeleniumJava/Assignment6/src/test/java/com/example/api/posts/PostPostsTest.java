package com.example.api.posts;

import com.example.api.BaseTest;
import com.example.api.model.Post;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostPostsTest extends BaseTest {

    @Test
    void createPost_withValidData_shouldReturn201() {
        Post newPost = new Post(1, "foo", "bar");

        given().
            contentType("application/json").
            body(newPost). // Jackson serializes this automatically
        when().
            post("/posts").
        then().
            statusCode(201).
            body("title", equalTo("foo")).
            body("body", equalTo("bar")).
            body("userId", equalTo(1));
    }

    @Test
    void createPost_withInvalidData_shouldReturnError() {
        // Missing userId to simulate invalid payload
        Post invalidPost = new Post();
        invalidPost.setTitle("missing userId");

        given().
            contentType("application/json").
            body(invalidPost).
        when().
            post("/posts").
        then().
            statusCode(anyOf(is(400), is(422))); // depends on API behavior
    }
}
