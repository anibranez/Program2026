import java.util.Scanner;
public class MenghitungTotalBayar17 {
    public static void main(String[] args) {
        int harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        Scanner sc = new Scanner(System.in);
        harga=sc.nextInt();
        potongan = diskon*harga;
        jml_bayar = harga-potongan;
        System.out.println(" Jumlah yang harus anda bayar adalah " + jml_bayar);

    }
}