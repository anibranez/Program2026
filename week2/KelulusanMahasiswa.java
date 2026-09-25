import java.util.Scanner;

public class KelulusanMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        short p;
        short q;
        System.out.print("Masukkan nilai mahasiswa: ");
        p = input.nextShort();
        System.out.print("Masukkan kehadiran (%): ");
        q = input.nextShort();
        if (p >= 60)
          if (q >= 80) {
            System.out.println("Mahasiswa LULUS" );
        } else {
            System.out.println("Mahasiswa TIDAK LULUS" );
        } else {
            System.out.println("Mahasiswa TIDAK LULUS" );
        }
        input.close();
    }
}