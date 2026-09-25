import java.util.Scanner;
public class TugasParkir17 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int jam;
        int tarif;
        System.out.print("Massukkan lama parkir (jam):");
        jam = sc.nextInt();
        
        if(jam <= 2){
            System.out.println("Tarif anda sebesar : 2000 ");
        }else{
            tarif = 2000 + ((jam-2) * 1000);
            System.out.println("Tarif anda sebesar : "+tarif);
        }
    }
}
