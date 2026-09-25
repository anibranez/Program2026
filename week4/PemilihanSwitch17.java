import java.util.Scanner;

public class PemilihanSwitch17{
    public static void main (String[] args){
        
        int semester;
        Scanner sc = new Scanner(System.in);
        System.out.println("---CETAK KRS SIAKAD---");
        System.out.print("Massukkan Semester Saat Ini : ");
        semester = sc.nextInt();

        switch(semester){
            case 1: System.out.println("KRS Semester 1 di Tampilkan");
            break;
            case 2: System.out.println("KRS Semester 2 di Tampilkan");
            break;
            case 3: System.out.println("KRS Semester 3 di Tampilkan");
            break;
            case 4: System.out.println("KRS Semester 4 di Tampilkan");
            break;
            case 5: System.out.println("KRS Semester 5 di Tampilkan");
            break;
            case 6: System.out.println("KRS Semester 6 di Tampilkan");
            break;
            case 7: System.out.println("KRS Semester 7 di Tampilkan");
            break;
            case 8: System.out.println("KRS Semester 8 di Tampilkan");
            default: System.out.println("Semester Tidak Valid");

        }



    }
}