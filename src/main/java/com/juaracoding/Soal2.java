package com.juaracoding.ujianjf;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {

        //soal 2 : String Method
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Film:");
        String namaFilm = "Avengers: Endgame"; //memasukkan nama film
        System.out.println("Memasukkan Nama Film:" +namaFilm);
        String namaFilmUppercase = namaFilm.toUpperCase(); //mengubah nama film menjadi huruf besar semua
        System.out.println("Nama Film Dalam Huruf Besar:" + namaFilmUppercase);




    }
}
