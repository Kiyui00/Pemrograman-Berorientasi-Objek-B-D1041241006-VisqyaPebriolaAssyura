package Pertemuan15;

class Kalkulator {
    public double hitungRataRata(int count, int... nilai){
        int sum = 0;
        for(int a : nilai){
            sum += a;
        } 
        return sum/count;
    }
}

public class MethodVarArgs {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        System.out.println("Rata - rata (3 nilai) : " + k.hitungRataRata(3, 75, 85, 90));

        Kalkulator k2 = new Kalkulator();
        System.out.println("Rata - rata (3 nilai) : " + k2.hitungRataRata(5, 80, 85, 90, 95, 100));
    }
}