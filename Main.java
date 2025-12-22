package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int customsDuty = calculateCustoms(price, weight);
        System.out.println("Размер пошлины (в руб.) составит: " + customsDuty);
    }

    public static int calculateCustoms(int price, int weight) {
        int pricePart = price / 100;
        int weightPart = weight * 100;

        return pricePart + weightPart;
    }
}