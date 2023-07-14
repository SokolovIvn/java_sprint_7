package ru.practicum;

import org.apache.commons.lang3.RandomStringUtils;

public class CourierGenerator {

    public Courier generic() {
        return new Courier("pit", "1234", "tong");
    }


    public Courier emptyFields() {
        return new Courier("", "", "опа");
    }


    public Courier genericRand() {
        return new Courier(RandomStringUtils.randomAlphanumeric(4, 5), "sfdsfds1", "Максимус");
    }

    public Courier notFullData() {
        Courier courier = new Courier();
        courier.setPassword("123123");
        return courier;
    }

}
