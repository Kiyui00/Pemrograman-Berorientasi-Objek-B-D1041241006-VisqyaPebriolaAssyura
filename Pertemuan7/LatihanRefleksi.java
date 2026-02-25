/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 25 Februari 2026 
*/
package Pertemuan7;

public class LatihanRefleksi {
    public static void main(String[] args) {
        int angka = 1;

        System.out.println("=== MENGGUNAKAN WHILE ===");
        
        while (angka <= 5) {
            System.out.print(angka + " ");
            angka++;
        }

        System.out.println("\n\n=== MENGGUNAKAN DO-WHILE ===");
        
        angka = 1;
        do { 
            System.out.print(angka + " ");
            angka++;
        } while (angka <= 5);

        System.out.println("\n\n=== MENGGUNAKAN FOR ===");

        for(int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        /*
            menurut saya, dalam kasus seperti ini,
            jenis loop yang paling mudah dipahami adalah menggunakan for-loop karena kita sudah tau range loop dari berapa sampai berapa,
            sehingga program yang ditulis menjadi jauh lebih ringkas dan sederhana karena kita hanya perlu men-state kondisi mulai range berapa sampai berapa saja.
        */

    }
}
