/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 18 Februari 2026 
*/
package Pertemuan4;

public class LatihanProduk {
    public static final double PAJAK = 0.11;
    public static void main(String[] args){

        String namaProduk = "Laptop Asus";
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean isAvailable = true;

        int totalNilaiStok = hargaSatuan * jumlahStok;
        double pajak = totalNilaiStok * PAJAK;

        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk          : " + namaProduk);
        System.out.println("Harga Satuan         : Rp " + hargaSatuan);
        System.out.println("Jumlah Stok          : " + jumlahStok);
        System.out.println("Status Tersedia      : " + isAvailable);
        System.out.println("---");
        System.out.println("Total Nilai Stok     : Rp " + totalNilaiStok);
        System.out.printf("Pajak (11%%)          : Rp %.0f\n", pajak);

    }
}
