import java.util.Scanner;
public class StudiKasus1PakDanur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok,tunjanganAnak,anak;
        System.out.print("Masukkan Gaji Pokok : ");
        gajiPokok = sc.nextInt();
        System.out.print("Masukkan Tunjangan Anak : ");
        tunjanganAnak = sc.nextInt();
        System.out.print("Masukkan Jumlah Anak : ");
        anak = sc.nextInt();
        double pajakPensiun = 0.1;
        int gaji = (int)(gajiPokok - (gajiPokok * pajakPensiun));
        int totalTunjangan = tunjanganAnak * anak;
        int totalGaji = gaji + totalTunjangan;

        System.out.println("Gaji Pokok\t\t\t\t\t\t:" + gajiPokok);
        System.out.println("Tunjangan Anak\t\t\t\t\t\t:" + tunjanganAnak);
        System.out.println("anak\t\t\t\t\t\t\t:" + anak);
        System.out.println("Pajak Pensiun\t\t\t\t\t\t:" + pajakPensiun);
        System.out.println("Total Tunjangan = Tunjangan Anak x Anak\t\t\t:" + totalTunjangan);
        System.out.println("Gaji = Gaji Pokok - (Gaji Pokok x Pajak Pensiun)\t:" + gaji);
        System.out.println("Total Gaji = Gaji + Total Tunjangan\t\t\t:" +  totalGaji);
    }
}