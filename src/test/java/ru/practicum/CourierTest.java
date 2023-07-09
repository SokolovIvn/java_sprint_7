package ru.practicum;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

public class CourierTest {

    private final  CourierGenerator courierGenerator = new CourierGenerator();
    private final CourierClient client = new CourierClient();

    @Before
    public void setUp() {
//        RestAssured.baseURI= "https://qa-mesto.praktikum-services.ru";
    }


    @Test
    public void testCreateCourier(){
        var courier = courierGenerator.genericRand();
        boolean isClient = client.createCourier(courier)
                .assertThat()
                .statusCode(201)
                .extract()
                .path("ok");
        assert isClient;
    }


    @Test
    public void testLoginTest() {
        var courier = courierGenerator.generic();
        int isClient = client.loginCourier(courier)
                .assertThat()
                .statusCode(200)
                .extract()
                .path("id");
        assert isClient !=0;


    }

}
