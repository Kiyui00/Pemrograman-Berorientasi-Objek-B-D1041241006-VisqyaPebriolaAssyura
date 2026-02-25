/*
Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 25 Februari 2026 
*/
package Pertemuan8;

public class LatihanKombinasiLoop {
    public static void main(String[] args) {

        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");

        boolean isFind = false; // penanda untuk baris yang dicari sudah ditemukan

        for (int baris = 1; baris <= 3; baris++) {
            for (int kolom = 1; kolom <= 5; kolom++) {
                System.out.println("Cek: [" + baris + ", " + kolom + "]");
                
                if (baris == 2 && kolom == 3) {
                    System.out.println("[OK] Koordinat ditemukan!");
                    System.out.println("Pencarian selesai.");
                    isFind = true;
                    break; // inner loop dihentikan karena koordinat baris dan kolom yang diinginkan sudah ditemukan
                } 
                
            }
            
            if (isFind) {
                break; // untuk menghentikan outer loop juga, jika tidak program akan terus dijalankan
            }

        }
    }
    /*
    izin buk, saya tidak bisa menampilkan simbol centang,
    sebagai gantinya saya memakai "[OK]"
     */ 
}
