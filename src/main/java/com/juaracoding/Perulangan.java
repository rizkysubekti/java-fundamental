package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
    //Challenge Day 4
    public static void main(String[] args) {
//         Menampilkan angka ganjil 1, 3, 5, dan 7
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        int sisi = 10; // Panjang sisi segitiga
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int sisis = 10;
        for (int i = 0; i < sisis; i++) {
            for (int j = 0; j < sisis - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        int input = -1; // Inisialisasi input dengan nilai non-0

        while (input != 0) {
            System.out.print("Masukkan angka (tekan 0 untuk berhenti): ");
            input = scanner.nextInt(); // Membaca input dari pengguna
        }

        System.out.println("Loop berhenti karena Anda menekan 0.");
        scanner.close(); // Menutup Scanner
    }
}
