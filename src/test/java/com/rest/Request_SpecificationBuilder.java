package com.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Request_SpecificationBuilder {

    RequestSpecification requestSpecification;

    @BeforeClass
    void beforeClass(){

        RequestSpecBuilder requestSpecBuilder= new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://api.postman.com");
        requestSpecBuilder.addHeader("X-Api-Key","PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73");
        requestSpecBuilder.log(LogDetail.ALL);
        requestSpecification=requestSpecBuilder.build();
    }

    @Test
    void getMethod() {
        given(requestSpecification).
                header("DummyHeader","DummyHeader").
                when().
                get("/workspaces").
                then().log().body().assertThat().statusCode(200);

    }
};