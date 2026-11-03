import java.util.Scanner;

public class Tugas317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemua = 0;
            int tokoTerbanyak = 0;
            int barangTerbanyak = -1;

            for (int toko = 1; toko <= jumlahToko; toko++) {
                int pelanggan;
                do {
                    System.out.print("Jumlah pelanggan Toko " + toko + ": ");
                    pelanggan = sc.nextInt();
                    if (pelanggan < 0) {
                        System.out.println("Tidak boleh negatif. Ulangi input!");
                    }
                } while (pelanggan < 0);

                int totalBarang = 0;
                for (int p = 1; p <= pelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Jumlah barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarang += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + pelanggan
                        + ", total barang: " + totalBarang);

                totalSemua += totalBarang;
                if (totalBarang > barangTerbanyak) {   // '>' agar nomor toko terkecil dipilih saat sama
                    barangTerbanyak = totalBarang;
                    tokoTerbanyak = toko;
                }
            }

            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}