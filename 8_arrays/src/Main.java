import javax.xml.stream.events.StartDocument;

public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "hatice";
        String ogrenci2 = "nur";
        String ogrenci3 = "elif";
        String ogrenci4 = "yağmur";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("--------------------------------------------");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "hatice";
        ogrenciler[1] = "nur";
        ogrenciler[2] = "elif";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------------------------------------");

        //reverse engineering : tersine mühendislik
        //base practice // kodun okumansı
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
