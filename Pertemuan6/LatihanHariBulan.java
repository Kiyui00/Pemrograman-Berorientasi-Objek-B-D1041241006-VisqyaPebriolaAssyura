/*Nama: Visqya Pebriola Assyura  
NIM: D1041241006
Tanggal: 23 Februari 2026 
*/
package Pertemuan6;

public class LatihanHariBulan {
    public static void main(String[] args) {
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");

        int bulan = 4;
        int jumlahHari = 0;
        String namaBulan = "temp";

        switch (bulan){
            case 1:
                namaBulan = "Januari";
            case 3:
                if (bulan == 3) namaBulan = "Maret";
            case 5:
                if (bulan == 5) namaBulan = "Mei";
            case 7:
                if (bulan == 7) namaBulan = "Juli";
            case 8:
                if (bulan == 8) namaBulan = "Agustus";
            case 10:
                if (bulan == 10) namaBulan = "Oktober";
            case 12:
                if (bulan == 12) namaBulan = "Desember";

                jumlahHari = 31;
                break;

            case 4:
                namaBulan = "April";
            case 6:
                if (bulan == 6) namaBulan = "Juni";
            case 9:
                if (bulan == 9) namaBulan = "September";
            case 11:
                if (bulan == 11) namaBulan = "November";

                jumlahHari = 30;
                break;

            case 2:
                namaBulan = "Februari";
                jumlahHari = 28;
                break;

            default:
            System.out.println("Bulan tidak valid");
            break;
        }

        System.out.println("Bulan           : " + namaBulan + " (bulan ke-" + bulan + ")");
        System.out.println("Jumlah hari     : " + jumlahHari + " hari");

    }
}
