import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int sayi, toplam=0, basamak=0;


        System.out.println("Sayı Yazın;");
        sayi = input.nextInt();


        while (sayi !=0){

            toplam = (sayi % 10) + toplam;
            sayi /= 10;
            ++basamak;
        }
        System.out.println(toplam);
    }
}