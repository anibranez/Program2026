import java.util.Scanner;
public class NusantaraPay17 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String status;
        int sisaSaldo,nominalTransaksi,limitHarian = 10000;
        boolean isBedaNegara;
        int jam;

        System.out.println("Masukkan status akun : ");
        status = sc.nextLine();
        System.out.println("Masukkan sisa saldo : ");
        sisaSaldo = sc.nextInt();
        System.out.println("Masukkan nominal transaksi : ");
        nominalTransaksi = sc.nextInt();
        System.out.println("Transaksi luar negeri (true/false) : ");
        isBedaNegara = sc.nextBoolean();
        System.out.println("Masukkan jam transaksi : ");
        jam = sc.nextInt();

        if(status.equals("blacklisted")){
            System.out.println("BLACK-LISTED");
        }else if (nominalTransaksi>sisaSaldo){
            System.out.println("REJECTED_SALDO");
        }else if (nominalTransaksi>limitHarian){
            System.out.println("REJECTED_LIMIT");
        }else if (isBedaNegara==true && nominalTransaksi>2000){
            System.out.println("FLAGGED_FRAUD");
        }else if(jam>0 && jam<4 && nominalTransaksi>1000){
            System.out.println("REQUIRE_OTP_NIGHT");
        }else if(status.equals("suspicious") && nominalTransaksi>500){
            System.out.println("SUSPICIOUS");
        }else{
            System.out.println("APPROVED");
        }



    }
}