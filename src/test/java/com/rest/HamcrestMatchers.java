package com.rest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchers {

    @Test
    void getMethod() {


        given().
                baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73").
                when().
                get("/workspaces").
                then().log().all().assertThat().statusCode(200).
                body("workspaces.name", contains("My Workspace","Udmey","OMPrakash","My Workspace1","My Workspace1","NareshChauhan","My Workspace1"),
                        "workspaces.name", is(not(empty())));

    }
}
