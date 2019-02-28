/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class clsMonan {
    private String mamon;
    private String tenmon;
    private String hinhanh;
    private double dongia;
    private String maloai;
    public clsMonan() {
    }
    public clsMonan(String mamon, String tenmon, String hinhanh, double dongia, String maloai){
        this.mamon= mamon;
        this.tenmon = tenmon;
        this.hinhanh = hinhanh;
        this.dongia = dongia;
        this.maloai = maloai;
    }
    public void setMamon(String mamon){
        this.mamon = mamon;
    }
    public String getMamon(){
        return mamon;
    }
    public void setTenmon(String tenmon){
        this.tenmon = tenmon;
    }
    public String getTenmon(){
        return tenmon;
    }
    public void setHinhanh(String hinhanh){
         this.hinhanh = hinhanh;
    }
    public String getHinhanh(){
         return hinhanh;
    }
    public void setDongia(double dongia){
        this.dongia = dongia;
    }
    public double getDongia(){
        return dongia;
    }
    public void setMaloai(String maloai){
        this.maloai = maloai;
    }
    public String getMaloai(){
        return maloai;
    }
}
