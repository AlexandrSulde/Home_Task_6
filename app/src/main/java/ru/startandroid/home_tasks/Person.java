package ru.startandroid.home_tasks;

import java.util.Random;


public class Person {
    private static final String cont_NUMBER = "1234567890";
    private static final String cont_SYMBOL = "АБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЭЮЯ";
    private static int length;
    private String contacts;
    private String phone_number;
    private int photo;

    public Person(int image, int var) {
        length = var;
        contacts = this.RandomString(cont_SYMBOL,  length);
        phone_number = this.RandomString(cont_NUMBER, length);
        photo = image;
    }

    public String RandomString(String symbol, int v) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < v; i++) {
            int number = new Random().nextInt(symbol.length());
            char ch = symbol.charAt(number);
            builder.append(ch);
        }
        return builder.toString();
    }

    public String getContacts() {
        return this.contacts;
    }

    public String getPhone_Number() {return this.phone_number;}

    public int getPhoto() {
        return this.photo;
    }
}
