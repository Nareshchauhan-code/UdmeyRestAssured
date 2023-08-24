package com.rest;

import io.restassured.config.LogConfig;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public class Request_Specification {

    @Test
    void getMethod() {

        RequestSpecification requestSpecification= given().baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73");

        given(requestSpecification).
                when().
                get("/workspaces").
                then().
                assertThat().statusCode(200);

    }
};