/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3097;

/**
 *
 * @author DELL
 */
public class CommisionEmployee_3097 extends Employees_3097{
    int komisi_3097, totalPenjualan_3097;
    
    public CommisionEmployee_3097(String Nama_3097, int NIP_3097, int komisi_3097, int totalPenjualan){
        super(Nama_3097,NIP_3097);
        this.komisi_3097 = komisi_3097;
        this.totalPenjualan_3097 = totalPenjualan_3097;
    }
    public int HitungGaji(){
        Gaji_3097 = Gaji_3097 + (komisi_3097 + totalPenjualan_3097);
        return Gaji_3097;
    }
    public void cetakCommisionEmployees_3097(){
        System.out.println("Komisi :" + komisi_3097);
        System.out.println("Total Penjualan        :" + totalPenjualan_3097);
        System.out.println("Total Gaji :" + HitungGaji());
    }
}
