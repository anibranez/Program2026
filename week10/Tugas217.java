import java.util.Scanner;
public class Tugas217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int total = 0;
       do {
            System.out.print("Masukkan jumlah baris: ");
           n = sc.nextInt();
        } while (n <= 2);
        for (int i=1 ; i <= n ; i++){
            for(int j=1 ; j <= n ; j++){
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                total += hasil;
            }
            System.out.println("");
        }
         System.out.println("Jumlah Seluruh Angka : "+total);
    }
}