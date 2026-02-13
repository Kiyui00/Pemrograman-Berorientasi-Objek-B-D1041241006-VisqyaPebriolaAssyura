/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 13 Februari 2026 
*/

package Pertemuan3;
public class LatihPerhitungan {
    public static void main(String[] args){

    System.out.println("=== SIMULASI TRANSAKSI BANK ===");

    int saldo = 1000000;
    System.out.println("Saldo Awal          : " + saldo);

    int setoran = 500000;
    System.out.println("Setoran             : " + setoran);

    saldo += setoran;
    System.out.println("Saldo Setelah Setor : " + saldo);

    int penarikan = 250000;
    System.out.println("Penarikan           : " + penarikan);

    saldo -= penarikan;
    System.out.println("Saldo Akhir         : " + saldo);

    }
}
