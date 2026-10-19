import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah nama: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] namaMahasiswa = new String[jumlah];
        String[] nim = new String[jumlah];
        String[] umur = new String[jumlah];
        String[] tglLahir = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukan nama ke " + (i + 1));
            namaMahasiswa[i] = input.nextLine();
            System.out.println("Masukan nim ke " + (i + 1));
            nim[i] = input.nextLine();
            System.out.println("Masukan umur ke " + (i + 1));
            umur[i] = input.nextLine();
            System.out.println("Masukan tanggal lahir ke " + (i + 1));
            tglLahir[i] = input.nextLine();
        }

        System.out.println("===== DATA MAHASISWA =====");
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama " + namaMahasiswa[i]);
            System.out.println("NIM " + nim[i]);
            System.out.println("Umur " + umur[i]);
            System.out.println("Tanggal Lahir " + tglLahir[i]);
            System.out.println("===================");
        }

    }
}
