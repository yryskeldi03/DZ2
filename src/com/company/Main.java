package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        num("Максим", generateRandomAge(), 25);
        num("Ырыс", generateRandomAge(), 20);
        num("Данияр", generateRandomAge(), 26);
        num("Нургазы", generateRandomAge(), 21);
        num("Влад", generateRandomAge(), 22);

    }

    public static String num(String name, int ageOfPerson, int outsideTemperature) {
        String result = "Имя: " + name + ", Возраст = " + ageOfPerson + ", Температура = " + outsideTemperature + "C";
        System.out.println(result);
        if (ageOfPerson >= 20 && ageOfPerson <= 45 && outsideTemperature > -20 && outsideTemperature < 30) {
            System.out.println(name + ", можешь идти гулять");
        } else if (ageOfPerson < 20 && outsideTemperature > 0 && outsideTemperature < 28) {
            System.out.println(name + ", можешь идти гулять");
        } else if (ageOfPerson >45 && outsideTemperature > -10 && outsideTemperature < 25) {
            System.out.println(name + ", можешь идти гулять");
        } else System.out.println(name + ", оставайся дома!");
        return result;
    }


    public static int generateRandomAge(){
       int maxAge = 50;
        Random random = new Random();
        return random.nextInt(maxAge);
    }
}