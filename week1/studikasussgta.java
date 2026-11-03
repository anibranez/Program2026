import java.util.Scanner;
public class studikasussgta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        System.out.print("Masukkan sisi A: ");
        A = sc.nextDouble();
        System.out.print("Masukkan sisi B: ");
        B = sc.nextDouble();
        System.out.print("Masukkan sisi C: ");
        C = sc.nextDouble();

       if (A > 0 || B > 0 || C > 0){
            if (!(A + B <= C || B + C <= A || C + A <= B)) {
                if ( (A==B || B==C || C==A) && (A*A + B*B == C*C || B*B + C*C == A || C*C + A*A == B*B)) {
                    System.out.print("Segitiga Sama kaki dan siku");
                }else if (A==B && B==C) {
                    System.out.print("sama SISI");
                }else if ( A*A + B*B == C*C || B*B + C*C == A || C*C + A*A == B*B ){
                    System.out.print("siku");
                }else if (A==B || B==C || C==A) {
                    System.out.print("Sama KAKI");
                }else {
                    System.out.print("Sembarang");
                }
            }else{
                System.out.print("Bukan Segitiga");
            }
       }else{
            System.out.print("Sisi harus diatas 0");
       }



        sc.close();

    }
}