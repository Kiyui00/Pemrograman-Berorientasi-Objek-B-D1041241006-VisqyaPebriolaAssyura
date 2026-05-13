package Pertemuan15;

public class RefactoringEnhancedFor {
    public static void main(String[] args){
        String[] buah = {"Apel", "Jeruk", "Mangga", "Anggur"};

        //enhance for loop (for-each)
        for(String s : buah){
            System.out.println("Buah: " + s);
        }
    }
}