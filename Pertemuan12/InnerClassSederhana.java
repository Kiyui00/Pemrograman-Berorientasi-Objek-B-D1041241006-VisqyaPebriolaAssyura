/*
Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 24 Maret 2026 
*/
package Pertemuan12;

//outer class
class Sekolah{
    String namaSekolah;

    //constructor untuk outer class Sekolah
    Sekolah(String namaSekolah){
        this.namaSekolah = namaSekolah;
    }

    //inner class
    class Kelas{
        String namaKelas;

        //constructor untuk inner class Kelas
        Kelas(String namaKelas){
            this.namaKelas = namaKelas;
        }

        /* method di dalam inner class untuk menampilkan info
        diletakkan di dalam inner class karena method ini akan mengakses atribut dalam inner class 
        dan juga agar terlihat lebih rapi jika diletak di dalam inner class yang bersangkutan*/
        public void info(){
            System.out.println("Sekolah     : " + namaSekolah);
            System.out.println("Kelas       : " + namaKelas);
        }
    }
}

public class InnerClassSederhana {
    public static void main(String[] args) {
        
    //membuat objek outer untuk outer class Sekolah
    Sekolah objekOuter = new Sekolah("SMA Negeri 1");

    //membuat objek inner dari inner class Kelas melalui objek outer yang sudah dibuat sebelumnya
    Sekolah.Kelas objekInner = objekOuter.new Kelas("X-A");

    System.out.println();
    objekInner.info();
    System.out.println();
    // line 35 dan 37 hanya untuk membuat output terlihat lebih rapi

    }
}
