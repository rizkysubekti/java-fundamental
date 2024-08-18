package com.juaracoding.oop;

public class User {
    private String username;
    private String password;
    private String currrenPassword;
    private String newPassword;
    private String confirmPassword;

//    public User(String username,String password){
//        this.username = username;
//        this.password = password;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCurrrenPassword() {
        return currrenPassword;
    }

    public void setCurrrenPassword(String currrenPassword) {
        this.currrenPassword = currrenPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    //change password

    public void changePassword(String currrenPassword, String newPassword, String confirmPassword) {
        boolean isCurrentPassword = getPassword().equals(getCurrrenPassword());
        if (isCurrentPassword) {
            if (getNewPassword().equals(getConfirmPassword())) {
                System.out.println("Password Berhasil Diubah");
            } else {
                System.out.println("Password Tidak Sesuai");
            }
        } else {
            System.out.println("Old Password Tidak Sama");
        }
    }
}














//    public boolean changePassword(String oldPassword, String newPassword){
//
//        //verifikasi password lama dulu
//        if(this.password.equals(oldPassword)){
//            //ubah passwordnya
//            this.password = newPassword;
//            return true;
//        } else {
//            return false;
//        }
//    }
