import java.util.Scanner;
public class SiakadWhile17 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int nilai,jml;
        int i=0;
        System.out.print("Masukkan jumlah mahasiswa =");
        jml = sc.nextInt();

        while (i < jml) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilai = sc.nextInt();
        if (nilai < 0 || nilai > 100) {
        System.out.print("Nilai tidak valid.Masukkan lagi nilai yang valid");
        continue;
        }
        if (nilai > 80 && nilai <= 100) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " A");
        } else if (nilai > 73 && nilai <= 80) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " B+");
        } else if (nilai > 65 && nilai <= 73) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " B");
        } else if (nilai > 60 && nilai <= 65) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " C+");
        } else if (nilai > 50 && nilai <= 60) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " C");
        } else if (nilai > 39 && nilai <= 50) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " D");
        } else {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " E");
        }
        i++;
        }
    }


}