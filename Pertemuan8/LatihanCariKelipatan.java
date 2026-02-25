/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 25 Februari 2026 
*/
package Pertemuan8;

public class LatihanCariKelipatan {
    public static void main(String[] args) {

        System.out.println("=== CARI KELIPATAN 7 ===");
        
        for (int cek = 1; cek <= 50; cek++) {
            System.out.println("Cek: " + cek);

            if(cek % 7 == 0) {
                System.out.println("[OK] Kelipatan 7 pertama: " + cek + "\nPencarian selesai.");
                break;
            }
        }
    }

    /*
    izin buk, saya tidak bisa menampilkan simbol centang,
    sebagai gantinya saya memakai "[OK]"
     */   
}
