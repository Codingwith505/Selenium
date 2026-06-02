package com.example.api.comments;

import com.example.api.BaseTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCommentsTest extends BaseTest {

    @Test
    void getCommentsForPost_shouldReturnList() {
        given().
        when().
            get("/posts/1/comments").
        then().
            statusCode(200).
            body("$", not(empty())).
            body("[0].postId", equalTo(1));
    }

    @Test
    void getCommentsByQueryParam_shouldReturnFilteredList() {
        given().
            queryParam("postId", 1).
        when().
            get("/comments").
        then().
            statusCode(200).
            body("size()", greaterThan(0)).
            body("[0].postId", equalTo(1));
    }
}
