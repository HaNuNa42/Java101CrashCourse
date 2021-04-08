import matematik.DortIslem;
import matematik.Logaritma;
//yada matematik pakeindeki tüm paketleri getiremesini istersek matematik.* yazarız

import java.util.Scanner;

//built-in : java içerisinde olan paketlerdir.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınız : ");

        String isim = scanner.nextLine();
        System.out.println("merhaba " + isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,3);

        Logaritma logaritma = new Logaritma();

    }
}
