import java.util.Scanner;
public class Asalmi {

    public static void main(String[] args) {

        System.out.print("Lütfen Bir Sayı Giriniz: ");

        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();

        if(sayi > 1){

            boolean asalmi = true;

            for(int i = 2; i < sayi; i++){
                if (sayi % i == 0) {
                    asalmi = false;
                    break;
                }
            }
            if(asalmi){
                System.out.println("Girilen Sayı Asaldır");
            }else{
                System.out.println("Girilen Sayı Asal Değildir");
            }
        }else{
            System.out.println("Asallıktan Söz Edilemez");
        }
    }
}