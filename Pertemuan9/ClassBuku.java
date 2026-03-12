/*
Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 11 Maret 2026 
*/
package Pertemuan9;
class Buku {
    String judul;
    String pengarang;
    int harga;

    // Method untuk menampilkan informasi buku
    void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga     : Rp " + harga);
        System.out.println(); // Baris baru untuk kerapian
    }
}

public class ClassBuku {
    public static void main(String[] args) {
        // Membuat object pertama
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;

        // Membuat object kedua
        Buku buku2 = new Buku();
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;

        // Memanggil method tampilkanInfo() untuk setiap object
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}