package com.juaracoding.oop;

//polymorphism overridding
public class Segitiga extends BidangDatar {

    public void draw(){
        int sisi = 10;
        for (int i = 0; i < sisi; i++) {
            for (int j = sisi; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
