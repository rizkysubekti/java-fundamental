package com.juaracoding;

public class MethodJava {
    public static void main(String[] args) {

        //reusable
        kotak(5);
        kotak(8);
        System.out.println(luasKotak(15));
        System.out.println(luasKotak(20));
        volumeKotak(20);
        System.out.println(setName("Indonesia", "Jakarta"));
        detailProduk("Elektronik", "Hp", 300000);
        detailProduk("Makanan", "Roti", 199999);
    }

    static void kotak(int sisi) {
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int luasKotak(int sisi) {
        return sisi * sisi;
    }

    //volumekotak luaskotak()*sisi
    static void volumeKotak(int sisi) {
        System.out.println(luasKotak(sisi) * sisi);
    }

    static String setName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // code login return value boolean
    static boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("p4ssw0rd")) {
            return true;
        } else {
            return false;
        }
    }
    //CHALLENGEEEEEEEEEE
    //buatkan method menampilkan detail produk(category, productName, Price)
    static void detailProduk(String category, String productName, double price) {
        System.out.println("=======================");
        System.out.println("Kategori: " + category);
        System.out.println("Nama Produk: " + productName);
        System.out.println("Harga: Rp " + String.format("%,.2f", price));
        System.out.println();
    }

    //calculateTdx() if salary > 7000 tax 10% (< 7000 bukan wajib pajak 0%)
    //totalSalaryPerYear()

    static double calcylateTax(double salary) {
        if (salary >= 7000) {
            return salary * 0.1;
        } else {
            return salary * 0;
        }
    }

//    //salary*12 - calculateTax*12 // (salary-calculateTax())*12
//    static void totalSalaryPerYear(double salary){
//    double total = (salary-calcylateTax(salary))*12;
//        System.out.println("Total Gaji Bersih per Tahun"+total);
}
