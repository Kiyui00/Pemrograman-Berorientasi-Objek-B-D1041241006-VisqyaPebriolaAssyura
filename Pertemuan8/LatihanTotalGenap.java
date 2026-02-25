/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 25 Februari 2026 
*/
package Pertemuan8;

public class LatihanTotalGenap {
    public static void main(String[] args) {
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        
        int total = 0;

        for (int tambah = 1; tambah <= 20; tambah++) {
            if(tambah % 2 != 0) {
                continue;
            }

            total += tambah;
            System.out.println("Tambah: " + tambah + " -> Total: " + total);
        }

        System.out.println("---");
        System.out.println("Total akhir: " + total);
    }
}
