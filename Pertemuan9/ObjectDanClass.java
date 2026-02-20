/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 20 Februari 2026 
*/
package Pertemuan9;

    class Mobil {
        String merk;
        String warna;
        int tahun;
        int kecepatan;

        public void percepat(){
            System.out.println("Kecepatan Mobil         : " + kecepatan + " m/s");
        }

        public void tampilkanInfo(){
            System.out.println("Merk Mobil              : " + merk);
            System.out.println("Warna Mobil             : " + warna);
            System.out.println("Tahun Mobil             : " + tahun);
            System.out.println("Kecepatan Mobil         : " + kecepatan);
        }
    }

public class ObjectDanClass {
    public static void main(String[] args){
        Mobil obj =new Mobil();

        obj.merk = "Pajero";
        obj.warna = "Maroon";
        obj.tahun = 1999;
        obj.kecepatan = 120; 

        obj.tampilkanInfo();
    }
}
