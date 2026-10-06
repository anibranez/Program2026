package week6;
import java.util.Scanner;
public class SeleksiCalonAsistenPraktikum17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isMahasiswaAktif;
        boolean isSedangDisanksi;
        int nilaiDaspro;
        boolean hasSertifikat;
        int nilaiWawancara;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        isMahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi? (true/false): ");
        isSedangDisanksi = sc.nextBoolean();

        if(isMahasiswaAktif && !isSedangDisanksi){
            
           System.out.print("Masukkan nilai Daspro: ");
           nilaiDaspro = sc.nextInt();
           System.out.print("Apakah memiliki sertifikat? (true/false): ");
           hasSertifikat = sc.nextBoolean();

           if(nilaiDaspro >= 80 || hasSertifikat){
               System.out.println("Anda akan di panggil untuk wawancara");
               System.out.print("Masukkan nilai wawancara: ");
               nilaiWawancara = sc.nextInt();
               if(nilaiWawancara >= 75){
                   System.out.println("Selamat anda diterima menjadi calon asisten praktikum");
               } else {
                   System.out.println("Maaf anda tidak diterima menjadi calon asisten praktikum");
               }
           } else {
               System.out.println("nilai Daspro kurang dari 80 atau tidak memiliki sertifikat");
           }
            
        }else{
            System.out.println("Anda tidak memenuhi syarat untuk menjadi calon asisten praktikum");
        }
        
    }
}