package week6;
import java.util.Scanner;
public class LatihanDiskonBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double diskon;
        String buku;
        int jumlahBuku;
        
        System.out.print("Masukkan jenis buku (kamus/novel): ");
        buku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();

        if(buku.equalsIgnoreCase("kamus")){
            if(jumlahBuku < 2){
                diskon = 0.1;
                System.out.print(String.format("anda mendapatkan diskon %.0f%%", diskon * 100));
            }else{
                diskon = 0.12;
                System.out.print(String.format("anda mendapatkan diskon %.0f%%", diskon * 100));
            }
        }else if(buku.equalsIgnoreCase("novel"))
            {
            if(jumlahBuku <= 3){
                diskon = 0.08;
                System.out.print(String.format("anda mendapatkan diskon %.0f%%", diskon * 100));
            }else{
                diskon = 0.09;
                System.out.print(String.format("anda mendapatkan diskon %.0f%%", diskon * 100));
            }
        }else if(jumlahBuku < 3){
            diskon = 0.05;
            System.out.print(String.format("anda mendapatkan diskon %.0f%%", diskon * 100));
        }else{
            System.out.print("anda tidak mendapatkan diskon");
        }
}
}