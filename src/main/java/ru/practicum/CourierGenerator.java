package ru.practicum;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class CourierGenerator {

    public Courier generic() {
        return new Courier("pit", "1234", "tong");
    }

    public Courier genericRand() {
        return new Courier(RandomStringUtils.randomAlphanumeric(4,5), "sfdsfds1", "Максимус");
    }

}
