package com.juaracoding;

import java.sql.SQLOutput;

public class Variable {

    public static void main(String[] args) {

        // tipe data number
        byte age = 127;
        short stock = 9999;
        float price = 10000.55f;
        double totalPrice = 3000000000.99d;
        long total = 4000000000L;
        int cartProduct = 1000;

        // char
        char gender = 'L';
        char predikat = '9';

        // escape character
        System.out.println("\"JuaraCoding\nIndonesia");

        // boolean
        boolean isResult = true;
        boolean isLogin = false;

        // String
        String productName = "Headset";
        System.out.println("Product Name: " + productName);

        //buatkan output menampilkan profile user
        String name = "Rizky Subekti";
        System.out.println("Name:"+ name);
        byte umur = 26;
        System.out.println("\nUmur:"+umur);
        int tinggibadan = 166;
        System.out.println("\nTinggi Badan:"+tinggibadan);
        char jeniskelamin = 'P';
        System.out.println("\nJenis Kelamin:"+jeniskelamin);


        //Inplicit Casting / Automatic Casting
        short data1 = 456;
        double dataDouble = data1;
        System.out.println(data1);
        System.out.println(dataDouble);

        char data2 = 'Z';
        long dataLong = data2;
        System.out.println(dataLong);

        // Explicit casting / Manual Casting
        char data3 = '+';
        byte dataByte = (byte) data3;
        System.out.println(dataByte);

        int stok = 9999; // android
        short dataShort = (short)stok; // java backend
        System.out.println(dataShort);

        // Passing by Value
        String address = "Jakarta";
        String duplicatAddress = address;
        duplicatAddress = "Bandung";
        System.out.println(duplicatAddress);

        }

    }
