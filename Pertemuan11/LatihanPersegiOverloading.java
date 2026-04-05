/*
Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 19 Maret 2026 
*/
package Pertemuan11;

class PersegiPanjang {
    int panjang;
    int lebar;
    int luas; 
    int keliling;

    //constructor pertama utk 1 parameter
    public PersegiPanjang(int sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    //constructor kedua utk 2 parameter
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }
    
    //method utk menampilkan info
    public void tampilkanInfo(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Panjang     : " + panjang + " cm");
        System.out.println("Lebar       : " + lebar + " cm");
        System.out.println("Luas        : " + luas + " cm^2"); // cm^2 maksudnya adalah cm pangkat 2 (persegi) 
        System.out.println("Keliling    : " + keliling + " cm\n");
    }
}

public class LatihanPersegiOverloading {
    public static void main(String[] args){

        //membuat objek dgn 1 parameter
        PersegiPanjang objek1 = new PersegiPanjang(5);
        objek1.tampilkanInfo();

        //membuat objek de=gn 2 parameter
        PersegiPanjang objek2 = new PersegiPanjang(8, 4);
        objek2.tampilkanInfo();

    }
}
