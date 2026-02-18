/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 18 Februari 2026 
*/
package Pertemuan4;

public class LatihanCounter {
    public static void main(String[] args) {
        
        System.out.println("=== COUNTER ===");

        int nilaiAwal = 10;
        System.out.println("Nilai awal          : " + nilaiAwal);
        
        nilaiAwal++;
        nilaiAwal++;
        System.out.println("Setelah ++ (2x)     : " + nilaiAwal);

        nilaiAwal--;
        System.out.println("Setelah --          : " + nilaiAwal);

        nilaiAwal += 5;
        System.out.println("Setelah += 5        : " + nilaiAwal);

        nilaiAwal -= 3;
        System.out.println("Setelah -= 3        : " + nilaiAwal);

        nilaiAwal *= 2;
        System.out.println("Setelah *= 2        : " + nilaiAwal);
        
    }
}
