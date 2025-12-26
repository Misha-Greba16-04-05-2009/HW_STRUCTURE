package ru.netology.service;

public class CustomsService {
    public static final int WEIGHT_RATE_PER_KG = 100;

    public static int calculateCustoms(int price, int weight) {
        int pricePart = price / 100;
        int weightPart = weight * WEIGHT_RATE_PER_KG;

        return pricePart + weightPart;
    }
}