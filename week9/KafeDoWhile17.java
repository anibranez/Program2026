import java.util.Scanner;
public class KafeDoWhile17{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int kopi,roti,teh;
        String namPel;
        int harKopi = 12000;
        int harTeh = 7000;
        int harRoti = 20000;
        int totHarga;

        do {
        System.out.print("Massukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namPel = sc.nextLine();
        if (namPel.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi dibatalkan.");
        break;
        }
        System.out.print("jumlah kopi: ");
        kopi = sc.nextInt();
        System.out.print("jumlah teh: ");
        teh = sc.nextInt();
        System.out.print("jumlah roti: ");
        roti = sc.nextInt();
        totHarga = (kopi * harKopi) + (teh * harTeh) + (roti * harRoti);
        System.out.println("Total yang harus dibayar: Rp " + totHarga);
        sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}