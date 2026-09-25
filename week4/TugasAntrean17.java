import java.util.Scanner;
public class TugasAntrean17{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int loket;
        System.out.print("Massukkan Loket:");
        loket = sc.nextInt();

        switch(loket){
            case 1: System.out.println("Legalisir Ijazah");
                   System.out.println("Loket A");
            break;
            case 2: System.out.println("Surat Keterangan Aktif Kuliah");
                   System.out.println("Loket B");
            break;
            case 3: System.out.println("Pembayaran UKT");
                   System.out.println("Loket C");
            break;
            case 4: System.out.println("Pengajuan Cuti Akademik");
                   System.out.println("Loket D");
            break;
            default:System.out.print("Kode layanan tidak tersedia");
    }
}
}