package com.rest;

import io.restassured.http.Header;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Headers_Hashmap {

    @Test
    void getMethod() {

       // Header header= new Header("Accept","*/*");
        //Header header1= new Header("Accept-Encoding","gzip, deflate, br");

        HashMap<String,String> map= new HashMap<String,String>();
        map.put("Accept","*/*");

        given().
                baseUri("https://c30900d6-4fc9-433c-aa57-0329df5dff34.mock.pstmn.io").
                headers(map).
                log().all().
                when().get("/get").
                then().
                assertThat().statusCode(200);

    }
};