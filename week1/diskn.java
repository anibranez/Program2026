import java.util.Scanner;
public class diskn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon, harga,bayar;
        boolean isMember = true;
        System.out.print("Apakah anda member? (ya/tidak): ");
        isMember = sc.nextBoolean();
        System.out.print("Masukkan total belanja: ");
        harga = sc.nextDouble();

       if (isMember){
            
            if(harga > 500000){
                diskon = harga * 0.2;
                bayar=harga-diskon;
                System.out.print("anda mendapat diskon 20% :"+bayar);
                
            }else if (harga >= 200000 && harga < 500000) {
                diskon = harga * 0.1;
                bayar=harga-diskon;
                System.out.print("anda mendapat diskon 10% :"+bayar);

            }
       
        }else{
            System.out.print("Tidak ada diskon. Total belanja: " +(int) harga);
        }

        sc.close();
    }
}

        