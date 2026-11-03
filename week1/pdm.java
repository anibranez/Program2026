
import java.util.Scanner;

public class pdm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id, nama, golongan = "";
        int kode, tanggal;
        double pemakaian;
        double tarifDasar = 0;
        double tarif1 = 0;
        double tarif2 = 0;
        double admin = 0;
        double biayaAir = 0;
        double sebelumDenda;
        double denda = 0;
        double total;

        // Input data pelanggan
        System.out.print("Id Pelanggan: ");
        id = sc.nextLine();

        System.out.print("Nama Pelanggan: ");
        nama = sc.nextLine();

        System.out.print("Kode Golongan (1-4): ");
        kode = sc.nextInt();

        System.out.print("Pemakaian Air (m3): ");
        pemakaian = sc.nextDouble();

        System.out.print("Tanggal Pembayaran (1-31): ");
        tanggal = sc.nextInt();

        // Validasi data menggunakan if-else
        if (kode < 1 || kode > 4) {
            System.out.println("Error: Kode golongan tidak valid!");
        } else if (pemakaian < 0) {
            System.out.println("Error: Pemakaian air tidak boleh negatif!");
        } else if (tanggal < 1 || tanggal > 31) {
            System.out.println("Error: Tanggal harus antara 1-31!");
        } else {

            // Menentukan golongan dan tarif dengan switch-case
            switch (kode) {
                case 1:
                    golongan = "Sosial";
                    tarifDasar = 1500;
                    tarif1 = 2000;
                    tarif2 = 3000;
                    admin = 2500;
                    break;

                case 2:
                    golongan = "Rumah Tangga";
                    tarifDasar = 3000;
                    tarif1 = 4500;
                    tarif2 = 6000;
                    admin = 5000;
                    break;

                case 3:
                    golongan = "Bisnis/UMKM";
                    tarifDasar = 6000;
                    tarif1 = 8000;
                    tarif2 = 10000;
                    admin = 10000;
                    break;

                case 4:
                    golongan = "Industri/Pabrik";
                    tarifDasar = 10000;
                    tarif1 = 13000;
                    tarif2 = 16000;
                    admin = 20000;
                    break;

                default:
                    System.out.println("Golongan tidak ditemukan.");
            }

            // Nested if untuk menghitung biaya pemakaian air
            if (kode >= 1 && kode <= 4) {
                if (pemakaian <= 10) {
                    biayaAir = 10 * tarifDasar;
                } else if (pemakaian <= 30) {
                    biayaAir = (10 * tarifDasar)
                             + ((pemakaian - 10) * tarif1);
                } else {
                    biayaAir = (10 * tarifDasar)
                             + (20 * tarif1)
                             + ((pemakaian - 30) * tarif2);
                }

                // Menghitung total sebelum denda
                sebelumDenda = biayaAir + admin;

                // Menghitung denda menggunakan if-else
                if (tanggal <= 20) {
                    denda = 0;
                } else if (tanggal <= 25) {
                    denda = sebelumDenda * 0.01;
                } else {
                    denda = sebelumDenda * 0.015;
                }

                // Nested if untuk menentukan total tagihan
                if (sebelumDenda >= 0) {
                    total = sebelumDenda + denda;

                    System.out.println("\n===== RINCIAN TAGIHAN PDAM =====");
                    System.out.println("Id Pelanggan  : " + id);
                    System.out.println("Nama Pelanggan: " + nama);
                    System.out.println("Golongan      : " + golongan);
                    System.out.println("Pemakaian     : " + pemakaian + " m3");

                    System.out.printf("Biaya Air     : Rp%.0f%n", biayaAir);
                    System.out.printf("Biaya Admin   : Rp%.0f%n", admin);
                    System.out.printf("Sebelum Denda : Rp%.0f%n", sebelumDenda);
                    System.out.printf("Denda         : Rp%.0f%n", denda);
                    System.out.printf("TOTAL TAGIHAN : Rp%.0f%n", total);
                } else {
                    System.out.println("Error: Total tagihan tidak valid.");
                }
            }
        }

        sc.close();
    }
}
