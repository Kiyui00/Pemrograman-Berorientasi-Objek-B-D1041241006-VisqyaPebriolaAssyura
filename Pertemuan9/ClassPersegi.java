/*
Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 11 Maret 2026 
*/
package Pertemuan9;

class Persegi {
    int sisi;
    int luas;
    int keliling;

    void hitungLuas() {
        luas = sisi * sisi;
    }

    void hitungKeliling() {
        keliling = 4 * sisi;
    }

    void tampilkanHasil() {
        System.out.println("=== PERSEGI ===\n");
        System.out.println("Sisi : " + sisi + " cm\n");
        System.out.println("Luas : " + luas + " cm²\n");
        System.out.println("Keliling: " + keliling + " cm\n");
    }
}

public class ClassPersegi {
    public static void main(String[] args) {

        Persegi p1 = new Persegi();

        p1.sisi = 5;

        p1.hitungLuas();
        p1.hitungKeliling();

        p1.tampilkanHasil();
    }
}
