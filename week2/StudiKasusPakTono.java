import java.util.Scanner;

public class StudiKasusPakTono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Massukkan lebar tanah: ");
        short lebar = sc.nextShort();
        System.out.print("Massukkan panjang tanah: ");
        short panjang = sc.nextShort();
        short luasTanah = (short) (panjang * lebar);
        System.out.println("Luas Tanah = P x L: " + luasTanah);
        System.out.print("Massukkan diameter lingkaran: ");
        short diameter = sc.nextShort();
        double jariJari = diameter / 2.0;
        double phi = 3.14;
        double luasLingkaran = phi * jariJari * jariJari;
        System.out.println("Luas Lingkaran = π x r² : " + luasLingkaran);
        System.out.print("Massukkan sisi taman: ");
        short sisi = sc.nextShort();
        double luasPersegi = sisi * sisi;
        System.out.println("Luas Taman = s² : " + luasPersegi);
        double sisaLuas = luasTanah -  luasLingkaran - luasPersegi;
        System.out.println("Sisa Luas Tanah = Luas Tanah - Luas Lingkaran - Luas Taman: " + sisaLuas); 

    }
}