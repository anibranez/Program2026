import java.util.Scanner;
public class StudikasusRina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga;
        int uangMuka;
        short bulan;
        double bunga = 0.02;


        System.out.print("Harga Laptop : ");
        harga = input.nextInt();
        System.out.print("Uang Muka : ");
        uangMuka = input.nextInt();
        System.out.print("Bulan : ");
        bulan = input.nextShort();
        
        int sisa = harga - uangMuka;
        System.out.println("Sisa : " + sisa);
        
        double cicilan = sisa / bulan;
        double bungaPerBulan = cicilan * bunga * bulan;
        System.out.println("Cicilan per bulan : " + cicilan);
        System.out.println("Bunga per bulan : " + bungaPerBulan);

        double bayarPerBulan = cicilan + bungaPerBulan;
        System.out.println("Jumlah yang harus dibayar per bulan: " + bayarPerBulan );
    }
}