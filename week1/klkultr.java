import java.util.Scanner;
public class klkultr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bilA,bilB;
        String operator;

        System.out.print("Masukkan bilangan A: ");
        bilA = sc.nextDouble();
        System.out.print("Masukkan bilangan B: ");
        bilB = sc.nextDouble();
        System.out.print("Masukkan operator (+,-,*,/,%): ");
        operator = sc.nextLine();

        switch (operator) {
            case "+":
                System.out.print("Hasil: " + (bilA + bilB));
                break;
            case "-":
                System.out.print("Hasil: " + (bilA - bilB));
                break;
            case "*":
                System.out.print("Hasil: " + (bilA * bilB));
                break;
            case "/":
                if (bilB != 0) {
                    System.out.print("Hasil: " + (bilA / bilB));
                } else {
                    System.out.print("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            case "%":
                if (bilB != 0) {
                    System.out.print("Hasil: " + (bilA % bilB));
                } else {
                    System.out.print("Error: Modulus dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.print("Operator tidak valid.");
        }
    }
}