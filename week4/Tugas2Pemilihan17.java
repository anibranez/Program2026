import java.util.Scanner;
public class Tugas2Pemilihan17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahSks;
        System.out.print("Massukkan jumlah sks :");
        jumlahSks = sc.nextInt();

        if (jumlahSks > 24){
            System.out.print("SKS MELEBIHI BATAS");
        }
        else {System.out.print("SKS VALID");}
    }

    
}