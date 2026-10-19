import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        int harga, hargaTiket = 0, hargaPopcorn = 0, hargaMinum = 0;

        System.out.println("Film tersedia:");
        System.out.println("1. Avengers Doomsday (Rp. 70,000)");
        System.out.println("2. Laut Bercerita (Rp. 50,000");
        System.out.println("3. Avengers Endgame (Rp. 40,000)");
        System.out.println("Masukkan film yg akan ditonton:");
        String film = masuk.nextLine();

        switch (film) {
            case "Avengers Doomsday":
                System.out.println("Film yg Anda pilih" + film);
                hargaTiket = 70000;
                break;
            case "Laut Bercerita":
                System.out.println("Film yg Anda pilih" + film);
                hargaTiket = 50000;
                break;
            case "Avengers Endgame":
                System.out.println("Film yg Anda pilih" + film);
                hargaTiket = 40000;
                break;
        
            default:
                System.out.println("Salah masukkan judul film");
        }

        System.out.println("Apakah Anda ingin memesan popcorn?: (yes/no) ");
        String popCorn = masuk.nextLine();

        switch (popCorn) {
            case "yes":
                System.out.println("Tipe popcorn apa yg akan dipesan?: ");
                System.out.println("1. large (Rp. 70,000)");
                System.out.println("2. medium (Rp. 60,000");
                System.out.println("3. small (Rp. 40,000)");
                String popCornSize = masuk.nextLine();

                switch (popCornSize) {
                    case "large":
                        System.out.println("Anda memesan ukuran" + popCornSize);
                        hargaPopcorn = 70000;
                        break;
                    case "medium":
                        System.out.println("Anda memesan ukuran" + popCornSize);
                        hargaPopcorn = 60000;
                        break;

                    case "small":
                        System.out.println("Anda memesan ukuran" + popCornSize);
                        hargaPopcorn = 40000;
                        break;
                
                    default:
                        System.out.println("Tidak jadi memesan popcorn");
                }
                break;
        
            default:
                System.out.println("Tidak memesan popcorn");
        }

        System.out.println("==================================");
        harga = hargaTiket + hargaPopcorn;

        System.out.println("Total Harga Anda " + harga);

    }
}
