/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3097;

/**
 *
 * @author Zarif Afzal Ramadhan
 * 21103097
 * S1SI05C
 */
public class UTS_NO2_C_3097 {

    public static void main(String[] args) {
        SalariedEmployee_3097 S = new SalariedEmployee_3097("Cinta", 21103078, 3000000);
        CommisionEmployee_3097 C = new CommisionEmployee_3097("Andi", 21103078, 3500000, 1000000);
        ProjectPlanner_3097 P = new ProjectPlanner_3097("Budi", 2130223, 4000000, 2000000);
        
        System.out.println("==== DATA PEGAWAI PERUSAHAAN ====");
        S.cetakSalariedEmployee();
        System.out.println("");
        C.cetakCommisionEmployees_3097();
        System.out.println("");
        P.cetakProjectPlanner();
        System.out.println("");
    }
}
