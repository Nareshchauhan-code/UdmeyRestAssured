package com.rest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.*;

public class Automate_GetRequest_ByExtract {

    @Test
    void getMethod() {


        Response response = given().
                baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-62387878fc7ace354c8a1b47-57aedb6450a9f1ca04d4713a5884246c73").
                when().
                get("/workspaces").
                then().assertThat().statusCode(200).extract().response();


        response.prettyPrint();
        //  System.out.println(res.asString());

           //Validation By Groovy
        System.out.println((String) response.path("workspaces[0].name"));

        // Validation By JsonPath
        JsonPath jsonPath= new JsonPath(response.asString());

        System.out.println(jsonPath.getString("workspaces[1].name"));

        System.out.println(jsonPath.getString("workspaces[1].id"));

        //Other Method

        JsonPath.from(response.asInputStream()).getString("workspaces[1].name");

        System.out.println(JsonPath.from(response.asInputStream()).getString("workspaces[1].name"));

        //Other Method

        response.path("workspaces[2].name");

        System.out.println((String) response.path("workspaces[2].name"));
    }
}
