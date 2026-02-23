/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 23 Februari 2026 
*/
package Pertemuan6;

public class LatihanRestoran {
    public static void main(String[] args) {
        System.out.println("=== MENU RESTORAN ===");

        int kodeMenu = 1;
        int jumlah = 2;

        String namaMenu = "temp";
        int harga = 0;
        int total = 0;

        switch (kodeMenu){
            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                namaMenu = "Mie Ayam";
                harga = 12000;
                break;
            case 3:
                namaMenu = "Bakso";
                harga = 10000;
                break;
            case 4:
                namaMenu = "Soto Ayam";
                harga = 13000;
                break;
            case 5:
                namaMenu = "Es Teh";
                harga = 3000;
                break;
            default:
                System.out.println("Kode menu tidak valid!");
                break;
        }
        total = harga * jumlah;

        System.out.println("Kode Menu       : " + kodeMenu);
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("\nPesanan Anda:");
        System.out.println("Nama Menu       : " + namaMenu);
        System.out.println("Harga Satuan    : Rp " + harga);
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("---");
        System.out.println("Total Bayar     : Rp " + total);
    }
}
