package Giris;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);

        int sayi;
        System.out.print("Bir sayı giriniz :");
        sayi=inp.nextInt();

        int basbulma=0;
        int sonbasbul;
        int basamaktoplama=0;



        sayi=sayi;
        while (sayi!=0){
            sonbasbul=sayi%10;
            sayi/=10;
            basamaktoplama+=sonbasbul;

        }
        System.out.println(basamaktoplama);
        }
    }
