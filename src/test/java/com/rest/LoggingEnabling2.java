package com.rest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoggingEnabling2 {

    @Test
    void getMethod() {


        given().
                baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73").
                //log().all().
                        log().headers().
                when().
                get("/workspaces").
                then().
                log().ifError().
                assertThat().statusCode(200);

    }
};