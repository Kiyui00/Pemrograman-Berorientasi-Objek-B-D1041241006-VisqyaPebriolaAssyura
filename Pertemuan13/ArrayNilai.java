/*
Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 27 Maret 2026 
*/
package Pertemuan13;

public class ArrayNilai {
    public static void main(String[] args){

        System.out.println("=== DAFTAR NILAI ===");
        int[] nilai = {2, 5, 7, 11, 13};
        
        for(int i = 0; i<5; i++){
            System.out.println("Nilai " + i + " : " + nilai[i]);
        }

        System.out.println("Total Nilai : " + nilai.length);

    }
}
