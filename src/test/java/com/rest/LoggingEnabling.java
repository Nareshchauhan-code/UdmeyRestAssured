package com.rest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoggingEnabling {

    @Test
    void getMethod() {


        given().
                baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73").
                //log().all().
                        log().headers().
                when().
                get("/workspaces").
                then().log().body().assertThat().statusCode(200);

    }
};