package com.rest;

import io.restassured.config.LogConfig;
import io.restassured.http.Header;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public class Headers {

    @Test
    void getMethod() {

        Header header= new Header("Accept","*/*");
        Header header1= new Header("Accept-Encoding","gzip, deflate, br");

        given().
                baseUri("https://c30900d6-4fc9-433c-aa57-0329df5dff34.mock.pstmn.io").
                headers("header","header1").
                log().all().
                when().get("/get").
                then().
                assertThat().statusCode(200);

    }
};