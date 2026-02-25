/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 25 Februari 2026 
*/

package Pertemuan7;

import java.util.Scanner;
public class LatihanValidasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.println("=== VALIDASI NILAI UJIAN ===");

        do { 
            nilai = input.nextInt();
            System.out.println("Percobaan input     : " + nilai);
            if (nilai < 0 || nilai > 100) {
                System.out.println("Error               : Nilai harus antara 0-100!\n");
            } 
            else {
                System.out.println("[OK] Nilai valid    : " + nilai + '\n');
            }

        } while (nilai < 0 || nilai > 100);

    }
}
