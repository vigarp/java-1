import java.util.Scanner;;

public class Main {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        String nama;
        String kelas;

        System.out.println("Masukan nama Anda: ");
        nama = masuk.nextLine();

        System.out.println("Masukan kelas Anda: ");
        kelas = masuk.nextLine();
        

        System.out.println("");
        System.out.println("Data nama Anda " + nama);
        System.out.println("");
        System.out.println("Data kelas Anda " + kelas);

        double angka1, angka2;

        System.out.println();
        System.out.println("Masukkan angka pertama: ");
        angka1 = masuk.nextDouble();

        System.out.println();
        System.out.println("Masukkan angka kedua:");
        angka2 = masuk.nextDouble();

        System.out.println();

        System.out.println("Hasil pertambahan " + angka1 + " dan " + angka2 + " adalah " + (angka1 + angka2));
        System.out.println("Hasil pengurangan " + angka1 + " dan " + angka2 + " adalah " + (angka1 - angka2));
        System.out.println("Hasil perkalian " + angka1 + " dan " + angka2 + " adalah " + (angka1 * angka2));
        System.out.println("Hasil pembagian " + angka1 + " dan " + angka2 + " adalah " + (angka1 / angka2));
    }
}