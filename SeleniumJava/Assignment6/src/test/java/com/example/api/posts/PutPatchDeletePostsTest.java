package com.example.api.posts;

import com.example.api.BaseTest;
import com.example.api.model.Post;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutPatchDeletePostsTest extends BaseTest {

    @Test
    void updatePostWithPut_shouldReturnUpdatedResource() {
        Post updatedPost = new Post(1, 1, "updated title", "updated body");

        given().
            contentType("application/json").
            body(updatedPost).
        when().
            put("/posts/1").
        then().
            statusCode(anyOf(is(200), is(201))).
            body("title", equalTo("updated title")).
            body("body", equalTo("updated body"));
    }

    @Test
    void partialUpdatePostWithPatch_shouldReturnPartiallyUpdatedResource() {
        // Partial payload can also be a Map, but can also use Post with only one field set.
        Post partialPost = new Post();
        partialPost.setTitle("patched title");

        given().
            contentType("application/json").
            body(partialPost).
        when().
            patch("/posts/1").
        then().
            statusCode(anyOf(is(200), is(201))).
            body("title", equalTo("patched title"));
    }

    @Test
    void deletePost_shouldReturnSuccessStatus() {
        when().
            delete("/posts/1").
        then().
            statusCode(anyOf(is(200), is(204)));
    }
}
