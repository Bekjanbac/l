package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(number(generateRandomAge(), -15));
        System.out.println(number(generateRandomAge(), 28));
        System.out.println(number(generateRandomAge(), 25));
        System.out.println(number(generateRandomAge(), 15));
        System.out.println(number(generateRandomAge(), -8));
    }
    public static String number(int age, int tempirature) {

        if (age > 20 && age < 45 && tempirature > -20 && tempirature < 30) {
            return "Можно идти гулять";
        } else if (age > 20 && tempirature > 0 && tempirature < 28) {
            return "можно идти гулять";
        } else if (age < 45 && tempirature > -10 && tempirature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge() {
            Random random = new Random();
            int nnn= random.nextInt(60);
            return nnn;
    }
}



