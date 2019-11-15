/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 * @author Abdul Jalil Maulani
 * NIM                  : A2.1900002
 * NAMA                 : Abdul Jalil Maulani
 * KELAS                : TI -1B
 * Deskripsi Program    : KAMBING
 */
public class Latihan4 {
    
    public void tambahKambing() {
    //Deklarasi Variabel lokal
    int jumlahKambing = 0;
    
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan4 kambingJantan = new Latihan4();
        kambingJantan.tambahKambing();
    }
}