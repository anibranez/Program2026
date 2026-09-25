import java.util.Scanner;

public class ProgramKasir {
public static void main (String[] args){

Scanner sc = new Scanner(System.in);

int totalBelanja;
float diskon = 0.1f;
boolean isMember;
double potongan;
int totalBayar;

System.out.print("Masukkan total belanja : ");
totalBelanja = sc.nextInt();
System.out.print("Apakah pelanggan adalah member? (true/false) : ");
isMember = sc.nextBoolean();

if (totalBelanja>=100000 && isMember)
{
    potongan = totalBelanja * diskon ;
    totalBayar = totalBelanja - (int) potongan;
    System.out.println("Selamat anda mendapatkan diskon 10% : " +totalBayar);
}else { System.out.println("Total Pembayaran anda : " +totalBelanja);

}sc.close();
}
}