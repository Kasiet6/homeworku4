package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(school(generateRandomAge(),23));
        System.out.println(school(generateRandomAge(),25));
        System.out.println(school(generateRandomAge(),23));
        System.out.println(school(generateRandomAge(),43));
        System.out.println(school(generateRandomAge(),13));
    }

    public static String school (int HumanAge,int temperature) {
        if (HumanAge > 20 && HumanAge < 45 && temperature > 20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (HumanAge < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять ";
        } else if (HumanAge > 45 && temperature > 10 && temperature < 25) {
            return "Можно идти гулять ";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge() {
        Random rand = new Random();
        int int_random = rand.nextInt(45);
        return int_random;
    }
    }





