package com.rest;

import io.restassured.config.LogConfig;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public class HeaderBlackListed {

    @Test
    void getMethod() {


        given().
                baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73").
                        config(config.logConfig(LogConfig.logConfig().blacklistHeader("X-Api-Key"))).
                        log().all().
                when().
                get("/workspaces").
                then().
                log().all().
                assertThat().statusCode(200);

    }
};