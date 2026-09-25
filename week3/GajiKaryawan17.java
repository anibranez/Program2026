import java.util.Scanner;

public class GajiKaryawan17 {
    public static void main(String[] args) {
        int gajiPokok;
        double bonus, totGaji;
        double tunjTransprt = 600000;
        double tunjMkn = 400000;
        Scanner sc = new Scanner(System.in);
        gajiPokok = sc.nextInt();
        bonus = 0.5 * gajiPokok;
        totGaji = gajiPokok + tunjMkn + tunjTransprt + bonus - (0.1 * gajiPokok);

        System.out.println("Bonus bulanan anda adalah Rp " + (int) bonus);
        System.out.println("Gaji yang diterima adalah  Rp " + (int) totGaji);



        
    }
}