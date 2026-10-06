import java.util.Scanner;

public class KalkulatorPPh21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pkp;
        double pajak;

        System.out.print("Masukkan Penghasilan Kena Pajak (PKP): Rp ");
        pkp = sc.nextDouble();

        if (pkp <= 0) {
            pajak = 0;
        } 
        else if (pkp <= 60000000) {
            pajak = 0.05 * pkp;
        } 
        else if (pkp <= 250000000) {
            pajak = (0.05 * 60000000)
                    + (0.15 * (pkp - 60000000));
        } 
        else if (pkp <= 500000000) {
            pajak = (0.05 * 60000000)
                    + (0.15 * (250000000 - 60000000))
                    + (0.25 * (pkp - 250000000));
        } 
        else {
            pajak = (0.05 * 60000000)
                    + (0.15 * (250000000 - 60000000))
                    + (0.25 * (500000000 - 250000000))
                    + (0.30 * (pkp - 500000000));
        }

        System.out.println("\n=== HASIL PERHITUNGAN PPh 21 ===");
        System.out.println("PKP   : Rp " + pkp);
        System.out.println("Pajak : Rp " + pajak);

        sc.close();
    }
}