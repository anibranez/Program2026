import java.util.Scanner;
public class NusantaraPay17 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String status;
        int sisaSaldo,nominalTransaksi,limitHarian = 10000;
        boolean isBedaNegara;
        int jam;

        System.out.print("Masukkan status akun : ");
        status = sc.nextLine();
        System.out.print("Masukkan sisa saldo : ");
        sisaSaldo = sc.nextInt();
        System.out.print("Masukkan nominal transaksi : ");
        nominalTransaksi = sc.nextInt();
        System.out.print("Transaksi luar negeri (true/false) : ");
        isBedaNegara = sc.nextBoolean();
        System.out.print("Masukkan jam transaksi : ");
        jam = sc.nextInt();

        if(status.equalsIgnoreCase("blacklisted")){
            System.out.print("BLACK-LISTED");
        }else if (nominalTransaksi>sisaSaldo){
            System.out.print("REJECTED_SALDO");
        }else if (nominalTransaksi>limitHarian){
            System.out.print("REJECTED_LIMIT");
        }else if (isBedaNegara==true && nominalTransaksi>2000){
            System.out.print("FLAGGED_FRAUD");
        }else if(jam>0 && jam<4 && nominalTransaksi>1000){
            System.out.print("REQUIRE_OTP_NIGHT");
        }else if(status.equalsIgnoreCase("suspicious") && nominalTransaksi>500){
            System.out.print("SUSPICIOUS");
        }else{
            System.out.print("APPROVED");
        }



    }
}