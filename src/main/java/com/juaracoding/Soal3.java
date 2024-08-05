package com.juaracoding.ujianjf;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Harga tiket weekday dan weekend
        final int HARGA_WEEKDAY = 35000;
        final int HARGA_WEEKEND = 45000;

        // Meminta pengguna memasukkan jumlah tiket
        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        // Meminta pengguna memasukkan jenis hari (1 untuk weekday, 2 untuk weekend)
        System.out.print("Masukkan jenis hari (1 untuk weekday, 2 untuk weekend): ");
        int jenisHari = scanner.nextInt();

        int hargaTiket = (jenisHari == 1) ? HARGA_WEEKDAY : HARGA_WEEKEND;

        // Menghitung total harga
        int totalHarga = hargaTiket * jumlahTiket;

        // Memberikan diskon jika jumlah tiket lebih dari 5
        if (jumlahTiket > 5) {
            totalHarga *= 0.9;  // Diskon 10%
        }

        // Mencetak total harga
        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Total harga (dengan diskon): " + totalHarga);
    }
}
