/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan6.kambingstatic;

/**
 *
 * @author 
 * Nama  : Rizal Arif Nugraha
 * Kelas : PBO2 
 * NIM   : 10117048
 * Deskripsi Program : Program ini berisi program untuk menampilkan data yang
 * diimplementasi pada dua class.

 */

public class PBO210117048Latihan6KambingStatic {
 //NAMA_KAMBING sesuai konstanta
    public static final String NAMA_KAMBING = " MIDUN ";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing);
    }
    
}
