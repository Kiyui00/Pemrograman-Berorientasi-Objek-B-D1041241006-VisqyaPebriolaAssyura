/*
Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 24 Maret 2026 
*/
package Pertemuan12;

class Mahasiswa{
    static int jumlahMahasiswa;
    String nama;

    //constructor
    Mahasiswa(String n){
        this.nama = n;
        jumlahMahasiswa++;
    }

    //method untuk menampilkan info
    public void show(){
        System.out.println("Mahasiswa dibuat: " + nama);
    }

    //static method
    static int getJumlah(){
        return jumlahMahasiswa;
    }
} 

public class StaticCounter{
    public static void main(String[] args) {

        //pembuatan objek
        Mahasiswa m1 = new Mahasiswa("Andi");
        Mahasiswa m2 = new Mahasiswa("Budi");
        Mahasiswa m3 = new Mahasiswa("Citra");
        m1.show();
        m2.show();
        m3.show();

        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.jumlahMahasiswa);
    }
}
