import java.util.Scanner;

public class BiletFiyat {
    public static void main(String[] args) {
        Scanner input_int_ = new Scanner(System.in);
        int yolculukTipi, yas;
        double mesafe, ucret, indirim =0;
        boolean isError = false;
        System.out.print("Mesafe(km): ");
        mesafe = input_int_.nextDouble();
        System.out.print("Yaş: ");
        yas = input_int_.nextInt();
        System.out.print("Yolculuk tipi [tek yön(1)/gidiş-dönüş(2)]: ");
        yolculukTipi = input_int_.nextInt();
        ucret = mesafe * 0.1;


        if (mesafe < 0) {
            isError = true;
        } else {
            if (yas < 0) {
                isError = true;
            } else if (yas < 12) {
                indirim = 0.5;
            } else if (yas < 24) {
                indirim = 0.10;
            } else if (yas >= 65) {
                indirim = 0.3;
            }
            ucret = ucret - ucret * indirim;

            switch (yolculukTipi) {
                case 1:
                    break;
                case 2:
                    indirim = 0.2;
                    ucret = ucret - ucret * indirim;
                    ucret =ucret * 2;
                    break;
                default:
                    isError = true;
            }
        }
        if (isError) {
            System.out.println("Hatalı giriş");
        } else {
            System.out.println("Ücret: " + ucret);
        }
    }
}
