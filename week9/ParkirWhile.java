import java.util.Scanner;
public class ParkirWhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int jenis,durasi,total=0;
        do{
            System.out.print("Masukkan jenis kendaraan (1/2/0) :"); //1=mobil ;2=motor ;0=keluar
            jenis = sc.nextInt();
            if (jenis==1||jenis==2){
                System.out.print("Masukkan durasi:");
                durasi = sc.nextInt();
                if (jenis==1){
                total += durasi*3000;
                System.out.print(total);
                System.out.println();
                }else{
                total += durasi*2000;
                System.out.print(total);
                System.out.println();
                }
            }else{
                System.out.println("keluar");
                break;
            }
           

        }while(jenis != 0);
    }
}