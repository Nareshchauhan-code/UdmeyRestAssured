package com.rest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class Response_Specification {

    ResponseSpecification responseSpecification;

    @BeforeClass
    void beforeClass(){

        RequestSpecBuilder requestSpecBuilder= new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://api.postman.com");
        requestSpecBuilder.addHeader("X-Api-Key","PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73");
        requestSpecBuilder.log(LogDetail.ALL);
        RestAssured.requestSpecification=requestSpecBuilder.build();

        responseSpecification= RestAssured.expect().statusCode(200).contentType(ContentType.JSON);

    }

    @Test
    void getMethod() {
                get("/workspaces").
                then().spec(responseSpecification);

    }
};