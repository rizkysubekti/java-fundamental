package com.juaracoding;
import java.util.Scanner;
import java.util.Locale;

public class ArrayJava {
    public static void main(String[] args) {
        //cara 1

        int [] nilai = {86,87,88,89,90};
        System.out.println(nilai[2]);
        System.out.println(nilai.length);

        for (int i = 0; i< nilai.length; i++){
            System.out.println(nilai[1]);
        }

        //cara2
        int[] grades = new int[5];
        grades[0] = 86;
        grades[1] = 87;
        grades[2] = 88;
        grades[3] = 89;
        grades[4] = 90;
        grades[4] = 91;

        //for i
        for (int i = 0; i< grades.length; i++){
            System.out.println(grades[i]);
        }

        //foreach
        for (double grade : grades) {
            System.out.printf("%.2f%n", grade);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for(String car : cars){
//            System.out.println(car.toUpperCase());
//        }
//
//        //Array Multi Dimensi, Baris dan Kolom
//        int[][] number = {{1,2,3,4},{5,6,7}};
//        int rowIndex = 0;
//        int columnIndex = 3;
//        System.out.println(number[1][2]);
//        System.out.println(number[0][3]);
//        System.out.println(number[rowIndex][columnIndex]);
//
//        for (int i = 0; i < number.length; i++){//row length
//            for (int j = 0; j < number[i].length; j++){//column length
//                System.out.println(number[i][j]); //awal: number[0][0]
//            }
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan jumlah data: ");
//        int dataLength = input.nextInt();
//        int[] price = new int[dataLength];;
//        for (int i = 0; i < price.length; i++){
//            System.out.println("Masukkan harga ke-"+(1+1)+":");
//
//
//        }
//        System.out.println("================Challenge=====================");
//        Scanner scanner = new Scanner(System.in);
//        double[] prices = new double[5];
//        double total = 0;
//
//
//        for (int i = 0; i < prices.length; i++) {
//            System.out.print("Masukkan harga ke-" + (i + 1) + ": ");
//            prices[i] = scanner.nextDouble();
//        }
//
//
//        for (double price : prices) {
//            total += price;
//        }
//
//
//        System.out.println("Jumlah total harga: " + total);
//
//        scanner.close();

        //search
        //cari salah  satu data mobil gunakan array
        //if(search equals cars[i]) break
//        boolean isFound = false;
//        Scanner input = new Scanner(System.in);
//        System.out.println("cari mobil: ");
//        String search = input.next();
//        for (int j = 0; j < cars.length; j++){
//            if(search.equalsIgnoreCase(cars[j])){
//                isFound = true;
//                break;
//            }
//        }
//
//        if (isFound){
//            System.out.println("Data ditemukan");
//        }else {
//            System.out.println("Data tidak ditemukan");
//        }
        //cari kata terpanjang dari data cars
        //result: Toyota
        // langkah: length(), 6 < 6(false)
        String kataTerpanjang = cars[0];
            for (int z = 0; z < cars.length; z++){
                if (kataTerpanjang.length() < cars[z].length()){
                    kataTerpanjang = cars[z];
                }
            }
        System.out.println(kataTerpanjang);
    }
}
