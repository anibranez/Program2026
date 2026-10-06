package week6;
import java.util.Scanner;
public class nestedUjianSkripsi17 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa bebas kompen? ya/tidak = ");
        String bebasKompen = sc.nextLine();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 1 = ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2 =");
        int bimbinganP2 = sc.nextInt();
        
        if (bebasKompen.equalsIgnoreCase("ya")){
            if(bimbinganP1>=8 && bimbinganP2>=4){
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            }else if (bimbinganP1<8){
                pesan = "Gagal!! log bimbingan P1 kurang dari 8 kali";
            }else if (bimbinganP2<4){
                 pesan = "Gagal!! log bimbingan P2 kurang dari 4 kali";
            }else {
                pesan = "Gagal!! log bimbingan P1 belum mencapai 8 kali dan log bimbingan P2 belum mencapai 4 kali";
            }
            
        }else {
            pesan = "Gagal!! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);

    }

    
}