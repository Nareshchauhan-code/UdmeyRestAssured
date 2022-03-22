package com.rest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Automate_GetRequest_HamcrestMatchers {

    @Test
    void getMethod() {


        given().
                baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73").
                when().
                get("/workspaces").
                then().log().all().assertThat().statusCode(200).
                body("workspaces.name",hasItems("My Workspace","Udmey","OMPrakash","My Workspace1"),
                        "workspaces.type", hasItems("personal"),"workspaces[0].name",is(equalTo("My Workspace")),
                        "workspaces[1].name",equalTo("Udmey"),"workspaces.size()",equalTo(7));


    }
}
