/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3097;

/**
 *
 * @author DELL
 */
public class SalariedEmployee_3097 extends Employees_3097 {
    int upahMingguan, Gaji_3097;
    
    public SalariedEmployee_3097(String Nama_3097, int NIP_3097, int upahMingguan){
        super(Nama_3097, NIP_3097);
        this.upahMingguan = upahMingguan;
    }
    public int HitungGaji(){
     Gaji_3097 = upahMingguan;
     return Gaji_3097;
    }
    
    public void cetakSalariedEmployee(){
        super.cetakEmployees_3097();
        System.out.println("Upah Mingguan   :" + HitungGaji());
    }
}
