/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3097;

/**
 *
 * @author DELL
 */
public class Employees_3097 {
    protected int NIP_3097, Gaji_3097;
    protected String Nama_3097;
        
    public Employees_3097(String Nama_3097, int NIP_3097)
    {
        this.Nama_3097 = Nama_3097;
        this.NIP_3097 = NIP_3097;
            
    }
    public int HitungGaji(){
        return Gaji_3097;
    }
    public void cetakEmployees_3097(){
        System.out.println("Nama Karyawan   :" + Nama_3097);
        System.out.println("NIP             :" + NIP_3097);
    }
      
}
