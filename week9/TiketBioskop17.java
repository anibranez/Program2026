import java.util.Scanner;

public class TiketBioskop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0;
        int totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket pelanggan (0 untuk selesai): ");
            int jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan ulang!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            int diskonPersen = 0;
            if (jumlah > 10) {
                diskonPersen = 15;
            } else if (jumlah > 4) {
                diskonPersen = 10;
            }

            int harga = jumlah * hargaTiket;
            int bayar = harga - (harga * diskonPersen / 100);

            System.out.println("Diskon " + diskonPersen + "%, total bayar: Rp " + bayar);

            totalTiket += jumlah;
            totalPenjualan += bayar;
        }

        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);
        sc.close();
    }
}