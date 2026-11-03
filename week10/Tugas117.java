
import java.util.Scanner;
public class Tugas117 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n,total=0;
        System.out.print("Masukkan nilai n :");
        n = sc.nextInt();
        int i=1;
        while(i<=n){
        int j=1;
            while(j<=i){
                System.out.print(j);
                total++;
                j++;
            }
        System.out.println();
        i++;
        }
        System.out.print("Total angka tercetak :"+total);
    }
}