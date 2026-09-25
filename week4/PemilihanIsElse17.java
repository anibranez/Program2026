import java.util.Scanner;

public class PemilihanIsElse17{
    public static void main (String[] args){
        
        int semester;
        Scanner sc = new Scanner(System.in);
        System.out.println("---CETAK KRS SIAKAD---");
        System.out.print("Massukkan Semester Saat Ini : ");
        semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS Semester 1 ditampilkan");
        }else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
        }else if (semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan");
        }else if (semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan");
        }else if (semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan");
        }else if (semester == 6) {
            System.out.println("KRS Semester 6 ditampilkan");
        }else if (semester == 7) {
            System.out.println("KRS Semester 7 ditampilkan");
        }else if (semester == 8) {
            System.out.println("KRS Semester 8 ditampilkan");
        }else {
            System.out.println("Semester Tidak Valid");
        }

    }
}