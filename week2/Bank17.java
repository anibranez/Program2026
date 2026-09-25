import java.util.Scanner;

public class Bank17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahTabunganAwal,lamaMenabung;
        double persentaseBunga = 0.02,bunga,jumlahTabunganAkhir;
        System.out.print("Masukkan jumlah tabungan awal anda : ");
        jumlahTabunganAwal = input.nextInt();
        System.out.print("Masukkan lama menabung anda : ");
        lamaMenabung = input.nextInt();
        bunga = jumlahTabunganAwal * persentaseBunga * lamaMenabung;
        jumlahTabunganAkhir = bunga + jumlahTabunganAwal;
        System.out.println("bunga adalah : " + bunga);
        System.out.println("Jumlah tabungan akhir adalah : " + jumlahTabunganAkhir);
        input.close();


        
        
    }
}