package com.rest;

import io.restassured.config.LogConfig;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public class LoggingEnabling5 {

    @Test
    void getMethod() {


        given().
                baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73").
                //log().all().
                        config(config.logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails())).
                        //log().ifValidationFails().
                when().
                get("/workspaces").
                then().
                //log().ifValidationFails().
                assertThat().statusCode(200);

    }
};