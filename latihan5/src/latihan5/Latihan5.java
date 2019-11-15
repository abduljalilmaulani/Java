/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 * @author Abdul Jalil Maulani
 * NIM                  : A2.1900002
 * NAMA                 : Abdul Jalil Maulani
 * KELAS                : TI -1B
 * Deskripsi Program    : KAMBING GLOBAL
 */
public class Latihan5 {

    //Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //method untuk menampilkan jumlakambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing +5;
        System.out.println("Jumlah ambing setelah ditambah: " + jumlahKambing );
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan5 Kambingsusu = new Latihan5 ();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        Kambingsusu.getJumlahKambing();
        
        //Menambah satu kambing
        Kambingsusu.tambahKambing();
        
        //Menampilkan jumlah Kambing
        Kambingsusu.getJumlahKambing();
    }
    
}
