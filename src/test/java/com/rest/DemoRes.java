package com.rest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class DemoRes {

    @Test
    void getMethod() {



        given().
                baseUri("https://reqres.in/").
                when().
                get("/api/users?page=2").
                then().log().all().assertThat().statusCode(200);


    }
}
