package com.rest;

import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.with;

public class Request_Specification_Reuse {

    RequestSpecification requestSpecification;

    @BeforeClass
    public void beforeClass(){

        RequestSpecification requestSpecification= with().baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73");

    }

    @Test
    void getMethod() {

        requestSpecification. get("/workspaces").
                then().
                assertThat().statusCode(200);

    }
};