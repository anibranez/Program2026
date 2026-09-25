import java.util.Scanner;
public class StudiKasusMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lembar;
        int biayaCetak;
        int biayaPenjilitan;
        System.out.print("Jumlah Lembar : ");
        lembar = input.nextInt();
        biayaCetak = lembar * 500;
        biayaPenjilitan = 5000;
        int totalBiaya = biayaCetak + biayaPenjilitan;
        System.out.println("Biaya Cetak : " + biayaCetak);
        System.out.println("Biaya Penjilitan : " + biayaPenjilitan);
        System.out.println("Total Biaya : " + totalBiaya);
    }
}