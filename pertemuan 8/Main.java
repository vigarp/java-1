import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);

        String jawab;

        do {
            System.out.println("Programm....");
            System.out.println("....");

            System.out.println("Apakah ingin mengulang progam: ");
            jawab = masuk.nextLine();

        } while (jawab.equalsIgnoreCase("ya"));

        System.out.println("Program seleasi");
    }
}
