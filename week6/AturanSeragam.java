package week6;
import java.util.Scanner;

public class AturanSeragam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan hari (1-7): ");
        int hari = scanner.nextInt();
        
        switch (hari) {
            case 1,2,5:
                System.out.print("Apakah seragam sesuai? (true/false): ");
                char statusSeragam = scanner.next().charAt(0);
        
                if (statusSeragam == 'y')
                    System.out.println("boleh masuk");
                else
                    System.out.println("dikenakan sanksi");
                break;
            case 3,4:
               System.out.println("boleh masuk");
                break;
            case 6,7:
                System.out.println("tidak ada perkuliahan");
                break;
            default:
                System.out.println("Hari tidak valid");
                break;
        }
    }
}