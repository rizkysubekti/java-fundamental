package com.juaracoding.ujianjf;

public class Soal5 {

    public static void main(String[] args) {

        //Soal 5 : Array
        // Array untuk menyimpan harga tiket untuk 5 film
        int[] hargaTiket = {50000, 60000, 70000, 80000, 90000};

        // Variabel untuk menyimpan total harga tiket
        int totalHarga = 0;

        // Menampilkan harga tiket untuk setiap film dan menghitung total harga
        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film " + (i + 1) + " : " + hargaTiket[i]);
            totalHarga += hargaTiket[i];
        }

        // Menampilkan total harga tiket
        System.out.println("Total harga tiket : " + totalHarga);
    }
}
