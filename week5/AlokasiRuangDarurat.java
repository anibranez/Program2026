import java.util.Scanner;

public class AlokasiRuangDarurat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double spo2, tekananSistolik, suhu;
        int sisaBedICU, usia;
        double lajuNapas;
        boolean sadarPenuh, komorbid;

        System.out.print("Masukkan SpO2 (%): ");
        spo2 = sc.nextDouble();

        System.out.print("Masukkan tekanan darah sistolik (mmHg): ");
        tekananSistolik = sc.nextDouble();

        System.out.print("Masukkan suhu tubuh (C): ");
        suhu = sc.nextDouble();

        System.out.print("Masukkan laju napas (x/menit): ");
        lajuNapas = sc.nextDouble();

        System.out.print("Masukkan usia: ");
        usia = sc.nextInt();

        System.out.print("Masukkan sisa bed ICU: ");
        sisaBedICU = sc.nextInt();

        System.out.print("Apakah pasien sadar penuh? (true/false): ");
        sadarPenuh = sc.nextBoolean();

        System.out.print("Apakah pasien memiliki komorbid? (true/false): ");
        komorbid = sc.nextBoolean();

        String lokasi;

        if (spo2 < 85 && sisaBedICU > 0) {
            lokasi = "ICU";
        } 
        else if (spo2 < 85 && sisaBedICU == 0) {
            lokasi = "UGD_VENTILATOR_MOBIL";
        } 
        else if ((spo2 >= 85 && spo2 <= 89)
                || tekananSistolik < 90
                || tekananSistolik > 180
                || !sadarPenuh) {
            lokasi = "RESUSITASI_UGD";
        } 
        else if ((spo2 >= 90 && spo2 <= 94 || suhu > 39)
                && komorbid
                && usia >= 65) {
            lokasi = "HCU_ISOLASI";
        } 
        else if ((spo2 >= 90 && spo2 <= 94)
                || lajuNapas > 24) {
            lokasi = "RAWAT_INAP_UMUM";
        } 
        else {
            lokasi = "RAWAT_JALAN";
        }

        System.out.println("\n=== HASIL ALOKASI ===");
        System.out.println("Lokasi perawatan: " + lokasi);

        sc.close();
    }
}