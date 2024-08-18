package com.juaracoding.oop;

import java.util.ArrayList;

    public class Cart {
        private ArrayList<Product> products;

        // Konstruktor
        public Cart() {
            products = new ArrayList<>();
        }

        // Metode untuk menambahkan produk ke keranjang
        public void addToCart(Product product) {
            products.add(product);
            System.out.println(product.getProductId() + " added to cart.");
        }

        // Metode untuk menampilkan semua produk di keranjang
        public void viewCart() {
            System.out.println("Products in cart:");
            for (Product product : products) {
                product.detailProduct();
                System.out.println(); // Tambahkan baris kosong untuk pemisah
            }
        }
    }




