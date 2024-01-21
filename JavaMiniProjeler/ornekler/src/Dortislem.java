import java.util.Scanner;

public class Dortislem {
    public static void main(String args []){

        System.out.println("toplama için 1 , çıkarma için 2 , \nçarpma için 3 , bölme için 4'e basınız");

        Scanner giris3 = new Scanner(System.in);
        int tercih = giris3.nextInt();

        System.out.println("1. sayıyı giriniz");

        Scanner giris1 = new Scanner(System.in);
        double sayi1 = giris1.nextDouble();

        System.out.println("2. sayıyı giriniz");

        Scanner giris2 = new Scanner(System.in);
        double sayi2= giris2.nextDouble();


        switch (tercih){
            case 1 :
                System.out.println("sonuç =" +(sayi1 + sayi2));
                break;
            case 2 :
                System.out.println("sonuç =" +(sayi1 - sayi2));
                break;
            case 3 :
                System.out.println("sonuç =" +(sayi1 * sayi2));
                break;
            case 4 :
                System.out.println("sonuç =" +(sayi1 / sayi2));
                break;


        }
    }
}
