//Ibranez Unggul Pranata
//264107020037
import java.util.Scanner;//untuk mengimport scanner agar bisa digunakan untuk inputan
public class Quiz1Daspro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//untuk membuat scanner baru
        //Menghitung keuntungan driver ojek online
        double keuntunganDriver;//tipe data double digunakan untuk bilanagan rill
        int tarifDasar;// tipe data int digunakan untuk bilanagan bulat
        int jarakPerjalanan;
        int biayaBahanbakar;
        float komisiPerusahaan = 0.1f;//tipe data float digunakan untuk bilanagan rill
        float resikoKerusakanBarang = 0.05f;
        int jumlahTransaksi = 10;

        System.out.print("Masukkan Tarif Dasar Rp :");
        tarifDasar = sc.nextInt();//Digunakan untuk output brupa bilanagan integer
        System.out.print("Masukkan Jarak Perjalanan Km :");
        jarakPerjalanan = sc.nextInt();//Digunakan untuk output brupa bilanagan integer
        System.out.print("Masukkan Biaya Bahan Bakar Rp :");
        biayaBahanbakar = sc.nextInt();//Digunakan untuk output brupa bilanagan integer
        
        keuntunganDriver = (tarifDasar * jarakPerjalanan - biayaBahanbakar * jarakPerjalanan)*(1 - (float)komisiPerusahaan / 100) * (1-(float)resikoKerusakanBarang / 100)*jumlahTransaksi;
        System.out.println("Keuntungan Driver : " +(int) keuntunganDriver);//"(int)"" digunakan untuk casting tipe data double menjadi integer"


        //Menghitung Keuntungan Merchant
        double keuntunganMerchant;
        int hargaJualMakanan;
        int biayaMakanan;
        

        System.out.print("Masukkan Harga Jual Makanan Rp :");
        hargaJualMakanan = sc.nextInt();
        System.out.print("Masukkan Biaya Makanan Rp :");
        biayaMakanan = sc.nextInt();
        
        keuntunganMerchant = (hargaJualMakanan - biayaMakanan) * (1- (float)komisiPerusahaan / 100) * (1 - (float)resikoKerusakanBarang / 100)* jumlahTransaksi;
        System.out.println("Keuntungan Merchant : " + (int) keuntunganMerchant);//"(int)" digunakan untuk casting tipe data double menjadi integer"

        //Menghitung Total Keuntungan dan Total Transaksi
        int totalKeuntungan = (int) (keuntunganDriver + keuntunganMerchant);//Mengubah variabel menjadi tipe data integer
        int totalTransaksi = jumlahTransaksi * 2;
        System.out.println("Total Keuntungan Rp: " + totalKeuntungan);
        System.out.println("Total Transaksi : " + totalTransaksi);

        double rataKeuntunganSemuaTransaksi = (totalKeuntungan / (double) totalTransaksi);//(double) digunakan untuk casting tipe data int menjadi double
        System.out.println("Rata-rata Keuntungan Semua Transaksi : "+ rataKeuntunganSemuaTransaksi);

        double kontribusiDriver = (keuntunganDriver / totalKeuntungan) * 100;
        double kontribusiMerchant = (keuntunganMerchant / totalKeuntungan) * 100;
        System.out.println(String.format("Kontribusi Driver : %.2f%%", kontribusiDriver));//format ini digunakan untuk menambahkan 2 angka setelah ","
        System.out.println(String.format("Kontribusi Merchant : %.2f%%", kontribusiMerchant));
    }
}
