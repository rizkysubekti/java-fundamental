package com.juaracoding.oop;

public class MainConcept {
    public static void main(String[] args) {

        User admin = new User();
        admin.setUsername("adm1n");
        admin.setPassword("p4assword");
        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());

        User staff = new User();
        staff.setUsername("st4ff");
        staff.setPassword("p4ssword");
        System.out.println(staff.getUsername());
        System.out.println(staff.getPassword());

        staff.setCurrrenPassword("p4ssword");
        staff.setNewPassword("1234");
        staff.setConfirmPassword("1234");
        staff.changePassword(staff.getCurrrenPassword(), staff.getNewPassword(), staff.getConfirmPassword());


        //polimorphisme Overloading
        Callculator Callculator = new Callculator();
        Callculator.sum(5,8);
        Callculator.sum(5.4, 9.2);

        BidangDatar bidangDatar = new BidangDatar();
        bidangDatar.draw();
        BidangDatar segitiga = new Segitiga();
        segitiga.draw();

        //inheritance

    }
}
