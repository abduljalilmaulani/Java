/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

/**
 * @author Abdul Jalil Maulani
 * NIM                  : A2.1900002
 * NAMA                 : Abdul Jalil Maulani
 * KELAS                : TI -1B
 * Deskripsi Program    : KAMBING STATIC & KONSTANTA (Implementasi pada dua class) 
 */
public class KambingStatic {
 //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki Kambing sebanyak " + Mamalia.jumlahKambing);
    }
}
