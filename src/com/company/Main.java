package com.company;

public class Main {

    public static void main(String[] args) {
	String iceCream  = "Hello world";
        System.out.println(iceCream);
    final int num = 30;
        System.out.println(num);
    String word = " word ";
        System.out.println(word);
    String gif = num + "" + word;
        System.out.println(gif);

        if(num < 40){
            System.out.println("Вы сохранили отрицательное число");
            if (num > 40) {
                System.out.println("Вы сохранили положительное число");
            } else {
                System.out.println("Вы сохранили нуль");
            }
        }

    }

}
