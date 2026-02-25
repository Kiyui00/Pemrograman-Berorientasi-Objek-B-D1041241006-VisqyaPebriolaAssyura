/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 25 Februari 2026 
*/
package Pertemuan7;

public class LatihanDeretGanjil {
    public static void main(String[] args) {
        int angka = 1;

        System.out.println("=== BILANGAN GANJIL 1-15 ===");

        while(angka <= 15) {
            if(angka % 2 != 0) {
                System.out.print(angka + " ");
            }

            angka++;
        }
    }
}
