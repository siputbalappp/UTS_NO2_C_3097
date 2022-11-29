/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3097;

/**
 *
 * @author DELL
 */
public class ProjectPlanner_3097 extends Employees_3097 {
    int komisi_3097, totalHasilProyek;
    
    public ProjectPlanner_3097(String Nama_3097, int NIP_3097, int komisi_3097, int totalHasilProyek){
    super(Nama_3097, NIP_3097);
    this.komisi_3097 = komisi_3097;
    this.totalHasilProyek = totalHasilProyek;
    }
    
    public int HitungGaji(){
        Gaji_3097 = Gaji_3097 + (komisi_3097 * totalHasilProyek) - (5/100 * Gaji_3097);
        return Gaji_3097;
    }
    
    public void cetakProjectPlanner(){
        super.cetakEmployees_3097();
        System.out.println("Komisi :" + komisi_3097);
        System.out.println(" Total hasil proyek :" +totalHasilProyek);
        System.out.println("total gaji :" + HitungGaji());
    }
}
