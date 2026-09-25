import java.util.Scanner;

public class Tugas1Pemilihan17 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uktLunas;

        System.out.println("---CETAK KRS SIAKAD---");
        System.out.print("Apakah UKT Sudah Lunas? (true/false): ");
        uktLunas = sc.nextBoolean();

        String pesan = uktLunas ? "Pembayaran terverifikasi" : "Registrasi di tolak";
        System.out.println(pesan);
        }
        }

