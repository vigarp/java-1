import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          // Create object
          Mahasiswa mhs = new Mahasiswa();

          // Input data
          System.out.println("Masukkan nama: ");
          mhs.nama = input.nextLine();

          System.out.println("Masukkan NIM: ");
          mhs.nim = input.nextLine();

          System.out.println("Masukkan nilai: ");
          mhs.nilai = input.nextInt();

          mhs.tampilkanData();

     }
}
