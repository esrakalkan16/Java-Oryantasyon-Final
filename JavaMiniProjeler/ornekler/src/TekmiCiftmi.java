import java.util.Scanner;

public class TekmiCiftmi {
    public static void main(String args []){

        System.out.println("Bir sayı giriniz");

        Scanner girilenSayi = new Scanner(System.in);
        double sayi = girilenSayi.nextDouble();

        if(sayi%2 == 0){
            System.out.println("girilen sayı çifttir.");
        }else {
            System.out.println("girilen sayı tektir.");
        }
    }
}
