import java.util.Scanner;

public class Pertemuan5 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.println("Masukkan nama Anda: ");
        String nama = masuk.nextLine();

        System.out.println("Masukkan NIM Anda: ");
        String nim = masuk.nextLine();

        System.out.println("Masukkan nilai tugas Anda: ");
        int nilaiTugas = masuk.nextInt();

        System.out.println("Masukkan nilai UTS Anda: ");
        int nilaiUTS = masuk.nextInt();

        System.out.println("Masukkan nilai UAS Anda: ");
        int nilaiUAS = masuk.nextInt();

        int nilaiAkhir = (30 * nilaiTugas + 30 * nilaiUTS + 40 * nilaiUAS) / 100;

        System.out.println("============================");


        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        
        if (nilaiAkhir >= 80) {
            System.out.println("Total nilai Anda: "+nilaiAkhir);
            System.out.println("Selamat nilai Anda A");
        } else if (nilaiAkhir >= 65) {
            System.out.println("Total nilai Anda: "+nilaiAkhir);
            System.out.println("Selamat nilai Anda B");

        } else if (nilaiAkhir >= 40) {
            System.out.println("Total nilai Anda: "+nilaiAkhir);
            System.out.println("Selamat nilai Anda C");

        } else if (nilaiAkhir >= 0) {
            System.out.println("Total nilai Anda: "+nilaiAkhir);
            System.out.println("Selamat nilai Anda D");

        }
    }
}
