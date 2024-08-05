package com.juaracoding.ujianjf;

import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {

        // Soal 4 : Perulangan
        Scanner input = new Scanner(System.in);
        String[] daftarFilm = new String[5];
        System.out.println("Daftar film bioskop");


        for (int i = 0; i < 5; i++) {
            System.out.println("Memasukkan nama film" + (i + 1) + ": ");
            String namaFilm = "Avengers: Endgame, Spider-Man: Homecoming, Black Panther, Thor: Regnarok, Doctor Strange";
            daftarFilm[i] = input.nextLine();
        }
        System.out.println("Film yang ingin ditonton:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + daftarFilm[i]);

        }
    }
}
