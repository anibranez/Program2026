import java.util.Scanner;

public class SegitigaIbranez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.println("Massukan alas segitiga : ");
        alas = sc.nextInt();
        System.out.println("Massukan tinggi segitiga : ");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2.0f;
        System.out.println("Luas segitiga adalah : " + luas);
    }
}