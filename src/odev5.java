import java.util.Scanner;
public class odev5 {
    public static void main(String[] args) {
        double kilo , height;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz(metre cinsinden) : ");
        height = input.nextDouble();

        System.out.print("Kilonuzu giriniz(kg cinsinden) : ");
        kilo = input.nextDouble();

        double indeks = kilo /
                (height * height);
        System.out.println("Vücut kitle indeksiniz : " + indeks);


    }
}
