package com.rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Demo {

    @Test
    void getData() {

        //API URL
        RestAssured.baseURI = "http://www.mocky.io/v2/5c78ed70300000a42d49b04d";

      //HTTP request

        RequestSpecification httpRequest = RestAssured.given();

        //Getting response
        Response response = httpRequest.request(Method.GET);

     //Getting response body to verify/assert
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);
        System.out.println(response.getStatusCode());
    }
}
